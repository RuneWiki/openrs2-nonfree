import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class131 {

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
	private int anInt3848;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
	public int anInt3850;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public void method3513() {
		this.anInt3850 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIB)Z")
	public boolean method3514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = this.anInt3848;
		if (arg2 == this.anInt3850 && this.anInt3848 == 0) {
			return false;
		}
		@Pc(57) boolean local57;
		@Pc(69) int local69;
		if (this.anInt3848 == 0) {
			if (arg2 > this.anInt3850 && arg2 <= this.anInt3850 + arg1 || this.anInt3850 > arg2 && this.anInt3850 - arg1 <= arg2) {
				this.anInt3850 = arg2;
				return false;
			}
			local57 = true;
		} else {
			@Pc(75) int local75;
			if (this.anInt3848 > 0 && this.anInt3850 < arg2) {
				local69 = this.anInt3848 * this.anInt3848 / (arg1 * 2);
				local75 = local69 + this.anInt3850;
				if (local75 < arg2 && this.anInt3850 <= local75) {
					local57 = true;
				} else {
					local57 = false;
				}
			} else if (this.anInt3848 < 0 && this.anInt3850 > arg2) {
				local69 = this.anInt3848 * this.anInt3848 / (arg1 * 2);
				local75 = this.anInt3850 - local69;
				if (local75 > arg2 && local75 <= this.anInt3850) {
					local57 = true;
				} else {
					local57 = false;
				}
			} else {
				local57 = false;
			}
		}
		if (local57) {
			if (arg2 <= this.anInt3850) {
				this.anInt3848 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt3848) {
					this.anInt3848 = -arg0;
				}
			} else {
				this.anInt3848 += arg1;
				if (arg0 != 0 && arg0 < this.anInt3848) {
					this.anInt3848 = arg0;
				}
			}
			if (this.anInt3848 != local16) {
				local69 = this.anInt3848 * this.anInt3848 / (arg1 * 2);
				if (this.anInt3850 < arg2) {
					if (local69 + this.anInt3850 > arg2) {
						this.anInt3848 = local16;
					}
				} else if (this.anInt3850 > arg2 && arg2 > this.anInt3850 - local69) {
					this.anInt3848 = local16;
				}
			}
		} else if (this.anInt3848 > 0) {
			this.anInt3848 -= arg1;
			if (this.anInt3848 < 0) {
				this.anInt3848 = 0;
			}
		} else {
			this.anInt3848 += arg1;
			if (this.anInt3848 > 0) {
				this.anInt3848 = 0;
			}
		}
		this.anInt3850 += this.anInt3848 + local16 >> 1;
		return local57;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
	public void method3516(@OriginalArg(1) int arg0) {
		this.anInt3850 = arg0;
		this.anInt3848 = 0;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I")
	public int method3517() {
		return this.anInt3850 & 0x3FFF;
	}
}
