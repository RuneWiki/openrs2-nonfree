import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class Class68 {

	static {
		new Class96("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	protected Class68() {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[FFIIIIFFIF)V")
	public abstract void method4376(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6);
}
