import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class192 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!fa;")
	private final Class68 aClass68_35 = new Class68(128);

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!fs;")
	private final Class76 aClass76_68;

	static {
		new Class83("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class192(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_68 = arg2;
		this.aClass76_68.method2108(1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
	public void method4339() {
		@Pc(14) Class68 local14 = this.aClass68_35;
		synchronized (this.aClass68_35) {
			this.aClass68_35.method1788(5);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lclient!sr;")
	public Class221 method4340(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_35;
		@Pc(16) Class221 local16;
		synchronized (this.aClass68_35) {
			local16 = (Class221) this.aClass68_35.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass76_68.method2104(arg0, 1);
		local16 = new Class221();
		if (local33 != null) {
			local16.method4960(new Class4_Sub12(local33));
		}
		@Pc(55) Class68 local55 = this.aClass68_35;
		synchronized (this.aClass68_35) {
			this.aClass68_35.method1779((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public void method4342() {
		@Pc(2) Class68 local2 = this.aClass68_35;
		synchronized (this.aClass68_35) {
			this.aClass68_35.method1777();
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method4343() {
		@Pc(2) Class68 local2 = this.aClass68_35;
		synchronized (this.aClass68_35) {
			this.aClass68_35.method1791();
		}
	}
}
