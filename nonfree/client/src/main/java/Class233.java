import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class Class233 {

	static {
		new Class21("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ac;Z)Lclient!ac;")
	public abstract Class4_Sub1_Sub1 method5346(@OriginalArg(0) Class4_Sub1_Sub1 arg0);
}
