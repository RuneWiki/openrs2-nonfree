import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class240 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "Lclient!jk;")
	private final Class137 aClass137_53 = new Class137(64);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!qn;")
	private final Class211 aClass211_84;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class240(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_84 = arg2;
		if (this.aClass211_84 != null) {
			this.aClass211_84.method4365(11);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)Lclient!uk;")
	public Class247 method5128(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_53;
		@Pc(24) Class247 local24;
		synchronized (this.aClass137_53) {
			local24 = (Class247) this.aClass137_53.method2744((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class211 local37 = this.aClass211_84;
		@Pc(46) byte[] local46;
		synchronized (this.aClass211_84) {
			local46 = this.aClass211_84.method4377(11, arg0);
		}
		local24 = new Class247();
		if (local46 != null) {
			local24.method5557(new Class4_Sub9(local46));
		}
		@Pc(68) Class137 local68 = this.aClass137_53;
		synchronized (this.aClass137_53) {
			this.aClass137_53.method2732((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public void method5129() {
		@Pc(6) Class137 local6 = this.aClass137_53;
		synchronized (this.aClass137_53) {
			this.aClass137_53.method2745(5);
		}
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public void method5132() {
		@Pc(2) Class137 local2 = this.aClass137_53;
		synchronized (this.aClass137_53) {
			this.aClass137_53.method2739();
		}
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	public void method5133() {
		@Pc(6) Class137 local6 = this.aClass137_53;
		synchronized (this.aClass137_53) {
			this.aClass137_53.method2737();
		}
	}
}
