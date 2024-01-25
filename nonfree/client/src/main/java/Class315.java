import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class315 {

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "Lclient!fba;")
	private final Class102 aClass102_57 = new Class102(64);

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
	public int anInt9091 = 0;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "Lclient!la;")
	private final Class196 aClass196_111;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
	public final int anInt9083;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class315(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_111 = arg2;
		this.anInt9083 = this.aClass196_111.method5118(4);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public void method7802() {
		@Pc(6) Class102 local6 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2680();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)Lclient!hb;")
	public Class132 method7805(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_57;
		@Pc(18) Class132 local18;
		synchronized (this.aClass102_57) {
			local18 = (Class132) this.aClass102_57.method2677((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class196 local31 = this.aClass196_111;
		@Pc(42) byte[] local42;
		synchronized (this.aClass196_111) {
			local42 = this.aClass196_111.method5102(4, arg0);
		}
		local18 = new Class132();
		local18.aClass315_5 = this;
		local18.anInt3930 = arg0;
		if (local42 != null) {
			local18.method3477(new Class3_Sub3(local42));
		}
		local18.method3479();
		@Pc(78) Class102 local78 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2674((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	public void method7807() {
		@Pc(6) Class102 local6 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2668(5);
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
	public void method7808() {
		@Pc(2) Class102 local2 = this.aClass102_57;
		synchronized (this.aClass102_57) {
			this.aClass102_57.method2681();
		}
	}
}
