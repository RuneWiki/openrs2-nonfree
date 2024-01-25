import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public static int anInt1617;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_83 = new Class296(71, 3);

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!gaa;ILclient!kr;)V")
	public static void method1476(@OriginalArg(0) Class102 arg0, @OriginalArg(2) Class171 arg1) {
		Static173.aClass102_3 = arg0;
		Static132.aString22 = "";
		Static371.aClass171_111 = arg1;
		if (Static151.aString31.startsWith("win")) {
			Static132.aString22 = Static132.aString22 + "windows/";
		} else if (Static151.aString31.startsWith("linux")) {
			Static132.aString22 = Static132.aString22 + "linux/";
		} else if (Static151.aString31.startsWith("mac")) {
			Static132.aString22 = Static132.aString22 + "macos/";
		}
		if (Static151.anInt2788 == 2) {
			Static132.aString22 = Static132.aString22 + "msjava/";
		} else if (Static151.aString28.startsWith("amd64") || Static151.aString28.startsWith("x86_64")) {
			Static132.aString22 = Static132.aString22 + "x86_64/";
		} else if (Static151.aString28.startsWith("i386") || Static151.aString28.startsWith("i486") || Static151.aString28.startsWith("i586") || Static151.aString28.startsWith("x86")) {
			Static132.aString22 = Static132.aString22 + "x86/";
		} else if (Static151.aString28.startsWith("ppc")) {
			Static132.aString22 = Static132.aString22 + "ppc/";
		} else {
			Static132.aString22 = Static132.aString22 + "universal/";
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII[IZIIIILclient!fd;I[II)I")
	public static int method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class91 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				Static160.anIntArrayArray35[local12][local16] = 0;
				Static186.anIntArrayArray38[local12][local16] = 99999999;
			}
		}
		@Pc(60) boolean local60;
		if (arg1 == 1) {
			local60 = Static271.method4463(arg10, arg0, arg9, arg3, arg7, arg4, arg11, arg13, arg2, arg8);
		} else if (arg1 == 2) {
			local60 = Static532.method7370(arg8, arg4, arg13, arg0, arg7, arg9, arg2, arg3, arg10, arg11);
		} else {
			local60 = Static523.method7177(arg4, arg3, arg10, arg1, arg9, arg0, arg2, arg8, arg11, arg7, arg13);
		}
		@Pc(96) int local96 = arg11 - 64;
		@Pc(100) int local100 = arg2 - 64;
		@Pc(102) int local102 = Static316.anInt5813;
		@Pc(104) int local104 = Static296.anInt4450;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(120) int local120;
		if (!local60) {
			if (!arg6) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local120 = arg13 - 10; local120 <= arg13 + 10; local120++) {
				for (@Pc(127) int local127 = arg7 - 10; local127 <= arg7 + 10; local127++) {
					@Pc(134) int local134 = local120 - local96;
					@Pc(138) int local138 = local127 - local100;
					if (local134 >= 0 && local138 >= 0 && local134 < 128 && local138 < 128 && Static186.anIntArrayArray38[local134][local138] < 100) {
						@Pc(163) int local163 = 0;
						if (local120 < arg13) {
							local163 = arg13 - local120;
						} else if (arg3 + arg13 - 1 < local120) {
							local163 = local120 + 1 - arg3 - arg13;
						}
						@Pc(194) int local194 = 0;
						if (local127 < arg7) {
							local194 = arg7 - local127;
						} else if (local127 > arg0 + arg7 - 1) {
							local194 = local127 + 1 - arg7 - arg0;
						}
						@Pc(232) int local232 = local163 * local163 + local194 * local194;
						if (local112 > local232 || local112 == local232 && Static186.anIntArrayArray38[local134][local138] < local114) {
							local112 = local232;
							local102 = local120;
							local104 = local127;
							local114 = Static186.anIntArrayArray38[local134][local138];
						}
					}
				}
			}
			if (~local112 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg11 == local102 && arg2 == local104) {
			return 0;
		}
		@Pc(307) byte local307 = 0;
		Static398.anIntArray690[0] = local102;
		local112 = local307 + 1;
		Static368.anIntArray663[0] = local104;
		@Pc(329) int local329;
		local114 = local329 = Static160.anIntArrayArray35[local102 - local96][local104 - local100];
		while (arg11 != local102 || arg2 != local104) {
			if (local329 != local114) {
				Static398.anIntArray690[local112] = local102;
				local329 = local114;
				Static368.anIntArray663[local112++] = local104;
			}
			if ((local114 & 0x2) != 0) {
				local102++;
			} else if ((local114 & 0x8) != 0) {
				local102--;
			}
			if ((local114 & 0x1) != 0) {
				local104++;
			} else if ((local114 & 0x4) != 0) {
				local104--;
			}
			local114 = Static160.anIntArrayArray35[local102 - local96][local104 - local100];
		}
		local120 = 0;
		while (local112-- > 0) {
			arg12[local120] = Static398.anIntArray690[local112];
			arg5[local120++] = Static368.anIntArray663[local112];
			if (local120 >= arg12.length) {
				break;
			}
		}
		return local120;
	}
}
