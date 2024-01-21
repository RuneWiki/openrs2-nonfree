import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_13;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public static int anInt3382 = 0;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!ha;")
	public static Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
	public static int[] anIntArray445 = new int[1000];

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1264 = Static169.method2903("(U4");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BILclient!a;I)V")
	public static void method2295(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x40) != 0) {
			arg1.aClass23_676 = Static35.aClass1_Sub8_Sub1_2.method864();
			if (arg1.aClass23_676.method650(0) == 126) {
				arg1.aClass23_676 = arg1.aClass23_676.method632(1);
				Static73.method1339(arg1.aClass23_676, arg1.aClass23_68, 2);
			} else if (arg1 == Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103) {
				Static73.method1339(arg1.aClass23_676, arg1.aClass23_68, 2);
			}
			arg1.anInt1856 = 0;
			arg1.anInt1844 = 150;
			arg1.anInt1816 = 0;
		}
		@Pc(74) int local74;
		if ((arg2 & 0x1) != 0) {
			local74 = Static35.aClass1_Sub8_Sub1_2.method866();
			@Pc(77) byte[] local77 = new byte[local74];
			@Pc(82) Class1_Sub8 local82 = new Class1_Sub8(local77);
			Static35.aClass1_Sub8_Sub1_2.method857(local74, local77);
			Static36.aClass1_Sub8Array1[arg0] = local82;
			arg1.method95(local82);
		}
		if ((arg2 & 0x20) != 0) {
			arg1.anInt1865 = Static35.aClass1_Sub8_Sub1_2.method902();
			if (arg1.anInt1865 == 65535) {
				arg1.anInt1865 = -1;
			}
		}
		@Pc(126) int local126;
		if ((arg2 & 0x400) != 0) {
			local74 = Static35.aClass1_Sub8_Sub1_2.method883();
			local126 = Static35.aClass1_Sub8_Sub1_2.method883();
			arg1.method1221(local74, local126, Static26.anInt845);
			arg1.anInt1810 = Static26.anInt845 + 300;
			arg1.anInt1852 = Static35.aClass1_Sub8_Sub1_2.method861();
			arg1.anInt1831 = Static35.aClass1_Sub8_Sub1_2.method883();
		}
		if ((arg2 & 0x2) != 0) {
			local74 = Static35.aClass1_Sub8_Sub1_2.method878();
			local126 = Static35.aClass1_Sub8_Sub1_2.method866();
			@Pc(163) int local163 = Static35.aClass1_Sub8_Sub1_2.method866();
			@Pc(166) int local166 = Static35.aClass1_Sub8_Sub1_2.anInt1357;
			if (arg1.aClass23_68 != null && arg1.aClass41_5 != null) {
				@Pc(177) long local177 = arg1.aClass23_68.method643();
				@Pc(179) boolean local179 = false;
				if (local126 <= 1) {
					for (@Pc(186) int local186 = 0; local186 < Static65.anInt3673; local186++) {
						if (Static70.aLongArray4[local186] == local177) {
							local179 = true;
							break;
						}
					}
				}
				if (!local179 && Static51.anInt1466 == 0) {
					Static1.aClass1_Sub8_1.anInt1357 = 0;
					Static35.aClass1_Sub8_Sub1_2.method891(local163, Static1.aClass1_Sub8_1.aByteArray12);
					Static1.aClass1_Sub8_1.anInt1357 = 0;
					@Pc(230) Class23 local230 = Static136.method3049(Static100.method1710(Static1.aClass1_Sub8_1).method639());
					arg1.aClass23_676 = local230.method641();
					arg1.anInt1856 = local74 >> 8;
					arg1.anInt1844 = 150;
					arg1.anInt1816 = local74 & 0xFF;
					if (local126 == 2 || local126 == 3) {
						Static73.method1339(local230, Static149.method2571(new Class23[] { Static141.aClass23_1360, arg1.aClass23_68 }), 1);
					} else if (local126 == 1) {
						Static73.method1339(local230, Static149.method2571(new Class23[] { Static137.aClass23_1311, arg1.aClass23_68 }), 1);
					} else {
						Static73.method1339(local230, arg1.aClass23_68, 2);
					}
				}
			}
			Static35.aClass1_Sub8_Sub1_2.anInt1357 = local163 + local166;
		}
		if ((arg2 & 0x10) != 0) {
			arg1.anInt1840 = Static35.aClass1_Sub8_Sub1_2.method886();
			arg1.anInt1833 = Static35.aClass1_Sub8_Sub1_2.method886();
		}
		if ((arg2 & 0x80) != 0) {
			local74 = Static35.aClass1_Sub8_Sub1_2.method901();
			local126 = Static35.aClass1_Sub8_Sub1_2.method901();
			arg1.method1221(local74, local126, Static26.anInt845);
			arg1.anInt1810 = Static26.anInt845 + 300;
			arg1.anInt1852 = Static35.aClass1_Sub8_Sub1_2.method866();
			arg1.anInt1831 = Static35.aClass1_Sub8_Sub1_2.method883();
		}
		if ((arg2 & 0x8) != 0) {
			local74 = Static35.aClass1_Sub8_Sub1_2.method867();
			if (local74 == 65535) {
				local74 = -1;
			}
			local126 = Static35.aClass1_Sub8_Sub1_2.method901();
			Static69.method1228(local74, local126, arg1);
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt1858 = Static35.aClass1_Sub8_Sub1_2.method861();
			arg1.anInt1811 = Static35.aClass1_Sub8_Sub1_2.method901();
			arg1.anInt1847 = Static35.aClass1_Sub8_Sub1_2.method901();
			arg1.anInt1861 = Static35.aClass1_Sub8_Sub1_2.method866();
			arg1.anInt1854 = Static35.aClass1_Sub8_Sub1_2.method867() + Static26.anInt845;
			arg1.anInt1828 = Static35.aClass1_Sub8_Sub1_2.method886() + Static26.anInt845;
			arg1.anInt1815 = Static35.aClass1_Sub8_Sub1_2.method866();
			arg1.anInt1839 = 0;
			arg1.anInt1863 = 1;
		}
		if ((arg2 & 0x100) == 0) {
			return;
		}
		arg1.anInt1853 = Static35.aClass1_Sub8_Sub1_2.method886();
		local74 = Static35.aClass1_Sub8_Sub1_2.method855();
		arg1.anInt1836 = Static26.anInt845 + (local74 & 0xFFFF);
		arg1.anInt1822 = 0;
		if (arg1.anInt1853 == 65535) {
			arg1.anInt1853 = -1;
		}
		if (Static26.anInt845 < arg1.anInt1836) {
			arg1.anInt1822 = -1;
		}
		arg1.anInt1855 = local74 >> 16;
		arg1.anInt1821 = 0;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public static void method2296() {
		Static73.anInt2016 = 0;
		Static23.aBoolean33 = true;
		Static167.aLong132 = 0L;
		Static108.aBoolean94 = true;
		Static20.aClass73_1.anInt3608 = 0;
		Static29.method528();
		Static87.anInt957 = -1;
		Static7.anInt328 = 0;
		Static140.anInt3588 = -1;
		Static157.anInt3834 = 0;
		Static25.aClass1_Sub8_Sub1_1.anInt1357 = 0;
		Static15.anInt475 = -1;
		Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
		Static38.anInt1037 = 0;
		Static17.anInt531 = 0;
		Class88.anInt4185 = -1;
		Static164.aBoolean201 = false;
		Static179.anInt4266 = 0;
		Static36.method587(0);
		for (@Pc(2263) int local2263 = 0; local2263 < 100; local2263++) {
			Static119.aClass23Array18[local2263] = null;
		}
		Static86.anInt2307 = 0;
		Static144.anInt3643 = 0;
		Static107.anInt2752 = 0;
		Static32.anInt934 = 0;
		Static87.anInt959 = -1;
		Static127.anInt3355 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static43.anInt1182 = (int) (Math.random() * 110.0D) - 55;
		Static152.anInt3549 = 0;
		Static20.anInt645 = 0;
		Static179.anInt4264 = (int) (Math.random() * 120.0D) - 60;
		Static134.anInt3412 = (int) (Math.random() * 80.0D) - 40;
		Static111.anInt2840 = 0;
		Static33.anInt948 = 0;
		Static49.anInt1423 = (int) (Math.random() * 30.0D) - 20;
		Static21.anInt683 = (int) (Math.random() * 100.0D) - 50;
		Static156.aBoolean195 = false;
		for (@Pc(2345) int local2345 = 0; local2345 < 2048; local2345++) {
			Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local2345] = null;
			Static36.aClass1_Sub8Array1[local2345] = null;
		}
		for (@Pc(2361) int local2361 = 0; local2361 < 32768; local2361++) {
			Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local2361] = null;
		}
		Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[2047] = new Class1_Sub1_Sub1_Sub1_Sub1();
		Static91.aClass56_7.method1851();
		Static49.aClass56_5.method1851();
		@Pc(2393) int local2393;
		@Pc(2397) int local2397;
		for (@Pc(2389) int local2389 = 0; local2389 < 4; local2389++) {
			for (local2393 = 0; local2393 < 104; local2393++) {
				for (local2397 = 0; local2397 < 104; local2397++) {
					Static41.aClass56ArrayArrayArray1[local2389][local2393][local2397] = null;
				}
			}
		}
		Static158.aClass56_15 = new Class56();
		Static45.anInt1254 = 0;
		Static37.anInt996 = 0;
		for (local2393 = 0; local2393 < Static133.anInt3410; local2393++) {
			@Pc(2437) Class1_Sub1_Sub8 local2437 = Static169.method2900(local2393);
			if (local2437 != null && local2437.anInt1282 == 0) {
				Static32.anIntArray120[local2393] = 0;
				Static27.anIntArray108[local2393] = 0;
			}
		}
		for (local2397 = 0; local2397 < Static46.anIntArray606.length; local2397++) {
			Static46.anIntArray606[local2397] = -1;
		}
		if (Static165.anInt4050 != -1) {
			Static49.method908(Static165.anInt4050);
		}
		for (@Pc(2483) Class1_Sub16 local2483 = (Class1_Sub16) Static12.aClass10_1.method257(); local2483 != null; local2483 = (Class1_Sub16) Static12.aClass10_1.method260()) {
			Static27.method495(local2483, true);
		}
		Static165.anInt4050 = -1;
		Static12.aClass10_1 = new Class10(8);
		Static164.aBoolean201 = false;
		Static98.aClass60_5 = null;
		Static38.anInt1037 = 0;
		Static5.aClass41_35.method1182(new int[5], false, -1, null);
		for (@Pc(2519) int local2519 = 0; local2519 < 8; local2519++) {
			Static140.aClass23Array21[local2519] = null;
			Static110.aBooleanArray16[local2519] = false;
		}
		Static96.method1665();
		Static137.aBoolean176 = true;
		for (@Pc(2539) int local2539 = 0; local2539 < 100; local2539++) {
			Static98.aBooleanArray12[local2539] = true;
		}
		Static109.anInt2811 = 0;
		Static30.aClass1_Sub24Array2 = null;
		Static156.aClass23_1468 = null;
		for (@Pc(2559) int local2559 = 0; local2559 < 6; local2559++) {
			Static130.aClass64Array1[local2559] = new Class64();
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
	public static void method2297() {
		aClass30_Sub1_13 = null;
		aClass35_1 = null;
		aClass23_1264 = null;
		anIntArray445 = null;
	}
}
