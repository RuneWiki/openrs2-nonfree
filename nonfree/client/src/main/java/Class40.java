import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class Class40 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!j;")
	public Class40 aClass40_23;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!j;")
	public Class40 aClass40_24;

	static {
		new Class182("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public final void method4364() {
		if (this.aClass40_24 != null) {
			this.aClass40_24.aClass40_23 = this.aClass40_23;
			this.aClass40_23.aClass40_24 = this.aClass40_24;
			this.aClass40_24 = null;
			this.aClass40_23 = null;
		}
	}
}
