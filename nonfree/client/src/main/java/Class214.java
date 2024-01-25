import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class214 {

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	public int anInt5929;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	private int anInt5931;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
	public void method4959(@OriginalArg(0) int arg0) {
		this.anInt5931 = 0;
		this.anInt5929 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIB)Z")
	public boolean method4960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt5931;
		if (this.anInt5929 == arg1 && this.anInt5931 == 0) {
			return false;
		}
		@Pc(67) boolean local67;
		@Pc(90) int local90;
		if (this.anInt5931 == 0) {
			if (this.anInt5929 < arg1 && arg0 + this.anInt5929 >= arg1 || arg1 < this.anInt5929 && arg1 >= this.anInt5929 - arg0) {
				this.anInt5929 = arg1;
				return false;
			}
			local67 = true;
		} else {
			@Pc(95) int local95;
			if (this.anInt5931 > 0 && arg1 > this.anInt5929) {
				local90 = this.anInt5931 * this.anInt5931 / (arg0 * 2);
				local95 = local90 + this.anInt5929;
				if (local95 < arg1 && local95 >= this.anInt5929) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else if (this.anInt5931 < 0 && this.anInt5929 > arg1) {
				local90 = this.anInt5931 * this.anInt5931 / (arg0 * 2);
				local95 = this.anInt5929 - local90;
				if (local95 > arg1 && this.anInt5929 >= local95) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else {
				local67 = false;
			}
		}
		if (local67) {
			if (this.anInt5929 >= arg1) {
				this.anInt5931 -= arg0;
				if (arg2 != 0 && this.anInt5931 < -arg2) {
					this.anInt5931 = -arg2;
				}
			} else {
				this.anInt5931 += arg0;
				if (arg2 != 0 && arg2 < this.anInt5931) {
					this.anInt5931 = arg2;
				}
			}
			if (local8 != this.anInt5931) {
				local90 = this.anInt5931 * this.anInt5931 / (arg0 * 2);
				if (arg1 <= this.anInt5929) {
					if (this.anInt5929 > arg1 && arg1 > this.anInt5929 - local90) {
						this.anInt5931 = local8;
					}
				} else if (arg1 < this.anInt5929 + local90) {
					this.anInt5931 = local8;
				}
			}
		} else if (this.anInt5931 <= 0) {
			this.anInt5931 += arg0;
			if (this.anInt5931 > 0) {
				this.anInt5931 = 0;
			}
		} else {
			this.anInt5931 -= arg0;
			if (this.anInt5931 < 0) {
				this.anInt5931 = 0;
			}
		}
		this.anInt5929 += local8 + this.anInt5931 >> 1;
		return local67;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	public void method4961() {
		this.anInt5929 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I")
	public int method4965() {
		return this.anInt5929 & 0x3FFF;
	}
}
