import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!ufa", name = "q", descriptor = "I")
	public static int anInt3346 = 1;

	@OriginalMember(owner = "client!ufa", name = "v", descriptor = "[I")
	public static final int[] anIntArray164 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ufa", name = "B", descriptor = "I")
	public static int anInt3354 = -1;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILclient!wm;ILclient!wm;)V")
	public static void method2931(@OriginalArg(1) Class390 arg0, @OriginalArg(3) Class390 arg1) {
		Static304.aClass390_76 = arg0;
		Static614.aClass390_119 = arg1;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IBII)I")
	public static int method2932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg0) {
			return arg2 > arg1 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2934(@OriginalArg(0) Class65 arg0) {
		if (Static483.anInt8099 < 2 && !Static55.aBoolean60 || Static383.aClass345_10 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static55.aBoolean60 && Static483.anInt8099 < 2) {
			local38 = Static421.aString59 + Static64.aClass52_32.method907(Static544.anInt8937) + Static199.aString28 + " ->";
		} else if (Static157.aBoolean262 && Static17.aClass252_1.method8818(81) && Static483.anInt8099 > 2) {
			local38 = Static161.method4598(Static355.aClass5_Sub3_Sub20_3);
		} else {
			@Pc(54) Class5_Sub3_Sub20 local54 = Static355.aClass5_Sub3_Sub20_3;
			if (local54 == null) {
				return;
			}
			local38 = Static161.method4598(local54);
			@Pc(63) int[] local63 = null;
			if (Static408.method5981(local54.anInt10178)) {
				local63 = Static110.aClass105_1.method2659((int) local54.aLong289).anIntArray390;
			} else if (local54.anInt10174 != -1) {
				local63 = Static110.aClass105_1.method2659(local54.anInt10174).anIntArray390;
			} else if (Static335.method5134(local54.anInt10178)) {
				@Pc(95) Class5_Sub25 local95 = (Class5_Sub25) Static56.aClass300_8.method7188((long) (int) local54.aLong289);
				if (local95 != null) {
					@Pc(100) Class28_Sub1_Sub4_Sub2_Sub1 local100 = local95.aClass28_Sub1_Sub4_Sub2_Sub1_1;
					@Pc(103) Class134 local103 = local100.aClass134_1;
					if (local103.anIntArray191 != null) {
						local103 = local103.method3276(Static161.aClass237_3);
					}
					if (local103 != null) {
						local63 = local103.anIntArray192;
					}
				}
			} else if (Static591.method8116(local54.anInt10178)) {
				@Pc(141) Class164 local141;
				if (local54.anInt10178 == 1009) {
					local141 = Static568.aClass315_5.method7511((int) local54.aLong289);
				} else {
					local141 = Static568.aClass315_5.method7511((int) (local54.aLong289 >>> 32 & 0x7FFFFFFFL));
				}
				if (local141.anIntArray247 != null) {
					local141 = local141.method3908(Static161.aClass237_3);
				}
				if (local141 != null) {
					local63 = local141.anIntArray244;
				}
			}
			if (local63 != null) {
				local38 = local38 + Static496.method7110(local63);
			}
		}
		if (Static483.anInt8099 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static483.anInt8099 - 2) + Static64.aClass52_25.method907(Static544.anInt8937);
		}
		if (Static528.aClass345_11 != null) {
			@Pc(263) Class73 local263 = Static528.aClass345_11.method8078(arg0);
			if (local263 == null) {
				local263 = Static231.aClass73_8;
			}
			local263.method5775(Static364.aClass50Array8, Static528.aClass345_11.anInt9606, Static528.aClass345_11.anInt9628, Static605.anInt9946, Static528.aClass345_11.anInt9649, Static5.anIntArray4, Static528.aClass345_11.anInt9612, Static561.aRandom1, Static99.anInt2172, Static16.anInt263, Static644.anIntArray589, Static528.aClass345_11.anInt9655, Static528.aClass345_11.anInt9598, local38);
			Static356.method5358(Static644.anIntArray589[0], Static644.anIntArray589[3], Static644.anIntArray589[1], Static644.anIntArray589[2]);
		} else if (Static233.aClass345_4 != null && Static218.aClass98_2 == Static599.aClass98_6) {
			@Pc(242) int local242 = Static231.aClass73_8.method5774(Static300.anInt10358 + 4, Static469.anInt7908 - -16, Static605.anInt9946, Static561.aRandom1, local38, Static5.anIntArray4, Static364.aClass50Array8);
			Static356.method5358(Static300.anInt10358 + 4, 16, Static469.anInt7908, local242 + Static299.aClass247_11.method5759(local38));
			return;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)V")
	public static void method2936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static299.aClass247_11.method5759(Static64.aClass52_24.method907(Static544.anInt8937));
		@Pc(58) int local58;
		@Pc(30) int local30;
		if (Static364.aBoolean585) {
			for (@Pc(66) Class5_Sub3_Sub15 local66 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8322(); local66 != null; local66 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8328()) {
				if (local66.anInt8017 == 1) {
					local30 = Static435.method8377((Class5_Sub3_Sub20) local66.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66);
				} else {
					local30 = Static654.method8789(local66);
				}
				if (local30 > local17) {
					local17 = local30;
				}
			}
			Static54.anInt805 = (Static375.aBoolean592 ? 26 : 22) + Static248.anInt4552 * 16;
			local58 = Static248.anInt4552 * 16 + 21;
			local17 += 8;
		} else {
			for (@Pc(24) Class5_Sub3_Sub20 local24 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local24 != null; local24 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
				local30 = Static435.method8377(local24);
				if (local30 > local17) {
					local17 = local30;
				}
			}
			Static54.anInt805 = (Static375.aBoolean592 ? 26 : 22) + Static483.anInt8099 * 16;
			local58 = Static483.anInt8099 * 16 + 21;
			local17 += 8;
		}
		@Pc(126) int local126 = arg0 - local17 / 2;
		if (local126 + local17 > Static32.anInt510) {
			local126 = Static32.anInt510 - local17;
		}
		if (local126 < 0) {
			local126 = 0;
		}
		local30 = arg1;
		if (local58 + arg1 > Static79.anInt1140) {
			local30 = Static79.anInt1140 - local58;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		Static477.anInt8042 = local126;
		Static633.anInt10304 = local17;
		Static542.anInt6468 = local30;
		Static493.aBoolean702 = true;
	}
}
