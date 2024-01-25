import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class286 {

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!pa;")
	private final Class265 aClass265_52 = new Class265(16);

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!cb;")
	private final Class50 aClass50_139;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class286(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_139 = arg2;
		this.aClass50_139.method913(30);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public void method7023() {
		@Pc(2) Class265 local2 = this.aClass265_52;
		synchronized (this.aClass265_52) {
			this.aClass265_52.method6570(5);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Lclient!paa;")
	public Class266 method7024(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_52;
		@Pc(16) Class266 local16;
		synchronized (this.aClass265_52) {
			local16 = (Class266) this.aClass265_52.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_139;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_139) {
			local38 = this.aClass50_139.method916(arg0, 30);
		}
		local16 = new Class266();
		if (local38 != null) {
			local16.method6584(new Class5_Sub15(local38));
		}
		@Pc(68) Class265 local68 = this.aClass265_52;
		synchronized (this.aClass265_52) {
			this.aClass265_52.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public void method7025() {
		@Pc(2) Class265 local2 = this.aClass265_52;
		synchronized (this.aClass265_52) {
			this.aClass265_52.method6573();
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V")
	public void method7027() {
		@Pc(6) Class265 local6 = this.aClass265_52;
		synchronized (this.aClass265_52) {
			this.aClass265_52.method6568();
		}
	}
}
