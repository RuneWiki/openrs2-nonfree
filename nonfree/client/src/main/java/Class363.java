import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class363 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
	public int anInt9623;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "[Lclient!lba;")
	public Interface16[] anInterface16Array1;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
	public int anInt9627;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!jd;ZLclient!ji;)Lclient!lba;")
	private Interface16 method7853(@OriginalArg(0) Class153 arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (Static96.aClass153_5 == arg0) {
			return Static589.method7801(arg1);
		} else if (arg0 == Static558.aClass153_12) {
			return Static510.method7079(arg1);
		} else if (Static71.aClass153_4 == arg0) {
			return Static448.method6345(arg1);
		} else if (Static90.aClass153_13 == arg0) {
			return Static319.method4961(arg1);
		} else if (arg0 == Static167.aClass153_7) {
			return Static175.method3224(arg1);
		} else if (Static422.aClass153_9 == arg0) {
			return Static169.method3173(arg1);
		} else if (Static582.aClass153_14 == arg0) {
			return Static531.method7231(arg1);
		} else if (Static455.aClass153_10 == arg0) {
			return Static388.method5722(arg1);
		} else if (Static30.aClass153_3 == arg0) {
			return Static56.method1217(arg1);
		} else if (Static385.aClass153_8 == arg0) {
			return Static90.method7595(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method7854(@OriginalArg(0) Class6_Sub21 arg0) {
		this.anInt9623 = arg0.method6031();
		this.anInt9627 = arg0.method6003();
		this.anInterface16Array1 = new Interface16[arg0.method6069()];
		@Pc(26) Class153[] local26 = Static555.method7521();
		for (@Pc(32) int local32 = 0; local32 < this.anInterface16Array1.length; local32++) {
			this.anInterface16Array1[local32] = this.method7853(local26[arg0.method6069()], arg0);
		}
	}
}
