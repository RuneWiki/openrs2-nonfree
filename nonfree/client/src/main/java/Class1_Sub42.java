import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
	public final int anInt6683;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
	public final int anInt6675;

	static {
		new Class34("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(II)V")
	public Class1_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6683 = arg0;
		this.anInt6675 = arg1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z")
	public boolean method5588(@OriginalArg(1) int arg0) {
		return (this.anInt6683 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I")
	public int method5589() {
		return Static8.method5011(this.anInt6683);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)I")
	public int method5590() {
		return this.anInt6683 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Z")
	public boolean method5591() {
		return (this.anInt6683 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Z")
	public boolean method5592() {
		return (this.anInt6683 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(Z)Z")
	public boolean method5595() {
		return (this.anInt6683 >> 22 & 0x1) != 0;
	}
}
