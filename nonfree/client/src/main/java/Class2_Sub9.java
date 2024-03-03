import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_38 = new Class79("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public static int anInt1734;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "S")
	public short aShort20;

	static {
		new Class79("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
		anInt1734 = -1;
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 59)
	private Class2_Sub9() {
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(S)V", line = 66)
	public Class2_Sub9(@OriginalArg(0) short arg0) {
		this.aShort20 = arg0;
	}
}
