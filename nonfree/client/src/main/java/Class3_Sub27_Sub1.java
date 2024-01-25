import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class3_Sub27_Sub1 extends Class3_Sub27 {

	@OriginalMember(owner = "client!kr", name = "Ib", descriptor = "I")
	private int anInt5382;

	@OriginalMember(owner = "client!kr", name = "Tb", descriptor = "Lclient!qca;")
	private Class241 aClass241_1;

	static {
		new Class67("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
	public Class3_Sub27_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "(I)V")
	public void method4533() {
		this.anInt5382 = super.anInt9191 * 8;
	}

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "(I)Z")
	public boolean method4534() {
		@Pc(16) int local16 = super.aByteArray114[super.anInt9191] - this.aClass241_1.method5972() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "(I)V")
	public void method4535() {
		super.anInt9191 = (this.anInt5382 + 7) / 8;
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(IB)I")
	public int method4536(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt5382 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt5382 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt5382 += arg0;
		while (arg0 > local18) {
			local20 += (Static483.anIntArray736[local18] & super.aByteArray114[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static483.anIntArray736[local18] & super.aByteArray114[local10];
		} else {
			local20 += super.aByteArray114[local10] >> local18 - arg0 & Static483.anIntArray736[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "(II)V")
	public void method4542(@OriginalArg(1) int arg0) {
		super.aByteArray114[super.anInt9191++] = (byte) (arg0 + this.aClass241_1.method5968());
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[I)V")
	public void method4543(@OriginalArg(1) int[] arg0) {
		this.aClass241_1 = new Class241(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI[BI)V")
	public void method4544(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray114[super.anInt9191++] - this.aClass241_1.method5968());
		}
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(Z)I")
	public int method4545() {
		@Pc(22) int local22 = super.aByteArray114[super.anInt9191++] - this.aClass241_1.method5968() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray114[super.anInt9191++] - this.aClass241_1.method5968() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "(II)I")
	public int method4546(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5382;
	}
}
