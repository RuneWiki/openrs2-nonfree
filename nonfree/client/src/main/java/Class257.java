import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class257 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Lclient!sw;")
	private final Class277 aClass277_57 = new Class277(64);

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Lclient!dn;")
	private final Class69 aClass69_82;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class257(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_82 = arg2;
		this.aClass69_82.method1884(5);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lclient!go;")
	public Class1_Sub2_Sub7 method6645(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_57;
		@Pc(16) Class1_Sub2_Sub7 local16;
		synchronized (this.aClass277_57) {
			local16 = (Class1_Sub2_Sub7) this.aClass277_57.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_82;
		@Pc(38) byte[] local38;
		synchronized (this.aClass69_82) {
			local38 = this.aClass69_82.method1888(arg0, 5);
		}
		local16 = new Class1_Sub2_Sub7();
		if (local38 != null) {
			local16.method2901(new Class1_Sub17(local38));
		}
		@Pc(60) Class277 local60 = this.aClass277_57;
		synchronized (this.aClass277_57) {
			this.aClass277_57.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
