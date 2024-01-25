import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class91 {

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	public int anInt2732;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	private int anInt2736;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBI)Z")
	public boolean method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt2736;
		if (arg1 == this.anInt2732 && this.anInt2736 == 0) {
			return false;
		}
		@Pc(67) boolean local67;
		@Pc(89) int local89;
		if (this.anInt2736 == 0) {
			if (this.anInt2732 < arg1 && arg2 + this.anInt2732 >= arg1 || this.anInt2732 > arg1 && arg1 >= this.anInt2732 - arg2) {
				this.anInt2732 = arg1;
				return false;
			}
			local67 = true;
		} else {
			@Pc(94) int local94;
			if (this.anInt2736 > 0 && arg1 > this.anInt2732) {
				local89 = this.anInt2736 * this.anInt2736 / (arg2 * 2);
				local94 = this.anInt2732 + local89;
				if (local94 < arg1 && this.anInt2732 <= local94) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else if (this.anInt2736 < 0 && this.anInt2732 > arg1) {
				local89 = this.anInt2736 * this.anInt2736 / (arg2 * 2);
				local94 = this.anInt2732 - local89;
				if (arg1 < local94 && this.anInt2732 >= local94) {
					local67 = true;
				} else {
					local67 = false;
				}
			} else {
				local67 = false;
			}
		}
		if (local67) {
			if (arg1 > this.anInt2732) {
				this.anInt2736 += arg2;
				if (arg0 != 0 && this.anInt2736 > arg0) {
					this.anInt2736 = arg0;
				}
			} else {
				this.anInt2736 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt2736) {
					this.anInt2736 = -arg0;
				}
			}
			if (local6 != this.anInt2736) {
				local89 = this.anInt2736 * this.anInt2736 / (arg2 * 2);
				if (arg1 > this.anInt2732) {
					if (local89 + this.anInt2732 > arg1) {
						this.anInt2736 = local6;
					}
				} else if (arg1 < this.anInt2732 && this.anInt2732 - local89 < arg1) {
					this.anInt2736 = local6;
				}
			}
		} else if (this.anInt2736 <= 0) {
			this.anInt2736 += arg2;
			if (this.anInt2736 > 0) {
				this.anInt2736 = 0;
			}
		} else {
			this.anInt2736 -= arg2;
			if (this.anInt2736 < 0) {
				this.anInt2736 = 0;
			}
		}
		this.anInt2732 += this.anInt2736 + local6 >> 1;
		return local67;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
	public void method2046(@OriginalArg(1) int arg0) {
		this.anInt2732 = arg0;
		this.anInt2736 = 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public void method2047() {
		this.anInt2732 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	public int method2048() {
		return this.anInt2732 & 0x3FFF;
	}
}
