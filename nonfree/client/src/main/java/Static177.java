import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public static int anInt3615;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_167;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "[Lclient!fc;")
	public static Class29[] aClass29Array8;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	public static int anInt3624;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1039 = Static181.method2795("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt3617 = 0;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	public static int anInt3618 = 0;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public static int anInt3619 = 0;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_13 = new Class91(30);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)I")
	public static int method2711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg1;
		@Pc(36) int local36 = arg0 & 0x7F;
		if (arg1 < 3 && (Static9.aByteArrayArrayArray7[1][local7][local11] & 0x2) == 2) {
			local32 = arg1 + 1;
		}
		@Pc(63) int local63 = arg2 & 0x7F;
		@Pc(90) int local90 = local36 * Static170.anIntArrayArrayArray10[local32][local7 + 1][local11] + (128 - local36) * Static170.anIntArrayArrayArray10[local32][local7][local11] >> 7;
		@Pc(120) int local120 = local36 * Static170.anIntArrayArrayArray10[local32][local7 + 1][local11 + 1] + Static170.anIntArrayArrayArray10[local32][local7][local11 + 1] * (128 - local36) >> 7;
		return local63 * local120 + local90 * (128 - local63) >> 7;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBIIII)V")
	public static void method2712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static2.anInt63 == arg1 && arg2 == Static101.anInt2323 && (arg3 == Static159.anInt3223 || !Static158.aBoolean148)) {
			return;
		}
		Static159.anInt3223 = arg3;
		Static101.anInt2323 = arg2;
		if (!Static158.aBoolean148) {
			Static159.anInt3223 = 0;
		}
		Static2.anInt63 = arg1;
		Static197.method2972(25);
		Static142.method2281(true, Static29.aClass83_217);
		@Pc(44) int local44 = Static2.anInt57;
		@Pc(46) int local46 = Static123.anInt2755;
		Static123.anInt2755 = arg2 * 8 - 48;
		@Pc(57) int local57 = Static123.anInt2755 - local46;
		Static2.anInt57 = (arg1 - 6) * 8;
		@Pc(68) int local68 = Static2.anInt57 - local44;
		for (@Pc(74) int local74 = 0; local74 < 32768; local74++) {
			@Pc(80) Class24_Sub4_Sub2 local80 = Static47.aClass24_Sub4_Sub2Array1[local74];
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < 10; local84++) {
					local80.anIntArray319[local84] -= local68;
					local80.anIntArray316[local84] -= local57;
				}
				local80.anInt3349 -= local57 * 128;
				local80.anInt3316 -= local68 * 128;
			}
		}
		for (@Pc(132) int local132 = 0; local132 < 2048; local132++) {
			@Pc(138) Class24_Sub4_Sub1 local138 = Static22.aClass24_Sub4_Sub1Array1[local132];
			if (local138 != null) {
				for (@Pc(142) int local142 = 0; local142 < 10; local142++) {
					local138.anIntArray319[local142] -= local68;
					local138.anIntArray316[local142] -= local57;
				}
				local138.anInt3349 -= local57 * 128;
				local138.anInt3316 -= local68 * 128;
			}
		}
		Static43.anInt1126 = arg3;
		Static54.aClass24_Sub4_Sub1_1.method2524(arg0, false, arg4);
		@Pc(198) byte local198 = 104;
		@Pc(200) byte local200 = 0;
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 0;
		@Pc(206) byte local206 = 1;
		@Pc(208) byte local208 = 104;
		if (local68 < 0) {
			local200 = 103;
			local202 = -1;
			local198 = -1;
		}
		if (local57 < 0) {
			local206 = -1;
			local204 = 103;
			local208 = -1;
		}
		for (@Pc(229) int local229 = local200; local229 != local198; local229 += local202) {
			for (@Pc(233) int local233 = local204; local233 != local208; local233 += local206) {
				@Pc(239) int local239 = local229 + local68;
				@Pc(244) int local244 = local233 + local57;
				for (@Pc(246) int local246 = 0; local246 < 4; local246++) {
					if (local239 >= 0 && local244 >= 0 && local239 < 104 && local244 < 104) {
						Static93.aClass19ArrayArrayArray1[local246][local229][local233] = Static93.aClass19ArrayArrayArray1[local246][local239][local244];
					} else {
						Static93.aClass19ArrayArrayArray1[local246][local229][local233] = null;
					}
				}
			}
		}
		for (@Pc(312) Class2_Sub15 local312 = (Class2_Sub15) Static51.aClass19_4.method691(); local312 != null; local312 = (Class2_Sub15) Static51.aClass19_4.method686()) {
			local312.anInt2082 -= local57;
			local312.anInt2084 -= local68;
			if (local312.anInt2084 < 0 || local312.anInt2082 < 0 || local312.anInt2084 >= 104 || local312.anInt2082 >= 104) {
				local312.method3254();
			}
		}
		Static201.anInt4000 = -1;
		Static97.aBoolean106 = false;
		Static194.anInt3846 = 0;
		if (Static121.anInt2747 != 0) {
			Static121.anInt2747 -= local68;
			Static175.anInt3598 -= local57;
		}
		Static67.aClass19_6.method685();
		Static81.aClass19_8.method685();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	public static void method2713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		@Pc(18) int[] local18 = new int[4];
		@Pc(21) int[] local21 = new int[4];
		local18[0] = arg0;
		local21[0] = arg1;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			if (Static201.anIntArray394[local31] != arg0) {
				local18[local15] = Static201.anIntArray394[local31];
				local21[local15] = Static149.anIntArray301[local31];
				local15++;
			}
		}
		Static201.anIntArray394 = local18;
		Static149.anIntArray301 = local21;
		Static99.method1687(Static13.aClass75Array1.length - 1, Static13.aClass75Array1, 0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIIIIII)V")
	public static void method2714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg2;
		@Pc(14) int local14 = arg5 - arg2;
		@Pc(18) int local18 = arg2 + arg6;
		@Pc(23) int local23 = arg0 - arg2;
		for (@Pc(25) int local25 = arg1; local25 < local9; local25++) {
			Static22.method438(arg0, arg4, arg6, Static14.anIntArrayArray18[local25]);
		}
		for (@Pc(41) int local41 = arg5; local41 > local14; local41--) {
			Static22.method438(arg0, arg4, arg6, Static14.anIntArrayArray18[local41]);
		}
		for (@Pc(62) int local62 = local9; local62 <= local14; local62++) {
			@Pc(68) int[] local68 = Static14.anIntArrayArray18[local62];
			Static22.method438(local18, arg4, arg6, local68);
			Static22.method438(local23, arg3, local18, local68);
			Static22.method438(arg0, arg4, local23, local68);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
	public static boolean method2716(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static22.aShortArray9[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1003;
	}
}
