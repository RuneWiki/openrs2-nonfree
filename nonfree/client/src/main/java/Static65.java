import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt1633;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!vc;")
	private static Class71 aClass71_807 = Static38.method736("Please remove ");

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_805 = aClass71_807;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_806 = aClass71_807;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_808 = Static38.method736("hitmarks");

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public static int anInt1637 = 0;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!vc;")
	private static Class71 aClass71_809 = Static38.method736("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_810 = aClass71_809;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!vc;")
	private static Class71 aClass71_813 = Static38.method736(" is already on your ignore list");

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_811 = aClass71_813;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_812 = Static38.method736("mapfunction");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1127() {
		aClass71_811 = null;
		aClass71_813 = null;
		aClass71_810 = null;
		aClass71_807 = null;
		aClass71_806 = null;
		aClass71_809 = null;
		aClass71_805 = null;
		aClass71_808 = null;
		aClass71_812 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!nb;BLclient!nb;Lclient!nb;)V")
	public static void method1128(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class24 arg2) {
		Static108.aClass24_23 = arg1;
		Static103.aClass24_21 = arg2;
		Static64.aClass24_22 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1129() {
		while (true) {
			if (Static86.aClass5_Sub11_Sub1_12.method1554(Static57.anInt1482) >= 11) {
				@Pc(19) int local19 = Static86.aClass5_Sub11_Sub1_12.method1555(11);
				if (local19 != 2047) {
					@Pc(26) boolean local26 = false;
					if (Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local19] == null) {
						Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local19] = new Class5_Sub1_Sub1_Sub3_Sub2();
						local26 = true;
						if (Static66.aClass5_Sub11Array1[local19] != null) {
							Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local19].method1691(Static66.aClass5_Sub11Array1[local19]);
						}
					}
					Static116.anIntArray285[Static37.anInt594++] = local19;
					@Pc(62) Class5_Sub1_Sub1_Sub3_Sub2 local62 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local19];
					local62.anInt2469 = Static95.anInt2285;
					@Pc(70) int local70 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
					if (local70 == 1) {
						Static72.anIntArray224[Static57.anInt1493++] = local19;
					}
					@Pc(88) int local88 = Static86.aClass5_Sub11_Sub1_12.method1555(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
					@Pc(104) int local104 = Static6.anIntArray11[Static86.aClass5_Sub11_Sub1_12.method1555(3)];
					if (local26) {
						local62.anInt2456 = local104;
					}
					@Pc(114) int local114 = Static86.aClass5_Sub11_Sub1_12.method1555(5);
					if (local114 > 15) {
						local114 -= 32;
					}
					local62.method1678(local97 == 1, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0] + local114, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0] - -local88);
					continue;
				}
			}
			Static86.aClass5_Sub11_Sub1_12.method1562();
			return;
		}
	}
}
