import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!km;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public static int anInt6017;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "I")
	public static int anInt6018;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "I")
	public static int anInt6019;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!sg;")
	public static Class211 aClass211_2;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "[I")
	public static int[] anIntArray404;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V", line = 5)
	public static void method5482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static293.method5414(1, arg0);
		local12.method2313();
		local12.anInt2286 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIIIIIIII)Z", line = 19)
	public static boolean method5483(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0];
		@Pc(18) int local18 = Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0];
		if (local13 < 0 || Class241.anInt7020 <= local13 || local18 < 0 || OutputStream_Sub1.anInt4442 <= local18) {
			return false;
		} else if (arg5 >= 0 && arg5 < Class241.anInt7020 && arg2 >= 0 && arg2 < OutputStream_Sub1.anInt4442) {
			@Pc(88) int local88 = Static132.method2656(arg0, Class2_Sub2_Sub5.anIntArray99, arg6, arg1, arg7, arg3, Class2_Sub3_Sub18.aClass46Array1[Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78], local13, arg4, arg5, Class47.anIntArray105, Static17.aClass11_Sub5_Sub2_Sub1_3.method4329(), arg2, local18);
			if (local88 < 1) {
				return false;
			}
			Class130.anInt6538 = Class2_Sub2_Sub5.anIntArray99[local88 - 1];
			Class2_Sub3_Sub31.anInt5832 = Class47.anIntArray105[local88 - 1];
			Class2_Sub3_Sub38.aBoolean474 = false;
			Static334.method6010();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 52)
	public static void method5484() {
		Static151.method2974(false);
		Class101.anInt2691 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static99.aByteArrayArray6.length; local14++) {
			if (Static206.anIntArray314[local14] != -1 && Static99.aByteArrayArray6[local14] == null) {
				Static99.aByteArrayArray6[local14] = Static265.aClass197_70.method5090(0, Static206.anIntArray314[local14]);
				if (Static99.aByteArrayArray6[local14] == null) {
					local12 = false;
					Class101.anInt2691++;
				}
			}
			if (Static349.anIntArray480[local14] != -1 && Static78.aByteArrayArray5[local14] == null) {
				Static78.aByteArrayArray5[local14] = Static265.aClass197_70.method5081(Static254.anIntArrayArray43[local14], 0, Static349.anIntArray480[local14]);
				if (Static78.aByteArrayArray5[local14] == null) {
					local12 = false;
					Class101.anInt2691++;
				}
			}
			if (Static48.anIntArray98[local14] != -1 && Static215.aByteArrayArray9[local14] == null) {
				Static215.aByteArrayArray9[local14] = Static265.aClass197_70.method5090(0, Static48.anIntArray98[local14]);
				if (Static215.aByteArrayArray9[local14] == null) {
					local12 = false;
					Class101.anInt2691++;
				}
			}
			if (Static58.anIntArray155[local14] != -1 && Static248.aByteArrayArray15[local14] == null) {
				Static248.aByteArrayArray15[local14] = Static265.aClass197_70.method5090(0, Static58.anIntArray155[local14]);
				if (Static248.aByteArrayArray15[local14] == null) {
					Class101.anInt2691++;
					local12 = false;
				}
			}
			if (Static177.anIntArray208 != null && Static196.aByteArrayArray7[local14] == null && Static177.anIntArray208[local14] != -1) {
				Static196.aByteArrayArray7[local14] = Static265.aClass197_70.method5081(Static254.anIntArrayArray43[local14], 0, Static177.anIntArray208[local14]);
				if (Static196.aByteArrayArray7[local14] == null) {
					Class101.anInt2691++;
					local12 = false;
				}
			}
		}
		if (Static33.aClass103_3 == null) {
			if (Static85.aClass2_Sub2_Sub17_1 == null || !Static363.aClass197_66.method5102(Static85.aClass2_Sub2_Sub17_1.aString67 + "_staticelements")) {
				Static33.aClass103_3 = new Class103(0);
			} else if (Static363.aClass197_66.method5073(Static85.aClass2_Sub2_Sub17_1.aString67 + "_staticelements")) {
				Static33.aClass103_3 = Static294.method5553(Static363.aClass197_66, Static85.aClass2_Sub2_Sub17_1.aString67 + "_staticelements", Class144.aBoolean241);
			} else {
				Class101.anInt2691++;
				local12 = false;
			}
		}
		if (!local12) {
			Class167.anInt4498 = 1;
			return;
		}
		local12 = true;
		Class206.anInt5730 = 0;
		@Pc(268) int local268;
		@Pc(279) int local279;
		for (@Pc(249) int local249 = 0; local249 < Static99.aByteArrayArray6.length; local249++) {
			@Pc(255) byte[] local255 = Static78.aByteArrayArray5[local249];
			if (local255 != null) {
				local268 = (Static268.anIntArray372[local249] >> 8) * 64 - Static154.anInt3136;
				local279 = (Static268.anIntArray372[local249] & 0xFF) * 64 - Static139.anInt2716;
				if (Class154.aBoolean252) {
					local268 = 10;
					local279 = 10;
				}
				local12 &= Static180.method3512(local279, local268, local255, OutputStream_Sub1.anInt4442, Class241.anInt7020);
			}
			local255 = Static248.aByteArrayArray15[local249];
			if (local255 != null) {
				local268 = (Static268.anIntArray372[local249] >> 8) * 64 - Static154.anInt3136;
				local279 = (Static268.anIntArray372[local249] & 0xFF) * 64 - Static139.anInt2716;
				if (Class154.aBoolean252) {
					local279 = 10;
					local268 = 10;
				}
				local12 &= Static180.method3512(local279, local268, local255, OutputStream_Sub1.anInt4442, Class241.anInt7020);
			}
		}
		if (!local12) {
			Class167.anInt4498 = 2;
			return;
		}
		if (Class167.anInt4498 != 0) {
			Static326.method5858(Static253.aClass130_4, true, Class11_Sub5_Sub3.aClass79_102.method2269(Class197.anInt5569) + "<br>(100%)");
		}
		Static36.method1135();
		Static197.method3722();
		@Pc(375) boolean local375 = false;
		if (Static177.aClass19_8.method2807() && Static203.aClass177_Sub1_2.aBoolean361) {
			for (local268 = 0; local268 < Static99.aByteArrayArray6.length; local268++) {
				if (Static248.aByteArrayArray15[local268] != null || Static215.aByteArrayArray9[local268] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static203.aClass177_Sub1_2.aBoolean348) {
			local268 = Class2_Sub3_Sub25.anIntArray351[Class28.anInt752];
		} else {
			local268 = Class47.anIntArray106[Class28.anInt752];
		}
		if (Static177.aClass19_8.method2890()) {
			local268++;
		}
		Static329.method1383(Class241.anInt7020, OutputStream_Sub1.anInt4442, local268, local375, Static177.aClass19_8.method2888() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Class2_Sub3_Sub18.aClass46Array1[local279].method1628();
		}
		Static262.method4888();
		Static222.method4153(false);
		Static20.method560();
		Static36.method1135();
		System.gc();
		Static151.method2974(true);
		Static350.method6282();
		Class167.aBoolean312 = Static203.aClass177_Sub1_2.aBoolean364;
		Class2_Sub3_Sub11.aBoolean162 = Static203.aClass177_Sub1_2.aBoolean361;
		Class3.aBoolean8 = Class208.anInt5790 >= 96;
		Class2_Sub2_Sub4.anInt1299 = Static203.aClass177_Sub1_2.anInt4876;
		Class2_Sub3_Sub15.aBoolean190 = !Static203.aClass177_Sub1_2.aBoolean355;
		Class2_Sub19.anInt2908 = Static203.aClass177_Sub1_2.method4496(Class2_Sub10.anInt1760) ? -1 : Class2_Sub6.anInt1114;
		RuntimeException_Sub1.aBoolean179 = Class2_Sub10.anInt1760 == 1 || Static203.aClass177_Sub1_2.aBoolean357;
		Static177.aClass29_Sub1_63 = new Class29_Sub1(4, Class241.anInt7020, OutputStream_Sub1.anInt4442, false);
		if (!Class154.aBoolean252) {
			Static165.method3347(Static177.aClass29_Sub1_63, Static99.aByteArrayArray6);
		}
		if (Class154.aBoolean252) {
			Static113.method2383(Static99.aByteArrayArray6, Static177.aClass29_Sub1_63);
		}
		Static182.method3560(Class241.anInt7020 >> 4, OutputStream_Sub1.anInt4442 >> 4);
		Static52.method1613();
		if (local375) {
			Static318.method5768(true);
			Static7.aClass29_Sub1_120 = new Class29_Sub1(1, Class241.anInt7020, OutputStream_Sub1.anInt4442, true);
			if (!Class154.aBoolean252) {
				Static165.method3347(Static7.aClass29_Sub1_120, Static215.aByteArrayArray9);
				Static151.method2974(true);
			}
			if (Class154.aBoolean252) {
				Static113.method2383(Static215.aByteArrayArray9, Static7.aClass29_Sub1_120);
				Static151.method2974(true);
			}
			Static7.aClass29_Sub1_120.method1097(Static177.aClass29_Sub1_63.anIntArrayArrayArray8[0]);
			Static7.aClass29_Sub1_120.method1085(null, null, Static177.aClass19_8);
			Static318.method5768(false);
		}
		Static177.aClass29_Sub1_63.method1085(local375 ? Static7.aClass29_Sub1_120.anIntArrayArrayArray8 : null, Class2_Sub3_Sub18.aClass46Array1, Static177.aClass19_8);
		if (!Class154.aBoolean252) {
			Static151.method2974(true);
			Static159.method3232(Static177.aClass29_Sub1_63, Static78.aByteArrayArray5);
			if (Static196.aByteArrayArray7 != null) {
				Static1.method2();
			}
		}
		if (Class154.aBoolean252) {
			Static151.method2974(true);
			Static61.method1739(Static177.aClass29_Sub1_63, Static78.aByteArrayArray5);
		}
		Static197.method3722();
		Static151.method2974(true);
		Static177.aClass29_Sub1_63.method1093(local375 ? Static174.aClass6Array2[0] : null, Static177.aClass19_8, null);
		Static177.aClass29_Sub1_63.method1104(Static177.aClass19_8);
		Static151.method2974(true);
		if (local375) {
			Static318.method5768(true);
			Static151.method2974(true);
			if (!Class154.aBoolean252) {
				Static159.method3232(Static7.aClass29_Sub1_120, Static248.aByteArrayArray15);
			}
			if (Class154.aBoolean252) {
				Static61.method1739(Static7.aClass29_Sub1_120, Static248.aByteArrayArray15);
			}
			Static197.method3722();
			Static151.method2974(true);
			Static7.aClass29_Sub1_120.method1093(null, Static177.aClass19_8, Static307.aClass6Array3[0]);
			Static7.aClass29_Sub1_120.method1104(Static177.aClass19_8);
			Static151.method2974(true);
			Static318.method5768(false);
		}
		Static272.method5095();
		@Pc(692) int local692 = Static177.aClass29_Sub1_63.anInt921;
		if (Static330.anInt6573 < local692) {
			local692 = Static330.anInt6573;
		}
		if (Static330.anInt6573 - 1 > local692) {
			local692 = Static330.anInt6573 - 1;
		}
		if (Static203.aClass177_Sub1_2.method4496(Class2_Sub10.anInt1760)) {
			Static73.method1858(0);
		} else {
			Static73.method1858(local692);
		}
		@Pc(731) int local731;
		@Pc(735) int local735;
		for (@Pc(727) int local727 = 0; local727 < 4; local727++) {
			for (local731 = 0; local731 < Class241.anInt7020; local731++) {
				for (local735 = 0; local735 < OutputStream_Sub1.anInt4442; local735++) {
					Static155.method3155(local731, local727, local735);
				}
			}
		}
		Static210.method3983();
		Static36.method1135();
		Static135.method2692();
		Static197.method3722();
		Class2_Sub2_Sub1.aBoolean5 = false;
		Static47.method1532();
		if (Static207.aFrame1 != null && Static312.aClass111_4 != null && Class2_Sub3_Sub35.anInt6430 == 25) {
			Static85.method1962(Class27.aClass145_28);
			Class14.aClass2_Sub4_Sub2_4.method4814(1057001181);
		}
		if (!Class154.aBoolean252) {
			local731 = (Static98.anInt2184 - (Class241.anInt7020 >> 4)) / 8;
			local735 = ((Class241.anInt7020 >> 4) + Static98.anInt2184) / 8;
			@Pc(811) int local811 = (Static9.anInt212 - (OutputStream_Sub1.anInt4442 >> 4)) / 8;
			@Pc(819) int local819 = ((OutputStream_Sub1.anInt4442 >> 4) + Static9.anInt212) / 8;
			for (@Pc(823) int local823 = local731 - 1; local823 <= local735 + 1; local823++) {
				for (@Pc(829) int local829 = local811 - 1; local829 <= local819 + 1; local829++) {
					if (local823 < local731 || local823 > local735 || local829 < local811 || local819 < local829) {
						Static265.aClass197_70.method5077("m" + local823 + "_" + local829);
						Static265.aClass197_70.method5077("l" + local823 + "_" + local829);
					}
				}
			}
		}
		if (Class2_Sub3_Sub35.anInt6430 == 28) {
			Static313.method5706(10);
		} else {
			Static313.method5706(30);
			if (Static312.aClass111_4 != null) {
				Static85.method1962(Class11_Sub3.aClass145_230);
			}
		}
		Static233.method4370();
		Static36.method1135();
		Static133.method2664();
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 532)
	public static void method5486() {
		if (Static114.aClass127_4 != Class12_Sub4.aClass127_7) {
			try {
				Static391.method4629(Static135.aClient1, "tbrefresh");
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
