import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class216 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public int anInt6397;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	private int anInt6398;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)I")
	public int method4985() {
		return this.anInt6397 & 0x3FFF;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public void method4986() {
		this.anInt6397 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)Z")
	public boolean method4987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt6398;
		if (this.anInt6397 == arg0 && this.anInt6398 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(110) int local110;
		if (this.anInt6398 == 0) {
			if (arg0 > this.anInt6397 && arg0 <= arg2 + this.anInt6397 || arg0 < this.anInt6397 && this.anInt6397 - arg2 <= arg0) {
				this.anInt6397 = arg0;
				return false;
			}
			local69 = true;
		} else {
			@Pc(116) int local116;
			if (this.anInt6398 > 0 && this.anInt6397 < arg0) {
				local110 = this.anInt6398 * this.anInt6398 / (arg2 * 2);
				local116 = local110 + this.anInt6397;
				if (local116 < arg0 && this.anInt6397 <= local116) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt6398 < 0 && this.anInt6397 > arg0) {
				local110 = this.anInt6398 * this.anInt6398 / (arg2 * 2);
				local116 = this.anInt6397 - local110;
				if (local116 > arg0 && local116 <= this.anInt6397) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (this.anInt6397 < arg0) {
				this.anInt6398 += arg2;
				if (arg1 != 0 && this.anInt6398 > arg1) {
					this.anInt6398 = arg1;
				}
			} else {
				this.anInt6398 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt6398) {
					this.anInt6398 = -arg1;
				}
			}
			if (this.anInt6398 != local8) {
				local110 = this.anInt6398 * this.anInt6398 / (arg2 * 2);
				if (arg0 > this.anInt6397) {
					if (arg0 < this.anInt6397 + local110) {
						this.anInt6398 = local8;
					}
				} else if (this.anInt6397 > arg0 && arg0 > this.anInt6397 - local110) {
					this.anInt6398 = local8;
				}
			}
		} else if (this.anInt6398 <= 0) {
			this.anInt6398 += arg2;
			if (this.anInt6398 > 0) {
				this.anInt6398 = 0;
			}
		} else {
			this.anInt6398 -= arg2;
			if (this.anInt6398 < 0) {
				this.anInt6398 = 0;
			}
		}
		this.anInt6397 += local8 + this.anInt6398 >> 1;
		return local69;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public void method4988(@OriginalArg(1) int arg0) {
		this.anInt6398 = 0;
		this.anInt6397 = arg0;
	}
}
