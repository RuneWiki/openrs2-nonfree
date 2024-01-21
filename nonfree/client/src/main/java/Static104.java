import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!bg;")
	public static Class11 aClass11_85;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "Lclient!bg;")
	public static Class11 aClass11_86;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1037 = Static32.method683("Continue");

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1036 = aClass49_1037;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!rc;")
	public static Class74 aClass74_62 = new Class74(30);

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!rc;")
	public static Class74 aClass74_63 = new Class74(30);

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1039 = Static32.method683("Loading )2 please wait)3");

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1038 = aClass49_1039;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Lclient!rc;")
	public static Class74 aClass74_64 = new Class74(64);

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	public static void method1766() {
		Static64.aClass74_41.method2347();
		Static14.aClass74_10.method2347();
		Static7.aClass74_6.method2347();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1767() {
		@Pc(10) int local10 = Static86.aClass2_Sub13_Sub1_13.method2978(8);
		@Pc(19) int local19;
		if (local10 < Static139.anInt2969) {
			for (local19 = local10; local19 < Static139.anInt2969; local19++) {
				Static111.anIntArray224[Static162.anInt3603++] = Static110.anIntArray221[local19];
			}
		}
		if (local10 > Static139.anInt2969) {
			throw new RuntimeException("gppov1");
		}
		Static139.anInt2969 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(62) int local62 = Static110.anIntArray221[local19];
			@Pc(66) Class2_Sub2_Sub3_Sub7_Sub2 local66 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local62];
			@Pc(71) int local71 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
			if (local71 == 0) {
				Static110.anIntArray221[Static139.anInt2969++] = local62;
				local66.anInt3582 = Static127.anInt2757;
			} else {
				@Pc(91) int local91 = Static86.aClass2_Sub13_Sub1_13.method2978(2);
				if (local91 == 0) {
					Static110.anIntArray221[Static139.anInt2969++] = local62;
					local66.anInt3582 = Static127.anInt2757;
					Static90.anIntArray192[Static88.anInt1850++] = local62;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local91 == 1) {
						Static110.anIntArray221[Static139.anInt2969++] = local62;
						local66.anInt3582 = Static127.anInt2757;
						local133 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
						local66.method2739(false, local133);
						local143 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
						if (local143 == 1) {
							Static90.anIntArray192[Static88.anInt1850++] = local62;
						}
					} else if (local91 == 2) {
						Static110.anIntArray221[Static139.anInt2969++] = local62;
						local66.anInt3582 = Static127.anInt2757;
						local133 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
						local66.method2739(true, local133);
						local143 = Static86.aClass2_Sub13_Sub1_13.method2978(3);
						local66.method2739(true, local143);
						@Pc(197) int local197 = Static86.aClass2_Sub13_Sub1_13.method2978(1);
						if (local197 == 1) {
							Static90.anIntArray192[Static88.anInt1850++] = local62;
						}
					} else if (local91 == 3) {
						Static111.anIntArray224[Static162.anInt3603++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	public static void method1768() {
		aClass49_1037 = null;
		aClass74_62 = null;
		aClass49_1038 = null;
		aClass11_86 = null;
		aClass49_1039 = null;
		aClass74_64 = null;
		aClass49_1036 = null;
		aClass74_63 = null;
		aClass11_85 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!lf;Lclient!bg;BLclient!lf;)[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] method1769(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class49 arg2) {
		@Pc(9) int local9 = arg1.method2053(arg0);
		@Pc(19) int local19 = arg1.method2056(arg2, local9);
		return Static43.method820(arg1, local9, local19);
	}
}
