import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!ec;")
	public static Class46 aClass46_18 = new Class46(5);

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method2120() {
		Static250.aClass2_Sub26_Sub1_2.method4282();
		@Pc(13) int local13 = Static250.aClass2_Sub26_Sub1_2.method4278(8);
		@Pc(23) int local23;
		if (local13 < Static71.anInt1550) {
			for (local23 = local13; local23 < Static71.anInt1550; local23++) {
				Static33.anIntArray51[Static67.anInt6137++] = Static9.anIntArray12[local23];
			}
		}
		if (local13 > Static71.anInt1550) {
			throw new RuntimeException("gnpov1");
		}
		Static71.anInt1550 = 0;
		for (local23 = 0; local23 < local13; local23++) {
			@Pc(62) int local62 = Static9.anIntArray12[local23];
			@Pc(66) Class36_Sub3_Sub1 local66 = Static201.aClass36_Sub3_Sub1Array1[local62];
			@Pc(71) int local71 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
			if (local71 == 0) {
				Static9.anIntArray12[Static71.anInt1550++] = local62;
				local66.anInt5091 = Static148.anInt3168;
			} else {
				@Pc(93) int local93 = Static250.aClass2_Sub26_Sub1_2.method4278(2);
				if (local93 == 0) {
					Static9.anIntArray12[Static71.anInt1550++] = local62;
					local66.anInt5091 = Static148.anInt3168;
					Static161.anIntArray256[Static102.anInt2234++] = local62;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local93 == 1) {
						Static9.anIntArray12[Static71.anInt1550++] = local62;
						local66.anInt5091 = Static148.anInt3168;
						local136 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
						local66.method4094(1, local136);
						local146 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
						if (local146 == 1) {
							Static161.anIntArray256[Static102.anInt2234++] = local62;
						}
					} else if (local93 == 2) {
						Static9.anIntArray12[Static71.anInt1550++] = local62;
						local66.anInt5091 = Static148.anInt3168;
						if (Static250.aClass2_Sub26_Sub1_2.method4278(1) == 1) {
							local136 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
							local66.method4094(2, local136);
							local146 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
							local66.method4094(2, local146);
						} else {
							local136 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
							local66.method4094(0, local136);
						}
						local136 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
						if (local136 == 1) {
							Static161.anIntArray256[Static102.anInt2234++] = local62;
						}
					} else if (local93 == 3) {
						Static33.anIntArray51[Static67.anInt6137++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method2124() {
		Static112.aClass46_17.method1077();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[Lclient!fn;)V")
	public static void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12[] arg1) {
		Static73.aClass2_Sub12ArrayArray1[arg0] = arg1;
	}
}
