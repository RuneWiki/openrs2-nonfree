import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!rh", name = "Rb", descriptor = "I")
	public static int anInt3660;

	@OriginalMember(owner = "client!rh", name = "Jb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1060 = Static81.method1507("sl_arrows");

	@OriginalMember(owner = "client!rh", name = "Ob", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1062 = Static81.method1507("Loading config )2 ");

	@OriginalMember(owner = "client!rh", name = "Mb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1061 = aClass24_1062;

	@OriginalMember(owner = "client!rh", name = "Pb", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_11 = new Class46(4);

	@OriginalMember(owner = "client!rh", name = "Sb", descriptor = "I")
	public static final int anInt3661 = 7759444;

	@OriginalMember(owner = "client!rh", name = "Yb", descriptor = "I")
	public static int anInt3667 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I")
	public static int method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(26) int local26 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local26;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!dj;I)V")
	public static void method2806(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1) {
		@Pc(17) Class24 local17 = arg1.method758().method761();
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < Static82.anInt1956; local21++) {
			@Pc(28) Class5_Sub2_Sub1 local28 = Static110.aClass5_Sub2_Sub1Array1[Static41.anIntArray115[local21]];
			if (local28 != null && local28.aClass24_173 != null && local28.aClass24_173.method771(local17)) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local28.anIntArray196[0], local28.anIntArray199[0], 0, 1, 1);
				local19 = true;
				if (arg0 == 1) {
					Static176.aClass1_Sub7_Sub1_34.method2808(172);
					Static176.aClass1_Sub7_Sub1_34.method2758(Static41.anIntArray115[local21]);
				} else if (arg0 == 4) {
					Static176.aClass1_Sub7_Sub1_34.method2808(66);
					Static176.aClass1_Sub7_Sub1_34.method2789(Static41.anIntArray115[local21]);
				} else if (arg0 == 6) {
					Static176.aClass1_Sub7_Sub1_34.method2808(253);
					Static176.aClass1_Sub7_Sub1_34.method2791(Static41.anIntArray115[local21]);
				} else if (arg0 == 7) {
					Static176.aClass1_Sub7_Sub1_34.method2808(20);
					Static176.aClass1_Sub7_Sub1_34.method2791(Static41.anIntArray115[local21]);
				}
				break;
			}
		}
		if (!local19) {
			Static200.method3377(Static63.method1281(new Class24[] { Static192.aClass24_1234, local17 }), 0, Static85.aClass24_1000);
		}
	}
}
