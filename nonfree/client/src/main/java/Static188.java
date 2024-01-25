import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	public static int anInt4080;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public static int anInt4084;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Lclient!ri;")
	public static Class284 aClass284_56;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_12 = new Class364(0, 5);

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "Z")
	public static final boolean aBoolean280 = false;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!ie;I)Ljava/lang/String;")
	public static String method3310(@OriginalArg(1) Class3_Sub26 arg0) {
		try {
			@Pc(7) int local7 = arg0.method6832();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local7];
			arg0.anInt8703 += Static417.aClass77_1.method2195(local7, 0, arg0.aByteArray213, local23, arg0.anInt8703);
			return Static172.method3065(local7, local23, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method3311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static485.anInt8405 == -1) {
			return 1;
		}
		if (arg0 != Static37.anInt1122) {
			Static213.method3572(Static573.aClass350_17.method7730(Static201.anInt4321), arg0);
			if (Static37.anInt1122 != arg0) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Static129.aCanvas6.getSize();
			Static452.method6235(Static2.aClass63_1, Static573.aClass350_17.method7730(Static201.anInt4321), Static319.aClass31_11, Static318.aClass328_8, true);
			@Pc(48) Class332 local48 = Static326.method4807(Static485.anInt8405, Static396.aClass284_115);
			@Pc(51) long local51 = Static96.method2000();
			Static319.aClass31_11.JA();
			Static585.aClass42_6.NA(0, Static211.anInt8485, 0);
			Static319.aClass31_11.method8062(Static585.aClass42_6);
			Static319.aClass31_11.la(local32.width / 2, local32.height / 2, 512, 512);
			Static319.aClass31_11.ra(1.0F);
			Static319.aClass31_11.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(92) Class52 local92 = Static319.aClass31_11.method8046(local48, 2048, 64, 64, 768);
			@Pc(94) int local94 = 0;
			label41: for (@Pc(96) int local96 = 0; local96 < 500; local96++) {
				Static319.aClass31_11.ja(0);
				Static319.aClass31_11.ya();
				for (@Pc(105) int local105 = 15; local105 >= 0; local105--) {
					for (@Pc(109) int local109 = 0; local109 <= local105; local109++) {
						Static378.aClass42_4.NA((int) (((float) local109 - (float) local105 / 2.0F) * (float) Static331.anInt6010), 0, (local105 + 1) * Static331.anInt6010);
						local94++;
						local92.method7617(Static378.aClass42_4, null, 0);
						if (Static96.method2000() - local51 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static319.aClass31_11.method8067();
			@Pc(177) long local177 = (long) (local94 * 1000) / (Static96.method2000() - local51);
			Static319.aClass31_11.ja(0);
			Static319.aClass31_11.ya();
			return (int) local177;
		} catch (@Pc(186) Throwable local186) {
			local186.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public static void method3312(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static397.anInt6998 - Static585.anInt10107;
		if (local8 >= 100) {
			Static481.anInt8356 = -1;
			Static357.anInt6345 = -1;
			anInt4080 = 1;
			return;
		}
		@Pc(21) int local21 = (int) Static123.aFloat75;
		if (local21 < Static6.anInt46 >> 8) {
			local21 = Static6.anInt46 >> 8;
		}
		if (Static359.aBooleanArray17[4] && Static153.anIntArray134[4] + 128 > local21) {
			local21 = Static153.anIntArray134[4] + 128;
		}
		@Pc(58) int local58 = Static427.anInt7545 + (int) Static209.aFloat229 & 0x3FFF;
		Static467.method6393((local21 >> 3) * 3 + 600 << 2, Static262.anInt5037, Static377.anInt6530, local58, Static78.method3298(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476, Static594.anInt10310, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482) - 200, arg0, local21);
		@Pc(109) float local109 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static335.anInt6057 = (int) ((float) Static352.anInt6285 + (float) (Static335.anInt6057 - Static352.anInt6285) * local109);
		Static568.anInt9808 = (int) ((float) Static136.anInt3266 + local109 * (float) (Static568.anInt9808 - Static136.anInt3266));
		Static407.anInt7345 = (int) ((float) Static466.anInt8097 + local109 * (float) (Static407.anInt7345 - Static466.anInt8097));
		Static418.anInt7466 = (int) (local109 * (float) (Static418.anInt7466 - Static107.anInt2618) + (float) Static107.anInt2618);
		@Pc(159) int local159 = Static421.anInt7497 - Static456.anInt7974;
		if (local159 > 8192) {
			local159 -= 16384;
		} else if (local159 < -8192) {
			local159 += 16384;
		}
		Static421.anInt7497 = (int) ((float) Static456.anInt7974 + (float) local159 * local109);
		Static421.anInt7497 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([IIIIIIII)V")
	public static void method3314(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static249.method6960(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static249.method6960(arg3)) {
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg1 < arg3 ? arg1 : arg3;
			@Pc(54) int local54 = arg1 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) int[] local65 = arg0;
			@Pc(70) int[] local70 = new int[local54 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local39, arg2, arg1, arg3, 0, 32993, arg5, local65, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg1;
				for (@Pc(96) int local96 = 0; local96 < local63; local96++) {
					for (@Pc(100) int local100 = 0; local100 < local54; local100++) {
						@Pc(107) int local107 = local65[local90++];
						@Pc(112) int local112 = local65[local94++];
						@Pc(117) int local117 = local65[local90++];
						@Pc(123) int local123 = local107 >> 24 & 0xFF;
						@Pc(129) int local129 = local107 >> 16 & 0xFF;
						@Pc(133) int local133 = local107 & 0xFF;
						@Pc(138) int local138 = local65[local94++];
						@Pc(144) int local144 = local107 >> 8 & 0xFF;
						@Pc(152) int local152 = local129 + (local117 >> 16 & 0xFF);
						@Pc(160) int local160 = local144 + (local117 >> 8 & 0xFF);
						@Pc(166) int local166 = local133 + (local117 & 0xFF);
						@Pc(174) int local174 = local123 + (local117 >> 24 & 0xFF);
						@Pc(182) int local182 = local160 + (local112 >> 8 & 0xFF);
						@Pc(190) int local190 = local174 + (local112 >> 24 & 0xFF);
						@Pc(196) int local196 = local166 + (local112 & 0xFF);
						@Pc(204) int local204 = local152 + (local112 >> 16 & 0xFF);
						@Pc(212) int local212 = local182 + (local138 >> 8 & 0xFF);
						@Pc(218) int local218 = local196 + (local138 & 0xFF);
						@Pc(226) int local226 = local190 + (local138 >> 24 & 0xFF);
						@Pc(234) int local234 = local204 + (local138 >> 16 & 0xFF);
						local70[local88++] = local218 >> 2 & 0xFF | (local212 & 0x3FC) << 6 | (local234 & 0x3FC) << 14 | (local226 & 0x3FC) << 22;
					}
					local94 += arg1;
					local90 += arg1;
				}
				@Pc(283) int[] local283 = local70;
				local70 = local65;
				arg3 = local63;
				arg1 = local54;
				local65 = local283;
				local63 >>= 0x1;
				local54 >>= 0x1;
				local50 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
