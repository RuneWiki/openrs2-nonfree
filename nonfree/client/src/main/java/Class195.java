import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class195 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Lclient!ku;")
	private Class139 aClass139_59 = new Class139(128);

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "Lclient!ku;")
	public Class139 aClass139_60 = new Class139(64);

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!b;")
	private final Class20 aClass20_67;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!b;")
	public final Class20 aClass20_68;

	static {
		new Class57("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;Lclient!b;)V")
	public Class195(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3) {
		this.aClass20_67 = arg2;
		this.aClass20_68 = arg3;
		this.aClass20_67.method231(36);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public void method4495() {
		@Pc(2) Class139 local2 = this.aClass139_59;
		synchronized (this.aClass139_59) {
			this.aClass139_59.method3072();
		}
		local2 = this.aClass139_60;
		synchronized (this.aClass139_60) {
			this.aClass139_60.method3072();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	public void method4496() {
		@Pc(2) Class139 local2 = this.aClass139_59;
		synchronized (this.aClass139_59) {
			this.aClass139_59.method3083(5);
		}
		local2 = this.aClass139_60;
		synchronized (this.aClass139_60) {
			this.aClass139_60.method3083(5);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	public void method4497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass139_59 = new Class139(arg0);
		this.aClass139_60 = new Class139(arg1);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	public void method4499() {
		@Pc(2) Class139 local2 = this.aClass139_59;
		synchronized (this.aClass139_59) {
			this.aClass139_59.method3075();
		}
		local2 = this.aClass139_60;
		synchronized (this.aClass139_60) {
			this.aClass139_60.method3075();
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)Lclient!qo;")
	public Class196 method4500(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_59;
		@Pc(16) Class196 local16;
		synchronized (this.aClass139_59) {
			local16 = (Class196) this.aClass139_59.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass20_67.method253(arg0, 36);
		local16 = new Class196();
		local16.anInt5023 = arg0;
		local16.aClass195_3 = this;
		if (local33 != null) {
			local16.method4506(new Class3_Sub5(local33));
		}
		local16.method4511();
		@Pc(58) Class139 local58 = this.aClass139_59;
		synchronized (this.aClass139_59) {
			this.aClass139_59.method3070(local16, (long) arg0);
			return local16;
		}
	}
}
