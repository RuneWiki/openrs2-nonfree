import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class146 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	private int anInt4509;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public int anInt4511;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public void method3940(@OriginalArg(1) int arg0) {
		this.anInt4511 = arg0;
		this.anInt4509 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Z")
	public boolean method3941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt4509;
		if (arg2 == this.anInt4511 && this.anInt4509 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(87) int local87;
		if (this.anInt4509 == 0) {
			if (this.anInt4511 < arg2 && this.anInt4511 + arg0 >= arg2 || this.anInt4511 > arg2 && this.anInt4511 - arg0 <= arg2) {
				this.anInt4511 = arg2;
				return false;
			}
			local69 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt4509 > 0 && arg2 > this.anInt4511) {
				local87 = this.anInt4509 * this.anInt4509 / (arg0 * 2);
				local93 = this.anInt4511 + local87;
				if (arg2 > local93 && local93 >= this.anInt4511) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt4509 < 0 && arg2 < this.anInt4511) {
				local87 = this.anInt4509 * this.anInt4509 / (arg0 * 2);
				local93 = this.anInt4511 - local87;
				if (local93 > arg2 && this.anInt4511 >= local93) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (arg2 <= this.anInt4511) {
				this.anInt4509 -= arg0;
				if (arg1 != 0 && -arg1 > this.anInt4509) {
					this.anInt4509 = -arg1;
				}
			} else {
				this.anInt4509 += arg0;
				if (arg1 != 0 && this.anInt4509 > arg1) {
					this.anInt4509 = arg1;
				}
			}
			if (local6 != this.anInt4509) {
				local87 = this.anInt4509 * this.anInt4509 / (arg0 * 2);
				if (arg2 <= this.anInt4511) {
					if (arg2 < this.anInt4511 && arg2 > this.anInt4511 - local87) {
						this.anInt4509 = local6;
					}
				} else if (this.anInt4511 + local87 > arg2) {
					this.anInt4509 = local6;
				}
			}
		} else if (this.anInt4509 > 0) {
			this.anInt4509 -= arg0;
			if (this.anInt4509 < 0) {
				this.anInt4509 = 0;
			}
		} else {
			this.anInt4509 += arg0;
			if (this.anInt4509 > 0) {
				this.anInt4509 = 0;
			}
		}
		this.anInt4511 += local6 + this.anInt4509 >> 1;
		return local69;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I")
	public int method3943() {
		return this.anInt4511 & 0x3FFF;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public void method3944() {
		this.anInt4511 &= 0x3FFF;
	}
}
