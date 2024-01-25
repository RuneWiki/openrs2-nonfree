import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class269 {

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!pa;")
	private final Class265 aClass265_49 = new Class265(128);

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "Lclient!cb;")
	private final Class50 aClass50_127;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class269(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_127 = arg2;
		this.aClass50_127.method913(1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)Lclient!so;")
	public Class327 method6615(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_49;
		@Pc(16) Class327 local16;
		synchronized (this.aClass265_49) {
			local16 = (Class327) this.aClass265_49.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_127;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_127) {
			local38 = this.aClass50_127.method916(arg0, 1);
		}
		local16 = new Class327();
		if (local38 != null) {
			local16.method7541(new Class5_Sub15(local38));
		}
		@Pc(67) Class265 local67 = this.aClass265_49;
		synchronized (this.aClass265_49) {
			this.aClass265_49.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V")
	public void method6618() {
		@Pc(10) Class265 local10 = this.aClass265_49;
		synchronized (this.aClass265_49) {
			this.aClass265_49.method6573();
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)V")
	public void method6620() {
		@Pc(2) Class265 local2 = this.aClass265_49;
		synchronized (this.aClass265_49) {
			this.aClass265_49.method6570(5);
		}
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V")
	public void method6621() {
		@Pc(2) Class265 local2 = this.aClass265_49;
		synchronized (this.aClass265_49) {
			this.aClass265_49.method6568();
		}
	}
}
