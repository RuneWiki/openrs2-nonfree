import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class252 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	private int anInt7294;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public int anInt7295;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	public void method5711(@OriginalArg(1) int arg0) {
		this.anInt7294 = 0;
		this.anInt7295 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public void method5712() {
		this.anInt7295 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Z")
	public boolean method5713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7294;
		if (arg2 == this.anInt7295 && this.anInt7294 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(92) int local92;
		if (this.anInt7294 == 0) {
			if (arg2 > this.anInt7295 && arg0 + this.anInt7295 >= arg2 || this.anInt7295 > arg2 && this.anInt7295 - arg0 <= arg2) {
				this.anInt7295 = arg2;
				return false;
			}
			local59 = true;
		} else {
			@Pc(98) int local98;
			if (this.anInt7294 > 0 && this.anInt7295 < arg2) {
				local92 = this.anInt7294 * this.anInt7294 / (arg0 * 2);
				local98 = local92 + this.anInt7295;
				if (arg2 > local98 && this.anInt7295 <= local98) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt7294 < 0 && this.anInt7295 > arg2) {
				local92 = this.anInt7294 * this.anInt7294 / (arg0 * 2);
				local98 = this.anInt7295 - local92;
				if (arg2 < local98 && local98 <= this.anInt7295) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (arg2 <= this.anInt7295) {
				this.anInt7294 -= arg0;
				if (arg1 != 0 && this.anInt7294 < -arg1) {
					this.anInt7294 = -arg1;
				}
			} else {
				this.anInt7294 += arg0;
				if (arg1 != 0 && arg1 < this.anInt7294) {
					this.anInt7294 = arg1;
				}
			}
			if (this.anInt7294 != local8) {
				local92 = this.anInt7294 * this.anInt7294 / (arg0 * 2);
				if (this.anInt7295 < arg2) {
					if (local92 + this.anInt7295 > arg2) {
						this.anInt7294 = local8;
					}
				} else if (this.anInt7295 > arg2 && arg2 > this.anInt7295 - local92) {
					this.anInt7294 = local8;
				}
			}
		} else if (this.anInt7294 > 0) {
			this.anInt7294 -= arg0;
			if (this.anInt7294 < 0) {
				this.anInt7294 = 0;
			}
		} else {
			this.anInt7294 += arg0;
			if (this.anInt7294 > 0) {
				this.anInt7294 = 0;
			}
		}
		this.anInt7295 += local8 + this.anInt7294 >> 1;
		return local59;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
	public int method5714() {
		return this.anInt7295 & 0x3FFF;
	}
}
