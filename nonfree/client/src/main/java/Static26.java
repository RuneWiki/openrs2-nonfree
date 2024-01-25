import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public static final int anInt383 = 50;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "[I")
	public static final int[] anIntArray54 = new int[anInt383];

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "[I")
	public static final int[] anIntArray55 = new int[anInt383];

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "[I")
	public static final int[] anIntArray56 = new int[anInt383];

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "[I")
	public static final int[] anIntArray57 = new int[anInt383];

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "[I")
	public static final int[] anIntArray58 = new int[anInt383];

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
	public static final int[] anIntArray59 = new int[anInt383];

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[anInt383];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!za;)V")
	public static void method381(@OriginalArg(1) Class117 arg0) {
		@Pc(7) int local7 = Static64.anInt995;
		@Pc(9) int local9 = Static25.anInt358;
		@Pc(11) int local11 = Static273.anInt4719;
		@Pc(20) int local20 = Static361.anInt5833 - 3;
		if (Static414.aClass85_21 == null || Static187.aClass85_11 == null) {
			if (Static178.aClass185_49.method4000(Static281.anInt4758) && Static178.aClass185_49.method4000(Static443.anInt6954)) {
				Static414.aClass85_21 = arg0.method5707(Static467.method891(Static178.aClass185_49, Static281.anInt4758, 0));
				@Pc(49) Class52 local49 = Static467.method891(Static178.aClass185_49, Static443.anInt6954, 0);
				Static187.aClass85_11 = arg0.method5707(local49);
				local49.method889();
				Static67.aClass85_24 = arg0.method5707(local49);
			} else {
				arg0.P(local7, local9, local11, 20, 255 - Static192.anInt3533 << 24 | Static72.anInt1059, 1);
			}
		}
		@Pc(95) int local95;
		@Pc(93) int local93;
		if (Static414.aClass85_21 != null && Static187.aClass85_11 != null) {
			local93 = (local11 - Static187.aClass85_11.YA() * 2) / Static414.aClass85_21.YA();
			for (local95 = 0; local95 < local93; local95++) {
				Static414.aClass85_21.method5406(Static187.aClass85_11.YA() + local7 + Static414.aClass85_21.YA() * local95, local9);
			}
			Static187.aClass85_11.method5406(local7, local9);
			Static67.aClass85_24.method5406(local11 + local7 - Static67.aClass85_24.YA(), local9);
		}
		Static17.aClass137_5.method4587(local9 + 14, local7 + 3, Static141.aClass142_97.method3118(Static63.anInt981), Static101.anInt1355 | 0xFF000000, -1);
		arg0.P(local7, local9 + 20, local11, local20 - 20, Static72.anInt1059 | -Static192.anInt3533 + 255 << 24, 1);
		local93 = Static181.aClass224_1.method5613();
		local95 = Static181.aClass224_1.method5615();
		@Pc(175) int local175 = 0;
		@Pc(198) int local198;
		for (@Pc(180) Class1_Sub10 local180 = (Class1_Sub10) Static57.aClass14_3.method203(); local180 != null; local180 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			local198 = local9 + (Static76.anInt1078 - local175 - 1) * 16 + 20 + 13;
			local175++;
			if (local93 > local7 && local7 + local11 > local93 && local95 > local198 - 13 && local198 + 4 > local95 && local180.aBoolean132) {
				arg0.P(local7, local198 - 12, local11, 16, Static446.anInt7040 | 255 - Static137.anInt2139 << 24, 1);
			}
		}
		if ((Static157.aClass85_10 == null || Static292.aClass85_12 == null || Static392.aClass85_20 == null) && Static178.aClass185_49.method4000(Static303.anInt5069) && Static178.aClass185_49.method4000(Static247.anInt4415) && Static178.aClass185_49.method4000(Static463.anInt7429)) {
			@Pc(270) Class52 local270 = Static467.method891(Static178.aClass185_49, Static247.anInt4415, 0);
			Static292.aClass85_12 = arg0.method5707(local270);
			local270.method889();
			Static123.aClass85_9 = arg0.method5707(local270);
			Static157.aClass85_10 = arg0.method5707(Static467.method891(Static178.aClass185_49, Static303.anInt5069, 0));
			@Pc(295) Class52 local295 = Static467.method891(Static178.aClass185_49, Static463.anInt7429, 0);
			Static392.aClass85_20 = arg0.method5707(local295);
			local295.method889();
			Static451.aClass85_25 = arg0.method5707(local295);
		}
		local175 = 0;
		@Pc(371) int local371;
		@Pc(328) int local328;
		if (Static157.aClass85_10 != null && Static292.aClass85_12 != null && Static392.aClass85_20 != null) {
			local198 = (local11 - Static392.aClass85_20.YA() * 2) / Static157.aClass85_10.YA();
			for (local328 = 0; local328 < local198; local328++) {
				Static157.aClass85_10.method5406(local7 + Static392.aClass85_20.YA() + local328 * Static157.aClass85_10.YA(), -Static157.aClass85_10.ZA() + local9 - -local20);
			}
			local371 = (local20 - Static392.aClass85_20.ZA() - 20) / Static292.aClass85_12.ZA();
			for (@Pc(373) int local373 = 0; local373 < local371; local373++) {
				Static292.aClass85_12.method5406(local7, local9 + Static292.aClass85_12.ZA() * local373 + 20);
				Static123.aClass85_9.method5406(local7 + local11 - Static123.aClass85_9.YA(), local373 * Static292.aClass85_12.ZA() + local9 - -20);
			}
			Static392.aClass85_20.method5406(local7, local9 + local20 - Static392.aClass85_20.ZA());
			Static451.aClass85_25.method5406(local11 + local7 - Static392.aClass85_20.YA(), -Static392.aClass85_20.ZA() + local20 + local9);
		}
		for (@Pc(438) Class1_Sub10 local438 = (Class1_Sub10) Static57.aClass14_3.method203(); local438 != null; local438 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			local328 = (Static76.anInt1078 - local175 - 1) * 16 + local9 + 20 + 13;
			local371 = Static101.anInt1355 | 0xFF000000;
			if (local93 > local7 && local7 + local11 > local93 && local95 > local328 - 13 && local328 + 4 > local95 && local438.aBoolean132) {
				local371 = Static236.anInt4262 | 0xFF000000;
			}
			@Pc(494) int[] local494 = null;
			if (Static189.method2734(local438.anInt1057)) {
				local494 = Static285.aClass226_2.method4788((int) local438.aLong31).anIntArray274;
			} else if (local438.anInt1050 != -1) {
				local494 = Static285.aClass226_2.method4788(local438.anInt1050).anIntArray274;
			} else if (Static463.method5977(local438.anInt1057)) {
				@Pc(579) Class1_Sub44 local579 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local438.aLong31);
				if (local579 != null) {
					@Pc(584) Class11_Sub1_Sub3_Sub1 local584 = local579.aClass11_Sub1_Sub3_Sub1_2;
					@Pc(587) Class272 local587 = local584.aClass272_1;
					if (local587.anIntArray543 != null) {
						local587 = local587.method5900(Static32.aClass4_1);
					}
					if (local587 != null) {
						local494 = local587.anIntArray542;
					}
				}
			} else if (Static319.method4209(local438.anInt1057)) {
				@Pc(544) Class87 local544;
				if (local438.anInt1057 == 1002) {
					local544 = Static86.aClass248_7.method5246((int) local438.aLong31);
				} else {
					local544 = Static86.aClass248_7.method5246((int) (local438.aLong31 >>> 32 & 0x7FFFFFFFL));
				}
				if (local544.anIntArray170 != null) {
					local544 = local544.method1571(Static32.aClass4_1);
				}
				if (local544 != null) {
					local494 = local544.anIntArray168;
				}
			}
			@Pc(604) String local604 = Static95.method5204(local438);
			if (local494 != null) {
				local604 = local604 + Static237.method3379(local494);
			}
			Static17.aClass137_5.method4591(local371, local7 + 3, Static138.anIntArray185, local604, Static91.aClass85Array5, local328);
			if (local438.aBoolean131) {
				Static51.aClass85_6.method5406(Static15.aClass252_5.method5291(local604) + local7 + 5, local328 - 12);
			}
			local175++;
		}
		Static140.method1762(Static361.anInt5833, Static64.anInt995, Static25.anInt358, Static273.anInt4719);
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
	public static void method383() {
		Static377.anInt6066 = Static15.aClass252_5.anInt6656 + Static15.aClass252_5.anInt6663 + 2;
		Static253.aStringArray34 = new String[500];
		Static364.anInt5935 = Static392.aClass252_121.anInt6656 + Static392.aClass252_121.anInt6663 + 2;
		for (@Pc(36) int local36 = 0; local36 < Static253.aStringArray34.length; local36++) {
			Static253.aStringArray34[local36] = "";
		}
	}
}
