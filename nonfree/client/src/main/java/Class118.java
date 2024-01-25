import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class118 {

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!sw;")
	private Class277 aClass277_26 = new Class277(64);

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!dn;")
	private final Class69 aClass69_36;

	static {
		new Class45("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
		new Class45("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class118(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_36 = arg2;
		if (this.aClass69_36 != null) {
			@Pc(20) int local20 = this.aClass69_36.method1895() - 1;
			this.aClass69_36.method1884(local20);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
	public void method2936() {
		@Pc(2) Class277 local2 = this.aClass277_26;
		synchronized (this.aClass277_26) {
			this.aClass277_26.method7018(5);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)Lclient!um;")
	public Class297 method2937(@OriginalArg(1) int arg0) {
		@Pc(11) Class277 local11 = this.aClass277_26;
		@Pc(21) Class297 local21;
		synchronized (this.aClass277_26) {
			local21 = (Class297) this.aClass277_26.method7014((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class69 local34 = this.aClass69_36;
		@Pc(47) byte[] local47;
		synchronized (this.aClass69_36) {
			local47 = this.aClass69_36.method1888(Static245.method4339(arg0), Static512.method7832(arg0));
		}
		local21 = new Class297();
		if (local47 != null) {
			local21.method7578(new Class1_Sub17(local47));
		}
		@Pc(69) Class277 local69 = this.aClass277_26;
		synchronized (this.aClass277_26) {
			this.aClass277_26.method7016(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public void method2939() {
		@Pc(10) Class277 local10 = this.aClass277_26;
		synchronized (this.aClass277_26) {
			this.aClass277_26.method7026();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public void method2940() {
		@Pc(6) Class277 local6 = this.aClass277_26;
		synchronized (this.aClass277_26) {
			this.aClass277_26.method7019();
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)V")
	public void method2941(@OriginalArg(1) int arg0) {
		@Pc(2) Class277 local2 = this.aClass277_26;
		synchronized (this.aClass277_26) {
			this.aClass277_26.method7019();
			this.aClass277_26 = new Class277(arg0);
		}
	}
}
