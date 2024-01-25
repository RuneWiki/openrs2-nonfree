import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class2_Sub10_Sub5_Sub1 extends Class2_Sub10_Sub5 {

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	static {
		new Class32("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub10_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5576() {
		return false;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5575() {
		return this.anObject2;
	}
}
