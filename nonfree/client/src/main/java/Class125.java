import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class125 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "[Lclient!nda;")
	public Interface17[] anInterface17Array1;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method2280(@OriginalArg(0) Class2_Sub7 arg0) {
		this.anInt2647 = arg0.method4503();
		this.anInt2651 = arg0.method4518();
		this.anInterface17Array1 = new Interface17[arg0.method4464()];
		@Pc(24) Class225[] local24 = Static433.method5698();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface17Array1.length; local26++) {
			this.anInterface17Array1[local26] = this.method2281(arg0, local24[arg0.method4464()]);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!gk;Lclient!mh;I)Lclient!nda;")
	private Interface17 method2281(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) Class225 arg1) {
		if (Static268.aClass225_18 == arg1) {
			return Static32.method547(arg0);
		} else if (arg1 == Static562.aClass225_29) {
			return Static590.method7670(arg0);
		} else if (arg1 == Static262.aClass225_17) {
			return Static28.method380(arg0);
		} else if (Static373.aClass225_23 == arg1) {
			return Static341.method4975(arg0);
		} else if (Static213.aClass225_13 == arg1) {
			return Static368.method6719(arg0);
		} else if (arg1 == Static143.aClass225_25) {
			return Static230.method2786(arg0);
		} else if (arg1 == Static190.aClass225_11) {
			return Static341.method4978(arg0);
		} else if (arg1 == Static53.aClass225_30) {
			return Static198.method2490(arg0);
		} else if (Static171.aClass225_10 == arg1) {
			return Static122.method1727(arg0);
		} else if (Static208.aClass225_12 == arg1) {
			return Static399.method5481(arg0);
		} else {
			return null;
		}
	}
}
