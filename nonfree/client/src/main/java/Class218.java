import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class218 {

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!wi;")
	private final Class268 aClass268_51 = new Class268(128);

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!uu;")
	private final Class250 aClass250_89;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class218(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_89 = arg2;
		if (this.aClass250_89 != null) {
			@Pc(20) int local20 = this.aClass250_89.method5819() - 1;
			this.aClass250_89.method5815(local20);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)Lclient!ur;")
	public Class249 method5113(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_51;
		@Pc(16) Class249 local16;
		synchronized (this.aClass268_51) {
			local16 = (Class249) this.aClass268_51.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass250_89.method5806(Static182.method2877(arg0), Static111.method1819(arg0));
		local16 = new Class249();
		if (local37 != null) {
			local16.method5770(new Class3_Sub25(local37));
		}
		@Pc(58) Class268 local58 = this.aClass268_51;
		synchronized (this.aClass268_51) {
			this.aClass268_51.method6164(local16, (long) arg0);
			return local16;
		}
	}
}
