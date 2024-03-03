import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class93 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_82 = new Class79("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[S")
	public static final short[] aShortArray64;

	static {
		new Class79("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		aShortArray64 = new short[] { -10304, 9104, -1, -1, -1 };
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!eu;)Lclient!eu;")
	public abstract Class2_Sub2_Sub6 method3696(@OriginalArg(1) Class2_Sub2_Sub6 arg0);
}
