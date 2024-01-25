import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class388 {

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!pa;")
	private final Class265 aClass265_64 = new Class265(64);

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!cb;")
	private final Class50 aClass50_184;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class388(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_184 = arg2;
		if (this.aClass50_184 != null) {
			this.aClass50_184.method913(54);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lclient!lj;")
	public Class220 method8583(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_64;
		@Pc(16) Class220 local16;
		synchronized (this.aClass265_64) {
			local16 = (Class220) this.aClass265_64.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_184;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_184) {
			local38 = this.aClass50_184.method916(arg0, 54);
		}
		local16 = new Class220();
		if (local38 != null) {
			local16.method5186(new Class5_Sub15(local38));
		}
		@Pc(60) Class265 local60 = this.aClass265_64;
		synchronized (this.aClass265_64) {
			this.aClass265_64.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public void method8584() {
		@Pc(2) Class265 local2 = this.aClass265_64;
		synchronized (this.aClass265_64) {
			this.aClass265_64.method6573();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method8588() {
		@Pc(14) Class265 local14 = this.aClass265_64;
		synchronized (this.aClass265_64) {
			this.aClass265_64.method6568();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
	public void method8590() {
		@Pc(2) Class265 local2 = this.aClass265_64;
		synchronized (this.aClass265_64) {
			this.aClass265_64.method6570(5);
		}
	}
}
