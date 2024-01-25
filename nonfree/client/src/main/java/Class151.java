import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class151 {

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
	private int anInt4207;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
	public int anInt4209;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBII)Z")
	public boolean method3662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4207;
		if (arg1 == this.anInt4209 && this.anInt4207 == 0) {
			return false;
		}
		@Pc(57) boolean local57;
		@Pc(97) int local97;
		if (this.anInt4207 == 0) {
			if (this.anInt4209 < arg1 && this.anInt4209 + arg2 >= arg1 || this.anInt4209 > arg1 && this.anInt4209 - arg2 <= arg1) {
				this.anInt4209 = arg1;
				return false;
			}
			local57 = true;
		} else {
			@Pc(103) int local103;
			if (this.anInt4207 > 0 && this.anInt4209 < arg1) {
				local97 = this.anInt4207 * this.anInt4207 / (arg2 * 2);
				local103 = local97 + this.anInt4209;
				if (arg1 > local103 && this.anInt4209 <= local103) {
					local57 = true;
				} else {
					local57 = false;
				}
			} else if (this.anInt4207 < 0 && arg1 < this.anInt4209) {
				local97 = this.anInt4207 * this.anInt4207 / (arg2 * 2);
				local103 = this.anInt4209 - local97;
				if (arg1 < local103 && local103 <= this.anInt4209) {
					local57 = true;
				} else {
					local57 = false;
				}
			} else {
				local57 = false;
			}
		}
		if (local57) {
			if (this.anInt4209 < arg1) {
				this.anInt4207 += arg2;
				if (arg0 != 0 && this.anInt4207 > arg0) {
					this.anInt4207 = arg0;
				}
			} else {
				this.anInt4207 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt4207) {
					this.anInt4207 = -arg0;
				}
			}
			if (local8 != this.anInt4207) {
				local97 = this.anInt4207 * this.anInt4207 / (arg2 * 2);
				if (arg1 <= this.anInt4209) {
					if (arg1 < this.anInt4209 && this.anInt4209 - local97 < arg1) {
						this.anInt4207 = local8;
					}
				} else if (arg1 < local97 + this.anInt4209) {
					this.anInt4207 = local8;
				}
			}
		} else if (this.anInt4207 <= 0) {
			this.anInt4207 += arg2;
			if (this.anInt4207 > 0) {
				this.anInt4207 = 0;
			}
		} else {
			this.anInt4207 -= arg2;
			if (this.anInt4207 < 0) {
				this.anInt4207 = 0;
			}
		}
		this.anInt4209 += this.anInt4207 + local8 >> 1;
		return local57;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)V")
	public void method3663(@OriginalArg(1) int arg0) {
		this.anInt4209 = arg0;
		this.anInt4207 = 0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
	public int method3664() {
		return this.anInt4209 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
	public void method3665() {
		this.anInt4209 &= 0x3FFF;
	}
}
