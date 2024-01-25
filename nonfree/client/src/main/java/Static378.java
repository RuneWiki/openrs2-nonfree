import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!au;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "J")
	public static long aLong204;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_68 = new Class70(48, 4);

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
	public static boolean aBoolean493 = false;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!li;")
	public static final Class209 aClass209_4 = new Class209();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)V")
	public static void method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub6_Sub16 local15 = Static212.method3332(14, arg1);
		local15.method6594();
		local15.anInt8204 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
	public static void method5055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = arg2 + 1;
		Static433.method6039(arg1, arg4, Static171.anIntArrayArray79[arg2], arg3);
		@Pc(22) int local22 = arg0 - 1;
		Static433.method6039(arg1, arg4, Static171.anIntArrayArray79[arg0], arg3);
		for (@Pc(34) int local34 = local11; local34 <= local22; local34++) {
			@Pc(40) int[] local40 = Static171.anIntArrayArray79[local34];
			local40[arg3] = local40[arg4] = arg1;
		}
	}
}
