import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class Class135 {

	static {
		new Class57("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	protected Class135() {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)I")
	public abstract int method2979(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)[B")
	public abstract byte[] method2981(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lclient!dg;")
	public abstract Class55 method2982();

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V")
	public abstract void method2983(@OriginalArg(1) int arg0);
}
