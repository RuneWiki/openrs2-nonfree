import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class122 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!jo;")
	private final Class126 aClass126_24 = new Class126(64);

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!ok;")
	private final Class178 aClass178_50;

	static {
		new Class55("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class122(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_50 = arg2;
		if (this.aClass178_50 != null) {
			this.aClass178_50.method3833(35);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public void method2722() {
		@Pc(2) Class126 local2 = this.aClass126_24;
		synchronized (this.aClass126_24) {
			this.aClass126_24.method2828(5);
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public void method2723() {
		@Pc(14) Class126 local14 = this.aClass126_24;
		synchronized (this.aClass126_24) {
			this.aClass126_24.method2821();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public void method2724() {
		@Pc(2) Class126 local2 = this.aClass126_24;
		synchronized (this.aClass126_24) {
			this.aClass126_24.method2827();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Lclient!ph;")
	public Class191 method2725(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_24;
		@Pc(16) Class191 local16;
		synchronized (this.aClass126_24) {
			local16 = (Class191) this.aClass126_24.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_50;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_50) {
			local38 = this.aClass178_50.method3838(arg0, 35);
		}
		local16 = new Class191();
		if (local38 != null) {
			local16.method4042(new Class7_Sub14(local38));
		}
		local16.method4046();
		@Pc(71) Class126 local71 = this.aClass126_24;
		synchronized (this.aClass126_24) {
			this.aClass126_24.method2824((long) arg0, local16);
			return local16;
		}
	}
}
