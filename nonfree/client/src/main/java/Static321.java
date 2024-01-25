import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public static int anInt6214;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
	public static int anInt6217;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!ha;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "[[[Lclient!dh;")
	public static Class45[][][] aClass45ArrayArrayArray3;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Lclient!fi;")
	public static final Class65 aClass65_8 = new Class65();

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
	public static int anInt6220 = 0;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "[I")
	public static final int[] anIntArray520 = new int[500];

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method5268(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(42) int local42 = 2;
		for (@Pc(46) int local46 = arg0 / 10; local46 != 0; local46 /= 10) {
			local42++;
		}
		@Pc(58) char[] local58 = new char[local42];
		local58[0] = '+';
		for (@Pc(66) int local66 = local42 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 < 10) {
				local58[local66] = (char) (local81 + 48);
			} else {
				local58[local66] = (char) (local81 + 87);
			}
		}
		return new String(local58);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public static void method5269() {
		if (Static113.anIntArray533 != null) {
			return;
		}
		Static113.anIntArray533 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(88) float local88 = (1.0F - local50) * local59;
				@Pc(96) float local96 = (1.0F - local50 * local81) * local59;
				@Pc(108) float local108 = (1.0F - (1.0F - local81) * local50) * local59;
				if (local76 == 0) {
					local63 = local108;
					local61 = local59;
					local65 = local88;
				} else if (local76 == 1) {
					local63 = local59;
					local65 = local88;
					local61 = local96;
				} else if (local76 == 2) {
					local61 = local88;
					local63 = local59;
					local65 = local108;
				} else if (local76 == 3) {
					local65 = local59;
					local61 = local88;
					local63 = local96;
				} else if (local76 == 4) {
					local61 = local108;
					local63 = local88;
					local65 = local59;
				} else if (local76 == 5) {
					local61 = local59;
					local63 = local88;
					local65 = local96;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(199) int local199 = (int) (local61 * 256.0F);
				@Pc(204) int local204 = (int) (local63 * 256.0F);
				@Pc(209) int local209 = (int) (local65 * 256.0F);
				@Pc(222) int local222 = local209 + (local199 << 16) + (local204 << 8) - 16777216;
				Static113.anIntArray533[local26++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)[Lclient!je;")
	public static Class105[] method5271() {
		if (Static200.aClass105Array1 == null) {
			@Pc(20) Class105[] local20 = Static227.method3952(Static353.aClass42_5);
			@Pc(24) Class105[] local24 = new Class105[local20.length];
			@Pc(26) int local26 = 0;
			@Pc(77) int local77;
			@Pc(83) Class105 local83;
			label63: for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
				@Pc(34) Class105 local34 = local20[local28];
				if ((local34.anInt2896 <= 0 || local34.anInt2896 >= 24) && local34.anInt2899 >= 800 && local34.anInt2895 >= 600 && (Static26.anInt699 >= 96 || Static352.anInt6827 != 0 || local34.anInt2899 <= 1024 && local34.anInt2895 <= 768)) {
					for (local77 = 0; local77 < local26; local77++) {
						local83 = local24[local77];
						if (local34.anInt2899 == local83.anInt2899 && local34.anInt2895 == local83.anInt2895) {
							if (local34.anInt2896 > local83.anInt2896) {
								local24[local77] = local34;
							}
							continue label63;
						}
					}
					local24[local26] = local34;
					local26++;
				}
			}
			Static200.aClass105Array1 = new Class105[local26];
			Static367.method4036(local24, 0, Static200.aClass105Array1, 0, local26);
			@Pc(143) int[] local143 = new int[Static200.aClass105Array1.length];
			for (local77 = 0; local77 < Static200.aClass105Array1.length; local77++) {
				local83 = Static200.aClass105Array1[local77];
				local143[local77] = local83.anInt2895 * local83.anInt2899;
			}
			Static234.method4371(Static200.aClass105Array1, local143);
		}
		return Static200.aClass105Array1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ro;Z)Z")
	public static boolean method5272(@OriginalArg(0) Class5_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static69.aClass22Array1 == Static182.aClass22Array2;
		@Pc(8) int local8 = 0;
		arg0.method5040();
		if (arg0.aShort86 < 0 || arg0.aShort87 < 0 || arg0.aShort89 >= Static103.anInt2156 || arg0.aShort88 >= Static116.anInt2499) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort86; local30 <= arg0.aShort89; local30++) {
			for (local34 = arg0.aShort87; local34 <= arg0.aShort88; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort86) {
					local37++;
				}
				if (local30 < arg0.aShort89) {
					local37 += 4;
				}
				if (local34 > arg0.aShort87) {
					local37 += 8;
				}
				if (local34 < arg0.aShort88) {
					local37 += 2;
				}
				Static128.method2212(arg0.aByte69, local30, local34);
				@Pc(71) Class45 local71 = Static256.aClass45ArrayArrayArray2[arg0.aByte69][local30][local34];
				@Pc(76) Class160 local76 = Static230.method5536(arg0, local37);
				@Pc(79) Class160 local79 = local71.aClass160_1;
				if (local79 == null) {
					local71.aClass160_1 = local76;
				} else {
					while (local79.aClass160_3 != null) {
						local79 = local79.aClass160_3;
					}
					local79.aClass160_3 = local76;
				}
				local71.aByte8 = (byte) (local71.aByte8 | local37);
				if (local6 && Static245.anIntArrayArray46[local30][local34] != 0) {
					local8 = Static245.anIntArrayArray46[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort86; local34 <= arg0.aShort89; local34++) {
				for (local37 = arg0.aShort87; local37 <= arg0.aShort88; local37++) {
					if (Static245.anIntArrayArray46[local34][local37] == 0) {
						Static245.anIntArrayArray46[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static287.aClass5_Sub4Array3[Static45.anInt928++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public static void method5273() {
		while (true) {
			if (Static20.aClass3_Sub4_Sub2_1.method3677(Static306.anInt6046) >= 11) {
				@Pc(17) int local17 = Static20.aClass3_Sub4_Sub2_1.method3681(11);
				if (local17 != 2047) {
					@Pc(22) boolean local22 = false;
					if (Static254.aClass5_Sub4_Sub4_Sub1Array1[local17] == null) {
						Static254.aClass5_Sub4_Sub4_Sub1Array1[local17] = new Class5_Sub4_Sub4_Sub1();
						Static254.aClass5_Sub4_Sub4_Sub1Array1[local17].anInt4946 = local17;
						if (Static109.aClass3_Sub4Array1[local17] != null) {
							Static254.aClass5_Sub4_Sub4_Sub1Array1[local17].method2678(Static109.aClass3_Sub4Array1[local17]);
						}
						local22 = true;
					}
					Static235.anIntArray377[Static170.anInt6275++] = local17;
					@Pc(63) Class5_Sub4_Sub4_Sub1 local63 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local17];
					local63.anInt4921 = Static51.anInt1101;
					@Pc(71) int local71 = Static20.aClass3_Sub4_Sub2_1.method3681(5);
					if (local71 > 15) {
						local71 -= 32;
					}
					@Pc(82) int local82 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
					if (local82 == 1) {
						Static303.anIntArray447[Static283.anInt4489++] = local17;
					}
					@Pc(100) int local100 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
					@Pc(107) int local107 = Static147.anIntArray208[Static20.aClass3_Sub4_Sub2_1.method3681(3)];
					@Pc(112) int local112 = Static20.aClass3_Sub4_Sub2_1.method3681(5);
					if (local22) {
						local63.method4210(local107);
					}
					if (local112 > 15) {
						local112 -= 32;
					}
					local63.method2675(local112 + Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local71 + Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0], Static163.anInt3184, local100 == 1);
					continue;
				}
			}
			Static20.aClass3_Sub4_Sub2_1.method3680();
			return;
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
	public static void method5274() {
		if (Static88.aClass115_1 == null) {
			return;
		}
		while (true) {
			while (Static302.aClass58_Sub1Array2.length > Static169.anInt3574) {
				@Pc(24) Class58_Sub1 local24 = Static302.aClass58_Sub1Array2[Static169.anInt3574];
				if (local24 != null && local24.anInt5534 == -1) {
					if (Static91.aClass3_Sub33_1 == null) {
						Static91.aClass3_Sub33_1 = Static88.aClass115_1.method2840(local24.aString195);
					}
					@Pc(47) int local47 = Static91.aClass3_Sub33_1.anInt4563;
					if (local47 == -1) {
						return;
					}
					Static91.aClass3_Sub33_1 = null;
					Static169.anInt3574++;
					local24.anInt5534 = local47;
				} else {
					Static169.anInt3574++;
				}
			}
			return;
		}
	}
}
