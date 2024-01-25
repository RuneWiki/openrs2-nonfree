import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class255 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
	public int anInt7406;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	private int anInt7410;

	static {
		new Class84("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
	public void method5744() {
		this.anInt7406 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	public void method5746(@OriginalArg(0) int arg0) {
		this.anInt7406 = arg0;
		this.anInt7410 = 0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)Z")
	public boolean method5748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7410;
		if (this.anInt7406 == arg1 && this.anInt7410 == 0) {
			return false;
		}
		@Pc(76) boolean local76;
		@Pc(98) int local98;
		if (this.anInt7410 == 0) {
			if (arg1 > this.anInt7406 && arg1 <= this.anInt7406 + arg2 || this.anInt7406 > arg1 && this.anInt7406 - arg2 <= arg1) {
				this.anInt7406 = arg1;
				return false;
			}
			local76 = true;
		} else {
			@Pc(103) int local103;
			if (this.anInt7410 > 0 && this.anInt7406 < arg1) {
				local98 = this.anInt7410 * this.anInt7410 / (arg2 * 2);
				local103 = this.anInt7406 + local98;
				if (arg1 > local103 && local103 >= this.anInt7406) {
					local76 = true;
				} else {
					local76 = false;
				}
			} else if (this.anInt7410 < 0 && this.anInt7406 > arg1) {
				local98 = this.anInt7410 * this.anInt7410 / (arg2 * 2);
				local103 = this.anInt7406 - local98;
				if (arg1 < local103 && local103 <= this.anInt7406) {
					local76 = true;
				} else {
					local76 = false;
				}
			} else {
				local76 = false;
			}
		}
		if (local76) {
			if (this.anInt7406 < arg1) {
				this.anInt7410 += arg2;
				if (arg0 != 0 && arg0 < this.anInt7410) {
					this.anInt7410 = arg0;
				}
			} else {
				this.anInt7410 -= arg2;
				if (arg0 != 0 && this.anInt7410 < -arg0) {
					this.anInt7410 = -arg0;
				}
			}
			if (this.anInt7410 != local8) {
				local98 = this.anInt7410 * this.anInt7410 / (arg2 * 2);
				if (arg1 <= this.anInt7406) {
					if (this.anInt7406 > arg1 && arg1 > this.anInt7406 - local98) {
						this.anInt7410 = local8;
					}
				} else if (arg1 < local98 + this.anInt7406) {
					this.anInt7410 = local8;
				}
			}
		} else if (this.anInt7410 <= 0) {
			this.anInt7410 += arg2;
			if (this.anInt7410 > 0) {
				this.anInt7410 = 0;
			}
		} else {
			this.anInt7410 -= arg2;
			if (this.anInt7410 < 0) {
				this.anInt7410 = 0;
			}
		}
		this.anInt7406 += this.anInt7410 + local8 >> 1;
		return local76;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
	public int method5749() {
		return this.anInt7406 & 0x3FFF;
	}
}
