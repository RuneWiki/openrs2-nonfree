import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class298 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
	public int anInt8316;

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
	public int anInt8317;

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "[Lclient!rh;")
	public Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method7115(@OriginalArg(0) Class5_Sub41 arg0) {
		this.anInt8317 = arg0.method7807();
		this.anInt8316 = arg0.method7860();
		this.anInterface24Array1 = new Interface24[arg0.method7816()];
		@Pc(24) Class139[] local24 = Static441.method6442();
		for (@Pc(31) int local31 = 0; local31 < this.anInterface24Array1.length; local31++) {
			this.anInterface24Array1[local31] = this.method7116(local24[arg0.method7816()], arg0);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLclient!gp;Lclient!mc;)Lclient!rh;")
	private Interface24 method7116(@OriginalArg(1) Class139 arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (Static456.aClass139_7 == arg0) {
			return Static396.method5822(arg1);
		} else if (arg0 == Static590.aClass139_10) {
			return Static639.method8634(arg1);
		} else if (Static149.aClass139_3 == arg0) {
			return Static623.method8436(arg1);
		} else if (arg0 == Static3.aClass139_1) {
			return Static209.method7248(arg1);
		} else if (Static490.aClass139_8 == arg0) {
			return Static200.method3266(arg1);
		} else if (arg0 == Static549.aClass139_9) {
			return Static379.method5643(arg1);
		} else if (Static340.aClass139_5 == arg0) {
			return Static432.method6352(arg1);
		} else if (Static212.aClass139_4 == arg0) {
			return Static121.method2238(arg1);
		} else if (Static432.aClass139_6 == arg0) {
			return Static605.method8279(arg1);
		} else if (arg0 == Static73.aClass139_2) {
			return Static45.method606(arg1);
		} else {
			return null;
		}
	}
}
