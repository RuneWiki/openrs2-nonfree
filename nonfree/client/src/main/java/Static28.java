import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!id;")
	private static Class34 aClass34_1555 = Static9.method266("Please try again)3");

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_1554 = aClass34_1555;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
	public static int anInt3026 = 1;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "Lclient!id;")
	public static Class34 aClass34_1556 = Static9.method266("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "Lclient!id;")
	public static Class34 aClass34_1557 = Static9.method266("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "Lclient!id;")
	public static Class34 aClass34_1558 = Static9.method266("mapscene");

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "Lclient!id;")
	public static Class34 aClass34_1559 = Static9.method266("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "Lclient!id;")
	public static Class34 aClass34_1560 = Static9.method266("nav");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(JI)V")
	public static void method2002(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static90.anInt3112 >= 100 && Static70.anInt1850 != 1 || Static90.anInt3112 >= 200) {
			Static39.method685(Static81.aClass34_1058, 0, Static57.aClass34_755);
			return;
		}
		@Pc(35) Class34 local35 = Static77.method1358(arg0).method969();
		for (@Pc(37) int local37 = 0; local37 < Static90.anInt3112; local37++) {
			if (Static116.aLongArray6[local37] == arg0) {
				Static39.method685(Static81.aClass34_1058, 0, Static91.method1554(new Class34[] { local35, Static124.aClass34_1525 }));
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static114.anInt2736; local76++) {
			if (Static40.aLongArray3[local76] == arg0) {
				Static39.method685(Static81.aClass34_1058, 0, Static91.method1554(new Class34[] { Static96.aClass34_1228, local35, Static45.aClass34_1401 }));
				return;
			}
		}
		if (local35.method986(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass34_97)) {
			Static39.method685(Static81.aClass34_1058, 0, Static58.aClass34_765);
			return;
		}
		Static61.aClass34Array13[Static90.anInt3112] = local35;
		Static116.aLongArray6[Static90.anInt3112] = arg0;
		Static77.anIntArray242[Static90.anInt3112] = 0;
		Static15.anIntArray60[Static90.anInt3112] = 0;
		Static90.anInt3112++;
		Static38.anInt1125 = Static70.anInt1848;
		Static21.aClass1_Sub19_Sub1_1.method2105(214);
		Static21.aClass1_Sub19_Sub1_1.method2073(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public static void method2003() {
		aClass34_1560 = null;
		aClass34_1554 = null;
		aClass34_1555 = null;
		anIntArray372 = null;
		aClass34_1559 = null;
		aClass34_1557 = null;
		aClass34_1556 = null;
		aClass34_1558 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2005(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static122.aClass71_1);
		arg0.addMouseMotionListener(Static122.aClass71_1);
		arg0.addFocusListener(Static122.aClass71_1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZIBI)Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) long local25 = ((long) arg4 << 16) + (long) arg0 + ((long) arg1 << 38) + ((long) arg3 << 40);
		@Pc(33) Class1_Sub1_Sub2_Sub1 local33;
		if (!arg2) {
			local33 = (Class1_Sub1_Sub2_Sub1) Static76.aClass63_12.method1663(local25);
			if (local33 != null) {
				return local33;
			}
		}
		@Pc(41) Class1_Sub1_Sub8 local41 = Static74.method1334(arg0);
		if (arg4 > 1 && local41.anIntArray231 != null) {
			@Pc(51) int local51 = -1;
			for (@Pc(53) int local53 = 0; local53 < 10; local53++) {
				if (arg4 >= local41.anIntArray230[local53] && local41.anIntArray230[local53] != 0) {
					local51 = local41.anIntArray231[local53];
				}
			}
			if (local51 != -1) {
				local41 = Static74.method1334(local51);
			}
		}
		@Pc(88) Class1_Sub1_Sub1_Sub2 local88 = local41.method1333(1);
		if (local88 == null) {
			return null;
		}
		@Pc(94) Class1_Sub1_Sub2_Sub1 local94 = null;
		if (local41.anInt2037 != -1) {
			local94 = method2006(local41.anInt2022, 1, true, 0, 10);
			if (local94 == null) {
				return null;
			}
		}
		@Pc(122) int local122 = Static111.anInt2638;
		@Pc(124) int local124 = Static111.anInt2637;
		@Pc(126) int[] local126 = Static111.anIntArray333;
		@Pc(129) int[] local129 = new int[4];
		Static111.method1749(local129);
		local33 = new Class1_Sub1_Sub2_Sub1(36, 32);
		Static111.method1764(local33.anIntArray26, 36, 32);
		Static111.method1761();
		Static108.method1775();
		Static108.method1767(16, 16);
		Static108.aBoolean147 = false;
		@Pc(152) int local152 = local41.anInt2010;
		if (arg2) {
			local152 = (int) ((double) local152 * 1.5D);
		} else if (arg1 == 2) {
			local152 = (int) ((double) local152 * 1.04D);
		}
		@Pc(180) int local180 = local152 * Class1_Sub1_Sub2_Sub4.anIntArray334[local41.anInt2002] >> 16;
		@Pc(189) int local189 = Class1_Sub1_Sub2_Sub4.anIntArray335[local41.anInt2002] * local152 >> 16;
		local88.method1103();
		local88.method1082(local41.anInt2001, local41.anInt2036, local41.anInt2002, local41.anInt2035, local41.anInt2005 + local88.anInt2759 / 2 + local189, local180 + local41.anInt2005);
		if (arg1 >= 1) {
			local33.method197(1);
		}
		if (arg1 >= 2) {
			local33.method197(16777215);
		}
		if (arg3 != 0) {
			local33.method191(arg3);
		}
		Static111.method1764(local33.anIntArray26, 36, 32);
		if (local41.anInt2037 != -1) {
			local94.method182(0, 0);
		}
		if (!arg2 && (local41.anInt2012 == 1 || arg4 != 1) && arg4 != -1) {
			Static120.aClass1_Sub1_Sub2_Sub3_Sub1_6.method839(Static27.method545(arg4), 0, 9, 16776960, 1);
		}
		if (!arg2) {
			Static76.aClass63_12.method1659(local33, local25);
		}
		Static111.method1764(local126, local122, local124);
		Static111.method1756(local129);
		Static108.method1775();
		Static108.aBoolean147 = true;
		return local33;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIII)Lclient!id;")
	public static Class34 method2007(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 1;
		@Pc(21) int local21 = arg1 / 10;
		while (local21 != 0) {
			local21 /= 10;
			local3++;
		}
		@Pc(35) int local35 = local3;
		if (arg1 < 0 || arg0) {
			local35 = local3 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local35];
		if (arg1 < 0) {
			local43[0] = 45;
		} else if (arg0) {
			local43[0] = 43;
		}
		for (@Pc(59) int local59 = 0; local59 < local3; local59++) {
			@Pc(65) int local65 = arg1 % 10;
			arg1 /= 10;
			if (local65 < 0) {
				local65 = -local65;
			}
			if (local65 > 9) {
				local65 += 39;
			}
			local43[local35 - local59 - 1] = (byte) (local65 + 48);
		}
		@Pc(104) Class34 local104 = new Class34();
		local104.aByteArray20 = local43;
		local104.anInt1553 = local35;
		return local104;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lclient!vb;")
	public static Class1_Sub1_Sub16 method2008(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub16 local10 = (Class1_Sub1_Sub16) Static124.aClass63_25.method1663((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static86.aClass35_23.method1573(6, arg0);
		local10 = new Class1_Sub1_Sub16();
		local10.anInt2969 = arg0;
		if (local20 != null) {
			local10.method1960(new Class1_Sub19(local20));
		}
		local10.method1961();
		if (local10.aBoolean172) {
			local10.anInt2971 = 0;
			local10.aBoolean173 = false;
		}
		Static124.aClass63_25.method1659(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	public static void method2009() {
		if (!Static115.aBoolean158) {
			Static78.anIntArray245[0] = 1006;
			Static59.aClass34Array12[0] = Static30.aClass34_447;
			Static71.anInt1876 = 1;
			Static71.aClass34Array16[0] = Static81.aClass34_1058;
		}
		if (Static9.anInt451 != -1) {
			Static38.method674(Static9.anInt451);
		}
		for (@Pc(29) int local29 = 0; local29 < Static76.anInt2054; local29++) {
			if (Static12.aBooleanArray3[local29]) {
				Static43.aBooleanArray8[local29] = true;
			}
			Static29.aBooleanArray6[local29] = Static12.aBooleanArray3[local29];
			Static12.aBooleanArray3[local29] = false;
		}
		Static32.anInt1396 = Static73.anInt1947;
		Static46.anInt1323 = -1;
		Static41.aClass1_Sub9_8 = null;
		Static67.anInt1768 = -1;
		if (Static9.anInt451 != -1) {
			Static76.anInt2054 = 0;
			Static13.method342(0, 503, -1, 0, Static9.anInt451, 0, 765, 0);
		}
		Static111.method1748();
		Static30.method557();
		if (Static115.aBoolean158) {
			Static31.method567();
		} else if (Static46.anInt1323 != -1) {
			Static37.method656(Static67.anInt1768, Static46.anInt1323);
		}
		if (Static59.anInt1635 == 3) {
			for (@Pc(101) int local101 = 0; local101 < Static76.anInt2054; local101++) {
				if (Static29.aBooleanArray6[local101]) {
					Static111.method1759(Static17.anIntArray64[local101], Static12.anIntArray39[local101], Static34.anIntArray99[local101], Static32.anIntArray151[local101], 16711935, 128);
				} else if (Static43.aBooleanArray8[local101]) {
					Static111.method1759(Static17.anIntArray64[local101], Static12.anIntArray39[local101], Static34.anIntArray99[local101], Static32.anIntArray151[local101], 16711680, 128);
				}
			}
		}
		Static93.method1591(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428, Static42.anInt1208, Static67.anInt1767);
		Static67.anInt1767 = 0;
	}
}
