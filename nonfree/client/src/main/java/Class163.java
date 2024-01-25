import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class163 {

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "Lclient!ku;")
	private Class139 aClass139_47 = new Class139(64);

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!b;")
	private final Class20 aClass20_52;

	static {
		new Class57("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class163(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_52 = arg2;
		if (this.aClass20_52 != null) {
			@Pc(20) int local20 = this.aClass20_52.method229() - 1;
			this.aClass20_52.method231(local20);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	public void method3737() {
		@Pc(12) Class139 local12 = this.aClass139_47;
		synchronized (this.aClass139_47) {
			this.aClass139_47.method3072();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IB)V")
	public void method3738() {
		@Pc(6) Class139 local6 = this.aClass139_47;
		synchronized (this.aClass139_47) {
			this.aClass139_47.method3083(5);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)Lclient!ed;")
	public Class66 method3739(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_47;
		@Pc(18) Class66 local18;
		synchronized (this.aClass139_47) {
			local18 = (Class66) this.aClass139_47.method3076((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass20_52.method253(Static268.method4250(arg0), Static369.method5527(arg0));
		local18 = new Class66();
		if (local39 != null) {
			local18.method1317(new Class3_Sub5(local39));
		}
		@Pc(55) Class139 local55 = this.aClass139_47;
		synchronized (this.aClass139_47) {
			this.aClass139_47.method3070(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V")
	public void method3740(@OriginalArg(0) int arg0) {
		@Pc(2) Class139 local2 = this.aClass139_47;
		synchronized (this.aClass139_47) {
			this.aClass139_47.method3075();
			this.aClass139_47 = new Class139(arg0);
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(Z)V")
	public void method3743() {
		@Pc(6) Class139 local6 = this.aClass139_47;
		synchronized (this.aClass139_47) {
			this.aClass139_47.method3075();
		}
	}
}
