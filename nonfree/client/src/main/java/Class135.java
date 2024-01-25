import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class135 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	public int anInt4073;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	private int anInt4076;

	static {
		new Class34("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
		new Class34("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
	public void method3689(@OriginalArg(0) int arg0) {
		this.anInt4076 = 0;
		this.anInt4073 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIII)Z")
	public boolean method3691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt4076;
		if (arg0 == this.anInt4073 && this.anInt4076 == 0) {
			return false;
		}
		@Pc(83) boolean local83;
		@Pc(65) int local65;
		if (this.anInt4076 == 0) {
			if (arg0 > this.anInt4073 && arg0 <= arg2 + this.anInt4073 || arg0 < this.anInt4073 && arg0 >= this.anInt4073 - arg2) {
				this.anInt4073 = arg0;
				return false;
			}
			local83 = true;
		} else {
			@Pc(70) int local70;
			if (this.anInt4076 > 0 && this.anInt4073 < arg0) {
				local65 = this.anInt4076 * this.anInt4076 / (arg2 * 2);
				local70 = local65 + this.anInt4073;
				if (arg0 > local70 && local70 >= this.anInt4073) {
					local83 = true;
				} else {
					local83 = false;
				}
			} else if (this.anInt4076 < 0 && this.anInt4073 > arg0) {
				local65 = this.anInt4076 * this.anInt4076 / (arg2 * 2);
				local70 = this.anInt4073 - local65;
				if (local70 > arg0 && this.anInt4073 >= local70) {
					local83 = true;
				} else {
					local83 = false;
				}
			} else {
				local83 = false;
			}
		}
		if (local83) {
			if (arg0 > this.anInt4073) {
				this.anInt4076 += arg2;
				if (arg1 != 0 && arg1 < this.anInt4076) {
					this.anInt4076 = arg1;
				}
			} else {
				this.anInt4076 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt4076) {
					this.anInt4076 = -arg1;
				}
			}
			if (local8 != this.anInt4076) {
				local65 = this.anInt4076 * this.anInt4076 / (arg2 * 2);
				if (arg0 <= this.anInt4073) {
					if (this.anInt4073 > arg0 && this.anInt4073 - local65 < arg0) {
						this.anInt4076 = local8;
					}
				} else if (arg0 < local65 + this.anInt4073) {
					this.anInt4076 = local8;
				}
			}
		} else if (this.anInt4076 > 0) {
			this.anInt4076 -= arg2;
			if (this.anInt4076 < 0) {
				this.anInt4076 = 0;
			}
		} else {
			this.anInt4076 += arg2;
			if (this.anInt4076 > 0) {
				this.anInt4076 = 0;
			}
		}
		this.anInt4073 += local8 + this.anInt4076 >> 1;
		return local83;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	public int method3693() {
		return this.anInt4073 & 0x3FFF;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public void method3694() {
		this.anInt4073 &= 0x3FFF;
	}
}
