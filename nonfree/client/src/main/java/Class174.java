import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class174 {

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!fr;")
	private final Class91 aClass91_68 = new Class91(64);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!qs;")
	private final Class211 aClass211_66;

	static {
		new Class158("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class174(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_66 = arg2;
		this.aClass211_66.method4772(5);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZI)Lclient!rd;")
	public Class1_Sub1_Sub14 method3818(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_68;
		@Pc(16) Class1_Sub1_Sub14 local16;
		synchronized (this.aClass91_68) {
			local16 = (Class1_Sub1_Sub14) this.aClass91_68.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_66;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_66) {
			local38 = this.aClass211_66.method4758(arg0, 5);
		}
		local16 = new Class1_Sub1_Sub14();
		if (local38 != null) {
			local16.method4900(new Class1_Sub3(local38));
		}
		@Pc(65) Class91 local65 = this.aClass91_68;
		synchronized (this.aClass91_68) {
			this.aClass91_68.method1990(local16, (long) arg0);
			return local16;
		}
	}
}
