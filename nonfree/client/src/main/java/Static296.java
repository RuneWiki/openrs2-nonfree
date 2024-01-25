import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
	public static int anInt5132;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
	public static boolean method4125(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!za;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4127(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static142.aClass50_5 = arg0;
		Static65.anInt1178 = arg1;
		Static364.aClass34_5 = arg3;
		Static97.aBoolean73 = Static142.aClass50_5.method5854() > 0;
		Static18.anInt316 = arg4 >> Static286.anInt5018;
		Static265.anInt4683 = arg6 >> Static286.anInt5018;
		Static401.anInt7402 = arg4;
		Static336.anInt5672 = arg6;
		Static446.anInt7492 = arg5;
		Static12.anInt226 = Static18.anInt316 - Static451.anInt7524;
		if (Static12.anInt226 < 0) {
			Static115.anInt2361 = -Static12.anInt226;
			Static12.anInt226 = 0;
		} else {
			Static115.anInt2361 = 0;
		}
		Static137.anInt2871 = Static265.anInt4683 - Static451.anInt7524;
		if (Static137.anInt2871 < 0) {
			Static326.anInt5607 = -Static137.anInt2871;
			Static137.anInt2871 = 0;
		} else {
			Static326.anInt5607 = 0;
		}
		Static430.anInt7228 = Static18.anInt316 + Static451.anInt7524;
		if (Static430.anInt7228 > Static54.anInt998) {
			Static430.anInt7228 = Static54.anInt998;
		}
		Static256.anInt4594 = Static265.anInt4683 + Static451.anInt7524;
		if (Static256.anInt4594 > Static24.anInt401) {
			Static256.anInt4594 = Static24.anInt401;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static451.anInt7524 + Static451.anInt7524 + 2; local74++) {
			for (local77 = 0; local77 < Static451.anInt7524 + Static451.anInt7524 + 2; local77++) {
				local84 = Static18.anInt316 + local74 - Static451.anInt7524;
				local90 = Static265.anInt4683 + local77 - Static451.anInt7524;
				if (local84 >= 0 && local90 >= 0 && local84 < Static54.anInt998 && local90 < Static24.anInt401) {
					@Pc(104) int local104 = local84 << Static286.anInt5018;
					@Pc(108) int local108 = local90 << Static286.anInt5018;
					@Pc(124) int local124 = Static256.aClass154Array2[Static256.aClass154Array2.length - 1].ua(local84, local90) - (0x3E8 << Static286.anInt5018 - 7);
					@Pc(144) int local144 = Static173.aClass154Array1 == null ? Static256.aClass154Array2[0].ua(local84, local90) + Static335.anInt5671 : Static173.aClass154Array1[0].ua(local84, local90) + Static335.anInt5671;
					Static432.aBooleanArrayArray7[local74][local77] = Static142.aClass50_5.VA(local104, local124, local108, local104, local144, local108);
				} else {
					Static432.aBooleanArrayArray7[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static451.anInt7524 + Static451.anInt7524 + 1; local77++) {
			for (local84 = 0; local84 < Static451.anInt7524 + Static451.anInt7524 + 1; local84++) {
				Static460.aBooleanArrayArray9[local77][local84] = Static432.aBooleanArrayArray7[local77][local84] || Static432.aBooleanArrayArray7[local77 + 1][local84] || Static432.aBooleanArrayArray7[local77][local84 + 1] || Static432.aBooleanArrayArray7[local77 + 1][local84 + 1];
			}
		}
		Static40.anIntArray61 = arg8;
		Static101.anIntArray747 = arg9;
		Static81.anIntArray130 = arg10;
		Static277.anIntArray473 = arg11;
		Static144.anIntArray287 = arg12;
		Static175.method1576();
		Static11.method164();
		for (@Pc(260) Class40_Sub5 local260 = (Class40_Sub5) Static191.aClass240_2.method5227(); local260 != null; local260 = (Class40_Sub5) Static191.aClass240_2.method5230()) {
			local260.method4364();
			Static386.method5171(local260);
		}
		if (Static97.aBoolean73) {
			for (local90 = 0; local90 < Static135.anInt6872; local90++) {
				Static25.aClass225Array1[local90].method4982(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static142.aClass50_5.method5826(0);
			if (Static39.aClass8_1 == null || Static39.aClass8_1 instanceof Class8_Sub2) {
				Static39.aClass8_1 = new Class8_Sub1();
			}
		} else if (Static39.aClass8_1 == null || Static39.aClass8_1 instanceof Class8_Sub1) {
			Static39.aClass8_1 = new Class8_Sub2();
		}
		Static39.aClass8_1.method3752(arg2);
		Static39.aClass8_1.method3750();
		if (Static36.aClass11ArrayArrayArray1 != null) {
			Static45.method5774(true);
			Static39.aClass8_1.method3754(22);
			Static254.method3691(arg2, null, 0, (byte) 0, arg15, arg16);
			Static39.aClass8_1.method3750();
			Static39.aClass8_1.method3754(23);
			Static45.method5774(false);
		}
		Static254.method3691(arg2, arg7, arg13, arg14, arg15, arg16);
		Static39.aClass8_1.method3750();
		Static39.aClass8_1.method3755();
		Static39.aClass8_1.method3750();
		if (arg2 > 1) {
			Static142.aClass50_5.method5832(0);
		}
		Static142.aClass50_5.method5869(0, null);
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)I")
	public static int method4131() {
		if (Static458.aClass89_14 == null) {
			if (!Static35.aBoolean37 && Static207.anInt4055 > 0) {
				if (Static106.aBoolean134 && Static197.aClass245_1.method5907(81) && Static207.anInt4055 > 2) {
					return ((Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264.aClass10_264).anInt7504;
				}
				return ((Class10_Sub45) Static70.aClass163_13.aClass10_149.aClass10_264).anInt7504;
			}
			@Pc(46) int local46 = Static113.aClass13_1.method4116();
			@Pc(50) int local50 = Static113.aClass13_1.method4123();
			@Pc(52) int local52 = Static270.anInt4755;
			@Pc(54) int local54 = Static279.anInt4882;
			@Pc(56) int local56 = Static226.anInt4217;
			if (local52 < local46 && local46 < local52 + local56) {
				@Pc(71) int local71 = -1;
				@Pc(91) int local91;
				for (@Pc(73) int local73 = 0; local73 < Static207.anInt4055; local73++) {
					if (Static39.aBoolean44) {
						local91 = local54 + (Static207.anInt4055 - local73 - 1) * 16 + 33;
						if (local50 > local91 - 13 && local50 <= local91 + 3) {
							local71 = local73;
						}
					} else {
						local91 = local54 + (Static207.anInt4055 + -1 + -local73) * 16 + 31;
						if (local50 > local91 - 13 && local50 <= local91 + 3) {
							local71 = local73;
						}
					}
				}
				if (local71 != -1) {
					local91 = 0;
					@Pc(161) Class90 local161 = new Class90(Static70.aClass163_13);
					for (@Pc(168) Class10_Sub45 local168 = (Class10_Sub45) local161.method2297(); local168 != null; local168 = (Class10_Sub45) local161.method2299()) {
						if (local71 == local91++) {
							return local168.anInt7504;
						}
					}
				}
			}
		}
		return -1;
	}
}
