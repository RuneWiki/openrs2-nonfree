import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class188 {

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Lclient!me;")
	private final Class211 aClass211_43 = new Class211(64);

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "Lclient!pe;")
	private final Class254 aClass254_81;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class188(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_81 = arg2;
		this.aClass254_81.method6396(32);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)Lclient!jh;")
	public Class171 method4910(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_43;
		@Pc(16) Class171 local16;
		synchronized (this.aClass211_43) {
			local16 = (Class171) this.aClass211_43.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_81;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_81) {
			local38 = this.aClass254_81.method6401(32, arg0);
		}
		local16 = new Class171();
		if (local38 != null) {
			local16.method4286(new Class3_Sub7(local38));
		}
		@Pc(60) Class211 local60 = this.aClass211_43;
		synchronized (this.aClass211_43) {
			this.aClass211_43.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	public void method4911() {
		@Pc(12) Class211 local12 = this.aClass211_43;
		synchronized (this.aClass211_43) {
			this.aClass211_43.method5537();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public void method4913() {
		@Pc(14) Class211 local14 = this.aClass211_43;
		synchronized (this.aClass211_43) {
			this.aClass211_43.method5535();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
	public void method4914() {
		@Pc(2) Class211 local2 = this.aClass211_43;
		synchronized (this.aClass211_43) {
			this.aClass211_43.method5538(5);
		}
	}
}
