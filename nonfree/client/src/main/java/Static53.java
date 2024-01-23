import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
	public static boolean aBoolean84;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!tk;I)I")
	public static int method844(@OriginalArg(1) Class159 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray35 == null || arg1 >= arg0.anIntArrayArray35.length) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg0.anIntArrayArray35[arg1];
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local27++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local31;
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 1) {
					local38 = Static77.anIntArray112[local25[local27++]];
				}
				if (local36 == 2) {
					local38 = Static64.anIntArray98[local25[local27++]];
				}
				if (local36 == 3) {
					local38 = Static125.anIntArray198[local25[local27++]];
				}
				@Pc(107) int local107;
				@Pc(118) Class159 local118;
				@Pc(123) int local123;
				@Pc(138) int local138;
				if (local36 == 4) {
					local107 = local25[local27++] << 16;
					@Pc(114) int local114 = local107 + local25[local27++];
					local118 = Static82.method1361(local114);
					local123 = local25[local27++];
					if (local123 != -1 && (!Static140.method2222(local123).aBoolean13 || Static65.aBoolean466)) {
						for (local138 = 0; local138 < local118.anIntArray394.length; local138++) {
							if (local118.anIntArray394[local138] == local123 + 1) {
								local38 += local118.anIntArray399[local138];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static8.anIntArray495[local25[local27++]];
				}
				if (local36 == 6) {
					local38 = Class7.anIntArray8[Static64.anIntArray98[local25[local27++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static8.anIntArray495[local25[local27++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static21.aClass36_Sub3_Sub1_1.anInt4018;
				}
				if (local36 == 9) {
					for (local107 = 0; local107 < 25; local107++) {
						if (Static255.aBooleanArray23[local107]) {
							local38 += Static64.anIntArray98[local107];
						}
					}
				}
				if (local36 == 10) {
					local107 = local25[local27++] << 16;
					local107 += local25[local27++];
					local118 = Static82.method1361(local107);
					local123 = local25[local27++];
					if (local123 != -1 && (!Static140.method2222(local123).aBoolean13 || Static65.aBoolean466)) {
						for (local138 = 0; local138 < local118.anIntArray394.length; local138++) {
							if (local123 + 1 == local118.anIntArray394[local138]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static288.anInt1354;
				}
				if (local36 == 12) {
					local38 = Static169.anInt3391;
				}
				if (local36 == 13) {
					local107 = Static8.anIntArray495[local25[local27++]];
					@Pc(339) int local339 = local25[local27++];
					local38 = (local107 & 0x1 << local339) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local107 = local25[local27++];
					local38 = Static112.method1837(local107);
				}
				if (local36 == 18) {
					local38 = (Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7) + Static49.anInt1089;
				}
				if (local36 == 19) {
					local38 = Static130.anInt2601 + (Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7);
				}
				if (local36 == 20) {
					local38 = local25[local27++];
				}
				if (local40 == 0) {
					if (local29 == 0) {
						local31 += local38;
					}
					if (local29 == 1) {
						local31 -= local38;
					}
					if (local29 == 2 && local38 != 0) {
						local31 /= local38;
					}
					if (local29 == 3) {
						local31 *= local38;
					}
					local29 = 0;
				} else {
					local29 = local40;
				}
			}
		} catch (@Pc(448) Exception local448) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIILclient!eh;Lclient!eh;IIJ)V")
	public static void method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class134 local8 = new Class134();
		local8.aLong147 = arg8;
		local8.anInt4311 = arg1 * 128 + 64;
		local8.anInt4309 = arg2 * 128 + 64;
		local8.anInt4310 = arg3;
		local8.aClass36_6 = arg4;
		local8.aClass36_7 = arg5;
		local8.anInt4308 = arg6;
		local8.anInt4314 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static178.aClass8_Sub27ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static178.aClass8_Sub27ArrayArrayArray1[local42][arg1][arg2] = new Class8_Sub27(local42, arg1, arg2);
			}
		}
		Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2].aClass134_1 = local8;
	}
}
