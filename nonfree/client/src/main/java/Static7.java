import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "Lclient!vo;")
	public static Class348 aClass348_6;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "[I")
	public static final int[] anIntArray11 = new int[500];

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "()V")
	public static void method639() {
		for (@Pc(1) int local1 = Static570.anInt10306; local1 < Static218.anInt4559; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static10.anInt812; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static255.anInt5209; local7++) {
					@Pc(16) Class182 local16 = Static571.aClass182ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class21_Sub1_Sub2 local21 = local16.aClass21_Sub1_Sub2_1;
						@Pc(24) Class21_Sub1_Sub2 local24 = local16.aClass21_Sub1_Sub2_2;
						if (local21 != null && local21.method8225()) {
							Static367.method5533(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8225()) {
								Static367.method5533(local24, local1, local4, local7, 1, 1);
								local24.method8230(local21, 0, false, Static299.aClass7_12, 0, 0);
								local24.method8232();
							}
							local21.method8232();
						}
						for (@Pc(68) Class192 local68 = local16.aClass192_2; local68 != null; local68 = local68.aClass192_3) {
							@Pc(72) Class21_Sub1_Sub1 local72 = local68.aClass21_Sub1_Sub1_1;
							if (local72 != null && local72.method8225()) {
								Static367.method5533(local72, local1, local4, local7, local72.aShort120 + 1 - local72.aShort119, local72.aShort122 - local72.aShort121 + 1);
								local72.method8232();
							}
						}
						@Pc(108) Class21_Sub1_Sub5 local108 = local16.aClass21_Sub1_Sub5_1;
						if (local108 != null && local108.method8225()) {
							Static96.method1896(local108, local1, local4, local7);
							local108.method8232();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIII)V")
	public static void method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17 = arg1 + arg5;
		@Pc(21) int local21 = arg4 - arg5;
		for (@Pc(23) int local23 = arg1; local23 < local17; local23++) {
			Static238.method3886(Static442.anIntArrayArray48[local23], arg3, arg0, arg2);
		}
		for (@Pc(39) int local39 = arg4; local39 > local21; local39--) {
			Static238.method3886(Static442.anIntArrayArray48[local39], arg3, arg0, arg2);
		}
		@Pc(61) int local61 = arg3 - arg5;
		@Pc(65) int local65 = arg2 + arg5;
		for (@Pc(67) int local67 = local17; local67 <= local21; local67++) {
			@Pc(73) int[] local73 = Static442.anIntArrayArray48[local67];
			Static238.method3886(local73, local65, arg0, arg2);
			Static238.method3886(local73, arg3, arg0, local61);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method642(@OriginalArg(0) Class7 arg0) {
		@Pc(7) int local7 = Static593.anInt10604;
		@Pc(9) int local9 = Static469.anInt8895;
		@Pc(11) int local11 = Static303.anInt6098;
		@Pc(13) int local13 = Static340.anInt6537;
		arg0.method7825(local13, local11, local9, -10660793, local7);
		arg0.method7825(16, local11 - 2, local9 - -1, -16777216, local7 + 1);
		arg0.method7800(local9 + 18, local11 + -2, -16777216, local13 - 19, local7 + 1);
		Static306.aClass45_4.method4843(local7 + 3, Static223.aClass152_28.method3624(Static142.anInt3088), -1, -10660793, local9 + 14);
		@Pc(72) int local72 = Static294.aClass83_1.method6895();
		@Pc(76) int local76 = Static294.aClass83_1.method6896();
		@Pc(78) int local78 = 0;
		for (@Pc(87) Class4_Sub36 local87 = (Class4_Sub36) Static593.aClass22_65.method895(); local87 != null; local87 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			@Pc(102) int local102 = local9 + (-local78 + Static384.anInt7556 + -1) * 16 + 31;
			@Pc(104) short local104 = -1;
			if (local72 > local7 && local72 < local11 + local7 && local76 > local102 - 13 && local76 < local102 + 3 && local87.aBoolean510) {
				local104 = -256;
			}
			@Pc(133) int[] local133 = null;
			if (Static221.method956(local87.anInt7137)) {
				local133 = Static338.aClass29_1.method977((int) local87.aLong194).anIntArray384;
			} else if (local87.anInt7142 != -1) {
				local133 = Static338.aClass29_1.method977(local87.anInt7142).anIntArray384;
			} else if (Static208.method3402(local87.anInt7137)) {
				@Pc(209) Class4_Sub29 local209 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local87.aLong194);
				if (local209 != null) {
					@Pc(214) Class21_Sub1_Sub1_Sub1_Sub1 local214 = local209.aClass21_Sub1_Sub1_Sub1_Sub1_1;
					@Pc(217) Class51 local217 = local214.aClass51_1;
					if (local217.anIntArray61 != null) {
						local217 = local217.method1371(Static523.aClass173_1);
					}
					if (local217 != null) {
						local133 = local217.anIntArray63;
					}
				}
			} else if (Static324.method5022(local87.anInt7137)) {
				@Pc(178) Class233 local178;
				if (local87.anInt7137 == 1008) {
					local178 = Static103.aClass298_1.method6822((int) local87.aLong194);
				} else {
					local178 = Static103.aClass298_1.method6822((int) (local87.aLong194 >>> 32 & 0x7FFFFFFFL));
				}
				if (local178.anIntArray374 != null) {
					local178 = local178.method5295(Static523.aClass173_1);
				}
				if (local178 != null) {
					local133 = local178.anIntArray376;
				}
			}
			@Pc(242) String local242 = Static576.method8116(local87);
			if (local133 != null) {
				local242 = local242 + Static282.method4486(local133);
			}
			Static306.aClass45_4.method4846(local102, local242, Static44.anIntArray33, local7 + 3, local104, Static393.aClass88Array9);
			local78++;
			if (local87.aBoolean509) {
				Static575.aClass88_37.method8051(Static503.aClass198_12.method4769(local242) + local7 + 5, local102 - 12);
			}
		}
		Static563.method7978(Static593.anInt10604, Static469.anInt8895, Static303.anInt6098, Static340.anInt6537);
	}
}
