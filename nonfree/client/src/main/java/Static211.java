import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array12;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public static int anInt4099 = 0;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public static int anInt4102 = 0;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public static int anInt4105 = -1;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static final int anInt4108 = 5063219;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1518 = Static161.method2452("");

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1520 = Static161.method2452(" from your ignore list first)3");

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1519 = aClass20_1520;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method3122() {
		Static72.anInt1568 &= 0x7FF;
		@Pc(13) int local13 = Static139.anInt2898 >> 7;
		@Pc(17) int local17 = Static2.anInt22 >> 7;
		if (Static214.anInt4154 < 128) {
			Static214.anInt4154 = 128;
		}
		if (Static214.anInt4154 > 383) {
			Static214.anInt4154 = 383;
		}
		@Pc(35) int local35 = Static128.method1999(Static111.anInt2327, Static139.anInt2898, Static2.anInt22);
		@Pc(37) int local37 = 0;
		@Pc(65) int local65;
		if (local13 > 3 && local17 > 3 && local13 < 100 && local17 < 100) {
			for (@Pc(59) int local59 = local13 - 4; local59 <= local13 + 4; local59++) {
				for (local65 = local17 - 4; local65 <= local17 + 4; local65++) {
					@Pc(69) int local69 = Static111.anInt2327;
					if (local69 < 3 && (Static168.aByteArrayArrayArray13[1][local59][local65] & 0x2) == 2) {
						local69++;
					}
					@Pc(95) int local95 = local35 - Static37.anIntArrayArrayArray5[local69][local59][local65];
					if (local95 > local37) {
						local37 = local95;
					}
				}
			}
		}
		local65 = local37 * 192;
		if (local65 > 98048) {
			local65 = 98048;
		}
		if (local65 < 32768) {
			local65 = 32768;
		}
		if (local65 > Static49.anInt1070) {
			Static49.anInt1070 += (local65 - Static49.anInt1070) / 24;
		} else if (Static49.anInt1070 > local65) {
			Static49.anInt1070 += (local65 - Static49.anInt1070) / 80;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
	public static void method3123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static9.method195(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(26) int local26 = local15;
		@Pc(28) int local28 = -1;
		@Pc(31) int local31 = -local15;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static9.anIntArrayArray1[arg1];
		@Pc(49) int local49 = local15 + arg4;
		@Pc(54) int local54 = arg4 - local15;
		Static27.method409(local54, arg2, local37, arg4 - arg5);
		Static27.method409(local49, arg3, local37, local54);
		Static27.method409(arg5 + arg4, arg2, local37, local49);
		while (local10 < local21) {
			local33 += 2;
			local31 += local33;
			if (local31 >= 0 && local26 >= 1) {
				Static83.anIntArray179[local26] = local10;
				local26--;
				local31 -= local26 << 1;
			}
			local28 += 2;
			local24 += local28;
			local10++;
			@Pc(132) int[] local132;
			@Pc(138) int[] local138;
			@Pc(148) int local148;
			@Pc(143) int local143;
			@Pc(189) int local189;
			@Pc(193) int local193;
			@Pc(198) int local198;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 >= local15) {
					local132 = Static9.anIntArrayArray1[arg1 + local21];
					local138 = Static9.anIntArrayArray1[arg1 - local21];
					local143 = arg4 - local10;
					local148 = arg4 + local10;
					Static27.method409(local148, arg2, local132, local143);
					Static27.method409(local148, arg2, local138, local143);
				} else {
					local138 = Static9.anIntArrayArray1[arg1 - local21];
					local132 = Static9.anIntArrayArray1[local21 + arg1];
					local148 = Static83.anIntArray179[local21];
					local143 = arg4 + local10;
					local189 = arg4 - local10;
					local193 = local148 + arg4;
					local198 = arg4 - local148;
					Static27.method409(local198, arg2, local132, local189);
					Static27.method409(local193, arg3, local132, local198);
					Static27.method409(local143, arg2, local132, local193);
					Static27.method409(local198, arg2, local138, local189);
					Static27.method409(local193, arg3, local138, local198);
					Static27.method409(local143, arg2, local138, local193);
				}
			}
			local132 = Static9.anIntArrayArray1[arg1 + local10];
			local138 = Static9.anIntArrayArray1[arg1 - local10];
			local143 = arg4 - local21;
			local148 = arg4 + local21;
			if (local10 < local15) {
				local189 = local10 > local26 ? Static83.anIntArray179[local10] : local26;
				local193 = local189 + arg4;
				local198 = arg4 - local189;
				Static27.method409(local198, arg2, local132, local143);
				Static27.method409(local193, arg3, local132, local198);
				Static27.method409(local148, arg2, local132, local193);
				Static27.method409(local198, arg2, local138, local143);
				Static27.method409(local193, arg3, local138, local198);
				Static27.method409(local148, arg2, local138, local193);
			} else {
				Static27.method409(local148, arg2, local132, local143);
				Static27.method409(local148, arg2, local138, local143);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZIII)V")
	public static void method3124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static27.anInt493 && arg2 + arg0 <= Static72.anInt1572 && arg3 - arg0 >= Static173.anInt3464 && Static174.anInt3493 >= arg3 + arg0) {
			Static84.method1440(arg2, arg0, arg1, arg3);
		} else {
			Static213.method3130(arg2, arg1, arg0, arg3);
		}
	}
}
