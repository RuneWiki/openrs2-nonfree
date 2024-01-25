import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class318 {

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!hp;")
	private final Class125 aClass125_70 = new Class125(256);

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!kea;")
	private final Class161 aClass161_118;

	static {
		new Class67("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class318(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_118 = arg2;
		this.aClass161_118.method4266(26);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method7663() {
		@Pc(6) Class125 local6 = this.aClass125_70;
		synchronized (this.aClass125_70) {
			this.aClass125_70.method3516();
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	public void method7666() {
		@Pc(12) Class125 local12 = this.aClass125_70;
		synchronized (this.aClass125_70) {
			this.aClass125_70.method3521();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lclient!hba;")
	public Class3_Sub10_Sub7 method7667(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_70;
		@Pc(18) Class3_Sub10_Sub7 local18;
		synchronized (this.aClass125_70) {
			local18 = (Class3_Sub10_Sub7) this.aClass125_70.method3512((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class161 local31 = this.aClass161_118;
		@Pc(40) byte[] local40;
		synchronized (this.aClass161_118) {
			local40 = this.aClass161_118.method4243(arg0, 26);
		}
		local18 = new Class3_Sub10_Sub7();
		if (local40 != null) {
			local18.method3297(new Class3_Sub27(local40));
		}
		@Pc(62) Class125 local62 = this.aClass125_70;
		synchronized (this.aClass125_70) {
			this.aClass125_70.method3519((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
	public void method7669() {
		@Pc(6) Class125 local6 = this.aClass125_70;
		synchronized (this.aClass125_70) {
			this.aClass125_70.method3522(5);
		}
	}
}
