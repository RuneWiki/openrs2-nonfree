import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class200 {

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public int anInt5507;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	private int anInt5509;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)I")
	public int method4987() {
		return this.anInt5507 & 0x3FFF;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZI)Z")
	public boolean method4988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt5509;
		if (this.anInt5507 == arg0 && this.anInt5509 == 0) {
			return false;
		}
		@Pc(67) boolean local67;
		@Pc(90) int local90;
		if (this.anInt5509 == 0) {
			if (arg0 > this.anInt5507 && arg0 <= this.anInt5507 + arg2 || arg0 < this.anInt5507 && this.anInt5507 - arg2 <= arg0) {
				this.anInt5507 = arg0;
				return false;
			}
			local67 = true;
		} else {
			@Pc(95) int local95;
			if (this.anInt5509 > 0 && arg0 > this.anInt5507) {
				local90 = this.anInt5509 * this.anInt5509 / (arg2 * 2);
				local95 = local90 + this.anInt5507;
				if (arg0 > local95 && this.anInt5507 <= local95) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else if (this.anInt5509 < 0 && arg0 < this.anInt5507) {
				local90 = this.anInt5509 * this.anInt5509 / (arg2 * 2);
				local95 = this.anInt5507 - local90;
				if (arg0 < local95 && this.anInt5507 >= local95) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else {
				local67 = false;
			}
		}
		if (local67) {
			if (this.anInt5507 < arg0) {
				this.anInt5509 += arg2;
				if (arg1 != 0 && arg1 < this.anInt5509) {
					this.anInt5509 = arg1;
				}
			} else {
				this.anInt5509 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt5509) {
					this.anInt5509 = -arg1;
				}
			}
			if (local6 != this.anInt5509) {
				local90 = this.anInt5509 * this.anInt5509 / (arg2 * 2);
				if (this.anInt5507 >= arg0) {
					if (this.anInt5507 > arg0 && this.anInt5507 - local90 < arg0) {
						this.anInt5509 = local6;
					}
				} else if (arg0 < this.anInt5507 + local90) {
					this.anInt5509 = local6;
				}
			}
		} else if (this.anInt5509 <= 0) {
			this.anInt5509 += arg2;
			if (this.anInt5509 > 0) {
				this.anInt5509 = 0;
			}
		} else {
			this.anInt5509 -= arg2;
			if (this.anInt5509 < 0) {
				this.anInt5509 = 0;
			}
		}
		this.anInt5507 += this.anInt5509 + local6 >> 1;
		return local67;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public void method4989(@OriginalArg(1) int arg0) {
		this.anInt5507 = arg0;
		this.anInt5509 = 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public void method4990() {
		this.anInt5507 &= 0x3FFF;
	}
}
