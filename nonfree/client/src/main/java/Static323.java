import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public static int anInt971 = -1;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Z")
	public static boolean aBoolean51 = true;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Z")
	public static boolean aBoolean52 = true;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method977(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local13 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local13 == 2 || Character.isUpperCase(local26)) {
				local26 = Static213.method3829(local26);
			}
			if (Character.isLetter(local26)) {
				local13 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local20] = local26;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[IIII[IIILclient!fn;IIIZII)I")
	public static int method978(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class65 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				Static114.anIntArrayArray36[local12][local16] = 0;
				Static216.anIntArrayArray73[local12][local16] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg10 == 1) {
			local58 = Static14.method338(arg9, arg0, arg2, arg13, arg3, arg12, arg7, arg5, arg8, arg6);
		} else if (arg10 == 2) {
			local58 = Static229.method4047(arg3, arg13, arg7, arg12, arg6, arg9, arg0, arg2, arg8, arg5);
		} else {
			local58 = Static321.method5525(arg0, arg8, arg3, arg12, arg5, arg6, arg13, arg9, arg7, arg10, arg2);
		}
		@Pc(98) int local98 = arg5 - 64;
		@Pc(102) int local102 = arg13 - 64;
		@Pc(104) int local104 = Static7.anInt190;
		@Pc(106) int local106 = Static4.anInt124;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(122) int local122;
		if (!local58) {
			if (!arg11) {
				return -1;
			}
			local114 = Integer.MAX_VALUE;
			local116 = Integer.MAX_VALUE;
			for (local122 = arg6 - 10; local122 <= arg6 + 10; local122++) {
				for (@Pc(129) int local129 = arg0 - 10; local129 <= arg0 + 10; local129++) {
					@Pc(135) int local135 = local122 - local98;
					@Pc(140) int local140 = local129 - local102;
					if (local135 >= 0 && local140 >= 0 && local135 < 128 && local140 < 128 && Static216.anIntArrayArray73[local135][local140] < 100) {
						@Pc(163) int local163 = 0;
						if (local122 < arg6) {
							local163 = arg6 - local122;
						} else if (local122 > arg6 + arg2 - 1) {
							local163 = local122 + 1 - arg6 - arg2;
						}
						@Pc(201) int local201 = 0;
						if (local129 < arg0) {
							local201 = arg0 - local129;
						} else if (local129 > arg3 + arg0 - 1) {
							local201 = local129 + 1 - arg3 - arg0;
						}
						@Pc(244) int local244 = local201 * local201 + local163 * local163;
						if (local244 < local114 || local244 == local114 && local116 > Static216.anIntArrayArray73[local135][local140]) {
							local106 = local129;
							local114 = local244;
							local104 = local122;
							local116 = Static216.anIntArrayArray73[local135][local140];
						}
					}
				}
			}
			if (local114 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg5 == local104 && local106 == arg13) {
			return 0;
		}
		@Pc(305) byte local305 = 0;
		Static34.anIntArray392[0] = local104;
		local114 = local305 + 1;
		Static161.anIntArray298[0] = local106;
		@Pc(326) int local326;
		local116 = local326 = Static114.anIntArrayArray36[local104 - local98][local106 - local102];
		while (arg5 != local104 || arg13 != local106) {
			if (local326 != local116) {
				Static34.anIntArray392[local114] = local104;
				local326 = local116;
				Static161.anIntArray298[local114++] = local106;
			}
			if ((local116 & 0x1) != 0) {
				local106++;
			} else if ((local116 & 0x4) != 0) {
				local106--;
			}
			if ((local116 & 0x2) != 0) {
				local104++;
			} else if ((local116 & 0x8) != 0) {
				local104--;
			}
			local116 = Static114.anIntArrayArray36[local104 - local98][local106 - local102];
		}
		local122 = 0;
		while (local114-- > 0) {
			arg4[local122] = Static34.anIntArray392[local114];
			arg1[local122++] = Static161.anIntArray298[local114];
			if (local122 >= arg4.length) {
				break;
			}
		}
		return local122;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public static void method980() {
		@Pc(8) Class11 local8 = Static190.aClass11_84;
		synchronized (Static190.aClass11_84) {
			Static190.aClass11_84.method213();
		}
		local8 = Static328.aClass11_139;
		synchronized (Static328.aClass11_139) {
			Static328.aClass11_139.method213();
		}
		@Pc(34) Class139 local34 = Static92.aClass139_1;
		synchronized (Static92.aClass139_1) {
			Static92.aClass139_1.method3704();
		}
	}
}
