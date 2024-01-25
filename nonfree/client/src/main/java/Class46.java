import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class46 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!fr;")
	private final Class91 aClass91_16 = new Class91(64);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!qs;")
	private final Class211 aClass211_18;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public final int anInt1518;

	static {
		new Class158("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class46(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_18 = arg2;
		if (this.aClass211_18 == null) {
			this.anInt1518 = 0;
		} else {
			this.anInt1518 = this.aClass211_18.method4772(16);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method1070() {
		@Pc(10) Class91 local10 = this.aClass91_16;
		synchronized (this.aClass91_16) {
			this.aClass91_16.method1993();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!wm;")
	public Class268 method1072(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_16;
		@Pc(16) Class268 local16;
		synchronized (this.aClass91_16) {
			local16 = (Class268) this.aClass91_16.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_18;
		@Pc(40) byte[] local40;
		synchronized (this.aClass211_18) {
			local40 = this.aClass211_18.method4758(arg0, 16);
		}
		local16 = new Class268();
		if (local40 != null) {
			local16.method6114(new Class1_Sub3(local40));
		}
		@Pc(69) Class91 local69 = this.aClass91_16;
		synchronized (this.aClass91_16) {
			this.aClass91_16.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZ)V")
	public void method1075() {
		@Pc(2) Class91 local2 = this.aClass91_16;
		synchronized (this.aClass91_16) {
			this.aClass91_16.method1998(5);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method1077() {
		@Pc(6) Class91 local6 = this.aClass91_16;
		synchronized (this.aClass91_16) {
			this.aClass91_16.method1999();
		}
	}
}
