import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class92 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!ul;")
	public Class246 aClass246_1;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt2509;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt2511;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	private int anInt2515;

	static {
		new Class256("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!md;II)V")
	private void method1846(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2515 = arg0.method3711();
		} else if (arg1 == 2) {
			this.anInt2511 = arg0.method3737();
			this.anInt2509 = arg0.method3737();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!md;)V")
	public void method1848(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method1846(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lclient!fq;")
	public synchronized Class89 method1851() {
		@Pc(15) Class89 local15 = (Class89) this.aClass246_1.aClass129_71.method3023((long) this.anInt2515);
		if (local15 != null) {
			return local15;
		}
		local15 = Static456.method1764(this.aClass246_1.aClass188_119, this.anInt2515, 0);
		if (local15 != null) {
			this.aClass246_1.aClass129_71.method3029(local15, (long) this.anInt2515);
		}
		return local15;
	}
}
