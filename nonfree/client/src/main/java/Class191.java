import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class191 {

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	private int anInt4888;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I")
	public int method4332() {
		return this.anInt4886 & 0x3FFF;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BIII)Z")
	public boolean method4334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = this.anInt4888;
		if (arg0 == this.anInt4886 && this.anInt4888 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(52) int local52;
		if (this.anInt4888 == 0) {
			if (arg0 > this.anInt4886 && arg0 <= arg1 + this.anInt4886 || this.anInt4886 > arg0 && this.anInt4886 - arg1 <= arg0) {
				this.anInt4886 = arg0;
				return false;
			}
			local66 = true;
		} else {
			@Pc(57) int local57;
			if (this.anInt4888 > 0 && this.anInt4886 < arg0) {
				local52 = this.anInt4888 * this.anInt4888 / (arg1 * 2);
				local57 = local52 + this.anInt4886;
				if (arg0 > local57 && local57 >= this.anInt4886) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt4888 < 0 && arg0 < this.anInt4886) {
				local52 = this.anInt4888 * this.anInt4888 / (arg1 * 2);
				local57 = this.anInt4886 - local52;
				if (local57 > arg0 && local57 <= this.anInt4886) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (arg0 > this.anInt4886) {
				this.anInt4888 += arg1;
				if (arg2 != 0 && arg2 < this.anInt4888) {
					this.anInt4888 = arg2;
				}
			} else {
				this.anInt4888 -= arg1;
				if (arg2 != 0 && this.anInt4888 < -arg2) {
					this.anInt4888 = -arg2;
				}
			}
			if (local13 != this.anInt4888) {
				local52 = this.anInt4888 * this.anInt4888 / (arg1 * 2);
				if (this.anInt4886 >= arg0) {
					if (arg0 < this.anInt4886 && arg0 > this.anInt4886 - local52) {
						this.anInt4888 = local13;
					}
				} else if (arg0 < this.anInt4886 + local52) {
					this.anInt4888 = local13;
				}
			}
		} else if (this.anInt4888 > 0) {
			this.anInt4888 -= arg1;
			if (this.anInt4888 < 0) {
				this.anInt4888 = 0;
			}
		} else {
			this.anInt4888 += arg1;
			if (this.anInt4888 > 0) {
				this.anInt4888 = 0;
			}
		}
		this.anInt4886 += this.anInt4888 + local13 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public void method4336() {
		this.anInt4886 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IZ)V")
	public void method4337(@OriginalArg(0) int arg0) {
		this.anInt4886 = arg0;
		this.anInt4888 = 0;
	}
}
