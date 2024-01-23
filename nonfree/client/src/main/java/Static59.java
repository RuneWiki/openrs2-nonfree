import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "[[[Lclient!i;")
	public static Class1_Sub14[][][] aClass1_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public static int anInt1529 = 0;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "[I")
	public static int[] anIntArray155 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
	public static int anInt1532 = 0;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	public static int anInt1534 = 0;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "J")
	public static volatile long aLong58 = 0L;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
	public static int anInt1538 = 0;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Lclient!ok;")
	public static Class116 aClass116_2 = null;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ok;Z)Z")
	public static boolean method1156(@OriginalArg(0) Class116 arg0) {
		if (arg0.anInt4301 == 205) {
			Static179.anInt4031 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!c;Z)V")
	public static void method1157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25_Sub1_Sub1 arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if ((arg0 & 0x20) != 0) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2650();
			local18 = Static222.aClass1_Sub16_Sub1_3.method2655();
			@Pc(22) int local22 = Static222.aClass1_Sub16_Sub1_3.method2649();
			local25 = Static222.aClass1_Sub16_Sub1_3.anInt3328;
			@Pc(34) boolean local34 = (local14 & 0x8000) != 0;
			if (arg2.aString26 != null && arg2.aClass147_2 != null) {
				@Pc(46) long local46 = Static94.method4774(arg2.aString26);
				@Pc(48) boolean local48 = false;
				if (local18 <= 1) {
					if (!local34 && (Static19.aBoolean25 && !Static291.aBoolean326 || Static144.aBoolean171)) {
						local48 = true;
					} else {
						for (@Pc(68) int local68 = 0; local68 < Static253.anInt5514; local68++) {
							if (Static3.aLongArray1[local68] == local46) {
								local48 = true;
								break;
							}
						}
					}
				}
				if (!local48 && Static10.anInt278 == 0) {
					Static57.aClass1_Sub16_4.anInt3328 = 0;
					Static222.aClass1_Sub16_Sub1_3.method2665(Static57.aClass1_Sub16_4.aByteArray39, local22);
					Static57.aClass1_Sub16_4.anInt3328 = 0;
					@Pc(108) int local108 = -1;
					@Pc(127) String local127;
					if (local34) {
						local14 &= 0x7FFF;
						@Pc(118) Class18 local118 = Static130.method2200(Static57.aClass1_Sub16_4);
						local108 = local118.anInt457;
						local127 = local118.aClass1_Sub2_Sub20_1.method4528(Static57.aClass1_Sub16_4);
					} else {
						local127 = Static168.method3970(Static199.method3573(Static167.method3095(Static57.aClass1_Sub16_4)));
					}
					arg2.aString52 = local127.trim();
					arg2.anInt1675 = 150;
					arg2.anInt1678 = local14 >> 8;
					arg2.anInt1620 = local14 & 0xFF;
					if (local18 == 2) {
						Static120.method2661(local127, local34 ? 17 : 1, null, local108, "<img=1>" + arg2.method498());
					} else if (local18 == 1) {
						Static120.method2661(local127, local34 ? 17 : 1, null, local108, "<img=0>" + arg2.method498());
					} else {
						Static120.method2661(local127, local34 ? 17 : 2, null, local108, arg2.method498());
					}
				}
			}
			Static222.aClass1_Sub16_Sub1_3.anInt3328 = local22 + local25;
		}
		if ((arg0 & 0x1) != 0) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2618();
			local18 = Static222.aClass1_Sub16_Sub1_3.method2655();
			arg2.method1236(local18, local14, Static32.anInt809);
			arg2.anInt1644 = Static32.anInt809 + 300;
			arg2.anInt1682 = Static222.aClass1_Sub16_Sub1_3.method2653();
		}
		if ((arg0 & 0x80) != 0) {
			arg2.anInt1631 = Static222.aClass1_Sub16_Sub1_3.method2640();
			if (arg2.anInt1631 == 65535) {
				arg2.anInt1631 = -1;
			}
		}
		if ((arg0 & 0x10) != 0) {
			arg2.aString52 = Static222.aClass1_Sub16_Sub1_3.method2611();
			if (arg2.aString52.charAt(0) == '~') {
				arg2.aString52 = arg2.aString52.substring(1);
				Static89.method1540(2, arg2.method498(), arg2.aString52);
			} else if (Static239.aClass25_Sub1_Sub1_2 == arg2) {
				Static89.method1540(2, arg2.method498(), arg2.aString52);
			}
			arg2.anInt1678 = 0;
			arg2.anInt1675 = 150;
			arg2.anInt1620 = 0;
		}
		if ((arg0 & 0x200) != 0) {
			arg2.anInt1609 = Static222.aClass1_Sub16_Sub1_3.method2663();
			arg2.anInt1647 = Static222.aClass1_Sub16_Sub1_3.method2649();
			arg2.anInt1641 = Static222.aClass1_Sub16_Sub1_3.method2649();
			arg2.anInt1612 = Static222.aClass1_Sub16_Sub1_3.method2649();
			arg2.anInt1633 = Static222.aClass1_Sub16_Sub1_3.method2640() + Static32.anInt809;
			arg2.anInt1630 = Static222.aClass1_Sub16_Sub1_3.method2650() + Static32.anInt809;
			arg2.anInt1618 = Static222.aClass1_Sub16_Sub1_3.method2663();
			arg2.anInt1652 = 0;
			arg2.anInt1610 = 1;
		}
		if ((arg0 & 0x40) != 0) {
			arg2.anInt1623 = Static222.aClass1_Sub16_Sub1_3.method2652();
			arg2.anInt1655 = Static222.aClass1_Sub16_Sub1_3.method2613();
		}
		if ((arg0 & 0x100) != 0) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2653();
			@Pc(426) int[] local426 = new int[local14];
			@Pc(429) int[] local429 = new int[local14];
			@Pc(432) int[] local432 = new int[local14];
			for (@Pc(434) int local434 = 0; local434 < local14; local434++) {
				@Pc(441) int local441 = Static222.aClass1_Sub16_Sub1_3.method2640();
				if (local441 == 65535) {
					local441 = -1;
				}
				local426[local434] = local441;
				local429[local434] = Static222.aClass1_Sub16_Sub1_3.method2655();
				local432[local434] = Static222.aClass1_Sub16_Sub1_3.method2613();
			}
			Static250.method1409(local429, local426, arg2, local432);
		}
		if ((arg0 & 0x8) != 0) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2613();
			if (local14 == 65535) {
				local14 = -1;
			}
			local18 = Static222.aClass1_Sub16_Sub1_3.method2663();
			Static182.method3512(local18, arg2, local14);
		}
		if ((arg0 & 0x2) != 0) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2649();
			@Pc(510) byte[] local510 = new byte[local14];
			@Pc(515) Class1_Sub16 local515 = new Class1_Sub16(local510);
			Static222.aClass1_Sub16_Sub1_3.method2632(local510, local14);
			Static177.aClass1_Sub16Array1[arg1] = local515;
			arg2.method496(local515);
		}
		if ((arg0 & 0x400) != 0) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2652();
			local18 = Static222.aClass1_Sub16_Sub1_3.method2616();
			if (local14 == 65535) {
				local14 = -1;
			}
			@Pc(554) boolean local554 = true;
			if (local14 != -1 && arg2.anInt1669 != -1 && Static115.method1895(Static43.method942(local14).anInt5107).anInt5905 < Static115.method1895(Static43.method942(arg2.anInt1669).anInt5107).anInt5905) {
				local554 = false;
			}
			if (local554) {
				arg2.anInt1660 = local18 >> 16;
				arg2.anInt1669 = local14;
				arg2.anInt1671 = 1;
				arg2.anInt1605 = (local18 & 0xFFFF) + Static32.anInt809;
				arg2.anInt1645 = 0;
				arg2.anInt1616 = 0;
				if (Static32.anInt809 < arg2.anInt1605) {
					arg2.anInt1616 = -1;
				}
				if (arg2.anInt1669 != -1 && arg2.anInt1605 == Static32.anInt809) {
					local25 = Static43.method942(arg2.anInt1669).anInt5107;
					if (local25 != -1) {
						@Pc(641) Class163 local641 = Static115.method1895(local25);
						if (local641 != null && local641.anIntArray587 != null) {
							Static188.method3369(arg2.anInt1604, local641, 0, arg2.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg2);
						}
					}
				}
			}
		}
		if ((arg0 & 0x800) != 0) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2618();
			local18 = Static222.aClass1_Sub16_Sub1_3.method2653();
			arg2.method1236(local18, local14, Static32.anInt809);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Lclient!cj;")
	public static Class31 method1161(@OriginalArg(1) int arg0) {
		@Pc(6) Class31 local6 = (Class31) Static144.aClass155_28.method4358((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static108.aClass83_68.method2306(30, arg0);
		local6 = new Class31();
		if (local28 != null) {
			local6.method728(arg0, new Class1_Sub16(local28));
		}
		Static144.aClass155_28.method4360((long) arg0, local6);
		return local6;
	}
}
