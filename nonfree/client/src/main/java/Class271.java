import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class271 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "Lclient!ka;")
	private final Class132 aClass132_61 = new Class132(64);

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!dk;")
	private final Class54 aClass54_117;

	static {
		new Class134("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class271(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_117 = arg2;
		this.aClass54_117.method1123(5);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)Lclient!sc;")
	public Class2_Sub5_Sub16 method5708(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_61;
		@Pc(16) Class2_Sub5_Sub16 local16;
		synchronized (this.aClass132_61) {
			local16 = (Class2_Sub5_Sub16) this.aClass132_61.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_117;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_117) {
			local38 = this.aClass54_117.method1126(5, arg0);
		}
		local16 = new Class2_Sub5_Sub16();
		if (local38 != null) {
			local16.method4748(new Class2_Sub13(local38));
		}
		@Pc(60) Class132 local60 = this.aClass132_61;
		synchronized (this.aClass132_61) {
			this.aClass132_61.method2711(local16, (long) arg0);
			return local16;
		}
	}
}
