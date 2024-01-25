import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class378 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Lclient!aq;")
	private final Class22 aClass22_67 = new Class22(64);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!gga;")
	private final Class124 aClass124_131;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class378(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_131 = arg2;
		this.aClass124_131.method3629(31);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public void method9478() {
		@Pc(2) Class22 local2 = this.aClass22_67;
		synchronized (this.aClass22_67) {
			this.aClass22_67.method461();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method9481() {
		@Pc(11) Class22 local11 = this.aClass22_67;
		synchronized (this.aClass22_67) {
			this.aClass22_67.method473();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)V")
	public void method9482() {
		@Pc(2) Class22 local2 = this.aClass22_67;
		synchronized (this.aClass22_67) {
			this.aClass22_67.method468(5);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!caa;")
	public Class44 method9483(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_67;
		@Pc(16) Class44 local16;
		synchronized (this.aClass22_67) {
			local16 = (Class44) this.aClass22_67.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class124 local34 = this.aClass124_131;
		@Pc(45) byte[] local45;
		synchronized (this.aClass124_131) {
			local45 = this.aClass124_131.method3641(31, arg0);
		}
		local16 = new Class44();
		if (local45 != null) {
			local16.method1191(new Class2_Sub8(local45));
		}
		@Pc(67) Class22 local67 = this.aClass22_67;
		synchronized (this.aClass22_67) {
			this.aClass22_67.method470((long) arg0, local16);
			return local16;
		}
	}
}
