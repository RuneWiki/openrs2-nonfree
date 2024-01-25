import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class50 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!ge;")
	private final Class83 aClass83_12 = new Class83(64);

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Lclient!ci;")
	private final Class38 aClass38_16;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public final int anInt1693;

	static {
		new Class21("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
		new Class21("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class50(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_16 = arg2;
		if (this.aClass38_16 == null) {
			this.anInt1693 = 0;
		} else {
			this.anInt1693 = this.aClass38_16.method1032(16);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public void method1528() {
		@Pc(2) Class83 local2 = this.aClass83_12;
		synchronized (this.aClass83_12) {
			this.aClass83_12.method2346();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Lclient!nc;")
	public Class167 method1529(@OriginalArg(0) int arg0) {
		@Pc(14) Class83 local14 = this.aClass83_12;
		@Pc(24) Class167 local24;
		synchronized (this.aClass83_12) {
			local24 = (Class167) this.aClass83_12.method2338((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class38 local37 = this.aClass38_16;
		@Pc(46) byte[] local46;
		synchronized (this.aClass38_16) {
			local46 = this.aClass38_16.method1039(arg0, 16);
		}
		local24 = new Class167();
		if (local46 != null) {
			local24.method4228(new Class4_Sub20(local46));
		}
		@Pc(68) Class83 local68 = this.aClass83_12;
		synchronized (this.aClass83_12) {
			this.aClass83_12.method2337(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V")
	public void method1530() {
		@Pc(6) Class83 local6 = this.aClass83_12;
		synchronized (this.aClass83_12) {
			this.aClass83_12.method2345(5);
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	public void method1531() {
		@Pc(10) Class83 local10 = this.aClass83_12;
		synchronized (this.aClass83_12) {
			this.aClass83_12.method2336();
		}
	}
}
