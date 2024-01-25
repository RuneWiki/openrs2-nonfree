import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class97 {

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!aq;")
	private final Class22 aClass22_13 = new Class22(64);

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Lclient!gga;")
	private final Class124 aClass124_39;

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public final int anInt2715;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class97(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_39 = arg2;
		this.anInt2715 = this.aClass124_39.method3629(19);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)Lclient!iw;")
	public Class174 method2526(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_13;
		@Pc(16) Class174 local16;
		synchronized (this.aClass22_13) {
			local16 = (Class174) this.aClass22_13.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class124 local37 = this.aClass124_39;
		@Pc(46) byte[] local46;
		synchronized (this.aClass124_39) {
			local46 = this.aClass124_39.method3641(19, arg0);
		}
		local16 = new Class174();
		if (local46 != null) {
			local16.method4578(new Class2_Sub8(local46));
		}
		@Pc(68) Class22 local68 = this.aClass22_13;
		synchronized (this.aClass22_13) {
			this.aClass22_13.method470((long) arg0, local16);
			return local16;
		}
	}
}
