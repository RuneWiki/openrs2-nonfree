import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lclient!ld;")
	public static Class67 aClass67_10;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array28 = new Class51[100];

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1512 = Static64.method1101("");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!ia;I)V")
	public static void method3409(@OriginalArg(1) Class51 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class51 local9 = arg0.method1424().method1437();
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < Static118.anInt2542; local17++) {
			@Pc(25) Class5_Sub1_Sub1 local25 = Static191.aClass5_Sub1_Sub1Array1[Static79.anIntArray111[local17]];
			if (local25 != null && local25.aClass51_619 != null && local25.aClass51_619.method1401(local9)) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local25.anIntArray238[0], 0, 1, 0, local25.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				local15 = true;
				if (arg1 == 1) {
					Static167.aClass1_Sub16_Sub1_2.method3823(255);
					Static167.aClass1_Sub16_Sub1_2.method3760(Static79.anIntArray111[local17]);
				} else if (arg1 == 4) {
					Static167.aClass1_Sub16_Sub1_2.method3823(205);
					Static167.aClass1_Sub16_Sub1_2.method3807(Static79.anIntArray111[local17]);
				} else if (arg1 == 6) {
					Static167.aClass1_Sub16_Sub1_2.method3823(46);
					Static167.aClass1_Sub16_Sub1_2.method3807(Static79.anIntArray111[local17]);
				} else if (arg1 == 7) {
					Static167.aClass1_Sub16_Sub1_2.method3823(142);
					Static167.aClass1_Sub16_Sub1_2.method3796(Static79.anIntArray111[local17]);
				}
				break;
			}
		}
		if (!local15) {
			Static164.method2798(0, Static150.method2574(new Class51[] { Static161.aClass51_1225, local9 }), Static81.aClass51_607);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	public static void method3411() {
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) Static51.aClass105_6.method3120(); local15 != null; local15 = (Class1_Sub5) Static51.aClass105_6.method3109()) {
			if (local15.anInt674 == -1) {
				local15.anInt664 = 0;
				Static16.method295(local15);
			} else {
				local15.method3758();
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)I")
	public static int method3412(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
