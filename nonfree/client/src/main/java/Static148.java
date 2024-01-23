import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "J")
	public static long aLong122;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1016 = null;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public static int anInt3090 = 0;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
	public static int[] anIntArray319 = new int[50];

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Z")
	public static boolean aBoolean130 = true;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1017 = Static186.method3527(" GMT");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method2486() {
		@Pc(7) int local7 = (Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7) + Static91.anInt4078;
		Static69.anInt1317 = 0;
		@Pc(26) int local26 = (Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7) + Static101.anInt2041;
		if (local7 >= 3053 && local7 <= 3156 && local26 >= 3056 && local26 <= 3136) {
			Static69.anInt1317 = 1;
		}
		if (local7 >= 3072 && local7 <= 3118 && local26 >= 9492 && local26 <= 9535) {
			Static69.anInt1317 = 1;
		}
		if (Static69.anInt1317 == 1 && local7 >= 3139 && local7 <= 3199 && local26 >= 3008 && local26 <= 3062) {
			Static69.anInt1317 = 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)Lclient!db;")
	public static Class18 method2487(@OriginalArg(1) int arg0) {
		@Pc(6) Class18 local6 = (Class18) Static42.aClass84_18.method2579((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static155.aClass86_58.method3325(Static175.method2903(arg0), Static45.method691(arg0));
		local6 = new Class18();
		local6.anInt790 = arg0;
		if (local24 != null) {
			local6.method603(new Class1_Sub17(local24));
		}
		local6.method594();
		if (local6.aBoolean33) {
			local6.anInt807 = 0;
			local6.aBoolean42 = false;
		}
		if (!Static137.aBoolean120 && local6.aBoolean32) {
			local6.aClass50Array22 = null;
		}
		Static42.aClass84_18.method2582(local6, (long) arg0);
		return local6;
	}
}
