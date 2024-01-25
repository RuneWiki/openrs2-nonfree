import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class335 {

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
	public int anInt9379;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
	public int anInt9381;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "[Lclient!ci;")
	public Interface4[] anInterface4Array1;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!ud;B)V")
	public void method7834(@OriginalArg(0) Class2_Sub34 arg0) {
		this.anInt9381 = arg0.method6870();
		this.anInt9379 = arg0.method6884();
		this.anInterface4Array1 = new Interface4[arg0.method6904()];
		@Pc(22) Class184[] local22 = Static591.method8160();
		for (@Pc(32) int local32 = 0; local32 < this.anInterface4Array1.length; local32++) {
			this.anInterface4Array1[local32] = this.method7837(local22[arg0.method6904()], arg0);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLclient!jw;Lclient!ud;)Lclient!ci;")
	private Interface4 method7837(@OriginalArg(1) Class184 arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (Static19.aClass184_5 == arg0) {
			return Static158.method2969(arg1);
		} else if (arg0 == Static545.aClass184_11) {
			return Static559.method7757(arg1);
		} else if (Static374.aClass184_8 == arg0) {
			return Static185.method3332(arg1);
		} else if (arg0 == Static352.aClass184_7) {
			return Static466.method3727(arg1);
		} else if (arg0 == Static25.aClass184_2) {
			return Static185.method3335(arg1);
		} else if (Static62.aClass184_4 == arg0) {
			return Static322.method4854(arg1);
		} else if (arg0 == Static390.aClass184_9) {
			return Static575.method7993(arg1);
		} else if (arg0 == Static445.aClass184_10) {
			return Static163.method3037(arg1);
		} else if (arg0 == Static28.aClass184_6) {
			return Static142.method2699(arg1);
		} else if (Static610.aClass184_12 == arg0) {
			return Static411.method6319(arg1);
		} else {
			return null;
		}
	}
}
