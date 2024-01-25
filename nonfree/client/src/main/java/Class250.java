import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class250 {

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "Lclient!pa;")
	private final Class265 aClass265_45 = new Class265(64);

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_117;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class250(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_117 = arg2;
		if (this.aClass50_117 != null) {
			this.aClass50_117.method913(35);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lclient!cu;")
	public Class69 method5938(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_45;
		@Pc(16) Class69 local16;
		synchronized (this.aClass265_45) {
			local16 = (Class69) this.aClass265_45.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_117;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_117) {
			local38 = this.aClass50_117.method916(arg0, 35);
		}
		local16 = new Class69();
		if (local38 != null) {
			local16.method1380(new Class5_Sub15(local38));
		}
		local16.method1381();
		@Pc(63) Class265 local63 = this.aClass265_45;
		synchronized (this.aClass265_45) {
			this.aClass265_45.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public void method5939() {
		@Pc(14) Class265 local14 = this.aClass265_45;
		synchronized (this.aClass265_45) {
			this.aClass265_45.method6568();
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public void method5940() {
		@Pc(13) Class265 local13 = this.aClass265_45;
		synchronized (this.aClass265_45) {
			this.aClass265_45.method6573();
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)V")
	public void method5942() {
		@Pc(6) Class265 local6 = this.aClass265_45;
		synchronized (this.aClass265_45) {
			this.aClass265_45.method6570(5);
		}
	}
}
