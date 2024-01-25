import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class173 {

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "[Lclient!jd;")
	public Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
	public int anInt4848;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
	public int anInt4850;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!sl;Lclient!hm;I)Lclient!jd;")
	private Interface12 method4275(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) Class151 arg1) {
		if (arg1 == Static307.aClass151_8) {
			return Static149.method2637(arg0);
		} else if (arg1 == Static141.aClass151_3) {
			return Static339.method5146(arg0);
		} else if (Static502.aClass151_11 == arg1) {
			return Static124.method2241(arg0);
		} else if (arg1 == Static23.aClass151_2) {
			return Static570.method7933(arg0);
		} else if (arg1 == Static481.aClass151_9) {
			return Static240.method8180(arg0);
		} else if (Static239.aClass151_5 == arg1) {
			return Static344.method6787(arg0);
		} else if (arg1 == Static261.aClass151_6) {
			return Static125.method2246(arg0);
		} else if (arg1 == Static225.aClass151_4) {
			return Static447.method6388(arg0);
		} else if (Static272.aClass151_7 == arg1) {
			return Static295.method4664(arg0);
		} else if (arg1 == Static15.aClass151_1) {
			return Static35.method847(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!sl;)V")
	public void method4276(@OriginalArg(1) Class2_Sub17 arg0) {
		this.anInt4850 = arg0.method2835();
		this.anInt4848 = arg0.method2825();
		this.anInterface12Array1 = new Interface12[arg0.method2859()];
		@Pc(24) Class151[] local24 = Static231.method3728();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface12Array1.length; local26++) {
			this.anInterface12Array1[local26] = this.method4275(arg0, local24[arg0.method2859()]);
		}
	}
}
