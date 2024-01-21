import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "Xc", descriptor = "Lclient!bb;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!b", name = "cd", descriptor = "I")
	public static int anInt316;

	@OriginalMember(owner = "client!b", name = "fd", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!b", name = "od", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!b", name = "ad", descriptor = "Lclient!rd;")
	public static Class64 aClass64_234 = Static69.method1153("Handel akzeptieren");

	@OriginalMember(owner = "client!b", name = "bd", descriptor = "Lclient!rd;")
	public static Class64 aClass64_235 = Static69.method1153("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!b", name = "dd", descriptor = "I")
	public static int anInt317 = -1;

	@OriginalMember(owner = "client!b", name = "ed", descriptor = "I")
	public static int anInt318 = 0;

	@OriginalMember(owner = "client!b", name = "gd", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array2 = new Class64[100];

	@OriginalMember(owner = "client!b", name = "hd", descriptor = "I")
	public static int anInt319 = 0;

	@OriginalMember(owner = "client!b", name = "id", descriptor = "I")
	public static volatile int anInt320 = 0;

	@OriginalMember(owner = "client!b", name = "kd", descriptor = "Lclient!rd;")
	public static Class64 aClass64_236 = Static69.method1153("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!b", name = "ld", descriptor = "I")
	public static int anInt322 = -1;

	@OriginalMember(owner = "client!b", name = "nd", descriptor = "Lclient!rd;")
	public static Class64 aClass64_237 = Static69.method1153("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(B)V")
	public static void method212() {
		aClass64_234 = null;
		aClass64_237 = null;
		aClass64Array2 = null;
		anIntArray47 = null;
		aClass64_236 = null;
		aClass64_235 = null;
		aClass8_1 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
	public static boolean method213(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
