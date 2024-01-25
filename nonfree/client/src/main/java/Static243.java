import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
	public static int anInt4639;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
	public static int anInt4625 = 0;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "Z")
	public static final boolean aBoolean371 = true;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_68 = new Class73(62, -1);

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
	public static int anInt4637 = 0;

	@OriginalMember(owner = "client!ij", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
	public static int anInt4638 = 2;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	public static int method3831() {
		if (Static32.anInt848 == 0) {
			Static185.aClass119_2.method3449(new Class68("jaclib"));
			if (Static185.aClass119_2.method3451().method6326() != 100) {
				return 1;
			}
			if (!((Class68) Static185.aClass119_2.method3451()).method2449()) {
				Static545.aClient1.method2117();
			}
			Static32.anInt848 = 1;
		}
		@Pc(233) int local233;
		@Pc(252) int local252;
		@Pc(266) int local266;
		@Pc(272) int local272;
		if (Static32.anInt848 == 1) {
			Static357.aClass119Array1 = Static185.method3446();
			Static185.aClass119_1.method3449(new Class242(Static446.aClass223_100));
			Static185.aClass119_3.method3449(new Class68("jaggl"));
			Static185.aClass119_4.method3449(new Class68("jagdx"));
			Static185.aClass119_5.method3449(new Class68("jagmisc"));
			Static185.aClass119_6.method3449(new Class68("sw3d"));
			Static185.aClass119_7.method3449(new Class68("hw3d"));
			Static185.aClass119_8.method3449(new Class68("jagtheora"));
			Static185.aClass119_9.method3449(new Class242(Static382.aClass223_83));
			Static185.aClass119_10.method3449(new Class242(Static482.aClass223_112));
			Static185.aClass119_11.method3449(new Class242(Static75.aClass223_32));
			Static185.aClass119_12.method3449(new Class242(Static640.aClass223_144));
			Static185.aClass119_13.method3449(new Class242(Static395.aClass223_85));
			Static185.aClass119_14.method3449(new Class242(Static415.aClass223_91));
			Static185.aClass119_15.method3449(new Class242(Static376.aClass223_79));
			Static185.aClass119_16.method3449(new Class242(Static183.aClass223_139));
			Static185.aClass119_17.method3449(new Class242(Static131.aClass223_41));
			Static185.aClass119_18.method3449(new Class242(Static356.aClass223_73));
			Static185.aClass119_19.method3449(new Class242(Static152.aClass223_42));
			Static185.aClass119_20.method3449(new Class242(Static556.aClass223_129));
			Static185.aClass119_21.method3449(new Class242(Static433.aClass223_97));
			Static185.aClass119_22.method3449(new Class242(Static401.aClass223_87));
			Static185.aClass119_23.method3449(new Class195(Static457.aClass223_104, "huffman"));
			Static185.aClass119_24.method3449(new Class242(Static482.aClass223_113));
			Static185.aClass119_25.method3449(new Class242(Static105.aClass223_38));
			Static185.aClass119_26.method3449(new Class242(Static74.aClass223_31));
			Static185.aClass119_27.method3449(new Class233(Static453.aClass223_102, "details"));
			for (local233 = 0; local233 < Static357.aClass119Array1.length; local233++) {
				if (Static357.aClass119Array1[local233].method3451() == null) {
					throw new RuntimeException();
				}
			}
			local252 = 0;
			@Pc(254) Class119[] local254 = Static357.aClass119Array1;
			for (@Pc(256) int local256 = 0; local256 < local254.length; local256++) {
				@Pc(262) Class119 local262 = local254[local256];
				local266 = local262.method3447();
				local272 = local262.method3451().method6326();
				local252 += local272 * local266 / 100;
			}
			Static32.anInt848 = 2;
			Static349.anInt6852 = local252;
		}
		if (Static357.aClass119Array1 == null) {
			return 100;
		}
		local233 = 0;
		local252 = 0;
		@Pc(304) boolean local304 = true;
		@Pc(306) Class119[] local306 = Static357.aClass119Array1;
		for (@Pc(308) int local308 = 0; local308 < local306.length; local308++) {
			@Pc(314) Class119 local314 = local306[local308];
			local272 = local314.method3447();
			@Pc(324) int local324 = local314.method3451().method6326();
			local252 += local324 * local272 / 100;
			if (local324 < 100) {
				local304 = false;
			}
			local233 += local272;
		}
		if (local304) {
			if (!((Class68) Static185.aClass119_5.method3451()).method2449()) {
				Static545.aClient1.method2115();
			}
			if (!((Class68) Static185.aClass119_8.method3451()).method2449()) {
				Static634.aBoolean840 = Static545.aClient1.method2118();
			}
			Static357.aClass119Array1 = null;
		}
		local252 -= Static349.anInt6852;
		local233 -= Static349.anInt6852;
		local266 = local233 <= 0 ? 100 : local252 * 100 / local233;
		if (!local304 && local266 > 99) {
			local266 = 99;
		}
		return local266;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	public static void method3832() {
		if (Static376.anIntArray336 != null) {
			return;
		}
		Static376.anIntArray336 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(29) int local29 = 0; local29 < 65536; local29++) {
			@Pc(42) double local42 = (double) (local29 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local29 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local29 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(83) double local83;
				if (local60 < 0.5D) {
					local83 = local60 * (local53 + 1.0D);
				} else {
					local83 = local53 + local60 - local60 * local53;
				}
				@Pc(97) double local97 = local60 * 2.0D - local83;
				@Pc(101) double local101 = local42 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local42 - 0.3333333333333333D;
				if (local115 < 0.0D) {
					local115++;
				}
				if (local42 * 6.0D < 1.0D) {
					local64 = local97 + (local83 - local97) * 6.0D * local42;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local83;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = local97 + (local83 - local97) * 6.0D * (0.6666666666666666D - local42);
				} else {
					local64 = local97;
				}
				if (local101 * 6.0D < 1.0D) {
					local62 = local101 * 6.0D * (local83 - local97) + local97;
				} else if (local101 * 2.0D < 1.0D) {
					local62 = local83;
				} else if (local101 * 3.0D < 2.0D) {
					local62 = (local83 - local97) * 6.0D * (0.6666666666666666D - local101) + local97;
				} else {
					local62 = local97;
				}
				if (local115 * 6.0D < 1.0D) {
					local66 = local97 + local115 * 6.0D * (local83 - local97);
				} else if (local115 * 2.0D < 1.0D) {
					local66 = local83;
				} else if (local115 * 3.0D < 2.0D) {
					local66 = local97 + (local83 - local97) * (-local115 + 0.6666666666666666D) * 6.0D;
				} else {
					local66 = local97;
				}
			}
			local62 = Math.pow(local62, local19);
			local64 = Math.pow(local64, local19);
			local66 = Math.pow(local66, local19);
			@Pc(296) int local296 = (int) (local62 * 256.0D);
			@Pc(301) int local301 = (int) (local64 * 256.0D);
			@Pc(306) int local306 = (int) (local66 * 256.0D);
			@Pc(316) int local316 = (local296 << 16) + (local301 << 8) + local306;
			Static376.anIntArray336[local29] = local316;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)Z")
	public static boolean method3833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static115.method2524(arg1, arg0) || Static422.method6593(arg0, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)[Lclient!vea;")
	public static Class352[] method3834() {
		return new Class352[] { Static643.aClass352_14, Static394.aClass352_7, Static8.aClass352_1, Static530.aClass352_12, Static428.aClass352_9, Static440.aClass352_10, Static349.aClass352_3, Static366.aClass352_4, Static611.aClass352_13, Static528.aClass352_11, Static389.aClass352_6, Static375.aClass352_5, Static157.aClass352_2, Static422.aClass352_8 };
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(III)V")
	public static void method3835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static528.anInt9203 = arg1;
		Static287.anInt5975 = arg0;
		if (Static552.anInt9486 == 0) {
			Static226.anInt5043 = Static642.anInt10730 * 2 + Static528.anInt9203;
			Static84.anInt2618 = Static401.anInt7435 * 2 + Static287.anInt5975;
		} else if (Static552.anInt9486 == 1) {
			Static354.anInt6877 = Static457.anInt8207 + Static528.anInt9203 / Static361.anInt6971 + 2;
			Static123.anInt3102 = Static287.anInt5975 / Static633.anInt10652 + Static289.anInt10739 + 2;
			Static226.anInt5043 = Static361.anInt6971 * Static354.anInt6877;
			Static84.anInt2618 = Static123.anInt3102 * Static633.anInt10652;
			Static642.anInt10730 = Static226.anInt5043 - Static528.anInt9203 >> 1;
			Static401.anInt7435 = Static84.anInt2618 - Static287.anInt5975 >> 1;
		} else if (Static552.anInt9486 == 2) {
			Static84.anInt2618 = Static287.anInt5975;
			Static226.anInt5043 = Static528.anInt9203;
			return;
		}
	}
}
