import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class81 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!lh;")
	private final Class151 aClass151_49 = new Class151(64);

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!hh;")
	private final Class109 aClass109_26;

	static {
		new Class96("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class81(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_26 = arg2;
		this.aClass109_26.method2322(32);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public void method1626() {
		@Pc(2) Class151 local2 = this.aClass151_49;
		synchronized (this.aClass151_49) {
			this.aClass151_49.method3298();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public void method1627() {
		@Pc(6) Class151 local6 = this.aClass151_49;
		synchronized (this.aClass151_49) {
			this.aClass151_49.method3297(5);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lclient!tq;")
	public Class231 method1629(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_49;
		@Pc(18) Class231 local18;
		synchronized (this.aClass151_49) {
			local18 = (Class231) this.aClass151_49.method3288((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(37) byte[] local37 = this.aClass109_26.method2349(32, arg0);
		local18 = new Class231();
		if (local37 != null) {
			local18.method5398(new Class1_Sub14(local37));
		}
		@Pc(53) Class151 local53 = this.aClass151_49;
		synchronized (this.aClass151_49) {
			this.aClass151_49.method3291((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public void method1631() {
		@Pc(2) Class151 local2 = this.aClass151_49;
		synchronized (this.aClass151_49) {
			this.aClass151_49.method3299();
		}
	}
}
