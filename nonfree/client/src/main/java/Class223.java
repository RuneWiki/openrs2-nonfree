import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class223 {

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!mq;")
	private final Class154 aClass154_52 = new Class154(256);

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!fc;")
	private final Class71 aClass71_86;

	static {
		new Class221("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class223(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_86 = arg2;
		this.aClass71_86.method1580(26);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public void method5292() {
		@Pc(6) Class154 local6 = this.aClass154_52;
		synchronized (this.aClass154_52) {
			this.aClass154_52.method3746();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)Lclient!lq;")
	public Class2_Sub1_Sub9 method5298(@OriginalArg(0) int arg0) {
		@Pc(11) Class154 local11 = this.aClass154_52;
		@Pc(21) Class2_Sub1_Sub9 local21;
		synchronized (this.aClass154_52) {
			local21 = (Class2_Sub1_Sub9) this.aClass154_52.method3751((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass71_86.method1555(26, arg0);
		local21 = new Class2_Sub1_Sub9();
		if (local38 != null) {
			local21.method3535(new Class2_Sub13(local38));
		}
		@Pc(54) Class154 local54 = this.aClass154_52;
		synchronized (this.aClass154_52) {
			this.aClass154_52.method3745((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public void method5299() {
		@Pc(6) Class154 local6 = this.aClass154_52;
		synchronized (this.aClass154_52) {
			this.aClass154_52.method3758(5);
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public void method5300() {
		@Pc(6) Class154 local6 = this.aClass154_52;
		synchronized (this.aClass154_52) {
			this.aClass154_52.method3748();
		}
	}
}
