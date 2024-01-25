import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class98 {

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	public int anInt2738;

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
	private int anInt2739;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public void method2350() {
		this.anInt2738 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)I")
	public int method2351() {
		return this.anInt2738 & 0x3FFF;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public void method2352(@OriginalArg(1) int arg0) {
		this.anInt2738 = arg0;
		this.anInt2739 = 0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBII)Z")
	public boolean method2354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt2739;
		if (arg2 == this.anInt2738 && this.anInt2739 == 0) {
			return false;
		}
		@Pc(78) boolean local78;
		@Pc(59) int local59;
		if (this.anInt2739 == 0) {
			if (this.anInt2738 < arg2 && this.anInt2738 + arg0 >= arg2 || this.anInt2738 > arg2 && this.anInt2738 - arg0 <= arg2) {
				this.anInt2738 = arg2;
				return false;
			}
			local78 = true;
		} else {
			@Pc(65) int local65;
			if (this.anInt2739 > 0 && arg2 > this.anInt2738) {
				local59 = this.anInt2739 * this.anInt2739 / (arg0 * 2);
				local65 = this.anInt2738 + local59;
				if (local65 < arg2 && this.anInt2738 <= local65) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else if (this.anInt2739 < 0 && this.anInt2738 > arg2) {
				local59 = this.anInt2739 * this.anInt2739 / (arg0 * 2);
				local65 = this.anInt2738 - local59;
				if (local65 > arg2 && this.anInt2738 >= local65) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else {
				local78 = false;
			}
		}
		if (local78) {
			if (this.anInt2738 >= arg2) {
				this.anInt2739 -= arg0;
				if (arg1 != 0 && this.anInt2739 < -arg1) {
					this.anInt2739 = -arg1;
				}
			} else {
				this.anInt2739 += arg0;
				if (arg1 != 0 && arg1 < this.anInt2739) {
					this.anInt2739 = arg1;
				}
			}
			if (this.anInt2739 != local8) {
				local59 = this.anInt2739 * this.anInt2739 / (arg0 * 2);
				if (this.anInt2738 < arg2) {
					if (arg2 < local59 + this.anInt2738) {
						this.anInt2739 = local8;
					}
				} else if (this.anInt2738 > arg2 && this.anInt2738 - local59 < arg2) {
					this.anInt2739 = local8;
				}
			}
		} else if (this.anInt2739 <= 0) {
			this.anInt2739 += arg0;
			if (this.anInt2739 > 0) {
				this.anInt2739 = 0;
			}
		} else {
			this.anInt2739 -= arg0;
			if (this.anInt2739 < 0) {
				this.anInt2739 = 0;
			}
		}
		this.anInt2738 += this.anInt2739 + local8 >> 1;
		return local78;
	}
}
