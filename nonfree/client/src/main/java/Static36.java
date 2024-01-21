import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
	public static int anInt1019;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
	public static int anInt1014 = 0;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
	public static int anInt1016 = 0;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "Lclient!oa;")
	public static Class56 aClass56_567 = Static33.method650("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "Lclient!oa;")
	public static Class56 aClass56_568 = Static33.method650("overlay_multiway");

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "Lclient!oa;")
	private static Class56 aClass56_569 = Static33.method650("The server is being updated)3");

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Lclient!oa;")
	public static Class56 aClass56_570 = Static33.method650("redstone2");

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	public static int anInt1021 = 0;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lclient!oa;")
	private static Class56 aClass56_571 = Static33.method650("Username: ");

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_572 = aClass56_569;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_573 = aClass56_571;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)I")
	public static int method679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class3_Sub1_Sub1_Sub3.anIntArray115[arg0 * 1024 / arg1] >> 1;
		return (arg3 * (65536 - local21) >> 16) + (arg2 * local21 >> 16);
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method680() {
		Static28.aClass52_18.method1346();
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
	public static void method681() {
		aClass56_571 = null;
		aClass56_569 = null;
		aClass56_567 = null;
		aClass56_568 = null;
		aClass56_573 = null;
		aClass56_570 = null;
		aClass56_572 = null;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method682() {
		@Pc(12) Class56 local12 = null;
		for (@Pc(14) int local14 = 0; local14 < Static66.anInt559; local14++) {
			if (Static28.aClass56Array2[local14].method1424(Static1.aClass56_6) != -1) {
				local12 = Static28.aClass56Array2[local14].method1417(Static28.aClass56Array2[local14].method1424(Static1.aClass56_6));
				break;
			}
		}
		if (local12 == null) {
			Static56.method1062();
			return;
		}
		@Pc(49) int local49 = Static23.anInt690;
		@Pc(51) int local51 = Static115.anInt2940;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(57) int local57 = Static14.anInt319;
		if (local57 > 190) {
			local57 = 190;
		}
		@Pc(66) int local66 = Static57.anInt1610;
		Static6.method1487(local51, local49, local57, local66, 6116423);
		Static6.method1487(local51 + 1, local49 + 1, local57 - 2, 16, 0);
		Static6.method1495(local51 + 1, local49 + 18, local57 - 2, local66 - 19, 0);
		Static57.aClass3_Sub1_Sub1_Sub1_3.method733(local12, local51 + 3, local49 + 14, 6116423, false);
		@Pc(113) int local113 = anInt1021;
		@Pc(115) int local115 = Static102.anInt3222;
		if (Static42.anInt1117 == 0) {
			local113 -= 4;
			local115 -= 4;
		}
		if (Static42.anInt1117 == 1) {
			local115 -= 205;
			local113 -= 553;
		}
		if (Static42.anInt1117 == 2) {
			local113 -= 17;
			local115 -= 357;
		}
		for (@Pc(134) int local134 = 0; local134 < Static66.anInt559; local134++) {
			@Pc(149) int local149 = (Static66.anInt559 - local134 - 1) * 15 + local49 + 31;
			@Pc(151) int local151 = 16777215;
			if (local113 > local51 && local113 < local57 + local51 && local115 > local149 - 13 && local115 < local149 + 3) {
				local151 = 16776960;
			}
			@Pc(187) Class56 local187 = Static28.aClass56Array2[local134];
			if (local187.method1423(local12)) {
				local187 = local187.method1451(local187.method1426() - local12.method1426(), 0);
				if (local187.method1423(Static53.aClass56_856)) {
					local187 = local187.method1451(local187.method1426() - Static53.aClass56_856.method1426(), 0);
				}
			}
			Static57.aClass3_Sub1_Sub1_Sub1_3.method733(local187, local51 + 3, local149, local151, true);
		}
	}
}
