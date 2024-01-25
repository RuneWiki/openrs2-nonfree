import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljava/lang/String;")
	public String aString67;

	static {
		new Class67("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	private Class3_Sub46() {
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub46(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString67 = arg0;
	}
}
