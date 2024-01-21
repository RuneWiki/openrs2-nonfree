import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_24;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array1;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array2;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	public static int anInt826;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	public static int anInt829;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_387 = Static75.method1216("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "[I")
	public static int[] anIntArray75 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "Lclient!ad;")
	private static Class4 aClass4_391 = Static75.method1216("Members object");

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_388 = aClass4_391;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "Lclient!ad;")
	private static Class4 aClass4_390 = Static75.method1216("Accept trade");

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Lclient!ad;")
	public static Class4 aClass4_389 = aClass4_390;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "Lclient!bb;")
	public static Class8 aClass8_13 = new Class8(30);

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Lclient!ad;")
	public static Class4 aClass4_392 = Static75.method1216("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "[I")
	public static int[] anIntArray76 = new int[25];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lclient!vd;")
	public static Class3_Sub1_Sub4_Sub4 method553() {
		@Pc(12) Class3_Sub1_Sub4_Sub4 local12 = new Class3_Sub1_Sub4_Sub4(Static34.anIntArray96, Static15.anIntArray31, Static39.anIntArray112, Static42.anIntArray156, Static16.aByteArrayArray2);
		Static21.method297();
		return local12;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method556() {
		aClass3_Sub1_Sub4_Sub3Array1 = null;
		aClass4_391 = null;
		aClass4_392 = null;
		aClass4_388 = null;
		anIntArray76 = null;
		aClass64_24 = null;
		aClass4_387 = null;
		aClass8_13 = null;
		aClass3_Sub1_Sub4_Sub3Array2 = null;
		aClass4_390 = null;
		aClass4_389 = null;
		anIntArray75 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method558(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!rd;Lclient!rd;ZZ)V")
	public static void method559(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) boolean arg2) {
		Static87.aBoolean105 = arg2;
		Static54.aClass64_38 = arg0;
		Static87.aClass64_43 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Lclient!ad;")
	public static Class4 method561(@OriginalArg(0) int arg0) {
		return Static60.method1012(new Class4[] { Static93.method1632(arg0 >> 24 & 0xFF), Static94.aClass4_1232, Static93.method1632(arg0 >> 16 & 0xFF), Static94.aClass4_1232, Static93.method1632(arg0 >> 8 & 0xFF), Static94.aClass4_1232, Static93.method1632(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIBLclient!sd;)V")
	public static void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub1_Sub1_Sub1_Sub2 arg3) {
		if (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1 == arg3 || Static4.anInt204 >= 400) {
			return;
		}
		@Pc(50) Class4 local50;
		if (arg3.anInt2366 == 0) {
			local50 = Static60.method1012(new Class4[] { arg3.aClass4_1302, Static5.method126(arg3.anInt2351, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2351), Static46.aClass4_1540, Static11.aClass4_1594, Static93.method1632(arg3.anInt2351), Static38.aClass4_1576 });
		} else {
			local50 = Static60.method1012(new Class4[] { arg3.aClass4_1302, Static46.aClass4_1540, Static100.aClass4_1353, Static93.method1632(arg3.anInt2366), Static38.aClass4_1576 });
		}
		@Pc(139) int local139;
		if (Static98.anInt2368 == 1) {
			Static62.method1082(Static60.method1012(new Class4[] { Static48.aClass4_630, Static82.aClass4_1077, local50 }), 17, Static9.aClass4_163, arg0, arg1, arg2);
		} else if (Static101.anInt2512 != 1) {
			for (local139 = 4; local139 >= 0; local139--) {
				if (Static107.aClass4Array21[local139] != null) {
					@Pc(151) short local151 = 0;
					@Pc(153) int local153 = 0;
					if (Static107.aClass4Array21[local139].method160(Static8.aClass4_156)) {
						if (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2351 < arg3.anInt2351) {
							local151 = 2000;
						}
						if (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2367 != 0 && arg3.anInt2367 != 0) {
							if (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2367 == arg3.anInt2367) {
								local151 = 2000;
							} else {
								local151 = 0;
							}
						}
					} else if (Static39.aBooleanArray7[local139]) {
						local151 = 2000;
					}
					if (local139 == 0) {
						local153 = local151 + 58;
					}
					if (local139 == 1) {
						local153 = local151 + 52;
					}
					if (local139 == 2) {
						local153 = local151 + 10;
					}
					if (local139 == 3) {
						local153 = local151 + 18;
					}
					if (local139 == 4) {
						local153 = local151 + 48;
					}
					Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local50 }), local153, Static107.aClass4Array21[local139], arg0, arg1, arg2);
				}
			}
		} else if ((Static63.anInt1604 & 0x8) == 8) {
			Static62.method1082(Static60.method1012(new Class4[] { Static34.aClass4_519, Static82.aClass4_1077, local50 }), 24, Static92.aClass4_1188, arg0, arg1, arg2);
		}
		for (local139 = 0; local139 < Static4.anInt204; local139++) {
			if (Static22.anIntArray38[local139] == 47) {
				Static104.aClass4Array20[local139] = Static60.method1012(new Class4[] { Static46.aClass4_1536, Static4.aClass4_109, Static46.aClass4_1539, local50 });
				return;
			}
		}
	}
}
