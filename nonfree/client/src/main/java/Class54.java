import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class54 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public int anInt1603;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	private int anInt1610;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
	public int method1294() {
		return this.anInt1603 & 0x3FFF;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)V")
	public void method1295() {
		this.anInt1603 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)Z")
	public boolean method1297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt1610;
		if (this.anInt1603 == arg1 && this.anInt1610 == 0) {
			return false;
		}
		@Pc(85) boolean local85;
		@Pc(67) int local67;
		if (this.anInt1610 == 0) {
			if (this.anInt1603 < arg1 && this.anInt1603 + arg2 >= arg1 || this.anInt1603 > arg1 && arg1 >= this.anInt1603 - arg2) {
				this.anInt1603 = arg1;
				return false;
			}
			local85 = true;
		} else {
			@Pc(72) int local72;
			if (this.anInt1610 > 0 && this.anInt1603 < arg1) {
				local67 = this.anInt1610 * this.anInt1610 / (arg2 * 2);
				local72 = local67 + this.anInt1603;
				if (local72 < arg1 && local72 >= this.anInt1603) {
					local85 = true;
				} else {
					local85 = false;
				}
			} else if (this.anInt1610 < 0 && arg1 < this.anInt1603) {
				local67 = this.anInt1610 * this.anInt1610 / (arg2 * 2);
				local72 = this.anInt1603 - local67;
				if (local72 > arg1 && this.anInt1603 >= local72) {
					local85 = true;
				} else {
					local85 = false;
				}
			} else {
				local85 = false;
			}
		}
		if (local85) {
			if (this.anInt1603 < arg1) {
				this.anInt1610 += arg2;
				if (arg0 != 0 && arg0 < this.anInt1610) {
					this.anInt1610 = arg0;
				}
			} else {
				this.anInt1610 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt1610) {
					this.anInt1610 = -arg0;
				}
			}
			if (this.anInt1610 != local8) {
				local67 = this.anInt1610 * this.anInt1610 / (arg2 * 2);
				if (this.anInt1603 >= arg1) {
					if (arg1 < this.anInt1603 && this.anInt1603 - local67 < arg1) {
						this.anInt1610 = local8;
					}
				} else if (arg1 < this.anInt1603 + local67) {
					this.anInt1610 = local8;
				}
			}
		} else if (this.anInt1610 <= 0) {
			this.anInt1610 += arg2;
			if (this.anInt1610 > 0) {
				this.anInt1610 = 0;
			}
		} else {
			this.anInt1610 -= arg2;
			if (this.anInt1610 < 0) {
				this.anInt1610 = 0;
			}
		}
		this.anInt1603 += this.anInt1610 + local8 >> 1;
		return local85;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public void method1298(@OriginalArg(0) int arg0) {
		this.anInt1603 = arg0;
		this.anInt1610 = 0;
	}
}
