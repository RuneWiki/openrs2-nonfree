import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!tr;")
	public Class5_Sub2_Sub17 aClass5_Sub2_Sub17_1;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt49 = -1;

	static {
		new Class198("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
		new Class198("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}
}
