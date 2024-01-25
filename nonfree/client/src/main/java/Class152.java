import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class152 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!fr;")
	private Class91 aClass91_60 = new Class91(64);

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!qs;")
	private final Class211 aClass211_58;

	static {
		new Class158("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class152(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_58 = arg2;
		if (this.aClass211_58 != null) {
			@Pc(20) int local20 = this.aClass211_58.method4751() - 1;
			this.aClass211_58.method4772(local20);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public void method3459(@OriginalArg(1) int arg0) {
		@Pc(2) Class91 local2 = this.aClass91_60;
		synchronized (this.aClass91_60) {
			this.aClass91_60.method1999();
			this.aClass91_60 = new Class91(arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Lclient!m;")
	public Class164 method3461(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_60;
		@Pc(16) Class164 local16;
		synchronized (this.aClass91_60) {
			local16 = (Class164) this.aClass91_60.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_58;
		@Pc(42) byte[] local42;
		synchronized (this.aClass211_58) {
			local42 = this.aClass211_58.method4758(Static84.method1522(arg0), Static201.method3239(arg0));
		}
		local16 = new Class164();
		if (local42 != null) {
			local16.method3647(new Class1_Sub3(local42));
		}
		@Pc(69) Class91 local69 = this.aClass91_60;
		synchronized (this.aClass91_60) {
			this.aClass91_60.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public void method3462() {
		@Pc(6) Class91 local6 = this.aClass91_60;
		synchronized (this.aClass91_60) {
			this.aClass91_60.method1993();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
	public void method3463() {
		@Pc(8) Class91 local8 = this.aClass91_60;
		synchronized (this.aClass91_60) {
			this.aClass91_60.method1998(5);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public void method3465() {
		@Pc(6) Class91 local6 = this.aClass91_60;
		synchronized (this.aClass91_60) {
			this.aClass91_60.method1999();
		}
	}
}
