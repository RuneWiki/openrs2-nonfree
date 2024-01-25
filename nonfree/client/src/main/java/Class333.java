import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class333 {

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
	public int anInt9480;

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
	public int anInt9485;

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "[Lclient!wm;")
	public Interface27[] anInterface27Array1;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLclient!ol;)V")
	public void method8318(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt9485 = arg0.method5161();
		this.anInt9480 = arg0.method5211();
		this.anInterface27Array1 = new Interface27[arg0.method5203()];
		@Pc(29) Class148[] local29 = Static673.method9446();
		for (@Pc(31) int local31 = 0; local31 < this.anInterface27Array1.length; local31++) {
			this.anInterface27Array1[local31] = this.method8320(local29[arg0.method5203()], arg0);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLclient!hl;Lclient!ol;)Lclient!wm;")
	private Interface27 method8320(@OriginalArg(1) Class148 arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == Static262.aClass148_12) {
			return Static69.method1290(arg1);
		} else if (Static553.aClass148_19 == arg0) {
			return Static631.method9339(arg1);
		} else if (Static601.aClass148_21 == arg0) {
			return Static452.method7289(arg1);
		} else if (arg0 == Static645.aClass148_20) {
			return Static20.method379(arg1);
		} else if (arg0 == Static266.aClass148_13) {
			return Static172.method3362(arg1);
		} else if (Static472.aClass148_17 == arg0) {
			return Static503.method7457(arg1);
		} else if (Static198.aClass148_9 == arg0) {
			return Static607.method9112(arg1);
		} else if (arg0 == Static135.aClass148_6) {
			return Static295.method4879(arg1);
		} else if (arg0 == Static92.aClass148_22) {
			return Static413.method6772(arg1);
		} else if (arg0 == Static229.aClass148_11) {
			return Static276.method4673(arg1);
		} else {
			return null;
		}
	}
}
