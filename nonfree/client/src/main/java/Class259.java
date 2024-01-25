import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class259 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public int anInt7038;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	private int anInt7043;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public void method5912() {
		this.anInt7038 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
	public int method5914() {
		return this.anInt7038 & 0x3FFF;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)Z")
	public boolean method5916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7043;
		if (arg1 == this.anInt7038 && this.anInt7043 == 0) {
			return false;
		}
		@Pc(65) boolean local65;
		@Pc(87) int local87;
		if (this.anInt7043 == 0) {
			if (arg1 > this.anInt7038 && arg0 + this.anInt7038 >= arg1 || this.anInt7038 > arg1 && arg1 >= this.anInt7038 - arg0) {
				this.anInt7038 = arg1;
				return false;
			}
			local65 = true;
		} else {
			@Pc(92) int local92;
			if (this.anInt7043 > 0 && arg1 > this.anInt7038) {
				local87 = this.anInt7043 * this.anInt7043 / (arg0 * 2);
				local92 = local87 + this.anInt7038;
				if (local92 < arg1 && local92 >= this.anInt7038) {
					local65 = true;
				} else {
					local65 = false;
				}
			} else if (this.anInt7043 < 0 && arg1 < this.anInt7038) {
				local87 = this.anInt7043 * this.anInt7043 / (arg0 * 2);
				local92 = this.anInt7038 - local87;
				if (local92 > arg1 && local92 <= this.anInt7038) {
					local65 = true;
				} else {
					local65 = false;
				}
			} else {
				local65 = false;
			}
		}
		if (local65) {
			if (arg1 <= this.anInt7038) {
				this.anInt7043 -= arg0;
				if (arg2 != 0 && this.anInt7043 < -arg2) {
					this.anInt7043 = -arg2;
				}
			} else {
				this.anInt7043 += arg0;
				if (arg2 != 0 && this.anInt7043 > arg2) {
					this.anInt7043 = arg2;
				}
			}
			if (local8 != this.anInt7043) {
				local87 = this.anInt7043 * this.anInt7043 / (arg0 * 2);
				if (arg1 > this.anInt7038) {
					if (this.anInt7038 + local87 > arg1) {
						this.anInt7043 = local8;
					}
				} else if (this.anInt7038 > arg1 && this.anInt7038 - local87 < arg1) {
					this.anInt7043 = local8;
				}
			}
		} else if (this.anInt7043 <= 0) {
			this.anInt7043 += arg0;
			if (this.anInt7043 > 0) {
				this.anInt7043 = 0;
			}
		} else {
			this.anInt7043 -= arg0;
			if (this.anInt7043 < 0) {
				this.anInt7043 = 0;
			}
		}
		this.anInt7038 += local8 + this.anInt7043 >> 1;
		return local65;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public void method5917(@OriginalArg(1) int arg0) {
		this.anInt7043 = 0;
		this.anInt7038 = arg0;
	}
}
