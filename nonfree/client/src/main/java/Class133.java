import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class133 {

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
	public int anInt3807;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	private int anInt3809;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)I")
	public int method2990() {
		return this.anInt3807 & 0x3FFF;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)V")
	public void method2991(@OriginalArg(0) int arg0) {
		this.anInt3809 = 0;
		this.anInt3807 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBII)Z")
	public boolean method2992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3809;
		if (arg0 == this.anInt3807 && this.anInt3809 == 0) {
			return false;
		}
		@Pc(52) boolean local52;
		@Pc(88) int local88;
		if (this.anInt3809 == 0) {
			if (arg0 > this.anInt3807 && arg0 <= this.anInt3807 + arg2 || this.anInt3807 > arg0 && arg0 >= this.anInt3807 - arg2) {
				this.anInt3807 = arg0;
				return false;
			}
			local52 = true;
		} else {
			@Pc(82) int local82;
			if (this.anInt3809 > 0 && this.anInt3807 < arg0) {
				local82 = this.anInt3809 * this.anInt3809 / (arg2 * 2);
				local88 = this.anInt3807 + local82;
				if (local88 < arg0 && this.anInt3807 <= local88) {
					local52 = true;
				} else {
					local52 = false;
				}
			} else if (this.anInt3809 < 0 && arg0 < this.anInt3807) {
				local82 = this.anInt3809 * this.anInt3809 / (arg2 * 2);
				local88 = this.anInt3807 - local82;
				if (arg0 < local88 && local88 <= this.anInt3807) {
					local52 = true;
				} else {
					local52 = false;
				}
			} else {
				local52 = false;
			}
		}
		if (local52) {
			if (arg0 <= this.anInt3807) {
				this.anInt3809 -= arg2;
				if (arg1 != 0 && this.anInt3809 < -arg1) {
					this.anInt3809 = -arg1;
				}
			} else {
				this.anInt3809 += arg2;
				if (arg1 != 0 && arg1 < this.anInt3809) {
					this.anInt3809 = arg1;
				}
			}
			if (this.anInt3809 != local8) {
				local88 = this.anInt3809 * this.anInt3809 / (arg2 * 2);
				if (arg0 > this.anInt3807) {
					if (this.anInt3807 + local88 > arg0) {
						this.anInt3809 = local8;
					}
				} else if (arg0 < this.anInt3807 && this.anInt3807 - local88 < arg0) {
					this.anInt3809 = local8;
				}
			}
		} else if (this.anInt3809 <= 0) {
			this.anInt3809 += arg2;
			if (this.anInt3809 > 0) {
				this.anInt3809 = 0;
			}
		} else {
			this.anInt3809 -= arg2;
			if (this.anInt3809 < 0) {
				this.anInt3809 = 0;
			}
		}
		this.anInt3807 += local8 + this.anInt3809 >> 1;
		return local52;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
	public void method2993() {
		this.anInt3807 &= 0x3FFF;
	}
}
