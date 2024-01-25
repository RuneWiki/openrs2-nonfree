import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class272 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!me;")
	private final Class211 aClass211_53 = new Class211(16);

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!pe;")
	private final Class254 aClass254_112;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class272(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_112 = arg2;
		this.aClass254_112.method6396(30);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Lclient!tga;")
	public Class311 method6854(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_53;
		@Pc(16) Class311 local16;
		synchronized (this.aClass211_53) {
			local16 = (Class311) this.aClass211_53.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_112;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_112) {
			local38 = this.aClass254_112.method6401(30, arg0);
		}
		local16 = new Class311();
		if (local38 != null) {
			local16.method7577(new Class3_Sub7(local38));
		}
		@Pc(60) Class211 local60 = this.aClass211_53;
		synchronized (this.aClass211_53) {
			this.aClass211_53.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public void method6855() {
		@Pc(6) Class211 local6 = this.aClass211_53;
		synchronized (this.aClass211_53) {
			this.aClass211_53.method5537();
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)V")
	public void method6857() {
		@Pc(2) Class211 local2 = this.aClass211_53;
		synchronized (this.aClass211_53) {
			this.aClass211_53.method5538(5);
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public void method6858() {
		@Pc(7) Class211 local7 = this.aClass211_53;
		synchronized (this.aClass211_53) {
			this.aClass211_53.method5535();
		}
	}
}
