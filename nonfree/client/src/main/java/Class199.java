import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class199 {

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!rp;")
	private final Class220 aClass220_45 = new Class220(64);

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!lt;")
	private final Class158 aClass158_66;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public final int anInt4999;

	static {
		new Class231("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
		new Class231("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class199(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_66 = arg2;
		this.anInt4999 = this.aClass158_66.method3683(19);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Lclient!kl;")
	public Class140 method4413(@OriginalArg(1) int arg0) {
		@Pc(11) Class220 local11 = this.aClass220_45;
		@Pc(21) Class140 local21;
		synchronized (this.aClass220_45) {
			local21 = (Class140) this.aClass220_45.method4990((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass158_66.method3672(arg0, 19);
		local21 = new Class140();
		if (local38 != null) {
			local21.method3246(new Class6_Sub15(local38));
		}
		@Pc(54) Class220 local54 = this.aClass220_45;
		synchronized (this.aClass220_45) {
			this.aClass220_45.method4996(local21, (long) arg0);
			return local21;
		}
	}
}
