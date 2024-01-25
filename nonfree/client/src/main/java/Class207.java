import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class207 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public int anInt6598;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
	private int anInt6603;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)I")
	public int method5877() {
		return this.anInt6598 & 0x3FFF;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
	public void method5878() {
		this.anInt6598 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public void method5880(@OriginalArg(0) int arg0) {
		this.anInt6598 = arg0;
		this.anInt6603 = 0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIBI)Z")
	public boolean method5882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt6603;
		if (this.anInt6598 == arg0 && this.anInt6603 == 0) {
			return false;
		}
		@Pc(87) boolean local87;
		@Pc(68) int local68;
		if (this.anInt6603 == 0) {
			if (this.anInt6598 < arg0 && this.anInt6598 + arg2 >= arg0 || arg0 < this.anInt6598 && arg0 >= this.anInt6598 - arg2) {
				this.anInt6598 = arg0;
				return false;
			}
			local87 = true;
		} else {
			@Pc(74) int local74;
			if (this.anInt6603 > 0 && this.anInt6598 < arg0) {
				local68 = this.anInt6603 * this.anInt6603 / (arg2 * 2);
				local74 = local68 + this.anInt6598;
				if (local74 < arg0 && this.anInt6598 <= local74) {
					local87 = true;
				} else {
					local87 = false;
				}
			} else if (this.anInt6603 < 0 && arg0 < this.anInt6598) {
				local68 = this.anInt6603 * this.anInt6603 / (arg2 * 2);
				local74 = this.anInt6598 - local68;
				if (arg0 < local74 && local74 <= this.anInt6598) {
					local87 = true;
				} else {
					local87 = false;
				}
			} else {
				local87 = false;
			}
		}
		if (local87) {
			if (this.anInt6598 >= arg0) {
				this.anInt6603 -= arg2;
				if (arg1 != 0 && this.anInt6603 < -arg1) {
					this.anInt6603 = -arg1;
				}
			} else {
				this.anInt6603 += arg2;
				if (arg1 != 0 && this.anInt6603 > arg1) {
					this.anInt6603 = arg1;
				}
			}
			if (this.anInt6603 != local6) {
				local68 = this.anInt6603 * this.anInt6603 / (arg2 * 2);
				if (this.anInt6598 >= arg0) {
					if (this.anInt6598 > arg0 && this.anInt6598 - local68 < arg0) {
						this.anInt6603 = local6;
					}
				} else if (arg0 < this.anInt6598 + local68) {
					this.anInt6603 = local6;
				}
			}
		} else if (this.anInt6603 > 0) {
			this.anInt6603 -= arg2;
			if (this.anInt6603 < 0) {
				this.anInt6603 = 0;
			}
		} else {
			this.anInt6603 += arg2;
			if (this.anInt6603 > 0) {
				this.anInt6603 = 0;
			}
		}
		this.anInt6598 += local6 + this.anInt6603 >> 1;
		return local87;
	}
}
