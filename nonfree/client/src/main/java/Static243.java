import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	public static int anInt5324;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Lclient!kb;")
	public static Class83 aClass83_164;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	public static volatile int anInt5328 = -1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILclient!kb;I)[Lclient!ug;")
	public static Class1_Sub2_Sub14[] method4185(@OriginalArg(1) int arg0, @OriginalArg(2) Class83 arg1) {
		return Static19.method387(arg0, 0, arg1) ? Static87.method1518() : null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIIIIII)V")
	public static void method4186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static223.method941(arg4, Static223.anInt1245, Static152.anInt3532);
		@Pc(17) int local17 = Static223.method941(arg1, Static223.anInt1245, Static152.anInt3532);
		@Pc(23) int local23 = Static223.method941(arg3, Static88.anInt2052, Static102.anInt2239);
		@Pc(29) int local29 = Static223.method941(arg0, Static88.anInt2052, Static102.anInt2239);
		@Pc(38) int local38 = Static223.method941(arg4 + arg5, Static223.anInt1245, Static152.anInt3532);
		@Pc(49) int local49 = Static223.method941(arg1 - arg5, Static223.anInt1245, Static152.anInt3532);
		@Pc(51) int local51;
		for (local51 = local11; local51 < local38; local51++) {
			Static89.method1538(Static57.anIntArrayArray9[local51], local29, local23, arg2);
		}
		for (local51 = local17; local51 > local49; local51--) {
			Static89.method1538(Static57.anIntArrayArray9[local51], local29, local23, arg2);
		}
		@Pc(103) int local103 = Static223.method941(arg5 + arg3, Static88.anInt2052, Static102.anInt2239);
		@Pc(112) int local112 = Static223.method941(arg0 - arg5, Static88.anInt2052, Static102.anInt2239);
		for (local51 = local38; local51 <= local49; local51++) {
			@Pc(121) int[] local121 = Static57.anIntArrayArray9[local51];
			Static89.method1538(local121, local103, local23, arg2);
			Static89.method1538(local121, local29, local112, arg2);
		}
	}
}
