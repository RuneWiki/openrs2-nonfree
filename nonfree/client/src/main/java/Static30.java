import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_3 = new Class180();

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
	public static final int[] anIntArray59 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "Lclient!rg;")
	public static final Class172 aClass172_2 = new Class172("runescape", 0);

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
	public static int anInt482 = 503;

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
	public static int anInt483 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	public static void method402(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static6.anInt91 - Static122.anInt2596;
		if (local8 >= 100) {
			Static135.anInt2910 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static99.aFloat33;
		if (local19 < Static12.anInt215 >> 8) {
			local19 = Static12.anInt215 >> 8;
		}
		if (Static62.aBooleanArray7[4] && local19 < Static25.anIntArray51[4] + 128) {
			local19 = Static25.anIntArray51[4] + 128;
		}
		@Pc(52) int local52 = Static206.anInt4521 + (int) Static366.aFloat48 & 0x3FFF;
		Static221.method4178(Static54.anInt975, local52, (local19 >> 3) * 3 + 600, Static98.anInt2002, local19, Static97.method1899(Static291.anInt5263, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893) - 50, arg0);
		@Pc(93) float local93 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static168.anInt3820 = (int) ((float) Static228.anInt4939 + local93 * (float) (Static168.anInt3820 - Static228.anInt4939));
		Static166.anInt3804 = (int) ((float) (Static166.anInt3804 - Static234.anInt5034) * local93 + (float) Static234.anInt5034);
		Static23.anInt356 = (int) ((float) Static276.anInt5646 + (float) (Static23.anInt356 - Static276.anInt5646) * local93);
		Static51.anInt879 = (int) ((float) Static332.anInt6427 + (float) (Static51.anInt879 - Static332.anInt6427) * local93);
		@Pc(146) int local146 = Static195.anInt4286 - Static243.anInt5176;
		if (local146 > 8192) {
			local146 -= 16384;
		} else if (local146 < -8192) {
			local146 += 16384;
		}
		Static195.anInt4286 = (int) (local93 * (float) local146 + (float) Static243.anInt5176);
		Static195.anInt4286 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg0 < 128 || arg1 < 128 || Static66.anInt1177 * 128 - 256 < arg0 || arg1 > (Static12.anInt213 - 2) * 128) {
			Static311.anIntArray474[0] = Static311.anIntArray474[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static97.method1899(arg2, arg1, arg0) - arg6;
		Static297.aClass38_4.method4470(arg5, 0, 0);
		Static51.aClass37_1.method3682(Static297.aClass38_4);
		Static51.aClass37_1.method3655(arg0, local45, arg1, Static311.anIntArray474);
		Static297.aClass38_4.method4470(-arg5, 0, 0);
		Static51.aClass37_1.method3682(Static297.aClass38_4);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!dr;Lclient!fc;IILclient!dh;)Z")
	public static boolean method407(@OriginalArg(1) Class37 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(5) Class2_Sub8 arg2) {
		@Pc(12) int local12 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg1.anIntArray137 != null) {
			local18 = Static202.anInt4951 - (arg1.anInt1762 + arg2.anInt1037 - Static202.anInt4959) * (Static202.anInt4951 - Static202.anInt4955) / (Static202.anInt4953 - Static202.anInt4959);
			local16 = Static202.anInt4951 - (Static202.anInt4951 - Static202.anInt4955) * (arg1.anInt1755 + arg2.anInt1037 - Static202.anInt4959) / (Static202.anInt4953 - Static202.anInt4959);
			local14 = Static202.anInt4960 + (Static202.anInt4961 - Static202.anInt4960) * (arg1.anInt1761 + arg2.anInt1043 - Static202.anInt4950) / (Static202.anInt4954 - Static202.anInt4950);
			local12 = Static202.anInt4960 + (Static202.anInt4961 - Static202.anInt4960) * (arg2.anInt1043 + arg1.anInt1744 - Static202.anInt4950) / (Static202.anInt4954 - Static202.anInt4950);
		}
		@Pc(106) Class46 local106 = null;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg1.anInt1739 != -1) {
			if (arg2.aBoolean104 && arg1.anInt1733 != -1) {
				local106 = arg1.method1805(arg0, true);
			} else {
				local106 = arg1.method1805(arg0, false);
			}
			if (local106 != null) {
				local108 = arg2.anInt1042 - (local106.method5031() + 1 >> 1);
				local110 = arg2.anInt1042 + (local106.method5031() + 1 >> 1);
				if (local108 < local12) {
					local12 = local108;
				}
				local112 = arg2.anInt1040 - (local106.method5022() + 1 >> 1);
				if (local14 < local110) {
					local14 = local110;
				}
				local114 = arg2.anInt1040 + (local106.method5022() + 1 >> 1);
				if (local16 > local112) {
					local16 = local112;
				}
				if (local114 > local18) {
					local18 = local114;
				}
			}
		}
		@Pc(212) Class189 local212 = null;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(276) int local276;
		@Pc(303) int local303;
		if (arg1.aString18 != null) {
			local212 = Static309.method5154(arg1.anInt1746);
			if (local212 != null) {
				local214 = Static142.aClass82_6.method2235(null, null, arg1.aString18, Static358.aStringArray43);
				local216 = arg2.anInt1040;
				if (local106 == null) {
					local216 -= local212.method5132() * local214 / 2;
				} else {
					local216 -= (local106.method5022() >> 1) + (local214 * local212.method5128());
				}
				for (local276 = 0; local276 < local214; local276++) {
					@Pc(282) String local282 = Static358.aStringArray43[local276];
					if (local214 - 1 > local276) {
						local282 = local282.substring(0, local282.length() - 4);
					}
					local303 = local212.method5129(local282);
					if (local303 > local218) {
						local218 = local303;
					}
				}
				local220 = arg2.anInt1042 - local218 / 2;
				if (local12 > local220) {
					local12 = local220;
				}
				local222 = arg2.anInt1042 + local218 / 2;
				local224 = local216;
				if (local222 > local14) {
					local14 = local222;
				}
				local226 = local214 * local212.method5128() + local216;
				if (local224 < local16) {
					local16 = local224;
				}
				if (local18 < local226) {
					local18 = local226;
				}
			}
		}
		if (local14 < Static202.anInt4960 || local12 > Static202.anInt4961 || Static202.anInt4955 > local18 || local16 > Static202.anInt4951) {
			return true;
		}
		@Pc(397) int local397;
		if (arg1.anIntArray137 != null) {
			@Pc(395) int[] local395 = new int[arg1.anIntArray137.length];
			for (local397 = 0; local397 < local395.length / 2; local397++) {
				local303 = arg2.anInt1043 + arg1.anIntArray137[local397 * 2];
				@Pc(421) int local421 = arg1.anIntArray137[local397 * 2 + 1] + arg2.anInt1037;
				local395[local397 * 2] = (local303 - Static202.anInt4950) * (Static202.anInt4961 + -Static202.anInt4960) / (Static202.anInt4954 - Static202.anInt4950) + Static202.anInt4960;
				local395[local397 * 2 + 1] = Static202.anInt4951 - (Static202.anInt4951 - Static202.anInt4955) * (local421 + -Static202.anInt4959) / (Static202.anInt4953 - Static202.anInt4959);
			}
			Static277.method4771(arg0, local395, arg1.anInt1763);
			for (local303 = 0; local303 < local395.length / 2 - 1; local303++) {
				arg0.method3681(local395[local303 * 2 + 1 + 2], local395[local303 * 2 + 1], local395[local303 * 2], arg1.anInt1742, local395[(local303 + 1) * 2]);
			}
			arg0.method3681(local395[1], local395[local395.length - 1], local395[local395.length - 2], arg1.anInt1742, local395[0]);
		}
		if (local106 != null) {
			if (Static314.anInt6200 > 0 && (Static308.anInt6109 != -1 && arg2.anInt1039 == Static308.anInt6109 || Static286.anInt5744 != -1 && Static286.anInt5744 == arg1.anInt1764)) {
				if (Static328.anInt6685 <= 50) {
					local276 = Static328.anInt6685 * 2;
				} else {
					local276 = (100 - Static328.anInt6685) * 2;
				}
				local397 = local276 << 24 | 0xFFFF00;
				arg0.method3698(arg2.anInt1040, arg2.anInt1042, local397, local106.method5019() / 2 + 7);
				arg0.method3698(arg2.anInt1040, arg2.anInt1042, local397, local106.method5019() / 2 + 5);
				arg0.method3698(arg2.anInt1040, arg2.anInt1042, local397, local106.method5019() / 2 + 3);
				arg0.method3698(arg2.anInt1040, arg2.anInt1042, local397, local106.method5019() / 2 + 1);
				arg0.method3698(arg2.anInt1040, arg2.anInt1042, local397, local106.method5019() / 2);
			}
			local106.method5016(arg2.anInt1042 - (local106.method5031() >> 1), arg2.anInt1040 - (local106.method5022() >> 1));
		}
		if (arg1.aString18 != null && local212 != null) {
			Static342.method5578(local212, arg2, arg0, arg1, local218, local214, local216);
		}
		if (arg1.anInt1739 != -1 || arg1.aString18 != null) {
			@Pc(707) Class2_Sub38 local707 = new Class2_Sub38(arg2);
			local707.anInt5790 = local110;
			local707.anInt5786 = local224;
			local707.anInt5789 = local220;
			local707.anInt5787 = local114;
			local707.anInt5788 = local226;
			local707.anInt5793 = local112;
			local707.anInt5792 = local222;
			local707.anInt5785 = local108;
			Static284.aClass180_39.method4909(local707);
		}
		return false;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
	public static void method408() {
		for (@Pc(1) int local1 = 0; local1 < Static204.anInt4466; local1++) {
			@Pc(6) Class1_Sub2 local6 = Static230.aClass1_Sub2Array6[local1];
			Static242.method4781(local6);
			Static230.aClass1_Sub2Array6[local1] = null;
		}
		Static204.anInt4466 = 0;
	}
}
