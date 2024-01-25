import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class257 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	private int anInt7552;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public int anInt7554;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public void method6125() {
		this.anInt7554 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
	public int method6126() {
		return this.anInt7554 & 0x3FFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V")
	public void method6128(@OriginalArg(0) int arg0) {
		this.anInt7554 = arg0;
		this.anInt7552 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)Z")
	public boolean method6129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = this.anInt7552;
		if (this.anInt7554 == arg1 && this.anInt7552 == 0) {
			return false;
		}
		@Pc(72) boolean local72;
		@Pc(105) int local105;
		if (this.anInt7552 == 0) {
			if (this.anInt7554 < arg1 && arg2 + this.anInt7554 >= arg1 || this.anInt7554 > arg1 && arg1 >= this.anInt7554 - arg2) {
				this.anInt7554 = arg1;
				return false;
			}
			local72 = true;
		} else {
			@Pc(111) int local111;
			if (this.anInt7552 > 0 && this.anInt7554 < arg1) {
				local105 = this.anInt7552 * this.anInt7552 / (arg2 * 2);
				local111 = local105 + this.anInt7554;
				if (local111 < arg1 && local111 >= this.anInt7554) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else if (this.anInt7552 < 0 && arg1 < this.anInt7554) {
				local105 = this.anInt7552 * this.anInt7552 / (arg2 * 2);
				local111 = this.anInt7554 - local105;
				if (local111 > arg1 && local111 <= this.anInt7554) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else {
				local72 = false;
			}
		}
		if (local72) {
			if (this.anInt7554 >= arg1) {
				this.anInt7552 -= arg2;
				if (arg0 != 0 && this.anInt7552 < -arg0) {
					this.anInt7552 = -arg0;
				}
			} else {
				this.anInt7552 += arg2;
				if (arg0 != 0 && this.anInt7552 > arg0) {
					this.anInt7552 = arg0;
				}
			}
			if (this.anInt7552 != local14) {
				local105 = this.anInt7552 * this.anInt7552 / (arg2 * 2);
				if (arg1 <= this.anInt7554) {
					if (arg1 < this.anInt7554 && this.anInt7554 - local105 < arg1) {
						this.anInt7552 = local14;
					}
				} else if (arg1 < local105 + this.anInt7554) {
					this.anInt7552 = local14;
				}
			}
		} else if (this.anInt7552 > 0) {
			this.anInt7552 -= arg2;
			if (this.anInt7552 < 0) {
				this.anInt7552 = 0;
			}
		} else {
			this.anInt7552 += arg2;
			if (this.anInt7552 > 0) {
				this.anInt7552 = 0;
			}
		}
		this.anInt7554 += this.anInt7552 + local14 >> 1;
		return local72;
	}
}
