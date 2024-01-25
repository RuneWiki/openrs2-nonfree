import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class251 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	private int anInt6470;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
	public int anInt6475;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
	public int method5710() {
		return this.anInt6475 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBI)Z")
	public boolean method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt6470;
		if (this.anInt6475 == arg2 && this.anInt6470 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(88) int local88;
		if (this.anInt6470 == 0) {
			if (arg2 > this.anInt6475 && this.anInt6475 + arg0 >= arg2 || this.anInt6475 > arg2 && this.anInt6475 - arg0 <= arg2) {
				this.anInt6475 = arg2;
				return false;
			}
			local66 = true;
		} else {
			@Pc(94) int local94;
			if (this.anInt6470 > 0 && this.anInt6475 < arg2) {
				local88 = this.anInt6470 * this.anInt6470 / (arg0 * 2);
				local94 = this.anInt6475 + local88;
				if (local94 < arg2 && local94 >= this.anInt6475) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt6470 < 0 && this.anInt6475 > arg2) {
				local88 = this.anInt6470 * this.anInt6470 / (arg0 * 2);
				local94 = this.anInt6475 - local88;
				if (local94 > arg2 && this.anInt6475 >= local94) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (arg2 <= this.anInt6475) {
				this.anInt6470 -= arg0;
				if (arg1 != 0 && -arg1 > this.anInt6470) {
					this.anInt6470 = -arg1;
				}
			} else {
				this.anInt6470 += arg0;
				if (arg1 != 0 && arg1 < this.anInt6470) {
					this.anInt6470 = arg1;
				}
			}
			if (this.anInt6470 != local8) {
				local88 = this.anInt6470 * this.anInt6470 / (arg0 * 2);
				if (arg2 > this.anInt6475) {
					if (this.anInt6475 + local88 > arg2) {
						this.anInt6470 = local8;
					}
				} else if (this.anInt6475 > arg2 && arg2 > this.anInt6475 - local88) {
					this.anInt6470 = local8;
				}
			}
		} else if (this.anInt6470 <= 0) {
			this.anInt6470 += arg0;
			if (this.anInt6470 > 0) {
				this.anInt6470 = 0;
			}
		} else {
			this.anInt6470 -= arg0;
			if (this.anInt6470 < 0) {
				this.anInt6470 = 0;
			}
		}
		this.anInt6475 += local8 + this.anInt6470 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
	public void method5715(@OriginalArg(1) int arg0) {
		this.anInt6475 = arg0;
		this.anInt6470 = 0;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)V")
	public void method5716() {
		this.anInt6475 &= 0x3FFF;
	}
}
