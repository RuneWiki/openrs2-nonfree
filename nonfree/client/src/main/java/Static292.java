import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt5800;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public static int anInt5804;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	public static int anInt5805;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt5802 = 0;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
	public static void method4475(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static245.anInt1237 = 0;
		Static28.anInt606 = arg1;
		Static24.anInt556 = 0;
		Static284.anInt5643 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public static void method4476(@OriginalArg(1) int arg0) {
		Static29.anInt626--;
		if (arg0 == Static29.anInt626) {
			return;
		}
		Static300.method486(Static277.aStringArray35, arg0 + 1, Static277.aStringArray35, arg0, Static29.anInt626 - arg0);
		Static300.method486(Static190.aStringArray19, arg0 + 1, Static190.aStringArray19, arg0, Static29.anInt626 - arg0);
		Static300.method491(Static64.anIntArray148, arg0 + 1, Static64.anIntArray148, arg0, Static29.anInt626 - arg0);
		Static300.method489(Static276.aShortArray92, arg0 + 1, Static276.aShortArray92, arg0, Static29.anInt626 - arg0);
		Static300.method485(Static128.aLongArray6, arg0 + 1, Static128.aLongArray6, arg0, Static29.anInt626 - arg0);
		Static300.method491(Static55.anIntArray140, arg0 + 1, Static55.anIntArray140, arg0, Static29.anInt626 - arg0);
		Static300.method491(Static221.anIntArray522, arg0 + 1, Static221.anIntArray522, arg0, Static29.anInt626 - arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BII[Lclient!ac;IIIIZBI)V")
	public static void method4477(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = -1;
		@Pc(16) Class1_Sub18 local16 = new Class1_Sub18(arg0);
		while (true) {
			@Pc(20) int local20 = local16.method3096();
			if (local20 == 0) {
				return;
			}
			local11 += local20;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local16.method3117();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(56) int local56 = local33 >> 12;
				@Pc(60) int local60 = local16.method3122();
				@Pc(66) int local66 = local33 >> 6 & 0x3F;
				@Pc(70) int local70 = local60 >> 2;
				@Pc(74) int local74 = local60 & 0x3;
				if (arg2 == local56 && arg4 <= local66 && local66 < arg4 + 8 && arg1 <= local52 && local52 < arg1 + 8) {
					@Pc(110) Class104 local110 = Static35.method636(local11);
					@Pc(128) int local128 = arg5 + Static199.method3040(arg6, local110.anInt2814, local66 & 0x7, local52 & 0x7, local74, local110.anInt2817);
					@Pc(146) int local146 = arg7 + Static20.method353(local110.anInt2817, local110.anInt2814, local74, local66 & 0x7, arg6, local52 & 0x7);
					if (local128 > 0 && local146 > 0 && local128 < 103 && local146 < 103) {
						@Pc(165) Class2 local165 = null;
						if (!arg8) {
							@Pc(169) int local169 = arg9;
							if ((Static242.aByteArrayArrayArray23[1][local128][local146] & 0x2) == 2) {
								local169 = arg9 - 1;
							}
							if (local169 >= 0) {
								local165 = arg3[local169];
							}
						}
						Static232.method3822(local11, !arg8, local146, local70, local128, arg9, local165, arg8, arg9, arg6 + local74 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIZIIIIII)V")
	public static void method4478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8) {
		@Pc(6) int local6 = arg8 - arg7;
		@Pc(12) int local12 = -1;
		@Pc(17) int local17 = arg6 - arg3;
		@Pc(21) int local21 = 983040 / arg1;
		if (Static35.anInt735 > 0) {
			if (Static254.anInt5884 <= 10) {
				local12 = Static254.anInt5884 * 5;
			} else {
				local12 = (10 + 10 - Static254.anInt5884) * 5;
			}
		}
		@Pc(49) int local49 = 983040 / arg5;
		for (@Pc(52) int local52 = -local21; local52 < local21 + local6; local52++) {
			@Pc(74) int local74 = arg1 * local52 >> 16;
			@Pc(85) int local85 = arg1 * (local52 + 1) >> 16;
			@Pc(90) int local90 = local85 - local74;
			if (local90 > 0) {
				local74 += arg0;
				@Pc(103) int local103 = arg7 + local52 >> 6;
				if (local103 >= 0 && Static84.anIntArrayArrayArray9.length - 1 >= local103) {
					@Pc(128) int[][] local128 = Static84.anIntArrayArrayArray9[local103];
					for (@Pc(131) int local131 = -local49; local131 < local49 + local17; local131++) {
						@Pc(148) int local148 = local131 * arg5 >> 16;
						@Pc(158) int local158 = arg5 * (local131 + 1) >> 16;
						@Pc(162) int local162 = local158 - local148;
						if (local162 > 0) {
							@Pc(172) int local172 = local131 + arg3 >> 6;
							local148 += arg2;
							if (local172 >= 0 && local128.length - 1 >= local172 && local128[local172] != null) {
								@Pc(214) int local214 = (arg7 + local52 & 0x3F) + ((arg3 + local131 & 0x3F) << 6);
								@Pc(220) int local220 = local128[local172][local214];
								if (local220 != 0) {
									@Pc(233) Class104 local233 = Static35.method636(local220 - 1);
									if (!Static257.aBooleanArray23[local233.anInt2801]) {
										if (local12 != -1 && Static79.anInt2909 == local233.anInt2801) {
											@Pc(251) Class1_Sub5 local251 = new Class1_Sub5();
											local251.anInt1013 = local233.anInt2801;
											local251.anInt1015 = local74;
											local251.anInt1011 = local148;
											Static290.aClass69_27.method1628(local251);
										} else {
											Static76.aClass1_Sub2_Sub2_Sub1Array1[local233.anInt2801].method3921(local74 - 7, local148 + -7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(289) Class1_Sub5 local289 = (Class1_Sub5) Static290.aClass69_27.method1636(); local289 != null; local289 = (Class1_Sub5) Static290.aClass69_27.method1631()) {
			Static213.method3372(local289.anInt1015, local289.anInt1011, 15, local12);
			Static213.method3372(local289.anInt1015, local289.anInt1011, 13, local12);
			Static213.method3372(local289.anInt1015, local289.anInt1011, 11, local12);
			Static213.method3372(local289.anInt1015, local289.anInt1011, 9, local12);
			Static76.aClass1_Sub2_Sub2_Sub1Array1[local289.anInt1013].method3921(local289.anInt1015 - 7, local289.anInt1011 + -7);
		}
		Static290.aClass69_27.method1629();
	}
}
