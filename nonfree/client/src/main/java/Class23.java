import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class23 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	public int method461() {
		return this.anInt483 & 0x3FFF;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public void method465() {
		this.anInt483 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)Z")
	public boolean method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt484;
		if (arg1 == this.anInt483 && this.anInt484 == 0) {
			return false;
		}
		@Pc(75) boolean local75;
		@Pc(113) int local113;
		if (this.anInt484 == 0) {
			if (arg1 > this.anInt483 && arg1 <= this.anInt483 + arg2 || arg1 < this.anInt483 && arg1 >= this.anInt483 - arg2) {
				this.anInt483 = arg1;
				return false;
			}
			local75 = true;
		} else {
			@Pc(119) int local119;
			if (this.anInt484 > 0 && arg1 > this.anInt483) {
				local113 = this.anInt484 * this.anInt484 / (arg2 * 2);
				local119 = this.anInt483 + local113;
				if (arg1 > local119 && this.anInt483 <= local119) {
					local75 = true;
				} else {
					local75 = false;
				}
			} else if (this.anInt484 < 0 && this.anInt483 > arg1) {
				local113 = this.anInt484 * this.anInt484 / (arg2 * 2);
				local119 = this.anInt483 - local113;
				if (arg1 < local119 && this.anInt483 >= local119) {
					local75 = true;
				} else {
					local75 = false;
				}
			} else {
				local75 = false;
			}
		}
		if (local75) {
			if (arg1 > this.anInt483) {
				this.anInt484 += arg2;
				if (arg0 != 0 && arg0 < this.anInt484) {
					this.anInt484 = arg0;
				}
			} else {
				this.anInt484 -= arg2;
				if (arg0 != 0 && this.anInt484 < -arg0) {
					this.anInt484 = -arg0;
				}
			}
			if (local6 != this.anInt484) {
				local113 = this.anInt484 * this.anInt484 / (arg2 * 2);
				if (arg1 > this.anInt483) {
					if (arg1 < this.anInt483 + local113) {
						this.anInt484 = local6;
					}
				} else if (this.anInt483 > arg1 && arg1 > this.anInt483 - local113) {
					this.anInt484 = local6;
				}
			}
		} else if (this.anInt484 <= 0) {
			this.anInt484 += arg2;
			if (this.anInt484 > 0) {
				this.anInt484 = 0;
			}
		} else {
			this.anInt484 -= arg2;
			if (this.anInt484 < 0) {
				this.anInt484 = 0;
			}
		}
		this.anInt483 += this.anInt484 + local6 >> 1;
		return local75;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public void method467(@OriginalArg(1) int arg0) {
		this.anInt483 = arg0;
		this.anInt484 = 0;
	}
}
