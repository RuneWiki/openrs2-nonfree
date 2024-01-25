import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class246 {

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Lclient!me;")
	private final Class211 aClass211_49 = new Class211(64);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Lclient!pe;")
	private final Class254 aClass254_101;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class246(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_101 = arg2;
		this.aClass254_101.method6396(31);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	public void method6135() {
		@Pc(2) Class211 local2 = this.aClass211_49;
		synchronized (this.aClass211_49) {
			this.aClass211_49.method5538(5);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Lclient!sb;")
	public Class293 method6137(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_49;
		@Pc(16) Class293 local16;
		synchronized (this.aClass211_49) {
			local16 = (Class293) this.aClass211_49.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_101;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_101) {
			local38 = this.aClass254_101.method6401(31, arg0);
		}
		local16 = new Class293();
		if (local38 != null) {
			local16.method7215(new Class3_Sub7(local38));
		}
		@Pc(68) Class211 local68 = this.aClass211_49;
		synchronized (this.aClass211_49) {
			this.aClass211_49.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	public void method6139() {
		@Pc(6) Class211 local6 = this.aClass211_49;
		synchronized (this.aClass211_49) {
			this.aClass211_49.method5535();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	public void method6140() {
		@Pc(2) Class211 local2 = this.aClass211_49;
		synchronized (this.aClass211_49) {
			this.aClass211_49.method5537();
		}
	}
}
