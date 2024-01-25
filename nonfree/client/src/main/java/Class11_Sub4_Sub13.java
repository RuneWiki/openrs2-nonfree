import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class Class11_Sub4_Sub13 extends Class11_Sub4 {

	static {
		new Class117("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	protected Class11_Sub4_Sub13() {
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5302();

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Z")
	public abstract boolean method5306();
}
