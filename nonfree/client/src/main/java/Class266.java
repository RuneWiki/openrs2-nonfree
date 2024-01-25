import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class266 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	public int anInt7236;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	private int anInt7240;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public void method5716(@OriginalArg(1) int arg0) {
		this.anInt7240 = 0;
		this.anInt7236 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z")
	public boolean method5717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7240;
		if (this.anInt7236 == arg1 && this.anInt7240 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(82) int local82;
		if (this.anInt7240 == 0) {
			if (this.anInt7236 < arg1 && this.anInt7236 + arg2 >= arg1 || this.anInt7236 > arg1 && arg1 >= this.anInt7236 - arg2) {
				this.anInt7236 = arg1;
				return false;
			}
			local59 = true;
		} else {
			@Pc(87) int local87;
			if (this.anInt7240 > 0 && this.anInt7236 < arg1) {
				local82 = this.anInt7240 * this.anInt7240 / (arg2 * 2);
				local87 = local82 + this.anInt7236;
				if (arg1 > local87 && this.anInt7236 <= local87) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt7240 < 0 && arg1 < this.anInt7236) {
				local82 = this.anInt7240 * this.anInt7240 / (arg2 * 2);
				local87 = this.anInt7236 - local82;
				if (arg1 < local87 && local87 <= this.anInt7236) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (this.anInt7236 < arg1) {
				this.anInt7240 += arg2;
				if (arg0 != 0 && arg0 < this.anInt7240) {
					this.anInt7240 = arg0;
				}
			} else {
				this.anInt7240 -= arg2;
				if (arg0 != 0 && -arg0 > this.anInt7240) {
					this.anInt7240 = -arg0;
				}
			}
			if (this.anInt7240 != local8) {
				local82 = this.anInt7240 * this.anInt7240 / (arg2 * 2);
				if (this.anInt7236 >= arg1) {
					if (arg1 < this.anInt7236 && arg1 > this.anInt7236 - local82) {
						this.anInt7240 = local8;
					}
				} else if (arg1 < this.anInt7236 + local82) {
					this.anInt7240 = local8;
				}
			}
		} else if (this.anInt7240 <= 0) {
			this.anInt7240 += arg2;
			if (this.anInt7240 > 0) {
				this.anInt7240 = 0;
			}
		} else {
			this.anInt7240 -= arg2;
			if (this.anInt7240 < 0) {
				this.anInt7240 = 0;
			}
		}
		this.anInt7236 += this.anInt7240 + local8 >> 1;
		return local59;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	public int method5718() {
		return this.anInt7236 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public void method5720() {
		this.anInt7236 &= 0x3FFF;
	}
}
