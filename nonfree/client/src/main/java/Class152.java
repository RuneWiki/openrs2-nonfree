import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class152 {

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!jo;")
	private final Class126 aClass126_33 = new Class126(64);

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!ok;")
	private final Class178 aClass178_71;

	static {
		new Class55("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class152(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_71 = arg2;
		this.aClass178_71.method3833(31);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public void method3294() {
		@Pc(10) Class126 local10 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method2827();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method3295() {
		@Pc(12) Class126 local12 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method2821();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method3297() {
		@Pc(2) Class126 local2 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method2828(5);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lclient!fn;")
	public Class81 method3298(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_33;
		@Pc(16) Class81 local16;
		synchronized (this.aClass126_33) {
			local16 = (Class81) this.aClass126_33.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_71;
		@Pc(46) byte[] local46;
		synchronized (this.aClass178_71) {
			local46 = this.aClass178_71.method3838(arg0, 31);
		}
		local16 = new Class81();
		if (local46 != null) {
			local16.method1992(new Class7_Sub14(local46));
		}
		@Pc(68) Class126 local68 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method2824((long) arg0, local16);
			return local16;
		}
	}
}
