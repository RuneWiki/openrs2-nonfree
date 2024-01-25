import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class193 {

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[Lclient!cn;")
	public Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public int anInt5220;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public int anInt5221;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!so;B)V")
	public void method4361(@OriginalArg(0) Class14_Sub29 arg0) {
		this.anInt5221 = arg0.method5862();
		this.anInt5220 = arg0.method5900();
		this.anInterface2Array1 = new Interface2[arg0.method5866()];
		@Pc(24) Class310[] local24 = Static323.method5090();
		for (@Pc(32) int local32 = 0; local32 < this.anInterface2Array1.length; local32++) {
			this.anInterface2Array1[local32] = this.method4362(local24[arg0.method5866()], arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!saa;Lclient!so;)Lclient!cn;")
	private Interface2 method4362(@OriginalArg(1) Class310 arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (Static174.aClass310_20 == arg0) {
			return Static513.method7468(arg1);
		} else if (arg0 == Static204.aClass310_17) {
			return Static77.method1441(arg1);
		} else if (arg0 == Static558.aClass310_16) {
			return Static148.method2349(arg1);
		} else if (Static575.aClass310_18 == arg0) {
			return Static224.method3466(arg1);
		} else if (Static45.aClass310_1 == arg0) {
			return Static74.method1390(arg1);
		} else if (arg0 == Static79.aClass310_2) {
			return Static274.method3981(arg1);
		} else if (arg0 == Static334.aClass310_8) {
			return Static108.method1901(arg1);
		} else if (arg0 == Static339.aClass310_9) {
			return Static149.method5513(arg1);
		} else if (Static509.aClass310_14 == arg0) {
			return Static248.method3659(arg1);
		} else if (arg0 == Static427.aClass310_11) {
			return Static125.method2097(arg1);
		} else {
			return null;
		}
	}
}
