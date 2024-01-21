import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public static int anInt483;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_3;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_229 = Static146.method2172("jlv");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	public static int anInt481 = 0;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	public static int anInt482 = 0;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!sg;")
	private static Class77 aClass77_234 = Static146.method2172("white:");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_230 = aClass77_234;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_231 = Static146.method2172("Hierhin gehen");

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_232 = aClass77_234;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!sg;")
	public static Class77 aClass77_233 = null;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public static volatile int anInt486 = 0;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!sg;Lclient!sg;Lclient!ke;I)[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] method327(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class43 arg2) {
		@Pc(6) int local6 = arg2.method2206(arg0);
		@Pc(20) int local20 = arg2.method2215(local6, arg1);
		return Static23.method515(arg2, local20, local6);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JI)V")
	public static void method328(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static181.anInt4605; local14++) {
			if (Static72.aLongArray4[local14] == arg0) {
				Static181.anInt4605--;
				for (@Pc(32) int local32 = local14; local32 < Static181.anInt4605; local32++) {
					Static72.aLongArray4[local32] = Static72.aLongArray4[local32 + 1];
					Static173.aClass77Array26[local32] = Static173.aClass77Array26[local32 + 1];
				}
				Static8.anInt229 = Static52.anInt1417;
				Static124.aClass2_Sub18_Sub1_3.method2398(139);
				Static124.aClass2_Sub18_Sub1_3.method2384(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	public static void method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static120.anInt1042 != 0 && arg1 != -1) {
			Static58.method1066(Static125.aClass43_Sub1_15, 0, Static120.anInt1042, arg1);
			Static8.aBoolean10 = true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method330() {
		aClass77_229 = null;
		aClass77_231 = null;
		aClass77_233 = null;
		aClass77_230 = null;
		aClass43_Sub1_3 = null;
		aClass77_232 = null;
		aClass77_234 = null;
	}
}
