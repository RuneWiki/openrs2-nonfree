import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt18;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt22;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!ld;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "J")
	public static long aLong1;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] aClass6_Sub3_Sub3_Sub2Array1;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
	public static int anInt28;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	public static int anInt35;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "Lclient!rd;")
	private static Class63 aClass63_16 = Static80.method1463("scroll:");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_9 = aClass63_16;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!rd;")
	private static Class63 aClass63_13 = Static80.method1463("slide:");

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_10 = aClass63_13;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_11 = Static80.method1463("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_12 = aClass63_16;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_14 = null;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_15 = aClass63_13;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
	public static int anInt27 = 0;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1 = new Class2(4096);

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
	public static int anInt31 = -1;

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
	public static int anInt32 = 0;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "Lclient!rd;")
	public static Class63 aClass63_17 = Static80.method1463("weiss:");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method19() {
		@Pc(1) Object local1 = Static99.anObject4;
		synchronized (Static99.anObject4) {
			if (Static25.anInt849 != 0) {
				Static25.anInt849 = 1;
				try {
					Static99.anObject4.wait();
				} catch (@Pc(20) InterruptedException local20) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[BI)I")
	public static int method23(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg2; local7++) {
			local5 = local5 >>> 8 ^ Class6_Sub3_Sub9.anIntArray179[(local5 ^ arg1[local7]) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	public static boolean method24(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	public static void method26() {
		aClass63_12 = null;
		aClass63_10 = null;
		aClass63_17 = null;
		aClass63_15 = null;
		aClass63_16 = null;
		aClass63_13 = null;
		aClass63_9 = null;
		anIntArray1 = null;
		aClass45_1 = null;
		aClass63_11 = null;
		aClass63_14 = null;
		anIntArray2 = null;
		anIntArray3 = null;
		aBooleanArray1 = null;
		aClass6_Sub3_Sub3_Sub2Array1 = null;
		aClass2_1 = null;
	}
}
