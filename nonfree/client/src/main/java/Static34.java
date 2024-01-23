import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!db", name = "z", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Lclient!nb;")
	public static Class15 aClass15_7;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Lclient!q;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "J")
	public static long aLong22 = 0L;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!i;")
	private static Class41 aClass41_242 = Static184.method2923("Jul");

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public static int anInt909 = 0;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "Lclient!i;")
	private static Class41 aClass41_243 = Static184.method2923("Dec");

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Lclient!i;")
	private static Class41 aClass41_244 = Static184.method2923("Aug");

	@OriginalMember(owner = "client!db", name = "I", descriptor = "Lclient!i;")
	private static Class41 aClass41_245 = Static184.method2923("Oct");

	@OriginalMember(owner = "client!db", name = "K", descriptor = "Lclient!i;")
	private static Class41 aClass41_246 = Static184.method2923("Feb");

	@OriginalMember(owner = "client!db", name = "L", descriptor = "Lclient!i;")
	private static Class41 aClass41_247 = Static184.method2923("Mar");

	@OriginalMember(owner = "client!db", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_248 = Static184.method2923(" <col=ffffff>");

	@OriginalMember(owner = "client!db", name = "N", descriptor = "Lclient!i;")
	private static Class41 aClass41_249 = Static184.method2923("Jan");

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_250 = Static184.method2923("Fallen lassen");

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_251 = Static184.method2923("settings=");

	@OriginalMember(owner = "client!db", name = "U", descriptor = "Lclient!i;")
	private static Class41 aClass41_252 = Static184.method2923("Apr");

	@OriginalMember(owner = "client!db", name = "V", descriptor = "Lclient!i;")
	private static Class41 aClass41_253 = Static184.method2923("Sep");

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "Lclient!i;")
	private static Class41 aClass41_254 = Static184.method2923("May");

	@OriginalMember(owner = "client!db", name = "db", descriptor = "Lclient!i;")
	private static Class41 aClass41_256 = Static184.method2923("Jun");

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "Lclient!i;")
	private static Class41 aClass41_255 = Static184.method2923("Nov");

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array11 = new Class41[] { aClass41_249, aClass41_246, aClass41_247, aClass41_252, aClass41_254, aClass41_256, aClass41_242, aClass41_244, aClass41_253, aClass41_245, aClass41_255, aClass41_243 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Lclient!q;")
	public static Class80 method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class80 local13 = Static212.method3256(arg1);
		if (arg0 == -1) {
			return local13;
		} else if (local13 == null || local13.aClass80Array1 == null || local13.aClass80Array1.length <= arg0) {
			return null;
		} else {
			return local13.aClass80Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	public static void method676() {
		@Pc(7) byte[][] local7 = Static150.aByteArrayArray9;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static194.method3305();
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
					@Pc(25) boolean local25 = false;
					@Pc(33) int local33 = Static97.anIntArrayArrayArray13[local11][local17][local21];
					if (local33 != -1) {
						@Pc(43) int local43 = local33 >> 24 & 0x3;
						@Pc(53) int local53 = local33 >> 14 & 0x3FF;
						@Pc(59) int local59 = local33 >> 1 & 0x3;
						@Pc(65) int local65 = local33 >> 3 & 0x7FF;
						@Pc(75) int local75 = local65 / 8 + (local53 / 8 << 8);
						for (@Pc(77) int local77 = 0; local77 < Static131.anIntArray320.length; local77++) {
							if (local75 == Static131.anIntArray320[local77] && local7[local77] != null) {
								Static57.method1118(local17 * 8, local59, (local53 & 0x7) * 8, (local65 & 0x7) * 8, Static149.aClass42Array1, local43, local7[local77], local21 * 8, local11);
								local25 = true;
								break;
							}
						}
					}
					if (!local25) {
						Static16.method307(local11, 8, 8, local21 * 8, local17 * 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B[B)Lclient!cc;")
	public static Class2_Sub2_Sub4 method678(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) Class2_Sub2_Sub4_Sub1_Sub1 local17 = new Class2_Sub2_Sub4_Sub1_Sub1(arg0, Static219.anIntArray501, Static120.anIntArray310, Static89.anIntArray224, Static60.anIntArray498, Static102.aByteArrayArray6);
			Static212.method3255();
			return local17;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([BZILclient!ud;)V")
	public static void method679(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class96 arg2) {
		@Pc(7) Class2_Sub13 local7 = new Class2_Sub13();
		local7.aClass96_3 = arg2;
		local7.aByteArray27 = arg0;
		local7.anInt2044 = 0;
		local7.aLong150 = arg1;
		@Pc(22) Class108 local22 = Static201.aClass108_17;
		synchronized (Static201.aClass108_17) {
			Static201.aClass108_17.method3334(local7);
		}
		Static131.method2089();
	}
}
