import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
	public static int anInt3953;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_47 = new Class179(39, -1);

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_97 = new Class7("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "[I")
	public static final int[] anIntArray330 = new int[25];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V")
	public static void method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static168.aFloat4 < Static168.aFloat5) {
			Static168.aFloat4 = (float) ((double) Static168.aFloat4 + (double) Static168.aFloat4 / 30.0D);
			if (Static168.aFloat4 > Static168.aFloat5) {
				Static168.aFloat4 = Static168.aFloat5;
			}
			Static397.method5305();
			Static168.anInt424 = (int) Static168.aFloat4 >> 1;
			Static168.aByteArrayArrayArray3 = Static213.method3368(Static168.anInt424);
		} else if (Static168.aFloat4 > Static168.aFloat5) {
			Static168.aFloat4 = (float) ((double) Static168.aFloat4 - (double) Static168.aFloat4 / 30.0D);
			if (Static168.aFloat4 < Static168.aFloat5) {
				Static168.aFloat4 = Static168.aFloat5;
			}
			Static397.method5305();
			Static168.anInt424 = (int) Static168.aFloat4 >> 1;
			Static168.aByteArrayArrayArray3 = Static213.method3368(Static168.anInt424);
		}
		if (Static129.anInt3956 != -1 && Static161.anInt3016 != -1) {
			@Pc(88) int local88 = Static129.anInt3956 - Static307.anInt5296;
			if (local88 < 2 || local88 > 2) {
				local88 /= 8;
			}
			@Pc(107) int local107 = Static161.anInt3016 - Static138.anInt6309;
			if (local107 < 2 || local107 > 2) {
				local107 /= 8;
			}
			Static307.anInt5296 += local88;
			if (local88 == 0 && local107 == 0) {
				Static129.anInt3956 = -1;
				Static161.anInt3016 = -1;
			}
			Static138.anInt6309 += local107;
			Static397.method5305();
		}
		if (Static440.anInt7076 <= 0) {
			Static304.anInt5263 = -1;
			Static92.anInt1947 = -1;
		} else {
			Static434.anInt7031--;
			if (Static434.anInt7031 == 0) {
				Static440.anInt7076--;
				Static434.anInt7031 = 100;
			}
		}
		if (!Static452.aBoolean500 || Static137.aClass181_23 == null) {
			return;
		}
		for (@Pc(167) Class1_Sub13 local167 = (Class1_Sub13) Static137.aClass181_23.method4112(); local167 != null; local167 = (Class1_Sub13) Static137.aClass181_23.method4104()) {
			@Pc(178) Class202 local178 = Static168.aClass78_2.method2110(local167.aClass1_Sub26_1.anInt3922);
			if (local167.method1578(arg1, arg0)) {
				if (local178.aStringArray35 != null) {
					if (local178.aStringArray35[4] != null) {
						Static373.method5165(-1, local178.aString53, local178.anInt5561, 0, true, 1009, false, local178.aStringArray35[4], -1, (long) local167.aClass1_Sub26_1.anInt3922);
					}
					if (local178.aStringArray35[3] != null) {
						Static373.method5165(-1, local178.aString53, local178.anInt5561, 0, true, 1011, false, local178.aStringArray35[3], -1, (long) local167.aClass1_Sub26_1.anInt3922);
					}
					if (local178.aStringArray35[2] != null) {
						Static373.method5165(-1, local178.aString53, local178.anInt5561, 0, true, 1008, false, local178.aStringArray35[2], -1, (long) local167.aClass1_Sub26_1.anInt3922);
					}
					if (local178.aStringArray35[1] != null) {
						Static373.method5165(-1, local178.aString53, local178.anInt5561, 0, true, 1002, false, local178.aStringArray35[1], -1, (long) local167.aClass1_Sub26_1.anInt3922);
					}
					if (local178.aStringArray35[0] != null) {
						Static373.method5165(-1, local178.aString53, local178.anInt5561, 0, true, 1012, false, local178.aStringArray35[0], -1, (long) local167.aClass1_Sub26_1.anInt3922);
					}
				}
				if (!local167.aClass1_Sub26_1.aBoolean279) {
					local167.aClass1_Sub26_1.aBoolean279 = true;
					Static13.method355(Static365.aClass200_8, local167.aClass1_Sub26_1.anInt3922, local178.anInt5561);
				}
				if (local167.aClass1_Sub26_1.aBoolean279) {
					Static13.method355(Static4.aClass200_1, local167.aClass1_Sub26_1.anInt3922, local178.anInt5561);
				}
			} else if (local167.aClass1_Sub26_1.aBoolean279) {
				local167.aClass1_Sub26_1.aBoolean279 = false;
				Static13.method355(Static459.aClass200_6, local167.aClass1_Sub26_1.anInt3922, local178.anInt5561);
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(JI)V")
	public static void method3329(@OriginalArg(0) long arg0) {
		Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
		Static92.aClass1_Sub5_Sub1_1.method5396(Static114.aClass208_8.anInt5814);
		Static92.aClass1_Sub5_Sub1_1.method5358(arg0);
		Static92.aClass1_Sub5_Sub1_1.method5396(Static341.anInt5770);
		Static303.anInt5252 = 0;
		Static146.anInt2806 = 0;
		Static443.anInt7125 = -3;
		Static440.anInt7083 = 1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[IIIIILclient!pd;IIIZ[IIBI)I")
	public static int method3331(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class188 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(1) int local1 = 0; local1 < 128; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
				Static339.anIntArrayArray56[local1][local4] = 0;
				Static204.anIntArrayArray61[local1][local4] = 99999999;
			}
		}
		@Pc(57) boolean local57;
		if (arg0 == 1) {
			local57 = Static142.method4625(arg2, arg13, arg12, arg8, arg3, arg6, arg5, arg7, arg4, arg9);
		} else if (arg0 == 2) {
			local57 = Static442.method5831(arg6, arg7, arg3, arg9, arg12, arg13, arg4, arg2, arg5, arg8);
		} else {
			local57 = Static33.method617(arg12, arg5, arg2, arg3, arg13, arg4, arg8, arg9, arg6, arg7, arg0);
		}
		@Pc(89) int local89 = arg13 - 64;
		@Pc(93) int local93 = arg8 - 64;
		@Pc(95) int local95 = Static130.anInt2613;
		@Pc(97) int local97 = Static82.anInt1809;
		@Pc(103) int local103;
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (!local57) {
			if (!arg10) {
				return -1;
			}
			local103 = Integer.MAX_VALUE;
			local105 = Integer.MAX_VALUE;
			for (local111 = arg2 - 10; local111 <= arg2 + 10; local111++) {
				for (@Pc(117) int local117 = arg4 - 10; local117 <= arg4 + 10; local117++) {
					@Pc(123) int local123 = local111 - local89;
					@Pc(127) int local127 = local117 - local93;
					if (local123 >= 0 && local127 >= 0 && local123 < 128 && local127 < 128 && Static204.anIntArrayArray61[local123][local127] < 100) {
						@Pc(154) int local154 = 0;
						if (arg2 > local111) {
							local154 = arg2 - local111;
						} else if (local111 > arg2 + arg7 - 1) {
							local154 = local111 + 1 - arg2 - arg7;
						}
						@Pc(184) int local184 = 0;
						if (arg4 > local117) {
							local184 = arg4 - local117;
						} else if (arg4 + arg12 - 1 < local117) {
							local184 = local117 + 1 - arg4 - arg12;
						}
						@Pc(221) int local221 = local154 * local154 + local184 * local184;
						if (local221 < local103 || local221 == local103 && local105 > Static204.anIntArrayArray61[local123][local127]) {
							local103 = local221;
							local95 = local111;
							local105 = Static204.anIntArrayArray61[local123][local127];
							local97 = local117;
						}
					}
				}
			}
			if (local103 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg13 == local95 && arg8 == local97) {
			return 0;
		}
		@Pc(298) byte local298 = 0;
		Static286.anIntArray437[0] = local95;
		local103 = local298 + 1;
		Static175.anIntArray289[0] = local97;
		@Pc(320) int local320;
		local105 = local320 = Static339.anIntArrayArray56[local95 - local89][local97 - local93];
		while (local95 != arg13 || local97 != arg8) {
			if (local320 != local105) {
				local320 = local105;
				Static286.anIntArray437[local103] = local95;
				Static175.anIntArray289[local103++] = local97;
			}
			if ((local105 & 0x2) != 0) {
				local95++;
			} else if ((local105 & 0x8) != 0) {
				local95--;
			}
			if ((local105 & 0x1) != 0) {
				local97++;
			} else if ((local105 & 0x4) != 0) {
				local97--;
			}
			local105 = Static339.anIntArrayArray56[local95 - local89][local97 - local93];
		}
		local111 = 0;
		while (local103-- > 0) {
			arg1[local111] = Static286.anIntArray437[local103];
			arg11[local111++] = Static175.anIntArray289[local103];
			if (arg1.length <= local111) {
				break;
			}
		}
		return local111;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)Z")
	public static boolean method3333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface5 local14 = (Interface5) Static110.method1983(arg1, arg2, arg0);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static383.method5180(local14) & true;
		}
		local14 = (Interface5) Static357.method4896(arg1, arg2, arg0, ig.class);
		if (local14 != null) {
			local16 &= Static383.method5180(local14);
		}
		local14 = (Interface5) Static393.method5258(arg1, arg2, arg0);
		if (local14 != null) {
			local16 &= Static383.method5180(local14);
		}
		return local16;
	}

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "(I)V")
	public static void method3334() {
		if (Static337.anIntArray223 != null) {
			return;
		}
		Static337.anIntArray223 = new int[65536];
		@Pc(26) double local26 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(28) int local28 = 0; local28 < 65536; local28++) {
			@Pc(41) double local41 = (double) (local28 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local28 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local28 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = (local52 + 1.0D) * local59;
				} else {
					local79 = local52 + local59 - local59 * local52;
				}
				@Pc(96) double local96 = local59 * 2.0D - local79;
				@Pc(100) double local100 = local41 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local41 - 0.3333333333333333D;
				if (local114 < 0.0D) {
					local114++;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = local96 + (local79 - local96) * 6.0D * local41;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local41) * 6.0D * (local79 - local96) + local96;
				} else {
					local63 = local96;
				}
				if (local100 * 6.0D < 1.0D) {
					local61 = local100 * (local79 - local96) * 6.0D + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local100 * 3.0D < 2.0D) {
					local61 = local96 + (local79 - local96) * 6.0D * (0.6666666666666666D - local100);
				} else {
					local61 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local65 = local96 + local114 * 6.0D * (local79 - local96);
				} else if (local114 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local114 * 3.0D < 2.0D) {
					local65 = local96 + (0.6666666666666666D - local114) * 6.0D * (local79 - local96);
				} else {
					local65 = local96;
				}
			}
			local61 = Math.pow(local61, local26);
			local63 = Math.pow(local63, local26);
			local65 = Math.pow(local65, local26);
			@Pc(284) int local284 = (int) (local61 * 256.0D);
			@Pc(289) int local289 = (int) (local63 * 256.0D);
			@Pc(294) int local294 = (int) (local65 * 256.0D);
			@Pc(305) int local305 = (local289 << 8) + (local284 << 16) + local294;
			Static337.anIntArray223[local28] = local305;
		}
	}
}
