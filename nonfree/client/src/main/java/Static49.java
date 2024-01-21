import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ic", name = "sb", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array24;

	@OriginalMember(owner = "client!ic", name = "tb", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!ic", name = "Cb", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!ic", name = "Lb", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "Lclient!v;")
	public static Class76 aClass76_553 = Static134.method2017("mapfunction");

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!v;")
	public static Class76 aClass76_554 = Static134.method2017(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!v;")
	public static Class76 aClass76_555 = Static134.method2017(":assist:");

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
	public static int anInt1261 = 0;

	@OriginalMember(owner = "client!ic", name = "Db", descriptor = "Lclient!v;")
	public static Class76 aClass76_557 = null;

	@OriginalMember(owner = "client!ic", name = "Kb", descriptor = "[J")
	public static long[] aLongArray30 = new long[32];

	@OriginalMember(owner = "client!ic", name = "Tb", descriptor = "Lclient!v;")
	public static Class76 aClass76_558 = Static134.method2017("<col=80ff00>");

	@OriginalMember(owner = "client!ic", name = "Ub", descriptor = "Lclient!v;")
	public static Class76 aClass76_559 = Static134.method2017("blaugr-Un:");

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	public static void method850() {
		aClass76_557 = null;
		aClass76_553 = null;
		aLongArray30 = null;
		aClass76_555 = null;
		anIntArray158 = null;
		aClass4_Sub4_Sub5_Sub2Array24 = null;
		aClass76_559 = null;
		anIntArray159 = null;
		aClass76_554 = null;
		aClass76_558 = null;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public static void method852() {
		for (@Pc(10) Class4_Sub15 local10 = (Class4_Sub15) Static9.aClass78_2.method1916(); local10 != null; local10 = (Class4_Sub15) Static9.aClass78_2.method1920()) {
			if (local10.anInt2042 > 0) {
				local10.anInt2042--;
			}
			if (local10.anInt2042 != 0) {
				if (local10.anInt2054 > 0) {
					local10.anInt2054--;
				}
				if (local10.anInt2054 == 0 && local10.anInt2044 >= 1 && local10.anInt2048 >= 1 && local10.anInt2044 <= 102 && local10.anInt2048 <= 102 && (local10.anInt2039 < 0 || Static129.method1935(local10.anInt2050, local10.anInt2039))) {
					Static73.method1361(local10.anInt2039, local10.anInt2056, local10.anInt2044, local10.anInt2049, local10.anInt2043, local10.anInt2048, local10.anInt2050);
					local10.anInt2054 = -1;
					if (local10.anInt2039 == local10.anInt2041 && local10.anInt2041 == -1) {
						local10.method2004();
					} else if (local10.anInt2041 == local10.anInt2039 && local10.anInt2056 == local10.anInt2053 && local10.anInt2050 == local10.anInt2052) {
						local10.method2004();
					}
				}
			} else if (local10.anInt2041 < 0 || Static129.method1935(local10.anInt2052, local10.anInt2041)) {
				Static73.method1361(local10.anInt2041, local10.anInt2053, local10.anInt2044, local10.anInt2049, local10.anInt2043, local10.anInt2048, local10.anInt2052);
				local10.method2004();
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZILclient!uf;)V")
	public static void method855(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class75 arg1) {
		if (Static1.aClass75_1 != null) {
			try {
				Static1.aClass75_1.method1842();
			} catch (@Pc(12) Exception local12) {
			}
			Static1.aClass75_1 = null;
		}
		Static1.aClass75_1 = arg1;
		Static25.method367(arg0);
		Static74.aClass4_Sub10_6.anInt931 = 0;
		Static30.aClass4_Sub10_4 = null;
		Static121.aClass4_Sub4_Sub16_1 = null;
		Static112.anInt2445 = 0;
		while (true) {
			@Pc(35) Class4_Sub4_Sub16 local35 = (Class4_Sub4_Sub16) Static118.aClass28_13.method775();
			if (local35 == null) {
				while (true) {
					local35 = (Class4_Sub4_Sub16) Static94.aClass28_8.method775();
					if (local35 == null) {
						if (Static61.aByte3 != 0) {
							try {
								@Pc(97) Class4_Sub10 local97 = new Class4_Sub10(4);
								local97.method600(4);
								local97.method600(Static61.aByte3);
								local97.method575(0);
								Static1.aClass75_1.method1849(4, local97.aByteArray17);
							} catch (@Pc(118) IOException local118) {
								try {
									Static1.aClass75_1.method1842();
								} catch (@Pc(123) Exception local123) {
								}
								Static1.aClass75_1 = null;
								Static85.anInt2051++;
							}
						}
						Static52.anInt1354 = 0;
						Static106.aLong81 = Static42.method793();
						return;
					}
					Static31.aClass83_1.method2020(local35);
					Static35.aClass28_2.method774(local35.aLong99, local35);
					Static15.anInt255++;
					Static91.anInt2123--;
				}
			}
			Static111.aClass28_10.method774(local35.aLong99, local35);
			Static59.anInt1537++;
			Static121.anInt2620--;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lclient!v;")
	public static Class76 method856(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static63.method1092(arg0) : Static62.aClass76_672;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!la;Lclient!la;Lclient!la;I)V")
	public static void method861(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class17 arg2) {
		Static63.aClass17_22 = arg2;
		Static29.aClass17_7 = arg1;
		Static55.aClass17_20 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Z")
	public static boolean method862(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
