import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lclient!ga;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!pe", name = "eb", descriptor = "Lclient!ua;")
	public static Class82 aClass82_44 = new Class82(128);

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1113 = Static146.method2172("sl_back");

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "I")
	public static int anInt3020 = 0;

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "Lclient!qg;")
	public static Class67 aClass67_1 = new Class67();

	@OriginalMember(owner = "client!pe", name = "qb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1114 = Static146.method2172("glow3:");

	@OriginalMember(owner = "client!pe", name = "rb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1115 = aClass77_1114;

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1116 = aClass77_1114;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V")
	public static void method2153() {
		aClass67_1 = null;
		aClass77_1113 = null;
		Class2_Sub1_Sub28.anIntArray453 = null;
		aClass77_1116 = null;
		aClass77_1114 = null;
		aClass82_44 = null;
		aClass29_4 = null;
		aClass77_1115 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method2154() {
		for (@Pc(7) int local7 = 0; local7 < Static145.anInt3533; local7++) {
			@Pc(18) int local18 = Static160.anIntArray643[local7];
			@Pc(22) Class2_Sub2_Sub1_Sub6_Sub2 local22 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local18];
			if (local22 != null) {
				Static168.method2809(local22, local22.aClass2_Sub2_Sub16_1.anInt3766);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
	public static void method2155(@OriginalArg(1) int arg0) {
		if (arg0 == Static97.anInt2440) {
			return;
		}
		if (Static97.anInt2440 == 0) {
			Static54.method1033();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static49.anInt1342 = 0;
			Static15.anInt482 = 0;
			Static87.anInt2290 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static1.aClass29_1 != null) {
			Static1.aClass29_1.method967();
			Static1.aClass29_1 = null;
		}
		if (Static97.anInt2440 == 25) {
			Static124.anInt3043 = 0;
			Static42.anInt1175 = 1;
			Static27.anInt815 = 1;
			Static72.anInt1931 = 0;
			Static16.anInt510 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static176.method2957(Static91.aClass43_Sub1_12, Static108.aClass43_Sub1_13, Static1.aCanvas1);
		} else {
			Static181.method3011();
		}
		Static97.anInt2440 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
	public static void method2156() {
		Static74.aClass2_Sub18_Sub1_1.method2407();
		@Pc(13) int local13 = Static74.aClass2_Sub18_Sub1_1.method2405(8);
		@Pc(22) int local22;
		if (Static145.anInt3533 > local13) {
			for (local22 = local13; local22 < Static145.anInt3533; local22++) {
				Static33.anIntArray149[Static72.anInt1932++] = Static160.anIntArray643[local22];
			}
		}
		if (Static145.anInt3533 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static145.anInt3533 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(66) int local66 = Static160.anIntArray643[local22];
			@Pc(70) Class2_Sub2_Sub1_Sub6_Sub2 local70 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local66];
			@Pc(75) int local75 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
			if (local75 == 0) {
				Static160.anIntArray643[Static145.anInt3533++] = local66;
				local70.anInt4401 = Static143.anInt3513;
			} else {
				@Pc(98) int local98 = Static74.aClass2_Sub18_Sub1_1.method2405(2);
				if (local98 == 0) {
					Static160.anIntArray643[Static145.anInt3533++] = local66;
					local70.anInt4401 = Static143.anInt3513;
					Static6.anIntArray25[Static174.anInt4449++] = local66;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local98 == 1) {
						Static160.anIntArray643[Static145.anInt3533++] = local66;
						local70.anInt4401 = Static143.anInt3513;
						local142 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
						local70.method2911(local142, false);
						local152 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
						if (local152 == 1) {
							Static6.anIntArray25[Static174.anInt4449++] = local66;
						}
					} else if (local98 == 2) {
						Static160.anIntArray643[Static145.anInt3533++] = local66;
						local70.anInt4401 = Static143.anInt3513;
						local142 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
						local70.method2911(local142, true);
						local152 = Static74.aClass2_Sub18_Sub1_1.method2405(3);
						local70.method2911(local152, true);
						@Pc(204) int local204 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
						if (local204 == 1) {
							Static6.anIntArray25[Static174.anInt4449++] = local66;
						}
					} else if (local98 == 3) {
						Static33.anIntArray149[Static72.anInt1932++] = local66;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public static void method2157() {
		Static111.method1989();
		Static164.method2752();
		Static21.method479();
		Static56.method1058();
		Static42.method810();
		Static28.method566();
		Static59.method1093();
		Static48.method921();
		Static59.method1097();
		Static155.method2645();
		Static26.method523();
		Static60.method1124();
		((Class46) Static12.anInterface2_1).method1667();
		aClass82_44.method2698();
		Static110.aClass43_Sub1_16.method2224();
		Static83.aClass43_Sub1_11.method2224();
		Static176.aClass43_Sub1_19.method2224();
		Static55.aClass43_Sub1_9.method2224();
		Static120.aClass43_Sub1_6.method2224();
		Static176.aClass43_Sub1_20.method2224();
		Static164.aClass43_Sub1_18.method2224();
		Static91.aClass43_Sub1_12.method2224();
		Static108.aClass43_Sub1_13.method2224();
		Static125.aClass43_Sub1_15.method2224();
		Static41.aClass43_Sub1_7.method2224();
	}
}
