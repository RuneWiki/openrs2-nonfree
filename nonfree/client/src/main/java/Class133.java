import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class133 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private int anInt3894;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt3899;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	public int method3620() {
		return this.anInt3899 & 0x3FFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method3622(@OriginalArg(0) int arg0) {
		this.anInt3899 = arg0;
		this.anInt3894 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method3623() {
		this.anInt3899 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)Z")
	public boolean method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt3894;
		if (this.anInt3899 == arg2 && this.anInt3894 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(71) int local71;
		if (this.anInt3894 == 0) {
			if (arg2 > this.anInt3899 && this.anInt3899 + arg1 >= arg2 || this.anInt3899 > arg2 && this.anInt3899 - arg1 <= arg2) {
				this.anInt3899 = arg2;
				return false;
			}
			local59 = true;
		} else {
			@Pc(77) int local77;
			if (this.anInt3894 > 0 && this.anInt3899 < arg2) {
				local71 = this.anInt3894 * this.anInt3894 / (arg1 * 2);
				local77 = this.anInt3899 + local71;
				if (arg2 > local77 && this.anInt3899 <= local77) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt3894 < 0 && arg2 < this.anInt3899) {
				local71 = this.anInt3894 * this.anInt3894 / (arg1 * 2);
				local77 = this.anInt3899 - local71;
				if (local77 > arg2 && this.anInt3899 >= local77) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (this.anInt3899 >= arg2) {
				this.anInt3894 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt3894) {
					this.anInt3894 = -arg0;
				}
			} else {
				this.anInt3894 += arg1;
				if (arg0 != 0 && this.anInt3894 > arg0) {
					this.anInt3894 = arg0;
				}
			}
			if (this.anInt3894 != local8) {
				local71 = this.anInt3894 * this.anInt3894 / (arg1 * 2);
				if (this.anInt3899 < arg2) {
					if (arg2 < local71 + this.anInt3899) {
						this.anInt3894 = local8;
					}
				} else if (arg2 < this.anInt3899 && this.anInt3899 - local71 < arg2) {
					this.anInt3894 = local8;
				}
			}
		} else if (this.anInt3894 > 0) {
			this.anInt3894 -= arg1;
			if (this.anInt3894 < 0) {
				this.anInt3894 = 0;
			}
		} else {
			this.anInt3894 += arg1;
			if (this.anInt3894 > 0) {
				this.anInt3894 = 0;
			}
		}
		this.anInt3899 += local8 + this.anInt3894 >> 1;
		return local59;
	}
}
