import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!i", name = "B", descriptor = "I")
	public static int anInt5160;

	@OriginalMember(owner = "client!i", name = "y", descriptor = "Lclient!du;")
	public static final Class62 aClass62_32 = new Class62(6, 7);

	@OriginalMember(owner = "client!i", name = "D", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_194 = new Class67(49, 1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4130(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local8 + local10);
		for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
			@Pc(54) char local54 = arg0.charAt(local48);
			if (local54 == '<') {
				local46.append("<lt>");
			} else if (local54 == '>') {
				local46.append("<gt>");
			} else {
				local46.append(local54);
			}
		}
		return local46.toString();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!hm;Lclient!ul;Lclient!ta;IIILjava/lang/String;IIILclient!la;)V")
	public static void method4132(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) Class73 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class137 arg10) {
		@Pc(13) int local13;
		if (Static139.anInt2147 == 4) {
			local13 = (int) Static99.aFloat9 & 0x3FFF;
		} else {
			local13 = (int) Static99.aFloat9 + Static20.anInt301 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg1.anInt2648 / 2, arg1.anInt2606 / 2) + 10;
		@Pc(42) int local42 = arg6 * arg6 + arg0 * arg0;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(56) int local56 = Class1_Sub29.anIntArray537[local13];
		@Pc(60) int local60 = Class1_Sub29.anIntArray536[local13];
		if (Static139.anInt2147 != 4) {
			local60 = local60 * 256 / (Static265.anInt4616 + 256);
			local56 = local56 * 256 / (Static265.anInt4616 + 256);
		}
		@Pc(91) int local91 = arg0 * local60 + local56 * arg6 >> 15;
		@Pc(106) int local106 = arg6 * local60 - arg0 * local56 >> 15;
		@Pc(113) int local113 = arg2.method5296(100, arg7, null);
		@Pc(119) int local119 = local91 - local113 / 2;
		@Pc(127) int local127 = arg2.method5298(arg7, null);
		if (-arg1.anInt2648 <= local119 && arg1.anInt2648 >= local119 && local106 >= -arg1.anInt2606 && local106 <= arg1.anInt2606) {
			arg10.method4595(50, 0, arg8 + arg1.anInt2606 / 2 - local127 - local106 - arg5, 0, arg9, arg3, arg1.anInt2648 / 2 + local119 + arg4, arg8, local113, null, arg4, null, arg7);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lclient!fp;")
	public static Class1_Sub15 method4133() {
		if (Static430.aClass14_23 == null || Static21.aClass228_1 == null) {
			return null;
		}
		for (@Pc(27) Class1_Sub15 local27 = (Class1_Sub15) Static21.aClass228_1.method4808(); local27 != null; local27 = (Class1_Sub15) Static21.aClass228_1.method4808()) {
			@Pc(35) Class128 local35 = Static430.aClass36_4.method659(local27.anInt1847);
			if (local35 != null && local35.aBoolean336 && local35.method2737(Static430.anInterface12_2)) {
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!za;ILclient!fp;Lclient!jd;II)Z")
	public static boolean method4134(@OriginalArg(0) Class117 arg0, @OriginalArg(2) Class1_Sub15 arg1, @OriginalArg(3) Class128 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray259 != null) {
			local7 = (Static430.anInt4145 - Static430.anInt4135) * (arg1.anInt1843 + arg2.anInt3480 - Static430.anInt4138) / (Static430.anInt4141 - Static430.anInt4138) + Static430.anInt4135;
			local13 = Static430.anInt4136 - (arg2.anInt3487 + arg1.anInt1842 - Static430.anInt4142) * (Static430.anInt4136 + -Static430.anInt4139) / (Static430.anInt4143 - Static430.anInt4142);
			local11 = Static430.anInt4136 - (arg1.anInt1842 + arg2.anInt3482 - Static430.anInt4142) * (Static430.anInt4136 - Static430.anInt4139) / (Static430.anInt4143 - Static430.anInt4142);
			local9 = (Static430.anInt4145 - Static430.anInt4135) * (arg1.anInt1843 + arg2.anInt3481 - Static430.anInt4138) / (Static430.anInt4141 - Static430.anInt4138) + Static430.anInt4135;
		}
		@Pc(103) Class85 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg2.anInt3486 != -1) {
			if (arg1.aBoolean195 && arg2.anInt3476 != -1) {
				local103 = arg2.method2738(true, arg0);
			} else {
				local103 = arg2.method2738(false, arg0);
			}
			if (local103 != null) {
				local105 = arg1.anInt1848 - (local103.RA() + 1 >> 1);
				if (local7 > local105) {
					local7 = local105;
				}
				local107 = arg1.anInt1848 + (local103.RA() + 1 >> 1);
				if (local9 < local107) {
					local9 = local107;
				}
				local114 = arg1.anInt1850 - (local103.Q() + 1 >> 1);
				local116 = arg1.anInt1850 + (local103.Q() + 1 >> 1);
				if (local11 > local114) {
					local11 = local114;
				}
				if (local116 > local13) {
					local13 = local116;
				}
			}
		}
		@Pc(216) Class263 local216 = null;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(279) int local279;
		@Pc(302) int local302;
		if (arg2.aString36 != null) {
			local216 = Static257.method3604(arg2.anInt3493);
			if (local216 != null) {
				local218 = Static106.aClass252_140.method5297(arg2.aString36, Static359.aStringArray38, null, null);
				local220 = arg1.anInt1850;
				if (local103 == null) {
					local220 -= local218 * local216.method5485() / 2;
				} else {
					local220 -= (local103.Q() >> 1) + local218 * local216.method5487();
				}
				for (local279 = 0; local279 < local218; local279++) {
					@Pc(285) String local285 = Static359.aStringArray38[local279];
					if (local279 < local218 - 1) {
						local285 = local285.substring(0, local285.length() - 4);
					}
					local302 = local216.method5486(local285);
					if (local222 < local302) {
						local222 = local302;
					}
				}
				local224 = arg1.anInt1848 - local222 / 2;
				local226 = local222 / 2 + arg1.anInt1848;
				if (local224 < local7) {
					local7 = local224;
				}
				if (local9 < local226) {
					local9 = local226;
				}
				local228 = local220;
				if (local228 < local11) {
					local11 = local228;
				}
				local230 = local220 + local216.method5487() * local218;
				if (local230 > local13) {
					local13 = local230;
				}
			}
		}
		if (Static430.anInt4135 > local9 || Static430.anInt4145 < local7 || local13 < Static430.anInt4139 || Static430.anInt4136 < local11) {
			return true;
		}
		@Pc(409) int local409;
		if (arg2.anIntArray259 != null) {
			@Pc(407) int[] local407 = new int[arg2.anIntArray259.length];
			for (local409 = 0; local409 < local407.length / 2; local409++) {
				local302 = arg2.anIntArray259[local409 * 2] + arg1.anInt1843;
				@Pc(434) int local434 = arg1.anInt1842 + arg2.anIntArray259[local409 * 2 + 1];
				local407[local409 * 2] = (local302 - Static430.anInt4138) * (-Static430.anInt4135 + Static430.anInt4145) / (Static430.anInt4141 - Static430.anInt4138) + Static430.anInt4135;
				local407[local409 * 2 + 1] = Static430.anInt4136 - (Static430.anInt4136 - Static430.anInt4139) * (local434 + -Static430.anInt4142) / (Static430.anInt4143 - Static430.anInt4142);
			}
			Static16.method285(arg0, local407, arg2.anInt3491);
			for (local302 = 0; local302 < local407.length / 2 - 1; local302++) {
				arg0.method5675(local407[local302 * 2 + 2 + 1], local407[local302 * 2], local407[local302 * 2 + 1], local407[(local302 + 1) * 2], arg2.anInt3471);
			}
			arg0.method5675(local407[1], local407[local407.length - 2], local407[local407.length - 1], local407[0], arg2.anInt3471);
		}
		if (local103 != null) {
			if (Static47.anInt678 > 0 && (Static232.anInt4196 != -1 && Static232.anInt4196 == arg1.anInt1847 || Static32.anInt496 != -1 && Static32.anInt496 == arg2.anInt3484)) {
				if (Static80.anInt1104 > 50) {
					local279 = (100 - Static80.anInt1104) * 2;
				} else {
					local279 = Static80.anInt1104 * 2;
				}
				local409 = local279 << 24 | 0xFFFF00;
				arg0.method5682(local409, arg1.anInt1850, arg1.anInt1848, local103.YA() / 2 + 7);
				arg0.method5682(local409, arg1.anInt1850, arg1.anInt1848, local103.YA() / 2 + 5);
				arg0.method5682(local409, arg1.anInt1850, arg1.anInt1848, local103.YA() / 2 + 3);
				arg0.method5682(local409, arg1.anInt1850, arg1.anInt1848, local103.YA() / 2 + 1);
				arg0.method5682(local409, arg1.anInt1850, arg1.anInt1848, local103.YA() / 2);
			}
			local103.method5406(arg1.anInt1848 - (local103.RA() >> 1), arg1.anInt1850 + -(local103.Q() >> 1));
		}
		if (arg2.aString36 != null && local216 != null) {
			Static463.method5979(local222, local220, arg1, local216, local218, arg0, arg2);
		}
		if (arg2.anInt3486 != -1 || arg2.aString36 != null) {
			@Pc(731) Class1_Sub41 local731 = new Class1_Sub41(arg1);
			local731.anInt6011 = local114;
			local731.anInt6012 = local224;
			local731.anInt6014 = local107;
			local731.anInt6019 = local116;
			local731.anInt6017 = local230;
			local731.anInt6013 = local105;
			local731.anInt6016 = local226;
			local731.anInt6015 = local228;
			Static350.aClass14_40.method205(local731);
		}
		return false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!oi;Lclient!oi;)I")
	public static int method4135(@OriginalArg(1) Class185 arg0, @OriginalArg(2) Class185 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method4000(Static31.anInt478)) {
			local5++;
		}
		if (arg1.method4000(Static4.anInt60)) {
			local5++;
		}
		if (arg1.method4000(Static2.anInt34)) {
			local5++;
		}
		if (arg0.method4000(Static31.anInt478)) {
			local5++;
		}
		if (arg0.method4000(Static4.anInt60)) {
			local5++;
		}
		if (arg0.method4000(Static2.anInt34)) {
			local5++;
		}
		return local5;
	}
}
