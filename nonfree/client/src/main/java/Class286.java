import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class286 {

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "Lclient!fba;")
	private final Class102 aClass102_49 = new Class102(64);

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "Lclient!la;")
	public final Class196 aClass196_100;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "Lclient!la;")
	private final Class196 aClass196_99;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;Lclient!la;)V")
	public Class286(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class196 arg3) {
		this.aClass196_100 = arg3;
		this.aClass196_99 = arg2;
		this.aClass196_99.method5118(3);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)V")
	public void method7180() {
		@Pc(2) Class102 local2 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2668(5);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	public void method7181() {
		@Pc(12) Class102 local12 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2680();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	public void method7183() {
		@Pc(2) Class102 local2 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2681();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)Lclient!or;")
	public Class253 method7188(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_49;
		@Pc(18) Class253 local18;
		synchronized (this.aClass102_49) {
			local18 = (Class253) this.aClass102_49.method2677((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class196 local31 = this.aClass196_99;
		@Pc(42) byte[] local42;
		synchronized (this.aClass196_99) {
			local42 = this.aClass196_99.method5102(3, arg0);
		}
		local18 = new Class253();
		local18.aClass286_3 = this;
		if (local42 != null) {
			local18.method6517(new Class3_Sub3(local42));
		}
		@Pc(67) Class102 local67 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2674((long) arg0, local18);
			return local18;
		}
	}
}
