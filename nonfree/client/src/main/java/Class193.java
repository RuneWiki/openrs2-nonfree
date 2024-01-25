import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class193 {

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	private int anInt6090;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	public int anInt6100;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)I")
	public int method5174() {
		return this.anInt6100 & 0x3FFF;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)V")
	public void method5175(@OriginalArg(1) int arg0) {
		this.anInt6090 = 0;
		this.anInt6100 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)Z")
	public boolean method5178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = this.anInt6090;
		if (arg1 == this.anInt6100 && this.anInt6090 == 0) {
			return false;
		}
		@Pc(76) boolean local76;
		@Pc(98) int local98;
		if (this.anInt6090 == 0) {
			if (this.anInt6100 < arg1 && arg1 <= this.anInt6100 + arg0 || this.anInt6100 > arg1 && this.anInt6100 - arg0 <= arg1) {
				this.anInt6100 = arg1;
				return false;
			}
			local76 = true;
		} else {
			@Pc(103) int local103;
			if (this.anInt6090 > 0 && this.anInt6100 < arg1) {
				local98 = this.anInt6090 * this.anInt6090 / (arg0 * 2);
				local103 = local98 + this.anInt6100;
				if (local103 < arg1 && local103 >= this.anInt6100) {
					local76 = true;
				} else {
					local76 = false;
				}
			} else if (this.anInt6090 < 0 && this.anInt6100 > arg1) {
				local98 = this.anInt6090 * this.anInt6090 / (arg0 * 2);
				local103 = this.anInt6100 - local98;
				if (local103 > arg1 && local103 <= this.anInt6100) {
					local76 = true;
				} else {
					local76 = false;
				}
			} else {
				local76 = false;
			}
		}
		if (local76) {
			if (arg1 > this.anInt6100) {
				this.anInt6090 += arg0;
				if (arg2 != 0 && this.anInt6090 > arg2) {
					this.anInt6090 = arg2;
				}
			} else {
				this.anInt6090 -= arg0;
				if (arg2 != 0 && this.anInt6090 < -arg2) {
					this.anInt6090 = -arg2;
				}
			}
			if (this.anInt6090 != local14) {
				local98 = this.anInt6090 * this.anInt6090 / (arg0 * 2);
				if (arg1 > this.anInt6100) {
					if (local98 + this.anInt6100 > arg1) {
						this.anInt6090 = local14;
					}
				} else if (arg1 < this.anInt6100 && this.anInt6100 - local98 < arg1) {
					this.anInt6090 = local14;
				}
			}
		} else if (this.anInt6090 > 0) {
			this.anInt6090 -= arg0;
			if (this.anInt6090 < 0) {
				this.anInt6090 = 0;
			}
		} else {
			this.anInt6090 += arg0;
			if (this.anInt6090 > 0) {
				this.anInt6090 = 0;
			}
		}
		this.anInt6100 += this.anInt6090 + local14 >> 1;
		return local76;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	public void method5179() {
		this.anInt6100 &= 0x3FFF;
	}
}
