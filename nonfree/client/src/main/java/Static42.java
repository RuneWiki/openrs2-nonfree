import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ib", name = "kc", descriptor = "Lclient!ja;")
	public static Class33 aClass33_29;

	@OriginalMember(owner = "client!ib", name = "Lc", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array44;

	@OriginalMember(owner = "client!ib", name = "rb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_27 = new Class37(50);

	@OriginalMember(owner = "client!ib", name = "dc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1381 = Static23.method501("cross");

	@OriginalMember(owner = "client!ib", name = "lc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1382 = Static23.method501("Report abuse");

	@OriginalMember(owner = "client!ib", name = "vc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1383 = Static23.method501("@yel@*V");

	@OriginalMember(owner = "client!ib", name = "yc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1384 = aClass42_1382;

	@OriginalMember(owner = "client!ib", name = "Nc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1388 = Static23.method501("Enter name of player to add to list");

	@OriginalMember(owner = "client!ib", name = "Ic", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1385 = aClass42_1388;

	@OriginalMember(owner = "client!ib", name = "Kc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1386 = Static23.method501("Loaded input handler");

	@OriginalMember(owner = "client!ib", name = "Mc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1387 = aClass42_1386;

	@OriginalMember(owner = "client!ib", name = "Oc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1389 = Static23.method501("(X100(U(Y");

	@OriginalMember(owner = "client!ib", name = "Qc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1390 = Static23.method501("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
	public static void method1753() {
		aClass42_1385 = null;
		aClass42_1388 = null;
		aClass42_1386 = null;
		aClass42_1390 = null;
		aClass1_Sub1_Sub1_Sub1Array44 = null;
		aClass42_1384 = null;
		aClass42_1383 = null;
		aClass42_1389 = null;
		aClass42_1387 = null;
		aClass37_27 = null;
		aClass42_1382 = null;
		aClass33_29 = null;
		aClass42_1381 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!de;)V")
	public static void method1754(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.anInt594 == 0) {
			local1 = Static88.aClass20_1.method474(arg0.anInt589, arg0.anInt596, arg0.anInt583);
		}
		if (arg0.anInt594 == 1) {
			local1 = Static88.aClass20_1.method470(arg0.anInt589, arg0.anInt596, arg0.anInt583);
		}
		if (arg0.anInt594 == 2) {
			local1 = Static88.aClass20_1.method467(arg0.anInt589, arg0.anInt596, arg0.anInt583);
		}
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = -1;
		@Pc(52) int local52 = 0;
		if (arg0.anInt594 == 3) {
			local1 = Static88.aClass20_1.method481(arg0.anInt589, arg0.anInt596, arg0.anInt583);
		}
		if (local1 != 0) {
			local50 = local1 >> 14 & 0x7FFF;
			@Pc(83) int local83 = Static88.aClass20_1.method460(arg0.anInt589, arg0.anInt596, arg0.anInt583, local1);
			local52 = local83 >> 6 & 0x3;
			local48 = local83 & 0x1F;
		}
		arg0.anInt593 = local48;
		arg0.anInt590 = local52;
		arg0.anInt597 = local50;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(II)Lclient!je;")
	public static Class1_Sub1_Sub9 method1755(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub9 local12 = (Class1_Sub1_Sub9) Static2.aClass37_2.method982((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static80.aClass33_23.method1305(arg0, 6);
		local12 = new Class1_Sub1_Sub9();
		local12.anInt1248 = arg0;
		if (local27 != null) {
			local12.method883(new Class1_Sub8(local27));
		}
		local12.method880();
		if (local12.aBoolean70) {
			local12.aBoolean71 = false;
			local12.aBoolean75 = false;
		}
		Static2.aClass37_2.method981((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
	public static int method1756(@OriginalArg(1) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 <= 0 || local11 >= 256) {
			local11 = -1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[B[Lclient!ba;)V")
	public static void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) Class6[] arg5) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 64; local4++) {
				for (local7 = 0; local7 < 64; local7++) {
					if (local4 + arg0 > 0 && local4 + arg0 < 103 && arg2 + local7 > 0 && local7 + arg2 < 103) {
						arg5[local1].anIntArrayArray1[local4 + arg0][local7 + arg2] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(83) Class1_Sub8 local83 = new Class1_Sub8(arg4);
		for (local7 = 0; local7 < 4; local7++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					Static58.method1004(local83, arg0 + local92, arg3, arg1, local95 + arg2, 0, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ja;Lclient!mc;Lclient!mc;B)Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 method1760(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2) {
		@Pc(19) int local19 = arg0.method1302(arg1);
		@Pc(25) int local25 = arg0.method1320(arg2, local19);
		return Static56.method1003(local19, local25, arg0);
	}

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "(I)V")
	public static void method1764() {
		if (Static30.anInt828 != 0) {
			return;
		}
		Static36.aClass42Array6[0] = Static49.aClass42_695;
		Static1.anIntArray1[0] = 1006;
		Static83.anInt2216 = 1;
		if (Static43.anInt1144 != -1) {
			Static70.anInt1793 = -1;
			Static103.anInt2663 = -1;
			Static99.method1728(Static73.anInt1884, 503, 0, Static43.anInt1144, 765, Static38.anInt948, 0, 0, 0, -1);
			Static6.anInt142 = Static70.anInt1793;
			Static11.anInt356 = Static103.anInt2663;
			return;
		}
		@Pc(47) boolean local47 = false;
		Static73.method1323();
		Static103.anInt2663 = -1;
		Static70.anInt1793 = -1;
		if (Static73.anInt1884 > 4 && Static38.anInt948 > 4 && Static73.anInt1884 < 516 && Static38.anInt948 < 338) {
			if (Static108.anInt2743 == -1) {
				Static8.method177();
			} else {
				Static99.method1728(Static73.anInt1884, 338, 0, Static108.anInt2743, 516, Static38.anInt948, 4, 4, 0, -1);
			}
		}
		Static6.anInt142 = Static70.anInt1793;
		Static11.anInt356 = Static103.anInt2663;
		Static103.anInt2663 = -1;
		Static70.anInt1793 = -1;
		if (Static73.anInt1884 > 553 && Static38.anInt948 > 205 && Static73.anInt1884 < 743 && Static38.anInt948 < 466) {
			if (Static29.anInt819 != -1) {
				Static99.method1728(Static73.anInt1884, 466, 0, Static29.anInt819, 743, Static38.anInt948, 553, 205, 1, -1);
			} else if (Static10.anIntArray33[Static108.anInt2748] != -1) {
				Static99.method1728(Static73.anInt1884, 466, 0, Static10.anIntArray33[Static108.anInt2748], 743, Static38.anInt948, 553, 205, 1, -1);
			}
		}
		if (Static70.anInt1793 != Static97.anInt2484) {
			Static97.anInt2484 = Static70.anInt1793;
			Static89.aBoolean132 = true;
		}
		Static70.anInt1793 = -1;
		if (Static101.anInt2641 != Static103.anInt2663) {
			Static89.aBoolean132 = true;
			Static101.anInt2641 = Static103.anInt2663;
		}
		Static103.anInt2663 = -1;
		if (Static73.anInt1884 > 17 && Static38.anInt948 > 357 && Static73.anInt1884 < 496 && Static38.anInt948 < 453) {
			if (Static108.anInt2745 != -1) {
				Static99.method1728(Static73.anInt1884, 453, 0, Static108.anInt2745, 496, Static38.anInt948, 17, 357, 2, -1);
			} else if (Static45.anInt1850 != -1) {
				Static99.method1728(Static73.anInt1884, 453, 0, Static45.anInt1850, 496, Static38.anInt948, 17, 357, 3, -1);
			} else if (Static38.anInt948 < 434 && Static73.anInt1884 < 426) {
				Static73.method1334(Static73.anInt1884 - 17, Static38.anInt948 + -357);
			}
		}
		if ((Static108.anInt2745 != -1 || Static45.anInt1850 != -1) && Static17.anInt600 != Static70.anInt1793) {
			Static17.anInt600 = Static70.anInt1793;
			Static28.aBoolean41 = true;
		}
		if ((Static108.anInt2745 != -1 || Static45.anInt1850 != -1) && Static103.anInt2663 != Static64.anInt1563) {
			Static64.anInt1563 = Static103.anInt2663;
			Static28.aBoolean41 = true;
		}
		while (!local47) {
			local47 = true;
			for (@Pc(268) int local268 = 0; local268 < Static83.anInt2216 - 1; local268++) {
				if (Static1.anIntArray1[local268] < 1000 && Static1.anIntArray1[local268 + 1] > 1000) {
					@Pc(288) Class42 local288 = Static36.aClass42Array6[local268];
					local47 = false;
					Static36.aClass42Array6[local268] = Static36.aClass42Array6[local268 + 1];
					Static36.aClass42Array6[local268 + 1] = local288;
					@Pc(308) int local308 = Static1.anIntArray1[local268];
					Static1.anIntArray1[local268] = Static1.anIntArray1[local268 + 1];
					Static1.anIntArray1[local268 + 1] = local308;
					@Pc(326) int local326 = Static104.anIntArray398[local268];
					Static104.anIntArray398[local268] = Static104.anIntArray398[local268 + 1];
					Static104.anIntArray398[local268 + 1] = local326;
					@Pc(344) int local344 = Static70.anIntArray248[local268];
					Static70.anIntArray248[local268] = Static70.anIntArray248[local268 + 1];
					Static70.anIntArray248[local268 + 1] = local344;
					@Pc(362) int local362 = Static31.anIntArray347[local268];
					Static31.anIntArray347[local268] = Static31.anIntArray347[local268 + 1];
					Static31.anIntArray347[local268 + 1] = local362;
				}
			}
		}
	}
}
