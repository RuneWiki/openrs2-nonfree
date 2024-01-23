import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!kh;")
	public static Class60 aClass60_342 = Static200.method3116("leuchten2:");

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Lclient!ge;")
	public static Class39 aClass39_7 = new Class39(64);

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_343 = Static200.method3116("mapflag");

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!kh;")
	public static Class60 aClass60_344 = Static200.method3116("title)3jpg");

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt1027 = 0;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "[I")
	public static int[] anIntArray142 = new int[256];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[B)V")
	public static void method772(@OriginalArg(1) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (local7 < arg0.length) {
				@Pc(21) int local21 = arg0[local7++] * 64 - Static73.anInt1791;
				@Pc(31) int local31 = arg0[local7++] * 64 - Static153.anInt3417;
				@Pc(61) int local61;
				@Pc(65) int local65;
				if (local21 > 0 && local31 > 0 && Static211.anInt3462 > local21 + 64 && Static30.anInt724 > local31 + 64) {
					local65 = Static30.anInt724 - local31 - 1 >> 6;
					local61 = local21 >> 6;
					for (@Pc(128) int local128 = 0; local128 < 64; local128++) {
						for (@Pc(132) int local132 = -64; local132 < 0; local132++) {
							@Pc(139) byte local139 = arg0[local7++];
							if (local139 != 0) {
								@Pc(156) byte local156;
								if ((local139 & 0x1) == 1) {
									local156 = arg0[local7++];
									if (Static153.aByteArrayArrayArray7[local61][local65] == null) {
										Static153.aByteArrayArrayArray7[local61][local65] = new byte[4096];
									}
									Static153.aByteArrayArrayArray7[local61][local65][local128 + (-(local132 + 1) << 6)] = (byte) local156;
								}
								if ((local139 & 0x2) == 2) {
									local156 = arg0[local7++];
									if (Static185.aByteArrayArrayArray10[local61][local65] == null) {
										Static185.aByteArrayArrayArray10[local61][local65] = new byte[4096];
									}
									Static185.aByteArrayArrayArray10[local61][local65][(-(local132 + 1) << 6) + local128] = (byte) (local156 - 28);
								}
								if ((local139 & 0x4) == 4) {
									local7 += 3;
									@Pc(265) int local265 = ((arg0[local7 - 3] & 0xFF) << 16) + (arg0[local7 - 2] << 8 & 0xFF00) + (arg0[local7 - 1] & 0xFF);
									if (Static52.anIntArrayArrayArray8[local61][local65] == null) {
										Static52.anIntArrayArrayArray8[local61][local65] = new int[4096];
									}
									local265--;
									@Pc(283) Class1_Sub1_Sub23 local283 = Static44.method760(local265);
									if (local283.anIntArray526 != null) {
										local283 = local283.method2938();
										if (local283 == null || local283.anInt4035 == -1) {
											continue;
										}
									}
									Static52.anIntArrayArrayArray8[local61][local65][(-(local132 + 1) << 6) + local128] = local283.anInt4033 + 1;
									@Pc(321) Class1_Sub20 local321 = new Class1_Sub20();
									local321.anInt3104 = local283.anInt4035;
									local321.anInt3106 = Static30.anInt724 - local31;
									local321.anInt3103 = local21;
									Static137.aClass19_19.method620(local321);
								}
							}
						}
					}
				} else {
					for (local61 = 0; local61 < 64; local61++) {
						for (local65 = -64; local65 < 0; local65++) {
							@Pc(72) byte local72 = arg0[local7++];
							if (local72 != 0) {
								if ((local72 & 0x1) == 1) {
									local7++;
								}
								if ((local72 & 0x2) == 2) {
									local7++;
								}
								if ((local72 & 0x4) == 4) {
									local7 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method774(@OriginalArg(0) Class6 arg0) {
		@Pc(11) int local11 = arg0.anInt245;
		if (local11 == 324) {
			if (Static135.anInt2929 == -1) {
				Static135.anInt2929 = arg0.anInt257;
				Static135.anInt2932 = arg0.anInt198;
			}
			if (Static9.aClass50_3.aBoolean110) {
				arg0.anInt257 = Static135.anInt2929;
			} else {
				arg0.anInt257 = Static135.anInt2932;
			}
		} else if (local11 == 325) {
			if (Static135.anInt2929 == -1) {
				Static135.anInt2929 = arg0.anInt257;
				Static135.anInt2932 = arg0.anInt198;
			}
			if (Static9.aClass50_3.aBoolean110) {
				arg0.anInt257 = Static135.anInt2932;
			} else {
				arg0.anInt257 = Static135.anInt2929;
			}
		} else if (local11 == 327) {
			arg0.anInt237 = 150;
			arg0.anInt223 = (int) (Math.sin((double) Static42.anInt910 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt246 = 5;
			arg0.anInt239 = -1;
		} else if (local11 == 328) {
			if (Static84.aClass9_Sub4_Sub1_2.aClass60_414 == null) {
				arg0.anInt239 = 0;
			} else {
				arg0.anInt237 = 150;
				arg0.anInt223 = (int) (Math.sin((double) Static42.anInt910 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt246 = 5;
				arg0.anInt239 = ((int) Static84.aClass9_Sub4_Sub1_2.aClass60_414.method1829() << 11) + 2047;
				arg0.anInt264 = Static84.aClass9_Sub4_Sub1_2.anInt3905;
				arg0.anInt269 = Static84.aClass9_Sub4_Sub1_2.anInt3897;
			}
		}
	}
}
