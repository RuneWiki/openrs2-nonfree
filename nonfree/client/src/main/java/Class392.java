import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class392 {

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "Lclient!aq;")
	private final Class22 aClass22_69 = new Class22(64);

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Lclient!gga;")
	private final Class124 aClass124_132;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class392(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_132 = arg2;
		if (this.aClass124_132 != null) {
			this.aClass124_132.method3629(35);
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	public void method9733() {
		@Pc(6) Class22 local6 = this.aClass22_69;
		synchronized (this.aClass22_69) {
			this.aClass22_69.method473();
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
	public void method9734() {
		@Pc(10) Class22 local10 = this.aClass22_69;
		synchronized (this.aClass22_69) {
			this.aClass22_69.method461();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)V")
	public void method9735() {
		@Pc(6) Class22 local6 = this.aClass22_69;
		synchronized (this.aClass22_69) {
			this.aClass22_69.method468(5);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)Lclient!mm;")
	public Class235 method9736(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_69;
		@Pc(16) Class235 local16;
		synchronized (this.aClass22_69) {
			local16 = (Class235) this.aClass22_69.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_132;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_132) {
			local38 = this.aClass124_132.method3641(35, arg0);
		}
		local16 = new Class235();
		if (local38 != null) {
			local16.method6408(new Class2_Sub8(local38));
		}
		local16.method6407();
		@Pc(71) Class22 local71 = this.aClass22_69;
		synchronized (this.aClass22_69) {
			this.aClass22_69.method470((long) arg0, local16);
			return local16;
		}
	}
}
