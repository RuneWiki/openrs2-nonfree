import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	public static int anInt156;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "[I")
	public static int[] anIntArray14;

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
	public static int anInt161;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public static int anInt153 = 0;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Lclient!dh;")
	public static Class33 aClass33_2 = new Class33(30);

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString3 = "Loaded input handler";

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!p;)V")
	public static void method132(@OriginalArg(1) Class4_Sub17 arg0) {
		label86: while (true) {
			if (arg0.anInt2400 < arg0.aByteArray30.length) {
				@Pc(13) boolean local13 = false;
				@Pc(15) int local15 = 0;
				@Pc(17) int local17 = 0;
				if (arg0.method1874() == 1) {
					local13 = true;
					local15 = arg0.method1874();
					local17 = arg0.method1874();
				}
				@Pc(38) int local38 = arg0.method1874();
				@Pc(42) int local42 = arg0.method1874();
				@Pc(53) int local53 = Static92.anInt1912 + Static132.anInt2785 - local42 * 64 - 1;
				@Pc(60) int local60 = local38 * 64 - Static81.anInt4033;
				@Pc(93) byte local93;
				@Pc(82) int local82;
				if (local60 >= 0 && local53 - 63 >= 0 && local60 + 63 < Static269.anInt5031 && local53 < Static92.anInt1912) {
					local82 = local60 >> 6;
					@Pc(118) int local118 = local53 >> 6;
					@Pc(120) int local120 = 0;
					while (true) {
						if (local120 >= 64) {
							continue label86;
						}
						for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
							if (!local13 || local15 * 8 <= local120 && local120 < local15 * 8 + 8 && local125 >= local17 * 8 && local17 * 8 + 8 > local125) {
								local93 = arg0.method1892();
								if (local93 != 0) {
									if (Static283.aByteArrayArrayArray20[local82][local118] == null) {
										Static283.aByteArrayArrayArray20[local82][local118] = new byte[4096];
									}
									Static283.aByteArrayArrayArray20[local82][local118][local120 + (63 - local125 << 6)] = local93;
									@Pc(206) byte local206 = arg0.method1892();
									if (Static212.aByteArrayArrayArray16[local82][local118] == null) {
										Static212.aByteArrayArrayArray16[local82][local118] = new byte[4096];
									}
									Static212.aByteArrayArrayArray16[local82][local118][local120 + (63 - local125 << 6)] = local206;
								}
							}
						}
						local120++;
					}
				}
				local82 = 0;
				while (true) {
					if ((local13 ? 64 : 4096) <= local82) {
						continue label86;
					}
					local93 = arg0.method1892();
					if (local93 != 0) {
						arg0.anInt2400++;
					}
					local82++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method133() {
		Static210.aBoolean272 = true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
	public static void method134(@OriginalArg(1) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static178.aBoolean216 && arg0) {
			local11 = Static90.aByteArrayArray9;
			local13 = 1;
		} else {
			local13 = 4;
			local11 = Static81.aByteArrayArray16;
		}
		for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
			Static81.method3275();
			for (@Pc(28) int local28 = 0; local28 < 13; local28++) {
				for (@Pc(35) int local35 = 0; local35 < 13; local35++) {
					@Pc(46) int local46 = Static38.anIntArrayArrayArray3[local21][local28][local35];
					if (local46 != -1) {
						@Pc(57) int local57 = local46 >> 24 & 0x3;
						if (!arg0 || local57 == 0) {
							@Pc(70) int local70 = local46 >> 1 & 0x3;
							@Pc(76) int local76 = local46 >> 3 & 0x7FF;
							@Pc(82) int local82 = local46 >> 14 & 0x3FF;
							@Pc(92) int local92 = (local82 / 8 << 8) + local76 / 8;
							for (@Pc(94) int local94 = 0; local94 < Static262.anIntArray442.length; local94++) {
								if (local92 == Static262.anIntArray442[local94] && local11[local94] != null) {
									Static215.method3427(arg0, Static121.aClass63Array1, local57, local21, (local82 & 0x7) * 8, local11[local94], local70, local35 * 8, local28 * 8, (local76 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public static void method135() {
		aString3 = null;
		anIntArray14 = null;
		aClass33_2 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!lc;Lclient!fm;Lclient!lc;B)V")
	public static void method136(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) Class98 arg2) {
		Static93.anInterface1_1 = arg1;
		Static227.aClass98_123 = arg0;
		Static256.aClass98_146 = arg2;
		if (Static256.aClass98_146 != null) {
			Static62.anInt1168 = Static256.aClass98_146.method2394(1);
		}
		if (Static227.aClass98_123 != null) {
			Static108.anInt2276 = Static227.aClass98_123.method2394(1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
	public static void method137(@OriginalArg(0) int arg0) {
		if (Static263.anInt908 == arg0) {
			@Pc(16) Interface3 local16 = Static240.anInterface3Array6[arg0];
			local16.method3962(Static86.anInt1772);
		}
	}
}
