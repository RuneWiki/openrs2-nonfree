import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt3924;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public static int anInt3925;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!ab;")
	public static Class3 aClass3_16 = new Class3();

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString257 = " from your friend list first.";

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[200];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V")
	public static void method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static147.method2681(Static29.anIntArrayArray10[arg0], arg2, arg3 - arg4, arg3 + arg4);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg1;
		@Pc(26) int local26 = arg1 * arg1;
		@Pc(30) int local30 = arg4 * arg4;
		@Pc(40) int local40 = local30 << 1;
		@Pc(44) int local44 = local26 << 1;
		@Pc(48) int local48 = arg1 << 1;
		@Pc(57) int local57 = (1 - local48) * local30 + local44;
		@Pc(61) int local61 = local30 << 2;
		@Pc(70) int local70 = local26 - (local48 - 1) * local40;
		@Pc(74) int local74 = local26 << 2;
		@Pc(82) int local82 = local44 * 3;
		@Pc(90) int local90 = local40 * ((arg1 << 1) - 3);
		@Pc(96) int local96 = local61 * (arg1 - 1);
		@Pc(102) int local102 = local74;
		while (local22 > 0) {
			local22--;
			if (local57 < 0) {
				while (local57 < 0) {
					local57 += local82;
					local20++;
					local70 += local102;
					local82 += local74;
					local102 += local74;
				}
			}
			@Pc(136) int local136 = arg0 - local22;
			if (local70 < 0) {
				local20++;
				local57 += local82;
				local82 += local74;
				local70 += local102;
				local102 += local74;
			}
			local70 += -local90;
			@Pc(165) int local165 = arg0 + local22;
			local57 += -local96;
			@Pc(175) int local175 = arg3 - local20;
			local96 -= local61;
			@Pc(183) int local183 = local20 + arg3;
			local90 -= local61;
			Static147.method2681(Static29.anIntArrayArray10[local136], arg2, local175, local183);
			Static147.method2681(Static29.anIntArrayArray10[local165], arg2, local175, local183);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)V")
	public static void method2916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static80.anInt2172 > 0) {
			Static105.method2177(Static80.anInt2172);
			Static80.anInt2172 = 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1 * Static189.anInt4234;
		@Pc(20) int local20 = 0;
		for (@Pc(24) int local24 = 1; local24 < 255; local24++) {
			@Pc(37) int local37 = Static205.anIntArray348[local24] * (256 - local24) / 256;
			if (local37 < 0) {
				local37 = 0;
			}
			local14 += local37;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = local37; local47 < 128; local47++) {
				local54 = Static63.anIntArray137[local14++];
				@Pc(61) int local61 = Static189.anIntArray319[local18++ + arg0];
				if (local54 == 0) {
					Static2.aClass1_Sub2_Sub4_Sub1_1.anIntArray94[local20++] = local61;
				} else {
					@Pc(67) int local67 = local54 + 18;
					@Pc(73) int local73 = 256 - local54 - 18;
					if (local67 > 255) {
						local67 = 255;
					}
					local54 = Static23.anIntArray55[local54];
					if (local73 > 255) {
						local73 = 255;
					}
					Static2.aClass1_Sub2_Sub4_Sub1_1.anIntArray94[local20++] = ((local54 & 0xFF00) * local67 + (local61 & 0xFF00) * local73 & 0xFF0000) + ((local61 & 0xFF00FF) * local73 + local67 * (local54 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local54 = 0; local54 < local37; local54++) {
				Static2.aClass1_Sub2_Sub4_Sub1_1.anIntArray94[local20++] = Static189.anIntArray319[local18++ + arg0];
			}
			local18 += Static189.anInt4234 - 128;
		}
		Static2.aClass1_Sub2_Sub4_Sub1_1.method888(arg0, arg1);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	public static void method2917() {
		Static266.aClass79_41.method2487();
		Static222.aClass79_34.method2487();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public static void method2918(@OriginalArg(1) int arg0) {
		if (Static224.anInt4922 == arg0) {
			return;
		}
		if (Static224.anInt4922 == 0) {
			Static89.method1892();
		}
		@Pc(40) boolean local40 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 40) {
			Static131.method691();
		}
		if (arg0 != 40 && Static251.aClass109_4 != null) {
			Static251.aClass109_4.method3141();
			Static251.aClass109_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static242.anInt5217 = 1;
			Static16.anInt4951 = 0;
			Static230.anInt5423 = 0;
			Static142.anInt3424 = 1;
			Static212.anInt4622 = 0;
			Static152.method2728(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static34.method618();
		}
		if (arg0 == 5) {
			Static195.method3283(Static24.aClass51_10);
		} else {
			Static48.method984();
		}
		@Pc(113) boolean local113 = Static224.anInt4922 == 5 || Static224.anInt4922 == 10 || Static224.anInt4922 == 28;
		if (local40 != local113) {
			if (local40) {
				Static30.anInt925 = Static149.anInt3580;
				if (Static106.anInt2847 == 0) {
					Static11.method224();
				} else {
					Static140.method2549(Static258.aClass51_83, Static149.anInt3580, 255);
				}
				Static196.aClass18_2.method436(false);
			} else {
				Static11.method224();
				Static196.aClass18_2.method436(true);
			}
		}
		Static224.anInt4922 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BC)Z")
	public static boolean method2919(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
