import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class17 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public int anInt269;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIBI)Z")
	public boolean method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt259;
		if (this.anInt269 == arg2 && this.anInt259 == 0) {
			return false;
		}
		@Pc(72) boolean local72;
		@Pc(95) int local95;
		if (this.anInt259 == 0) {
			if (this.anInt269 < arg2 && arg1 + this.anInt269 >= arg2 || arg2 < this.anInt269 && this.anInt269 - arg1 <= arg2) {
				this.anInt269 = arg2;
				return false;
			}
			local72 = true;
		} else {
			@Pc(100) int local100;
			if (this.anInt259 > 0 && arg2 > this.anInt269) {
				local95 = this.anInt259 * this.anInt259 / (arg1 * 2);
				local100 = local95 + this.anInt269;
				if (local100 < arg2 && local100 >= this.anInt269) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else if (this.anInt259 < 0 && arg2 < this.anInt269) {
				local95 = this.anInt259 * this.anInt259 / (arg1 * 2);
				local100 = this.anInt269 - local95;
				if (arg2 < local100 && this.anInt269 >= local100) {
					local72 = true;
				} else {
					local72 = false;
				}
			} else {
				local72 = false;
			}
		}
		if (local72) {
			if (arg2 > this.anInt269) {
				this.anInt259 += arg1;
				if (arg0 != 0 && this.anInt259 > arg0) {
					this.anInt259 = arg0;
				}
			} else {
				this.anInt259 -= arg1;
				if (arg0 != 0 && this.anInt259 < -arg0) {
					this.anInt259 = -arg0;
				}
			}
			if (local8 != this.anInt259) {
				local95 = this.anInt259 * this.anInt259 / (arg1 * 2);
				if (arg2 <= this.anInt269) {
					if (this.anInt269 > arg2 && this.anInt269 - local95 < arg2) {
						this.anInt259 = local8;
					}
				} else if (local95 + this.anInt269 > arg2) {
					this.anInt259 = local8;
				}
			}
		} else if (this.anInt259 > 0) {
			this.anInt259 -= arg1;
			if (this.anInt259 < 0) {
				this.anInt259 = 0;
			}
		} else {
			this.anInt259 += arg1;
			if (this.anInt259 > 0) {
				this.anInt259 = 0;
			}
		}
		this.anInt269 += local8 + this.anInt259 >> 1;
		return local72;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	public int method204() {
		return this.anInt269 & 0x3FFF;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
	public void method205() {
		this.anInt269 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
	public void method207(@OriginalArg(0) int arg0) {
		this.anInt259 = 0;
		this.anInt269 = arg0;
	}
}
