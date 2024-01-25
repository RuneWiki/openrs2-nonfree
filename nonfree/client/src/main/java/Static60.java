import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "B")
	public static byte aByte36;

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "Lclient!jm;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
	public static int anInt1612;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
	public static int anInt1602 = 0;

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "[I")
	public static final int[] anIntArray141 = new int[500];

	@OriginalMember(owner = "client!cq", name = "E", descriptor = "Z")
	public static volatile boolean aBoolean106 = true;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method1122(@OriginalArg(0) Class106 arg0) {
		arg0.ba(0, 0, Static152.anInt3234, 350);
		arg0.P(0, 0, Static152.anInt3234, 350, Static333.anInt6107 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static351.anInt6519;
		@Pc(37) int local37;
		if (Static453.anInt7924 > 0) {
			local37 = 342 - Static351.anInt6519;
			@Pc(47) int local47 = local27 * local37 / (Static453.anInt7924 + local27 - 1);
			@Pc(49) int local49 = 4;
			if (Static453.anInt7924 > 1) {
				local49 = (local37 - local47) * (-Static32.anInt888 + Static453.anInt7924 + -1) / (Static453.anInt7924 - 1) + 4;
			}
			arg0.P(Static152.anInt3234 - 16, local49, 12, local47, Static333.anInt6107 << 24 | 0x332277, 2);
			for (@Pc(87) int local87 = Static32.anInt888; local87 < local27 + Static32.anInt888 && Static453.anInt7924 > local87; local87++) {
				@Pc(96) String[] local96 = Static117.method1928('\b', Static38.aStringArray6[local87]);
				@Pc(103) int local103 = (Static152.anInt3234 - 24) / local96.length;
				for (@Pc(105) int local105 = 0; local105 < local96.length; local105++) {
					@Pc(113) int local113 = local105 * local103 + 8;
					arg0.ba(local113, 0, local103 + local113 - 8, 350);
					Static308.aClass20_5.method5340(-16777216, local113, 350 - Static215.aClass209_7.anInt6104 - Static176.anInt3856 - Static351.anInt6519 * (local87 + -Static32.anInt888) - 2, -1, local96[local105]);
				}
			}
		}
		arg0.ba(0, 0, Static152.anInt3234, 350);
		arg0.method5951(-1, Static152.anInt3234, 0, 350 - Static176.anInt3856);
		Static13.aClass20_2.method5340(-16777216, 10, 350 - Static394.aClass209_10.anInt6104 - 1, -1, "--> " + Static72.aString16);
		local37 = -1;
		if (Static187.anInt3975 % 30 > 15) {
			local37 = 16777215;
		}
		arg0.method5936(339 - Static394.aClass209_10.anInt6104, Static394.aClass209_10.method4694("--> " + Static72.aString16.substring(0, Static392.anInt7118)) + 10, 12, local37);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!pl;B)Ljava/lang/String;")
	public static String method1126(@OriginalArg(0) Class1_Sub35 arg0) {
		return arg0.aString54 == null || arg0.aString54.length() <= 0 ? arg0.aString53 : arg0.aString53 + Static181.aClass158_102.method3594(Static365.anInt6682) + arg0.aString54;
	}
}
