import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
	public static int anInt2515;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
	public static int anInt2516;

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
	public static int anInt2518;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_49 = new Class254(6, -1);

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "J")
	public static long aLong56 = -1L;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BB)V")
	public static void method2274(@OriginalArg(0) byte arg0) {
		if (Static68.aByteArrayArrayArray4 == null) {
			Static68.aByteArrayArrayArray4 = new byte[4][Static228.anInt4746][Static44.anInt1275];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static228.anInt4746; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static44.anInt1275; local22++) {
					Static68.aByteArrayArrayArray4[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
	public static boolean method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)I")
	public static int method2279(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)I")
	public static int method2280(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
