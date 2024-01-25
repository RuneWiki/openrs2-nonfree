import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class161 {

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "Lclient!pa;")
	private Class265 aClass265_22 = new Class265(64);

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "Lclient!pa;")
	public Class265 aClass265_23 = new Class265(64);

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Lclient!cb;")
	public final Class50 aClass50_63;

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_64;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!cb;)V")
	public Class161(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class50 arg3) {
		this.aClass50_63 = arg3;
		this.aClass50_64 = arg2;
		this.aClass50_64.method913(34);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)Lclient!wl;")
	public Class392 method3448(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_22;
		@Pc(16) Class392 local16;
		synchronized (this.aClass265_22) {
			local16 = (Class392) this.aClass265_22.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_64;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_64) {
			local38 = this.aClass50_64.method916(arg0, 34);
		}
		local16 = new Class392();
		local16.aClass161_4 = this;
		if (local38 != null) {
			local16.method8678(new Class5_Sub15(local38));
		}
		@Pc(69) Class265 local69 = this.aClass265_22;
		synchronized (this.aClass265_22) {
			this.aClass265_22.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)V")
	public void method3449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass265_22 = new Class265(arg0);
		this.aClass265_23 = new Class265(arg1);
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(BI)V")
	public void method3450() {
		@Pc(2) Class265 local2 = this.aClass265_22;
		synchronized (this.aClass265_22) {
			this.aClass265_22.method6570(5);
		}
		local2 = this.aClass265_23;
		synchronized (this.aClass265_23) {
			this.aClass265_23.method6570(5);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public void method3451() {
		@Pc(6) Class265 local6 = this.aClass265_22;
		synchronized (this.aClass265_22) {
			this.aClass265_22.method6568();
		}
		local6 = this.aClass265_23;
		synchronized (this.aClass265_23) {
			this.aClass265_23.method6568();
		}
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
	public void method3453() {
		@Pc(2) Class265 local2 = this.aClass265_22;
		synchronized (this.aClass265_22) {
			this.aClass265_22.method6573();
		}
		local2 = this.aClass265_23;
		synchronized (this.aClass265_23) {
			this.aClass265_23.method6573();
		}
	}
}
