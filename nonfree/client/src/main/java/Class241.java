import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class241 {

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public int anInt6778;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public int anInt6781;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "[Lclient!vb;")
	public Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!np;Z)V")
	public void method5683(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt6781 = arg0.method5230();
		this.anInt6778 = arg0.method5198();
		this.anInterface22Array1 = new Interface22[arg0.method5175()];
		@Pc(22) Class140[] local22 = Static104.method1889();
		for (@Pc(24) int local24 = 0; local24 < this.anInterface22Array1.length; local24++) {
			this.anInterface22Array1[local24] = this.method5686(local22[arg0.method5175()], arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!ib;Lclient!np;)Lclient!vb;")
	private Interface22 method5686(@OriginalArg(1) Class140 arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (Static364.aClass140_5 == arg0) {
			return Static528.method6785(arg1);
		} else if (Static271.aClass140_14 == arg0) {
			return Static147.method2825(arg1);
		} else if (Static337.aClass140_15 == arg0) {
			return Static446.method6233(arg1);
		} else if (arg0 == Static41.aClass140_6) {
			return Static304.method4458(arg1);
		} else if (Static578.aClass140_18 == arg0) {
			return Static472.method6504(arg1);
		} else if (Static72.aClass140_10 == arg0) {
			return Static194.method3267(arg1);
		} else if (arg0 == Static351.aClass140_16) {
			return Static222.method3505(arg1);
		} else if (Static79.aClass140_17 == arg0) {
			return Static2.method42(arg1);
		} else if (Static27.aClass140_12 == arg0) {
			return Static348.method5131(arg1);
		} else if (Static242.aClass140_13 == arg0) {
			return Static301.method4554(arg1);
		} else {
			return null;
		}
	}
}
