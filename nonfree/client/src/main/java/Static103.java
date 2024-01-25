import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Lclient!oa;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public static int anInt1993 = -1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBIIZLclient!hh;I)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class109 arg3) {
		Static85.anInt1527 = 0;
		Static289.aClass109_67 = arg3;
		Static105.anInt2081 = arg0;
		Static67.aBoolean107 = false;
		Static428.anInt7488 = arg1;
		Static25.anInt424 = 1;
		Static386.anInt6855 = Static398.aClass1_Sub5_Sub4_4.method4468() / arg2;
		if (Static386.anInt6855 < 1) {
			Static386.anInt6855 = 1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)Z")
	public static boolean method1644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static59.method900(arg0, arg1) || Static297.method4065(arg0, arg1);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!qa;Lclient!ko;II)V")
	public static void method1645(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class142 arg1) {
		Static115.aClass142_15.method3206();
		if (Static319.aBoolean456) {
			return;
		}
		for (@Pc(20) Class1_Sub8 local20 = (Class1_Sub8) arg1.method3199(); local20 != null; local20 = (Class1_Sub8) arg1.method3198()) {
			@Pc(28) Class52 local28 = Static350.aClass103_4.method2055(local20.anInt1168);
			if (Static441.method5915(local28)) {
				@Pc(40) boolean local40 = Static398.method5471(arg0, local20, local28);
				if (local40) {
					Static97.method1545(local28, local20, arg0);
				}
			}
		}
	}
}
