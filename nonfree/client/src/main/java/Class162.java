import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class162 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[Lclient!ot;")
	public Class19_Sub2[] aClass19_Sub2Array2 = null;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!mu;")
	public Class19_Sub4 aClass19_Sub4_1 = null;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "[Lclient!ot;")
	public Class19_Sub2[] aClass19_Sub2Array3 = null;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!mu;")
	public Class19_Sub4 aClass19_Sub4_2 = null;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!mu;")
	public Class19_Sub4 aClass19_Sub4_3 = null;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Z")
	public final boolean aBoolean337;

	static {
		new Class202("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class162(@OriginalArg(0) Class39_Sub3 arg0) {
		this.aBoolean337 = arg0.aBoolean491;
		Static175.method2946(arg0);
		if (this.aBoolean337) {
			@Pc(33) byte[] local33 = Static50.method898(Static78.anObject4, false);
			this.aClass19_Sub4_3 = new Class19_Sub4(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static50.method898(Static475.anObject18, false);
			this.aClass19_Sub4_2 = new Class19_Sub4(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class311 local65 = arg0.aClass311_1;
			if (local65.method7662()) {
				local33 = Static50.method898(Static289.anObject11, false);
				this.aClass19_Sub4_1 = new Class19_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(95) Class19_Sub4 local95 = new Class19_Sub4(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method7660(local95, this.aClass19_Sub4_1, 2.0F)) {
					this.aClass19_Sub4_1.method4808();
				} else {
					this.aClass19_Sub4_1.method4800();
					this.aClass19_Sub4_1 = null;
				}
				local95.method4800();
				return;
			}
		} else {
			this.aClass19_Sub2Array3 = new Class19_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static502.method7394(Static78.anObject4, local127 * 128 * 128 * 2);
				this.aClass19_Sub2Array3[local127] = new Class19_Sub2(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass19_Sub2Array2 = new Class19_Sub2[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(179) byte[] local179 = Static502.method7394(Static475.anObject18, local167 * 128 * 256);
				this.aClass19_Sub2Array2[local167] = new Class19_Sub2(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
