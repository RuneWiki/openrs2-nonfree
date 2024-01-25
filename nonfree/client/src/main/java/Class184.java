import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class184 {

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!aq;")
	private final Class22 aClass22_24 = new Class22(64);

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Lclient!gga;")
	private final Class124 aClass124_62;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class184(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_62 = arg2;
		if (this.aClass124_62 != null) {
			this.aClass124_62.method3629(54);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
	public void method4779() {
		@Pc(2) Class22 local2 = this.aClass22_24;
		synchronized (this.aClass22_24) {
			this.aClass22_24.method468(5);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method4780() {
		@Pc(2) Class22 local2 = this.aClass22_24;
		synchronized (this.aClass22_24) {
			this.aClass22_24.method461();
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public void method4781() {
		@Pc(2) Class22 local2 = this.aClass22_24;
		synchronized (this.aClass22_24) {
			this.aClass22_24.method473();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lclient!wg;")
	public Class387 method4782(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_24;
		@Pc(16) Class387 local16;
		synchronized (this.aClass22_24) {
			local16 = (Class387) this.aClass22_24.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_62;
		@Pc(40) byte[] local40;
		synchronized (this.aClass124_62) {
			local40 = this.aClass124_62.method3641(54, arg0);
		}
		local16 = new Class387();
		if (local40 != null) {
			local16.method9625(new Class2_Sub8(local40));
		}
		@Pc(67) Class22 local67 = this.aClass22_24;
		synchronized (this.aClass22_24) {
			this.aClass22_24.method470((long) arg0, local16);
			return local16;
		}
	}
}
