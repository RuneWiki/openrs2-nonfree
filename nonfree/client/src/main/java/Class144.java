import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class144 {

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!wm;")
	private final Class267 aClass267_37 = new Class267(64);

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!ph;")
	private final Class187 aClass187_74;

	static {
		new Class182("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
		new Class182("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class144(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_74 = arg2;
		if (this.aClass187_74 != null) {
			this.aClass187_74.method4306(35);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public void method3295() {
		@Pc(2) Class267 local2 = this.aClass267_37;
		synchronized (this.aClass267_37) {
			this.aClass267_37.method6013();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public void method3296() {
		@Pc(10) Class267 local10 = this.aClass267_37;
		synchronized (this.aClass267_37) {
			this.aClass267_37.method6011();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Lclient!tl;")
	public Class238 method3297(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_37;
		@Pc(16) Class238 local16;
		synchronized (this.aClass267_37) {
			local16 = (Class238) this.aClass267_37.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class187 local34 = this.aClass187_74;
		@Pc(43) byte[] local43;
		synchronized (this.aClass187_74) {
			local43 = this.aClass187_74.method4300(35, arg0);
		}
		local16 = new Class238();
		if (local43 != null) {
			local16.method5215(new Class10_Sub8(local43));
		}
		local16.method5216();
		@Pc(68) Class267 local68 = this.aClass267_37;
		synchronized (this.aClass267_37) {
			this.aClass267_37.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V")
	public void method3298() {
		@Pc(7) Class267 local7 = this.aClass267_37;
		synchronized (this.aClass267_37) {
			this.aClass267_37.method6007(5);
		}
	}
}
