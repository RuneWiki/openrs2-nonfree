import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_13;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_14;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_1320 = Static69.method1231(" (X");

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static int anInt2475 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_1321 = Static69.method1231("p11_full");

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_1322 = Static69.method1231(":clan:");

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_1323 = Static69.method1231("Benutzen");

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
	public static int[] anIntArray282 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1796() {
		aClass40_1323 = null;
		aClass40_1322 = null;
		aClass2_Sub13_13 = null;
		aClass40_1320 = null;
		aClass2_Sub13_14 = null;
		aClass40_1321 = null;
		anIntArray282 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!m;III)V")
	public static void method1797(@OriginalArg(0) Class2_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x200) != 0) {
			arg0.anInt1785 = Static7.aClass2_Sub9_Sub1_1.method614();
			arg0.anInt1807 = Static7.aClass2_Sub9_Sub1_1.method613();
			arg0.anInt1781 = Static7.aClass2_Sub9_Sub1_1.method612();
			arg0.anInt1800 = Static7.aClass2_Sub9_Sub1_1.method614();
			arg0.anInt1787 = Static7.aClass2_Sub9_Sub1_1.method621() + Static28.anInt704;
			arg0.anInt1784 = Static7.aClass2_Sub9_Sub1_1.method639() + Static28.anInt704;
			arg0.anInt1798 = Static7.aClass2_Sub9_Sub1_1.method612();
			arg0.anInt1782 = 0;
			arg0.anInt1779 = 1;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if ((arg2 & 0x8) != 0) {
			local66 = Static7.aClass2_Sub9_Sub1_1.method640();
			local70 = Static7.aClass2_Sub9_Sub1_1.method613();
			arg0.method1175(local70, Static28.anInt704, local66);
			arg0.anInt1783 = Static28.anInt704 + 300;
			arg0.anInt1803 = Static7.aClass2_Sub9_Sub1_1.method612();
			arg0.anInt1820 = Static7.aClass2_Sub9_Sub1_1.method640();
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt1816 = Static7.aClass2_Sub9_Sub1_1.method632();
			local66 = Static7.aClass2_Sub9_Sub1_1.method637();
			if (arg0.anInt1816 == 65535) {
				arg0.anInt1816 = -1;
			}
			arg0.anInt1795 = 0;
			arg0.anInt1774 = 0;
			arg0.anInt1791 = local66 >> 16;
			arg0.anInt1811 = (local66 & 0xFFFF) + Static28.anInt704;
			if (arg0.anInt1811 > Static28.anInt704) {
				arg0.anInt1774 = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			arg0.anInt1815 = Static7.aClass2_Sub9_Sub1_1.method639();
			if (arg0.anInt1815 == 65535) {
				arg0.anInt1815 = -1;
			}
		}
		if ((arg2 & 0x100) != 0) {
			local66 = Static7.aClass2_Sub9_Sub1_1.method640();
			local70 = Static7.aClass2_Sub9_Sub1_1.method612();
			arg0.method1175(local70, Static28.anInt704, local66);
			arg0.anInt1783 = Static28.anInt704 + 300;
			arg0.anInt1803 = Static7.aClass2_Sub9_Sub1_1.method613();
			arg0.anInt1820 = Static7.aClass2_Sub9_Sub1_1.method613();
		}
		if ((arg2 & 0x80) != 0) {
			local66 = Static7.aClass2_Sub9_Sub1_1.method639();
			if (local66 == 65535) {
				local66 = -1;
			}
			local70 = Static7.aClass2_Sub9_Sub1_1.method613();
			Static12.method2206(local70, local66, arg0);
		}
		if ((arg2 & 0x1) != 0) {
			local66 = Static7.aClass2_Sub9_Sub1_1.method639();
			local70 = Static7.aClass2_Sub9_Sub1_1.method612();
			@Pc(242) int local242 = Static7.aClass2_Sub9_Sub1_1.method640();
			@Pc(245) int local245 = Static7.aClass2_Sub9_Sub1_1.anInt976;
			if (arg0.aClass40_892 != null && arg0.aClass41_1 != null) {
				@Pc(256) long local256 = arg0.aClass40_892.method981();
				@Pc(258) boolean local258 = false;
				if (local70 <= 1) {
					for (@Pc(263) int local263 = 0; local263 < Static75.anInt1945; local263++) {
						if (local256 == Static10.aLongArray8[local263]) {
							local258 = true;
							break;
						}
					}
				}
				if (!local258 && Static47.anInt1272 == 0) {
					Static45.aClass2_Sub9_3.anInt976 = 0;
					Static7.aClass2_Sub9_Sub1_1.method617(Static45.aClass2_Sub9_3.aByteArray16, local242);
					Static45.aClass2_Sub9_3.anInt976 = 0;
					@Pc(310) Class40 local310 = Static82.method1541(Static133.method2226(Static45.aClass2_Sub9_3).method967());
					arg0.aClass40_884 = local310.method964();
					arg0.anInt1794 = local66 & 0xFF;
					arg0.anInt1806 = local66 >> 8;
					arg0.anInt1780 = 150;
					if (local70 == 2 || local70 == 3) {
						Static72.method1228(local310, Static40.method722(new Class40[] { Static118.aClass40_1495, arg0.aClass40_892 }), 1);
					} else if (local70 == 1) {
						Static72.method1228(local310, Static40.method722(new Class40[] { Static2.aClass40_71, arg0.aClass40_892 }), 1);
					} else {
						Static72.method1228(local310, arg0.aClass40_892, 2);
					}
				}
			}
			Static7.aClass2_Sub9_Sub1_1.anInt976 = local242 + local245;
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt1799 = Static7.aClass2_Sub9_Sub1_1.method621();
			arg0.anInt1819 = Static7.aClass2_Sub9_Sub1_1.method650();
		}
		if ((arg2 & 0x10) != 0) {
			local66 = Static7.aClass2_Sub9_Sub1_1.method612();
			@Pc(421) byte[] local421 = new byte[local66];
			@Pc(426) Class2_Sub9 local426 = new Class2_Sub9(local421);
			Static7.aClass2_Sub9_Sub1_1.method642(local66, local421);
			Static3.aClass2_Sub9Array1[arg1] = local426;
			arg0.method1182(local426);
		}
		if ((arg2 & 0x20) == 0) {
			return;
		}
		arg0.aClass40_884 = Static7.aClass2_Sub9_Sub1_1.method625();
		if (arg0.aClass40_884.method982(0) == 126) {
			arg0.aClass40_884 = arg0.aClass40_884.method968(1);
			Static72.method1228(arg0.aClass40_884, arg0.aClass40_892, 2);
		} else if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1 == arg0) {
			Static72.method1228(arg0.aClass40_884, arg0.aClass40_892, 2);
		}
		arg0.anInt1806 = 0;
		arg0.anInt1794 = 0;
		arg0.anInt1780 = 150;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII[Lclient!ee;I[BIII)V")
	public static void method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg5 > 0 && arg5 + local7 < 103 && local11 + arg2 > 0 && local11 + arg2 < 103) {
					arg4[arg0].anIntArrayArray8[local7 + arg5][arg2 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(81) Class2_Sub9 local81 = new Class2_Sub9(arg6);
		for (@Pc(83) int local83 = 0; local83 < 4; local83++) {
			for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					if (local83 == arg3 && arg1 <= local87 && arg1 + 8 > local87 && arg8 <= local91 && arg8 + 8 > local91) {
						Static102.method1799(0, local81, arg7, arg5 + Static41.method734(local91 & 0x7, local87 & 0x7, arg7), 0, arg0, arg2 + Static50.method890(arg7, local87 & 0x7, local91 & 0x7));
					} else {
						Static102.method1799(0, local81, 0, -1, 0, 0, -1);
					}
				}
			}
		}
	}
}
