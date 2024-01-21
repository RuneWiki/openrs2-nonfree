import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	public static int anInt956;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "Lclient!dd;")
	public static Class14 aClass14_13;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "Lclient!dd;")
	public static Class14 aClass14_14;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean46 = true;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Lclient!af;")
	public static Class7 aClass7_6 = new Class7(512);

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "Lclient!ic;")
	public static Class34 aClass34_512 = Static56.method816("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	public static volatile int anInt962 = 0;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
	public static int anInt963 = 0;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "Lclient!ic;")
	public static Class34 aClass34_513 = Static56.method816("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "Lclient!ic;")
	private static Class34 aClass34_514 = Static56.method816("Loading title screen )2 ");

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "Lclient!ic;")
	public static Class34 aClass34_515 = aClass34_514;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	public static int anInt964 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(JZ)V")
	public static void method595(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static62.anInt1593 >= 100 && Static102.anInt3092 != 1 || Static62.anInt1593 >= 200) {
			Static108.method1530(Static64.aClass34_918, Static36.aClass34_504, 0);
			return;
		}
		@Pc(33) Class34 local33 = Static83.method1229(arg0).method842();
		for (@Pc(35) int local35 = 0; local35 < Static62.anInt1593; local35++) {
			if (Static77.aLongArray3[local35] == arg0) {
				Static108.method1530(Static44.method669(new Class34[] { local33, Static28.aClass34_392 }), Static36.aClass34_504, 0);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static69.anInt1679; local70++) {
			if (Static5.aLongArray2[local70] == arg0) {
				Static108.method1530(Static44.method669(new Class34[] { Static88.aClass34_1099, local33, Static125.aClass34_1374 }), Static36.aClass34_504, 0);
				return;
			}
		}
		if (local33.method804(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass34_638)) {
			Static108.method1530(Static32.aClass34_459, Static36.aClass34_504, 0);
			return;
		}
		Static93.aClass34Array16[Static62.anInt1593] = local33;
		Static77.aLongArray3[Static62.anInt1593] = arg0;
		Static83.anIntArray266[Static62.anInt1593] = 0;
		Static21.anIntArray70[Static62.anInt1593] = 0;
		Static62.anInt1593++;
		Static108.anInt2491 = Static86.anInt2177;
		Static106.aClass8_Sub20_Sub1_3.method1907(162);
		Static106.aClass8_Sub20_Sub1_3.method1879(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method596() {
		Static57.method884();
		Static82.method1193();
		Static133.method2007();
		Static120.method1902();
		Static1.method4();
		Static80.method1169();
		Static95.method1352();
		Static95.method1358();
		Static18.method305();
		Static51.method765();
		Static57.method893();
		Static80.method1176();
		((Class26) Static11.anInterface3_1).method621();
		Static123.aClass48_55.method1101();
		Static82.aClass14_Sub1_14.method1158();
		Static90.aClass14_Sub1_4.method1158();
		Static38.aClass14_Sub1_7.method1158();
		Static94.aClass14_Sub1_17.method1158();
		Static36.aClass14_Sub1_6.method1158();
		Static67.aClass14_Sub1_9.method1158();
		Static82.aClass14_Sub1_15.method1158();
		Static92.aClass14_Sub1_16.method1158();
		Static9.aClass14_Sub1_2.method1158();
		Static70.aClass14_Sub1_11.method1158();
		Static77.aClass14_Sub1_13.method1158();
		Static129.aClass14_Sub1_19.method1158();
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method597() {
		aClass34_515 = null;
		aClass14_14 = null;
		aClass34_514 = null;
		aClass34_513 = null;
		aClass34_512 = null;
		aClass7_6 = null;
		aClass14_13 = null;
		aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I")
	public static int method598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	public static void method599() {
		while (true) {
			if (Static10.aClass8_Sub20_Sub1_1.method1906(Static32.anInt872) >= 27) {
				@Pc(14) int local14 = Static10.aClass8_Sub20_Sub1_1.method1899(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local14] == null) {
						Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local14] = new Class8_Sub1_Sub1_Sub4_Sub2();
						local21 = true;
					}
					@Pc(37) Class8_Sub1_Sub1_Sub4_Sub2 local37 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local14];
					Static50.anIntArray164[Static94.anInt2223++] = local14;
					local37.anInt2057 = Static21.anInt655;
					local37.aClass8_Sub1_Sub16_1 = Static18.method308(Static10.aClass8_Sub20_Sub1_1.method1899(14));
					@Pc(65) int local65 = Static10.aClass8_Sub20_Sub1_1.method1899(5);
					if (local65 > 15) {
						local65 -= 32;
					}
					@Pc(78) int local78 = Static119.anIntArray382[Static10.aClass8_Sub20_Sub1_1.method1899(3)];
					if (local21) {
						local37.anInt2022 = local37.anInt2038 = local78;
					}
					@Pc(91) int local91 = Static10.aClass8_Sub20_Sub1_1.method1899(5);
					if (local91 > 15) {
						local91 -= 32;
					}
					@Pc(102) int local102 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
					@Pc(107) int local107 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
					if (local107 == 1) {
						Static3.anIntArray4[Static95.anInt2240++] = local14;
					}
					local37.anInt2031 = local37.aClass8_Sub1_Sub16_1.anInt2430;
					local37.anInt2063 = local37.aClass8_Sub1_Sub16_1.anInt2438;
					local37.anInt2054 = local37.aClass8_Sub1_Sub16_1.anInt2458;
					local37.anInt2033 = local37.aClass8_Sub1_Sub16_1.anInt2444;
					local37.anInt2030 = local37.aClass8_Sub1_Sub16_1.anInt2439;
					local37.anInt2048 = local37.aClass8_Sub1_Sub16_1.anInt2443;
					local37.anInt2028 = local37.aClass8_Sub1_Sub16_1.anInt2429;
					if (local37.anInt2028 == 0) {
						local37.anInt2038 = 0;
					}
					local37.anInt2056 = local37.aClass8_Sub1_Sub16_1.anInt2453;
					local37.anInt2016 = local37.aClass8_Sub1_Sub16_1.anInt2433;
					local37.method1226(local102 == 1, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0] + local91, local65 + Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0]);
					continue;
				}
			}
			Static10.aClass8_Sub20_Sub1_1.method1905();
			return;
		}
	}
}
