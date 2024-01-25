import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt1509;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!h;")
	public static final Class114 aClass114_25 = new Class114("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public static int anInt1508 = 0;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Z")
	public static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
	public static void method1504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static459.method6750(arg3);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg3 - arg5;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg3;
		@Pc(26) int local26 = -arg3;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(39) int[] local39 = Static81.anIntArrayArray25[arg1];
		@Pc(44) int local44 = arg4 - local14;
		Static227.method7421(arg4 - arg3, arg0, local44, local39);
		@Pc(58) int local58 = arg4 + local14;
		Static227.method7421(local44, arg2, local58, local39);
		Static227.method7421(local58, arg0, arg3 + arg4, local39);
		while (local10 < local23) {
			local35 += 2;
			local33 += 2;
			local31 += local35;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				Static195.anIntArray315[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(127) int[] local127;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(185) int local185;
			@Pc(189) int local189;
			@Pc(193) int local193;
			if (local26 >= 0) {
				local23--;
				if (local14 <= local23) {
					local127 = Static81.anIntArrayArray25[local23 + arg1];
					local134 = Static81.anIntArrayArray25[arg1 - local23];
					local138 = arg4 + local10;
					local143 = arg4 - local10;
					Static227.method7421(local143, arg0, local138, local127);
					Static227.method7421(local143, arg0, local138, local134);
				} else {
					local127 = Static81.anIntArrayArray25[arg1 + local23];
					local134 = Static81.anIntArrayArray25[arg1 - local23];
					local138 = Static195.anIntArray315[local23];
					local143 = arg4 + local10;
					local185 = arg4 - local10;
					local189 = local138 + arg4;
					local193 = arg4 - local138;
					Static227.method7421(local185, arg0, local193, local127);
					Static227.method7421(local193, arg2, local189, local127);
					Static227.method7421(local189, arg0, local143, local127);
					Static227.method7421(local185, arg0, local193, local134);
					Static227.method7421(local193, arg2, local189, local134);
					Static227.method7421(local189, arg0, local143, local134);
				}
				local26 -= local23 << 1;
			}
			local127 = Static81.anIntArrayArray25[arg1 + local10];
			local134 = Static81.anIntArrayArray25[arg1 - local10];
			local138 = arg4 + local23;
			local143 = arg4 - local23;
			if (local14 <= local10) {
				Static227.method7421(local143, arg0, local138, local127);
				Static227.method7421(local143, arg0, local138, local134);
			} else {
				local185 = local10 > local28 ? Static195.anIntArray315[local10] : local28;
				local189 = arg4 + local185;
				local193 = arg4 - local185;
				Static227.method7421(local143, arg0, local193, local127);
				Static227.method7421(local193, arg2, local189, local127);
				Static227.method7421(local189, arg0, local138, local127);
				Static227.method7421(local143, arg0, local193, local134);
				Static227.method7421(local193, arg2, local189, local134);
				Static227.method7421(local189, arg0, local138, local134);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!pc;")
	public static Class47_Sub2 method1507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class168 local14 = local7.aClass168_2; local14 != null; local14 = local14.aClass168_1) {
			@Pc(18) Class47_Sub2 local18 = local14.aClass47_Sub2_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort115 == arg1 && local18.aShort117 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
