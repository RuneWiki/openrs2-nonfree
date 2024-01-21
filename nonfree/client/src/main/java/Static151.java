import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1069 = Static8.method128("Bad session id)3");

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1067 = aClass18_1069;

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1068 = Static8.method128("Neuer Benutzer");

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "[I")
	public static int[] anIntArray386 = new int[32];

	@OriginalMember(owner = "client!ta", name = "qb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1070 = Static8.method128("Stufe)2");

	@OriginalMember(owner = "client!ta", name = "rb", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[5];

	@OriginalMember(owner = "client!ta", name = "tb", descriptor = "I")
	public static int anInt4182 = 0;

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
	public static int anInt4183 = 0;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
	public static void method2853() {
		aClass18_1070 = null;
		aBooleanArray14 = null;
		aClass18_1068 = null;
		aClass18_1069 = null;
		anIntArray386 = null;
		aClass18_1067 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJ)V")
	public static void method2854(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static39.anInt1205; local22++) {
			if (Static162.aLongArray6[local22] == arg0) {
				Static39.anInt1205--;
				for (@Pc(44) int local44 = local22; local44 < Static39.anInt1205; local44++) {
					Static162.aLongArray6[local44] = Static162.aLongArray6[local44 + 1];
					Static39.aClass18Array6[local44] = Static39.aClass18Array6[local44 + 1];
				}
				Static159.anInt4381 = Static167.anInt4526;
				Static95.aClass1_Sub6_Sub1_1.method555(1);
				Static95.aClass1_Sub6_Sub1_1.method515(arg0);
				return;
			}
		}
	}
}
