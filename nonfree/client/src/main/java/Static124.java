import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array7;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt2736;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static int anInt2737;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1231 = Static32.method683("Weiter");

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1232 = Static32.method683("blaugr-Un:");

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1235 = Static32.method683("Please use a different world)3");

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1233 = aClass49_1235;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1234 = Static32.method683("(U5");

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1236 = Static32.method683("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1237 = aClass49_1236;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
	public static int anInt2746 = 0;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
	public static int[] anIntArray260 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1238 = aClass49_1235;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
	public static int anInt2747 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BI)I")
	public static int method2144(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static177.method2900(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method2145() {
		aClass49_1232 = null;
		anIntArray260 = null;
		aClass49_1238 = null;
		aClass49_1233 = null;
		aClass49_1235 = null;
		aClass49_1237 = null;
		aClass49_1234 = null;
		aClass2_Sub2_Sub2_Sub3Array7 = null;
		aBooleanArray15 = null;
		aClass49_1231 = null;
		aClass49_1236 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lclient!i;")
	public static Class2_Sub2_Sub9 method2146(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub9 local10 = (Class2_Sub2_Sub9) Static117.aClass74_69.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static62.aClass11_55.method2049(arg0, 6);
		local10 = new Class2_Sub2_Sub9();
		local10.anInt1495 = arg0;
		if (local22 != null) {
			local10.method1205(new Class2_Sub13(local22));
		}
		local10.method1204();
		if (local10.aBoolean61) {
			local10.aBoolean66 = false;
			local10.anInt1490 = 0;
		}
		Static117.aClass74_69.method2341((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILclient!ka;IJIIII)Z")
	public static boolean method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static108.method1829(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBLclient!u;I)V")
	public static void method2149(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub3_Sub7_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		if ((arg2 & 0x8) != 0) {
			local12 = Static86.aClass2_Sub13_Sub1_13.method2954();
			local16 = Static86.aClass2_Sub13_Sub1_13.method2954();
			arg1.method2738(local16, local12, Static127.anInt2757);
			arg1.anInt3575 = Static127.anInt2757 + 300;
			arg1.anInt3564 = Static86.aClass2_Sub13_Sub1_13.method2957();
		}
		if ((arg2 & 0x20) != 0) {
			local12 = Static86.aClass2_Sub13_Sub1_13.method2917();
			local16 = Static86.aClass2_Sub13_Sub1_13.method2954();
			@Pc(54) int local54 = Static86.aClass2_Sub13_Sub1_13.method2957();
			@Pc(57) int local57 = Static86.aClass2_Sub13_Sub1_13.anInt3940;
			if (arg1.aClass49_1606 != null && arg1.aClass10_2 != null) {
				@Pc(68) long local68 = arg1.aClass49_1606.method1651();
				@Pc(70) boolean local70 = false;
				if (local16 <= 1) {
					for (@Pc(77) int local77 = 0; local77 < Static18.anInt381; local77++) {
						if (Static76.aLongArray11[local77] == local68) {
							local70 = true;
							break;
						}
					}
				}
				if (!local70 && Static32.anInt846 == 0) {
					Static70.aClass2_Sub13_1.anInt3940 = 0;
					Static86.aClass2_Sub13_Sub1_13.method2955(local54, Static70.aClass2_Sub13_1.aByteArray49);
					Static70.aClass2_Sub13_1.anInt3940 = 0;
					@Pc(121) Class49 local121 = Static16.method618(Static53.method929(Static70.aClass2_Sub13_1).method1675());
					arg1.aClass49_1602 = local121.method1641();
					arg1.anInt3552 = local12 >> 8;
					arg1.anInt3563 = local12 & 0xFF;
					arg1.anInt3570 = 150;
					if (local16 == 2 || local16 == 3) {
						Static88.method1475(Static33.method692(new Class49[] { Static9.aClass49_87, arg1.aClass49_1606 }), local121, 1);
					} else if (local16 == 1) {
						Static88.method1475(Static33.method692(new Class49[] { Static63.aClass49_690, arg1.aClass49_1606 }), local121, 1);
					} else {
						Static88.method1475(arg1.aClass49_1606, local121, 2);
					}
				}
			}
			Static86.aClass2_Sub13_Sub1_13.anInt3940 = local57 + local54;
		}
		if ((arg2 & 0x2) != 0) {
			local12 = Static86.aClass2_Sub13_Sub1_13.method2954();
			@Pc(218) byte[] local218 = new byte[local12];
			@Pc(223) Class2_Sub13 local223 = new Class2_Sub13(local218);
			Static86.aClass2_Sub13_Sub1_13.method2953(local12, local218);
			Static134.aClass2_Sub13Array1[arg0] = local223;
			arg1.method2741(local223);
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt3576 = Static86.aClass2_Sub13_Sub1_13.method2957();
			arg1.anInt3532 = Static86.aClass2_Sub13_Sub1_13.method2954();
			arg1.anInt3549 = Static86.aClass2_Sub13_Sub1_13.method2937();
			arg1.anInt3579 = Static86.aClass2_Sub13_Sub1_13.method2937();
			arg1.anInt3526 = Static86.aClass2_Sub13_Sub1_13.method2917() + Static127.anInt2757;
			arg1.anInt3533 = Static86.aClass2_Sub13_Sub1_13.method2933() + Static127.anInt2757;
			arg1.anInt3541 = Static86.aClass2_Sub13_Sub1_13.method2962();
			arg1.anInt3543 = 1;
			arg1.anInt3540 = 0;
		}
		if ((arg2 & 0x40) != 0) {
			arg1.anInt3567 = Static86.aClass2_Sub13_Sub1_13.method2917();
			arg1.anInt3561 = Static86.aClass2_Sub13_Sub1_13.method2958();
		}
		if ((arg2 & 0x80) != 0) {
			arg1.aClass49_1602 = Static86.aClass2_Sub13_Sub1_13.method2926();
			if (arg1.aClass49_1602.method1646(0) == 126) {
				arg1.aClass49_1602 = arg1.aClass49_1602.method1665(1);
				Static88.method1475(arg1.aClass49_1606, arg1.aClass49_1602, 2);
			} else if (arg1 == Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1) {
				Static88.method1475(arg1.aClass49_1606, arg1.aClass49_1602, 2);
			}
			arg1.anInt3552 = 0;
			arg1.anInt3570 = 150;
			arg1.anInt3563 = 0;
		}
		if ((arg2 & 0x10) != 0) {
			local12 = Static86.aClass2_Sub13_Sub1_13.method2939();
			if (local12 == 65535) {
				local12 = -1;
			}
			local16 = Static86.aClass2_Sub13_Sub1_13.method2937();
			Static9.method130(local16, local12, arg1);
		}
		if ((arg2 & 0x1) != 0) {
			arg1.anInt3556 = Static86.aClass2_Sub13_Sub1_13.method2939();
			if (arg1.anInt3556 == 65535) {
				arg1.anInt3556 = -1;
			}
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt3557 = Static86.aClass2_Sub13_Sub1_13.method2958();
			local12 = Static86.aClass2_Sub13_Sub1_13.method2946();
			arg1.anInt3577 = local12 >> 16;
			if (arg1.anInt3557 == 65535) {
				arg1.anInt3557 = -1;
			}
			arg1.anInt3584 = Static127.anInt2757 + (local12 & 0xFFFF);
			arg1.anInt3534 = 0;
			arg1.anInt3569 = 0;
			if (Static127.anInt2757 < arg1.anInt3584) {
				arg1.anInt3569 = -1;
			}
		}
		if ((arg2 & 0x400) != 0) {
			local12 = Static86.aClass2_Sub13_Sub1_13.method2962();
			local16 = Static86.aClass2_Sub13_Sub1_13.method2962();
			arg1.method2738(local16, local12, Static127.anInt2757);
		}
	}
}
