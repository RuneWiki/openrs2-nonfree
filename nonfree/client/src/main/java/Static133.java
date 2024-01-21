import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public static final int anInt2875 = 50;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
	public static int[] anIntArray311 = new int[anInt2875];

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1037 = Static120.method2057("This world is full)3");

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
	public static int[] anIntArray312 = new int[anInt2875];

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	public static int[] anIntArray313 = new int[anInt2875];

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
	public static int[] anIntArray314 = new int[anInt2875];

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array15 = new Class81[anInt2875];

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
	public static int[] anIntArray315 = new int[anInt2875];

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1038 = aClass81_1037;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1039 = Static120.method2057("<)4col>");

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "[I")
	public static int[] anIntArray316 = new int[anInt2875];

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	public static int anInt2873 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
	public static int[] anIntArray317 = new int[anInt2875];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZJ)V")
	public static void method2257(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static9.anInt178 >= 100) {
			Static131.method2247(0, Static166.aClass81_1352, Static149.aClass81_1213);
			return;
		}
		@Pc(27) Class81 local27 = Static106.method1751(arg0).method2808();
		for (@Pc(29) int local29 = 0; local29 < Static9.anInt178; local29++) {
			if (Static90.aLongArray4[local29] == arg0) {
				Static131.method2247(0, Static127.method2169(new Class81[] { local27, Static116.aClass81_952 }), Static149.aClass81_1213);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static58.anInt1378; local64++) {
			if (arg0 == Static121.aLongArray6[local64]) {
				Static131.method2247(0, Static127.method2169(new Class81[] { Static179.aClass81_1419, local27, Static113.aClass81_938 }), Static149.aClass81_1213);
				return;
			}
		}
		if (local27.method2800(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518)) {
			Static131.method2247(0, Static178.aClass81_1416, Static149.aClass81_1213);
			return;
		}
		Static90.aLongArray4[Static9.anInt178] = arg0;
		Static105.aClass81Array8[Static9.anInt178++] = Static106.method1751(arg0);
		Static140.anInt3066 = Static121.anInt2701;
		Static104.aClass1_Sub8_Sub1_2.method366(0);
		Static104.aClass1_Sub8_Sub1_2.method355(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method2258() {
		anIntArray313 = null;
		anIntArray316 = null;
		aClass81_1037 = null;
		anIntArray311 = null;
		anIntArray314 = null;
		anIntArray315 = null;
		aClass81_1038 = null;
		anIntArray317 = null;
		aClass81_1039 = null;
		anIntArray312 = null;
		aClass81Array15 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BJ)V")
	public static void method2259(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static160.method2787(arg0 - 1L);
			Static160.method2787(1L);
		} else {
			Static160.method2787(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method2260(@OriginalArg(0) int arg0) {
		Static126.anInt2764 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static8.anInt164; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static141.anInt709; local6++) {
				if (Static167.aClass1_Sub17ArrayArrayArray1[arg0][local3][local6] == null) {
					Static167.aClass1_Sub17ArrayArrayArray1[arg0][local3][local6] = new Class1_Sub17(arg0, local3, local6);
				}
			}
		}
	}
}
