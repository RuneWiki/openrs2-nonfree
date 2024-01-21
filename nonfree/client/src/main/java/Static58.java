import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	public static int anInt1565;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!jb;")
	public static Class33 aClass33_21 = new Class33(260);

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_760 = Static108.method1915("Null");

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_761 = Static108.method1915("blinken2:");

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Lclient!kd;")
	private static Class39 aClass39_763 = Static108.method1915("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_762 = aClass39_763;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	public static int anInt1564 = 0;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_764 = Static108.method1915(")4l");

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_765 = Static108.method1915(": ");

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_766 = Static108.method1915(")2");

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	public static int anInt1566 = 0;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_767 = Static108.method1915("(U5");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1032() {
		if (Static48.anInt1316 != 0 && Static48.anInt1316 != 3 || Static91.anInt2130 != 1) {
			return;
		}
		@Pc(29) int local29 = Static89.anInt2109 - 25 - 550;
		@Pc(35) int local35 = Static38.anInt1157 - 4 - 5;
		if (local29 < 0 || local35 < 0 || local29 >= 146 || local35 >= 151) {
			return;
		}
		local35 -= 75;
		local29 -= 73;
		@Pc(58) int local58 = Static51.anInt1408 + Static75.anInt1879 & 0x7FF;
		@Pc(62) int local62 = Class1_Sub1_Sub4_Sub2.anIntArray138[local58];
		@Pc(66) int local66 = Class1_Sub1_Sub4_Sub2.anIntArray142[local58];
		@Pc(74) int local74 = local62 * (Static39.anInt1165 + 256) >> 8;
		@Pc(82) int local82 = local66 * (Static39.anInt1165 + 256) >> 8;
		@Pc(93) int local93 = local35 * local82 - local29 * local74 >> 11;
		@Pc(103) int local103 = local29 * local82 + local74 * local35 >> 11;
		@Pc(110) int local110 = local103 + Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 >> 7;
		@Pc(118) int local118 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 - local93 >> 7;
		@Pc(138) boolean local138 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 1, local110, local118, 0, 0, true);
		if (!local138) {
			return;
		}
		Static103.aClass1_Sub18_Sub1_5.method2168(local29);
		Static103.aClass1_Sub18_Sub1_5.method2168(local35);
		Static103.aClass1_Sub18_Sub1_5.method2159(Static51.anInt1408);
		Static103.aClass1_Sub18_Sub1_5.method2168(57);
		Static103.aClass1_Sub18_Sub1_5.method2168(Static75.anInt1879);
		Static103.aClass1_Sub18_Sub1_5.method2168(Static39.anInt1165);
		Static103.aClass1_Sub18_Sub1_5.method2168(89);
		Static103.aClass1_Sub18_Sub1_5.method2159(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521);
		Static103.aClass1_Sub18_Sub1_5.method2159(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508);
		Static103.aClass1_Sub18_Sub1_5.method2168(Static127.anInt3137);
		Static103.aClass1_Sub18_Sub1_5.method2168(63);
		return;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!a;I)V")
	public static void method1033(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt93;
		@Pc(102) int local102;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static113.anInt2820 == 0) {
				if (local8 == 1) {
					arg0.anInt60 = 0;
					arg0.aClass39_30 = Static101.aClass39_1244;
					return;
				}
				if (local8 == 2) {
					arg0.aClass39_30 = Static63.aClass39_808;
					arg0.anInt60 = 0;
					return;
				}
			}
			if (Static113.anInt2820 == 1) {
				if (local8 == 1) {
					arg0.aClass39_30 = Static18.aClass39_325;
					arg0.anInt60 = 0;
					return;
				}
				if (local8 == 2) {
					arg0.aClass39_30 = Static63.aClass39_809;
					arg0.anInt60 = 0;
					return;
				}
				if (local8 == 3) {
					arg0.anInt60 = 0;
					arg0.aClass39_30 = Static9.aClass39_1469;
					return;
				}
			}
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local102 = Static12.anInt502;
			if (Static113.anInt2820 != 2) {
				local102 = 0;
			}
			if (local8 >= local102) {
				arg0.anInt60 = 0;
				arg0.aClass39_30 = Static8.aClass39_147;
			} else {
				arg0.aClass39_30 = Static117.aClass39Array29[local8];
				arg0.anInt60 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local102 = Static12.anInt502;
			if (Static113.anInt2820 != 2) {
				local102 = 0;
			}
			if (local8 >= local102) {
				arg0.aClass39_30 = Static8.aClass39_147;
				arg0.anInt60 = 0;
			} else {
				if (Static14.anIntArray93[local8] == 0) {
					arg0.aClass39_30 = Static30.method601(new Class39[] { Static105.aClass39_1301, Static96.aClass39_1154 });
				} else if (Static14.anIntArray93[local8] < 5000) {
					if (Static98.anInt2390 == Static14.anIntArray93[local8]) {
						arg0.aClass39_30 = Static30.method601(new Class39[] { Static75.aClass39_924, Static88.aClass39_1064, Static69.method1226(Static14.anIntArray93[local8]) });
					} else {
						arg0.aClass39_30 = Static30.method601(new Class39[] { Static4.aClass39_64, Static88.aClass39_1064, Static69.method1226(Static14.anIntArray93[local8]) });
					}
				} else if (Static98.anInt2390 == Static14.anIntArray93[local8]) {
					arg0.aClass39_30 = Static30.method601(new Class39[] { Static75.aClass39_924, Static117.aClass39_1401, Static69.method1226(Static14.anIntArray93[local8] - 5000) });
				} else {
					arg0.aClass39_30 = Static30.method601(new Class39[] { Static4.aClass39_64, Static117.aClass39_1401, Static69.method1226(Static14.anIntArray93[local8] - 5000) });
				}
				arg0.anInt60 = 1;
			}
		} else if (local8 == 203) {
			local102 = Static12.anInt502;
			if (Static113.anInt2820 != 2) {
				local102 = 0;
			}
			arg0.anInt99 = local102 * 15 + 20;
			if (arg0.anInt82 >= arg0.anInt99) {
				arg0.anInt99 = arg0.anInt82 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static113.anInt2820 == 0) {
				arg0.anInt60 = 0;
				arg0.aClass39_30 = Static34.aClass39_492;
			} else if (local8 == 1 && Static113.anInt2820 == 0) {
				arg0.aClass39_30 = Static63.aClass39_808;
				arg0.anInt60 = 0;
			} else {
				local102 = Static108.anInt2750;
				if (Static113.anInt2820 == 0) {
					local102 = 0;
				}
				if (local102 <= local8) {
					arg0.aClass39_30 = Static8.aClass39_147;
					arg0.anInt60 = 0;
				} else {
					arg0.aClass39_30 = Static75.method1290(Static88.aLongArray4[local8]).method1153();
					arg0.anInt60 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt99 = Static108.anInt2750 * 15 + 20;
			if (arg0.anInt99 <= arg0.anInt82) {
				arg0.anInt99 = arg0.anInt82 + 1;
			}
		} else if (local8 == 324) {
			if (Static23.anInt805 == -1) {
				Static23.anInt805 = arg0.anInt71;
				Static94.anInt2223 = arg0.anInt55;
			}
			if (Static112.aClass28_2.aBoolean118) {
				arg0.anInt71 = Static23.anInt805;
			} else {
				arg0.anInt71 = Static94.anInt2223;
			}
		} else if (local8 == 325) {
			if (Static23.anInt805 == -1) {
				Static94.anInt2223 = arg0.anInt55;
				Static23.anInt805 = arg0.anInt71;
			}
			if (Static112.aClass28_2.aBoolean118) {
				arg0.anInt71 = Static94.anInt2223;
			} else {
				arg0.anInt71 = Static23.anInt805;
			}
		} else if (local8 == 327) {
			arg0.anInt54 = 150;
			arg0.anInt89 = (int) (Math.sin((double) Static45.anInt1256 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt100 = 5;
			arg0.anInt66 = 0;
		} else if (local8 == 328) {
			arg0.anInt54 = 150;
			arg0.anInt89 = (int) (Math.sin((double) Static45.anInt1256 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt100 = 5;
			arg0.anInt66 = 1;
		} else if (local8 == 600) {
			arg0.aClass39_30 = Static30.method601(new Class39[] { Static8.aClass39_152, Static67.aClass39_853 });
		} else if (local8 == 620) {
			if (anInt1566 < 1) {
				arg0.aClass39_30 = Static8.aClass39_147;
			} else if (Static46.aBoolean221) {
				arg0.aClass39_30 = Static1.aClass39_27;
				arg0.anInt108 = 16711680;
			} else {
				arg0.anInt108 = 16777215;
				arg0.aClass39_30 = Static64.aClass39_826;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public static void method1035() {
		aClass39_760 = null;
		aClass39_766 = null;
		aClass39_767 = null;
		aClass33_21 = null;
		aClass39_763 = null;
		aClass39_765 = null;
		aClass39_762 = null;
		aClass39_761 = null;
		aClass39_764 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
	public static int method1036(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg2 < 1 || arg5 > 102 || arg2 > 102) {
			return;
		}
		if (Static68.aBoolean149 && arg3 != Static9.anInt2983) {
			return;
		}
		@Pc(45) int local45 = 0;
		if (arg0 == 0) {
			local45 = Static32.aClass5_2.method141(arg3, arg5, arg2);
		}
		if (arg0 == 1) {
			local45 = Static32.aClass5_2.method142(arg3, arg5, arg2);
		}
		if (arg0 == 2) {
			local45 = Static32.aClass5_2.method123(arg3, arg5, arg2);
		}
		if (arg0 == 3) {
			local45 = Static32.aClass5_2.method102(arg3, arg5, arg2);
		}
		@Pc(94) int local94;
		if (local45 != 0) {
			local94 = Static32.aClass5_2.method122(arg3, arg5, arg2, local45);
			@Pc(98) int local98 = local94 & 0x1F;
			@Pc(104) int local104 = local45 >> 14 & 0x7FFF;
			@Pc(110) int local110 = local94 >> 6 & 0x3;
			@Pc(121) Class1_Sub1_Sub18 local121;
			if (arg0 == 0) {
				Static32.aClass5_2.method104(arg3, arg5, arg2);
				local121 = Static104.method1862(local104);
				if (local121.anInt3033 != 0) {
					Static62.aClass23Array2[arg3].method763(local121.aBoolean243, local110, arg2, arg5, local98);
				}
			}
			if (arg0 == 1) {
				Static32.aClass5_2.method95(arg3, arg5, arg2);
			}
			if (arg0 == 2) {
				Static32.aClass5_2.method125(arg3, arg5, arg2);
				local121 = Static104.method1862(local104);
				if (arg5 + local121.anInt3039 > 103 || arg2 + local121.anInt3039 > 103 || arg5 + local121.anInt3029 > 103 || arg2 + local121.anInt3029 > 103) {
					return;
				}
				if (local121.anInt3033 != 0) {
					Static62.aClass23Array2[arg3].method778(arg5, local121.anInt3029, local110, arg2, local121.anInt3039, local121.aBoolean243);
				}
			}
			if (arg0 == 3) {
				Static32.aClass5_2.method127(arg3, arg5, arg2);
				local121 = Static104.method1862(local104);
				if (local121.anInt3033 == 1) {
					Static62.aClass23Array2[arg3].method774(arg5, arg2);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		local94 = arg3;
		if (arg3 < 3 && (Static51.aByteArrayArrayArray3[1][arg5][arg2] & 0x2) == 2) {
			local94 = arg3 + 1;
		}
		Static112.method1962(local94, arg2, Static32.aClass5_2, arg3, arg6, Static62.aClass23Array2[arg3], arg1, arg5, arg4);
		return;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!q;BLclient!q;)V")
	public static void method1040(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		Static9.aClass62_34 = arg0;
		Static52.aClass62_14 = arg1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILclient!ua;IBZ)V")
	public static void method1041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg0);
		@Pc(17) Class1_Sub1_Sub15 local17 = (Class1_Sub1_Sub15) Static70.aClass70_8.method1961(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub1_Sub15) Static35.aClass70_1.method1961(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub1_Sub15) Static98.aClass70_9.method1961(local11);
		if (local17 == null) {
			if (!arg5) {
				local17 = (Class1_Sub1_Sub15) Static66.aClass70_7.method1961(local11);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class1_Sub1_Sub15();
			local17.anInt2638 = arg3;
			local17.aClass62_Sub1_68 = arg2;
			local17.aByte5 = arg4;
			if (arg5) {
				Static70.aClass70_8.method1955(local17, local11);
				Static52.anInt1452++;
			} else {
				Static71.aClass42_2.method1201(local17);
				Static98.aClass70_9.method1955(local17, local11);
				Static88.anInt2088++;
			}
		} else if (arg5) {
			local17.method2110();
			Static70.aClass70_8.method1955(local17, local11);
			Static88.anInt2088--;
			Static52.anInt1452++;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!q;ILclient!q;)V")
	public static void method1043(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		Static119.aClass62_32 = arg1;
		Static33.aClass62_8 = arg0;
		Static64.anInt1664 = Static119.aClass62_32.method1999(3);
	}
}
