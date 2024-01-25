import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIIZ)V")
	public static void method3290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static93.aLong265 = 0L;
		@Pc(12) int local12 = Static211.method3254();
		if (arg1 == 3 || local12 == 3) {
			arg3 = true;
		}
		if (!Static412.aClass50_8.method5824()) {
			arg3 = true;
		}
		Static261.method3758(arg3, arg2, arg1, arg0, local12);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIIZI)V")
	public static void method3291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static309.aClass11ArrayArrayArray2 == null) {
			Static412.aClass50_8.method5853(arg4, arg1, -16777216, arg2, arg0);
		} else if (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >= 0 && Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 < Static2.anInt7 * 128 && Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >= 0 && Static17.anInt315 * 128 > Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094) {
			Static186.anInt3747++;
			if (Static263.aClass24_Sub3_Sub2_Sub2_4 != null && Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 - (Static263.aClass24_Sub3_Sub2_Sub2_4.method4919() - 1) * 64 >> 7 == Static297.anInt5146 && Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 - (Static263.aClass24_Sub3_Sub2_Sub2_4.method4919() - 1) * 64 >> 7 == Static457.anInt7597) {
				Static297.anInt5146 = -1;
				Static457.anInt7597 = -1;
				Static245.method3582();
			}
			Static423.method5591();
			if (!arg3) {
				Static276.method2466();
			}
			Static293.method4114();
			Static250.method3631(true, arg0, arg1, arg4, arg2);
			@Pc(114) int local114 = Static18.anInt317;
			@Pc(116) int local116 = Static182.anInt3705;
			@Pc(118) int local118 = Static110.anInt2209;
			@Pc(120) int local120 = Static269.anInt4734;
			@Pc(131) int local131;
			@Pc(166) int local166;
			if (Static157.anInt3176 == 1) {
				local131 = (int) Static16.aFloat6;
				if (local131 < Static190.anInt3828 >> 8) {
					local131 = Static190.anInt3828 >> 8;
				}
				if (Static65.aBooleanArray1[4] && local131 < Static443.anIntArray727[4] + 128) {
					local131 = Static443.anIntArray727[4] + 128;
				}
				local166 = Static168.anInt3341 + (int) Static149.aFloat53 & 0x3FFF;
				Static176.method2941(Static326.method4459(Static96.anInt1983, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094) - 50, local120, local166, Static399.anInt6746, Static440.anInt7366, (local131 >> 3) * 3 + 600 << 0, local131);
			} else if (Static157.anInt3176 == 4) {
				local131 = (int) Static16.aFloat6;
				if (Static190.anInt3828 >> 8 > local131) {
					local131 = Static190.anInt3828 >> 8;
				}
				if (Static65.aBooleanArray1[4] && Static443.anIntArray727[4] + 128 > local131) {
					local131 = Static443.anIntArray727[4] + 128;
				}
				local166 = (int) Static149.aFloat53 & 0x3FFF;
				Static176.method2941(Static326.method4459(Static96.anInt1983, Static187.anInt3752, Static131.anInt2737) - 50, local120, local166, Static399.anInt6746, Static440.anInt7366, (local131 >> 3) * 3 + 600 << 0, local131);
			} else if (Static157.anInt3176 == 5) {
				Static380.method5128(local120);
			}
			local131 = Static80.anInt1679;
			local166 = Static8.anInt121;
			@Pc(278) int local278 = Static50.anInt906;
			@Pc(280) int local280 = Static127.anInt2604;
			@Pc(282) int local282 = Static362.anInt6155;
			@Pc(326) int local326;
			for (@Pc(284) int local284 = 0; local284 < 5; local284++) {
				if (Static65.aBooleanArray1[local284]) {
					local326 = (int) ((double) -Static335.anIntArray554[local284] + Math.random() * (double) (Static335.anIntArray554[local284] * 2 + 1) + Math.sin((double) Static397.anIntArray657[local284] * ((double) Static448.anIntArray680[local284] / 100.0D)) * (double) Static443.anIntArray727[local284]);
					if (local284 == 3) {
						Static362.anInt6155 = local326 + Static362.anInt6155 & 0x3FFF;
					}
					if (local284 == 0) {
						Static80.anInt1679 += local326;
					}
					if (local284 == 2) {
						Static50.anInt906 += local326;
					}
					if (local284 == 4) {
						Static127.anInt2604 += local326;
						if (Static127.anInt2604 < 1024) {
							Static127.anInt2604 = 1024;
						} else if (Static127.anInt2604 > 3072) {
							Static127.anInt2604 = 3072;
						}
					}
					if (local284 == 1) {
						Static8.anInt121 += local326;
					}
				}
			}
			if (Static80.anInt1679 < 0) {
				Static80.anInt1679 = 0;
			}
			if (Static80.anInt1679 > (Static54.anInt998 << 7) - 1) {
				Static80.anInt1679 = (Static54.anInt998 << 7) - 1;
			}
			if (Static50.anInt906 < 0) {
				Static50.anInt906 = 0;
			}
			if ((Static24.anInt401 << 7) - 1 < Static50.anInt906) {
				Static50.anInt906 = (Static24.anInt401 << 7) - 1;
			}
			Static319.method4377();
			Static92.method1713();
			Static412.aClass50_8.ba(local116, local118, local116 + local114, local120 + local118);
			Static412.aClass50_8.method5848();
			local326 = Static446.anInt7495;
			if (Static378.aClass230_1 == null) {
				Static412.aClass50_8.t(local326);
			} else {
				Static378.aClass230_1.method5133(Static412.aClass50_8, local116, Static127.anInt2604, local120, local326, local114, local118, Static362.anInt6155, Static352.anInt6038 << 3);
			}
			Static278.method4705();
			Static342.aClass34_4.YA(Static80.anInt1679, Static8.anInt121, Static50.anInt906, -Static127.anInt2604 & 0x3FFF, -Static362.anInt6155 & 0x3FFF, -Static242.anInt5735 & 0x3FFF);
			Static412.aClass50_8.SA(Static342.aClass34_4);
			Static412.aClass50_8.GA(local114 / 2 + local116, local118 + local120 / 2, Static139.anInt2875 << 1, Static139.anInt2875 << 1);
			Static91.method1692(Static139.anInt2875 << 1, local120 / 2 + local118, Static139.anInt2875 << 1, local114 / 2 + local116);
			Static339.method4548(Static50.anInt906, Static8.anInt121, Static80.anInt1679, -Static242.anInt5735 & 0x3FFF, -Static127.anInt2604 & 0x3FFF, -Static362.anInt6155 & 0x3FFF);
			@Pc(555) byte local555 = Static361.aClass85_Sub1_1.method2111(Static423.anInt7114) == 2 ? (byte) Static186.anInt3747 : 1;
			Static296.method4127(Static412.aClass50_8, Static400.anInt6752, Static29.anInt497, Static342.aClass34_4, Static80.anInt1679, Static8.anInt121, Static50.anInt906, Static255.aByteArrayArrayArray16, Static328.anIntArray701, Static372.anIntArray624, Static64.anIntArray96, Static314.anIntArray517, Static370.anIntArray619, Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 + 1, local555, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7, !Static361.aClass85_Sub1_1.aBoolean173);
			Static278.method4705();
			if (Static358.anInt6086 == 9) {
				Static319.method4376(local116, local114, local120, local118);
				Static92.method1712(local120, local116, local114, local118);
				Static299.method3756(local116, local114, local120, local118);
				Static422.method5552(local118, local116, local114, local120);
			}
			Static136.method2334();
			Static80.anInt1679 = local131;
			Static50.anInt906 = local278;
			Static362.anInt6155 = local282;
			Static8.anInt121 = local166;
			Static127.anInt2604 = local280;
			if (Static114.aBoolean142 && Static12.aClass103_1.method2595() == 0) {
				Static114.aBoolean142 = false;
			}
			if (Static114.aBoolean142) {
				Static412.aClass50_8.method5853(local118, local116, -16777216, local120, local114);
				Static77.method1475(false, Static114.aClass57_4, Static5.aClass182_1.method4155(Static191.anInt3842));
			}
		} else {
			Static412.aClass50_8.method5853(arg4, arg1, -16777216, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Lclient!mv;")
	public static Class56_Sub1 method3292() {
		Static266.anInt4718 = 0;
		return Static95.method1726();
	}
}
