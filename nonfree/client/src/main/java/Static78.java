import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "J")
	public static long aLong53;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!ge;")
	public static Class7 aClass7_45;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_19;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[Lclient!f;")
	public static Class6_Sub3_Sub1_Sub2_Sub1[] aClass6_Sub3_Sub1_Sub2_Sub1Array1 = new Class6_Sub3_Sub1_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1123 = Static80.method1463("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[Lclient!p;")
	public static Class6_Sub3_Sub1_Sub2_Sub2[] aClass6_Sub3_Sub1_Sub2_Sub2Array1 = new Class6_Sub3_Sub1_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1125 = Static80.method1463("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1124 = aClass63_1125;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
	public static int[] anIntArray241 = new int[5];

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	public static int anInt2156 = 0;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1126 = Static80.method1463("@red@");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method1448() {
		aClass6_Sub3_Sub1_Sub2_Sub1Array1 = null;
		anIntArray241 = null;
		aClass63_1123 = null;
		aClass7_45 = null;
		aClass63_1124 = null;
		aClass6_Sub3_Sub3_Sub3_19 = null;
		aClass6_Sub3_Sub1_Sub2_Sub2Array1 = null;
		aClass63_1126 = null;
		aClass63_1125 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)I")
	public static int method1449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (arg0 + local15) / arg1 - local15;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)I")
	public static int method1450() {
		@Pc(14) int local14 = Static110.method2038(Static101.anInt2810, Static4.anInt45, Static41.anInt1273);
		return local14 - Static34.anInt1163 >= 800 || (Static103.aByteArrayArrayArray92[Static101.anInt2810][Static41.anInt1273 >> 7][Static4.anInt45 >> 7] & 0x4) == 0 ? 3 : Static101.anInt2810;
	}
}
