import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public static int anInt3983;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Z")
	public static boolean aBoolean304;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_16;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString234 = " more options";

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
	public static int[] anIntArray358 = new int[1000];

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient!in;")
	public static Class71 aClass71_17 = null;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray51 = new String[200];

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString235 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "[Lclient!ve;")
	public static Class169[] aClass169Array5 = new Class169[50];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public static void method3195() {
		Static194.aClass135_20.method3320(5);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZBLclient!hm;)V")
	public static void method3199(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		@Pc(14) int local14 = arg1.anInt2431;
		@Pc(18) int local18 = (int) arg1.aLong205;
		arg1.method4441();
		if (arg0) {
			Static40.method825(local14);
		}
		Static140.method2340(local14);
		@Pc(33) Class71 local33 = Static56.method1058(local18);
		if (local33 != null) {
			Static160.method2779(local33);
		}
		@Pc(41) int local41 = Static134.anInt2945;
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41; local43++) {
			if (Static26.method531(Static61.aShortArray23[local43])) {
				Static150.method2613(local43);
			}
		}
		if (Static134.anInt2945 == 1) {
			Static14.aBoolean23 = false;
			Static75.method1309(Static116.anInt5594, Static276.anInt2924, Static88.anInt1955, Static279.anInt5379);
		} else {
			Static75.method1309(Static116.anInt5594, Static276.anInt2924, Static88.anInt1955, Static279.anInt5379);
			local43 = Static134.aClass1_Sub2_Sub1_3.method451(Static185.aString226);
			for (@Pc(75) int local75 = 0; local75 < Static134.anInt2945; local75++) {
				@Pc(88) int local88 = Static134.aClass1_Sub2_Sub1_3.method451(Static132.method2239(local75));
				if (local43 < local88) {
					local43 = local88;
				}
			}
			Static116.anInt5594 = local43 + 8;
			Static276.anInt2924 = (Static221.aBoolean340 ? 26 : 22) + Static134.anInt2945 * 15;
		}
		if (Static116.anInt5593 != -1) {
			Static90.method1588(1, Static116.anInt5593);
		}
	}
}
