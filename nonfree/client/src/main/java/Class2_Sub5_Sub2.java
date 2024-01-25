import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
	public final int anInt2395;

	static {
		new Class209("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
		new Class209(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub5_Sub2(@OriginalArg(0) int arg0) {
		this.anInt2395 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
	public abstract boolean method1871();

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method1877();
}
