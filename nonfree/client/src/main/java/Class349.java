import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class349 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public int anInt9633;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public int anInt9635;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[Lclient!lt;")
	public Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method8007(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt9633 = arg0.method3633();
		this.anInt9635 = arg0.method3698();
		this.anInterface14Array1 = new Interface14[arg0.method3642()];
		@Pc(22) Class370[] local22 = Static32.method422();
		for (@Pc(32) int local32 = 0; local32 < this.anInterface14Array1.length; local32++) {
			this.anInterface14Array1[local32] = this.method8008(arg0, local22[arg0.method3642()]);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!rv;Lclient!ve;I)Lclient!lt;")
	private Interface14 method8008(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) Class370 arg1) {
		if (arg1 == Static528.aClass370_8) {
			return Static68.method970(arg0);
		} else if (Static163.aClass370_2 == arg1) {
			return Static561.method7681(arg0);
		} else if (Static460.aClass370_7 == arg1) {
			return Static70.method1032(arg0);
		} else if (arg1 == Static598.aClass370_9) {
			return Static35.method464(arg0);
		} else if (Static428.aClass370_6 == arg1) {
			return Static170.method2524(arg0);
		} else if (Static363.aClass370_5 == arg1) {
			return Static672.method8771(arg0);
		} else if (arg1 == Static114.aClass370_1) {
			return Static136.method2042(arg0);
		} else if (arg1 == Static355.aClass370_4) {
			return Static140.method2101(arg0);
		} else if (Static188.aClass370_3 == arg1) {
			return Static453.method6714(arg0);
		} else if (Static668.aClass370_10 == arg1) {
			return Static456.method6728(arg0);
		} else {
			return null;
		}
	}
}
