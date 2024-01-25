import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class262 {

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
	public int anInt7308;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
	public int anInt7309;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "[Lclient!jl;")
	public Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILclient!ib;Lclient!vaa;)Lclient!jl;")
	private Interface10 method6311(@OriginalArg(1) Class5_Sub23 arg0, @OriginalArg(2) Class361 arg1) {
		if (arg1 == Static622.aClass361_18) {
			return Static32.method555(arg0);
		} else if (Static536.aClass361_17 == arg1) {
			return Static18.method295(arg0);
		} else if (Static71.aClass361_6 == arg1) {
			return Static163.method2207(arg0);
		} else if (arg1 == Static93.aClass361_19) {
			return Static206.method2967(arg0);
		} else if (arg1 == Static16.aClass361_1) {
			return Static363.method5389(arg0);
		} else if (Static40.aClass361_4 == arg1) {
			return Static26.method427(arg0);
		} else if (Static335.aClass361_14 == arg1) {
			return Static420.method6285(arg0);
		} else if (arg1 == Static534.aClass361_3) {
			return Static594.method8606(arg0);
		} else if (arg1 == Static53.aClass361_5) {
			return Static91.method1357(arg0);
		} else if (Static237.aClass361_9 == arg1) {
			return Static566.method8152(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method6313(@OriginalArg(0) Class5_Sub23 arg0) {
		this.anInt7309 = arg0.method8510();
		this.anInt7308 = arg0.method8519();
		this.anInterface10Array1 = new Interface10[arg0.method8529()];
		@Pc(24) Class361[] local24 = Static521.method7548();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface10Array1.length; local26++) {
			this.anInterface10Array1[local26] = this.method6311(arg0, local24[arg0.method8529()]);
		}
	}
}
