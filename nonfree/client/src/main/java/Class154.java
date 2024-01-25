import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class154 {

	static {
		new Class169("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	protected Class154() {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!vm;")
	public abstract Class69 method3991();

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public abstract void method3992();

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method3994(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	public abstract void method3995();
}
