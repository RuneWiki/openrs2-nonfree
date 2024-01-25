import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class187 {

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!me;")
	private final Class211 aClass211_42 = new Class211(64);

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Lclient!pe;")
	private final Class254 aClass254_79;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class187(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_79 = arg2;
		if (this.aClass254_79 != null) {
			this.aClass254_79.method6396(35);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)V")
	public void method4848() {
		@Pc(2) Class211 local2 = this.aClass211_42;
		synchronized (this.aClass211_42) {
			this.aClass211_42.method5538(5);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)Lclient!dk;")
	public Class63 method4849(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_42;
		@Pc(16) Class63 local16;
		synchronized (this.aClass211_42) {
			local16 = (Class63) this.aClass211_42.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_79) {
			local38 = this.aClass254_79.method6401(35, arg0);
		}
		local16 = new Class63();
		if (local38 != null) {
			local16.method2094(new Class3_Sub7(local38));
		}
		local16.method2092();
		@Pc(63) Class211 local63 = this.aClass211_42;
		synchronized (this.aClass211_42) {
			this.aClass211_42.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public void method4851() {
		@Pc(2) Class211 local2 = this.aClass211_42;
		synchronized (this.aClass211_42) {
			this.aClass211_42.method5535();
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public void method4853() {
		@Pc(2) Class211 local2 = this.aClass211_42;
		synchronized (this.aClass211_42) {
			this.aClass211_42.method5537();
		}
	}
}
