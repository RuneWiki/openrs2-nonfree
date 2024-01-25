import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class234 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	public int anInt6541;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	private int anInt6542;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method5417() {
		this.anInt6541 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)Z")
	public boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt6542;
		if (this.anInt6541 == arg0 && this.anInt6542 == 0) {
			return false;
		}
		@Pc(61) boolean local61;
		@Pc(97) int local97;
		if (this.anInt6542 == 0) {
			if (this.anInt6541 < arg0 && this.anInt6541 + arg2 >= arg0 || this.anInt6541 > arg0 && arg0 >= this.anInt6541 - arg2) {
				this.anInt6541 = arg0;
				return false;
			}
			local61 = true;
		} else {
			@Pc(103) int local103;
			if (this.anInt6542 > 0 && arg0 > this.anInt6541) {
				local97 = this.anInt6542 * this.anInt6542 / (arg2 * 2);
				local103 = this.anInt6541 + local97;
				if (local103 < arg0 && local103 >= this.anInt6541) {
					local61 = true;
				} else {
					local61 = false;
				}
			} else if (this.anInt6542 < 0 && arg0 < this.anInt6541) {
				local97 = this.anInt6542 * this.anInt6542 / (arg2 * 2);
				local103 = this.anInt6541 - local97;
				if (local103 > arg0 && local103 <= this.anInt6541) {
					local61 = true;
				} else {
					local61 = false;
				}
			} else {
				local61 = false;
			}
		}
		if (local61) {
			if (this.anInt6541 >= arg0) {
				this.anInt6542 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt6542) {
					this.anInt6542 = -arg1;
				}
			} else {
				this.anInt6542 += arg2;
				if (arg1 != 0 && arg1 < this.anInt6542) {
					this.anInt6542 = arg1;
				}
			}
			if (local8 != this.anInt6542) {
				local97 = this.anInt6542 * this.anInt6542 / (arg2 * 2);
				if (this.anInt6541 >= arg0) {
					if (this.anInt6541 > arg0 && this.anInt6541 - local97 < arg0) {
						this.anInt6542 = local8;
					}
				} else if (arg0 < local97 + this.anInt6541) {
					this.anInt6542 = local8;
				}
			}
		} else if (this.anInt6542 > 0) {
			this.anInt6542 -= arg2;
			if (this.anInt6542 < 0) {
				this.anInt6542 = 0;
			}
		} else {
			this.anInt6542 += arg2;
			if (this.anInt6542 > 0) {
				this.anInt6542 = 0;
			}
		}
		this.anInt6541 += local8 + this.anInt6542 >> 1;
		return local61;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I")
	public int method5422() {
		return this.anInt6541 & 0x3FFF;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	public void method5423(@OriginalArg(1) int arg0) {
		this.anInt6542 = 0;
		this.anInt6541 = arg0;
	}
}
