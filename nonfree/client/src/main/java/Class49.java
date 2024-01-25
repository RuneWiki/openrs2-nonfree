import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class49 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public final int anInt1611;

	static {
		new Class175("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1611 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
