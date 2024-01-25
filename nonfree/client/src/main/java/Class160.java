import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class160 {

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	public int anInt4763;

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
	private int anInt4765;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)V")
	public void method3874(@OriginalArg(1) int arg0) {
		this.anInt4763 = arg0;
		this.anInt4765 = 0;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	public void method3875() {
		this.anInt4763 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIB)Z")
	public boolean method3876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anInt4765;
		if (this.anInt4763 == arg2 && this.anInt4765 == 0) {
			return false;
		}
		@Pc(61) boolean local61;
		@Pc(38) int local38;
		if (this.anInt4765 == 0) {
			if (this.anInt4763 < arg2 && arg2 <= arg1 + this.anInt4763 || arg2 < this.anInt4763 && this.anInt4763 - arg1 <= arg2) {
				this.anInt4763 = arg2;
				return false;
			}
			local61 = true;
		} else {
			@Pc(44) int local44;
			if (this.anInt4765 > 0 && arg2 > this.anInt4763) {
				local38 = this.anInt4765 * this.anInt4765 / (arg1 * 2);
				local44 = this.anInt4763 + local38;
				if (arg2 > local44 && local44 >= this.anInt4763) {
					local61 = true;
				} else {
					local61 = false;
				}
			} else if (this.anInt4765 < 0 && this.anInt4763 > arg2) {
				local38 = this.anInt4765 * this.anInt4765 / (arg1 * 2);
				local44 = this.anInt4763 - local38;
				if (arg2 < local44 && this.anInt4763 >= local44) {
					local61 = true;
				} else {
					local61 = false;
				}
			} else {
				local61 = false;
			}
		}
		if (local61) {
			if (arg2 <= this.anInt4763) {
				this.anInt4765 -= arg1;
				if (arg0 != 0 && this.anInt4765 < -arg0) {
					this.anInt4765 = -arg0;
				}
			} else {
				this.anInt4765 += arg1;
				if (arg0 != 0 && this.anInt4765 > arg0) {
					this.anInt4765 = arg0;
				}
			}
			if (this.anInt4765 != local6) {
				local38 = this.anInt4765 * this.anInt4765 / (arg1 * 2);
				if (this.anInt4763 < arg2) {
					if (this.anInt4763 + local38 > arg2) {
						this.anInt4765 = local6;
					}
				} else if (arg2 < this.anInt4763 && this.anInt4763 - local38 < arg2) {
					this.anInt4765 = local6;
				}
			}
		} else if (this.anInt4765 <= 0) {
			this.anInt4765 += arg1;
			if (this.anInt4765 > 0) {
				this.anInt4765 = 0;
			}
		} else {
			this.anInt4765 -= arg1;
			if (this.anInt4765 < 0) {
				this.anInt4765 = 0;
			}
		}
		this.anInt4763 += local6 + this.anInt4765 >> 1;
		return local61;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)I")
	public int method3877() {
		return this.anInt4763 & 0x3FFF;
	}
}
