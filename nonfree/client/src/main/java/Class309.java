import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class309 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lclient!pa;")
	private final Class265 aClass265_57 = new Class265(128);

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Lclient!cb;")
	private final Class50 aClass50_152;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class309(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_152 = arg2;
		if (this.aClass50_152 != null) {
			@Pc(20) int local20 = this.aClass50_152.method902() - 1;
			this.aClass50_152.method913(local20);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lclient!dp;")
	public Class82 method7317(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_57;
		@Pc(16) Class82 local16;
		synchronized (this.aClass265_57) {
			local16 = (Class82) this.aClass265_57.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass50_152.method916(Static162.method6707(arg0), Static674.method1632(arg0));
		local16 = new Class82();
		if (local37 != null) {
			local16.method1809(new Class5_Sub15(local37));
		}
		@Pc(60) Class265 local60 = this.aClass265_57;
		synchronized (this.aClass265_57) {
			this.aClass265_57.method6566(local16, (long) arg0);
			return local16;
		}
	}
}
