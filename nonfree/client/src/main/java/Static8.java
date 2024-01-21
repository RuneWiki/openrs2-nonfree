import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bc", name = "sb", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_113 = Static45.method753("Konfig geladen)3");

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "[Lclient!ob;")
	public static Class49[] aClass49Array1 = new Class49[50];

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "Lclient!v;")
	private static Class62 aClass62_118 = Static45.method753("Create a free account");

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "Lclient!v;")
	public static Class62 aClass62_114 = aClass62_118;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_115 = Static45.method753("Mem:");

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "Lclient!v;")
	private static Class62 aClass62_117 = Static45.method753("Loading interfaces )2 ");

	@OriginalMember(owner = "client!bc", name = "tb", descriptor = "Lclient!v;")
	public static Class62 aClass62_119 = Static45.method753("Bitte schlie\u001c1en Sie die momentan ge\u001c1ffnete Benutzeroberfl\u001c1che)1 bevor Sie die (WMissbrauch melden(W Option benutzen");

	@OriginalMember(owner = "client!bc", name = "yb", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!bc", name = "Ob", descriptor = "Lclient!v;")
	public static Class62 aClass62_120 = aClass62_117;

	@OriginalMember(owner = "client!bc", name = "Pb", descriptor = "Lclient!v;")
	public static Class62 aClass62_121 = Static45.method753("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!bc", name = "Sb", descriptor = "Lclient!v;")
	private static Class62 aClass62_122 = Static45.method753("Please use a different world)3");

	@OriginalMember(owner = "client!bc", name = "Yb", descriptor = "Lclient!v;")
	public static Class62 aClass62_123 = aClass62_122;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V")
	public static void method204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static96.anInt2562 = -1;
			Static4.anInt186 = -1;
			return;
		}
		@Pc(31) int local31 = Static91.method1541(arg2, arg1, Static27.anInt818) - arg0;
		@Pc(35) int local35 = local31 - Static23.anInt752;
		@Pc(39) int local39 = Static57.anIntArray156[Static96.anInt2559];
		@Pc(43) int local43 = Static57.anIntArray161[Static69.anInt1904];
		@Pc(47) int local47 = Static57.anIntArray156[Static69.anInt1904];
		@Pc(51) int local51 = arg1 - Static4.anInt187;
		@Pc(55) int local55 = Static57.anIntArray161[Static96.anInt2559];
		@Pc(59) int local59 = arg2 - Static96.anInt2555;
		@Pc(69) int local69 = local43 * local59 + local47 * local51 >> 16;
		@Pc(80) int local80 = local43 * local51 - local59 * local47 >> 16;
		@Pc(82) int local82 = local69;
		@Pc(93) int local93 = local55 * local35 - local80 * local39 >> 16;
		@Pc(103) int local103 = local55 * local80 + local35 * local39 >> 16;
		if (local103 >= 50) {
			Static96.anInt2562 = (local93 << 9) / local103 + 167;
			Static4.anInt186 = (local82 << 9) / local103 + 256;
		} else {
			Static96.anInt2562 = -1;
			Static4.anInt186 = -1;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIII)I")
	public static int method206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = 256 - arg0;
		return (local16 * (arg2 & 0xFF00) + (arg1 & 0xFF00) * arg0 & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) + arg0 * (arg1 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
	public static void method208() {
		aClass62_123 = null;
		aClass62_117 = null;
		aClass62_119 = null;
		aClass62_122 = null;
		aClass62_115 = null;
		aClass62_121 = null;
		aClass62_118 = null;
		aClass62_114 = null;
		aClass62_120 = null;
		aClass49Array1 = null;
		aClass62_113 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILclient!ja;)V")
	public static void method212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub3_Sub1_Sub1 arg2) {
		@Pc(9) int local9;
		if ((arg0 & 0x10) != 0) {
			local9 = Static10.aClass3_Sub8_Sub1_5.method1777();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(17) Class3_Sub8 local17 = new Class3_Sub8(local12);
			Static10.aClass3_Sub8_Sub1_5.method1767(local12, local9);
			Static75.aClass3_Sub8Array1[arg1] = local17;
			arg2.method756(local17);
		}
		@Pc(43) int local43;
		@Pc(47) int local47;
		if ((arg0 & 0x2) != 0) {
			local9 = Static10.aClass3_Sub8_Sub1_5.method1807();
			local43 = Static10.aClass3_Sub8_Sub1_5.method1780();
			local47 = Static10.aClass3_Sub8_Sub1_5.method1780();
			@Pc(50) int local50 = Static10.aClass3_Sub8_Sub1_5.anInt2704;
			if (arg2.aClass62_570 != null && arg2.aClass53_1 != null) {
				@Pc(63) long local63 = arg2.aClass62_570.method1701();
				@Pc(65) boolean local65 = false;
				if (local43 <= 1) {
					for (@Pc(72) int local72 = 0; local72 < Static20.anInt704; local72++) {
						if (Static108.aLongArray35[local72] == local63) {
							local65 = true;
							break;
						}
					}
				}
				if (!local65 && Static18.anInt686 == 0) {
					Static68.aClass3_Sub8_3.anInt2704 = 0;
					Static10.aClass3_Sub8_Sub1_5.method1766(Static68.aClass3_Sub8_3.aByteArray26, local47);
					Static68.aClass3_Sub8_3.anInt2704 = 0;
					@Pc(115) Class62 local115 = Static99.method1660(Static68.aClass3_Sub8_3).method1707();
					arg2.aClass62_810 = local115.method1699();
					arg2.anInt1841 = local9 & 0xFF;
					arg2.anInt1835 = 150;
					arg2.anInt1860 = local9 >> 8;
					if (local43 == 2 || local43 == 3) {
						Static45.method757(Static49.method782(new Class62[] { Static21.aClass62_305, arg2.aClass62_570 }), 1, local115);
					} else if (local43 == 1) {
						Static45.method757(Static49.method782(new Class62[] { Static32.aClass62_433, arg2.aClass62_570 }), 1, local115);
					} else {
						Static45.method757(arg2.aClass62_570, 2, local115);
					}
				}
			}
			Static10.aClass3_Sub8_Sub1_5.anInt2704 = local47 + local50;
		}
		if ((arg0 & 0x1) != 0) {
			arg2.aClass62_810 = Static10.aClass3_Sub8_Sub1_5.method1773();
			if (arg2.aClass62_810.method1710(0) == 126) {
				arg2.aClass62_810 = arg2.aClass62_810.method1702(1);
				Static45.method757(arg2.aClass62_570, 2, arg2.aClass62_810);
			} else if (arg2 == Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1) {
				Static45.method757(arg2.aClass62_570, 2, arg2.aClass62_810);
			}
			arg2.anInt1860 = 0;
			arg2.anInt1841 = 0;
			arg2.anInt1835 = 150;
		}
		if ((arg0 & 0x80) != 0) {
			local9 = Static10.aClass3_Sub8_Sub1_5.method1803();
			local43 = Static10.aClass3_Sub8_Sub1_5.method1813();
			arg2.method1151(local43, Static12.anInt451, local9);
			arg2.anInt1864 = Static12.anInt451 + 300;
			arg2.anInt1842 = Static10.aClass3_Sub8_Sub1_5.method1803();
			arg2.anInt1831 = Static10.aClass3_Sub8_Sub1_5.method1777();
		}
		if ((arg0 & 0x8) != 0) {
			arg2.anInt1867 = Static10.aClass3_Sub8_Sub1_5.method1807();
			if (arg2.anInt1867 == 65535) {
				arg2.anInt1867 = -1;
			}
		}
		if ((arg0 & 0x100) != 0) {
			arg2.anInt1859 = Static10.aClass3_Sub8_Sub1_5.method1807();
			local9 = Static10.aClass3_Sub8_Sub1_5.method1772();
			arg2.anInt1830 = Static12.anInt451 + (local9 & 0xFFFF);
			if (arg2.anInt1859 == 65535) {
				arg2.anInt1859 = -1;
			}
			arg2.anInt1872 = 0;
			arg2.anInt1839 = local9 >> 16;
			arg2.anInt1870 = 0;
			if (arg2.anInt1830 > Static12.anInt451) {
				arg2.anInt1870 = -1;
			}
		}
		if ((arg0 & 0x4) != 0) {
			arg2.anInt1865 = Static10.aClass3_Sub8_Sub1_5.method1791();
			arg2.anInt1871 = Static10.aClass3_Sub8_Sub1_5.method1785();
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt1886 = Static10.aClass3_Sub8_Sub1_5.method1777();
			arg2.anInt1858 = Static10.aClass3_Sub8_Sub1_5.method1813();
			arg2.anInt1878 = Static10.aClass3_Sub8_Sub1_5.method1803();
			arg2.anInt1880 = Static10.aClass3_Sub8_Sub1_5.method1813();
			arg2.anInt1857 = Static10.aClass3_Sub8_Sub1_5.method1789() + Static12.anInt451;
			arg2.anInt1840 = Static10.aClass3_Sub8_Sub1_5.method1791() + Static12.anInt451;
			arg2.anInt1866 = Static10.aClass3_Sub8_Sub1_5.method1803();
			arg2.method1148();
		}
		if ((arg0 & 0x40) != 0) {
			local9 = Static10.aClass3_Sub8_Sub1_5.method1785();
			local43 = Static10.aClass3_Sub8_Sub1_5.method1777();
			if (local9 == 65535) {
				local9 = -1;
			}
			if (arg2.anInt1868 == local9 && local9 != -1) {
				local47 = Static41.method705(local9).anInt2005;
				if (local47 == 1) {
					arg2.anInt1852 = 0;
					arg2.anInt1851 = 0;
					arg2.anInt1843 = local43;
					arg2.anInt1853 = 0;
				}
				if (local47 == 2) {
					arg2.anInt1853 = 0;
				}
			} else if (local9 == -1 || arg2.anInt1868 == -1 || Static41.method705(local9).anInt2008 >= Static41.method705(arg2.anInt1868).anInt2008) {
				arg2.anInt1852 = 0;
				arg2.anInt1855 = arg2.anInt1838;
				arg2.anInt1843 = local43;
				arg2.anInt1851 = 0;
				arg2.anInt1853 = 0;
				arg2.anInt1868 = local9;
			}
		}
		if ((arg0 & 0x200) == 0) {
			return;
		}
		local9 = Static10.aClass3_Sub8_Sub1_5.method1780();
		local43 = Static10.aClass3_Sub8_Sub1_5.method1780();
		arg2.method1151(local43, Static12.anInt451, local9);
		arg2.anInt1864 = Static12.anInt451 + 300;
		arg2.anInt1842 = Static10.aClass3_Sub8_Sub1_5.method1780();
		arg2.anInt1831 = Static10.aClass3_Sub8_Sub1_5.method1803();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIILclient!cc;Lclient!a;III)V")
	public static void method215(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = Static79.anIntArrayArrayArray4[arg3][arg8 + 1][arg0];
		@Pc(27) int local27 = Static79.anIntArrayArrayArray4[arg3][arg8 + 1][arg0 + 1];
		@Pc(35) int local35 = Static79.anIntArrayArrayArray4[arg3][arg8][arg0];
		@Pc(45) int local45 = Static79.anIntArrayArrayArray4[arg3][arg8][arg0 + 1];
		@Pc(56) int local56 = local45 + local35 + local15 + local27 >> 2;
		@Pc(60) Class3_Sub1_Sub9 local60 = Static10.method1322(arg1);
		@Pc(72) int local72 = (arg0 << 7) + arg8 + (arg1 << 14) + 1073741824;
		@Pc(78) int local78 = arg7 + (arg2 << 6);
		if (local60.anInt1063 == 0) {
			local72 += Integer.MIN_VALUE;
		}
		if (local60.anInt1056 == 1) {
			local78 += 256;
		}
		@Pc(124) Class3_Sub1_Sub3 local124;
		if (arg7 == 22) {
			if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
				local124 = local60.method656(local15, local45, local27, 22, local35, arg2);
			} else {
				local124 = new Class3_Sub1_Sub3_Sub2(arg1, 22, arg2, local35, local15, local27, local45, local60.anInt1070, true);
			}
			arg5.method52(arg6, arg8, arg0, local56, local124, local72, local78);
			if (local60.aBoolean60 && local60.anInt1063 == 1) {
				arg4.method314(arg8, arg0);
			}
			return;
		}
		@Pc(217) int local217;
		if (arg7 == 10 || arg7 == 11) {
			if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
				local124 = local60.method656(local15, local45, local27, 10, local35, arg2);
			} else {
				local124 = new Class3_Sub1_Sub3_Sub2(arg1, 10, arg2, local35, local15, local27, local45, local60.anInt1070, true);
			}
			if (local124 != null) {
				@Pc(220) int local220;
				if (arg2 == 1 || arg2 == 3) {
					local217 = local60.anInt1061;
					local220 = local60.anInt1068;
				} else {
					local217 = local60.anInt1068;
					local220 = local60.anInt1061;
				}
				@Pc(230) int local230 = 0;
				if (arg7 == 11) {
					local230 += 256;
				}
				arg5.method6(arg6, arg8, arg0, local56, local217, local220, local124, local230, local72, local78);
			}
			if (local60.aBoolean60) {
				arg4.method309(arg2, local60.anInt1061, arg8, local60.anInt1068, arg0, local60.aBoolean54);
			}
		} else if (arg7 >= 12) {
			if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
				local124 = local60.method656(local15, local45, local27, arg7, local35, arg2);
			} else {
				local124 = new Class3_Sub1_Sub3_Sub2(arg1, arg7, arg2, local35, local15, local27, local45, local60.anInt1070, true);
			}
			arg5.method6(arg6, arg8, arg0, local56, 1, 1, local124, 0, local72, local78);
			if (local60.aBoolean60) {
				arg4.method309(arg2, local60.anInt1061, arg8, local60.anInt1068, arg0, local60.aBoolean54);
			}
		} else if (arg7 == 0) {
			if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
				local124 = local60.method656(local15, local45, local27, 0, local35, arg2);
			} else {
				local124 = new Class3_Sub1_Sub3_Sub2(arg1, 0, arg2, local35, local15, local27, local45, local60.anInt1070, true);
			}
			arg5.method19(arg6, arg8, arg0, local56, local124, null, Static64.anIntArray183[arg2], 0, local72, local78);
			if (local60.aBoolean60) {
				arg4.method304(arg0, arg7, arg2, arg8, local60.aBoolean54);
			}
		} else if (arg7 == 1) {
			if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
				local124 = local60.method656(local15, local45, local27, 1, local35, arg2);
			} else {
				local124 = new Class3_Sub1_Sub3_Sub2(arg1, 1, arg2, local35, local15, local27, local45, local60.anInt1070, true);
			}
			arg5.method19(arg6, arg8, arg0, local56, local124, null, Static23.anIntArray58[arg2], 0, local72, local78);
			if (local60.aBoolean60) {
				arg4.method304(arg0, arg7, arg2, arg8, local60.aBoolean54);
			}
		} else {
			@Pc(466) int local466;
			@Pc(504) Class3_Sub1_Sub3 local504;
			if (arg7 == 2) {
				local466 = arg2 + 1 & 0x3;
				@Pc(490) Class3_Sub1_Sub3 local490;
				if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
					local490 = local60.method656(local15, local45, local27, 2, local35, arg2 + 4);
					local504 = local60.method656(local15, local45, local27, 2, local35, local466);
				} else {
					local490 = new Class3_Sub1_Sub3_Sub2(arg1, 2, arg2 + 4, local35, local15, local27, local45, local60.anInt1070, true);
					local504 = new Class3_Sub1_Sub3_Sub2(arg1, 2, local466, local35, local15, local27, local45, local60.anInt1070, true);
				}
				arg5.method19(arg6, arg8, arg0, local56, local490, local504, Static64.anIntArray183[arg2], Static64.anIntArray183[local466], local72, local78);
				if (local60.aBoolean60) {
					arg4.method304(arg0, arg7, arg2, arg8, local60.aBoolean54);
				}
			} else if (arg7 == 3) {
				if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
					local124 = local60.method656(local15, local45, local27, 3, local35, arg2);
				} else {
					local124 = new Class3_Sub1_Sub3_Sub2(arg1, 3, arg2, local35, local15, local27, local45, local60.anInt1070, true);
				}
				arg5.method19(arg6, arg8, arg0, local56, local124, null, Static23.anIntArray58[arg2], 0, local72, local78);
				if (local60.aBoolean60) {
					arg4.method304(arg0, arg7, arg2, arg8, local60.aBoolean54);
				}
			} else if (arg7 == 9) {
				if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
					local124 = local60.method656(local15, local45, local27, arg7, local35, arg2);
				} else {
					local124 = new Class3_Sub1_Sub3_Sub2(arg1, arg7, arg2, local35, local15, local27, local45, local60.anInt1070, true);
				}
				arg5.method6(arg6, arg8, arg0, local56, 1, 1, local124, 0, local72, local78);
				if (local60.aBoolean60) {
					arg4.method309(arg2, local60.anInt1061, arg8, local60.anInt1068, arg0, local60.aBoolean54);
				}
			} else {
				if (local60.aBoolean61) {
					if (arg2 == 1) {
						local466 = local45;
						local45 = local27;
						local27 = local15;
						local15 = local35;
						local35 = local466;
					} else if (arg2 == 2) {
						local466 = local45;
						local45 = local15;
						local15 = local466;
						local466 = local27;
						local27 = local35;
						local35 = local466;
					} else if (arg2 == 3) {
						local466 = local45;
						local45 = local35;
						local35 = local15;
						local15 = local27;
						local27 = local466;
					}
				}
				if (arg7 == 4) {
					if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
						local124 = local60.method656(local15, local45, local27, 4, local35, 0);
					} else {
						local124 = new Class3_Sub1_Sub3_Sub2(arg1, 4, 0, local35, local15, local27, local45, local60.anInt1070, true);
					}
					arg5.method31(arg6, arg8, arg0, local56, local124, Static64.anIntArray183[arg2], arg2 * 512, 0, 0, local72, local78);
				} else if (arg7 == 5) {
					local466 = 16;
					local217 = arg5.method47(arg6, arg8, arg0);
					if (local217 > 0) {
						local466 = Static10.method1322(local217 >> 14 & 0x7FFF).anInt1072;
					}
					if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
						local504 = local60.method656(local15, local45, local27, 4, local35, 0);
					} else {
						local504 = new Class3_Sub1_Sub3_Sub2(arg1, 4, 0, local35, local15, local27, local45, local60.anInt1070, true);
					}
					arg5.method31(arg6, arg8, arg0, local56, local504, Static64.anIntArray183[arg2], arg2 * 512, Static25.anIntArray61[arg2] * local466, local466 * Static44.anIntArray98[arg2], local72, local78);
				} else if (arg7 == 6) {
					if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
						local124 = local60.method656(local15, local45, local27, 4, local35, 0);
					} else {
						local124 = new Class3_Sub1_Sub3_Sub2(arg1, 4, 0, local35, local15, local27, local45, local60.anInt1070, true);
					}
					arg5.method31(arg6, arg8, arg0, local56, local124, 256, arg2, 0, 0, local72, local78);
				} else if (arg7 == 7) {
					if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
						local124 = local60.method656(local15, local45, local27, 4, local35, 0);
					} else {
						local124 = new Class3_Sub1_Sub3_Sub2(arg1, 4, 0, local35, local15, local27, local45, local60.anInt1070, true);
					}
					arg5.method31(arg6, arg8, arg0, local56, local124, 512, arg2, 0, 0, local72, local78);
				} else if (arg7 == 8) {
					if (local60.anInt1070 == -1 && local60.anIntArray72 == null) {
						local124 = local60.method656(local15, local45, local27, 4, local35, 0);
					} else {
						local124 = new Class3_Sub1_Sub3_Sub2(arg1, 4, 0, local35, local15, local27, local45, local60.anInt1070, true);
					}
					arg5.method31(arg6, arg8, arg0, local56, local124, 768, arg2, 0, 0, local72, local78);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BIILclient!ne;)V")
	public static void method216(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(15) Class3_Sub11 local15 = new Class3_Sub11();
		local15.anInt2177 = 0;
		local15.aClass46_4 = arg2;
		local15.aByteArray19 = arg0;
		local15.aLong81 = arg1;
		@Pc(30) Class24 local30 = Static44.aClass24_37;
		synchronized (Static44.aClass24_37) {
			Static44.aClass24_37.method535(local15);
		}
		Static63.method1511();
	}
}
