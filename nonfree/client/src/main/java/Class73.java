import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class73 {

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "Lclient!of;")
	private final Class188 aClass188_19 = new Class188(64);

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "Lclient!of;")
	public final Class188 aClass188_20 = new Class188(2);

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Lclient!mn;")
	public final Class171 aClass171_27;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "Lclient!mn;")
	private final Class171 aClass171_26;

	static {
		new Class231("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
		new Class231("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;Lclient!mn;)V")
	public Class73(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_27 = arg3;
		this.aClass171_26 = arg2;
		this.aClass171_26.method3662(33);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public void method1449() {
		@Pc(2) Class188 local2 = this.aClass188_19;
		synchronized (this.aClass188_19) {
			this.aClass188_19.method4154();
		}
		local2 = this.aClass188_20;
		synchronized (this.aClass188_20) {
			this.aClass188_20.method4154();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lclient!di;")
	public Class53 method1450(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_19;
		@Pc(16) Class53 local16;
		synchronized (this.aClass188_19) {
			local16 = (Class53) this.aClass188_19.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_26;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_26) {
			local38 = this.aClass171_26.method3658(33, arg0);
		}
		local16 = new Class53();
		local16.aClass73_2 = this;
		if (local38 != null) {
			local16.method1106(new Class2_Sub17(local38));
		}
		@Pc(65) Class188 local65 = this.aClass188_19;
		synchronized (this.aClass188_19) {
			this.aClass188_19.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
	public void method1451() {
		@Pc(2) Class188 local2 = this.aClass188_19;
		synchronized (this.aClass188_19) {
			this.aClass188_19.method4156();
		}
		local2 = this.aClass188_20;
		synchronized (this.aClass188_20) {
			this.aClass188_20.method4156();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
	public void method1452() {
		@Pc(6) Class188 local6 = this.aClass188_19;
		synchronized (this.aClass188_19) {
			this.aClass188_19.method4169(5);
		}
		local6 = this.aClass188_20;
		synchronized (this.aClass188_20) {
			this.aClass188_20.method4169(5);
		}
	}
}
