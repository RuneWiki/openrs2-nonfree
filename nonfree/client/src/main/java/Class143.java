import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class143 {

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
	private int anInt4117;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	public int anInt4120;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)I")
	public int method3599() {
		return this.anInt4120 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	public void method3600(@OriginalArg(0) int arg0) {
		this.anInt4117 = 0;
		this.anInt4120 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII)Z")
	public boolean method3601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt4117;
		if (this.anInt4120 == arg0 && this.anInt4117 == 0) {
			return false;
		}
		@Pc(51) boolean local51;
		@Pc(62) int local62;
		if (this.anInt4117 == 0) {
			if (arg0 > this.anInt4120 && arg1 + this.anInt4120 >= arg0 || this.anInt4120 > arg0 && arg0 >= this.anInt4120 - arg1) {
				this.anInt4120 = arg0;
				return false;
			}
			local51 = true;
		} else {
			@Pc(68) int local68;
			if (this.anInt4117 > 0 && arg0 > this.anInt4120) {
				local62 = this.anInt4117 * this.anInt4117 / (arg1 * 2);
				local68 = local62 + this.anInt4120;
				if (arg0 > local68 && this.anInt4120 <= local68) {
					local51 = true;
				} else {
					local51 = false;
				}
			} else if (this.anInt4117 < 0 && this.anInt4120 > arg0) {
				local62 = this.anInt4117 * this.anInt4117 / (arg1 * 2);
				local68 = this.anInt4120 - local62;
				if (local68 > arg0 && local68 <= this.anInt4120) {
					local51 = true;
				} else {
					local51 = false;
				}
			} else {
				local51 = false;
			}
		}
		if (local51) {
			if (arg0 > this.anInt4120) {
				this.anInt4117 += arg1;
				if (arg2 != 0 && this.anInt4117 > arg2) {
					this.anInt4117 = arg2;
				}
			} else {
				this.anInt4117 -= arg1;
				if (arg2 != 0 && this.anInt4117 < -arg2) {
					this.anInt4117 = -arg2;
				}
			}
			if (this.anInt4117 != local6) {
				local62 = this.anInt4117 * this.anInt4117 / (arg1 * 2);
				if (arg0 <= this.anInt4120) {
					if (this.anInt4120 > arg0 && this.anInt4120 - local62 < arg0) {
						this.anInt4117 = local6;
					}
				} else if (this.anInt4120 + local62 > arg0) {
					this.anInt4117 = local6;
				}
			}
		} else if (this.anInt4117 > 0) {
			this.anInt4117 -= arg1;
			if (this.anInt4117 < 0) {
				this.anInt4117 = 0;
			}
		} else {
			this.anInt4117 += arg1;
			if (this.anInt4117 > 0) {
				this.anInt4117 = 0;
			}
		}
		this.anInt4120 += this.anInt4117 + local6 >> 1;
		return local51;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)V")
	public void method3602() {
		this.anInt4120 &= 0x3FFF;
	}
}
