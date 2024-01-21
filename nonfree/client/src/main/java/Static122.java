import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "Lclient!le;")
	public static Class4_Sub15 aClass4_Sub15_1;

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
	public static int anInt2958 = 0;

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "Lclient!bg;")
	public static final Class11 aClass11_13 = new Class11();

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "[[[Lclient!bg;")
	public static final Class11[][][] aClass11ArrayArrayArray1 = new Class11[4][104][104];

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1082 = Static177.method3050(" ");

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1083 = aClass46_1082;

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
	public static int anInt2962 = 127;

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1084 = Static177.method3050("Create a free account");

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "I")
	public static int anInt2963 = 0;

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1085 = Static177.method3050("<br>(X");

	@OriginalMember(owner = "client!ob", name = "ob", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1086 = aClass46_1084;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!jc;I)V")
	public static void method2202(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if ((arg0 & 0x1) != 0) {
			arg1.anInt2799 = Static162.aClass4_Sub11_Sub1_3.method1252();
			if (arg1.anInt2799 == 65535) {
				arg1.anInt2799 = -1;
			}
		}
		@Pc(42) int local42;
		if ((arg0 & 0x200) != 0) {
			arg1.anInt2825 = Static162.aClass4_Sub11_Sub1_3.method1224();
			local42 = Static162.aClass4_Sub11_Sub1_3.method1243();
			arg1.anInt2827 = 0;
			arg1.anInt2807 = local42 >> 16;
			arg1.anInt2798 = (local42 & 0xFFFF) + Static142.anInt3325;
			if (arg1.anInt2798 > Static142.anInt3325) {
				arg1.anInt2827 = -1;
			}
			arg1.anInt2788 = 0;
			if (arg1.anInt2825 == 65535) {
				arg1.anInt2825 = -1;
			}
		}
		@Pc(97) int local97;
		if ((arg0 & 0x40) != 0) {
			local42 = Static162.aClass4_Sub11_Sub1_3.method1235();
			if (local42 == 65535) {
				local42 = -1;
			}
			local97 = Static162.aClass4_Sub11_Sub1_3.method1253();
			Static113.method2088(local97, arg1, local42);
		}
		if ((arg0 & 0x80) != 0) {
			arg1.aClass46_1037 = Static162.aClass4_Sub11_Sub1_3.method1247();
			if (arg1.aClass46_1037.method1672(0) == 126) {
				arg1.aClass46_1037 = arg1.aClass46_1037.method1650(1);
				Static105.method1982(arg1.aClass46_796, 2, arg1.aClass46_1037);
			} else if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1 == arg1) {
				Static105.method1982(arg1.aClass46_796, 2, arg1.aClass46_1037);
			}
			arg1.anInt2811 = 0;
			arg1.anInt2826 = 150;
			arg1.anInt2828 = 0;
		}
		if ((arg0 & 0x10) != 0) {
			local42 = Static162.aClass4_Sub11_Sub1_3.method1228();
			@Pc(169) byte[] local169 = new byte[local42];
			@Pc(174) Class4_Sub11 local174 = new Class4_Sub11(local169);
			Static162.aClass4_Sub11_Sub1_3.method1264(local169, local42);
			Static50.aClass4_Sub11Array1[arg2] = local174;
			arg1.method1638(local174);
		}
		if ((arg0 & 0x100) != 0) {
			local42 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local97 = Static162.aClass4_Sub11_Sub1_3.method1271();
			arg1.method2113(local42, Static142.anInt3325, local97);
		}
		if ((arg0 & 0x20) != 0) {
			local42 = Static162.aClass4_Sub11_Sub1_3.method1235();
			local97 = Static162.aClass4_Sub11_Sub1_3.method1253();
			@Pc(228) int local228 = Static162.aClass4_Sub11_Sub1_3.method1253();
			@Pc(231) int local231 = Static162.aClass4_Sub11_Sub1_3.anInt1597;
			if (arg1.aClass46_796 != null && arg1.aClass43_1 != null) {
				@Pc(242) long local242 = arg1.aClass46_796.method1646();
				@Pc(244) boolean local244 = false;
				if (local97 <= 1) {
					for (@Pc(249) int local249 = 0; local249 < Static57.anInt1403; local249++) {
						if (Static129.aLongArray33[local249] == local242) {
							local244 = true;
							break;
						}
					}
				}
				if (!local244 && Static174.anInt3915 == 0) {
					Static130.aClass4_Sub11_5.anInt1597 = 0;
					Static162.aClass4_Sub11_Sub1_3.method1233(Static130.aClass4_Sub11_5.aByteArray19, local228);
					Static130.aClass4_Sub11_5.anInt1597 = 0;
					@Pc(300) Class46 local300 = Static138.method891(Static100.method1915(Static130.aClass4_Sub11_5).method1670());
					arg1.aClass46_1037 = local300.method1644();
					arg1.anInt2826 = 150;
					arg1.anInt2828 = local42 >> 8;
					arg1.anInt2811 = local42 & 0xFF;
					if (local97 == 2 || local97 == 3) {
						Static105.method1982(Static69.method1482(new Class46[] { Static57.aClass46_548, arg1.aClass46_796 }), 1, local300);
					} else if (local97 == 1) {
						Static105.method1982(Static69.method1482(new Class46[] { Static106.aClass46_959, arg1.aClass46_796 }), 1, local300);
					} else {
						Static105.method1982(arg1.aClass46_796, 2, local300);
					}
				}
			}
			Static162.aClass4_Sub11_Sub1_3.anInt1597 = local228 + local231;
		}
		if ((arg0 & 0x8) != 0) {
			local42 = Static162.aClass4_Sub11_Sub1_3.method1221();
			local97 = Static162.aClass4_Sub11_Sub1_3.method1253();
			arg1.method2113(local42, Static142.anInt3325, local97);
			arg1.anInt2831 = Static142.anInt3325 + 300;
			arg1.anInt2845 = Static162.aClass4_Sub11_Sub1_3.method1271();
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt2802 = Static162.aClass4_Sub11_Sub1_3.method1253();
			arg1.anInt2806 = Static162.aClass4_Sub11_Sub1_3.method1228();
			arg1.anInt2842 = Static162.aClass4_Sub11_Sub1_3.method1221();
			arg1.anInt2804 = Static162.aClass4_Sub11_Sub1_3.method1221();
			arg1.anInt2835 = Static162.aClass4_Sub11_Sub1_3.method1252() + Static142.anInt3325;
			arg1.anInt2821 = Static162.aClass4_Sub11_Sub1_3.method1275() + Static142.anInt3325;
			arg1.anInt2815 = Static162.aClass4_Sub11_Sub1_3.method1228();
			arg1.anInt2823 = 1;
			arg1.anInt2836 = 0;
		}
		if ((arg0 & 0x4) != 0) {
			arg1.anInt2817 = Static162.aClass4_Sub11_Sub1_3.method1275();
			arg1.anInt2791 = Static162.aClass4_Sub11_Sub1_3.method1224();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	public static void method2203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass17_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	public static void method2205() {
		try {
			if (Static156.anInt3534 == 0) {
				if (Static59.aClass27_2 != null) {
					Static59.aClass27_2.method952();
					Static59.aClass27_2 = null;
				}
				Static147.aClass84_2 = null;
				Static156.anInt3534 = 1;
				Static10.aBoolean21 = false;
				Static30.anInt767 = 0;
			}
			if (Static156.anInt3534 == 1) {
				if (Static147.aClass84_2 == null) {
					Static147.aClass84_2 = Static126.aClass76_4.method2564(Static57.aString1, Static121.anInt2925);
				}
				if (Static147.aClass84_2.anInt3578 == 2) {
					throw new IOException();
				}
				if (Static147.aClass84_2.anInt3578 == 1) {
					Static59.aClass27_2 = new Class27((Socket) Static147.aClass84_2.anObject4, Static126.aClass76_4);
					Static156.anInt3534 = 2;
					Static147.aClass84_2 = null;
				}
			}
			if (Static156.anInt3534 == 2) {
				@Pc(70) long local70 = Static80.aLong73 = Static3.aClass46_38.method1646();
				@Pc(77) int local77 = (int) (local70 >> 16 & 0x1FL);
				Static90.aClass4_Sub11_Sub1_1.anInt1597 = 0;
				Static90.aClass4_Sub11_Sub1_1.method1238(14);
				Static90.aClass4_Sub11_Sub1_1.method1238(local77);
				Static59.aClass27_2.method957(Static90.aClass4_Sub11_Sub1_1.aByteArray19, 2);
				Static156.anInt3534 = 3;
				Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
			}
			@Pc(125) int local125;
			if (Static156.anInt3534 == 3) {
				if (Static156.aClass41_2 != null) {
					Static156.aClass41_2.method2048();
				}
				if (Static43.aClass41_1 != null) {
					Static43.aClass41_1.method2048();
				}
				local125 = Static59.aClass27_2.method954();
				if (Static156.aClass41_2 != null) {
					Static156.aClass41_2.method2048();
				}
				if (Static43.aClass41_1 != null) {
					Static43.aClass41_1.method2048();
				}
				if (local125 != 0) {
					Static7.method108(local125);
					return;
				}
				Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
				Static156.anInt3534 = 4;
			}
			if (Static156.anInt3534 == 4) {
				if (Static162.aClass4_Sub11_Sub1_3.anInt1597 < 8) {
					local125 = Static59.aClass27_2.method959();
					if (8 - Static162.aClass4_Sub11_Sub1_3.anInt1597 < local125) {
						local125 = 8 - Static162.aClass4_Sub11_Sub1_3.anInt1597;
					}
					if (local125 > 0) {
						Static59.aClass27_2.method951(Static162.aClass4_Sub11_Sub1_3.anInt1597, local125, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
						Static162.aClass4_Sub11_Sub1_3.anInt1597 += local125;
					}
				}
				if (Static162.aClass4_Sub11_Sub1_3.anInt1597 == 8) {
					Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
					Static57.aLong49 = Static162.aClass4_Sub11_Sub1_3.method1258();
					Static156.anInt3534 = 5;
				}
			}
			if (Static156.anInt3534 == 5) {
				Static90.aClass4_Sub11_Sub1_1.anInt1597 = 0;
				@Pc(228) int[] local228 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static57.aLong49 >> 32), (int) Static57.aLong49 };
				Static90.aClass4_Sub11_Sub1_1.method1238(10);
				Static90.aClass4_Sub11_Sub1_1.method1256(local228[0]);
				Static90.aClass4_Sub11_Sub1_1.method1256(local228[1]);
				Static90.aClass4_Sub11_Sub1_1.method1256(local228[2]);
				Static90.aClass4_Sub11_Sub1_1.method1256(local228[3]);
				Static90.aClass4_Sub11_Sub1_1.method1269(Static3.aClass46_38.method1646());
				Static90.aClass4_Sub11_Sub1_1.method1276(Static3.aClass46_31);
				Static90.aClass4_Sub11_Sub1_1.method1232(Static143.aBigInteger1, Static156.aBigInteger2);
				Static129.aClass4_Sub11_Sub1_2.anInt1597 = 0;
				if (Static143.anInt3333 == 40) {
					Static129.aClass4_Sub11_Sub1_2.method1238(18);
				} else {
					Static129.aClass4_Sub11_Sub1_2.method1238(16);
				}
				Static129.aClass4_Sub11_Sub1_2.method1238(Static90.aClass4_Sub11_Sub1_1.anInt1597 + Static106.method2000(Static77.aClass46_738) + 125);
				Static129.aClass4_Sub11_Sub1_2.method1256(488);
				Static129.aClass4_Sub11_Sub1_2.method1238(Static103.aBoolean113 ? 1 : 0);
				Static106.method1994(Static129.aClass4_Sub11_Sub1_2);
				Static129.aClass4_Sub11_Sub1_2.method1276(Static77.aClass46_738);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static81.anInt2016);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static102.aClass62_Sub1_63.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static15.aClass62_Sub1_14.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static84.aClass62_Sub1_101.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static76.aClass62_Sub1_95.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static188.aClass62_Sub1_103.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static160.aClass62_Sub1_88.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static73.aClass62_Sub1_47.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static25.aClass62_Sub1_20.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static52.aClass62_Sub1_37.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static28.aClass62_Sub1_22.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static22.aClass62_Sub1_17.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static111.aClass62_Sub1_65.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static13.aClass62_Sub1_12.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static175.aClass62_Sub1_94.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static76.aClass62_Sub1_96.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static15.aClass62_Sub1_13.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static139.aClass62_Sub1_78.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static176.aClass62_Sub1_98.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static23.aClass62_Sub1_18.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static10.aClass62_Sub1_9.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static86.aClass62_Sub1_54.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static112.aClass62_Sub1_102.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1256(Static129.aClass62_Sub1_71.anInt3737);
				Static129.aClass4_Sub11_Sub1_2.method1239(Static90.aClass4_Sub11_Sub1_1.aByteArray19, Static90.aClass4_Sub11_Sub1_1.anInt1597);
				Static59.aClass27_2.method957(Static129.aClass4_Sub11_Sub1_2.aByteArray19, Static129.aClass4_Sub11_Sub1_2.anInt1597);
				Static90.aClass4_Sub11_Sub1_1.method1283(local228);
				for (@Pc(502) int local502 = 0; local502 < 4; local502++) {
					local228[local502] += 50;
				}
				Static162.aClass4_Sub11_Sub1_3.method1283(local228);
				Static156.anInt3534 = 6;
			}
			if (Static156.anInt3534 == 6 && Static59.aClass27_2.method959() > 0) {
				local125 = Static59.aClass27_2.method954();
				if (local125 == 21 && Static143.anInt3333 == 20) {
					Static156.anInt3534 = 7;
				} else if (local125 == 2) {
					Static156.anInt3534 = 9;
				} else if (local125 == 15 && Static143.anInt3333 == 40) {
					Static128.method2253();
					return;
				} else if (local125 == 23 && Static178.anInt3990 < 1) {
					Static156.anInt3534 = 0;
					Static178.anInt3990++;
				} else {
					Static7.method108(local125);
					return;
				}
			}
			if (Static156.anInt3534 == 7 && Static59.aClass27_2.method959() > 0) {
				Static50.anInt1275 = Static59.aClass27_2.method954() * 60 + 180;
				Static156.anInt3534 = 8;
			}
			if (Static156.anInt3534 == 8) {
				Static30.anInt767 = 0;
				Static85.method1709(Static69.method1482(new Class46[] { Static127.method2240(Static50.anInt1275 / 60), Static29.aClass46_245 }), Static49.aClass46_484, Static26.aClass46_217);
				if (--Static50.anInt1275 <= 0) {
					Static156.anInt3534 = 0;
				}
			} else {
				if (Static156.anInt3534 == 9 && Static59.aClass27_2.method959() >= 9) {
					Static79.anInt1991 = Static59.aClass27_2.method954();
					Static147.anInt729 = Static59.aClass27_2.method954();
					Static69.aBoolean83 = Static59.aClass27_2.method954() == 1;
					Static151.anInt3441 = Static59.aClass27_2.method954();
					Static151.anInt3441 <<= 0x8;
					Static151.anInt3441 += Static59.aClass27_2.method954();
					Static21.anInt574 = Static59.aClass27_2.method954();
					Static59.aClass27_2.method951(0, 1, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
					Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
					Static55.anInt1368 = Static162.aClass4_Sub11_Sub1_3.method1284();
					Static59.aClass27_2.method951(0, 2, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
					Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
					Static132.anInt3166 = Static162.aClass4_Sub11_Sub1_3.method1252();
					Static156.anInt3534 = 10;
				}
				if (Static156.anInt3534 != 10) {
					Static30.anInt767++;
					if (Static30.anInt767 > 2000) {
						if (Static178.anInt3990 < 1) {
							Static156.anInt3534 = 0;
							Static178.anInt3990++;
							if (Static121.anInt2925 == Static93.anInt2386) {
								Static121.anInt2925 = Static144.anInt3350;
							} else {
								Static121.anInt2925 = Static93.anInt2386;
							}
						} else {
							Static7.method108(-3);
						}
					}
				} else if (Static59.aClass27_2.method959() >= Static132.anInt3166) {
					Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
					Static59.aClass27_2.method951(0, Static132.anInt3166, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
					Static2.method19();
					Static60.anInt1484 = -1;
					Static3.method22(false);
					Static55.anInt1368 = -1;
				}
			}
		} catch (@Pc(803) IOException local803) {
			if (Static178.anInt3990 < 1) {
				Static178.anInt3990++;
				Static156.anInt3534 = 0;
				if (Static121.anInt2925 == Static93.anInt2386) {
					Static121.anInt2925 = Static144.anInt3350;
				} else {
					Static121.anInt2925 = Static93.anInt2386;
				}
			} else {
				Static7.method108(-2);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IZI)I")
	public static int method2206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class4_Sub16 local11 = (Class4_Sub16) Static25.aClass20_1.method505((long) arg1);
		if (local11 == null) {
			return -1;
		} else if (arg0 >= 0 && local11.anIntArray245.length > arg0) {
			return local11.anIntArray245[arg0];
		} else {
			return -1;
		}
	}
}
