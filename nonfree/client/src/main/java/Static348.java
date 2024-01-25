import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "Lclient!uf;")
	public static Class283 aClass283_3;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
	public static int anInt6407 = 0;

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "Lclient!ica;")
	public static final Class127 aClass127_35 = new Class127(8);

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_189 = new Class202("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;Lclient!dda;BZ)Lclient!fe;")
	public static Class86 method5483(@OriginalArg(0) String arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method1608(arg0);
		if (local10 == -1) {
			return new Class86(0);
		}
		@Pc(29) int[] local29 = arg1.method1595(local10);
		@Pc(35) Class86 local35 = new Class86(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt2511 > local37) {
				@Pc(53) Class2_Sub29 local53 = new Class2_Sub29(arg1.method1616(local29[local39++], local10));
				@Pc(57) int local57 = local53.method5198();
				@Pc(61) int local61 = local53.method5229();
				@Pc(65) int local65 = local53.method5170();
				if (!arg2 && local65 == 1) {
					local35.anInt2511--;
				} else {
					local35.anIntArray321[local37] = local57;
					local35.anIntArray320[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILclient!ps;)Ljava/lang/String;")
	public static String method5484(@OriginalArg(2) Class2_Sub29 arg0) {
		try {
			@Pc(15) int local15 = arg0.method5182();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local15];
			arg0.anInt6132 += Static505.aClass190_1.method4724(arg0.anInt6132, 0, arg0.aByteArray96, local23, local15);
			return Static226.method3566(local15, 0, local23);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V")
	public static void method5486() {
		Static209.method3334(false);
		Static261.anInt4671 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static263.aByteArrayArray16.length; local14++) {
			if (Static390.anIntArray573[local14] != -1 && Static263.aByteArrayArray16[local14] == null) {
				Static263.aByteArrayArray16[local14] = Static360.aClass53_151.method1616(0, Static390.anIntArray573[local14]);
				if (Static263.aByteArrayArray16[local14] == null) {
					local12 = false;
					Static261.anInt4671++;
				}
			}
			if (Static215.anIntArray621[local14] != -1 && Static138.aByteArrayArray13[local14] == null) {
				Static138.aByteArrayArray13[local14] = Static360.aClass53_151.method1603(Static403.anIntArrayArray67[local14], Static215.anIntArray621[local14], 0);
				if (Static138.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static261.anInt4671++;
				}
			}
			if (Static511.anIntArray679[local14] != -1 && Static357.aByteArrayArray22[local14] == null) {
				Static357.aByteArrayArray22[local14] = Static360.aClass53_151.method1616(0, Static511.anIntArray679[local14]);
				if (Static357.aByteArrayArray22[local14] == null) {
					local12 = false;
					Static261.anInt4671++;
				}
			}
			if (Static475.anIntArray649[local14] != -1 && Static331.aByteArrayArray21[local14] == null) {
				Static331.aByteArrayArray21[local14] = Static360.aClass53_151.method1616(0, Static475.anIntArray649[local14]);
				if (Static331.aByteArrayArray21[local14] == null) {
					Static261.anInt4671++;
					local12 = false;
				}
			}
			if (Static475.anIntArray650 != null && Static46.aByteArrayArray3[local14] == null && Static475.anIntArray650[local14] != -1) {
				Static46.aByteArrayArray3[local14] = Static360.aClass53_151.method1603(Static403.anIntArrayArray67[local14], Static475.anIntArray650[local14], 0);
				if (Static46.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static261.anInt4671++;
				}
			}
		}
		if (Static105.aClass86_3 == null) {
			if (Static356.aClass2_Sub13_Sub16_4 == null || !Static420.aClass53_119.method1593(Static356.aClass2_Sub13_Sub16_4.aString175 + "_staticelements")) {
				Static105.aClass86_3 = new Class86(0);
			} else if (Static420.aClass53_119.method1606(Static356.aClass2_Sub13_Sub16_4.aString175 + "_staticelements")) {
				Static105.aClass86_3 = method5483(Static356.aClass2_Sub13_Sub16_4.aString175 + "_staticelements", Static420.aClass53_119, Static165.aBoolean245);
			} else {
				Static261.anInt4671++;
				local12 = false;
			}
		}
		if (!local12) {
			Static182.anInt3354 = 1;
			return;
		}
		local12 = true;
		Static181.anInt3350 = 0;
		@Pc(267) int local267;
		@Pc(278) int local278;
		for (@Pc(249) int local249 = 0; local249 < Static263.aByteArrayArray16.length; local249++) {
			@Pc(255) byte[] local255 = Static138.aByteArrayArray13[local249];
			if (local255 != null) {
				local267 = (Static444.anIntArray613[local249] >> 8) * 64 - Static238.anInt4280;
				local278 = (Static444.anIntArray613[local249] & 0xFF) * 64 - Static371.anInt6936;
				if (Static425.anInt6885 != 0) {
					local278 = 10;
					local267 = 10;
				}
				local12 &= Static38.method753(local255, Static363.anInt1158, Static511.anInt8889, local267, local278);
			}
			local255 = Static331.aByteArrayArray21[local249];
			if (local255 != null) {
				local267 = (Static444.anIntArray613[local249] >> 8) * 64 - Static238.anInt4280;
				local278 = (Static444.anIntArray613[local249] & 0xFF) * 64 - Static371.anInt6936;
				if (Static425.anInt6885 != 0) {
					local267 = 10;
					local278 = 10;
				}
				local12 &= Static38.method753(local255, Static363.anInt1158, Static511.anInt8889, local267, local278);
			}
		}
		if (!local12) {
			Static182.anInt3354 = 2;
			return;
		}
		if (Static182.anInt3354 != 0) {
			Static263.method4275(Static477.aClass47_4, true, Static290.aClass202_161.method5139(Static172.anInt6352) + "<br>(100%)");
		}
		Static491.method6549();
		Static209.method3332();
		@Pc(384) boolean local384 = false;
		if (Static103.aClass39_3.method6073() && Static281.aClass2_Sub19_Sub1_1.aBoolean194) {
			for (local267 = 0; local267 < Static263.aByteArrayArray16.length; local267++) {
				if (Static331.aByteArrayArray21[local267] != null || Static357.aByteArrayArray22[local267] != null) {
					local384 = true;
					break;
				}
			}
		}
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean181) {
			local267 = Static471.anIntArray647[Static257.anInt4643];
		} else {
			local267 = Static391.anIntArray574[Static257.anInt4643];
		}
		if (Static103.aClass39_3.method6082()) {
			local267++;
		}
		Static11.method3918(Static363.anInt1158, Static511.anInt8889, local267, local384, Static103.aClass39_3.method6053() > 0);
		for (local278 = 0; local278 < 4; local278++) {
			Static207.aClass99Array1[local278].method2648();
		}
		Static383.method5989();
		Static195.method3163(false);
		Static501.method7360();
		Static26.aClass191_1 = null;
		Static116.aBoolean205 = false;
		Static491.method6549();
		System.gc();
		Static209.method3334(true);
		Static97.method1879();
		Static438.anInt7981 = Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923);
		Static505.aBoolean640 = Static281.aClass2_Sub19_Sub1_1.aBoolean194;
		Static426.aBoolean579 = Static78.anInt1651 >= 96;
		Static136.aBoolean215 = Static281.aClass2_Sub19_Sub1_1.method2134(Static266.anInt4923);
		Static502.aBoolean637 = !Static281.aClass2_Sub19_Sub1_1.aBoolean189;
		Static224.anInt4044 = Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923) ? -1 : anInt6407;
		Static177.aBoolean261 = Static360.method7738(Static266.anInt4923) || Static281.aClass2_Sub19_Sub1_1.aBoolean191;
		Static118.aBoolean206 = Static281.aClass2_Sub19_Sub1_1.aBoolean179;
		Static290.aClass200_Sub1_2 = new Class200_Sub1(4, Static363.anInt1158, Static511.anInt8889, false);
		if (Static425.anInt6885 == 0) {
			Static28.method620(Static290.aClass200_Sub1_2, Static263.aByteArrayArray16);
		} else {
			Static6.method310(Static263.aByteArrayArray16, Static290.aClass200_Sub1_2);
		}
		Static101.method7093(Static363.anInt1158 >> 4, Static511.anInt8889 >> 4);
		Static55.method1020();
		if (local384) {
			Static202.method3263(true);
			Static200.aClass200_Sub1_1 = new Class200_Sub1(1, Static363.anInt1158, Static511.anInt8889, true);
			if (Static425.anInt6885 == 0) {
				Static28.method620(Static200.aClass200_Sub1_1, Static357.aByteArrayArray22);
				Static209.method3334(true);
			} else {
				Static6.method310(Static357.aByteArrayArray22, Static200.aClass200_Sub1_1);
				Static209.method3334(true);
			}
			Static200.aClass200_Sub1_1.method7397(Static290.aClass200_Sub1_2.anIntArrayArrayArray22[0]);
			Static200.aClass200_Sub1_1.method7399(Static103.aClass39_3, null, null);
			Static202.method3263(false);
		}
		Static290.aClass200_Sub1_2.method7399(Static103.aClass39_3, Static207.aClass99Array1, local384 ? Static200.aClass200_Sub1_1.anIntArrayArrayArray22 : null);
		if (Static425.anInt6885 == 0) {
			Static209.method3334(true);
			Static177.method2964(Static138.aByteArrayArray13, Static290.aClass200_Sub1_2);
			if (Static46.aByteArrayArray3 != null) {
				Static405.method6387();
			}
		} else {
			Static209.method3334(true);
			Static489.method7255(Static138.aByteArrayArray13, Static290.aClass200_Sub1_2);
		}
		Static209.method3332();
		if (Static78.anInt1651 < 96) {
			Static386.method6005();
		}
		Static209.method3334(true);
		Static290.aClass200_Sub1_2.method7403(null, Static103.aClass39_3, local384 ? Static427.aClass75Array2[0] : null);
		Static290.aClass200_Sub1_2.method7414(Static103.aClass39_3);
		Static209.method3334(true);
		if (local384) {
			Static202.method3263(true);
			Static209.method3334(true);
			if (Static425.anInt6885 == 0) {
				Static177.method2964(Static331.aByteArrayArray21, Static200.aClass200_Sub1_1);
			} else {
				Static489.method7255(Static331.aByteArrayArray21, Static200.aClass200_Sub1_1);
			}
			Static209.method3332();
			Static209.method3334(true);
			Static200.aClass200_Sub1_1.method7403(Static164.aClass75Array1[0], Static103.aClass39_3, null);
			Static200.aClass200_Sub1_1.method7414(Static103.aClass39_3);
			Static209.method3334(true);
			Static202.method3263(false);
		}
		Static531.method7655();
		@Pc(736) int local736 = Static290.aClass200_Sub1_2.anInt8834;
		if (Static208.anInt3742 < local736) {
			local736 = Static208.anInt3742;
		}
		if (Static208.anInt3742 - 1 > local736) {
			local736 = Static208.anInt3742 - 1;
		}
		if (Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923)) {
			Static518.method7537(0);
		} else {
			Static518.method7537(local736);
		}
		@Pc(771) int local771;
		@Pc(775) int local775;
		for (@Pc(767) int local767 = 0; local767 < 4; local767++) {
			for (local771 = 0; local771 < Static363.anInt1158; local771++) {
				for (local775 = 0; local775 < Static511.anInt8889; local775++) {
					Static37.method712(local771, local767, local775);
				}
			}
		}
		Static451.method6878();
		Static491.method6549();
		Static311.method4815();
		Static209.method3332();
		Static214.method3905();
		if (Static132.aFrame2 != null && Static497.aClass173_2 != null && Static271.anInt8654 == 10) {
			Static93.method1721(Static543.aClass243_94);
			Static381.aClass2_Sub29_Sub2_2.method5185(1057001181);
		}
		if (Static425.anInt6885 == 0) {
			local771 = (Static367.anInt6894 - (Static363.anInt1158 >> 4)) / 8;
			local775 = ((Static363.anInt1158 >> 4) + Static367.anInt6894) / 8;
			@Pc(866) int local866 = (Static46.anInt834 - (Static511.anInt8889 >> 4)) / 8;
			@Pc(874) int local874 = (Static46.anInt834 + (Static511.anInt8889 >> 4)) / 8;
			for (@Pc(878) int local878 = local771 - 1; local878 <= local775 + 1; local878++) {
				for (@Pc(884) int local884 = local866 - 1; local884 <= local874 + 1; local884++) {
					if (local878 < local771 || local878 > local775 || local884 < local866 || local874 < local884) {
						Static360.aClass53_151.method1590("m" + local878 + "_" + local884);
						Static360.aClass53_151.method1590("l" + local878 + "_" + local884);
					}
				}
			}
		}
		if (Static271.anInt8654 == 3) {
			Static301.method4738(2);
		} else if (Static271.anInt8654 == 7) {
			Static301.method4738(6);
		} else {
			Static301.method4738(9);
			if (Static497.aClass173_2 != null) {
				Static93.method1721(Static388.aClass243_71);
			}
		}
		Static538.method7752();
		Static491.method6549();
		Static378.method5953();
	}
}
