import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class124 {

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Lclient!kh;")
	private final Class134 aClass134_29 = new Class134(256);

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Lclient!ul;")
	private final Class246 aClass246_112;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class124(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_112 = arg2;
		this.aClass246_112.method5492(26);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lclient!au;")
	public Class1_Sub2_Sub2 method2964(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_29;
		@Pc(18) Class1_Sub2_Sub2 local18;
		synchronized (this.aClass134_29) {
			local18 = (Class1_Sub2_Sub2) this.aClass134_29.method3266((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(38) Class246 local38 = this.aClass246_112;
		@Pc(47) byte[] local47;
		synchronized (this.aClass246_112) {
			local47 = this.aClass246_112.method5477(26, arg0);
		}
		local18 = new Class1_Sub2_Sub2();
		if (local47 != null) {
			local18.method503(new Class1_Sub5(local47));
		}
		@Pc(69) Class134 local69 = this.aClass134_29;
		synchronized (this.aClass134_29) {
			this.aClass134_29.method3263((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public void method2967() {
		@Pc(6) Class134 local6 = this.aClass134_29;
		synchronized (this.aClass134_29) {
			this.aClass134_29.method3267();
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public void method2968() {
		@Pc(6) Class134 local6 = this.aClass134_29;
		synchronized (this.aClass134_29) {
			this.aClass134_29.method3272();
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V")
	public void method2970() {
		@Pc(11) Class134 local11 = this.aClass134_29;
		synchronized (this.aClass134_29) {
			this.aClass134_29.method3270(5);
		}
	}
}
