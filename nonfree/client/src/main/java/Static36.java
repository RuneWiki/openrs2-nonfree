import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!df", name = "ab", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!df", name = "hb", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_4;

	@OriginalMember(owner = "client!df", name = "V", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_387 = Static187.method3089("settings");

	@OriginalMember(owner = "client!df", name = "W", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!df", name = "X", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_388 = Static187.method3089("Please try again)3");

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_389 = Static187.method3089("Existing User");

	@OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
	public static int anInt1017 = 0;

	@OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
	public static int anInt1018 = -1;

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
	public static int anInt1019 = 0;

	@OriginalMember(owner = "client!df", name = "eb", descriptor = "[J")
	public static final long[] aLongArray2 = new long[1000];

	@OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
	public static int anInt1021 = 0;

	@OriginalMember(owner = "client!df", name = "jb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_390 = aClass92_389;

	@OriginalMember(owner = "client!df", name = "kb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_391 = aClass92_388;

	@OriginalMember(owner = "client!df", name = "lb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_392 = Static187.method3089("M");

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	public static void method677() {
		Static65.aBoolean45 = true;
		Static111.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLclient!vd;)V")
	public static void method679(@OriginalArg(1) Class92 arg0) {
		if (Static4.anInt101 >= 2) {
			@Pc(15) int local15;
			@Pc(33) int local33;
			if (arg0.method3241(Static194.aClass92_1978)) {
				for (local15 = 0; local15 < 10; local15++) {
					System.gc();
				}
				@Pc(24) Runtime local24 = Runtime.getRuntime();
				local33 = (int) ((local24.totalMemory() - local24.freeMemory()) / 1024L);
				Static145.method2151(Static208.method787(new Class92[] { Static21.aClass92_219, Static49.method872(local33), Static1.aClass92_32 }), null, 0);
			}
			if (arg0.method3241(Static20.aClass92_217)) {
				Static150.method2273();
			}
			if (arg0.method3241(Static71.aClass92_665)) {
				Static184.aBoolean225 = true;
			}
			if (arg0.method3241(Static84.aClass92_778)) {
				Static184.aBoolean225 = false;
			}
			arg0.method3241(Static155.aClass92_1433);
			arg0.method3241(Static70.aClass92_647);
			if (arg0.method3241(Static113.aClass92_1098)) {
				for (local15 = 0; local15 < 4; local15++) {
					for (@Pc(97) int local97 = 1; local97 < 103; local97++) {
						for (local33 = 1; local33 < 103; local33++) {
							Static98.aClass7Array1[local15].anIntArrayArray4[local97][local33] = 0;
						}
					}
				}
			}
			if (arg0.method3205(Static112.aClass92_1080) && Static86.anInt1862 != 0) {
				Static98.method1434(arg0.method3232(6).method3235());
			}
			if (arg0.method3241(Static170.aClass92_1714) && Static86.anInt1862 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method3205(Static71.aClass92_666)) {
				Static173.anInt3701 = arg0.method3232(12).method3196().method3235();
				Static145.method2151(Static208.method787(new Class92[] { Static48.aClass92_515, Static49.method872(Static173.anInt3701) }), null, 0);
			}
			if (arg0.method3241(Static209.aClass92_2058)) {
				Static151.aBoolean178 = true;
			}
		}
		Static38.aClass1_Sub14_Sub1_3.method3067(255);
		Static38.aClass1_Sub14_Sub1_3.method3024(arg0.method3233() - 1);
		Static38.aClass1_Sub14_Sub1_3.method3018(arg0.method3232(2));
	}
}
