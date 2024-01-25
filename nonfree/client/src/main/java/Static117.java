import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!dt", name = "F", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_26 = new Class218(54, 4);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)I")
	public static int method2217(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIBIIII)V")
	public static void method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static583.method8198(arg2);
		@Pc(12) int local12 = 0;
		@Pc(21) int local21 = arg2 - arg4;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(27) int local27 = arg2;
		@Pc(30) int local30 = -arg2;
		@Pc(32) int local32 = local21;
		@Pc(35) int local35 = -local21;
		@Pc(37) int local37 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (Static374.anInt5986 <= arg0 && arg0 <= Static84.anInt1667) {
			@Pc(51) int[] local51 = Static392.anIntArrayArray39[arg0];
			local62 = Static120.method2296(arg5 - arg2, Static7.anInt93, Static115.anInt2377);
			local70 = Static120.method2296(arg5 + arg2, Static7.anInt93, Static115.anInt2377);
			local78 = Static120.method2296(arg5 - local21, Static7.anInt93, Static115.anInt2377);
			local87 = Static120.method2296(arg5 + local21, Static7.anInt93, Static115.anInt2377);
			Static483.method7014(local51, local62, local78, arg3);
			Static483.method7014(local51, local78, local87, arg1);
			Static483.method7014(local51, local87, local70, arg3);
		}
		@Pc(107) int local107 = -1;
		while (local12 < local27) {
			local107 += 2;
			local37 += 2;
			local35 += local107;
			local30 += local37;
			if (local35 >= 0 && local32 >= 1) {
				local32--;
				Static636.anIntArray886[local32] = local12;
				local35 -= local32 << 1;
			}
			local12++;
			@Pc(211) int local211;
			@Pc(219) int local219;
			@Pc(230) int[] local230;
			@Pc(156) int local156;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				local156 = arg0 - local27;
				local62 = local27 + arg0;
				if (local62 >= Static374.anInt5986 && local156 <= Static84.anInt1667) {
					if (local27 < local21) {
						local70 = Static636.anIntArray886[local27];
						local78 = Static120.method2296(arg5 + local12, Static7.anInt93, Static115.anInt2377);
						local87 = Static120.method2296(arg5 - local12, Static7.anInt93, Static115.anInt2377);
						local211 = Static120.method2296(local70 + arg5, Static7.anInt93, Static115.anInt2377);
						local219 = Static120.method2296(arg5 - local70, Static7.anInt93, Static115.anInt2377);
						if (Static84.anInt1667 >= local62) {
							local230 = Static392.anIntArrayArray39[local62];
							Static483.method7014(local230, local87, local219, arg3);
							Static483.method7014(local230, local219, local211, arg1);
							Static483.method7014(local230, local211, local78, arg3);
						}
						if (Static374.anInt5986 <= local156) {
							local230 = Static392.anIntArrayArray39[local156];
							Static483.method7014(local230, local87, local219, arg3);
							Static483.method7014(local230, local219, local211, arg1);
							Static483.method7014(local230, local211, local78, arg3);
						}
					} else {
						local70 = Static120.method2296(arg5 + local12, Static7.anInt93, Static115.anInt2377);
						local78 = Static120.method2296(arg5 - local12, Static7.anInt93, Static115.anInt2377);
						if (Static84.anInt1667 >= local62) {
							Static483.method7014(Static392.anIntArrayArray39[local62], local78, local70, arg3);
						}
						if (local156 >= Static374.anInt5986) {
							Static483.method7014(Static392.anIntArrayArray39[local156], local78, local70, arg3);
						}
					}
				}
			}
			local156 = arg0 - local12;
			local62 = local12 + arg0;
			if (Static374.anInt5986 <= local62 && local156 <= Static84.anInt1667) {
				local70 = arg5 + local27;
				local78 = arg5 - local27;
				if (Static7.anInt93 <= local70 && Static115.anInt2377 >= local78) {
					local70 = Static120.method2296(local70, Static7.anInt93, Static115.anInt2377);
					local78 = Static120.method2296(local78, Static7.anInt93, Static115.anInt2377);
					if (local12 >= local21) {
						if (Static84.anInt1667 >= local62) {
							Static483.method7014(Static392.anIntArrayArray39[local62], local78, local70, arg3);
						}
						if (local156 >= Static374.anInt5986) {
							Static483.method7014(Static392.anIntArrayArray39[local156], local78, local70, arg3);
						}
					} else {
						local87 = local12 <= local32 ? local32 : Static636.anIntArray886[local12];
						local211 = Static120.method2296(arg5 + local87, Static7.anInt93, Static115.anInt2377);
						local219 = Static120.method2296(arg5 - local87, Static7.anInt93, Static115.anInt2377);
						if (local62 <= Static84.anInt1667) {
							local230 = Static392.anIntArrayArray39[local62];
							Static483.method7014(local230, local78, local219, arg3);
							Static483.method7014(local230, local219, local211, arg1);
							Static483.method7014(local230, local211, local70, arg3);
						}
						if (local156 >= Static374.anInt5986) {
							local230 = Static392.anIntArrayArray39[local156];
							Static483.method7014(local230, local78, local219, arg3);
							Static483.method7014(local230, local219, local211, arg1);
							Static483.method7014(local230, local211, local70, arg3);
						}
					}
				}
			}
		}
	}
}
