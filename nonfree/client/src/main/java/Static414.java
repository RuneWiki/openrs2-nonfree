import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!um", name = "z", descriptor = "Lclient!d;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_2;

	@OriginalMember(owner = "client!um", name = "E", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_100 = new Class208(8, 3);

	@OriginalMember(owner = "client!um", name = "C", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_175 = new Class25(99, 7);

	@OriginalMember(owner = "client!um", name = "D", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!um", name = "G", descriptor = "I")
	public static final int anInt7109 = 1337;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(FFIIFIIZ)[F")
	public static float[] method5685(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) float[] local11 = new float[9];
		@Pc(14) float[] local14 = new float[9];
		@Pc(22) float local22 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local11[8] = local22;
		local11[0] = local22;
		local11[6] = -local30;
		local11[1] = 0.0F;
		local11[4] = 1.0F;
		local11[2] = local30;
		local11[3] = 0.0F;
		local11[7] = 0.0F;
		local11[5] = 0.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg2 / 32767.0F;
		@Pc(87) float local87 = 1.0F - local83;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
		if (local110 == 0.0F && local83 == 0.0F) {
			local14 = local11;
		} else {
			if (local110 != 0.0F) {
				local76 = (float) -arg6 / local110;
				local78 = (float) arg5 / local110;
			}
			local74[0] = local87 * local76 * local76 + local83;
			local74[2] = local78 * local76 * local87;
			local74[5] = local76 * local98;
			local74[6] = local87 * local78 * local76;
			local74[1] = local98 * local78;
			local74[7] = local98 * -local76;
			local74[3] = local98 * -local78;
			local74[8] = local83 + local87 * local78 * local78;
			local74[4] = local83;
			local14[0] = local74[6] * local11[2] + local11[0] * local74[0] + local11[1] * local74[3];
			local14[1] = local74[7] * local11[2] + local74[1] * local11[0] + local74[4] * local11[1];
			local14[3] = local74[0] * local11[3] + local74[3] * local11[4] + local11[5] * local74[6];
			local14[2] = local74[8] * local11[2] + local74[5] * local11[1] + local11[0] * local74[2];
			local14[4] = local74[7] * local11[5] + local74[4] * local11[4] + local74[1] * local11[3];
			local14[6] = local74[3] * local11[7] + local74[0] * local11[6] + local11[8] * local74[6];
			local14[5] = local11[5] * local74[8] + local11[3] * local74[2] + local74[5] * local11[4];
			local14[7] = local74[4] * local11[7] + local74[1] * local11[6] + local11[8] * local74[7];
			local14[8] = local74[8] * local11[8] + local11[6] * local74[2] + local74[5] * local11[7];
		}
		local14[8] *= arg0;
		local14[3] *= arg1;
		local14[7] *= arg0;
		local14[5] *= arg1;
		local14[2] *= arg4;
		local14[0] *= arg4;
		local14[4] *= arg1;
		local14[6] *= arg0;
		local14[1] *= arg4;
		return local14;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	public static void method5687() {
		Static164.method2403(Static145.aClass208_33);
		Static389.aClass2_Sub17_Sub1_2.method6172(Static235.method3217());
		Static389.aClass2_Sub17_Sub1_2.method6130(Static49.anInt789);
		Static389.aClass2_Sub17_Sub1_2.method6130(Static344.anInt6105);
		Static389.aClass2_Sub17_Sub1_2.method6172(Static434.aClass165_Sub1_1.anInt4201);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public static void method5689() {
		Static413.method5674(false);
		Static407.anInt7041 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static246.aByteArrayArray15.length; local16++) {
			if (Static59.anIntArray532[local16] != -1 && Static246.aByteArrayArray15[local16] == null) {
				Static246.aByteArrayArray15[local16] = Static11.aClass171_2.method3658(Static59.anIntArray532[local16], 0);
				if (Static246.aByteArrayArray15[local16] == null) {
					local14 = false;
					Static407.anInt7041++;
				}
			}
			if (Static437.anIntArray600[local16] != -1 && Static388.aByteArrayArray19[local16] == null) {
				Static388.aByteArrayArray19[local16] = Static11.aClass171_2.method3665(Static83.anIntArrayArray38[local16], 0, Static437.anIntArray600[local16]);
				if (Static388.aByteArrayArray19[local16] == null) {
					Static407.anInt7041++;
					local14 = false;
				}
			}
			if (anIntArray577[local16] != -1 && Static428.aByteArrayArray21[local16] == null) {
				Static428.aByteArrayArray21[local16] = Static11.aClass171_2.method3658(anIntArray577[local16], 0);
				if (Static428.aByteArrayArray21[local16] == null) {
					local14 = false;
					Static407.anInt7041++;
				}
			}
			if (Static265.anIntArray391[local16] != -1 && Static222.aByteArrayArray12[local16] == null) {
				Static222.aByteArrayArray12[local16] = Static11.aClass171_2.method3658(Static265.anIntArray391[local16], 0);
				if (Static222.aByteArrayArray12[local16] == null) {
					local14 = false;
					Static407.anInt7041++;
				}
			}
			if (Static423.anIntArray585 != null && Static328.aByteArrayArray18[local16] == null && Static423.anIntArray585[local16] != -1) {
				Static328.aByteArrayArray18[local16] = Static11.aClass171_2.method3665(Static83.anIntArrayArray38[local16], 0, Static423.anIntArray585[local16]);
				if (Static328.aByteArrayArray18[local16] == null) {
					Static407.anInt7041++;
					local14 = false;
				}
			}
		}
		if (Static115.aClass176_2 == null) {
			if (Static431.aClass2_Sub1_Sub14_3 == null || !Static340.aClass171_73.method3661(Static431.aClass2_Sub1_Sub14_3.aString57 + "_staticelements")) {
				Static115.aClass176_2 = new Class176(0);
			} else if (Static340.aClass171_73.method3655(Static431.aClass2_Sub1_Sub14_3.aString57 + "_staticelements")) {
				Static115.aClass176_2 = Static280.method3978(Static431.aClass2_Sub1_Sub14_3.aString57 + "_staticelements", Static183.aBoolean205, Static340.aClass171_73);
			} else {
				Static407.anInt7041++;
				local14 = false;
			}
		}
		if (!local14) {
			Static211.anInt3607 = 1;
			return;
		}
		Static191.anInt3353 = 0;
		local14 = true;
		@Pc(266) int local266;
		@Pc(277) int local277;
		for (@Pc(247) int local247 = 0; local247 < Static246.aByteArrayArray15.length; local247++) {
			@Pc(253) byte[] local253 = Static388.aByteArrayArray19[local247];
			if (local253 != null) {
				local266 = (Static450.anIntArray635[local247] >> 8) * 64 - Static386.anInt7205;
				local277 = (Static450.anIntArray635[local247] & 0xFF) * 64 - Static153.anInt2798;
				if (Static409.anInt701 != 0) {
					local266 = 10;
					local277 = 10;
				}
				local14 &= Static390.method5420(Static234.anInt3949, local266, Static371.anInt6492, local277, local253);
			}
			local253 = Static222.aByteArrayArray12[local247];
			if (local253 != null) {
				local266 = (Static450.anIntArray635[local247] >> 8) * 64 - Static386.anInt7205;
				local277 = (Static450.anIntArray635[local247] & 0xFF) * 64 - Static153.anInt2798;
				if (Static409.anInt701 != 0) {
					local266 = 10;
					local277 = 10;
				}
				local14 &= Static390.method5420(Static234.anInt3949, local266, Static371.anInt6492, local277, local253);
			}
		}
		if (!local14) {
			Static211.anInt3607 = 2;
			return;
		}
		if (Static211.anInt3607 != 0) {
			Static1.method26(true, Static420.aClass231_118.method5261(Static80.anInt6195) + "<br>(100%)", Static11.aClass14_1);
		}
		Static230.method3117();
		Static262.method3688();
		@Pc(378) boolean local378 = false;
		if (Static257.aClass75_8.method5961() && Static434.aClass165_Sub1_1.aBoolean307) {
			for (local266 = 0; local266 < Static246.aByteArrayArray15.length; local266++) {
				if (Static222.aByteArrayArray12[local266] != null || Static428.aByteArrayArray21[local266] != null) {
					local378 = true;
					break;
				}
			}
		}
		if (Static434.aClass165_Sub1_1.aBoolean305) {
			local266 = Static27.anIntArray46[Static16.anInt5171];
		} else {
			local266 = Static276.anIntArray417[Static16.anInt5171];
		}
		if (Static257.aClass75_8.method5951()) {
			local266++;
		}
		Static180.method2618(Static234.anInt3949, Static371.anInt6492, local266, local378, Static257.aClass75_8.method5994() > 0);
		for (local277 = 0; local277 < 4; local277++) {
			Static89.aClass225Array2[local277].method5185();
		}
		Static389.method5410();
		Static214.method3027(false);
		Static114.method1874();
		Static454.aClass247_1 = null;
		Static230.method3117();
		System.gc();
		Static413.method5674(true);
		Static22.method401();
		Static135.anInt1508 = Static434.aClass165_Sub1_1.method3392(Static404.anInt2752);
		Static435.aBoolean499 = Static434.aClass165_Sub1_1.aBoolean307;
		Static426.aBoolean483 = Static170.anInt3068 >= 96;
		Static343.aBoolean190 = Static434.aClass165_Sub1_1.method3390(Static404.anInt2752);
		Static87.aBoolean88 = !Static434.aClass165_Sub1_1.aBoolean295;
		Static122.anInt2063 = Static434.aClass165_Sub1_1.method3397(Static404.anInt2752) ? -1 : Static184.anInt3250;
		Static346.aBoolean425 = Static434.aClass165_Sub1_1.aBoolean297;
		Static297.aBoolean372 = Static404.anInt2752 == 1 || Static434.aClass165_Sub1_1.aBoolean301;
		Static357.aClass107_Sub1_4 = new Class107_Sub1(4, Static234.anInt3949, Static371.anInt6492, false);
		if (Static409.anInt701 == 0) {
			Static384.method5273(Static246.aByteArrayArray15, Static357.aClass107_Sub1_4);
		} else {
			Static48.method743(Static246.aByteArrayArray15, Static357.aClass107_Sub1_4);
		}
		Static319.method4541(Static234.anInt3949 >> 4, Static371.anInt6492 >> 4);
		Static104.method1545();
		if (local378) {
			Static368.method6267(true);
			Static133.aClass107_Sub1_3 = new Class107_Sub1(1, Static234.anInt3949, Static371.anInt6492, true);
			if (Static409.anInt701 == 0) {
				Static384.method5273(Static428.aByteArrayArray21, Static133.aClass107_Sub1_3);
				Static413.method5674(true);
			} else {
				Static48.method743(Static428.aByteArrayArray21, Static133.aClass107_Sub1_3);
				Static413.method5674(true);
			}
			Static133.aClass107_Sub1_3.method2270(Static357.aClass107_Sub1_4.anIntArrayArrayArray6[0]);
			Static133.aClass107_Sub1_3.method2275(Static257.aClass75_8, null, null);
			Static368.method6267(false);
		}
		Static357.aClass107_Sub1_4.method2275(Static257.aClass75_8, Static89.aClass225Array2, local378 ? Static133.aClass107_Sub1_3.anIntArrayArrayArray6 : null);
		if (Static409.anInt701 == 0) {
			Static413.method5674(true);
			Static23.method5676(Static357.aClass107_Sub1_4, Static388.aByteArrayArray19);
			if (Static328.aByteArrayArray18 != null) {
				Static457.method6201();
			}
		} else {
			Static413.method5674(true);
			Static364.method5125(Static388.aByteArrayArray19, Static357.aClass107_Sub1_4);
		}
		Static262.method3688();
		Static413.method5674(true);
		Static357.aClass107_Sub1_4.method2273(local378 ? Static46.aClass22Array1[0] : null, null, Static257.aClass75_8);
		Static357.aClass107_Sub1_4.method2282(Static257.aClass75_8);
		Static413.method5674(true);
		if (local378) {
			Static368.method6267(true);
			Static413.method5674(true);
			if (Static409.anInt701 == 0) {
				Static23.method5676(Static133.aClass107_Sub1_3, Static222.aByteArrayArray12);
			} else {
				Static364.method5125(Static222.aByteArrayArray12, Static133.aClass107_Sub1_3);
			}
			Static262.method3688();
			Static413.method5674(true);
			Static133.aClass107_Sub1_3.method2273(null, Static114.aClass22Array2[0], Static257.aClass75_8);
			Static133.aClass107_Sub1_3.method2282(Static257.aClass75_8);
			Static413.method5674(true);
			Static368.method6267(false);
		}
		Static368.method6270();
		@Pc(722) int local722 = Static357.aClass107_Sub1_4.anInt2758;
		if (Static204.anInt3498 < local722) {
			local722 = Static204.anInt3498;
		}
		if (Static204.anInt3498 - 1 > local722) {
			local722 = Static204.anInt3498 - 1;
		}
		if (Static434.aClass165_Sub1_1.method3397(Static404.anInt2752)) {
			Static196.method2795(0);
		} else {
			Static196.method2795(local722);
		}
		@Pc(759) int local759;
		@Pc(763) int local763;
		for (@Pc(755) int local755 = 0; local755 < 4; local755++) {
			for (local759 = 0; local759 < Static234.anInt3949; local759++) {
				for (local763 = 0; local763 < Static371.anInt6492; local763++) {
					Static133.method4452(local763, local755, local759);
				}
			}
		}
		Static120.method1949();
		Static230.method3117();
		Static421.method5769();
		Static262.method3688();
		Static105.aBoolean100 = false;
		Static99.method1442();
		if (Static393.aFrame2 != null && Static339.aClass66_2 != null && Static433.anInt7309 == 10) {
			Static164.method2403(Static313.aClass208_73);
			Static389.aClass2_Sub17_Sub1_2.method6170(1057001181);
		}
		if (Static409.anInt701 == 0) {
			local759 = (Static269.anInt2101 - (Static234.anInt3949 >> 4)) / 8;
			local763 = ((Static234.anInt3949 >> 4) + Static269.anInt2101) / 8;
			@Pc(852) int local852 = (Static163.anInt2919 - (Static371.anInt6492 >> 4)) / 8;
			@Pc(860) int local860 = ((Static371.anInt6492 >> 4) + Static163.anInt2919) / 8;
			for (@Pc(864) int local864 = local759 - 1; local864 <= local763 + 1; local864++) {
				for (@Pc(870) int local870 = local852 - 1; local870 <= local860 + 1; local870++) {
					if (local864 < local759 || local864 > local763 || local870 < local852 || local870 > local860) {
						Static11.aClass171_2.method3674("m" + local864 + "_" + local870);
						Static11.aClass171_2.method3674("l" + local864 + "_" + local870);
					}
				}
			}
		}
		if (Static433.anInt7309 == 3) {
			Static274.method3920(2);
		} else if (Static433.anInt7309 == 7) {
			Static274.method3920(6);
		} else {
			Static274.method3920(9);
			if (Static339.aClass66_2 != null) {
				Static164.method2403(Static2.aClass208_1);
			}
		}
		Static331.method4730();
		Static230.method3117();
		Static87.method1363();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V")
	public static void method5690(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg0, 12);
		local8.method2578();
	}
}
