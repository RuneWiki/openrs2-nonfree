import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class248 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_266 = new Class145(23, -1);

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!jm;")
	public static final Class116 aClass116_8 = new Class116(64);

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "[I")
	public static final int[] anIntArray494 = new int[1000];

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public int anInt7184;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
	private int anInt7192;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 123)
	public void method6441() {
		this.anInt7184 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)I", line = 137)
	public int method6442() {
		return this.anInt7184 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 149)
	public void method6443(@OriginalArg(0) int arg0) {
		this.anInt7192 = 0;
		this.anInt7184 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIZI)Z", line = 162)
	public boolean method6444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7192;
		if (this.anInt7184 == arg0 && this.anInt7192 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(102) int local102;
		if (this.anInt7192 == 0) {
			if (this.anInt7184 < arg0 && this.anInt7184 + arg1 >= arg0 || arg0 < this.anInt7184 && this.anInt7184 - arg1 <= arg0) {
				this.anInt7184 = arg0;
				return false;
			}
			local69 = true;
		} else {
			@Pc(108) int local108;
			if (this.anInt7192 > 0 && arg0 > this.anInt7184) {
				local102 = this.anInt7192 * this.anInt7192 / (arg1 * 2);
				local108 = local102 + this.anInt7184;
				if (local108 < arg0 && this.anInt7184 <= local108) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt7192 < 0 && this.anInt7184 > arg0) {
				local102 = this.anInt7192 * this.anInt7192 / (arg1 * 2);
				local108 = this.anInt7184 - local102;
				if (arg0 < local108 && local108 <= this.anInt7184) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (this.anInt7184 >= arg0) {
				this.anInt7192 -= arg1;
				if (arg2 != 0 && -arg2 > this.anInt7192) {
					this.anInt7192 = -arg2;
				}
			} else {
				this.anInt7192 += arg1;
				if (arg2 != 0 && arg2 < this.anInt7192) {
					this.anInt7192 = arg2;
				}
			}
			if (local8 != this.anInt7192) {
				local102 = this.anInt7192 * this.anInt7192 / (arg1 * 2);
				if (arg0 > this.anInt7184) {
					if (arg0 < local102 + this.anInt7184) {
						this.anInt7192 = local8;
					}
				} else if (arg0 < this.anInt7184 && arg0 > this.anInt7184 - local102) {
					this.anInt7192 = local8;
				}
			}
		} else if (this.anInt7192 <= 0) {
			this.anInt7192 += arg1;
			if (this.anInt7192 > 0) {
				this.anInt7192 = 0;
			}
		} else {
			this.anInt7192 -= arg1;
			if (this.anInt7192 < 0) {
				this.anInt7192 = 0;
			}
		}
		this.anInt7184 += local8 + this.anInt7192 >> 1;
		return local69;
	}
}
