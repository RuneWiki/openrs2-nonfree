import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class293 {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public int anInt7901;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	private int anInt7906;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
	public void method6525(@OriginalArg(1) int arg0) {
		this.anInt7901 = arg0;
		this.anInt7906 = 0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)Z")
	public boolean method6526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt7906;
		if (arg2 == this.anInt7901 && this.anInt7906 == 0) {
			return false;
		}
		@Pc(74) boolean local74;
		@Pc(118) int local118;
		if (this.anInt7906 == 0) {
			if (arg2 > this.anInt7901 && arg2 <= this.anInt7901 + arg1 || this.anInt7901 > arg2 && this.anInt7901 - arg1 <= arg2) {
				this.anInt7901 = arg2;
				return false;
			}
			local74 = true;
		} else {
			@Pc(124) int local124;
			if (this.anInt7906 > 0 && arg2 > this.anInt7901) {
				local118 = this.anInt7906 * this.anInt7906 / (arg1 * 2);
				local124 = local118 + this.anInt7901;
				if (arg2 > local124 && this.anInt7901 <= local124) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else if (this.anInt7906 < 0 && arg2 < this.anInt7901) {
				local118 = this.anInt7906 * this.anInt7906 / (arg1 * 2);
				local124 = this.anInt7901 - local118;
				if (local124 > arg2 && this.anInt7901 >= local124) {
					local74 = true;
				} else {
					local74 = false;
				}
			} else {
				local74 = false;
			}
		}
		if (local74) {
			if (this.anInt7901 < arg2) {
				this.anInt7906 += arg1;
				if (arg0 != 0 && this.anInt7906 > arg0) {
					this.anInt7906 = arg0;
				}
			} else {
				this.anInt7906 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt7906) {
					this.anInt7906 = -arg0;
				}
			}
			if (this.anInt7906 != local8) {
				local118 = this.anInt7906 * this.anInt7906 / (arg1 * 2);
				if (arg2 > this.anInt7901) {
					if (arg2 < local118 + this.anInt7901) {
						this.anInt7906 = local8;
					}
				} else if (arg2 < this.anInt7901 && arg2 > this.anInt7901 - local118) {
					this.anInt7906 = local8;
				}
			}
		} else if (this.anInt7906 <= 0) {
			this.anInt7906 += arg1;
			if (this.anInt7906 > 0) {
				this.anInt7906 = 0;
			}
		} else {
			this.anInt7906 -= arg1;
			if (this.anInt7906 < 0) {
				this.anInt7906 = 0;
			}
		}
		this.anInt7901 += this.anInt7906 + local8 >> 1;
		return local74;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public void method6527() {
		this.anInt7901 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I")
	public int method6528() {
		return this.anInt7901 & 0x3FFF;
	}
}
