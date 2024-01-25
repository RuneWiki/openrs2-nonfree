import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class77 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!aq;")
	private final Class22 aClass22_9 = new Class22(64);

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Lclient!gga;")
	private final Class124 aClass124_28;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class77(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_28 = arg2;
		this.aClass124_28.method3629(5);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Lclient!gi;")
	public Class2_Sub1_Sub7 method1973(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_9;
		@Pc(22) Class2_Sub1_Sub7 local22;
		synchronized (this.aClass22_9) {
			local22 = (Class2_Sub1_Sub7) this.aClass22_9.method462((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class124 local35 = this.aClass124_28;
		@Pc(44) byte[] local44;
		synchronized (this.aClass124_28) {
			local44 = this.aClass124_28.method3641(5, arg0);
		}
		local22 = new Class2_Sub1_Sub7();
		if (local44 != null) {
			local22.method3721(new Class2_Sub8(local44));
		}
		@Pc(66) Class22 local66 = this.aClass22_9;
		synchronized (this.aClass22_9) {
			this.aClass22_9.method470((long) arg0, local22);
			return local22;
		}
	}
}
