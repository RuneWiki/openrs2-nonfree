import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!dea;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Lclient!qt;")
	public static Class282 aClass282_8;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	public static int anInt4975;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!wk;")
	public static final Class374 aClass374_1 = new Class374();

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_80 = new Class130(5, 1);

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_81 = new Class130(52, -1);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIII)V")
	public static void method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(17) int local17 = -arg1;
		@Pc(19) int local19 = -1;
		Static611.method8472(arg2 + arg1, -arg1 + arg2, Static460.anIntArrayArray53[arg3], arg0);
		while (local7 < local9) {
			local19 += 2;
			local7++;
			local17 += local19;
			if (local17 >= 0) {
				local9--;
				local17 -= local9 << 1;
				@Pc(57) int[] local57 = Static460.anIntArrayArray53[arg3 + local9];
				@Pc(63) int[] local63 = Static460.anIntArrayArray53[arg3 - local9];
				@Pc(67) int local67 = arg2 + local7;
				@Pc(71) int local71 = arg2 - local7;
				Static611.method8472(local67, local71, local57, arg0);
				Static611.method8472(local67, local71, local63, arg0);
			}
			@Pc(87) int local87 = local9 + arg2;
			@Pc(91) int local91 = arg2 - local9;
			@Pc(98) int[] local98 = Static460.anIntArrayArray53[arg3 + local7];
			@Pc(104) int[] local104 = Static460.anIntArrayArray53[arg3 - local7];
			Static611.method8472(local87, local91, local98, arg0);
			Static611.method8472(local87, local91, local104, arg0);
		}
	}
}
