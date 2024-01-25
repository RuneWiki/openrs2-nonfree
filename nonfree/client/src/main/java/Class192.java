import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class192 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!ad;")
	private final Class5 aClass5_50 = new Class5(128);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!dn;")
	private final Class56 aClass56_72;

	static {
		new Class175("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
		new Class175("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class192(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_72 = arg2;
		if (this.aClass56_72 != null) {
			@Pc(20) int local20 = this.aClass56_72.method1380() - 1;
			this.aClass56_72.method1373(local20);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lclient!dq;")
	public Class58 method4696(@OriginalArg(1) int arg0) {
		@Pc(14) Class5 local14 = this.aClass5_50;
		@Pc(24) Class58 local24;
		synchronized (this.aClass5_50) {
			local24 = (Class58) this.aClass5_50.method104((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass56_72.method1384(Static176.method2997(arg0), Static36.method860(arg0));
		local24 = new Class58();
		if (local45 != null) {
			local24.method1400(new Class3_Sub2(local45));
		}
		@Pc(61) Class5 local61 = this.aClass5_50;
		synchronized (this.aClass5_50) {
			this.aClass5_50.method114((long) arg0, local24);
			return local24;
		}
	}
}
