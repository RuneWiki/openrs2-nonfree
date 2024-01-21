import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "Lclient!sf;")
	public static Class5 aClass5_29;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_523 = Static106.method1849("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "Lclient!sc;")
	public static Class66 aClass66_524 = Static106.method1849("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "[S")
	public static short[] aShortArray24 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;BII)Lclient!rd;")
	public static Class6 method650(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class6_Sub2");
			@Pc(10) Class6 local10 = (Class6) local6.getDeclaredConstructor().newInstance();
			local10.method910(arg2, arg0, arg1);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub1 local28 = new Class6_Sub1();
			local28.method910(arg2, arg0, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ud;BZ)V")
	public static void method651(@OriginalArg(0) Class1_Sub22 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) int local10 = arg0.anInt2781;
		@Pc(14) int local14 = (int) arg0.aLong130;
		arg0.method2050();
		if (arg1) {
			Static44.method964(local10);
		}
		Static86.method1606(local10);
		@Pc(33) Class1_Sub10 local33 = Static38.method2002(local14);
		if (local33 != null) {
			Static70.method537(local33);
		}
		Static5.anInt228 = 0;
		Static112.aBoolean113 = false;
		Static14.method408(Static79.anInt2166, Static124.anInt2863, Static73.anInt2120, Static80.anInt2176);
		if (Static22.anInt637 != -1) {
			Static99.method905(1, Static22.anInt637);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)Lclient!s;")
	public static Class1_Sub1_Sub14 method652(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub14 local6 = (Class1_Sub1_Sub14) Static41.aClass60_43.method1745((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static63.aClass5_55.method107(arg0, 3);
		local6 = new Class1_Sub1_Sub14();
		if (local25 != null) {
			local6.method1785(new Class1_Sub12(local25));
		}
		Static41.aClass60_43.method1741((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public static void method653() {
		if (Static9.anInt347 > 0) {
			Static71.method1400();
		} else {
			Static18.method468(40);
			Static85.aClass34_5 = Static49.aClass34_3;
			Static49.aClass34_3 = null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method654() {
		Static60.method1298(false);
		@Pc(6) boolean local6 = true;
		Static17.anInt563 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static9.aByteArrayArray1.length; local14++) {
			if (Static63.anIntArray293[local14] != -1 && Static9.aByteArrayArray1[local14] == null) {
				Static9.aByteArrayArray1[local14] = Static1.aClass5_Sub1_3.method107(0, Static63.anIntArray293[local14]);
				if (Static9.aByteArrayArray1[local14] == null) {
					Static17.anInt563++;
					local6 = false;
				}
			}
			if (Static13.anIntArray75[local14] != -1 && Static87.aByteArrayArray8[local14] == null) {
				Static87.aByteArrayArray8[local14] = Static1.aClass5_Sub1_3.method128(Static28.anIntArrayArray12[local14], Static13.anIntArray75[local14], 0);
				if (Static87.aByteArrayArray8[local14] == null) {
					Static17.anInt563++;
					local6 = false;
				}
			}
		}
		if (!local6) {
			Static70.anInt708 = 1;
			return;
		}
		Static39.anInt985 = 0;
		local6 = true;
		@Pc(113) int local113;
		@Pc(124) int local124;
		for (@Pc(95) int local95 = 0; local95 < Static9.aByteArrayArray1.length; local95++) {
			@Pc(101) byte[] local101 = Static87.aByteArrayArray8[local95];
			if (local101 != null) {
				local113 = (Static51.anIntArray240[local95] >> 8) * 64 - Static48.anInt1496;
				local124 = (Static51.anIntArray240[local95] & 0xFF) * 64 - Static52.anInt1603;
				if (Static33.aBoolean36) {
					local124 = 10;
					local113 = 10;
				}
				local6 &= Static102.method1788(local101, local113, local124);
			}
		}
		if (!local6) {
			Static70.anInt708 = 2;
			return;
		}
		if (Static70.anInt708 != 0) {
			Static49.method1060(true, Static41.method897(new Class66[] { Static20.aClass66_371, Static126.aClass66_1685 }));
		}
		Static5.method159();
		Static99.method909();
		Static5.method159();
		Static129.aClass9_1.method318();
		Static5.method159();
		System.gc();
		for (@Pc(178) int local178 = 0; local178 < 4; local178++) {
			Static83.aClass13Array1[local178].method473();
		}
		@Pc(199) int local199;
		for (local113 = 0; local113 < 4; local113++) {
			for (local124 = 0; local124 < 104; local124++) {
				for (local199 = 0; local199 < 104; local199++) {
					Static87.aByteArrayArrayArray15[local113][local124][local199] = 0;
				}
			}
		}
		Static5.method159();
		Static53.method1226();
		local124 = Static9.aByteArrayArray1.length;
		Static5.method164();
		Static60.method1298(true);
		@Pc(254) int local254;
		@Pc(265) int local265;
		@Pc(380) int local380;
		@Pc(322) int local322;
		@Pc(369) int local369;
		if (!Static33.aBoolean36) {
			@Pc(269) byte[] local269;
			for (local199 = 0; local199 < local124; local199++) {
				local254 = (Static51.anIntArray240[local199] >> 8) * 64 - Static48.anInt1496;
				local265 = (Static51.anIntArray240[local199] & 0xFF) * 64 - Static52.anInt1603;
				local269 = Static9.aByteArrayArray1[local199];
				if (local269 != null) {
					Static5.method159();
					Static13.method395(Static83.aClass13Array1, local265, (Static20.anInt612 - 6) * 8, local269, Static23.anInt683 * 8 - 48, local254);
				}
			}
			for (local254 = 0; local254 < local124; local254++) {
				local265 = (Static51.anIntArray240[local254] >> 8) * 64 - Static48.anInt1496;
				@Pc(311) byte[] local311 = Static9.aByteArrayArray1[local254];
				local322 = (Static51.anIntArray240[local254] & 0xFF) * 64 - Static52.anInt1603;
				if (local311 == null && Static20.anInt612 < 800) {
					Static5.method159();
					Static34.method72(local322, local265, 64, 64);
				}
			}
			Static60.method1298(true);
			for (local265 = 0; local265 < local124; local265++) {
				local269 = Static87.aByteArrayArray8[local265];
				if (local269 != null) {
					local369 = (Static51.anIntArray240[local265] >> 8) * 64 - Static48.anInt1496;
					local380 = (Static51.anIntArray240[local265] & 0xFF) * 64 - Static52.anInt1603;
					Static5.method159();
					Static52.method1097(local269, local380, local369, Static129.aClass9_1, Static83.aClass13Array1);
				}
			}
		}
		@Pc(437) int local437;
		@Pc(443) int local443;
		if (Static33.aBoolean36) {
			@Pc(449) int local449;
			@Pc(460) int local460;
			@Pc(462) int local462;
			for (local199 = 0; local199 < 4; local199++) {
				Static5.method159();
				for (local254 = 0; local254 < 13; local254++) {
					for (local265 = 0; local265 < 13; local265++) {
						@Pc(413) boolean local413 = false;
						local369 = Static82.anIntArrayArrayArray7[local199][local254][local265];
						if (local369 != -1) {
							local380 = local369 >> 24 & 0x3;
							local437 = local369 >> 1 & 0x3;
							local443 = local369 >> 14 & 0x3FF;
							local449 = local369 >> 3 & 0x7FF;
							local460 = (local443 / 8 << 8) + (local449 / 8);
							for (local462 = 0; local462 < Static51.anIntArray240.length; local462++) {
								if (Static51.anIntArray240[local462] == local460 && Static9.aByteArrayArray1[local462] != null) {
									Static106.method1851((local443 & 0x7) * 8, (local449 & 0x7) * 8, Static9.aByteArrayArray1[local462], local199, local437, Static83.aClass13Array1, local254 * 8, local265 * 8, local380);
									local413 = true;
									break;
								}
							}
						}
						if (!local413) {
							Static88.method1630(local199, local254 * 8, local265 * 8);
						}
					}
				}
			}
			for (local254 = 0; local254 < 13; local254++) {
				for (local265 = 0; local265 < 13; local265++) {
					local322 = Static82.anIntArrayArrayArray7[0][local254][local265];
					if (local322 == -1) {
						Static34.method72(local265 * 8, local254 * 8, 8, 8);
					}
				}
			}
			Static60.method1298(true);
			for (local265 = 0; local265 < 4; local265++) {
				Static5.method159();
				for (local322 = 0; local322 < 13; local322++) {
					for (local369 = 0; local369 < 13; local369++) {
						local380 = Static82.anIntArrayArrayArray7[local265][local322][local369];
						if (local380 != -1) {
							local437 = local380 >> 24 & 0x3;
							local443 = local380 >> 1 & 0x3;
							local460 = local380 >> 3 & 0x7FF;
							local449 = local380 >> 14 & 0x3FF;
							local462 = (local449 / 8 << 8) + (local460 / 8);
							for (@Pc(644) int local644 = 0; local644 < Static51.anIntArray240.length; local644++) {
								if (Static51.anIntArray240[local644] == local462 && Static87.aByteArrayArray8[local644] != null) {
									Static90.method1290(local265, (local460 & 0x7) * 8, local437, Static87.aByteArrayArray8[local644], Static129.aClass9_1, Static83.aClass13Array1, local369 * 8, local322 * 8, local443, (local449 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static60.method1298(true);
		Static99.method909();
		Static5.method159();
		Static126.method2020(Static83.aClass13Array1, Static129.aClass9_1);
		Static60.method1298(true);
		local199 = Static74.anInt2039;
		if (Static22.anInt635 < local199) {
			local199 = Static22.anInt635;
		}
		if (Static22.anInt635 - 1 > local199) {
		}
		if (Static87.aBoolean96) {
			Static129.aClass9_1.method325(Static74.anInt2039);
		} else {
			Static129.aClass9_1.method325(0);
		}
		for (local254 = 0; local254 < 104; local254++) {
			for (local265 = 0; local265 < 104; local265++) {
				Static44.method962(local254, local265);
			}
		}
		Static5.method159();
		Static108.method114();
		Static34.aClass60_11.method1747();
		if (Static92.aFrame1 != null) {
			Static127.aClass1_Sub12_Sub1_2.method1227(141);
			Static127.aClass1_Sub12_Sub1_2.method1193(1057001181);
		}
		if (!Static33.aBoolean36) {
			local369 = (Static20.anInt612 - 6) / 8;
			local380 = (Static20.anInt612 + 6) / 8;
			local322 = (Static23.anInt683 + 6) / 8;
			local265 = (Static23.anInt683 - 6) / 8;
			for (local437 = local265 - 1; local437 <= local322 + 1; local437++) {
				for (local443 = local369 - 1; local443 <= local380 + 1; local443++) {
					if (local265 > local437 || local437 > local322 || local369 > local443 || local380 < local443) {
						Static1.aClass5_Sub1_3.method132(Static41.method897(new Class66[] { Static116.aClass66_1564, Static88.method1632(local437), Static101.aClass66_1397, Static88.method1632(local443) }));
						Static1.aClass5_Sub1_3.method132(Static41.method897(new Class66[] { Static85.aClass66_1220, Static88.method1632(local437), Static101.aClass66_1397, Static88.method1632(local443) }));
					}
				}
			}
		}
		Static18.method468(30);
		Static5.method159();
		Static101.method1770();
		Static127.aClass1_Sub12_Sub1_2.method1227(124);
		Static83.method1506();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!sc;Ljava/awt/Color;I)V")
	public static void method655(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static104.aCanvas1.getGraphics();
			if (Static66.aFont2 == null) {
				Static66.aFont2 = new Font("Helvetica", 1, 13);
				Static28.aFontMetrics1 = Static104.aCanvas1.getFontMetrics(Static66.aFont2);
			}
			if (Static98.aBoolean107) {
				Static98.aBoolean107 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static70.anInt710, Static4.anInt200);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static90.anImage5 == null) {
					Static90.anImage5 = Static104.aCanvas1.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static90.anImage5.getGraphics();
				local59.setColor(arg2);
				local59.drawRect(0, 0, 303, 33);
				local59.fillRect(2, 2, arg0 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local59.setFont(Static66.aFont2);
				local59.setColor(Color.white);
				arg1.method1830(22, local59, (304 - arg1.method1846(Static28.aFontMetrics1)) / 2);
				local6.drawImage(Static90.anImage5, Static70.anInt710 / 2 - 152, Static4.anInt200 / 2 + -18, null);
			} catch (@Pc(136) Exception local136) {
				@Pc(142) int local142 = Static70.anInt710 / 2 - 152;
				@Pc(148) int local148 = Static4.anInt200 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local142, local148, 303, 33);
				local6.fillRect(local142 + 2, local148 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local142 + 1, local148 - -1, 301, 31);
				local6.fillRect(local142 + arg0 * 3 + 2, local148 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static66.aFont2);
				local6.setColor(Color.white);
				arg1.method1830(local148 + 22, local6, (304 - arg1.method1846(Static28.aFontMetrics1)) / 2 + local142);
			}
		} catch (@Pc(226) Exception local226) {
			Static104.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lclient!bc;")
	public static Class1_Sub1_Sub3 method656(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = (Class1_Sub1_Sub3) Static38.aClass60_87.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static74.aClass5_62.method107(arg0, 5);
		local10 = new Class1_Sub1_Sub3();
		if (local28 != null) {
			local10.method296(new Class1_Sub12(local28));
		}
		Static38.aClass60_87.method1741((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
	public static void method657() {
		aClass66_524 = null;
		aClass5_29 = null;
		aClass66_523 = null;
		aShortArray24 = null;
	}
}
