import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static488 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!qb;")
	public static Class247 aClass247_4;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[J")
	public static final long[] aLongArray20 = new long[32];

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!mc;")
	public static Class198 aClass198_15 = null;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method7286() {
		return Static389.aBoolean533 || Static294.aClass12_Sub20_2 == null ? "" : Static294.aClass12_Sub20_2.aString41;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V")
	public static void method7289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static58.anInt1425 == 1) {
			Static246.method4224(arg0, arg1, Static419.aClass12_Sub20_3);
		} else if (Static58.anInt1425 == 2) {
			Static397.method6232(arg1, arg0);
		}
		Static58.anInt1425 = 0;
		Static419.aClass12_Sub20_3 = null;
	}
}
