import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class213 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public int anInt5777;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[Lclient!haa;")
	public Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public int anInt5778;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!ee;)V")
	public void method5148(@OriginalArg(1) Class5_Sub12 arg0) {
		this.anInt5777 = arg0.method8657();
		this.anInt5778 = arg0.method8631();
		this.anInterface13Array1 = new Interface13[arg0.method8645()];
		@Pc(24) Class228[] local24 = Static156.method2370();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface13Array1.length; local26++) {
			this.anInterface13Array1[local26] = this.method5149(arg0, local24[arg0.method8645()]);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ee;Lclient!mha;)Lclient!haa;")
	private Interface13 method5149(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) Class228 arg1) {
		if (arg1 == Static588.aClass228_10) {
			return Static446.method6620(arg0);
		} else if (Static509.aClass228_9 == arg1) {
			return Static160.method2423(arg0);
		} else if (Static146.aClass228_1 == arg1) {
			return Static432.method6470(arg0);
		} else if (arg1 == Static599.aClass228_11) {
			return Static585.method8204(arg0);
		} else if (arg1 == Static159.aClass228_2) {
			return Static549.method7770(arg0);
		} else if (arg1 == Static274.aClass228_12) {
			return Static89.method1393(arg0);
		} else if (Static408.aClass228_7 == arg1) {
			return Static166.method2526(arg0);
		} else if (Static472.aClass228_8 == arg1) {
			return Static552.method7798(arg0);
		} else if (arg1 == Static289.aClass228_6) {
			return Static620.method8540(arg0);
		} else if (Static639.aClass228_13 == arg1) {
			return Static384.method5953(arg0);
		} else {
			return null;
		}
	}
}
