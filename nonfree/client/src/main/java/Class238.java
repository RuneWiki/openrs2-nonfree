import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class238 {

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "Lclient!ng;")
	private final Class167 aClass167_92 = new Class167(16);

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "Lclient!ic;")
	private final Class113 aClass113_125;

	static {
		new Class151("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class238(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_125 = arg2;
		this.aClass113_125.method2271(30);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public void method5003() {
		@Pc(2) Class167 local2 = this.aClass167_92;
		synchronized (this.aClass167_92) {
			this.aClass167_92.method3390();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V")
	public void method5004() {
		@Pc(6) Class167 local6 = this.aClass167_92;
		synchronized (this.aClass167_92) {
			this.aClass167_92.method3384(5);
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)Lclient!bk;")
	public Class24 method5007(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_92;
		@Pc(21) Class24 local21;
		synchronized (this.aClass167_92) {
			local21 = (Class24) this.aClass167_92.method3386((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass113_125.method2274(30, arg0);
		local21 = new Class24();
		if (local38 != null) {
			local21.method508(new Class1_Sub11(local38));
		}
		@Pc(54) Class167 local54 = this.aClass167_92;
		synchronized (this.aClass167_92) {
			this.aClass167_92.method3392(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	public void method5008() {
		@Pc(11) Class167 local11 = this.aClass167_92;
		synchronized (this.aClass167_92) {
			this.aClass167_92.method3389();
		}
	}
}
