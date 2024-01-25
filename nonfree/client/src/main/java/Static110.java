import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dia", name = "v", descriptor = "[Lclient!lq;")
	public static Class28_Sub1[] aClass28_Sub1Array1;

	@OriginalMember(owner = "client!dia", name = "x", descriptor = "Lclient!en;")
	public static Class105 aClass105_1;

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_4 = new Class131(1, 2, 2, 0);

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
	public static int anInt2345 = 0;

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "[I")
	public static final int[] anIntArray82 = new int[13];

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIC)C")
	public static char method2085(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(Z)V")
	public static void method2086() {
		for (@Pc(3) int local3 = 0; local3 < Static204.anInt3872; local3++) {
			@Pc(14) Class351 local14 = Static569.aClass351Array1[local3];
			@Pc(16) boolean local16 = false;
			@Pc(157) int local157;
			if (local14.aClass5_Sub17_Sub2_4 == null) {
				local14.anInt9878--;
				if (local14.anInt9878 < (local14.method8229() ? -1500 : -10)) {
					local16 = true;
				} else {
					if (local14.aByte134 == 1 && local14.aClass272_1 == null) {
						local14.aClass272_1 = Static688.method6403(Static162.aClass390_35, local14.anInt9881, 0);
						if (local14.aClass272_1 == null) {
							continue;
						}
						local14.anInt9878 += local14.aClass272_1.method6404();
					} else if (local14.method8229() && (local14.aClass5_Sub38_3 == null || local14.aClass5_Sub42_Sub1_4 == null)) {
						if (local14.aClass5_Sub38_3 == null) {
							local14.aClass5_Sub38_3 = Static338.method5167(Static180.aClass390_42, local14.anInt9881);
						}
						if (local14.aClass5_Sub38_3 == null) {
							continue;
						}
						if (local14.aClass5_Sub42_Sub1_4 == null) {
							local14.aClass5_Sub42_Sub1_4 = local14.aClass5_Sub38_3.method5176(new int[] { 22050 });
							if (local14.aClass5_Sub42_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local14.anInt9878 < 0) {
						@Pc(130) int local130 = 8192;
						if (local14.anInt9876 == 0) {
							local157 = local14.anInt9882 * (local14.aByte134 == 3 ? Static172.aClass5_Sub50_14.aClass12_Sub7_2.method2118() : Static172.aClass5_Sub50_14.aClass12_Sub7_4.method2118()) >> 2;
						} else {
							@Pc(166) int local166 = local14.anInt9876 >> 24 & 0x3;
							if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 == local166) {
								@Pc(181) int local181 = (local14.anInt9876 & 0xFF) << 9;
								@Pc(187) int local187 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() << 8;
								@Pc(194) int local194 = local14.anInt9876 >> 16 & 0xFF;
								@Pc(206) int local206 = local187 + (local194 << 9) + 256 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781;
								@Pc(213) int local213 = local14.anInt9876 >> 8 & 0xFF;
								@Pc(225) int local225 = (local213 << 9) + local187 + 256 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784;
								@Pc(234) int local234 = Math.abs(local206) + Math.abs(local225) - 512;
								if (local234 > local181) {
									local14.anInt9878 = -99999;
									continue;
								}
								if (local234 < 0) {
									local234 = 0;
								}
								local157 = (local181 - local234) * Static172.aClass5_Sub50_14.lb.method2118() * local14.anInt9882 / local181 >> 2;
								if (local14.aClass28_Sub1_20 != null && local14.aClass28_Sub1_20 instanceof Class28_Sub1_Sub4) {
									@Pc(277) Class28_Sub1_Sub4 local277 = (Class28_Sub1_Sub4) local14.aClass28_Sub1_20;
									@Pc(280) short local280 = local277.aShort124;
									@Pc(283) short local283 = local277.aShort121;
								}
								if (local206 != 0 || local225 != 0) {
									@Pc(306) int local306 = -Static207.anInt3885 - (int) (Math.atan2((double) local206, (double) local225) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local306 > 8192) {
										local306 = 16384 - local306;
									}
									@Pc(318) int local318;
									if (local234 <= 0) {
										local318 = 8192;
									} else if (local234 >= 4096) {
										local318 = 16384;
									} else {
										local318 = (8192 - local234) / 4096 + 8192;
									}
									local130 = local306 * local318 / 8192 + (16384 - local318 >> 1);
								}
							} else {
								local157 = 0;
							}
						}
						if (local157 > 0) {
							@Pc(357) Class5_Sub42_Sub1 local357 = null;
							if (local14.aByte134 == 1) {
								local357 = local14.aClass272_1.method6406().method5821(Static264.aClass276_2);
							} else if (local14.method8229()) {
								local357 = local14.aClass5_Sub42_Sub1_4;
							}
							@Pc(387) Class5_Sub17_Sub2 local387 = local14.aClass5_Sub17_Sub2_4 = Static684.method3952(local357, local14.anInt9880, local157, local130);
							local387.method3969(local14.anInt9877 - 1);
							Static245.aClass5_Sub17_Sub4_2.method6191(local387);
						}
					}
				}
			} else if (!local14.aClass5_Sub17_Sub2_4.method9048()) {
				local16 = true;
			}
			if (local16) {
				Static204.anInt3872--;
				for (local157 = local3; local157 < Static204.anInt3872; local157++) {
					Static569.aClass351Array1[local157] = Static569.aClass351Array1[local157 + 1];
				}
				local3--;
			}
		}
		if (Static569.aBoolean788 && !Static101.method1980()) {
			if (Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118() != 0 && Static33.anInt545 != -1) {
				if (Static34.aClass5_Sub17_Sub1_1 == null) {
					Static127.method2322(Static396.aClass390_82, Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118(), Static33.anInt545);
				} else {
					Static23.method294(Static33.anInt545, Static396.aClass390_82, Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118(), Static34.aClass5_Sub17_Sub1_1);
				}
			}
			Static34.aClass5_Sub17_Sub1_1 = null;
			Static569.aBoolean788 = false;
		} else if (Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118() != 0 && Static33.anInt545 != -1 && !Static101.method1980()) {
			@Pc(499) Class5_Sub21 local499 = Static64.method905(Static263.aClass49_1, Static572.aClass305_91);
			local499.aClass5_Sub41_Sub2_1.method7803(Static33.anInt545);
			Static495.method7092(local499);
			Static33.anInt545 = -1;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)I")
	public static int method2088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = (local21 * local21 * 15731 + 789221) * local21 + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!mc;)Lclient!qh;")
	public static Class9_Sub3 method2092(@OriginalArg(1) Class5_Sub41 arg0) {
		return new Class9_Sub3(arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7849(), arg0.method7807(), arg0.method7807(), arg0.method7816());
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "([[IZ)V")
	public static void method2093(@OriginalArg(0) int[][] arg0) {
		Static16.anIntArrayArray2 = arg0;
	}
}
