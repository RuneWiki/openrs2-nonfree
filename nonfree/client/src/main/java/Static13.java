import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Lclient!ja;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_5 = new Class154(50);

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public static int anInt306 = 0;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public static int anInt307 = 0;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "[I")
	public static final int[] anIntArray45 = new int[500];

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public static int anInt309 = -1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!td;)V")
	public static void method306(@OriginalArg(0) Class4_Sub12_Sub1 arg0) {
		if (Static161.anInt3632 >= 255) {
			return;
		}
		Static126.aClass4_Sub12_Sub1Array1[Static161.anInt3632] = arg0;
		Static6.aBooleanArray15[Static161.anInt3632] = false;
		Static161.anInt3632++;
		@Pc(18) int local18 = arg0.anInt6093;
		if (arg0.aBoolean534) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt6093;
		if (arg0.aBoolean533) {
			local26 = Static112.anInt2455 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt6081 + 64 - arg0.anInt6083 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt6081 + arg0.anInt6083 - 64 >> 7;
			if (local66 >= Static220.anInt4569) {
				local66 = Static220.anInt4569 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray111[local38++];
				@Pc(96) int local96 = (arg0.anInt6082 + 64 - arg0.anInt6083 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static151.anInt3338) {
					local104 = Static151.anInt3338 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static148.anIntArrayArrayArray13[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static148.anIntArrayArrayArray13[local35][local117][local75] = local126 | Static161.anInt3632;
					} else if ((local126 & 0xFF00) == 0) {
						Static148.anIntArrayArrayArray13[local35][local117][local75] = local126 | Static161.anInt3632 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static148.anIntArrayArrayArray13[local35][local117][local75] = local126 | Static161.anInt3632 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static148.anIntArrayArrayArray13[local35][local117][local75] = local126 | Static161.anInt3632 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V")
	public static void method307() {
		if (!Static265.method4633()) {
			return;
		}
		if (Static154.aStringArray27 == null) {
			Static173.method3266();
		}
		Static258.anIntArray440 = new int[100];
		Static166.aBoolean306 = true;
		Static327.aBooleanArray31 = new boolean[100];
		Static139.anIntArray281 = new int[100];
		Static327.anIntArray509 = new int[100];
		Static17.anInt362 = 0;
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			Static139.anIntArray281[local26] = (int) ((double) Static202.anInt4258 * Math.random());
			Static327.anIntArray509[local26] = (int) (Math.random() * 350.0D);
			Static258.anIntArray440[local26] = (int) (Math.random() * 102.0D);
			Static327.aBooleanArray31[local26] = Math.random() < 0.5D;
		}
		try {
			Static301.aClipboard1 = Static78.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(70) Exception local70) {
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[IIILclient!qs;IIZIIIIII[I)I")
	public static int method308(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class174 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static36.anIntArrayArray11[local7][local11] = 0;
				Static218.anIntArrayArray41[local7][local11] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg10 == 1) {
			local58 = Static114.method2080(arg0, arg12, arg9, arg8, arg4, arg3, arg2, arg11, arg5, arg6);
		} else if (arg10 == 2) {
			local58 = Static78.method1410(arg11, arg12, arg3, arg0, arg4, arg5, arg2, arg9, arg8, arg6);
		} else {
			local58 = Static10.method250(arg4, arg12, arg9, arg10, arg2, arg6, arg11, arg0, arg8, arg5, arg3);
		}
		@Pc(93) int local93 = arg9 - 64;
		@Pc(102) int local102 = arg11 - 64;
		@Pc(104) int local104 = Static295.anInt5963;
		@Pc(106) int local106 = Static330.anInt6452;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(121) int local121;
		if (!local58) {
			if (!arg7) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local121 = arg6 - 10; local121 <= arg6 + 10; local121++) {
				for (@Pc(128) int local128 = arg12 - 10; local128 <= arg12 + 10; local128++) {
					@Pc(135) int local135 = local121 - local93;
					@Pc(140) int local140 = local128 - local102;
					if (local135 >= 0 && local140 >= 0 && local135 < 128 && local140 < 128 && Static218.anIntArrayArray41[local135][local140] < 100) {
						@Pc(162) int local162 = 0;
						if (local121 < arg6) {
							local162 = arg6 - local121;
						} else if (local121 > arg6 + arg2 - 1) {
							local162 = local121 + 1 - arg6 - arg2;
						}
						@Pc(198) int local198 = 0;
						if (local128 < arg12) {
							local198 = arg12 - local128;
						} else if (arg12 + arg5 - 1 < local128) {
							local198 = local128 + 1 - arg5 - arg12;
						}
						@Pc(237) int local237 = local162 * local162 + local198 * local198;
						if (local237 < local112 || local112 == local237 && local114 > Static218.anIntArrayArray41[local135][local140]) {
							local112 = local237;
							local104 = local121;
							local106 = local128;
							local114 = Static218.anIntArrayArray41[local135][local140];
						}
					}
				}
			}
			if (~local112 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg9 == local104 && arg11 == local106) {
			return 0;
		}
		@Pc(306) byte local306 = 0;
		Static304.anIntArray499[0] = local104;
		local112 = local306 + 1;
		Static333.anIntArray5[0] = local106;
		@Pc(327) int local327;
		local114 = local327 = Static36.anIntArrayArray11[local104 - local93][local106 - local102];
		while (arg9 != local104 || local106 != arg11) {
			if (local327 != local114) {
				Static304.anIntArray499[local112] = local104;
				local327 = local114;
				Static333.anIntArray5[local112++] = local106;
			}
			if ((local114 & 0x2) != 0) {
				local104++;
			} else if ((local114 & 0x8) != 0) {
				local104--;
			}
			if ((local114 & 0x1) != 0) {
				local106++;
			} else if ((local114 & 0x4) != 0) {
				local106--;
			}
			local114 = Static36.anIntArrayArray11[local104 - local93][local106 - local102];
		}
		local121 = 0;
		while (local112-- > 0) {
			arg13[local121] = Static304.anIntArray499[local112];
			arg1[local121++] = Static333.anIntArray5[local112];
			if (local121 >= arg13.length) {
				break;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)Z")
	public static boolean method309(@OriginalArg(1) int arg0) {
		if (arg0 == 2 || arg0 == 58 || arg0 == 38 || arg0 == 9 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 7 || arg0 == 1010;
		}
	}
}
