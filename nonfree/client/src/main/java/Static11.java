import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!va;")
	public static Class78 aClass78_2;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public static int anInt327;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public static int anInt323 = 0;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!af;")
	private static Class5 aClass5_164 = Static45.method1937("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_165 = aClass5_164;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "Lclient!af;")
	private static Class5 aClass5_168 = Static45.method1937("The server is being updated)3");

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!af;")
	public static Class5 aClass5_166 = aClass5_168;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!nd;")
	public static Class53 aClass53_5 = new Class53();

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!af;")
	public static Class5 aClass5_167 = Static45.method1937("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_14 = null;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
	public static int anInt331 = 0;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method283() {
		Static87.method2230();
		Static111.method1924();
		Static109.method1894();
		Static105.method2063();
		Static45.method1933();
		Static27.method585();
		Static47.method830();
		Static47.method829();
		Static125.method2216();
		Static52.method903();
		Static93.method1588();
		Static73.method1262();
		((Class39) Static114.anInterface3_1).method1038();
		Static109.aClass28_71.method792();
		Static73.aClass41_Sub1_11.method1708();
		Static50.aClass41_Sub1_7.method1708();
		Static66.aClass41_Sub1_23.method1708();
		Static38.aClass41_Sub1_5.method1708();
		Static20.aClass41_Sub1_4.method1708();
		Static98.aClass41_Sub1_16.method1708();
		Static17.aClass41_Sub1_3.method1708();
		Static109.aClass41_Sub1_20.method1708();
		Static45.aClass41_Sub1_22.method1708();
		Static62.aClass41_Sub1_17.method1708();
		Static120.aClass41_Sub1_14.method1708();
		Static10.aClass41_Sub1_1.method1708();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method285() {
		aClass5_165 = null;
		aClass78_2 = null;
		anIntArray43 = null;
		aClass1_Sub17_14 = null;
		aClass5_164 = null;
		aClass53_5 = null;
		aClass5_166 = null;
		aClass5_167 = null;
		aClass5_168 = null;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] method286() {
		@Pc(6) Class1_Sub3_Sub1_Sub3[] local6 = new Class1_Sub3_Sub1_Sub3[Static46.anInt1118];
		for (@Pc(8) int local8 = 0; local8 < Static46.anInt1118; local8++) {
			@Pc(21) Class1_Sub3_Sub1_Sub3 local21 = local6[local8] = new Class1_Sub3_Sub1_Sub3();
			local21.anInt2445 = anInt327;
			local21.anInt2446 = Static116.anInt2900;
			local21.anInt2447 = Static75.anIntArray290[local8];
			local21.anInt2444 = Static48.anIntArray196[local8];
			local21.anInt2443 = Static109.anIntArray409[local8];
			local21.anInt2442 = Static76.anIntArray296[local8];
			local21.anIntArray374 = Static27.anIntArray97;
			local21.aByteArray33 = Static73.aByteArrayArray7[local8];
		}
		Static50.method890();
		return local6;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	public static void method290() {
		@Pc(1) Object local1 = Static123.anObject3;
		synchronized (Static123.anObject3) {
			if (Static50.anInt1250 == 0) {
				Static65.aClass55_2.method1537(5, new Class12());
			}
			Static50.anInt1250 = 600;
		}
	}
}
