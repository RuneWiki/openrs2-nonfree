import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class95 {

	static {
		new Class21("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	protected Class95() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Z")
	public final boolean method5167() {
		return this.method5174() || this.method5168() || this.method5173();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
	protected abstract boolean method5168();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
	public abstract int method5170();

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	public abstract void method5172();

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
	protected abstract boolean method5173();

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
	public abstract boolean method5174();

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)I")
	public abstract int method5175();

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public abstract void method5177();

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Lclient!sm;")
	public abstract Class4_Sub15 method5178();
}
