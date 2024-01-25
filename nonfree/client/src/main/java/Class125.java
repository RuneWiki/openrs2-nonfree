import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public abstract class Class125 {

	static {
		new Class114("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(JB)I")
	public final int method5260(@OriginalArg(0) long arg0) {
		@Pc(12) long local12 = this.method5261();
		if (local12 > 0L) {
			Static505.method7295(local12);
		}
		return this.method5262(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
	protected abstract long method5261();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZJ)I")
	protected abstract int method5262(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)J")
	public abstract long method5264();

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
	public abstract void method5266();
}
