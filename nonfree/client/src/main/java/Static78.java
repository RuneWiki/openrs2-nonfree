import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "J")
	public static long aLong64;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!od;")
	private static Class60 aClass60_780 = Static41.method597("Welcome to RuneScape");

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_781 = Static41.method597("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_783 = Static41.method597("Connection lost");

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_782 = aClass60_783;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
	public static int[] anIntArray219 = new int[100];

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Lclient!od;")
	private static Class60 aClass60_786 = Static41.method597("Unable to connect)3");

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_784 = aClass60_786;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_785 = aClass60_780;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_787 = aClass60_786;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Lclient!ud;")
	public static Class75 aClass75_10 = new Class75(8);

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
	public static volatile int anInt1894 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method1270() {
		aClass75_10 = null;
		aClass60_783 = null;
		aClass60_782 = null;
		anIntArray219 = null;
		aClass60_786 = null;
		aClass60_787 = null;
		aByteArrayArray10 = null;
		aClass60_780 = null;
		aClass60_781 = null;
		aClass60_785 = null;
		aClass60_784 = null;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public static void method1271() {
		Static36.method558(Static81.aClass4_Sub14_12);
		Static112.anInt2685++;
		if (Static14.aBoolean18 && Static115.aBoolean116) {
			@Pc(24) int local24 = Static36.anInt1006;
			local24 -= Static113.anInt1295;
			@Pc(30) int local30 = Static85.anInt2015;
			if (Static81.anInt1918 > local24) {
				local24 = Static81.anInt1918;
			}
			if (Static69.aClass4_Sub14_10.anInt2392 + Static81.anInt1918 < local24 + Static81.aClass4_Sub14_12.anInt2392) {
				local24 = Static81.anInt1918 + Static69.aClass4_Sub14_10.anInt2392 - Static81.aClass4_Sub14_12.anInt2392;
			}
			@Pc(58) int local58 = local24 - Static62.anInt1586;
			@Pc(61) int local61 = Static81.aClass4_Sub14_12.anInt2417;
			@Pc(69) int local69 = local24 + Static69.aClass4_Sub14_10.anInt2416 - Static81.anInt1918;
			local30 -= Static42.anInt1098;
			if (local30 < Static68.anInt1703) {
				local30 = Static68.anInt1703;
			}
			if (Static81.aClass4_Sub14_12.anInt2440 + local30 > Static68.anInt1703 + Static69.aClass4_Sub14_10.anInt2440) {
				local30 = Static69.aClass4_Sub14_10.anInt2440 + Static68.anInt1703 - Static81.aClass4_Sub14_12.anInt2440;
			}
			@Pc(110) int local110 = local30 - Static124.anInt2802;
			if (Static81.aClass4_Sub14_12.anInt2415 < Static112.anInt2685 && (local58 > local61 || local58 < -local61 || local110 > local61 || -local61 > local110)) {
				Static70.aBoolean63 = true;
			}
			@Pc(154) int local154 = Static69.aClass4_Sub14_10.anInt2437 + local30 - Static68.anInt1703;
			@Pc(163) Class4_Sub21 local163;
			if (Static81.aClass4_Sub14_12.anObjectArray24 != null && Static70.aBoolean63) {
				local163 = new Class4_Sub21();
				local163.aClass4_Sub14_14 = Static81.aClass4_Sub14_12;
				local163.anInt2710 = local154;
				local163.anInt2709 = local69;
				local163.anObjectArray28 = Static81.aClass4_Sub14_12.anObjectArray24;
				Static28.method1353(local163);
			}
			if (Static24.anInt834 == 0) {
				if (Static70.aBoolean63) {
					if (Static81.aClass4_Sub14_12.anObjectArray16 != null) {
						local163 = new Class4_Sub21();
						local163.anObjectArray28 = Static81.aClass4_Sub14_12.anObjectArray16;
						local163.aClass4_Sub14_14 = Static81.aClass4_Sub14_12;
						local163.anInt2710 = local154;
						local163.aClass4_Sub14_15 = Static31.aClass4_Sub14_7;
						local163.anInt2709 = local69;
						Static28.method1353(local163);
					}
					if (Static31.aClass4_Sub14_7 != null && Static8.method77(Static81.aClass4_Sub14_12) != null) {
						Static14.aClass4_Sub9_Sub1_1.method826(213);
						Static14.aClass4_Sub9_Sub1_1.method781(Static81.aClass4_Sub14_12.anInt2388);
						Static14.aClass4_Sub9_Sub1_1.method820(Static31.aClass4_Sub14_7.anInt2388);
						Static14.aClass4_Sub9_Sub1_1.method772(Static31.aClass4_Sub14_7.anInt2403);
						Static14.aClass4_Sub9_Sub1_1.method786(Static81.aClass4_Sub14_12.anInt2403);
					}
				} else if ((Static18.anInt630 == 1 || Static132.method1987(Static48.anInt1184 - 1)) && Static48.anInt1184 > 2) {
					Static84.method1351();
				} else if (Static48.anInt1184 > 0) {
					Static96.method1570(Static48.anInt1184 - 1);
				}
				Static81.aClass4_Sub14_12 = null;
			}
		} else if (Static112.anInt2685 > 1) {
			Static81.aClass4_Sub14_12 = null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	public static void method1273() {
		Static49.anIntArray121 = null;
		Static53.aByteArrayArrayArray3 = null;
		Static66.aByteArrayArrayArray4 = null;
		Static20.anIntArray78 = null;
		Static113.anIntArrayArrayArray3 = null;
		Static9.aByteArrayArrayArray1 = null;
		Static119.aByteArrayArrayArray7 = null;
		Static55.anIntArray147 = null;
		Static32.anIntArrayArray22 = null;
		Static39.anIntArray108 = null;
		Static94.anIntArray283 = null;
		Static112.aByteArrayArrayArray6 = null;
	}
}
