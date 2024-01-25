import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class8 {

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Lclient!fba;")
	private final Class102 aClass102_1 = new Class102(64);

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "Lclient!la;")
	private final Class196 aClass196_3;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class8(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_3 = arg2;
		if (this.aClass196_3 != null) {
			this.aClass196_3.method5118(35);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Lclient!fi;")
	public Class110 method665(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_1;
		@Pc(16) Class110 local16;
		synchronized (this.aClass102_1) {
			local16 = (Class110) this.aClass102_1.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_3;
		@Pc(38) byte[] local38;
		synchronized (this.aClass196_3) {
			local38 = this.aClass196_3.method5102(35, arg0);
		}
		local16 = new Class110();
		if (local38 != null) {
			local16.method2823(new Class3_Sub3(local38));
		}
		local16.method2828();
		@Pc(63) Class102 local63 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
	public void method668() {
		@Pc(7) Class102 local7 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2680();
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZI)V")
	public void method669() {
		@Pc(6) Class102 local6 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2668(5);
		}
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)V")
	public void method670() {
		@Pc(2) Class102 local2 = this.aClass102_1;
		synchronized (this.aClass102_1) {
			this.aClass102_1.method2681();
		}
	}
}
