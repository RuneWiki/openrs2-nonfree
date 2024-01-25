import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "Lclient!gg;")
	public static Class112 aClass112_4;

	@OriginalMember(owner = "client!gp", name = "Q", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array9;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[128][128];

	@OriginalMember(owner = "client!gp", name = "R", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!gp", name = "U", descriptor = "Lclient!kl;")
	public static final Class174 aClass174_5 = new Class174(2);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIILclient!kd;)V")
	public static void method2949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub5 arg3) {
		@Pc(4) Class37 local4 = Static464.method6477(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass15_Sub5_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I")
	public static int method2959() {
		return 14;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)V")
	public static void method2981() {
		if (Static443.method6281(Static389.anInt7024) || Static545.method7421(Static389.anInt7024)) {
			Static6.method261(Static367.anInt6861 >> 10, 5000, Static364.anInt6817 >> 10);
		} else {
			@Pc(16) int local16 = Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0] >> 3;
			@Pc(23) int local23 = Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0] >> 3;
			if (local16 >= 0 && local16 < Static460.anInt7894 >> 3 && local23 >= 0 && Static235.anInt4493 >> 3 > local23) {
				Static6.method261(local16, 5000, local23);
			} else {
				Static6.method261(Static460.anInt7894 >> 4, 0, Static235.anInt4493 >> 4);
			}
		}
		Static317.method5105();
		Static452.method6365();
		Static471.method6592();
		Static84.method1458();
	}
}
