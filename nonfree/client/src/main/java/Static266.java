import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
	public static boolean aBoolean387 = false;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	public static int anInt5139 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4349(@OriginalArg(0) String arg0) {
		if (!Static96.aClass161_2.aBoolean344) {
			return -1;
		} else if (Static524.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static129.method2714(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(40) String local40 = Static488.aString90 + local22;
			if (!Static296.aClass31_67.method683("", local40)) {
				return -1;
			} else if (Static296.aClass31_67.method652(local40)) {
				@Pc(66) byte[] local66 = Static296.aClass31_67.method662(local40, "");
				@Pc(70) File local70 = Static24.method443(local22);
				if (local66 == null || local70 == null) {
					return -1;
				}
				@Pc(76) boolean local76 = true;
				@Pc(80) byte[] local80 = Static486.method6755(local70);
				if (local80 != null && local66.length == local80.length) {
					for (@Pc(97) int local97 = 0; local97 < local80.length; local97++) {
						if (local80[local97] != local66[local97]) {
							local76 = false;
							break;
						}
					}
				} else {
					local76 = false;
				}
				try {
					if (!local76) {
						Static96.aClass161_2.method3831(local70, local66);
					}
				} catch (@Pc(129) Throwable local129) {
					return -1;
				}
				Static178.method3352(local70, arg0);
				return 100;
			} else {
				return Static296.aClass31_67.method676(local40);
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
	private static void method4352() {
		Static512.anInt8808 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static115.anInt2689; local3++) {
			@Pc(8) Class125 local8 = Static465.aClass125Array2[local3];
			@Pc(12) int local12;
			if (Static300.anIntArray470 != null) {
				for (local12 = 0; local12 < Static300.anIntArray470.length; local12++) {
					if (Static300.anIntArray470[local12] != -1000000 && (local8.anInt3707 <= Static300.anIntArray470[local12] || local8.anInt3704 <= Static300.anIntArray470[local12]) && (local8.anInt3696 <= Static116.anIntArray253[local12] || local8.anInt3701 <= Static116.anIntArray253[local12]) && (local8.anInt3696 >= Static467.anIntArray633[local12] || local8.anInt3701 >= Static467.anIntArray633[local12]) && (local8.anInt3693 <= Static573.anIntArray708[local12] || local8.anInt3706 <= Static573.anIntArray708[local12]) && (local8.anInt3693 >= Static66.anIntArray644[local12] || local8.anInt3706 >= Static66.anIntArray644[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt3698 == 1) {
				local12 = local8.anInt3708 + Static415.anInt7175 - Static22.anInt439;
				if (local12 >= 0 && local12 <= Static415.anInt7175 + Static415.anInt7175) {
					local110 = local8.anInt3694 + Static415.anInt7175 - Static140.anInt3150;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static415.anInt7175 + Static415.anInt7175) {
						continue;
					}
					local128 = local8.anInt3695 + Static415.anInt7175 - Static140.anInt3150;
					if (local128 > Static415.anInt7175 + Static415.anInt7175) {
						local128 = Static415.anInt7175 + Static415.anInt7175;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static56.aBooleanArrayArray1[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static365.anInt6607 - local8.anInt3696;
						if (local164 > Static214.anInt5682) {
							local8.anInt3705 = 1;
						} else {
							if (local164 >= -Static214.anInt5682) {
								continue;
							}
							local8.anInt3705 = 2;
							local164 = -local164;
						}
						local8.anInt3703 = (local8.anInt3693 - Static427.anInt7348 << 8) / local164;
						local8.anInt3699 = (local8.anInt3706 - Static427.anInt7348 << 8) / local164;
						local8.anInt3710 = (local8.anInt3707 - Static581.anInt9607 << 8) / local164;
						local8.anInt3697 = (local8.anInt3704 - Static581.anInt9607 << 8) / local164;
						Static215.aClass125Array1[Static512.anInt8808++] = local8;
					}
				}
			} else if (local8.anInt3698 == 2) {
				local12 = local8.anInt3694 + Static415.anInt7175 - Static140.anInt3150;
				if (local12 >= 0 && local12 <= Static415.anInt7175 + Static415.anInt7175) {
					local110 = local8.anInt3708 + Static415.anInt7175 - Static22.anInt439;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static415.anInt7175 + Static415.anInt7175) {
						continue;
					}
					local128 = local8.anInt3702 + Static415.anInt7175 - Static22.anInt439;
					if (local128 > Static415.anInt7175 + Static415.anInt7175) {
						local128 = Static415.anInt7175 + Static415.anInt7175;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static56.aBooleanArrayArray1[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static427.anInt7348 - local8.anInt3693;
						if (local164 > Static214.anInt5682) {
							local8.anInt3705 = 3;
						} else {
							if (local164 >= -Static214.anInt5682) {
								continue;
							}
							local8.anInt3705 = 4;
							local164 = -local164;
						}
						local8.anInt3709 = (local8.anInt3696 - Static365.anInt6607 << 8) / local164;
						local8.anInt3700 = (local8.anInt3701 - Static365.anInt6607 << 8) / local164;
						local8.anInt3710 = (local8.anInt3707 - Static581.anInt9607 << 8) / local164;
						local8.anInt3697 = (local8.anInt3704 - Static581.anInt9607 << 8) / local164;
						Static215.aClass125Array1[Static512.anInt8808++] = local8;
					}
				}
			} else if (local8.anInt3698 == 4) {
				local12 = local8.anInt3707 - Static581.anInt9607;
				if (local12 > Static168.anInt3649) {
					local110 = local8.anInt3694 + Static415.anInt7175 - Static140.anInt3150;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static415.anInt7175 + Static415.anInt7175) {
						continue;
					}
					local128 = local8.anInt3695 + Static415.anInt7175 - Static140.anInt3150;
					if (local128 > Static415.anInt7175 + Static415.anInt7175) {
						local128 = Static415.anInt7175 + Static415.anInt7175;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3708 + Static415.anInt7175 - Static22.anInt439;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static415.anInt7175 + Static415.anInt7175) {
						continue;
					}
					local164 = local8.anInt3702 + Static415.anInt7175 - Static22.anInt439;
					if (local164 > Static415.anInt7175 + Static415.anInt7175) {
						local164 = Static415.anInt7175 + Static415.anInt7175;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static56.aBooleanArrayArray1[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt3705 = 5;
						local8.anInt3709 = (local8.anInt3696 - Static365.anInt6607 << 8) / local12;
						local8.anInt3700 = (local8.anInt3701 - Static365.anInt6607 << 8) / local12;
						local8.anInt3703 = (local8.anInt3693 - Static427.anInt7348 << 8) / local12;
						local8.anInt3699 = (local8.anInt3706 - Static427.anInt7348 << 8) / local12;
						Static215.aClass125Array1[Static512.anInt8808++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!oa;IILclient!q;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4354(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class134 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static474.aClass66_8 = arg0;
		Static247.anInt4915 = arg1;
		Static203.aClass134_5 = arg3;
		Static590.aBoolean681 = Static474.aClass66_8.method6832() > 0;
		Static22.anInt439 = arg4 >> Static41.anInt810;
		Static140.anInt3150 = arg6 >> Static41.anInt810;
		Static365.anInt6607 = arg4;
		Static427.anInt7348 = arg6;
		Static581.anInt9607 = arg5;
		Static580.anInt2683 = Static22.anInt439 - Static415.anInt7175;
		if (Static580.anInt2683 < 0) {
			Static100.anInt9638 = -Static580.anInt2683;
			Static580.anInt2683 = 0;
		} else {
			Static100.anInt9638 = 0;
		}
		Static312.anInt9781 = Static140.anInt3150 - Static415.anInt7175;
		if (Static312.anInt9781 < 0) {
			Static497.anInt8601 = -Static312.anInt9781;
			Static312.anInt9781 = 0;
		} else {
			Static497.anInt8601 = 0;
		}
		Static19.anInt391 = Static22.anInt439 + Static415.anInt7175;
		if (Static19.anInt391 > Static173.anInt3719) {
			Static19.anInt391 = Static173.anInt3719;
		}
		Static268.anInt5152 = Static140.anInt3150 + Static415.anInt7175;
		if (Static268.anInt5152 > Static357.anInt6212) {
			Static268.anInt5152 = Static357.anInt6212;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static415.anInt7175 + Static415.anInt7175 + 2; local74++) {
			for (local77 = 0; local77 < Static415.anInt7175 + Static415.anInt7175 + 2; local77++) {
				local84 = Static22.anInt439 + local74 - Static415.anInt7175;
				local90 = Static140.anInt3150 + local77 - Static415.anInt7175;
				if (local84 >= 0 && local90 >= 0 && local84 < Static173.anInt3719 && local90 < Static357.anInt6212) {
					@Pc(104) int local104 = local84 << Static41.anInt810;
					@Pc(108) int local108 = local90 << Static41.anInt810;
					@Pc(124) int local124 = Static45.aClass16Array1[Static45.aClass16Array1.length - 1].JA(local84, local90) - (0x3E8 << Static41.anInt810 - 7);
					@Pc(144) int local144 = Static109.aClass16Array2 == null ? Static45.aClass16Array1[0].JA(local84, local90) + Static514.anInt8839 : Static109.aClass16Array2[0].JA(local84, local90) + Static514.anInt8839;
					Static575.aBooleanArrayArray6[local74][local77] = Static474.aClass66_8.FA(local104, local124, local108, local104, local144, local108);
				} else {
					Static575.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static415.anInt7175 + Static415.anInt7175 + 1; local77++) {
			for (local84 = 0; local84 < Static415.anInt7175 + Static415.anInt7175 + 1; local84++) {
				Static56.aBooleanArrayArray1[local77][local84] = Static575.aBooleanArrayArray6[local77][local84] || Static575.aBooleanArrayArray6[local77 + 1][local84] || Static575.aBooleanArrayArray6[local77][local84 + 1] || Static575.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static300.anIntArray470 = arg8;
		Static467.anIntArray633 = arg9;
		Static116.anIntArray253 = arg10;
		Static573.anIntArray708 = arg11;
		Static66.anIntArray644 = arg12;
		method4352();
		Static447.method6306(Static474.aClass66_8);
		for (@Pc(261) Class26_Sub6 local261 = (Class26_Sub6) Static350.aClass8_4.method110(); local261 != null; local261 = (Class26_Sub6) Static350.aClass8_4.method113()) {
			local261.method7575();
			Static376.method5610(local261);
		}
		if (Static590.aBoolean681) {
			for (local90 = 0; local90 < Static413.anInt7145; local90++) {
				Static22.aClass32Array1[local90].method693(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static474.aClass66_8.method6787(0);
			if (Static146.aClass40_1 == null || Static146.aClass40_1 instanceof Class40_Sub2) {
				Static146.aClass40_1 = new Class40_Sub1();
			}
		} else if (Static146.aClass40_1 == null || Static146.aClass40_1 instanceof Class40_Sub1) {
			Static146.aClass40_1 = new Class40_Sub2();
		}
		Static146.aClass40_1.method7708(arg2);
		Static146.aClass40_1.method7713();
		if (Static391.aClass100ArrayArrayArray3 != null) {
			Static58.method855(true);
			Static146.aClass40_1.method7714(22);
			Static457.method6432(arg2, null, 0, (byte) 0, arg15, arg16);
			Static146.aClass40_1.method7713();
			Static146.aClass40_1.method7714(23);
			Static58.method855(false);
		}
		Static457.method6432(arg2, arg7, arg13, arg14, arg15, arg16);
		Static146.aClass40_1.method7713();
		Static146.aClass40_1.method7712();
		Static146.aClass40_1.method7713();
		if (arg2 > 1) {
			Static474.aClass66_8.method6813(0);
		}
		Static474.aClass66_8.method6785(0, null);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BBII)I")
	public static int method4355(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local7 = Class10_Sub1_Sub1.anIntArray135[(arg0[local14] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
