import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class100 {

	static {
		new Class189("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	protected Class100() {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)Lclient!ji;")
	public abstract Class3_Sub23 method3209();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public abstract void method3211();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
	protected abstract boolean method3212();

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)I")
	public abstract int method3213();

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
	public abstract void method3214();

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Z")
	public final boolean method3217() {
		return this.method3219() || this.method3212() || this.method3220();
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)I")
	public abstract int method3218();

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Z")
	public abstract boolean method3219();

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)Z")
	protected abstract boolean method3220();
}
