import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class88 {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public int anInt2678;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[Lclient!tb;")
	public Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method2297(@OriginalArg(0) Class6_Sub40 arg0) {
		this.anInt2678 = arg0.method8606();
		this.anInt2679 = arg0.method8571();
		this.anInterface24Array1 = new Interface24[arg0.method8604()];
		@Pc(24) Class152[] local24 = Static178.method3242();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface24Array1.length; local26++) {
			this.anInterface24Array1[local26] = this.method2298(local24[arg0.method8604()], arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!io;Lclient!rg;)Lclient!tb;")
	private Interface24 method2298(@OriginalArg(1) Class152 arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == Static552.aClass152_11) {
			return Static193.method3446(arg1);
		} else if (arg0 == Static148.aClass152_4) {
			return Static182.method3326(arg1);
		} else if (arg0 == Static59.aClass152_2) {
			return Static556.method8013(arg1);
		} else if (Static83.aClass152_3 == arg0) {
			return Static431.method6737(arg1);
		} else if (arg0 == Static378.aClass152_8) {
			return Static323.method5376(arg1);
		} else if (Static615.aClass152_10 == arg0) {
			return Static462.method7051(arg1);
		} else if (arg0 == Static30.aClass152_7) {
			return Static617.method8629(arg1);
		} else if (Static194.aClass152_6 == arg0) {
			return Static6.method106(arg1);
		} else if (arg0 == Static614.aClass152_12) {
			return Static213.method3647(arg1);
		} else if (arg0 == Static193.aClass152_5) {
			return Static442.method6840(arg1);
		} else {
			return null;
		}
	}
}
