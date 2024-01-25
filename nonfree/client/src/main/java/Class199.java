import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class199 {

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
	public int anInt6046;

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
	public int anInt6049;

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "[Lclient!sa;")
	public Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLclient!dc;)V")
	public void method5231(@OriginalArg(1) Class3_Sub9 arg0) {
		this.anInt6049 = arg0.method5604();
		this.anInt6046 = arg0.method5610();
		this.anInterface23Array1 = new Interface23[arg0.method5633()];
		@Pc(28) Class384[] local28 = Static30.method436();
		for (@Pc(30) int local30 = 0; local30 < this.anInterface23Array1.length; local30++) {
			this.anInterface23Array1[local30] = this.method5232(arg0, local28[arg0.method5633()]);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!dc;ILclient!ww;)Lclient!sa;")
	private Interface23 method5232(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) Class384 arg1) {
		if (arg1 == Static429.aClass384_57) {
			return Static106.method1796(arg0);
		} else if (arg1 == Static349.aClass384_71) {
			return Static491.method7211(arg0);
		} else if (arg1 == Static179.aClass384_28) {
			return Static518.method7522(arg0);
		} else if (arg1 == Static548.aClass384_70) {
			return Static432.method6571(arg0);
		} else if (Static518.aClass384_65 == arg1) {
			return Static80.method1360(arg0);
		} else if (arg1 == Static556.aClass384_68) {
			return Static396.method6242(arg0);
		} else if (Static89.aClass384_50 == arg1) {
			return Static538.method7782(arg0);
		} else if (Static200.aClass384_32 == arg1) {
			return Static594.method8212(arg0);
		} else if (Static583.aClass384_72 == arg1) {
			return Static393.method7908(arg0);
		} else if (Static198.aClass384_54 == arg1) {
			return Static393.method7909(arg0);
		} else {
			return null;
		}
	}
}
