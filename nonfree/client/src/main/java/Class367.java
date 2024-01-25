import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class367 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!aq;")
	private final Class22 aClass22_65 = new Class22(64);

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!gga;")
	private final Class124 aClass124_126;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class367(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_126 = arg2;
		if (this.aClass124_126 != null) {
			this.aClass124_126.method3629(11);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!kt;")
	public Class204 method9243(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_65;
		@Pc(16) Class204 local16;
		synchronized (this.aClass22_65) {
			local16 = (Class204) this.aClass22_65.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_126;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_126) {
			local38 = this.aClass124_126.method3641(11, arg0);
		}
		local16 = new Class204();
		if (local38 != null) {
			local16.method5367(new Class2_Sub8(local38));
		}
		@Pc(60) Class22 local60 = this.aClass22_65;
		synchronized (this.aClass22_65) {
			this.aClass22_65.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public void method9244() {
		@Pc(2) Class22 local2 = this.aClass22_65;
		synchronized (this.aClass22_65) {
			this.aClass22_65.method468(5);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public void method9245() {
		@Pc(12) Class22 local12 = this.aClass22_65;
		synchronized (this.aClass22_65) {
			this.aClass22_65.method473();
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public void method9247() {
		@Pc(2) Class22 local2 = this.aClass22_65;
		synchronized (this.aClass22_65) {
			this.aClass22_65.method461();
		}
	}
}
