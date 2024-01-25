import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class267 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!me;")
	private final Class211 aClass211_52 = new Class211(64);

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!pe;")
	private final Class254 aClass254_108;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class267(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_108 = arg2;
		this.aClass254_108.method6396(5);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!ew;")
	public Class3_Sub4_Sub10 method6766(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_52;
		@Pc(16) Class3_Sub4_Sub10 local16;
		synchronized (this.aClass211_52) {
			local16 = (Class3_Sub4_Sub10) this.aClass211_52.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_108;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_108) {
			local38 = this.aClass254_108.method6401(5, arg0);
		}
		local16 = new Class3_Sub4_Sub10();
		if (local38 != null) {
			local16.method2532(new Class3_Sub7(local38));
		}
		@Pc(66) Class211 local66 = this.aClass211_52;
		synchronized (this.aClass211_52) {
			this.aClass211_52.method5529((long) arg0, local16);
			return local16;
		}
	}
}
