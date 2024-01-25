import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class155 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public int anInt4352;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	private int anInt4355;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)Z")
	public boolean method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4355;
		if (arg0 == this.anInt4352 && this.anInt4355 == 0) {
			return false;
		}
		@Pc(70) boolean local70;
		@Pc(52) int local52;
		if (this.anInt4355 == 0) {
			if (this.anInt4352 < arg0 && arg0 <= this.anInt4352 + arg2 || this.anInt4352 > arg0 && arg0 >= this.anInt4352 - arg2) {
				this.anInt4352 = arg0;
				return false;
			}
			local70 = true;
		} else {
			@Pc(57) int local57;
			if (this.anInt4355 > 0 && this.anInt4352 < arg0) {
				local52 = this.anInt4355 * this.anInt4355 / (arg2 * 2);
				local57 = local52 + this.anInt4352;
				if (local57 < arg0 && local57 >= this.anInt4352) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else if (this.anInt4355 < 0 && this.anInt4352 > arg0) {
				local52 = this.anInt4355 * this.anInt4355 / (arg2 * 2);
				local57 = this.anInt4352 - local52;
				if (arg0 < local57 && local57 <= this.anInt4352) {
					local70 = true;
				} else {
					local70 = false;
				}
			} else {
				local70 = false;
			}
		}
		if (local70) {
			if (arg0 <= this.anInt4352) {
				this.anInt4355 -= arg2;
				if (arg1 != 0 && this.anInt4355 < -arg1) {
					this.anInt4355 = -arg1;
				}
			} else {
				this.anInt4355 += arg2;
				if (arg1 != 0 && this.anInt4355 > arg1) {
					this.anInt4355 = arg1;
				}
			}
			if (local8 != this.anInt4355) {
				local52 = this.anInt4355 * this.anInt4355 / (arg2 * 2);
				if (arg0 <= this.anInt4352) {
					if (arg0 < this.anInt4352 && arg0 > this.anInt4352 - local52) {
						this.anInt4355 = local8;
					}
				} else if (arg0 < local52 + this.anInt4352) {
					this.anInt4355 = local8;
				}
			}
		} else if (this.anInt4355 > 0) {
			this.anInt4355 -= arg2;
			if (this.anInt4355 < 0) {
				this.anInt4355 = 0;
			}
		} else {
			this.anInt4355 += arg2;
			if (this.anInt4355 > 0) {
				this.anInt4355 = 0;
			}
		}
		this.anInt4352 += this.anInt4355 + local8 >> 1;
		return local70;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public void method3694() {
		this.anInt4352 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public int method3695() {
		return this.anInt4352 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public void method3696(@OriginalArg(0) int arg0) {
		this.anInt4352 = arg0;
		this.anInt4355 = 0;
	}
}
