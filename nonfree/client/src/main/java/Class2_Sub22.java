import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
	public volatile int anInt3502 = -1;

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString25;

	static {
		new Class62("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub22(@OriginalArg(0) String arg0) {
		this.aString25 = arg0;
	}
}
