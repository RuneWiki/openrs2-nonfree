import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class178 {

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	private int anInt4190;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt4197;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
	public int method3799() {
		return this.anInt4197 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
	public void method3802(@OriginalArg(1) int arg0) {
		this.anInt4197 = arg0;
		this.anInt4190 = 0;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method3804() {
		this.anInt4197 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIBI)Z")
	public boolean method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.anInt4190;
		if (arg2 == this.anInt4197 && this.anInt4190 == 0) {
			return false;
		}
		@Pc(105) boolean local105;
		@Pc(80) int local80;
		if (this.anInt4190 == 0) {
			if (arg2 > this.anInt4197 && arg2 <= arg1 + this.anInt4197 || this.anInt4197 > arg2 && arg2 >= this.anInt4197 - arg1) {
				this.anInt4197 = arg2;
				return false;
			}
			local105 = true;
		} else {
			@Pc(86) int local86;
			if (this.anInt4190 > 0 && arg2 > this.anInt4197) {
				local80 = this.anInt4190 * this.anInt4190 / (arg1 * 2);
				local86 = this.anInt4197 + local80;
				if (arg2 > local86 && local86 >= this.anInt4197) {
					local105 = true;
				} else {
					local105 = false;
				}
			} else if (this.anInt4190 < 0 && arg2 < this.anInt4197) {
				local80 = this.anInt4190 * this.anInt4190 / (arg1 * 2);
				local86 = this.anInt4197 - local80;
				if (arg2 < local86 && local86 <= this.anInt4197) {
					local105 = true;
				} else {
					local105 = false;
				}
			} else {
				local105 = false;
			}
		}
		if (local105) {
			if (this.anInt4197 < arg2) {
				this.anInt4190 += arg1;
				if (arg0 != 0 && this.anInt4190 > arg0) {
					this.anInt4190 = arg0;
				}
			} else {
				this.anInt4190 -= arg1;
				if (arg0 != 0 && this.anInt4190 < -arg0) {
					this.anInt4190 = -arg0;
				}
			}
			if (local16 != this.anInt4190) {
				local80 = this.anInt4190 * this.anInt4190 / (arg1 * 2);
				if (arg2 <= this.anInt4197) {
					if (arg2 < this.anInt4197 && arg2 > this.anInt4197 - local80) {
						this.anInt4190 = local16;
					}
				} else if (arg2 < this.anInt4197 + local80) {
					this.anInt4190 = local16;
				}
			}
		} else if (this.anInt4190 > 0) {
			this.anInt4190 -= arg1;
			if (this.anInt4190 < 0) {
				this.anInt4190 = 0;
			}
		} else {
			this.anInt4190 += arg1;
			if (this.anInt4190 > 0) {
				this.anInt4190 = 0;
			}
		}
		this.anInt4197 += local16 + this.anInt4190 >> 1;
		return local105;
	}
}
