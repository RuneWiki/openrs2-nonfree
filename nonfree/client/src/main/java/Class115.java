import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class115 {

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lclient!pa;")
	public final Class265 aClass265_6 = new Class265(20);

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lclient!pa;")
	private final Class265 aClass265_7 = new Class265(64);

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "Lclient!cb;")
	public final Class50 aClass50_44;

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lclient!cb;")
	private final Class50 aClass50_43;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!cb;)V")
	public Class115(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class50 arg3) {
		this.aClass50_44 = arg3;
		this.aClass50_43 = arg2;
		this.aClass50_43.method913(46);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V")
	public void method2370() {
		@Pc(6) Class265 local6 = this.aClass265_7;
		synchronized (this.aClass265_7) {
			this.aClass265_7.method6570(5);
		}
		local6 = this.aClass265_6;
		synchronized (this.aClass265_6) {
			this.aClass265_6.method6570(5);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	public void method2372() {
		@Pc(6) Class265 local6 = this.aClass265_7;
		synchronized (this.aClass265_7) {
			this.aClass265_7.method6568();
		}
		local6 = this.aClass265_6;
		synchronized (this.aClass265_6) {
			this.aClass265_6.method6568();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V")
	public void method2373() {
		@Pc(10) Class265 local10 = this.aClass265_7;
		synchronized (this.aClass265_7) {
			this.aClass265_7.method6573();
		}
		local10 = this.aClass265_6;
		synchronized (this.aClass265_6) {
			this.aClass265_6.method6573();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)Lclient!gd;")
	public Class126 method2374(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_7;
		@Pc(16) Class126 local16;
		synchronized (this.aClass265_7) {
			local16 = (Class126) this.aClass265_7.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_43;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_43) {
			local38 = this.aClass50_43.method916(arg0, 46);
		}
		local16 = new Class126();
		local16.aClass115_1 = this;
		if (local38 != null) {
			local16.method2642(new Class5_Sub15(local38));
		}
		@Pc(71) Class265 local71 = this.aClass265_7;
		synchronized (this.aClass265_7) {
			this.aClass265_7.method6566(local16, (long) arg0);
			return local16;
		}
	}
}
