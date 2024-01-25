import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class55 {

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!fba;")
	private final Class102 aClass102_10 = new Class102(64);

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!la;")
	private final Class196 aClass196_26;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class55(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_26 = arg2;
		if (this.aClass196_26 != null) {
			this.aClass196_26.method5118(11);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
	public void method1842() {
		@Pc(10) Class102 local10 = this.aClass102_10;
		synchronized (this.aClass102_10) {
			this.aClass102_10.method2668(5);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!rs;")
	public Class300 method1843(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_10;
		@Pc(16) Class300 local16;
		synchronized (this.aClass102_10) {
			local16 = (Class300) this.aClass102_10.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_26;
		@Pc(40) byte[] local40;
		synchronized (this.aClass196_26) {
			local40 = this.aClass196_26.method5102(11, arg0);
		}
		local16 = new Class300();
		if (local40 != null) {
			local16.method7430(new Class3_Sub3(local40));
		}
		@Pc(62) Class102 local62 = this.aClass102_10;
		synchronized (this.aClass102_10) {
			this.aClass102_10.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method1844() {
		@Pc(2) Class102 local2 = this.aClass102_10;
		synchronized (this.aClass102_10) {
			this.aClass102_10.method2680();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method1845() {
		@Pc(2) Class102 local2 = this.aClass102_10;
		synchronized (this.aClass102_10) {
			this.aClass102_10.method2681();
		}
	}
}
