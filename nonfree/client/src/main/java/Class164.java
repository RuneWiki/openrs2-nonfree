import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class164 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!aq;")
	private final Class22 aClass22_20 = new Class22(128);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!gga;")
	private final Class124 aClass124_55;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class164(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_55 = arg2;
		if (this.aClass124_55 != null) {
			@Pc(20) int local20 = this.aClass124_55.method3633() - 1;
			this.aClass124_55.method3629(local20);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!pt;")
	public Class289 method4433(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_20;
		@Pc(16) Class289 local16;
		synchronized (this.aClass22_20) {
			local16 = (Class289) this.aClass22_20.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass124_55.method3641(Static59.method1125(arg0), Static222.method4083(arg0));
		local16 = new Class289();
		if (local45 != null) {
			local16.method7511(new Class2_Sub8(local45));
		}
		@Pc(61) Class22 local61 = this.aClass22_20;
		synchronized (this.aClass22_20) {
			this.aClass22_20.method470((long) arg0, local16);
			return local16;
		}
	}
}
