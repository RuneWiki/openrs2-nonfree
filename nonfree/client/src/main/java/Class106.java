import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class106 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	private int anInt2822;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	public int anInt2824;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	public void method2481(@OriginalArg(0) int arg0) {
		this.anInt2822 = 0;
		this.anInt2824 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII)Z")
	public boolean method2482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt2822;
		if (arg1 == this.anInt2824 && this.anInt2822 == 0) {
			return false;
		}
		@Pc(78) boolean local78;
		@Pc(55) int local55;
		if (this.anInt2822 == 0) {
			if (arg1 > this.anInt2824 && arg1 <= this.anInt2824 + arg2 || arg1 < this.anInt2824 && this.anInt2824 - arg2 <= arg1) {
				this.anInt2824 = arg1;
				return false;
			}
			local78 = true;
		} else {
			@Pc(61) int local61;
			if (this.anInt2822 > 0 && this.anInt2824 < arg1) {
				local55 = this.anInt2822 * this.anInt2822 / (arg2 * 2);
				local61 = this.anInt2824 + local55;
				if (arg1 > local61 && this.anInt2824 <= local61) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else if (this.anInt2822 < 0 && this.anInt2824 > arg1) {
				local55 = this.anInt2822 * this.anInt2822 / (arg2 * 2);
				local61 = this.anInt2824 - local55;
				if (local61 > arg1 && local61 <= this.anInt2824) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else {
				local78 = false;
			}
		}
		if (local78) {
			if (arg1 > this.anInt2824) {
				this.anInt2822 += arg2;
				if (arg0 != 0 && this.anInt2822 > arg0) {
					this.anInt2822 = arg0;
				}
			} else {
				this.anInt2822 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt2822) {
					this.anInt2822 = -arg0;
				}
			}
			if (local8 != this.anInt2822) {
				local55 = this.anInt2822 * this.anInt2822 / (arg2 * 2);
				if (this.anInt2824 < arg1) {
					if (arg1 < local55 + this.anInt2824) {
						this.anInt2822 = local8;
					}
				} else if (arg1 < this.anInt2824 && this.anInt2824 - local55 < arg1) {
					this.anInt2822 = local8;
				}
			}
		} else if (this.anInt2822 <= 0) {
			this.anInt2822 += arg2;
			if (this.anInt2822 > 0) {
				this.anInt2822 = 0;
			}
		} else {
			this.anInt2822 -= arg2;
			if (this.anInt2822 < 0) {
				this.anInt2822 = 0;
			}
		}
		this.anInt2824 += local8 + this.anInt2822 >> 1;
		return local78;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I")
	public int method2484() {
		return this.anInt2824 & 0x3FFF;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public void method2485() {
		this.anInt2824 &= 0x3FFF;
	}
}
