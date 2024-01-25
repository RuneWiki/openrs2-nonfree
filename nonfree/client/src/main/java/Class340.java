import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class340 {

	@OriginalMember(owner = "client!sja", name = "e", descriptor = "I")
	public int anInt9603;

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "I")
	private int anInt9604;

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IIII)Z")
	public boolean method8084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt9604;
		if (arg0 == this.anInt9603 && this.anInt9604 == 0) {
			return false;
		}
		@Pc(78) boolean local78;
		@Pc(119) int local119;
		if (this.anInt9604 == 0) {
			if (this.anInt9603 < arg0 && arg0 <= arg2 + this.anInt9603 || arg0 < this.anInt9603 && this.anInt9603 - arg2 <= arg0) {
				this.anInt9603 = arg0;
				return false;
			}
			local78 = true;
		} else {
			@Pc(125) int local125;
			if (this.anInt9604 > 0 && this.anInt9603 < arg0) {
				local119 = this.anInt9604 * this.anInt9604 / (arg2 * 2);
				local125 = this.anInt9603 + local119;
				if (arg0 > local125 && this.anInt9603 <= local125) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else if (this.anInt9604 < 0 && arg0 < this.anInt9603) {
				local119 = this.anInt9604 * this.anInt9604 / (arg2 * 2);
				local125 = this.anInt9603 - local119;
				if (arg0 < local125 && this.anInt9603 >= local125) {
					local78 = true;
				} else {
					local78 = false;
				}
			} else {
				local78 = false;
			}
		}
		if (local78) {
			if (this.anInt9603 >= arg0) {
				this.anInt9604 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt9604) {
					this.anInt9604 = -arg1;
				}
			} else {
				this.anInt9604 += arg2;
				if (arg1 != 0 && arg1 < this.anInt9604) {
					this.anInt9604 = arg1;
				}
			}
			if (this.anInt9604 != local8) {
				local119 = this.anInt9604 * this.anInt9604 / (arg2 * 2);
				if (arg0 > this.anInt9603) {
					if (this.anInt9603 + local119 > arg0) {
						this.anInt9604 = local8;
					}
				} else if (this.anInt9603 > arg0 && this.anInt9603 - local119 < arg0) {
					this.anInt9604 = local8;
				}
			}
		} else if (this.anInt9604 > 0) {
			this.anInt9604 -= arg2;
			if (this.anInt9604 < 0) {
				this.anInt9604 = 0;
			}
		} else {
			this.anInt9604 += arg2;
			if (this.anInt9604 > 0) {
				this.anInt9604 = 0;
			}
		}
		this.anInt9603 += local8 + this.anInt9604 >> 1;
		return local78;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)I")
	public int method8085() {
		return this.anInt9603 & 0x3FFF;
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(I)V")
	public void method8086() {
		this.anInt9603 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(II)V")
	public void method8088(@OriginalArg(0) int arg0) {
		this.anInt9604 = 0;
		this.anInt9603 = arg0;
	}
}
