import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class157 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	private int anInt4470;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public int anInt4471;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I")
	public int method3616() {
		return this.anInt4471 & 0x3FFF;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
	public void method3617() {
		this.anInt4471 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)Z")
	public boolean method3618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4470;
		if (arg1 == this.anInt4471 && this.anInt4470 == 0) {
			return false;
		}
		@Pc(67) boolean local67;
		@Pc(111) int local111;
		if (this.anInt4470 == 0) {
			if (this.anInt4471 < arg1 && arg2 + this.anInt4471 >= arg1 || arg1 < this.anInt4471 && arg1 >= this.anInt4471 - arg2) {
				this.anInt4471 = arg1;
				return false;
			}
			local67 = true;
		} else {
			@Pc(116) int local116;
			if (this.anInt4470 > 0 && arg1 > this.anInt4471) {
				local111 = this.anInt4470 * this.anInt4470 / (arg2 * 2);
				local116 = local111 + this.anInt4471;
				if (arg1 > local116 && this.anInt4471 <= local116) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else if (this.anInt4470 < 0 && arg1 < this.anInt4471) {
				local111 = this.anInt4470 * this.anInt4470 / (arg2 * 2);
				local116 = this.anInt4471 - local111;
				if (local116 > arg1 && this.anInt4471 >= local116) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else {
				local67 = false;
			}
		}
		if (local67) {
			if (this.anInt4471 >= arg1) {
				this.anInt4470 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt4470) {
					this.anInt4470 = -arg0;
				}
			} else {
				this.anInt4470 += arg2;
				if (arg0 != 0 && arg0 < this.anInt4470) {
					this.anInt4470 = arg0;
				}
			}
			if (this.anInt4470 != local8) {
				local111 = this.anInt4470 * this.anInt4470 / (arg2 * 2);
				if (arg1 <= this.anInt4471) {
					if (arg1 < this.anInt4471 && this.anInt4471 - local111 < arg1) {
						this.anInt4470 = local8;
					}
				} else if (arg1 < local111 + this.anInt4471) {
					this.anInt4470 = local8;
				}
			}
		} else if (this.anInt4470 <= 0) {
			this.anInt4470 += arg2;
			if (this.anInt4470 > 0) {
				this.anInt4470 = 0;
			}
		} else {
			this.anInt4470 -= arg2;
			if (this.anInt4470 < 0) {
				this.anInt4470 = 0;
			}
		}
		this.anInt4471 += this.anInt4470 + local8 >> 1;
		return local67;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	public void method3620(@OriginalArg(1) int arg0) {
		this.anInt4470 = 0;
		this.anInt4471 = arg0;
	}
}
