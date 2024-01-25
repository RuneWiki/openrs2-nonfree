import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class207 {

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "[Lclient!waa;")
	public Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public int anInt5119;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public int anInt5121;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!rw;Lclient!mo;)Lclient!waa;")
	private Interface24 method4158(@OriginalArg(1) Class297 arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		if (arg0 == Static1.aClass297_1) {
			return Static312.method4329(arg1);
		} else if (arg0 == Static192.aClass297_9) {
			return Static327.method4481(arg1);
		} else if (arg0 == Static393.aClass297_12) {
			return Static50.method826(arg1);
		} else if (arg0 == Static5.aClass297_2) {
			return Static428.method5941(arg1);
		} else if (arg0 == Static31.aClass297_3) {
			return Static207.method3283(arg1);
		} else if (arg0 == Static157.aClass297_8) {
			return Static248.method3686(arg1);
		} else if (Static331.aClass297_10 == arg0) {
			return Static508.method7082(arg1);
		} else if (arg0 == Static157.aClass297_7) {
			return Static260.method3772(arg1);
		} else if (Static488.aClass297_6 == arg0) {
			return Static530.method7280(arg1);
		} else if (arg0 == Static364.aClass297_11) {
			return Static454.method6266(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!mo;)V")
	public void method4160(@OriginalArg(1) Class1_Sub35 arg0) {
		this.anInt5119 = arg0.method5797();
		this.anInt5121 = arg0.method5771();
		this.anInterface24Array1 = new Interface24[arg0.method5750()];
		@Pc(24) Class297[] local24 = Static389.method5352();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface24Array1.length; local26++) {
			this.anInterface24Array1[local26] = this.method4158(local24[arg0.method5750()], arg0);
		}
	}
}
