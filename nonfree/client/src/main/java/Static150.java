import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "[Lclient!t;")
	public static Class165[] aClass165Array1;

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "Lclient!l;")
	public static Class101 aClass101_11 = new Class101(16);

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public static void method2672() {
		Static58.aClass2_Sub8_Sub1_6 = null;
		Static9.anInt3023 = -1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!g;III)V")
	public static void method2673(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte5 == 0) {
			arg0.anInt2105 = arg0.anInt2113;
		} else if (arg0.aByte5 == 1) {
			arg0.anInt2105 = (arg1 - arg0.anInt2057) / 2 + arg0.anInt2113;
		} else if (arg0.aByte5 == 2) {
			arg0.anInt2105 = arg1 - arg0.anInt2113 - arg0.anInt2057;
		} else if (arg0.aByte5 == 3) {
			arg0.anInt2105 = arg1 * arg0.anInt2113 >> 14;
		} else if (arg0.aByte5 == 4) {
			arg0.anInt2105 = (arg1 - arg0.anInt2057) / 2 + (arg1 * arg0.anInt2113 >> 14);
		} else {
			arg0.anInt2105 = arg1 - (arg0.anInt2113 * arg1 >> 14) - arg0.anInt2057;
		}
		if (arg0.aByte4 == 0) {
			arg0.anInt2048 = arg0.anInt2036;
		} else if (arg0.aByte4 == 1) {
			arg0.anInt2048 = (arg2 - arg0.anInt2031) / 2 + arg0.anInt2036;
		} else if (arg0.aByte4 == 2) {
			arg0.anInt2048 = arg2 - arg0.anInt2031 - arg0.anInt2036;
		} else if (arg0.aByte4 == 3) {
			arg0.anInt2048 = arg0.anInt2036 * arg2 >> 14;
		} else if (arg0.aByte4 == 4) {
			arg0.anInt2048 = (arg2 - arg0.anInt2031) / 2 + (arg0.anInt2036 * arg2 >> 14);
		} else {
			arg0.anInt2048 = arg2 - arg0.anInt2031 - (arg0.anInt2036 * arg2 >> 14);
		}
		if (!Static199.aBoolean295 || Static42.method804(arg0).anInt419 == 0 && arg0.anInt2092 != 0) {
			return;
		}
		if (arg0.anInt2048 < 0) {
			arg0.anInt2048 = 0;
		} else if (arg2 < arg0.anInt2031 + arg0.anInt2048) {
			arg0.anInt2048 = arg2 - arg0.anInt2031;
		}
		if (arg0.anInt2105 < 0) {
			arg0.anInt2105 = 0;
		} else if (arg0.anInt2105 + arg0.anInt2057 > arg1) {
			arg0.anInt2105 = arg1 - arg0.anInt2057;
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
	public static void method2674() {
		Static29.aClass157_7.method4027();
		Static90.aClass157_20.method4027();
	}
}
