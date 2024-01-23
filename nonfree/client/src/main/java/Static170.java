import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!i;")
	private static Class41 aClass41_1047 = Static184.method2923("glow3:");

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "Lclient!i;")
	private static Class41 aClass41_1054 = Static184.method2923("flash2:");

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "Lclient!i;")
	public static Class41 aClass41_1048 = aClass41_1054;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Lclient!i;")
	public static Class41 aClass41_1049 = aClass41_1054;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "Lclient!i;")
	public static Class41 aClass41_1050 = Static184.method2923("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "Lclient!i;")
	private static Class41 aClass41_1053 = Static184.method2923("Hidden");

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_1051 = aClass41_1053;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Lclient!i;")
	public static Class41 aClass41_1052 = aClass41_1047;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	public static int anInt3984 = 0;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	public static int anInt3986 = 0;

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Lclient!i;")
	public static Class41 aClass41_1055 = aClass41_1047;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
	public static int method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = arg0 * 57 + arg1;
		@Pc(27) int local27 = local21 << 13 ^ local21;
		@Pc(41) int local41 = Integer.MAX_VALUE & local27 * (local27 * local27 * 15731 + 789221) + 1376312589;
		return local41 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
	public static void method2735() {
		@Pc(3) int local3 = Static56.anIntArray158[Static140.anInt3233];
		@Pc(7) Class8[] local7 = Static56.aClass8ArrayArray1[Static140.anInt3233];
		Static63.anInt1690 = 0;
		label187: for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class8 local16 = local7[local11];
			@Pc(20) int local20;
			if (Static218.anIntArray497 != null) {
				for (local20 = 0; local20 < Static218.anIntArray497.length; local20++) {
					if (Static218.anIntArray497[local20] != -1000000 && (local16.anInt390 <= Static218.anIntArray497[local20] || local16.anInt397 <= Static218.anIntArray497[local20]) && (local16.anInt386 <= Static163.anIntArray402[local20] || local16.anInt394 <= Static163.anIntArray402[local20]) && (local16.anInt386 >= Static40.anIntArray103[local20] || local16.anInt394 >= Static40.anIntArray103[local20]) && (local16.anInt392 <= Static129.anIntArray44[local20] || local16.anInt405 <= Static129.anIntArray44[local20]) && (local16.anInt392 >= Static180.anIntArray432[local20] || local16.anInt405 >= Static180.anIntArray432[local20])) {
						continue label187;
					}
				}
			}
			@Pc(118) int local118;
			@Pc(129) int local129;
			@Pc(161) int local161;
			@Pc(140) boolean local140;
			if (local16.anInt391 == 1) {
				local20 = local16.anInt404 + Static135.anInt3149 - Static69.anInt1824;
				if (local20 >= 0 && local20 <= Static135.anInt3149 + Static135.anInt3149) {
					local118 = local16.anInt388 + Static135.anInt3149 - Static77.anInt1993;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt400 + Static135.anInt3149 - Static77.anInt1993;
					if (local129 > Static135.anInt3149 + Static135.anInt3149) {
						local129 = Static135.anInt3149 + Static135.anInt3149;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static17.aBooleanArrayArray1[local20][local118++]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static65.anInt1729 - local16.anInt386;
						if (local161 > 32) {
							local16.anInt406 = 1;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt406 = 2;
							local161 = -local161;
						}
						local16.anInt399 = (local16.anInt392 - Static191.anInt4374 << 8) / local161;
						local16.anInt387 = (local16.anInt405 - Static191.anInt4374 << 8) / local161;
						local16.anInt389 = (local16.anInt390 - Static214.anInt4717 << 8) / local161;
						local16.anInt401 = (local16.anInt397 - Static214.anInt4717 << 8) / local161;
						Static144.aClass8Array1[Static63.anInt1690++] = local16;
					}
				}
			} else if (local16.anInt391 == 2) {
				local20 = local16.anInt388 + Static135.anInt3149 - Static77.anInt1993;
				if (local20 >= 0 && local20 <= Static135.anInt3149 + Static135.anInt3149) {
					local118 = local16.anInt404 + Static135.anInt3149 - Static69.anInt1824;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt395 + Static135.anInt3149 - Static69.anInt1824;
					if (local129 > Static135.anInt3149 + Static135.anInt3149) {
						local129 = Static135.anInt3149 + Static135.anInt3149;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static17.aBooleanArrayArray1[local118++][local20]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static191.anInt4374 - local16.anInt392;
						if (local161 > 32) {
							local16.anInt406 = 3;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt406 = 4;
							local161 = -local161;
						}
						local16.anInt398 = (local16.anInt386 - Static65.anInt1729 << 8) / local161;
						local16.anInt396 = (local16.anInt394 - Static65.anInt1729 << 8) / local161;
						local16.anInt389 = (local16.anInt390 - Static214.anInt4717 << 8) / local161;
						local16.anInt401 = (local16.anInt397 - Static214.anInt4717 << 8) / local161;
						Static144.aClass8Array1[Static63.anInt1690++] = local16;
					}
				}
			} else if (local16.anInt391 == 4) {
				local20 = local16.anInt390 - Static214.anInt4717;
				if (local20 > 128) {
					local118 = local16.anInt388 + Static135.anInt3149 - Static77.anInt1993;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt400 + Static135.anInt3149 - Static77.anInt1993;
					if (local129 > Static135.anInt3149 + Static135.anInt3149) {
						local129 = Static135.anInt3149 + Static135.anInt3149;
					}
					if (local118 <= local129) {
						@Pc(411) int local411 = local16.anInt404 + Static135.anInt3149 - Static69.anInt1824;
						if (local411 < 0) {
							local411 = 0;
						}
						local161 = local16.anInt395 + Static135.anInt3149 - Static69.anInt1824;
						if (local161 > Static135.anInt3149 + Static135.anInt3149) {
							local161 = Static135.anInt3149 + Static135.anInt3149;
						}
						@Pc(433) boolean local433 = false;
						label159: for (@Pc(435) int local435 = local411; local435 <= local161; local435++) {
							for (@Pc(438) int local438 = local118; local438 <= local129; local438++) {
								if (Static17.aBooleanArrayArray1[local435][local438]) {
									local433 = true;
									break label159;
								}
							}
						}
						if (local433) {
							local16.anInt406 = 5;
							local16.anInt398 = (local16.anInt386 - Static65.anInt1729 << 8) / local20;
							local16.anInt396 = (local16.anInt394 - Static65.anInt1729 << 8) / local20;
							local16.anInt399 = (local16.anInt392 - Static191.anInt4374 << 8) / local20;
							local16.anInt387 = (local16.anInt405 - Static191.anInt4374 << 8) / local20;
							Static144.aClass8Array1[Static63.anInt1690++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Lclient!oe;")
	public static Class71 method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass71_1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZIIIII)V")
	public static void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg1 + arg3;
		@Pc(15) int local15 = arg2 - arg3;
		@Pc(19) int local19 = arg4 + arg3;
		for (@Pc(29) int local29 = arg1; local29 < local6; local29++) {
			Static204.method3147(arg4, arg6, arg5, Static3.anIntArrayArray1[local29]);
		}
		@Pc(52) int local52 = arg5 - arg3;
		for (@Pc(54) int local54 = arg2; local54 > local15; local54--) {
			Static204.method3147(arg4, arg6, arg5, Static3.anIntArrayArray1[local54]);
		}
		for (@Pc(74) int local74 = local6; local74 <= local15; local74++) {
			@Pc(80) int[] local80 = Static3.anIntArrayArray1[local74];
			Static204.method3147(arg4, arg6, local19, local80);
			Static204.method3147(local19, arg0, local52, local80);
			Static204.method3147(local52, arg6, arg5, local80);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	public static void method2738() {
		Static188.method2997(Static197.anInt4442, Static39.anInt1055, Static130.anInt3906, false);
	}
}
