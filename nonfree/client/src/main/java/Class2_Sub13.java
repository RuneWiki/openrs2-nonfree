import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!h", name = "o", descriptor = "I")
	public final int anInt2682;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "I")
	public final int anInt2683;

	static {
		new Class231("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
	public Class2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2682 = arg0;
		this.anInt2683 = arg1;
	}
}
