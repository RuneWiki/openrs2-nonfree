import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class359 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!aq;")
	private final Class22 aClass22_64 = new Class22(128);

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!gga;")
	private final Class124 aClass124_123;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class359(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_123 = arg2;
		this.aClass124_123.method3629(1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
	public void method9049() {
		@Pc(2) Class22 local2 = this.aClass22_64;
		synchronized (this.aClass22_64) {
			this.aClass22_64.method468(5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(Z)V")
	public void method9052() {
		@Pc(6) Class22 local6 = this.aClass22_64;
		synchronized (this.aClass22_64) {
			this.aClass22_64.method473();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lclient!naa;")
	public Class240 method9053(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_64;
		@Pc(16) Class240 local16;
		synchronized (this.aClass22_64) {
			local16 = (Class240) this.aClass22_64.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_123;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_123) {
			local38 = this.aClass124_123.method3641(1, arg0);
		}
		local16 = new Class240();
		if (local38 != null) {
			local16.method6531(new Class2_Sub8(local38));
		}
		@Pc(60) Class22 local60 = this.aClass22_64;
		synchronized (this.aClass22_64) {
			this.aClass22_64.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public void method9054() {
		@Pc(2) Class22 local2 = this.aClass22_64;
		synchronized (this.aClass22_64) {
			this.aClass22_64.method461();
		}
	}
}
