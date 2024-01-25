import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class17 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!me;")
	private final Class211 aClass211_10 = new Class211(64);

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Lclient!pe;")
	private final Class254 aClass254_9;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class17(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_9 = arg2;
		if (this.aClass254_9 != null) {
			this.aClass254_9.method6396(11);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public void method755() {
		@Pc(12) Class211 local12 = this.aClass211_10;
		synchronized (this.aClass211_10) {
			this.aClass211_10.method5537();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public void method756() {
		@Pc(2) Class211 local2 = this.aClass211_10;
		synchronized (this.aClass211_10) {
			this.aClass211_10.method5538(5);
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
	public void method757() {
		@Pc(2) Class211 local2 = this.aClass211_10;
		synchronized (this.aClass211_10) {
			this.aClass211_10.method5535();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)Lclient!of;")
	public Class240 method758(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_10;
		@Pc(16) Class240 local16;
		synchronized (this.aClass211_10) {
			local16 = (Class240) this.aClass211_10.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_9;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_9) {
			local38 = this.aClass254_9.method6401(11, arg0);
		}
		local16 = new Class240();
		if (local38 != null) {
			local16.method6072(new Class3_Sub7(local38));
		}
		@Pc(65) Class211 local65 = this.aClass211_10;
		synchronized (this.aClass211_10) {
			this.aClass211_10.method5529((long) arg0, local16);
			return local16;
		}
	}
}
