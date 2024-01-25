import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class145 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	private int anInt3591;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
	public int method2946() {
		return this.anInt3594 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public void method2949() {
		this.anInt3594 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Z")
	public boolean method2952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3591;
		if (this.anInt3594 == arg1 && this.anInt3591 == 0) {
			return false;
		}
		@Pc(74) boolean local74;
		@Pc(107) int local107;
		if (this.anInt3591 == 0) {
			if (this.anInt3594 < arg1 && arg1 <= arg0 + this.anInt3594 || this.anInt3594 > arg1 && arg1 >= this.anInt3594 - arg0) {
				this.anInt3594 = arg1;
				return false;
			}
			local74 = true;
		} else {
			@Pc(113) int local113;
			if (this.anInt3591 > 0 && arg1 > this.anInt3594) {
				local107 = this.anInt3591 * this.anInt3591 / (arg0 * 2);
				local113 = this.anInt3594 + local107;
				if (local113 < arg1 && local113 >= this.anInt3594) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else if (this.anInt3591 < 0 && arg1 < this.anInt3594) {
				local107 = this.anInt3591 * this.anInt3591 / (arg0 * 2);
				local113 = this.anInt3594 - local107;
				if (arg1 < local113 && local113 <= this.anInt3594) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else {
				local74 = false;
			}
		}
		if (local74) {
			if (this.anInt3594 >= arg1) {
				this.anInt3591 -= arg0;
				if (arg2 != 0 && -arg2 > this.anInt3591) {
					this.anInt3591 = -arg2;
				}
			} else {
				this.anInt3591 += arg0;
				if (arg2 != 0 && this.anInt3591 > arg2) {
					this.anInt3591 = arg2;
				}
			}
			if (this.anInt3591 != local8) {
				local107 = this.anInt3591 * this.anInt3591 / (arg0 * 2);
				if (this.anInt3594 < arg1) {
					if (arg1 < local107 + this.anInt3594) {
						this.anInt3591 = local8;
					}
				} else if (arg1 < this.anInt3594 && this.anInt3594 - local107 < arg1) {
					this.anInt3591 = local8;
				}
			}
		} else if (this.anInt3591 > 0) {
			this.anInt3591 -= arg0;
			if (this.anInt3591 < 0) {
				this.anInt3591 = 0;
			}
		} else {
			this.anInt3591 += arg0;
			if (this.anInt3591 > 0) {
				this.anInt3591 = 0;
			}
		}
		this.anInt3594 += this.anInt3591 + local8 >> 1;
		return local74;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
	public void method2953(@OriginalArg(0) int arg0) {
		this.anInt3591 = 0;
		this.anInt3594 = arg0;
	}
}
