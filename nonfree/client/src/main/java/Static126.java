import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_76;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_50;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
	public static int anInt2858;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Lclient!u;")
	private static Class74 aClass74_1710 = Static72.method1077("World");

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "Lclient!u;")
	public static Class74 aClass74_1704 = aClass74_1710;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "Lclient!u;")
	private static Class74 aClass74_1705 = Static72.method1077("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_1706 = Static72.method1077("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "Lclient!u;")
	private static Class74 aClass74_1707 = Static72.method1077("Close");

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "Lclient!u;")
	public static Class74 aClass74_1708 = aClass74_1707;

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "Lclient!u;")
	public static Class74 aClass74_1709 = aClass74_1705;

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lclient!u;")
	public static Class74 aClass74_1711 = Static72.method1077("mapfunction");

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	public static int anInt2857 = 0;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1712 = aClass74_1710;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array20 = new Class74[100];

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
	public static volatile int anInt2863 = 0;

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
	public static int anInt2867 = 0;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "[I")
	public static int[] anIntArray409 = new int[1000];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method1918(@OriginalArg(1) Class2_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static5.anIntArray8.length; local12++) {
			Static5.anIntArray8[local12] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local37 = (int) (Math.random() * 128.0D * (double) 256);
			Static5.anIntArray8[local37] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(69) int local69;
		for (local37 = 0; local37 < 20; local37++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local69 = local60 + (local56 << 7);
					Static42.anIntArray113[local69] = (Static5.anIntArray8[local69 - 1] + Static5.anIntArray8[local69 + 1] + Static5.anIntArray8[local69 - 128] + Static5.anIntArray8[local69 + 128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static5.anIntArray8;
			Static5.anIntArray8 = Static42.anIntArray113;
			Static42.anIntArray113 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt118; local60++) {
			for (local69 = 0; local69 < arg0.anInt116; local69++) {
				if (arg0.aByteArray1[local56++] != 0) {
					@Pc(146) int local146 = arg0.anInt121 + local69 + 16;
					@Pc(153) int local153 = arg0.anInt119 + local60 + 16;
					@Pc(160) int local160 = local146 + (local153 << 7);
					Static5.anIntArray8[local160] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	public static void method1919() {
		Static119.aClass16_84.method485();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V")
	public static void method1920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (local15 = 0; local15 < 8; local15++) {
				Static56.anIntArrayArrayArray2[arg1][arg2 + local11][local15 + arg0] = 0;
			}
		}
		if (arg2 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static56.anIntArrayArrayArray2[arg1][arg2][arg0 + local15] = Static56.anIntArrayArrayArray2[arg1][arg2 - 1][local15 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static56.anIntArrayArrayArray2[arg1][arg2 + local15][arg0] = Static56.anIntArrayArrayArray2[arg1][local15 + arg2][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static56.anIntArrayArrayArray2[arg1][arg2 - 1][arg0] != 0) {
			Static56.anIntArrayArrayArray2[arg1][arg2][arg0] = Static56.anIntArrayArrayArray2[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static56.anIntArrayArrayArray2[arg1][arg2][arg0 - 1] != 0) {
			Static56.anIntArrayArrayArray2[arg1][arg2][arg0] = Static56.anIntArrayArrayArray2[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static56.anIntArrayArrayArray2[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static56.anIntArrayArrayArray2[arg1][arg2][arg0] = Static56.anIntArrayArrayArray2[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
	public static void method1922(@OriginalArg(0) int arg0) {
		Static36.method618(arg0);
		Static123.method1854(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
	public static void method1923() {
		aClass74_1704 = null;
		aClass74_1706 = null;
		aClass74_1705 = null;
		aClass74_1708 = null;
		aClass26_Sub1_76 = null;
		aClass2_Sub2_Sub1_Sub1_50 = null;
		aClass74_1707 = null;
		anIntArray409 = null;
		aClass74_1710 = null;
		aClass74Array20 = null;
		aClass74_1709 = null;
		aClass74_1711 = null;
		aClass74_1712 = null;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
	public static void method1924() {
		@Pc(12) int local12;
		if (Static91.anInt1910 > 0) {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static91.anInt1910 > 768) {
					Static24.anIntArray68[local12] = Static9.method229(Static48.anIntArray136[local12], Static17.anIntArray55[local12], 1024 - Static91.anInt1910);
				} else if (Static91.anInt1910 <= 256) {
					Static24.anIntArray68[local12] = Static9.method229(Static17.anIntArray55[local12], Static48.anIntArray136[local12], 256 - Static91.anInt1910);
				} else {
					Static24.anIntArray68[local12] = Static17.anIntArray55[local12];
				}
			}
		} else if (Static100.anInt2208 <= 0) {
			for (local12 = 0; local12 < 256; local12++) {
				Static24.anIntArray68[local12] = Static48.anIntArray136[local12];
			}
		} else {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static100.anInt2208 > 768) {
					Static24.anIntArray68[local12] = Static9.method229(Static48.anIntArray136[local12], Static128.anIntArray416[local12], 1024 - Static100.anInt2208);
				} else if (Static100.anInt2208 <= 256) {
					Static24.anIntArray68[local12] = Static9.method229(Static128.anIntArray416[local12], Static48.anIntArray136[local12], 256 - Static100.anInt2208);
				} else {
					Static24.anIntArray68[local12] = Static128.anIntArray416[local12];
				}
			}
		}
		Static58.method711(0, 9, 128, 263);
		@Pc(152) int local152 = 6885;
		local12 = 0;
		Static109.aClass2_Sub2_Sub1_Sub2_7.method207(0, 0);
		Static58.method699();
		@Pc(174) int local174;
		@Pc(178) int local178;
		@Pc(191) int local191;
		@Pc(198) int local198;
		@Pc(215) int local215;
		@Pc(213) int local213;
		@Pc(208) int local208;
		for (@Pc(161) int local161 = 1; local161 < 255; local161++) {
			local174 = (256 - local161) * Static104.anIntArray407[local161] / 256;
			local178 = local174 + 22;
			if (local178 < 0) {
				local178 = 0;
			}
			local12 += local178;
			for (local191 = local178; local191 < 128; local191++) {
				local198 = Static32.anIntArray96[local12++];
				if (local198 == 0) {
					local152++;
				} else {
					local208 = Static97.aClass9_58.anIntArray326[local152];
					local213 = 256 - local198;
					local215 = local198;
					local198 = Static24.anIntArray68[local198];
					Static97.aClass9_58.anIntArray326[local152++] = (local213 * (local208 & 0xFF00) + local215 * (local198 & 0xFF00) & 0xFF0000) + ((local198 & 0xFF00FF) * local215 + local213 * (local208 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local152 += local178 + 765 - 128;
		}
		Static58.method711(637, 9, 765, 263);
		local152 = 7546;
		Static62.aClass2_Sub2_Sub1_Sub2_2.method207(382, 0);
		Static58.method699();
		local12 = 0;
		for (local174 = 1; local174 < 255; local174++) {
			local178 = Static104.anIntArray407[local174] * (256 - local174) / 256;
			local191 = 103 - local178;
			local152 += local178;
			for (local198 = 0; local198 < local191; local198++) {
				local215 = Static32.anIntArray96[local12++];
				if (local215 == 0) {
					local152++;
				} else {
					local213 = local215;
					local208 = 256 - local215;
					local215 = Static24.anIntArray68[local215];
					@Pc(357) int local357 = Static97.aClass9_58.anIntArray326[local152];
					Static97.aClass9_58.anIntArray326[local152++] = ((local357 & 0xFF00FF) * local208 + local213 * (local215 & 0xFF00FF) & 0xFF00FF00) + (local208 * (local357 & 0xFF00) + local213 * (local215 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local152 += 765 - local178 - local191;
			local12 += 128 - local191;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILclient!ic;I)V")
	public static void method1925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub10 arg5, @OriginalArg(7) int arg6) {
		@Pc(22) int local22;
		if (arg6 < 0 || arg6 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local22 = arg5.method1514();
				if (local22 == 0) {
					break;
				}
				if (local22 == 1) {
					arg5.method1514();
					break;
				}
				if (local22 <= 49) {
					arg5.method1514();
				}
			}
			return;
		}
		Static17.aByteArrayArrayArray1[arg4][arg6][arg1] = 0;
		while (true) {
			local22 = arg5.method1514();
			if (local22 == 0) {
				if (arg4 == 0) {
					Static56.anIntArrayArrayArray2[0][arg6][arg1] = -Static112.method1684(arg6 + arg0 + 932731, arg3 + 556238 + arg1) * 8;
				} else {
					Static56.anIntArrayArrayArray2[arg4][arg6][arg1] = Static56.anIntArrayArrayArray2[arg4 - 1][arg6][arg1] - 240;
				}
				break;
			}
			if (local22 == 1) {
				@Pc(123) int local123 = arg5.method1514();
				if (local123 == 1) {
					local123 = 0;
				}
				if (arg4 == 0) {
					Static56.anIntArrayArrayArray2[0][arg6][arg1] = -local123 * 8;
				} else {
					Static56.anIntArrayArrayArray2[arg4][arg6][arg1] = Static56.anIntArrayArrayArray2[arg4 - 1][arg6][arg1] - local123 * 8;
				}
				break;
			}
			if (local22 <= 49) {
				Static113.aByteArrayArrayArray7[arg4][arg6][arg1] = arg5.method1509();
				Static91.aByteArrayArrayArray6[arg4][arg6][arg1] = (byte) ((local22 - 2) / 4);
				Static81.aByteArrayArrayArray5[arg4][arg6][arg1] = (byte) (local22 + arg2 - 2 & 0x3);
			} else if (local22 <= 81) {
				Static17.aByteArrayArrayArray1[arg4][arg6][arg1] = (byte) (local22 - 49);
			} else {
				Static38.aByteArrayArrayArray2[arg4][arg6][arg1] = (byte) (local22 - 81);
			}
		}
	}
}
