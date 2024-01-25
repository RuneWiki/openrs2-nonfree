import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class118 {

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!pa;")
	private final Class265 aClass265_8 = new Class265(64);

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Lclient!cb;")
	private final Class50 aClass50_45;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class118(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_45 = arg2;
		this.aClass50_45.method913(31);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public void method2461() {
		@Pc(2) Class265 local2 = this.aClass265_8;
		synchronized (this.aClass265_8) {
			this.aClass265_8.method6573();
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)Lclient!rea;")
	public Class302 method2463(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_8;
		@Pc(16) Class302 local16;
		synchronized (this.aClass265_8) {
			local16 = (Class302) this.aClass265_8.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_45;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_45) {
			local38 = this.aClass50_45.method916(arg0, 31);
		}
		local16 = new Class302();
		if (local38 != null) {
			local16.method7239(new Class5_Sub15(local38));
		}
		@Pc(60) Class265 local60 = this.aClass265_8;
		synchronized (this.aClass265_8) {
			this.aClass265_8.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)V")
	public void method2464() {
		@Pc(8) Class265 local8 = this.aClass265_8;
		synchronized (this.aClass265_8) {
			this.aClass265_8.method6570(5);
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public void method2465() {
		@Pc(6) Class265 local6 = this.aClass265_8;
		synchronized (this.aClass265_8) {
			this.aClass265_8.method6568();
		}
	}
}
