import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class11_Sub16 extends Class11 {

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "J")
	public long aLong74;

	static {
		new Class117("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	private Class11_Sub16() {
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(J)V")
	public Class11_Sub16(@OriginalArg(0) long arg0) {
		this.aLong74 = arg0;
	}
}
