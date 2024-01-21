import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hf", name = "mb", descriptor = "[[Lclient!kc;")
	public static Class2_Sub13[][] aClass2_Sub13ArrayArray1;

	@OriginalMember(owner = "client!hf", name = "Pb", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!hf", name = "Vb", descriptor = "Lclient!je;")
	private static Class40 aClass40_601 = Static69.method1231("wave:");

	@OriginalMember(owner = "client!hf", name = "ob", descriptor = "Lclient!je;")
	public static Class40 aClass40_596 = aClass40_601;

	@OriginalMember(owner = "client!hf", name = "vb", descriptor = "I")
	public static int anInt1178 = 0;

	@OriginalMember(owner = "client!hf", name = "Xb", descriptor = "Lclient!je;")
	private static Class40 aClass40_602 = Static69.method1231("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!hf", name = "zb", descriptor = "Lclient!je;")
	public static Class40 aClass40_597 = aClass40_602;

	@OriginalMember(owner = "client!hf", name = "Cb", descriptor = "Lclient!je;")
	public static Class40 aClass40_598 = aClass40_601;

	@OriginalMember(owner = "client!hf", name = "ac", descriptor = "Lclient!je;")
	private static Class40 aClass40_603 = Static69.method1231("Enter your username (V password)3");

	@OriginalMember(owner = "client!hf", name = "Ob", descriptor = "Lclient!je;")
	public static Class40 aClass40_599 = aClass40_603;

	@OriginalMember(owner = "client!hf", name = "Tb", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array4 = new Class40[500];

	@OriginalMember(owner = "client!hf", name = "Ub", descriptor = "Lclient!je;")
	public static Class40 aClass40_600 = Static69.method1231("Standort");

	@OriginalMember(owner = "client!hf", name = "Yb", descriptor = "Lclient!na;")
	public static Class2_Sub9 aClass2_Sub9_3 = new Class2_Sub9(new byte[5000]);

	@OriginalMember(owner = "client!hf", name = "bc", descriptor = "Lclient!je;")
	public static Class40 aClass40_604 = Static69.method1231("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!hf", name = "cc", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!hf", name = "hc", descriptor = "[I")
	public static int[] anIntArray129 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(B)V")
	public static void method812() {
		Static103.aClass14_1.method897();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static30.aLongArray3[local14] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static31.aLongArray4[local28] = 0L;
		}
		Static21.anInt647 = 0;
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)Lclient!pb;")
	public static Class14 method813() {
		try {
			return (Class14) Class.forName("Class14_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class14_Sub1();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!na;IB)Lclient!je;")
	public static Class40 method814(@OriginalArg(0) Class2_Sub9 arg0) {
		try {
			@Pc(12) Class40 local12 = new Class40();
			local12.anInt1425 = arg0.method653();
			if (local12.anInt1425 > 32767) {
				local12.anInt1425 = 32767;
			}
			local12.aByteArray18 = new byte[local12.anInt1425];
			arg0.anInt976 += Static47.aClass19_1.method429(local12.anInt1425, arg0.anInt976, arg0.aByteArray16, 0, local12.aByteArray18);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static35.aClass40_490;
		}
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(B)V")
	public static void method815() {
		aClass2_Sub9_3 = null;
		aClass40_598 = null;
		aString1 = null;
		aClass40_597 = null;
		aClass40_604 = null;
		aClass40_601 = null;
		aClass40_596 = null;
		aClass2_Sub13ArrayArray1 = null;
		aClass40_602 = null;
		aClass40_603 = null;
		anIntArray129 = null;
		aClass40_600 = null;
		aClass40_599 = null;
		aClass40Array4 = null;
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	public static void method816() {
		Static58.anInt1521 = 0;
		Static114.anInt2625 = 0;
		Static33.method1923();
		Static127.method2106();
		Static70.method1221();
		@Pc(31) int local31;
		for (@Pc(17) int local17 = 0; local17 < Static114.anInt2625; local17++) {
			local31 = Static104.anIntArray286[local17];
			if (Static28.anInt704 != Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local31].anInt1808) {
				Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local31].aClass2_Sub1_Sub11_1 = null;
				Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local31] = null;
			}
		}
		if (Static7.aClass2_Sub9_Sub1_1.anInt976 != Static130.anInt3009) {
			throw new RuntimeException("gnp1 pos:" + Static7.aClass2_Sub9_Sub1_1.anInt976 + " psize:" + Static130.anInt3009);
		}
		for (local31 = 0; local31 < Static102.anInt2484; local31++) {
			if (Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[Static37.anIntArray97[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static102.anInt2484);
			}
		}
	}
}
