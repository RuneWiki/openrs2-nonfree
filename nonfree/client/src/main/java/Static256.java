import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public static int anInt5006;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "B")
	public static byte aByte21;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "[I")
	public static int[] anIntArray441 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!ik;")
	public static Class70 aClass70_17 = new Class70(8);

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "[I")
	public static int[] anIntArray443 = new int[50];

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	public static int anInt5016 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public static void method3914() {
		Static187.aClass1_Sub11_Sub1_2.method2699();
		@Pc(16) int local16 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static187.aClass1_Sub11_Sub1_2.method2701(2);
		if (local27 == 0) {
			Static226.anIntArray399[Static1.anInt4241++] = 2047;
			return;
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		if (local27 == 1) {
			local52 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
			Static197.aClass14_Sub2_Sub1_2.method3655(local52, 1);
			local62 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
			if (local62 == 1) {
				Static226.anIntArray399[Static1.anInt4241++] = 2047;
			}
		} else if (local27 == 2) {
			if (Static187.aClass1_Sub11_Sub1_2.method2701(1) == 1) {
				local52 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
				Static197.aClass14_Sub2_Sub1_2.method3655(local52, 2);
				local62 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
				Static197.aClass14_Sub2_Sub1_2.method3655(local62, 2);
			} else {
				local52 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
				Static197.aClass14_Sub2_Sub1_2.method3655(local52, 0);
			}
			local52 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
			if (local52 == 1) {
				Static226.anIntArray399[Static1.anInt4241++] = 2047;
			}
		} else if (local27 == 3) {
			Static140.anInt3034 = Static187.aClass1_Sub11_Sub1_2.method2701(2);
			local52 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
			if (local52 == 1) {
				Static226.anIntArray399[Static1.anInt4241++] = 2047;
			}
			local62 = Static187.aClass1_Sub11_Sub1_2.method2701(7);
			@Pc(182) int local182 = Static187.aClass1_Sub11_Sub1_2.method2701(7);
			@Pc(187) int local187 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
			Static197.aClass14_Sub2_Sub1_2.method1349(local182, local62, local187 == 1);
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	public static void method3915() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static71.aBooleanArray16[local3] = false;
		}
		Static190.anInt3922 = -1;
		Static220.anInt4376 = 5;
		Static57.anInt1261 = 0;
		Static142.anInt3051 = -1;
		Static186.anInt3847 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method3917(@OriginalArg(0) Class1_Sub11 arg0) {
		label124: while (true) {
			if (arg0.anInt3264 < arg0.aByteArray47.length) {
				@Pc(21) boolean local21 = false;
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				if (arg0.method2690() == 1) {
					local25 = arg0.method2690();
					local21 = true;
					local23 = arg0.method2690();
				}
				@Pc(46) int local46 = arg0.method2690();
				@Pc(50) int local50 = arg0.method2690();
				@Pc(61) int local61 = Static95.anInt2218 + Static254.anInt4979 - local50 * 64 - 1;
				@Pc(68) int local68 = local46 * 64 - Static264.anInt5177;
				@Pc(100) int local100;
				@Pc(104) int local104;
				if (local68 >= 0 && local61 - 63 >= 0 && local68 + 63 < Static164.anInt3508 && Static95.anInt2218 > local61) {
					local100 = local68 >> 6;
					local104 = local61 >> 6;
					@Pc(106) int local106 = 0;
					while (true) {
						if (local106 >= 64) {
							continue label124;
						}
						for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
							if (!local21 || local25 * 8 <= local106 && local25 * 8 + 8 > local106 && local111 >= local23 * 8 && local23 * 8 + 8 > local111) {
								@Pc(158) int local158 = arg0.method2690();
								if (local158 != 0) {
									@Pc(172) int local172;
									if ((local158 & 0x1) == 1) {
										local172 = arg0.method2690();
										if (Static104.aByteArrayArrayArray16[local100][local104] == null) {
											Static104.aByteArrayArrayArray16[local100][local104] = new byte[4096];
										}
										Static104.aByteArrayArrayArray16[local100][local104][local106 + (63 - local111 << 6)] = (byte) local172;
									}
									if ((local158 & 0x2) == 2) {
										local172 = arg0.method2681();
										if (Static100.anIntArrayArrayArray6[local100][local104] == null) {
											Static100.anIntArrayArrayArray6[local100][local104] = new int[4096];
										}
										Static100.anIntArrayArrayArray6[local100][local104][local106 + (63 - local111 << 6)] = local172;
									}
									if ((local158 & 0x4) == 4) {
										local172 = arg0.method2681();
										if (Static100.anIntArrayArrayArray5[local100][local104] == null) {
											Static100.anIntArrayArrayArray5[local100][local104] = new int[4096];
										}
										local172--;
										@Pc(271) Class181 local271 = Static183.method3511(local172);
										if (local271.anIntArray552 != null) {
											local271 = local271.method4427();
											if (local271 == null || local271.anInt5567 == -1) {
												continue;
											}
										}
										Static100.anIntArrayArrayArray5[local100][local104][(63 - local111 << 6) + local106] = local271.anInt5578 + 1;
										@Pc(312) Class1_Sub7 local312 = new Class1_Sub7();
										local312.anInt290 = local61;
										local312.anInt287 = local271.anInt5567;
										local312.anInt288 = local68;
										Static134.aClass61_17.method1839(local312);
									}
								}
							}
						}
						local106++;
					}
				}
				local100 = 0;
				while (true) {
					if (local100 >= (local21 ? 64 : 4096)) {
						continue label124;
					}
					local104 = arg0.method2690();
					if (local104 != 0) {
						if ((local104 & 0x1) == 1) {
							arg0.anInt3264++;
						}
						if ((local104 & 0x2) == 2) {
							arg0.anInt3264 += 2;
						}
						if ((local104 & 0x4) == 4) {
							arg0.anInt3264 += 3;
						}
					}
					local100++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
	public static void method3919() {
		Static265.aClass135_38.method3320(5);
		Static227.aClass135_26.method3320(5);
		Static255.aClass135_34.method3320(5);
		Static49.aClass135_2.method3320(5);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I")
	public static int method3920(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IC)Z")
	public static boolean method3921(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(26) int local26 = 0;
			@Pc(28) char[] local28 = Static78.aCharArray2;
			while (local26 < local28.length) {
				@Pc(36) char local36 = local28[local26];
				if (local36 == arg0) {
					return true;
				}
				local26++;
			}
		}
		return false;
	}
}
