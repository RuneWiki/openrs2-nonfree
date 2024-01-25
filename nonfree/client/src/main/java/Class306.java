import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class306 {

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "Lclient!fba;")
	private final Class102 aClass102_56 = new Class102(16);

	@OriginalMember(owner = "client!sea", name = "h", descriptor = "Lclient!la;")
	private final Class196 aClass196_107;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class306(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_107 = arg2;
		this.aClass196_107.method5118(30);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BI)V")
	public void method7660() {
		@Pc(11) Class102 local11 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2668(5);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Lclient!gea;")
	public Class124 method7662(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_56;
		@Pc(18) Class124 local18;
		synchronized (this.aClass102_56) {
			local18 = (Class124) this.aClass102_56.method2677((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(36) Class196 local36 = this.aClass196_107;
		@Pc(47) byte[] local47;
		synchronized (this.aClass196_107) {
			local47 = this.aClass196_107.method5102(30, arg0);
		}
		local18 = new Class124();
		if (local47 != null) {
			local18.method3084(new Class3_Sub3(local47));
		}
		@Pc(69) Class102 local69 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2674((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
	public void method7663() {
		@Pc(2) Class102 local2 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2680();
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	public void method7664() {
		@Pc(12) Class102 local12 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2681();
		}
	}
}
