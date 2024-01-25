import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ro", name = "U", descriptor = "I")
	private int anInt5469 = 32768;

	static {
		new Class106("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5469 = arg1.method2161() << 4;
		} else if (arg0 == 1) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(21) int[] local21 = this.method6013(arg0, 1);
			@Pc(27) int[] local27 = this.method6013(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static85.anInt1910; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt5469 >> 12;
				@Pc(56) int local56 = Static6.anIntArray22[local39] * local48 >> 12;
				@Pc(64) int local64 = local48 * Static171.anIntArray265[local39] >> 12;
				@Pc(72) int local72 = Static346.anInt6542 & local29 + (local56 >> 12);
				@Pc(81) int local81 = Static279.anInt5435 & arg0 + (local64 >> 12);
				@Pc(87) int[] local87 = this.method6013(local81, 0);
				local11[local29] = local87[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		Static113.method2407();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(26) int[] local26 = this.method6013(arg0, 1);
			@Pc(32) int[] local32 = this.method6013(arg0, 2);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static85.anInt1910; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt5469 >> 12;
				@Pc(75) int local75 = Static6.anIntArray22[local58] * local67 >> 12;
				@Pc(83) int local83 = local67 * Static171.anIntArray265[local58] >> 12;
				@Pc(92) int local92 = local46 + (local75 >> 12) & Static346.anInt6542;
				@Pc(100) int local100 = arg0 + (local83 >> 12) & Static279.anInt5435;
				@Pc(106) int[][] local106 = this.method6006(0, local100);
				local36[local46] = local106[0][local92];
				local40[local46] = local106[1][local92];
				local44[local46] = local106[2][local92];
			}
		}
		return local11;
	}
}
