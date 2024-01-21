import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt779;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3 aClass2_Sub2_Sub3_Sub3_2;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Lclient!ke;")
	public static Class43 aClass43_9;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	public static int anInt797;

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
	public static int anInt811;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
	public static int[] anIntArray102 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!sg;")
	private static Class77 aClass77_329 = Static146.method2172("Please try using a different world)3");

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_330 = aClass77_329;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_331 = aClass77_329;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "Lclient!sg;")
	private static Class77 aClass77_338 = Static146.method2172("Walk here");

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_332 = aClass77_338;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "Lclient!sg;")
	public static Class77 aClass77_333 = aClass77_329;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "Lclient!sg;")
	public static Class77 aClass77_334 = Static146.method2172("<col=00ff00>");

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "Lclient!sg;")
	public static Class77 aClass77_335 = aClass77_329;

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "[I")
	public static int[] anIntArray103 = new int[4000];

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_336 = aClass77_329;

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "Lclient!sg;")
	public static Class77 aClass77_337 = aClass77_329;

	@OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
	public static int anInt812 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLclient!sg;I)V")
	public static void method551(@OriginalArg(1) Class77 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class77 local16 = arg0.method2516().method2525();
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < Static124.anInt3042; local20++) {
			@Pc(28) Class2_Sub2_Sub1_Sub6_Sub1 local28 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static177.anIntArray632[local20]];
			if (local28 != null && local28.aClass77_1482 != null && local28.aClass77_1482.method2508(local16)) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local28.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local28.anIntArray620[0], 1);
				if (arg1 == 1) {
					Static124.aClass2_Sub18_Sub1_3.method2398(100);
					Static124.aClass2_Sub18_Sub1_3.method2369(Static177.anIntArray632[local20]);
				} else if (arg1 == 4) {
					Static124.aClass2_Sub18_Sub1_3.method2398(181);
					Static124.aClass2_Sub18_Sub1_3.method2396(Static177.anIntArray632[local20]);
				} else if (arg1 == 6) {
					Static124.aClass2_Sub18_Sub1_3.method2398(203);
					Static124.aClass2_Sub18_Sub1_3.method2396(Static177.anIntArray632[local20]);
				} else if (arg1 == 7) {
					Static124.aClass2_Sub18_Sub1_3.method2398(119);
					Static124.aClass2_Sub18_Sub1_3.method2396(Static177.anIntArray632[local20]);
				}
				local18 = true;
				break;
			}
		}
		if (!local18) {
			Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { Static179.aClass77_1553, local16 }), 0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
	public static void method556() {
		aClass77_332 = null;
		aClass77_331 = null;
		anIntArray102 = null;
		aClass77_329 = null;
		aClass43_9 = null;
		anIntArray103 = null;
		aClass2_Sub2_Sub3_Sub3_2 = null;
		aClass77_338 = null;
		aClass77_337 = null;
		aClass77_336 = null;
		aClass77_334 = null;
		aClass77_333 = null;
		aClass77_335 = null;
		aClass77_330 = null;
	}
}
