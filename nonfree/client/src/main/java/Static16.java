import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	public static int anInt471;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!ke;")
	private static Class39 aClass39_239 = Static2.method66("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!ke;")
	public static Class39 aClass39_240 = aClass39_239;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt461 = 0;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_242 = Static2.method66("button near the top of that page)3");

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!ke;")
	public static Class39 aClass39_241 = aClass39_242;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_243 = Static2.method66("Offline");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_244 = Static2.method66("blaugr-Un:");

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_245 = aClass39_243;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_246 = Static2.method66("backright1");

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	public static int[] anIntArray54 = new int[1000];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	public static int anInt474 = 0;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_248 = Static2.method66("Ok");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_247 = aClass39_248;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZLclient!ca;)V")
	public static void method376(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class10 arg1) {
		if (Static94.aClass10_4 != null) {
			try {
				Static94.aClass10_4.method251();
			} catch (@Pc(12) Exception local12) {
			}
			Static94.aClass10_4 = null;
		}
		Static94.aClass10_4 = arg1;
		Static72.method1488(arg0);
		Static20.anInt580 = 0;
		Static56.aClass2_Sub5_2.anInt1772 = 0;
		Static5.aClass2_Sub5_1 = null;
		Static96.aClass2_Sub1_Sub14_1 = null;
		while (true) {
			@Pc(41) Class2_Sub1_Sub14 local41 = (Class2_Sub1_Sub14) Static80.aClass57_3.method1673();
			if (local41 == null) {
				while (true) {
					local41 = (Class2_Sub1_Sub14) Static97.aClass57_6.method1673();
					if (local41 == null) {
						if (Static5.aByte1 != 0) {
							try {
								@Pc(100) Class2_Sub5 local100 = new Class2_Sub5(4);
								local100.method1252(4);
								local100.method1252(Static5.aByte1);
								local100.method1257(0);
								Static94.aClass10_4.method260(4, local100.aByteArray16);
							} catch (@Pc(121) IOException local121) {
								try {
									Static94.aClass10_4.method251();
								} catch (@Pc(126) Exception local126) {
								}
								Static47.anInt1325++;
								Static94.aClass10_4 = null;
							}
						}
						Static99.anInt2694 = 0;
						Static48.aLong33 = System.currentTimeMillis();
						return;
					}
					Static102.aClass28_2.method822(local41);
					Static56.aClass57_1.method1671(local41.aLong82, local41);
					Static80.anInt2185++;
					Static79.anInt2769--;
				}
			}
			Static76.aClass57_2.method1671(local41.aLong82, local41);
			Static76.anInt2105--;
			Static101.anInt2761++;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)[Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2[] method377() {
		@Pc(8) Class2_Sub1_Sub4_Sub2[] local8 = new Class2_Sub1_Sub4_Sub2[Static92.anInt2392];
		for (@Pc(10) int local10 = 0; local10 < Static92.anInt2392; local10++) {
			@Pc(20) Class2_Sub1_Sub4_Sub2 local20 = local8[local10] = new Class2_Sub1_Sub4_Sub2();
			local20.anInt1500 = Static56.anInt1612;
			local20.anInt1502 = Static76.anInt2102;
			local20.anInt1499 = Static83.anIntArray297[local10];
			local20.anInt1501 = Static10.anIntArray34[local10];
			local20.anInt1497 = Static95.anIntArray314[local10];
			local20.anInt1498 = Static30.anIntArray94[local10];
			@Pc(52) int local52 = local20.anInt1497 * local20.anInt1498;
			@Pc(56) byte[] local56 = Static51.aByteArrayArray10[local10];
			local20.anIntArray209 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray209[local62] = Static46.anIntArray179[local56[local62] & 0xFF];
			}
		}
		Static89.method1677();
		return local8;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ke;Lclient!ke;IZ)V")
	public static void method378(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) boolean arg2) {
		if (Static5.aBoolean2) {
			Static5.aBoolean2 = false;
			Static80.method1565();
			Static26.method551();
			Static77.method1516();
			Static58.method1160();
			Static1.method5(Static96.anInt2634, Static78.anInt2150, Static6.anInt2870, Static49.aClass2_Sub1_Sub4_Sub1_2);
			Static37.method805(-1, Static77.anInt2108, Static57.anInt1650 == -1, Static25.anIntArray81);
			Static77.aBoolean99 = true;
			Static22.aBoolean35 = true;
			Static54.aBoolean81 = true;
		}
		@Pc(40) short local40 = 151;
		@Pc(41) int local41 = local40 - 3;
		Static38.method814();
		Static49.aClass2_Sub1_Sub4_Sub1_2.method244(arg1, 257, 148, 0);
		Static49.aClass2_Sub1_Sub4_Sub1_2.method244(arg1, 256, 147, 16777215);
		if (arg0 != null) {
			local41 += 15;
			if (arg2) {
				@Pc(72) int local72 = Static49.aClass2_Sub1_Sub4_Sub1_2.method241(arg0) + 4;
				Static91.method2013(257 - local72 / 2, 152, local72, 11, 0);
			}
			Static49.aClass2_Sub1_Sub4_Sub1_2.method244(arg0, 257, 163, 0);
			Static49.aClass2_Sub1_Sub4_Sub1_2.method244(arg0, 256, 162, 16777215);
		}
		Static81.method1568();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	public static void method382() {
		aClass2_Sub1_Sub4_Sub2_1 = null;
		aClass39_245 = null;
		aClass39_243 = null;
		aClass39_242 = null;
		anIntArray54 = null;
		aClass39_239 = null;
		aClass39_244 = null;
		aClass39_241 = null;
		aClass39_248 = null;
		aClass39_246 = null;
		aClass39_240 = null;
		aClass39_247 = null;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I")
	public static int method383() {
		return 5;
	}
}
