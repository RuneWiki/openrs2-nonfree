import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!gk;")
	public final Class65_Sub3_Sub1 aClass65_Sub3_Sub1_2;

	static {
		new Class256("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!bo;II[B)V")
	public Class14_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass65_Sub3_Sub1_2 = Static329.method4700(arg3, arg0, arg1, arg2);
		this.aClass65_Sub3_Sub1_2.method1962(false, false);
	}
}
