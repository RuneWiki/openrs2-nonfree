import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class Class138 {

	static {
		new Class256("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!s;)Lclient!s;")
	public abstract Class2_Sub2_Sub15 method3253(@OriginalArg(1) Class2_Sub2_Sub15 arg0);
}
