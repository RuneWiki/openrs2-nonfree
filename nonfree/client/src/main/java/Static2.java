import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt9 = 0;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt13 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public static int anInt14 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
	public static boolean method4(@OriginalArg(1) int arg0) {
		Static134.aBoolean160 = true;
		Static140.anInt2585 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!gr;IIII)V")
	public static void method5(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static102.method1556(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static232.anInt4703) {
			Static102.method1556(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static102.method1556(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static300.anInt5931) {
			Static102.method1556(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static300.anInt5931) {
			Static102.method1556(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static232.anInt4703 && arg4 <= Static300.anInt5931) {
			Static102.method1556(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static102.method1556(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static232.anInt4703 && arg4 > 0) {
			Static102.method1556(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[Lclient!ms;IZ)V")
	public static void method6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class137[] arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) Class137 local9 = arg3[local3];
			if (local9 != null && arg1 == local9.anInt4124) {
				Static335.method5472(arg4, arg2, arg0, local9);
				Static275.method4658(arg2, local9, arg0);
				if (local9.anInt4107 > local9.anInt4105 - local9.anInt4060) {
					local9.anInt4107 = local9.anInt4105 - local9.anInt4060;
				}
				if (local9.anInt4107 < 0) {
					local9.anInt4107 = 0;
				}
				if (local9.anInt4079 - local9.anInt4110 < local9.anInt4062) {
					local9.anInt4062 = local9.anInt4079 - local9.anInt4110;
				}
				if (local9.anInt4062 < 0) {
					local9.anInt4062 = 0;
				}
				if (local9.anInt4067 == 0) {
					Static351.method5429(arg4, local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method7(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(68) char local68;
			if (local17 == '\u0000') {
				local68 = arg2.charAt(local13++);
			} else {
				local68 = local17;
			}
			@Pc(81) char local81;
			if (local19 == '\u0000') {
				local81 = arg0.charAt(local15++);
			} else {
				local81 = local19;
			}
			local17 = Static43.method654(local68);
			local19 = Static43.method654(local81);
			local68 = Static62.method918(arg1, local68);
			local81 = Static62.method918(arg1, local81);
			if (local68 != local81 && Character.toUpperCase(local68) != Character.toUpperCase(local81)) {
				local68 = Character.toLowerCase(local68);
				local81 = Character.toLowerCase(local81);
				if (local68 != local81) {
					return Static289.method4817(arg1, local68) - Static289.method4817(arg1, local81);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg1 == 2) {
				local15 = local11 - local143 - 1;
				local13 = local8 - local143 - 1;
			} else {
				local15 = local143;
				local13 = local143;
			}
			@Pc(173) char local173 = arg2.charAt(local13);
			@Pc(177) char local177 = arg0.charAt(local15);
			if (local177 != local173 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local173 != local177) {
					return Static289.method4817(arg1, local173) - Static289.method4817(arg1, local177);
				}
			}
		}
		@Pc(230) int local230 = local8 - local11;
		if (local230 != 0) {
			return local230;
		}
		for (@Pc(239) int local239 = 0; local239 < local141; local239++) {
			@Pc(245) char local245 = arg2.charAt(local239);
			@Pc(249) char local249 = arg0.charAt(local239);
			if (local245 != local249) {
				return Static289.method4817(arg1, local245) - Static289.method4817(arg1, local249);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!nq;)V")
	public static void method8(@OriginalArg(1) Class144 arg0) {
		Static341.aClass144_110 = arg0;
	}
}
