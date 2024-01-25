import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class66 {

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
	public int anInt1959;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
	private int anInt1960;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
	public int method1724() {
		return this.anInt1959 & 0x3FFF;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)Z")
	public boolean method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt1960;
		if (this.anInt1959 == arg0 && this.anInt1960 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(51) int local51;
		if (this.anInt1960 == 0) {
			if (this.anInt1959 < arg0 && arg0 <= this.anInt1959 + arg2 || arg0 < this.anInt1959 && this.anInt1959 - arg2 <= arg0) {
				this.anInt1959 = arg0;
				return false;
			}
			local66 = true;
		} else {
			@Pc(57) int local57;
			if (this.anInt1960 > 0 && arg0 > this.anInt1959) {
				local51 = this.anInt1960 * this.anInt1960 / (arg2 * 2);
				local57 = this.anInt1959 + local51;
				if (local57 < arg0 && local57 >= this.anInt1959) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt1960 < 0 && arg0 < this.anInt1959) {
				local51 = this.anInt1960 * this.anInt1960 / (arg2 * 2);
				local57 = this.anInt1959 - local51;
				if (local57 > arg0 && this.anInt1959 >= local57) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (arg0 > this.anInt1959) {
				this.anInt1960 += arg2;
				if (arg1 != 0 && this.anInt1960 > arg1) {
					this.anInt1960 = arg1;
				}
			} else {
				this.anInt1960 -= arg2;
				if (arg1 != 0 && this.anInt1960 < -arg1) {
					this.anInt1960 = -arg1;
				}
			}
			if (this.anInt1960 != local8) {
				local51 = this.anInt1960 * this.anInt1960 / (arg2 * 2);
				if (arg0 > this.anInt1959) {
					if (this.anInt1959 + local51 > arg0) {
						this.anInt1960 = local8;
					}
				} else if (arg0 < this.anInt1959 && arg0 > this.anInt1959 - local51) {
					this.anInt1960 = local8;
				}
			}
		} else if (this.anInt1960 > 0) {
			this.anInt1960 -= arg2;
			if (this.anInt1960 < 0) {
				this.anInt1960 = 0;
			}
		} else {
			this.anInt1960 += arg2;
			if (this.anInt1960 > 0) {
				this.anInt1960 = 0;
			}
		}
		this.anInt1959 += this.anInt1960 + local8 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
	public void method1726() {
		this.anInt1959 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZ)V")
	public void method1728(@OriginalArg(0) int arg0) {
		this.anInt1960 = 0;
		this.anInt1959 = arg0;
	}
}
