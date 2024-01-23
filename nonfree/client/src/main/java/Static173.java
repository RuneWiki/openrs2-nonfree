import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Lclient!ah;")
	public static Class6 aClass6_15;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "Lclient!ai;")
	public static Class7 aClass7_34;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1278 = Static200.method3116("Please contact customer support)3");

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1277 = aClass60_1278;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public static int anInt3720 = 0;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
	public static int anInt3728 = 0;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "Lclient!db;")
	public static Class19 aClass19_15 = new Class19();

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1279 = Static200.method3116(" from your ignore list first)3");

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "[I")
	public static int[] anIntArray493 = new int[25];

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1280 = aClass60_1279;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BII)Z")
	public static boolean method2790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	public static void method2791() {
		Static192.anInt4121 = 0;
		Static59.anInt1503 = 0;
		Static87.method1512();
		Static73.method1317();
		Static121.method2033();
		Static91.method1586();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static59.anInt1503; local19++) {
			local25 = Static122.anIntArray343[local19];
			if (Static41.aClass9_Sub4_Sub1Array2[local25].anInt3907 != Static42.anInt910) {
				Static41.aClass9_Sub4_Sub1Array2[local25] = null;
			}
		}
		if (Static16.aClass1_Sub9_Sub1_1.anInt1192 != Static27.anInt644) {
			throw new RuntimeException("gpp1 pos:" + Static16.aClass1_Sub9_Sub1_1.anInt1192 + " psize:" + Static27.anInt644);
		}
		for (local25 = 0; local25 < Static205.anInt4356; local25++) {
			if (Static41.aClass9_Sub4_Sub1Array2[Static124.anIntArray353[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static205.anInt4356);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	public static void method2792() {
		for (@Pc(7) int local7 = 0; local7 < Static56.anInt1482; local7++) {
			@Pc(13) int local13 = Static19.anIntArray73[local7];
			@Pc(17) Class9_Sub4_Sub2 local17 = Static1.aClass9_Sub4_Sub2Array1[local13];
			if (local17 != null) {
				Static29.method539(local17, local17.aClass1_Sub1_Sub9_1.anInt2329);
			}
		}
	}
}
