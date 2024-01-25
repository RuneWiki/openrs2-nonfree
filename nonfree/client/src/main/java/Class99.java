import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class99 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
	private int anInt2553;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public int anInt2556;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)V")
	public void method2034(@OriginalArg(1) int arg0) {
		this.anInt2556 = arg0;
		this.anInt2553 = 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)Z")
	public boolean method2035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = this.anInt2553;
		if (this.anInt2556 == arg0 && this.anInt2553 == 0) {
			return false;
		}
		@Pc(71) boolean local71;
		@Pc(53) int local53;
		if (this.anInt2553 == 0) {
			if (this.anInt2556 < arg0 && this.anInt2556 + arg1 >= arg0 || arg0 < this.anInt2556 && this.anInt2556 - arg1 <= arg0) {
				this.anInt2556 = arg0;
				return false;
			}
			local71 = true;
		} else {
			@Pc(58) int local58;
			if (this.anInt2553 > 0 && arg0 > this.anInt2556) {
				local53 = this.anInt2553 * this.anInt2553 / (arg1 * 2);
				local58 = local53 + this.anInt2556;
				if (arg0 > local58 && local58 >= this.anInt2556) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else if (this.anInt2553 < 0 && this.anInt2556 > arg0) {
				local53 = this.anInt2553 * this.anInt2553 / (arg1 * 2);
				local58 = this.anInt2556 - local53;
				if (arg0 < local58 && local58 <= this.anInt2556) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else {
				local71 = false;
			}
		}
		if (local71) {
			if (this.anInt2556 >= arg0) {
				this.anInt2553 -= arg1;
				if (arg2 != 0 && -arg2 > this.anInt2553) {
					this.anInt2553 = -arg2;
				}
			} else {
				this.anInt2553 += arg1;
				if (arg2 != 0 && this.anInt2553 > arg2) {
					this.anInt2553 = arg2;
				}
			}
			if (local13 != this.anInt2553) {
				local53 = this.anInt2553 * this.anInt2553 / (arg1 * 2);
				if (this.anInt2556 < arg0) {
					if (arg0 < this.anInt2556 + local53) {
						this.anInt2553 = local13;
					}
				} else if (arg0 < this.anInt2556 && arg0 > this.anInt2556 - local53) {
					this.anInt2553 = local13;
				}
			}
		} else if (this.anInt2553 > 0) {
			this.anInt2553 -= arg1;
			if (this.anInt2553 < 0) {
				this.anInt2553 = 0;
			}
		} else {
			this.anInt2553 += arg1;
			if (this.anInt2553 > 0) {
				this.anInt2553 = 0;
			}
		}
		this.anInt2556 += local13 + this.anInt2553 >> 1;
		return local71;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)I")
	public int method2036() {
		return this.anInt2556 & 0x3FFF;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public void method2037() {
		this.anInt2556 &= 0x3FFF;
	}
}
