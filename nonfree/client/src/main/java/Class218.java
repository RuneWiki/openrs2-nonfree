import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class218 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	private int anInt6582;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "I")
	public int anInt6583;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)I")
	public int method5310() {
		return this.anInt6583 & 0x3FFF;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	public void method5311() {
		this.anInt6583 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIZ)Z")
	public boolean method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt6582;
		if (this.anInt6583 == arg1 && this.anInt6582 == 0) {
			return false;
		}
		@Pc(70) boolean local70;
		@Pc(55) int local55;
		if (this.anInt6582 == 0) {
			if (this.anInt6583 < arg1 && this.anInt6583 + arg0 >= arg1 || this.anInt6583 > arg1 && arg1 >= this.anInt6583 - arg0) {
				this.anInt6583 = arg1;
				return false;
			}
			local70 = true;
		} else {
			@Pc(61) int local61;
			if (this.anInt6582 > 0 && arg1 > this.anInt6583) {
				local55 = this.anInt6582 * this.anInt6582 / (arg0 * 2);
				local61 = this.anInt6583 + local55;
				if (local61 < arg1 && this.anInt6583 <= local61) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else if (this.anInt6582 < 0 && this.anInt6583 > arg1) {
				local55 = this.anInt6582 * this.anInt6582 / (arg0 * 2);
				local61 = this.anInt6583 - local55;
				if (local61 > arg1 && local61 <= this.anInt6583) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else {
				local70 = false;
			}
		}
		if (local70) {
			if (arg1 <= this.anInt6583) {
				this.anInt6582 -= arg0;
				if (arg2 != 0 && this.anInt6582 < -arg2) {
					this.anInt6582 = -arg2;
				}
			} else {
				this.anInt6582 += arg0;
				if (arg2 != 0 && arg2 < this.anInt6582) {
					this.anInt6582 = arg2;
				}
			}
			if (local8 != this.anInt6582) {
				local55 = this.anInt6582 * this.anInt6582 / (arg0 * 2);
				if (arg1 > this.anInt6583) {
					if (arg1 < local55 + this.anInt6583) {
						this.anInt6582 = local8;
					}
				} else if (arg1 < this.anInt6583 && arg1 > this.anInt6583 - local55) {
					this.anInt6582 = local8;
				}
			}
		} else if (this.anInt6582 <= 0) {
			this.anInt6582 += arg0;
			if (this.anInt6582 > 0) {
				this.anInt6582 = 0;
			}
		} else {
			this.anInt6582 -= arg0;
			if (this.anInt6582 < 0) {
				this.anInt6582 = 0;
			}
		}
		this.anInt6583 += local8 + this.anInt6582 >> 1;
		return local70;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V")
	public void method5313(@OriginalArg(0) int arg0) {
		this.anInt6583 = arg0;
		this.anInt6582 = 0;
	}
}
