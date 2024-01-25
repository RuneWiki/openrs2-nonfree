import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class365 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
	public int anInt9846;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
	private int anInt9853;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)I")
	public int method8385() {
		return this.anInt9846 & 0x3FFF;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIBI)Z")
	public boolean method8386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt9853;
		if (arg2 == this.anInt9846 && this.anInt9853 == 0) {
			return false;
		}
		@Pc(89) boolean local89;
		@Pc(72) int local72;
		if (this.anInt9853 == 0) {
			if (arg2 > this.anInt9846 && arg2 <= arg1 + this.anInt9846 || arg2 < this.anInt9846 && this.anInt9846 - arg1 <= arg2) {
				this.anInt9846 = arg2;
				return false;
			}
			local89 = true;
		} else {
			@Pc(78) int local78;
			if (this.anInt9853 > 0 && this.anInt9846 < arg2) {
				local72 = this.anInt9853 * this.anInt9853 / (arg1 * 2);
				local78 = local72 + this.anInt9846;
				if (local78 < arg2 && this.anInt9846 <= local78) {
					local89 = true;
				} else {
					local89 = false;
				}
			} else if (this.anInt9853 < 0 && arg2 < this.anInt9846) {
				local72 = this.anInt9853 * this.anInt9853 / (arg1 * 2);
				local78 = this.anInt9846 - local72;
				if (arg2 < local78 && this.anInt9846 >= local78) {
					local89 = true;
				} else {
					local89 = false;
				}
			} else {
				local89 = false;
			}
		}
		if (local89) {
			if (arg2 > this.anInt9846) {
				this.anInt9853 += arg1;
				if (arg0 != 0 && this.anInt9853 > arg0) {
					this.anInt9853 = arg0;
				}
			} else {
				this.anInt9853 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt9853) {
					this.anInt9853 = -arg0;
				}
			}
			if (local8 != this.anInt9853) {
				local72 = this.anInt9853 * this.anInt9853 / (arg1 * 2);
				if (arg2 <= this.anInt9846) {
					if (arg2 < this.anInt9846 && this.anInt9846 - local72 < arg2) {
						this.anInt9853 = local8;
					}
				} else if (local72 + this.anInt9846 > arg2) {
					this.anInt9853 = local8;
				}
			}
		} else if (this.anInt9853 <= 0) {
			this.anInt9853 += arg1;
			if (this.anInt9853 > 0) {
				this.anInt9853 = 0;
			}
		} else {
			this.anInt9853 -= arg1;
			if (this.anInt9853 < 0) {
				this.anInt9853 = 0;
			}
		}
		this.anInt9846 += local8 + this.anInt9853 >> 1;
		return local89;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	public void method8388(@OriginalArg(0) int arg0) {
		this.anInt9846 = arg0;
		this.anInt9853 = 0;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	public void method8391() {
		this.anInt9846 &= 0x3FFF;
	}
}
