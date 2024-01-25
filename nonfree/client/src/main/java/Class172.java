import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class172 {

	@OriginalMember(owner = "client!it", name = "h", descriptor = "Lclient!pa;")
	private final Class265 aClass265_24 = new Class265(64);

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!cb;")
	private final Class50 aClass50_67;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "Lclient!hb;")
	public final Class145 aClass145_2;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!hb;)V")
	public Class172(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class145 arg3) {
		this.aClass50_67 = arg2;
		this.aClass50_67.method913(32);
		this.aClass145_2 = arg3;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)Lclient!kha;")
	public Class201 method3615(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_24;
		@Pc(16) Class201 local16;
		synchronized (this.aClass265_24) {
			local16 = (Class201) this.aClass265_24.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_67;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_67) {
			local38 = this.aClass50_67.method916(arg0, 32);
		}
		local16 = new Class201();
		local16.aClass172_2 = this;
		if (local38 != null) {
			local16.method4161(new Class5_Sub15(local38));
		}
		@Pc(71) Class265 local71 = this.aClass265_24;
		synchronized (this.aClass265_24) {
			this.aClass265_24.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public void method3616() {
		@Pc(6) Class265 local6 = this.aClass265_24;
		synchronized (this.aClass265_24) {
			this.aClass265_24.method6568();
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public void method3618() {
		@Pc(11) Class265 local11 = this.aClass265_24;
		synchronized (this.aClass265_24) {
			this.aClass265_24.method6573();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
	public void method3620() {
		@Pc(2) Class265 local2 = this.aClass265_24;
		synchronized (this.aClass265_24) {
			this.aClass265_24.method6570(5);
		}
	}
}
