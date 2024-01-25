import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class107 {

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
	public int anInt2613;

	@OriginalMember(owner = "client!fha", name = "f", descriptor = "I")
	private int anInt2615;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)I")
	public int method2219() {
		return this.anInt2613 & 0x3FFF;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)V")
	public void method2220(@OriginalArg(0) int arg0) {
		this.anInt2613 = arg0;
		this.anInt2615 = 0;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)V")
	public void method2223() {
		this.anInt2613 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIII)Z")
	public boolean method2224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt2615;
		if (arg2 == this.anInt2613 && this.anInt2615 == 0) {
			return false;
		}
		@Pc(63) boolean local63;
		@Pc(95) int local95;
		if (this.anInt2615 == 0) {
			if (this.anInt2613 < arg2 && arg0 + this.anInt2613 >= arg2 || this.anInt2613 > arg2 && this.anInt2613 - arg0 <= arg2) {
				this.anInt2613 = arg2;
				return false;
			}
			local63 = true;
		} else {
			@Pc(101) int local101;
			if (this.anInt2615 > 0 && this.anInt2613 < arg2) {
				local95 = this.anInt2615 * this.anInt2615 / (arg0 * 2);
				local101 = this.anInt2613 + local95;
				if (local101 < arg2 && this.anInt2613 <= local101) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else if (this.anInt2615 < 0 && arg2 < this.anInt2613) {
				local95 = this.anInt2615 * this.anInt2615 / (arg0 * 2);
				local101 = this.anInt2613 - local95;
				if (local101 > arg2 && local101 <= this.anInt2613) {
					local63 = true;
				} else {
					local63 = false;
				}
			} else {
				local63 = false;
			}
		}
		if (local63) {
			if (this.anInt2613 >= arg2) {
				this.anInt2615 -= arg0;
				if (arg1 != 0 && this.anInt2615 < -arg1) {
					this.anInt2615 = -arg1;
				}
			} else {
				this.anInt2615 += arg0;
				if (arg1 != 0 && this.anInt2615 > arg1) {
					this.anInt2615 = arg1;
				}
			}
			if (local8 != this.anInt2615) {
				local95 = this.anInt2615 * this.anInt2615 / (arg0 * 2);
				if (this.anInt2613 >= arg2) {
					if (this.anInt2613 > arg2 && this.anInt2613 - local95 < arg2) {
						this.anInt2615 = local8;
					}
				} else if (local95 + this.anInt2613 > arg2) {
					this.anInt2615 = local8;
				}
			}
		} else if (this.anInt2615 <= 0) {
			this.anInt2615 += arg0;
			if (this.anInt2615 > 0) {
				this.anInt2615 = 0;
			}
		} else {
			this.anInt2615 -= arg0;
			if (this.anInt2615 < 0) {
				this.anInt2615 = 0;
			}
		}
		this.anInt2613 += this.anInt2615 + local8 >> 1;
		return local63;
	}
}
