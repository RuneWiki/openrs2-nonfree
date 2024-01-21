import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array9;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!hb;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!sb;")
	public static Class66 aClass66_14;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array10;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1215 = Static121.method2047("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public static int anInt3018 = -1;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public static volatile int anInt3021 = -1;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public static int anInt3022 = 0;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1216 = Static121.method2047("<col=80ff00>");

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1217 = Static121.method2047("mapedge");

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1218 = Static121.method2047("ams");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public static void method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static25.anInt693 < 2 && Static26.anInt724 == 0 && !Static71.aBoolean70) {
			return;
		}
		@Pc(49) Class60 local49;
		if (Static26.anInt724 == 1 && Static25.anInt693 < 2) {
			local49 = Static125.method2072(new Class60[] { Static34.aClass60_372, Static116.aClass60_1114, Static90.aClass60_874, Static122.aClass60_1166 });
		} else if (Static71.aBoolean70 && Static25.anInt693 < 2) {
			local49 = Static125.method2072(new Class60[] { Static92.aClass60_891, Static116.aClass60_1114, Static94.aClass60_916, Static122.aClass60_1166 });
		} else {
			local49 = Static43.method726(Static25.anInt693 - 1);
		}
		if (Static25.anInt693 > 2) {
			local49 = Static125.method2072(new Class60[] { local49, Static34.aClass60_374, Static120.method1450(Static25.anInt693 - 2), Static16.aClass60_158 });
		}
		Static87.aClass4_Sub4_Sub3_Sub4_5.method1738(local49, arg1 + 4, arg0 - -15, Static81.anInt1944 / 1000);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!q;B)V")
	public static void method2133(@OriginalArg(0) Class4_Sub17 arg0) {
		if (arg0.anInt2236 == Static127.anInt2974) {
			Static69.aBooleanArray8[arg0.anInt2255] = true;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method2134() {
		Static72.anIntArray188 = null;
		Static71.anIntArray185 = null;
		Static83.anIntArray199 = null;
		Static39.anIntArray74 = null;
		Static122.aByteArrayArrayArray7 = null;
		Static58.aByteArrayArrayArray3 = null;
		Static36.aByteArrayArrayArray2 = null;
		Static89.anIntArrayArray19 = null;
		Static101.anIntArray278 = null;
		Static123.anIntArrayArrayArray7 = null;
		Static84.aByteArrayArrayArray4 = null;
		Static10.aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!lc;B)V")
	public static void method2135(@OriginalArg(0) Class40 arg0) {
		Static60.aClass40_68 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBLjava/awt/Component;)Lclient!aa;")
	public static Class2 method2137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("Class2_Sub1");
			@Pc(16) Class2 local16 = (Class2) local12.getDeclaredConstructor().newInstance();
			local16.method990(arg1, arg2, arg0);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class2_Sub2 local29 = new Class2_Sub2();
			local29.method990(arg1, arg2, arg0);
			return local29;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method2138() {
		while (true) {
			if (Static105.aClass4_Sub13_Sub1_3.method1261(Static78.anInt1911) >= 11) {
				@Pc(23) int local23 = Static105.aClass4_Sub13_Sub1_3.method1260(11);
				if (local23 != 2047) {
					@Pc(28) boolean local28 = false;
					if (Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local23] == null) {
						local28 = true;
						Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local23] = new Class4_Sub4_Sub1_Sub2_Sub2();
						if (Static22.aClass4_Sub13Array1[local23] != null) {
							Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local23].method1886(Static22.aClass4_Sub13Array1[local23]);
						}
					}
					Static94.anIntArray231[Static43.anInt1107++] = local23;
					@Pc(64) Class4_Sub4_Sub1_Sub2_Sub2 local64 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local23];
					local64.anInt2592 = Static81.anInt1944;
					@Pc(74) int local74 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
					if (local74 == 1) {
						Static35.anIntArray68[Static85.anInt2030++] = local23;
					}
					@Pc(90) int local90 = Static105.aClass4_Sub13_Sub1_3.method1260(5);
					if (local90 > 15) {
						local90 -= 32;
					}
					@Pc(101) int local101 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
					@Pc(108) int local108 = Static105.aClass4_Sub13_Sub1_3.method1260(5);
					if (local108 > 15) {
						local108 -= 32;
					}
					@Pc(119) int local119 = Static10.anIntArray16[Static105.aClass4_Sub13_Sub1_3.method1260(3)];
					if (local28) {
						local64.anInt2634 = local64.anInt2591 = local119;
					}
					local64.method1880(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0] + local90, local101 == 1, local108 + Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0]);
					continue;
				}
			}
			Static105.aClass4_Sub13_Sub1_3.method1258();
			return;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method2139() {
		aClass60_1216 = null;
		anIntArray337 = null;
		aClass66_14 = null;
		aClass60_1218 = null;
		aClass29_4 = null;
		aClass4_Sub4_Sub3_Sub2Array9 = null;
		aClass4_Sub4_Sub3_Sub2Array10 = null;
		aClass60_1217 = null;
		aClass60_1215 = null;
	}
}
