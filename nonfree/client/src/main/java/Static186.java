import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public static int anInt3737;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_26;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!mf;")
	public static Class69 aClass69_14;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public static int anInt3739 = 2;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1373 = Static161.method2452(" (X");

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	public static int anInt3741 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBLclient!dc;)V")
	public static void method2813(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(14) Class20 local14 = arg1.method556().method565();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < Static66.anInt1444; local18++) {
			@Pc(26) Class1_Sub2_Sub2 local26 = Static6.aClass1_Sub2_Sub2Array1[Static7.anIntArray13[local18]];
			if (local26 != null && local26.aClass20_848 != null && local26.aClass20_848.method551(local14)) {
				local16 = true;
				Static12.method231(0, local26.anIntArray253[0], 2, local26.anIntArray250[0], false, 0, 0, Static210.aClass1_Sub2_Sub2_2.anIntArray250[0], 1, Static210.aClass1_Sub2_Sub2_2.anIntArray253[0], 1);
				if (arg0 == 1) {
					Static43.aClass5_Sub6_Sub1_2.method3087(185);
					Static43.aClass5_Sub6_Sub1_2.method3028(Static7.anIntArray13[local18]);
				} else if (arg0 == 4) {
					Static43.aClass5_Sub6_Sub1_2.method3087(228);
					Static43.aClass5_Sub6_Sub1_2.method3028(Static7.anIntArray13[local18]);
				} else if (arg0 == 6) {
					Static43.aClass5_Sub6_Sub1_2.method3087(245);
					Static43.aClass5_Sub6_Sub1_2.method3044(Static7.anIntArray13[local18]);
				} else if (arg0 == 7) {
					Static43.aClass5_Sub6_Sub1_2.method3087(52);
					Static43.aClass5_Sub6_Sub1_2.method3031(Static7.anIntArray13[local18]);
				}
				break;
			}
		}
		if (!local16) {
			Static189.method2824(0, Static70.method1166(new Class20[] { Static71.aClass20_523, local14 }), Static215.aClass20_1545);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
	public static void method2814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static144.anInt2995 < 100) {
			Static98.method1649();
		}
		Static42.method812(arg3, arg1, arg3 + arg0, arg2 + arg1);
		Static149.method2267();
		Static42.method824(arg3, arg1, arg0, arg2, 0);
		@Pc(50) int local50;
		if (Static144.anInt2995 < 100) {
			@Pc(39) int local39 = arg0 / 2 + arg3;
			local50 = arg1 + arg2 / 2 - 18 - 20;
			Static42.method817(local39 - 152, local50, 304, 34, 9179409);
			Static42.method817(local39 - 151, local50 + 1, 302, 32, 0);
			Static42.method824(local39 - 150, local50 - -2, Static144.anInt2995 * 3, 30, 9179409);
			Static42.method824(Static144.anInt2995 * 3 + local39 - 150, local50 + 2, 300 - Static144.anInt2995 * 3, 30, 0);
			Static30.aClass5_Sub2_Sub8_1.method1350(Static73.aClass20_532, local39, local50 + 20, 16777215, -1);
			return;
		}
		Static64.anInt1390 = Static212.anInt4113 - (int) ((double) arg0 / Static216.aDouble11);
		Static54.anInt1152 = (int) ((double) (arg0 * 2) / Static216.aDouble11);
		Static61.anInt1351 = Static18.anInt354 - (int) ((double) arg2 / Static216.aDouble11);
		Static121.anInt2576 = (int) ((double) (arg2 * 2) / Static216.aDouble11);
		local50 = Static18.anInt354 - (int) ((double) arg2 / Static216.aDouble11);
		@Pc(170) int local170 = Static212.anInt4113 - (int) ((double) arg0 / Static216.aDouble11);
		@Pc(178) int local178 = (int) ((double) arg0 / Static216.aDouble11) + Static212.anInt4113;
		@Pc(186) int local186 = (int) ((double) arg2 / Static216.aDouble11) + Static18.anInt354;
		Static135.method2099(arg1, local50, arg0 + arg3, local170, local178, arg3, local186, arg1 + arg2);
		Static10.method214(local186, arg3, arg1, local178, local170, local50, arg0 + arg3, arg1 - -arg2);
		if (Static11.anInt258 > 0) {
			Static11.anInt258--;
		}
		if (!Static159.aBoolean141) {
			return;
		}
		@Pc(230) int local230 = arg3 + arg0 - 5;
		@Pc(236) int local236 = arg2 + arg1 - 8;
		Static165.aClass5_Sub2_Sub8_5.method1352(Static70.method1166(new Class20[] { Static106.aClass20_819, Static132.method2805(Static2.anInt21) }), local230, local236, 16776960, -1);
		@Pc(257) int local257 = local236 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 32768 && Static14.aBoolean14) {
			local270 = 16711680;
		}
		if (local268 > 65536 && !Static14.aBoolean14) {
			local270 = 16711680;
		}
		Static165.aClass5_Sub2_Sub8_5.method1352(Static70.method1166(new Class20[] { Static55.aClass20_395, Static132.method2805(local268), Static52.aClass20_373 }), local230, local257, local270, -1);
		local236 = local257 - 15;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)[B")
	public static byte[] method2816(@OriginalArg(0) int arg0) {
		@Pc(19) Class5_Sub2_Sub2 local19 = (Class5_Sub2_Sub2) Static86.aClass8_19.method227((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(54) int local54 = 255 - local47;
				@Pc(59) int local59 = Static85.method1454(local30, local54);
				@Pc(63) byte local63 = local24[local59];
				local24[local59] = local24[local54];
				local24[local54] = local24[511 - local47] = local63;
			}
			local19 = new Class5_Sub2_Sub2(local24);
			Static86.aClass8_19.method232((long) arg0, local19);
		}
		return local19.aByteArray1;
	}
}
