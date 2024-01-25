import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class32 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	private int anInt738;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public void method769() {
		this.anInt740 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIB)Z")
	public boolean method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt738;
		if (this.anInt740 == arg0 && this.anInt738 == 0) {
			return false;
		}
		@Pc(71) boolean local71;
		@Pc(48) int local48;
		if (this.anInt738 == 0) {
			if (this.anInt740 < arg0 && arg0 <= this.anInt740 + arg2 || this.anInt740 > arg0 && arg0 >= this.anInt740 - arg2) {
				this.anInt740 = arg0;
				return false;
			}
			local71 = true;
		} else {
			@Pc(54) int local54;
			if (this.anInt738 > 0 && this.anInt740 < arg0) {
				local48 = this.anInt738 * this.anInt738 / (arg2 * 2);
				local54 = local48 + this.anInt740;
				if (arg0 > local54 && local54 >= this.anInt740) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else if (this.anInt738 < 0 && this.anInt740 > arg0) {
				local48 = this.anInt738 * this.anInt738 / (arg2 * 2);
				local54 = this.anInt740 - local48;
				if (arg0 < local54 && this.anInt740 >= local54) {
					local71 = true;
				} else {
					local71 = false;
				}
			} else {
				local71 = false;
			}
		}
		if (local71) {
			if (this.anInt740 < arg0) {
				this.anInt738 += arg2;
				if (arg1 != 0 && arg1 < this.anInt738) {
					this.anInt738 = arg1;
				}
			} else {
				this.anInt738 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt738) {
					this.anInt738 = -arg1;
				}
			}
			if (this.anInt738 != local8) {
				local48 = this.anInt738 * this.anInt738 / (arg2 * 2);
				if (arg0 <= this.anInt740) {
					if (this.anInt740 > arg0 && this.anInt740 - local48 < arg0) {
						this.anInt738 = local8;
					}
				} else if (arg0 < local48 + this.anInt740) {
					this.anInt738 = local8;
				}
			}
		} else if (this.anInt738 > 0) {
			this.anInt738 -= arg2;
			if (this.anInt738 < 0) {
				this.anInt738 = 0;
			}
		} else {
			this.anInt738 += arg2;
			if (this.anInt738 > 0) {
				this.anInt738 = 0;
			}
		}
		this.anInt740 += this.anInt738 + local8 >> 1;
		return local71;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public void method771(@OriginalArg(1) int arg0) {
		this.anInt740 = arg0;
		this.anInt738 = 0;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)I")
	public int method773() {
		return this.anInt740 & 0x3FFF;
	}
}
