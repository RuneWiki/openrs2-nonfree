import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class212 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!ku;")
	private final Class139 aClass139_65 = new Class139(256);

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "Lclient!b;")
	private final Class20 aClass20_78;

	static {
		new Class57("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
		new Class57("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class212(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_78 = arg2;
		this.aClass20_78.method231(26);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Lclient!uc;")
	public Class3_Sub7_Sub14 method4795(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_65;
		@Pc(16) Class3_Sub7_Sub14 local16;
		synchronized (this.aClass139_65) {
			local16 = (Class3_Sub7_Sub14) this.aClass139_65.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass20_78.method253(arg0, 26);
		local16 = new Class3_Sub7_Sub14();
		if (local41 != null) {
			local16.method5232(new Class3_Sub5(local41));
		}
		@Pc(57) Class139 local57 = this.aClass139_65;
		synchronized (this.aClass139_65) {
			this.aClass139_65.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)V")
	public void method4799() {
		@Pc(2) Class139 local2 = this.aClass139_65;
		synchronized (this.aClass139_65) {
			this.aClass139_65.method3083(5);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public void method4800() {
		@Pc(2) Class139 local2 = this.aClass139_65;
		synchronized (this.aClass139_65) {
			this.aClass139_65.method3072();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	public void method4802() {
		@Pc(2) Class139 local2 = this.aClass139_65;
		synchronized (this.aClass139_65) {
			this.aClass139_65.method3075();
		}
	}
}
