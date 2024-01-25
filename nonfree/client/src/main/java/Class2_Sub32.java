import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!o", name = "u", descriptor = "I")
	public volatile int anInt4261 = -1;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString36;

	static {
		new Class93("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub32(@OriginalArg(0) String arg0) {
		this.aString36 = arg0;
	}
}
