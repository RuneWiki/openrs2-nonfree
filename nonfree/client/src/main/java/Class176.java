import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class176 {

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "Lclient!aq;")
	private final Class22 aClass22_23 = new Class22(16);

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "Lclient!gga;")
	private final Class124 aClass124_59;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class176(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_59 = arg2;
		this.aClass124_59.method3629(30);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
	public void method4647() {
		@Pc(6) Class22 local6 = this.aClass22_23;
		synchronized (this.aClass22_23) {
			this.aClass22_23.method461();
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
	public void method4649() {
		@Pc(2) Class22 local2 = this.aClass22_23;
		synchronized (this.aClass22_23) {
			this.aClass22_23.method473();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
	public void method4650() {
		@Pc(12) Class22 local12 = this.aClass22_23;
		synchronized (this.aClass22_23) {
			this.aClass22_23.method468(5);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IB)Lclient!gaa;")
	public Class115 method4652(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_23;
		@Pc(16) Class115 local16;
		synchronized (this.aClass22_23) {
			local16 = (Class115) this.aClass22_23.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class124 local34 = this.aClass124_59;
		@Pc(43) byte[] local43;
		synchronized (this.aClass124_59) {
			local43 = this.aClass124_59.method3641(30, arg0);
		}
		local16 = new Class115();
		if (local43 != null) {
			local16.method3538(new Class2_Sub8(local43));
		}
		@Pc(65) Class22 local65 = this.aClass22_23;
		synchronized (this.aClass22_23) {
			this.aClass22_23.method470((long) arg0, local16);
			return local16;
		}
	}
}
