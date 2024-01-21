import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "[I")
	public static final int[] anIntArray80 = new int[200];

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_223 = Static81.method1507("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_224 = Static81.method1507("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
	public static int anInt922 = 0;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
	public static void method663() {
		if (Static91.aClass53_2 != null) {
			Static91.aClass53_2.method1713();
			Static91.aClass53_2 = null;
		}
		Static142.method2460();
		Static172.method2978();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static66.aClass93Array1[local21].method3269();
		}
		Static56.method1089();
		System.gc();
		Static122.method2067();
		Static66.anInt1656 = -1;
		Static173.aBoolean177 = false;
		Static81.method1510();
		Static57.method1099(10);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Z")
	public static boolean method664(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static98.aShortArray28[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 1004;
	}
}
