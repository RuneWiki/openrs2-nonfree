import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_10;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!te;")
	public static Class75 aClass75_45 = new Class75(64);

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt1675 = 0;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_743 = Static109.method1737("Chat panel redrawn");

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_744 = Static109.method1737("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_745 = Static109.method1737("Einloggen");

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public static int anInt1681 = 0;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_746 = Static109.method1737("@yel@");

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_747 = Static109.method1737("Nehmen");

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!na;")
	public static Class53 aClass53_748 = Static109.method1737("Regelversto-8 melden");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1136() {
		aClass53_743 = null;
		aClass62_Sub1_10 = null;
		aClass53_746 = null;
		aClass53_745 = null;
		aByteArrayArray3 = null;
		aClass53_747 = null;
		anObject4 = null;
		aFont1 = null;
		aClass75_45 = null;
		aBooleanArray8 = null;
		aClass53_744 = null;
		aClass53_748 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	public static void method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class3_Sub18 local12 = (Class3_Sub18) Static38.aClass77_4.method1805((long) arg1);
		if (local12 == null) {
			local12 = new Class3_Sub18();
			Static38.aClass77_4.method1810(local12, (long) arg1);
		}
		if (arg2 >= local12.anIntArray374.length) {
			@Pc(34) int[] local34 = new int[arg2 + 1];
			@Pc(39) int[] local39 = new int[arg2 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray374.length; local41++) {
				local39[local41] = local12.anIntArray374[local41];
				local34[local41] = local12.anIntArray373[local41];
			}
			for (@Pc(71) int local71 = local12.anIntArray374.length; local71 < arg2; local71++) {
				local39[local71] = -1;
				local34[local71] = 0;
			}
			local12.anIntArray374 = local39;
			local12.anIntArray373 = local34;
		}
		local12.anIntArray374[arg2] = arg3;
		local12.anIntArray373[arg2] = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1138() {
		Static101.method1668();
		if (Static124.anInt2871 == 1) {
			Static113.aClass3_Sub1_Sub5_Sub4Array14[Static48.anInt1294 / 100].method1347(Static93.anInt2226 - 4 - 8, Static2.anInt57 + -4 - 8);
		}
		if (Static124.anInt2871 == 2) {
			Static113.aClass3_Sub1_Sub5_Sub4Array14[Static48.anInt1294 / 100 + 4].method1347(Static93.anInt2226 - 4 - 8, Static2.anInt57 + -12);
		}
		if (Static96.anInt1464 != -1) {
			Static42.method842(Static96.anInt1464);
			Static76.method1268(Static96.anInt1464, 334, 4, 512);
		}
		if (Static111.anInt2556 != -1) {
			Static42.method842(Static111.anInt2556);
			Static76.method1268(Static111.anInt2556, 334, 0, 512);
		}
		Static90.method1464();
		if (!Static94.aBoolean93) {
			Static125.method1972();
			Static65.method1132();
		} else if (Static35.anInt1112 == 0) {
			Static45.method889();
		}
		if (Static119.anInt457 == 1) {
			Static82.aClass3_Sub1_Sub5_Sub4_13.method1347(472, 296);
		}
		@Pc(136) int local136;
		if (Static102.aBoolean102) {
			@Pc(114) byte local114 = 20;
			Static89.aClass3_Sub1_Sub5_Sub2_3.method744(Static103.method1689(new Class53[] { Static85.aClass53_943, Static108.method1725(Static78.anInt1963) }), 20, 16776960);
			@Pc(135) Runtime local135 = Runtime.getRuntime();
			local136 = local114 + 15;
			@Pc(145) int local145 = (int) ((local135.totalMemory() - local135.freeMemory()) / 1024L);
			@Pc(147) int local147 = 16776960;
			if (local145 > 32768 && Static45.aBoolean47) {
				local147 = 16711680;
			}
			if (local145 > 65536 && !Static45.aBoolean47) {
				local147 = 16711680;
			}
			Static89.aClass3_Sub1_Sub5_Sub2_3.method744(Static103.method1689(new Class53[] { Static41.aClass53_530, Static108.method1725(local145), Static93.aClass53_1066 }), 35, local147);
			local136 += 15;
			if (Static106.aBoolean103) {
				Static89.aClass3_Sub1_Sub5_Sub2_3.method744(Static39.aClass53_512, 50, 16711680);
				local136 += 15;
				Static106.aBoolean103 = false;
			}
			if (Static93.aBoolean90) {
				Static89.aClass3_Sub1_Sub5_Sub2_3.method744(aClass53_743, local136, 16711680);
				local136 += 15;
				Static93.aBoolean90 = false;
			}
			if (aBoolean58) {
				Static89.aClass3_Sub1_Sub5_Sub2_3.method744(Static2.aClass53_13, local136, 16711680);
				aBoolean58 = false;
				local136 += 15;
			}
		}
		if (Static120.anInt2807 == 0) {
			return;
		}
		@Pc(229) int local229 = Static120.anInt2807 / 50;
		local136 = local229 / 60;
		@Pc(237) int local237 = local229 % 60;
		if (local237 < 10) {
			Static89.aClass3_Sub1_Sub5_Sub2_3.method746(Static103.method1689(new Class53[] { Static40.aClass53_518, Static108.method1725(local136), Static58.aClass53_689, Static108.method1725(local237) }), 4, 329, 16776960);
		} else {
			Static89.aClass3_Sub1_Sub5_Sub2_3.method746(Static103.method1689(new Class53[] { Static40.aClass53_518, Static108.method1725(local136), Static107.aClass53_1235, Static108.method1725(local237) }), 4, 329, 16776960);
		}
	}
}
