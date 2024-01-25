import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "Ljava/lang/Object;")
	public static Object anObject37;

	@OriginalMember(owner = "client!qga", name = "n", descriptor = "Lclient!bi;")
	public static Class31 aClass31_96;

	@OriginalMember(owner = "client!qga", name = "r", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
	public static int anInt7416;

	@OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
	public static int anInt7419 = 0;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLjava/lang/String;ZLclient!oa;Lclient!ta;Lclient!kga;)V")
	public static void method6141(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) Class91 arg3, @OriginalArg(5) Class196 arg4) {
		@Pc(19) int local19;
		@Pc(28) int local28;
		if (Static243.aBoolean363 && Static286.method7186()) {
			@Pc(124) Class196 local124 = Static204.aClass196_6;
			@Pc(130) Class91 local130 = arg2.method6829(local124, Static406.aClass268Array1);
			local19 = local124.method4380(arg0, null, 250);
			local28 = local124.method4379(local124.anInt5167, null, arg0, 250);
			@Pc(149) int local149 = Static237.aClass268_3.anInt7058;
			@Pc(153) int local153 = local149 + 4;
			local28 += local153 * 2;
			local19 += local153 * 2;
			if (local28 < Static355.anInt6193) {
				local28 = Static355.anInt6193;
			}
			if (Static86.anInt2259 > local19) {
				local19 = Static86.anInt2259;
			}
			@Pc(184) int local184 = Static598.aClass297_13.method6544(local19, Static9.anInt8933) + Static580.anInt2669;
			@Pc(193) int local193 = Static578.aClass58_14.method1299(local28, Static576.anInt9547) + Static129.anInt2976;
			arg2.method6799(Static578.aClass268_4, false).method8027(local184 + Static136.aClass268_1.anInt7058, Static136.aClass268_1.anInt7060 + local193, local19 - Static136.aClass268_1.anInt7058 * 2, local28 + -(Static136.aClass268_1.anInt7060 * 2));
			arg2.method6799(Static136.aClass268_1, true).method8019(local184, local193);
			Static136.aClass268_1.method5877();
			arg2.method6799(Static136.aClass268_1, true).method8019(local184 + local19 - local149, local193);
			Static136.aClass268_1.method5880();
			arg2.method6799(Static136.aClass268_1, true).method8019(local19 + local184 - local149, local28 + local193 - local149);
			Static136.aClass268_1.method5877();
			arg2.method6799(Static136.aClass268_1, true).method8019(local184, local193 + local28 - local149);
			Static136.aClass268_1.method5880();
			arg2.method6799(Static237.aClass268_3, true).method8027(local184, local193 + Static136.aClass268_1.anInt7060, local149, local28 - Static136.aClass268_1.anInt7060 * 2);
			Static237.aClass268_3.method5876();
			arg2.method6799(Static237.aClass268_3, true).method8027(local184 + Static136.aClass268_1.anInt7058, local193, local19 - Static136.aClass268_1.anInt7058 * 2, local149);
			Static237.aClass268_3.method5876();
			arg2.method6799(Static237.aClass268_3, true).method8027(local184 + local19 - local149, Static136.aClass268_1.anInt7060 + local193, local149, local28 - Static136.aClass268_1.anInt7060 * 2);
			Static237.aClass268_3.method5876();
			arg2.method6799(Static237.aClass268_3, true).method8027(local184 + Static136.aClass268_1.anInt7058, -local149 + local28 + local193, local19 - Static136.aClass268_1.anInt7058 * 2, local149);
			Static237.aClass268_3.method5876();
			local130.method7465(-1, 1, local153 + local193, -(local153 * 2) + local28, 0, local153 + local184, arg0, 0, null, null, 0, local19 - local153 * 2, Static159.anInt3539 | 0xFF000000, 1, null);
			Static268.method4360(local184, local19, local28, local193);
		} else {
			local19 = arg4.method4380(arg0, null, 250);
			local28 = arg4.method4382(arg0, 250, null) * 13;
			arg2.C(6, 6, local19 + 4 + 4, local28 + 4 + 4, -16777216, 0);
			arg2.method6786(6, 6, local19 + 4 + 4, local28 + 4 + 4, -1, 0);
			arg3.method7465(-1, 1, 10, local28, 0, 10, arg0, 0, null, null, 0, local19, -1, 1, null);
			Static268.method4360(6, local19 + 4 + 4, local28 + 4 + 4, 6);
		}
		if (arg1) {
			try {
				arg2.method6847();
			} catch (@Pc(412) Exception_Sub1 local412) {
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method6144(@OriginalArg(0) Class66 arg0) {
		arg0.ca(0, 0, Static2.anInt29, 350);
		arg0.C(0, 0, Static2.anInt29, 350, Static202.anInt4245 << 24 | 0x332277, 1);
		@Pc(32) int local32 = 350 / Static515.anInt8858;
		@Pc(41) int local41;
		if (Static174.anInt3757 > 0) {
			local41 = 346 - Static515.anInt8858 - 4;
			@Pc(51) int local51 = local41 * local32 / (local32 + Static174.anInt3757 - 1);
			@Pc(53) int local53 = 4;
			if (Static174.anInt3757 > 1) {
				local53 = (local41 - local51) * (Static174.anInt3757 + -1 + -Static335.anInt6552) / (Static174.anInt3757 - 1) + 4;
			}
			arg0.C(Static2.anInt29 - 16, local53, 12, local51, Static202.anInt4245 << 24 | 0x332277, 2);
			for (@Pc(92) int local92 = Static335.anInt6552; local32 + Static335.anInt6552 > local92 && Static174.anInt3757 > local92; local92++) {
				@Pc(101) String[] local101 = Static246.method4172(Static192.aStringArray13[local92], '\b');
				@Pc(110) int local110 = (Static2.anInt29 - 16 - 8) / local101.length;
				for (@Pc(112) int local112 = 0; local112 < local101.length; local112++) {
					@Pc(120) int local120 = local110 * local112 + 8;
					arg0.ca(local120, 0, local120 + local110 - 8, 350);
					Static375.aClass91_7.method7451(local120, -1, -16777216, local101[local112], 348 - Static515.anInt8858 * (local92 - Static335.anInt6552) - Static162.aClass196_4.anInt5177 - Static129.anInt2971);
				}
			}
		}
		arg0.ca(0, 0, Static2.anInt29, 350);
		arg0.method6817(0, -1, 350 - Static129.anInt2971, Static2.anInt29);
		Static65.aClass91_4.method7451(10, -1, -16777216, "--> " + Static221.aString45, 350 - Static195.aClass196_5.anInt5177 - 1);
		if (!Static340.aBoolean446) {
			return;
		}
		local41 = -1;
		if (Static237.anInt7561 % 30 > 15) {
			local41 = 16777215;
		}
		arg0.method6782(local41, Static195.aClass196_5.method4386("--> " + Static221.aString45.substring(0, Static292.anInt5390)) + 10, 12, 350 - Static195.aClass196_5.anInt5177 - 11);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII)V")
	public static void method6145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static577.anIntArrayArray78 != null) {
			Static577.anIntArrayArray78[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static310.aShortArrayArray23 != null) {
			Static310.aShortArrayArray23[arg0][arg1] = (short) arg3;
		}
		if (Static68.aByteArrayArray6 != null) {
			Static68.aByteArrayArray6[arg0][arg1] = (byte) arg4;
		}
	}
}
