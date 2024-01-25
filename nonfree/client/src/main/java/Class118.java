import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class118 {

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!mf;")
	private final Class222 aClass222_19 = new Class222(128);

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "Lclient!pu;")
	private final Class270 aClass270_36;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class118(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_36 = arg2;
		if (this.aClass270_36 != null) {
			@Pc(20) int local20 = this.aClass270_36.method5674() - 1;
			this.aClass270_36.method5685(local20);
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)Lclient!ri;")
	public Class289 method2290(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_19;
		@Pc(16) Class289 local16;
		synchronized (this.aClass222_19) {
			local16 = (Class289) this.aClass222_19.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass270_36.method5704(Static547.method7477(arg0), Static460.method7714(arg0));
		local16 = new Class289();
		if (local45 != null) {
			local16.method6234(new Class1_Sub35(local45));
		}
		@Pc(61) Class222 local61 = this.aClass222_19;
		synchronized (this.aClass222_19) {
			this.aClass222_19.method4434(local16, (long) arg0);
			return local16;
		}
	}
}
