import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!u", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "[Lclient!ng;")
	public static Class47_Sub1[] aClass47_Sub1Array2;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "Lclient!wa;")
	public static Class23 aClass23_72;

	@OriginalMember(owner = "client!u", name = "db", descriptor = "Lclient!mf;")
	public static Class69 aClass69_15;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1390 = Static161.method2452("0(U");

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1391 = Static161.method2452("Feb");

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1392 = Static161.method2452("Aug");

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1393 = Static161.method2452("Nov");

	@OriginalMember(owner = "client!u", name = "L", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1394 = Static161.method2452("Jan");

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1395 = Static161.method2452("Jul");

	@OriginalMember(owner = "client!u", name = "O", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1396 = Static161.method2452("May");

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_35 = new Class8(64);

	@OriginalMember(owner = "client!u", name = "U", descriptor = "Lclient!fb;")
	public static Interface2 anInterface2_1 = null;

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1397 = Static161.method2452("Apr");

	@OriginalMember(owner = "client!u", name = "W", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1398 = Static161.method2452("Sep");

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1403 = Static161.method2452("Mar");

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1402 = Static161.method2452("Jun");

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1401 = Static161.method2452("Oct");

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1400 = Static161.method2452("Dec");

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array30 = new Class20[] { aClass20_1394, aClass20_1391, aClass20_1403, aClass20_1397, aClass20_1396, aClass20_1402, aClass20_1395, aClass20_1392, aClass20_1398, aClass20_1401, aClass20_1393, aClass20_1400 };

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ih;)V")
	public static void method2851(@OriginalArg(0) Class43 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1811; local2 <= arg0.anInt1821; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1816; local6 <= arg0.anInt1810; local6++) {
				@Pc(16) Class5_Sub3 local16 = Static157.aClass5_Sub3ArrayArrayArray2[arg0.anInt1809][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt333; local20++) {
						if (local16.aClass43Array1[local20] == arg0) {
							local16.anInt333--;
							for (local35 = local20; local35 < local16.anInt333; local35++) {
								local16.aClass43Array1[local35] = local16.aClass43Array1[local35 + 1];
								local16.anIntArray22[local35] = local16.anIntArray22[local35 + 1];
							}
							local16.aClass43Array1[local16.anInt333] = null;
							break;
						}
					}
					local16.anInt337 = 0;
					for (local35 = 0; local35 < local16.anInt333; local35++) {
						local16.anInt337 |= local16.anIntArray22[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
	public static boolean method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static29.anInt575; local1++) {
			@Pc(6) Class64 local6 = Static4.aClass64Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2384 == 1) {
				local15 = local6.anInt2395 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2392 + (local6.anInt2388 * local15 >> 8);
					local37 = local6.anInt2382 + (local6.anInt2377 * local15 >> 8);
					local47 = local6.anInt2380 + (local6.anInt2397 * local15 >> 8);
					local57 = local6.anInt2378 + (local6.anInt2391 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2384 == 2) {
				local15 = arg0 - local6.anInt2395;
				if (local15 > 0) {
					local27 = local6.anInt2392 + (local6.anInt2388 * local15 >> 8);
					local37 = local6.anInt2382 + (local6.anInt2377 * local15 >> 8);
					local47 = local6.anInt2380 + (local6.anInt2397 * local15 >> 8);
					local57 = local6.anInt2378 + (local6.anInt2391 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2384 == 3) {
				local15 = local6.anInt2392 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2395 + (local6.anInt2387 * local15 >> 8);
					local37 = local6.anInt2381 + (local6.anInt2390 * local15 >> 8);
					local47 = local6.anInt2380 + (local6.anInt2397 * local15 >> 8);
					local57 = local6.anInt2378 + (local6.anInt2391 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2384 == 4) {
				local15 = arg2 - local6.anInt2392;
				if (local15 > 0) {
					local27 = local6.anInt2395 + (local6.anInt2387 * local15 >> 8);
					local37 = local6.anInt2381 + (local6.anInt2390 * local15 >> 8);
					local47 = local6.anInt2380 + (local6.anInt2397 * local15 >> 8);
					local57 = local6.anInt2378 + (local6.anInt2391 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2384 == 5) {
				local15 = arg1 - local6.anInt2380;
				if (local15 > 0) {
					local27 = local6.anInt2395 + (local6.anInt2387 * local15 >> 8);
					local37 = local6.anInt2381 + (local6.anInt2390 * local15 >> 8);
					local47 = local6.anInt2392 + (local6.anInt2388 * local15 >> 8);
					local57 = local6.anInt2382 + (local6.anInt2377 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
	public static int method2854(@OriginalArg(0) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}
}
