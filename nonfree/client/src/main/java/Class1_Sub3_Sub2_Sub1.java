import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class1_Sub3_Sub2_Sub1 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!bq", name = "N", descriptor = "Lclient!oc;")
	public Class178 aClass178_1;

	static {
		new Class151("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method4906() {
		if (super.aBoolean524) {
			throw new RuntimeException();
		}
		return this.aByteArray4;
	}

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)I")
	@Override
	public int method4908() {
		return super.aBoolean524 ? 0 : 100;
	}
}
