import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2 aClass4_Sub4_Sub3_Sub2_3;

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "Lclient!kc;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
	public static int anInt1200;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
	public static int anInt1202;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
	public static int anInt1203;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	public static volatile int anInt1191 = -1;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Lclient!qc;")
	public static Class60 aClass60_469 = Static121.method2047("mapmarker");

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
	public static int anInt1193 = 0;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	public static int anInt1194 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
	public static int anInt1196 = 1;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
	public static int anInt1198 = 0;

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
	public static int anInt1201 = 0;

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_470 = Static121.method2047(" from your ignore list first");

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "Lclient!qc;")
	public static Class60 aClass60_471 = aClass60_470;

	@OriginalMember(owner = "client!hd", name = "jb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_473 = Static121.method2047("Konfig geladen)3");

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method831() {
		Static57.anInt528 = 0;
		@Pc(12) int local12 = Static99.anInt2424 + (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 >> 7);
		@Pc(20) int local20 = (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 >> 7) + Static106.anInt2518;
		if (local20 >= 3053 && local20 <= 3156 && local12 >= 3056 && local12 <= 3136) {
			Static57.anInt528 = 1;
		}
		if (local20 >= 3072 && local20 <= 3118 && local12 >= 9492 && local12 <= 9535) {
			Static57.anInt528 = 1;
		}
		if (Static57.anInt528 == 1 && local20 >= 3139 && local20 <= 3199 && local12 >= 3008 && local12 <= 3062) {
			Static57.anInt528 = 0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Lclient!qc;")
	public static Class60 method832(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static125.method2072(new Class60[] { Static16.aClass60_151, Static120.method1450(arg0), Static70.aClass60_650 });
		} else if (arg0 < 10000000) {
			return Static125.method2072(new Class60[] { Static15.aClass60_1191, Static120.method1450(arg0 / 1000), Static94.aClass60_910, Static70.aClass60_650 });
		} else {
			return Static125.method2072(new Class60[] { Static45.aClass60_458, Static120.method1450(arg0 / 1000000), Static105.aClass60_1012, Static70.aClass60_650 });
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	public static void method833() {
		if (Static54.aClass3_1 != null) {
			@Pc(8) Class3 local8 = Static54.aClass3_1;
			synchronized (Static54.aClass3_1) {
				Static54.aClass3_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public static void method834() {
		if (!Static125.aBoolean121) {
			return;
		}
		aClass4_Sub4_Sub3_Sub2_3 = null;
		Static23.anIntArray44 = null;
		Static99.aClass4_Sub4_Sub3_Sub1Array9 = null;
		Static62.aClass4_Sub4_Sub3_Sub1_3 = null;
		Static47.anIntArray117 = null;
		Static35.aClass4_Sub4_Sub3_Sub2Array3 = null;
		Static13.aClass4_Sub4_Sub3_Sub1_1 = null;
		Static59.aClass4_Sub4_Sub3_Sub1Array4 = null;
		Static82.aClass4_Sub4_Sub3_Sub1_4 = null;
		Static95.anIntArray232 = null;
		Static31.aClass4_Sub4_Sub3_Sub1_2 = null;
		Static38.anIntArray73 = null;
		Static103.aClass4_Sub4_Sub3_Sub1Array6 = null;
		Static8.anIntArray12 = null;
		Static19.anIntArray31 = null;
		Static18.aClass4_Sub4_Sub3_Sub2_1 = null;
		Static33.aClass4_Sub4_Sub3_Sub1Array3 = null;
		Static95.anIntArray233 = null;
		Static31.aClass4_Sub4_Sub3_Sub1Array2 = null;
		Static84.anIntArray203 = null;
		Static48.method933();
		Static78.method1422(true);
		Static125.aBoolean121 = false;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V")
	public static void method835() {
		aClass60_469 = null;
		anIntArray115 = null;
		aClass4_Sub4_Sub3_Sub2_3 = null;
		aClass39_1 = null;
		aClass60_471 = null;
		aClass60_470 = null;
		aClass60_473 = null;
	}
}
