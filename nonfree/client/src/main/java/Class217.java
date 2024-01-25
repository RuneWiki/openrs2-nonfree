import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class217 {

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
	private int anInt6270;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
	public int anInt6273;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBII)Z")
	public boolean method5451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt6270;
		if (arg2 == this.anInt6273 && this.anInt6270 == 0) {
			return false;
		}
		@Pc(58) boolean local58;
		@Pc(70) int local70;
		if (this.anInt6270 == 0) {
			if (this.anInt6273 < arg2 && arg2 <= arg1 + this.anInt6273 || arg2 < this.anInt6273 && this.anInt6273 - arg1 <= arg2) {
				this.anInt6273 = arg2;
				return false;
			}
			local58 = true;
		} else {
			@Pc(75) int local75;
			if (this.anInt6270 > 0 && arg2 > this.anInt6273) {
				local70 = this.anInt6270 * this.anInt6270 / (arg1 * 2);
				local75 = this.anInt6273 + local70;
				if (local75 < arg2 && this.anInt6273 <= local75) {
					local58 = true;
				} else {
					local58 = false;
				}
			} else if (this.anInt6270 < 0 && this.anInt6273 > arg2) {
				local70 = this.anInt6270 * this.anInt6270 / (arg1 * 2);
				local75 = this.anInt6273 - local70;
				if (arg2 < local75 && local75 <= this.anInt6273) {
					local58 = true;
				} else {
					local58 = false;
				}
			} else {
				local58 = false;
			}
		}
		if (local58) {
			if (this.anInt6273 >= arg2) {
				this.anInt6270 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt6270) {
					this.anInt6270 = -arg0;
				}
			} else {
				this.anInt6270 += arg1;
				if (arg0 != 0 && this.anInt6270 > arg0) {
					this.anInt6270 = arg0;
				}
			}
			if (this.anInt6270 != local8) {
				local70 = this.anInt6270 * this.anInt6270 / (arg1 * 2);
				if (arg2 <= this.anInt6273) {
					if (this.anInt6273 > arg2 && this.anInt6273 - local70 < arg2) {
						this.anInt6270 = local8;
					}
				} else if (arg2 < local70 + this.anInt6273) {
					this.anInt6270 = local8;
				}
			}
		} else if (this.anInt6270 > 0) {
			this.anInt6270 -= arg1;
			if (this.anInt6270 < 0) {
				this.anInt6270 = 0;
			}
		} else {
			this.anInt6270 += arg1;
			if (this.anInt6270 > 0) {
				this.anInt6270 = 0;
			}
		}
		this.anInt6273 += local8 + this.anInt6270 >> 1;
		return local58;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I")
	public int method5455() {
		return this.anInt6273 & 0x3FFF;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public void method5456() {
		this.anInt6273 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V")
	public void method5458(@OriginalArg(0) int arg0) {
		this.anInt6270 = 0;
		this.anInt6273 = arg0;
	}
}
