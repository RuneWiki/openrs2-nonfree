import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_6 = new Class98(41, 0);

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	public static final int anInt379 = 1407;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public static int anInt380 = 0;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "J")
	public static long aLong14 = 0L;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!jr;)Lclient!daa;")
	public static Class65_Sub1 method320(@OriginalArg(1) Class6_Sub12 arg0) {
		@Pc(7) Class65 local7 = Static4.method73(arg0);
		@Pc(11) int local11 = arg0.method6015();
		@Pc(15) int local15 = arg0.method6015();
		@Pc(19) int local19 = arg0.method6044();
		return new Class65_Sub1(local7.aClass114_6, local7.aClass72_6, local7.anInt4922, local7.anInt4923, local7.anInt4919, local7.anInt4916, local7.anInt4917, local11, local15, local19);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!pj;IIZIBI)V")
	public static void method322(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		Static554.anInt9644 = 0;
		Static95.aBoolean114 = false;
		Static226.aClass248_33 = arg0;
		Static131.anInt2504 = 1;
		Static426.anInt7575 = arg3;
		Static540.anInt8992 = arg2;
		Static321.anInt6142 = Static373.aClass6_Sub15_Sub3_2.method6660() / arg1;
		if (Static321.anInt6142 < 1) {
			Static321.anInt6142 = 1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIII)V")
	public static void method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static92.method1387(arg3);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg3 - arg4;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg3;
		@Pc(26) int local26 = -arg3;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static155.anIntArrayArray32[arg1];
		@Pc(49) int local49 = arg2 - local14;
		@Pc(53) int local53 = local14 + arg2;
		Static264.method4006(local49, arg0, arg2 - arg3, local44);
		Static264.method4006(local53, arg5, local49, local44);
		Static264.method4006(arg3 + arg2, arg0, local53, local44);
		while (local23 > local10) {
			local40 += 2;
			local33 += 2;
			local31 += local40;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				Static528.anIntArray643[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(119) int[] local119;
			@Pc(126) int[] local126;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(174) int local174;
			@Pc(178) int local178;
			@Pc(183) int local183;
			if (local26 >= 0) {
				local23--;
				if (local23 >= local14) {
					local119 = Static155.anIntArrayArray32[arg1 + local23];
					local126 = Static155.anIntArrayArray32[arg1 - local23];
					local130 = local10 + arg2;
					local135 = arg2 - local10;
					Static264.method4006(local130, arg0, local135, local119);
					Static264.method4006(local130, arg0, local135, local126);
				} else {
					local119 = Static155.anIntArrayArray32[arg1 + local23];
					local126 = Static155.anIntArrayArray32[arg1 - local23];
					local130 = Static528.anIntArray643[local23];
					local135 = arg2 + local10;
					local174 = arg2 - local10;
					local178 = arg2 + local130;
					local183 = arg2 - local130;
					Static264.method4006(local183, arg0, local174, local119);
					Static264.method4006(local178, arg5, local183, local119);
					Static264.method4006(local135, arg0, local178, local119);
					Static264.method4006(local183, arg0, local174, local126);
					Static264.method4006(local178, arg5, local183, local126);
					Static264.method4006(local135, arg0, local178, local126);
				}
				local26 -= local23 << 1;
			}
			local119 = Static155.anIntArrayArray32[arg1 + local10];
			local126 = Static155.anIntArrayArray32[arg1 - local10];
			local130 = arg2 + local23;
			local135 = arg2 - local23;
			if (local14 <= local10) {
				Static264.method4006(local130, arg0, local135, local119);
				Static264.method4006(local130, arg0, local135, local126);
			} else {
				local174 = local28 >= local10 ? local28 : Static528.anIntArray643[local10];
				local178 = arg2 + local174;
				local183 = arg2 - local174;
				Static264.method4006(local183, arg0, local135, local119);
				Static264.method4006(local178, arg5, local183, local119);
				Static264.method4006(local130, arg0, local178, local119);
				Static264.method4006(local183, arg0, local135, local126);
				Static264.method4006(local178, arg5, local183, local126);
				Static264.method4006(local130, arg0, local178, local126);
			}
		}
	}
}
