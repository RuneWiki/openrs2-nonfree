import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class98 {

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Lclient!mo;")
	private final Class160 aClass160_22 = new Class160(16);

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Lclient!nl;")
	private final Class171 aClass171_37;

	static {
		new Class32("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class98(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_37 = arg2;
		this.aClass171_37.method3750(30);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
	public void method2520() {
		@Pc(7) Class160 local7 = this.aClass160_22;
		synchronized (this.aClass160_22) {
			this.aClass160_22.method3606(5);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method2523() {
		@Pc(10) Class160 local10 = this.aClass160_22;
		synchronized (this.aClass160_22) {
			this.aClass160_22.method3605();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Lclient!as;")
	public Class13 method2525(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_22;
		@Pc(16) Class13 local16;
		synchronized (this.aClass160_22) {
			local16 = (Class13) this.aClass160_22.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass171_37.method3745(30, arg0);
		local16 = new Class13();
		if (local38 != null) {
			local16.method306(new Class2_Sub16(local38));
		}
		@Pc(54) Class160 local54 = this.aClass160_22;
		synchronized (this.aClass160_22) {
			this.aClass160_22.method3602((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V")
	public void method2526() {
		@Pc(11) Class160 local11 = this.aClass160_22;
		synchronized (this.aClass160_22) {
			this.aClass160_22.method3595();
		}
	}
}
