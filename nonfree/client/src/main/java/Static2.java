import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[I")
	public static int[] anIntArray21;

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_47 = Static108.method1915("Icons redrawn");

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "Lclient!kd;")
	public static Class39 aClass39_48 = Static108.method1915("mapfunction");

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_49 = Static108.method1915("T");

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
	public static final int anInt129 = 0;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "Lclient!kd;")
	public static Class39 aClass39_50 = Static108.method1915(")3");

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
	public static int anInt133 = 0;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "Lclient!kd;")
	public static Class39 aClass39_51 = Static108.method1915("Offline");

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
	public static final int anInt135 = 7759444;

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "[Lclient!nc;")
	public static Class51[] aClass51Array1 = new Class51[50];

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
	public static volatile int anInt137 = 0;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method59() {
		if (!Static50.aBoolean117) {
			return;
		}
		Static121.aClass6_21 = null;
		Static79.aClass6_17 = null;
		Static9.aClass1_Sub1_Sub4_Sub1Array12 = null;
		Static128.aClass6_22 = null;
		Static21.aClass1_Sub1_Sub4_Sub1_14 = null;
		Static116.aClass6_19 = null;
		Static86.aClass1_Sub1_Sub4_Sub1_41 = null;
		Static50.aBoolean117 = false;
		Static121.aClass1_Sub1_Sub4_Sub1_52 = null;
		Static21.aClass6_5 = null;
		Static79.aClass1_Sub1_Sub4_Sub1_47 = null;
		Static89.aClass6_16 = null;
		Static75.aClass1_Sub1_Sub4_Sub1_38 = null;
		Static35.aClass1_Sub1_Sub4_Sub1_21 = null;
		Static22.aClass6_6 = null;
		Static41.aClass1_Sub1_Sub4_Sub1_53 = null;
		Static35.aClass6_9 = null;
		Static44.aClass6_10 = null;
		Static25.aClass6_7 = null;
		Static72.aClass1_Sub1_Sub4_Sub1_35 = null;
		Static128.aClass1_Sub1_Sub4_Sub1_54 = null;
		Static51.aClass1_Sub1_Sub4_Sub1_28 = null;
		Static20.anIntArray106 = null;
		Static76.aClass1_Sub1_Sub4_Sub1_39 = null;
		Static121.anIntArray463 = null;
		Static70.aClass1_Sub1_Sub4_Sub1_33 = null;
		Static21.anIntArray108 = null;
		Static98.aClass1_Sub1_Sub4_Sub1_44 = null;
		Static51.aClass6_12 = null;
		Static99.aClass1_Sub1_Sub4_Sub1_45 = null;
		Static47.aClass6_11 = null;
		Static97.anIntArray480 = null;
		Static81.aClass6_15 = null;
		Static36.aClass1_Sub1_Sub4_Sub1_22 = null;
		Static118.aClass6_20 = null;
		Static33.aClass6_8 = null;
		Static71.aClass1_Sub1_Sub4_Sub1_34 = null;
		Static81.aClass6_14 = null;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
	public static void method60() {
		aClass39_48 = null;
		aClass51Array1 = null;
		aClass39_49 = null;
		aClass39_50 = null;
		aClass39_47 = null;
		aClass39_51 = null;
		aByteArrayArray1 = null;
		anIntArray21 = null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lclient!qd;")
	public static Class1_Sub1_Sub13 method61(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub13 local10 = (Class1_Sub1_Sub13) Static107.aClass33_37.method1038((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static71.method1244(Static73.aClass62_22, Static28.aClass62_30, arg0);
		if (local10 != null) {
			Static107.aClass33_37.method1042(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!mf;BI)V")
	public static void method62(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt2490 > Static45.anInt1256) {
			Static20.method404(arg0);
		} else if (Static45.anInt1256 > arg0.anInt2502) {
			Static127.method2192(arg0);
		} else {
			Static49.method858(arg0);
		}
		if (arg0.anInt2521 < 128 || arg0.anInt2508 < 128 || arg0.anInt2521 >= 13184 || arg0.anInt2508 >= 13184) {
			arg0.anInt2526 = -1;
			arg0.anInt2502 = 0;
			arg0.anInt2508 = arg0.anIntArray387[0] * 128 + arg0.anInt2486 * 64;
			arg0.anInt2490 = 0;
			arg0.anInt2535 = -1;
			arg0.anInt2521 = arg0.anIntArray389[0] * 128 + arg0.anInt2486 * 64;
			arg0.method1801();
		}
		if (arg0 == Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1 && (arg0.anInt2521 < 1536 || arg0.anInt2508 < 1536 || arg0.anInt2521 >= 11776 || arg0.anInt2508 >= 11776)) {
			arg0.anInt2490 = 0;
			arg0.anInt2526 = -1;
			arg0.anInt2508 = arg0.anIntArray387[0] * 128 + arg0.anInt2486 * 64;
			arg0.anInt2502 = 0;
			arg0.anInt2535 = -1;
			arg0.anInt2521 = arg0.anInt2486 * 64 + arg0.anIntArray389[0] * 128;
			arg0.method1801();
		}
		Static55.method998(arg0);
		Static16.method1794(arg0);
	}
}
