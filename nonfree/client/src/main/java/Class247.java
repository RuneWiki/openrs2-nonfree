import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class247 {

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	private int anInt6564;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	public int anInt6566;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public void method5625() {
		this.anInt6566 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)Z")
	public boolean method5627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = this.anInt6564;
		if (this.anInt6566 == arg0 && this.anInt6564 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(48) int local48;
		if (this.anInt6564 == 0) {
			if (arg0 > this.anInt6566 && arg1 + this.anInt6566 >= arg0 || this.anInt6566 > arg0 && this.anInt6566 - arg1 <= arg0) {
				this.anInt6566 = arg0;
				return false;
			}
			local66 = true;
		} else {
			@Pc(53) int local53;
			if (this.anInt6564 > 0 && this.anInt6566 < arg0) {
				local48 = this.anInt6564 * this.anInt6564 / (arg1 * 2);
				local53 = this.anInt6566 + local48;
				if (arg0 > local53 && local53 >= this.anInt6566) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt6564 < 0 && this.anInt6566 > arg0) {
				local48 = this.anInt6564 * this.anInt6564 / (arg1 * 2);
				local53 = this.anInt6566 - local48;
				if (arg0 < local53 && this.anInt6566 >= local53) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (arg0 > this.anInt6566) {
				this.anInt6564 += arg1;
				if (arg2 != 0 && arg2 < this.anInt6564) {
					this.anInt6564 = arg2;
				}
			} else {
				this.anInt6564 -= arg1;
				if (arg2 != 0 && this.anInt6564 < -arg2) {
					this.anInt6564 = -arg2;
				}
			}
			if (local16 != this.anInt6564) {
				local48 = this.anInt6564 * this.anInt6564 / (arg1 * 2);
				if (this.anInt6566 < arg0) {
					if (this.anInt6566 + local48 > arg0) {
						this.anInt6564 = local16;
					}
				} else if (this.anInt6566 > arg0 && arg0 > this.anInt6566 - local48) {
					this.anInt6564 = local16;
				}
			}
		} else if (this.anInt6564 <= 0) {
			this.anInt6564 += arg1;
			if (this.anInt6564 > 0) {
				this.anInt6564 = 0;
			}
		} else {
			this.anInt6564 -= arg1;
			if (this.anInt6564 < 0) {
				this.anInt6564 = 0;
			}
		}
		this.anInt6566 += local16 + this.anInt6564 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
	public int method5629() {
		return this.anInt6566 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
	public void method5631(@OriginalArg(0) int arg0) {
		this.anInt6566 = arg0;
		this.anInt6564 = 0;
	}
}
