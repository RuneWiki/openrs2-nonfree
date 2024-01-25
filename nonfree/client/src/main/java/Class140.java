import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class140 {

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!aq;")
	private Class22 aClass22_19 = new Class22(64);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!gga;")
	private final Class124 aClass124_48;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class140(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_48 = arg2;
		if (this.aClass124_48 != null) {
			@Pc(20) int local20 = this.aClass124_48.method3633() - 1;
			this.aClass124_48.method3629(local20);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public void method4034() {
		@Pc(2) Class22 local2 = this.aClass22_19;
		synchronized (this.aClass22_19) {
			this.aClass22_19.method468(5);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public void method4035() {
		@Pc(6) Class22 local6 = this.aClass22_19;
		synchronized (this.aClass22_19) {
			this.aClass22_19.method461();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
	public void method4037(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_19;
		synchronized (this.aClass22_19) {
			this.aClass22_19.method461();
			this.aClass22_19 = new Class22(arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public void method4038() {
		@Pc(6) Class22 local6 = this.aClass22_19;
		synchronized (this.aClass22_19) {
			this.aClass22_19.method473();
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Lclient!ls;")
	public Class224 method4039(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_19;
		@Pc(22) Class224 local22;
		synchronized (this.aClass22_19) {
			local22 = (Class224) this.aClass22_19.method462((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class124 local35 = this.aClass124_48;
		@Pc(48) byte[] local48;
		synchronized (this.aClass124_48) {
			local48 = this.aClass124_48.method3641(Static45.method948(arg0), Static93.method9380(arg0));
		}
		local22 = new Class224();
		if (local48 != null) {
			local22.method6091(new Class2_Sub8(local48));
		}
		@Pc(70) Class22 local70 = this.aClass22_19;
		synchronized (this.aClass22_19) {
			this.aClass22_19.method470((long) arg0, local22);
			return local22;
		}
	}
}
