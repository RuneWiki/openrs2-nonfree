import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fc", name = "eb", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_480 = Static177.method3050("You have only just left another world)3");

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_481 = Static177.method3050("Examine");

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_482 = Static177.method3050(" from your ignore list first)3");

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "Lclient!jd;")
	public static Class46 aClass46_483 = aClass46_482;

	@OriginalMember(owner = "client!fc", name = "db", descriptor = "Lclient!jd;")
	public static Class46 aClass46_484 = aClass46_480;

	@OriginalMember(owner = "client!fc", name = "fb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_485 = aClass46_481;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!jd;)I")
	public static int method948(@OriginalArg(1) Class46 arg0) {
		if (Static64.anInt1688 == 1) {
			return 7;
		} else if (arg0.method1673(Static36.aClass46_325)) {
			return 1;
		} else if (arg0.method1673(Static188.aClass46_1522)) {
			return 1;
		} else if (arg0.method1673(Static170.aClass46_1394)) {
			return 2;
		} else if (arg0.method1673(Static6.aClass46_96)) {
			return 2;
		} else if (arg0.method1673(Static151.aClass46_1271)) {
			return 3;
		} else if (arg0.method1673(Static57.aClass46_546)) {
			return 4;
		} else if (arg0.method1673(Static41.aClass46_364)) {
			return 4;
		} else if (arg0.method1673(Static67.aClass46_702)) {
			return 5;
		} else if (arg0.method1673(Static92.aClass46_857)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V")
	public static void method950(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static148.anInt3385 >= 100 && Static21.anInt574 != 1 || Static148.anInt3385 >= 200) {
			Static105.method1982(Static3.aClass46_44, 0, Static151.aClass46_1268);
			return;
		}
		@Pc(37) Class46 local37 = Static116.method2124(arg0).method1654();
		for (@Pc(39) int local39 = 0; local39 < Static148.anInt3385; local39++) {
			if (Static84.aLongArray50[local39] == arg0) {
				Static105.method1982(Static3.aClass46_44, 0, Static69.method1482(new Class46[] { local37, Static64.aClass46_662 }));
				return;
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static57.anInt1403; local78++) {
			if (arg0 == Static129.aLongArray33[local78]) {
				Static105.method1982(Static3.aClass46_44, 0, Static69.method1482(new Class46[] { Static121.aClass46_1072, local37, aClass46_483 }));
				return;
			}
		}
		if (local37.method1668(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796)) {
			Static105.method1982(Static3.aClass46_44, 0, Static4.aClass46_1042);
			return;
		}
		Static23.aClass46Array4[Static148.anInt3385] = local37;
		Static84.aLongArray50[Static148.anInt3385] = arg0;
		Static132.anIntArray294[Static148.anInt3385] = 0;
		Static31.aClass46Array6[Static148.anInt3385] = Static3.aClass46_44;
		Static104.anIntArray243[Static148.anInt3385] = 0;
		Static122.anInt2963 = Static163.anInt3721;
		Static148.anInt3385++;
		Static90.aClass4_Sub11_Sub1_1.method1285(194);
		Static90.aClass4_Sub11_Sub1_1.method1269(arg0);
	}
}
