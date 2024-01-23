import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public static int anInt381;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public static int anInt378 = 0;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_141 = Static231.method3737("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public static int anInt379 = 0;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[1000][];

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt382 = 0;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public static int anInt383 = -1;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public static void method371() {
		for (@Pc(7) int local7 = 0; local7 < Static100.anInt2153; local7++) {
			@Pc(18) Class78 local18 = Static143.method2370(local7);
			if (local18 != null && local18.anInt2860 == 0) {
				Static203.anIntArray12[local7] = 0;
				Static141.anIntArray267[local7] = 0;
			}
		}
		Static158.aClass50_19 = new Class50(16);
	}
}
