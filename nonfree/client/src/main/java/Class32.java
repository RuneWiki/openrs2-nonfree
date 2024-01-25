import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class32 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "Lclient!fr;")
	private final Class91 aClass91_7 = new Class91(64);

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!qs;")
	private final Class211 aClass211_12;

	static {
		new Class158("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class32(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_12 = arg2;
		if (this.aClass211_12 != null) {
			this.aClass211_12.method4772(11);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public void method721() {
		@Pc(6) Class91 local6 = this.aClass91_7;
		synchronized (this.aClass91_7) {
			this.aClass91_7.method1993();
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
	public void method722() {
		@Pc(12) Class91 local12 = this.aClass91_7;
		synchronized (this.aClass91_7) {
			this.aClass91_7.method1998(5);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public void method723() {
		@Pc(2) Class91 local2 = this.aClass91_7;
		synchronized (this.aClass91_7) {
			this.aClass91_7.method1999();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)Lclient!am;")
	public Class13 method724(@OriginalArg(1) int arg0) {
		@Pc(12) Class91 local12 = this.aClass91_7;
		@Pc(22) Class13 local22;
		synchronized (this.aClass91_7) {
			local22 = (Class13) this.aClass91_7.method1988((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class211 local35 = this.aClass211_12;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_12) {
			local44 = this.aClass211_12.method4758(arg0, 11);
		}
		local22 = new Class13();
		if (local44 != null) {
			local22.method147(new Class1_Sub3(local44));
		}
		@Pc(66) Class91 local66 = this.aClass91_7;
		synchronized (this.aClass91_7) {
			this.aClass91_7.method1990(local22, (long) arg0);
			return local22;
		}
	}
}
