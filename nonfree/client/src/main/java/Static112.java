import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!bd;")
	public static Class8 aClass8_30;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean160 = false;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_2900 = Static94.method1596("p12_full");

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!cb;")
	public static Class11 aClass11_27 = new Class11(20);

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Lclient!a;")
	private static Class1 aClass1_2905 = Static94.method1596("Loading )2 please wait)3");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_2901 = aClass1_2905;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt2796 = -1;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
	public static int[] anIntArray353 = new int[1000];

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!a;")
	private static Class1 aClass1_2902 = Static94.method1596("Create a free account");

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_2903 = Static94.method1596("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_2904 = aClass1_2902;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	public static int anInt2804 = 10;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Lclient!a;")
	public static Class1 aClass1_2906 = Static94.method1596("gleiten:");

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "Lclient!a;")
	public static Class1 aClass1_2907 = Static94.method1596("(U3");

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "Lclient!cb;")
	public static Class11 aClass11_28 = new Class11(50);

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!a;")
	public static Class1 aClass1_2908 = Static94.method1596("Lade Texturen )2 ");

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "Lclient!a;")
	public static Class1 aClass1_2909 = Static94.method1596("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII[B)I")
	public static int method1811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg1; local14++) {
			local7 = Class55.anIntArray289[(local7 ^ arg2[local14]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public static void method1814() {
		anIntArray352 = null;
		aClass1_2904 = null;
		aLongArray7 = null;
		aClass1_2908 = null;
		aClass1_2900 = null;
		aClass1_2909 = null;
		aClass11_27 = null;
		aClass1_2903 = null;
		aClass1_2905 = null;
		aClass1_2907 = null;
		aClass11_28 = null;
		anIntArray353 = null;
		aClass1_2902 = null;
		aClass1_2901 = null;
		aClass1_2906 = null;
		aClass8_30 = null;
	}
}
