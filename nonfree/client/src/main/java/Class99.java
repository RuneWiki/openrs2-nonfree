import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class99 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "[Lclient!al;")
	public Interface3[] anInterface3Array1;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	public int anInt2194;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!wh;BLclient!wq;)Lclient!al;")
	private Interface3 method1960(@OriginalArg(0) Class392 arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == Static20.aClass392_1) {
			return Static226.method3578(arg1);
		} else if (Static348.aClass392_4 == arg0) {
			return Static324.method4953(arg1);
		} else if (Static183.aClass392_2 == arg0) {
			return Static653.method9001(arg1);
		} else if (Static186.aClass392_3 == arg0) {
			return Static269.method4359(arg1);
		} else if (arg0 == Static626.aClass392_8) {
			return Static2.method25(arg1);
		} else if (arg0 == Static439.aClass392_6) {
			return Static529.method7240(arg1);
		} else if (arg0 == Static678.aClass392_10) {
			return Static70.method1152(arg1);
		} else if (arg0 == Static577.aClass392_7) {
			return Static225.method3571(arg1);
		} else if (arg0 == Static428.aClass392_5) {
			return Static333.method5033(arg1);
		} else if (arg0 == Static645.aClass392_9) {
			return Static613.method8421(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!wq;B)V")
	public void method1961(@OriginalArg(0) Class5_Sub36 arg0) {
		this.anInt2197 = arg0.method7331();
		this.anInt2194 = arg0.method7333();
		this.anInterface3Array1 = new Interface3[arg0.method7291()];
		@Pc(32) Class392[] local32 = Static202.method8633();
		for (@Pc(34) int local34 = 0; local34 < this.anInterface3Array1.length; local34++) {
			this.anInterface3Array1[local34] = this.method1960(local32[arg0.method7291()], arg0);
		}
	}
}
