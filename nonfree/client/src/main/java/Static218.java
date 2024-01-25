import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
	public static int anInt4452 = 0;

	@OriginalMember(owner = "client!ifa", name = "M", descriptor = "[I")
	public static int[] anIntArray401 = new int[1];

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIII)V")
	public static void method3777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static192.method3535(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (Static252.anInt4971 <= arg1 && arg1 <= Static359.anInt6232) {
			@Pc(52) int[] local52 = Static383.anIntArrayArray62[arg1];
			local61 = Static572.method7817(Static68.anInt1306, arg4 - arg0, Static589.anInt9684);
			local69 = Static572.method7817(Static68.anInt1306, arg0 + arg4, Static589.anInt9684);
			local78 = Static572.method7817(Static68.anInt1306, arg4 - local15, Static589.anInt9684);
			local87 = Static572.method7817(Static68.anInt1306, arg4 + local15, Static589.anInt9684);
			Static336.method5023(arg2, local78, local52, local61);
			Static336.method5023(arg3, local87, local52, local78);
			Static336.method5023(arg2, local69, local52, local87);
		}
		@Pc(107) int local107 = -1;
		while (local24 > local10) {
			local34 += 2;
			local107 += 2;
			local27 += local34;
			local32 += local107;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				local32 -= local29 << 1;
				Static114.anIntArray244[local29] = local10;
			}
			local10++;
			@Pc(206) int local206;
			@Pc(215) int local215;
			@Pc(226) int[] local226;
			@Pc(156) int local156;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local156 = arg1 - local24;
				local61 = arg1 + local24;
				if (local61 >= Static252.anInt4971 && local156 <= Static359.anInt6232) {
					if (local15 > local24) {
						local69 = Static114.anIntArray244[local24];
						local78 = Static572.method7817(Static68.anInt1306, arg4 + local10, Static589.anInt9684);
						local87 = Static572.method7817(Static68.anInt1306, arg4 - local10, Static589.anInt9684);
						local206 = Static572.method7817(Static68.anInt1306, local69 + arg4, Static589.anInt9684);
						local215 = Static572.method7817(Static68.anInt1306, arg4 - local69, Static589.anInt9684);
						if (local61 <= Static359.anInt6232) {
							local226 = Static383.anIntArrayArray62[local61];
							Static336.method5023(arg2, local215, local226, local87);
							Static336.method5023(arg3, local206, local226, local215);
							Static336.method5023(arg2, local78, local226, local206);
						}
						if (Static252.anInt4971 <= local156) {
							local226 = Static383.anIntArrayArray62[local156];
							Static336.method5023(arg2, local215, local226, local87);
							Static336.method5023(arg3, local206, local226, local215);
							Static336.method5023(arg2, local78, local226, local206);
						}
					} else {
						local69 = Static572.method7817(Static68.anInt1306, local10 + arg4, Static589.anInt9684);
						local78 = Static572.method7817(Static68.anInt1306, arg4 - local10, Static589.anInt9684);
						if (Static359.anInt6232 >= local61) {
							Static336.method5023(arg2, local69, Static383.anIntArrayArray62[local61], local78);
						}
						if (Static252.anInt4971 <= local156) {
							Static336.method5023(arg2, local69, Static383.anIntArrayArray62[local156], local78);
						}
					}
				}
			}
			local156 = arg1 - local10;
			local61 = arg1 + local10;
			if (local61 >= Static252.anInt4971 && local156 <= Static359.anInt6232) {
				local69 = arg4 + local24;
				local78 = arg4 - local24;
				if (Static68.anInt1306 <= local69 && local78 <= Static589.anInt9684) {
					local69 = Static572.method7817(Static68.anInt1306, local69, Static589.anInt9684);
					local78 = Static572.method7817(Static68.anInt1306, local78, Static589.anInt9684);
					if (local15 <= local10) {
						if (Static359.anInt6232 >= local61) {
							Static336.method5023(arg2, local69, Static383.anIntArrayArray62[local61], local78);
						}
						if (Static252.anInt4971 <= local156) {
							Static336.method5023(arg2, local69, Static383.anIntArrayArray62[local156], local78);
						}
					} else {
						local87 = local10 <= local29 ? local29 : Static114.anIntArray244[local10];
						local206 = Static572.method7817(Static68.anInt1306, local87 + arg4, Static589.anInt9684);
						local215 = Static572.method7817(Static68.anInt1306, arg4 - local87, Static589.anInt9684);
						if (local61 <= Static359.anInt6232) {
							local226 = Static383.anIntArrayArray62[local61];
							Static336.method5023(arg2, local215, local226, local78);
							Static336.method5023(arg3, local206, local226, local215);
							Static336.method5023(arg2, local69, local226, local206);
						}
						if (Static252.anInt4971 <= local156) {
							local226 = Static383.anIntArrayArray62[local156];
							Static336.method5023(arg2, local215, local226, local78);
							Static336.method5023(arg3, local206, local226, local215);
							Static336.method5023(arg2, local69, local226, local206);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)V")
	public static void method3778(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub7_Sub5 local13 = method3780(10, arg0);
		local13.method3062();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)Lclient!fr;")
	public static Class4_Sub7_Sub5 method3780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub7_Sub5 local15 = (Class4_Sub7_Sub5) Static288.aClass183_20.method4289((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class4_Sub7_Sub5(arg0, arg1);
			Static288.aClass183_20.method4282(local15.aLong307, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(JJ)J")
	public static long method3781(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
