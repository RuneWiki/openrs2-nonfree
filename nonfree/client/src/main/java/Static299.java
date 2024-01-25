import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public static int anInt5764;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!ne;")
	public static Class247 aClass247_11;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Lclient!qea;")
	public static Class286 aClass286_2;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_45 = new Class305(58, 6);

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	public static final int anInt5765 = 1337;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	public static void method4777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub3_Sub17 local13 = Static358.method5408(13, (long) arg1);
		local13.method7286();
		local13.anInt8546 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BIIIIII)V")
	public static void method4778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static422.method6270(arg0);
		@Pc(8) int local8 = 0;
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(27) int local27 = arg0;
		@Pc(30) int local30 = -arg0;
		@Pc(32) int local32 = local13;
		@Pc(35) int local35 = -local13;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (arg2 >= Static639.anInt10384 && Static496.anInt8305 >= arg2) {
			@Pc(49) int[] local49 = Static16.anIntArrayArray2[arg2];
			local58 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 - arg0);
			local66 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg0 + arg4);
			local75 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 - local13);
			local83 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 + local13);
			Static197.method3240(local75, local49, local58, arg5);
			Static197.method3240(local83, local49, local75, arg3);
			Static197.method3240(local66, local49, local83, arg5);
		}
		while (local27 > local8) {
			local39 += 2;
			local37 += 2;
			local35 += local39;
			local30 += local37;
			if (local35 >= 0 && local32 >= 1) {
				local32--;
				local35 -= local32 << 1;
				Static470.anIntArray446[local32] = local8;
			}
			local8++;
			@Pc(235) int local235;
			@Pc(244) int local244;
			@Pc(251) int[] local251;
			@Pc(148) int local148;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				local148 = arg2 - local27;
				local58 = arg2 + local27;
				if (local58 >= Static639.anInt10384 && Static496.anInt8305 >= local148) {
					if (local13 <= local27) {
						local66 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 + local8);
						local75 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 - local8);
						if (Static496.anInt8305 >= local58) {
							Static197.method3240(local66, Static16.anIntArrayArray2[local58], local75, arg5);
						}
						if (Static639.anInt10384 <= local148) {
							Static197.method3240(local66, Static16.anIntArrayArray2[local148], local75, arg5);
						}
					} else {
						local66 = Static470.anIntArray446[local27];
						local75 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 + local8);
						local83 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 - local8);
						local235 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 + local66);
						local244 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 - local66);
						if (local58 <= Static496.anInt8305) {
							local251 = Static16.anIntArrayArray2[local58];
							Static197.method3240(local244, local251, local83, arg5);
							Static197.method3240(local235, local251, local244, arg3);
							Static197.method3240(local75, local251, local235, arg5);
						}
						if (local148 >= Static639.anInt10384) {
							local251 = Static16.anIntArrayArray2[local148];
							Static197.method3240(local244, local251, local83, arg5);
							Static197.method3240(local235, local251, local244, arg3);
							Static197.method3240(local75, local251, local235, arg5);
						}
					}
				}
			}
			local148 = arg2 - local8;
			local58 = local8 + arg2;
			if (local58 >= Static639.anInt10384 && local148 <= Static496.anInt8305) {
				local66 = local27 + arg4;
				local75 = arg4 - local27;
				if (local66 >= Static106.anInt2266 && Static669.anInt10712 >= local75) {
					local66 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, local66);
					local75 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, local75);
					if (local13 > local8) {
						local83 = local32 < local8 ? Static470.anIntArray446[local8] : local32;
						local235 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, local83 + arg4);
						local244 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg4 - local83);
						if (Static496.anInt8305 >= local58) {
							local251 = Static16.anIntArrayArray2[local58];
							Static197.method3240(local244, local251, local75, arg5);
							Static197.method3240(local235, local251, local244, arg3);
							Static197.method3240(local66, local251, local235, arg5);
						}
						if (Static639.anInt10384 <= local148) {
							local251 = Static16.anIntArrayArray2[local148];
							Static197.method3240(local244, local251, local75, arg5);
							Static197.method3240(local235, local251, local244, arg3);
							Static197.method3240(local66, local251, local235, arg5);
						}
					} else {
						if (local58 <= Static496.anInt8305) {
							Static197.method3240(local66, Static16.anIntArrayArray2[local58], local75, arg5);
						}
						if (local148 >= Static639.anInt10384) {
							Static197.method3240(local66, Static16.anIntArrayArray2[local148], local75, arg5);
						}
					}
				}
			}
		}
	}
}
