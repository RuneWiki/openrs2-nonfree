import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class258 {

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
	public int anInt7153;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
	private int anInt7155;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
	public void method6283() {
		this.anInt7153 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII)Z")
	public boolean method6284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = this.anInt7155;
		if (this.anInt7153 == arg2 && this.anInt7155 == 0) {
			return false;
		}
		@Pc(83) boolean local83;
		@Pc(110) int local110;
		if (this.anInt7155 == 0) {
			if (arg2 > this.anInt7153 && arg2 <= this.anInt7153 + arg0 || arg2 < this.anInt7153 && arg2 >= this.anInt7153 - arg0) {
				this.anInt7153 = arg2;
				return false;
			}
			local83 = true;
		} else {
			@Pc(115) int local115;
			if (this.anInt7155 > 0 && this.anInt7153 < arg2) {
				local110 = this.anInt7155 * this.anInt7155 / (arg0 * 2);
				local115 = this.anInt7153 + local110;
				if (local115 < arg2 && local115 >= this.anInt7153) {
					local83 = true;
				} else {
					local83 = false;
				}
			} else if (this.anInt7155 < 0 && this.anInt7153 > arg2) {
				local110 = this.anInt7155 * this.anInt7155 / (arg0 * 2);
				local115 = this.anInt7153 - local110;
				if (arg2 < local115 && local115 <= this.anInt7153) {
					local83 = true;
				} else {
					local83 = false;
				}
			} else {
				local83 = false;
			}
		}
		if (local83) {
			if (this.anInt7153 < arg2) {
				this.anInt7155 += arg0;
				if (arg1 != 0 && arg1 < this.anInt7155) {
					this.anInt7155 = arg1;
				}
			} else {
				this.anInt7155 -= arg0;
				if (arg1 != 0 && this.anInt7155 < -arg1) {
					this.anInt7155 = -arg1;
				}
			}
			if (this.anInt7155 != local15) {
				local110 = this.anInt7155 * this.anInt7155 / (arg0 * 2);
				if (arg2 > this.anInt7153) {
					if (this.anInt7153 + local110 > arg2) {
						this.anInt7155 = local15;
					}
				} else if (arg2 < this.anInt7153 && arg2 > this.anInt7153 - local110) {
					this.anInt7155 = local15;
				}
			}
		} else if (this.anInt7155 <= 0) {
			this.anInt7155 += arg0;
			if (this.anInt7155 > 0) {
				this.anInt7155 = 0;
			}
		} else {
			this.anInt7155 -= arg0;
			if (this.anInt7155 < 0) {
				this.anInt7155 = 0;
			}
		}
		this.anInt7153 += local15 + this.anInt7155 >> 1;
		return local83;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I")
	public int method6285(@OriginalArg(0) int arg0) {
		return arg0 == 16383 ? this.anInt7153 & 0x3FFF : 28;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)V")
	public void method6286(@OriginalArg(0) int arg0) {
		this.anInt7153 = arg0;
		this.anInt7155 = 0;
	}
}
