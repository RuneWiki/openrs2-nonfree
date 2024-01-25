import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_105 = new Class56(83, 0);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!nd;Lclient!nd;)V")
	public static void method2186(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_262 != null) {
			arg1.method6059();
		}
		arg1.aClass4_262 = arg0.aClass4_262;
		arg1.aClass4_261 = arg0;
		arg1.aClass4_262.aClass4_261 = arg1;
		arg1.aClass4_261.aClass4_262 = arg1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZI)V")
	public static void method2193(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static206.anInt4095++;
			Static173.method2400();
		}
		if (arg1) {
			Static52.anInt826++;
			Static96.method1456();
		}
	}
}
