import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "[Lclient!hc;")
	public static Class29_Sub2[] aClass29_Sub2Array3;

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString49 = "";

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_77 = new Class40(107, 5);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method2780(@OriginalArg(0) Class121 arg0) {
		@Pc(7) int local7 = Static83.anInt1402;
		@Pc(9) int local9 = Static377.anInt6491;
		@Pc(11) int local11 = Static353.anInt6216;
		@Pc(13) int local13 = Static519.anInt8950;
		arg0.method7109(local9, local11, local13, local7, -10660793);
		arg0.method7109(local9 + 1, local11 + -2, 16, local7 + 1, -16777216);
		arg0.method7160(local11 - 2, local9 - -18, -16777216, local7 + 1, local13 + -19);
		Static408.aClass56_4.method7879(Static141.aClass104_69.method2145(Static470.anInt7957), local7 + 3, -10660793, local9 + 14, -1);
		@Pc(79) int local79 = Static427.aClass134_1.method6093();
		@Pc(83) int local83 = Static427.aClass134_1.method6092();
		@Pc(85) int local85 = 0;
		for (@Pc(90) Class6_Sub48 local90 = (Class6_Sub48) Static445.aClass275_162.method6366(); local90 != null; local90 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			@Pc(105) int local105 = local9 + (Static374.anInt6451 - local85 - 1) * 16 + 31;
			@Pc(107) short local107 = -1;
			if (local79 > local7 && local11 + local7 > local79 && local105 - 13 < local83 && local105 + 3 > local83 && local90.aBoolean573) {
				local107 = -256;
			}
			@Pc(140) int[] local140 = null;
			if (Static557.method7618(local90.anInt8333)) {
				local140 = Static295.aClass256_2.method5924((int) local90.aLong215).anIntArray315;
			} else if (local90.anInt8334 != -1) {
				local140 = Static295.aClass256_2.method5924(local90.anInt8334).anIntArray315;
			} else if (Static197.method2979(local90.anInt8333)) {
				@Pc(221) Class6_Sub28 local221 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local90.aLong215);
				if (local221 != null) {
					@Pc(226) Class29_Sub2_Sub1_Sub1 local226 = local221.aClass29_Sub2_Sub1_Sub1_2;
					@Pc(229) Class257 local229 = local226.aClass257_1;
					if (local229.anIntArray571 != null) {
						local229 = local229.method5935(Static505.aClass30_1);
					}
					if (local229 != null) {
						local140 = local229.anIntArray572;
					}
				}
			} else if (Static90.method1435(local90.anInt8333)) {
				@Pc(182) Class313 local182;
				if (local90.anInt8333 == 1006) {
					local182 = Static260.aClass100_1.method2008((int) local90.aLong215);
				} else {
					local182 = Static260.aClass100_1.method2008((int) (local90.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local182.anIntArray650 != null) {
					local182 = local182.method6967(Static505.aClass30_1);
				}
				if (local182 != null) {
					local140 = local182.anIntArray654;
				}
			}
			@Pc(255) String local255 = Static568.method7783(local90);
			if (local140 != null) {
				local255 = local255 + Static334.method5111(local140);
			}
			Static408.aClass56_4.method7880(local7 + 3, local105, local255, Static379.anIntArray553, Static156.aClass4Array5, local107);
			local85++;
			if (local90.aBoolean572) {
				Static261.aClass4_14.method6514(local7 + Static338.aClass146_7.method3173(local255) + 5, local105 + -12);
			}
		}
		Static47.method7647(Static377.anInt6491, Static519.anInt8950, Static353.anInt6216, Static83.anInt1402);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!pq;)V")
	public static void method2781(@OriginalArg(1) Class251 arg0) {
		Static310.aClass251_93 = arg0;
	}
}
