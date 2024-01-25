import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class240 {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
	private int anInt5667;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public int anInt5668;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
	public int method4986() {
		return this.anInt5668 & 0x3FFF;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public void method4987() {
		this.anInt5668 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZI)Z")
	public boolean method4988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt5667;
		if (arg0 == this.anInt5668 && this.anInt5667 == 0) {
			return false;
		}
		@Pc(73) boolean local73;
		@Pc(103) int local103;
		if (this.anInt5667 == 0) {
			if (this.anInt5668 < arg0 && arg0 <= this.anInt5668 + arg2 || this.anInt5668 > arg0 && arg0 >= this.anInt5668 - arg2) {
				this.anInt5668 = arg0;
				return false;
			}
			local73 = true;
		} else {
			@Pc(109) int local109;
			if (this.anInt5667 > 0 && arg0 > this.anInt5668) {
				local103 = this.anInt5667 * this.anInt5667 / (arg2 * 2);
				local109 = local103 + this.anInt5668;
				if (local109 < arg0 && local109 >= this.anInt5668) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else if (this.anInt5667 < 0 && arg0 < this.anInt5668) {
				local103 = this.anInt5667 * this.anInt5667 / (arg2 * 2);
				local109 = this.anInt5668 - local103;
				if (local109 > arg0 && this.anInt5668 >= local109) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else {
				local73 = false;
			}
		}
		if (local73) {
			if (arg0 <= this.anInt5668) {
				this.anInt5667 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt5667) {
					this.anInt5667 = -arg1;
				}
			} else {
				this.anInt5667 += arg2;
				if (arg1 != 0 && this.anInt5667 > arg1) {
					this.anInt5667 = arg1;
				}
			}
			if (this.anInt5667 != local8) {
				local103 = this.anInt5667 * this.anInt5667 / (arg2 * 2);
				if (arg0 > this.anInt5668) {
					if (local103 + this.anInt5668 > arg0) {
						this.anInt5667 = local8;
					}
				} else if (arg0 < this.anInt5668 && arg0 > this.anInt5668 - local103) {
					this.anInt5667 = local8;
				}
			}
		} else if (this.anInt5667 > 0) {
			this.anInt5667 -= arg2;
			if (this.anInt5667 < 0) {
				this.anInt5667 = 0;
			}
		} else {
			this.anInt5667 += arg2;
			if (this.anInt5667 > 0) {
				this.anInt5667 = 0;
			}
		}
		this.anInt5668 += this.anInt5667 + local8 >> 1;
		return local73;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)V")
	public void method4990(@OriginalArg(0) int arg0) {
		this.anInt5668 = arg0;
		this.anInt5667 = 0;
	}
}
