import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	public static int anInt9729;

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_62 = new Class207(4);

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_15 = new Class295(9, 7);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIBII)V")
	public static void method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg4 - arg0;
		@Pc(32) int local32 = arg1 - arg0;
		@Pc(36) int local36 = arg4 * arg4;
		@Pc(40) int local40 = arg1 * arg1;
		@Pc(44) int local44 = local27 * local27;
		@Pc(48) int local48 = local32 * local32;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = local36 << 1;
		@Pc(60) int local60 = local48 << 1;
		@Pc(64) int local64 = local44 << 1;
		@Pc(68) int local68 = arg1 << 1;
		@Pc(72) int local72 = local32 << 1;
		@Pc(81) int local81 = (1 - local68) * local36 + local52;
		@Pc(90) int local90 = local40 - (local68 - 1) * local56;
		@Pc(99) int local99 = (1 - local72) * local44 + local60;
		@Pc(107) int local107 = local48 - local64 * (local72 - 1);
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 << 2;
		@Pc(119) int local119 = local44 << 2;
		@Pc(123) int local123 = local48 << 2;
		@Pc(127) int local127 = local52 * 3;
		@Pc(133) int local133 = local56 * (local68 - 3);
		@Pc(137) int local137 = local60 * 3;
		@Pc(143) int local143 = local64 * (local72 - 3);
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (arg1 - 1) * local111;
		@Pc(153) int local153 = local123;
		@Pc(159) int local159 = (local32 - 1) * local119;
		@Pc(163) int[] local163 = Static280.anIntArrayArray25[arg3];
		Static329.method4871(arg5 - arg4, -local27 + arg5, local163, arg6);
		Static329.method4871(arg5 - local27, local27 + arg5, local163, arg2);
		Static329.method4871(local27 + arg5, arg4 + arg5, local163, arg6);
		while (local21 > 0) {
			@Pc(204) boolean local204 = local32 >= local21;
			if (local81 < 0) {
				while (local81 < 0) {
					local90 += local145;
					local81 += local127;
					local127 += local115;
					local19++;
					local145 += local115;
				}
			}
			if (local204) {
				if (local99 < 0) {
					while (local99 < 0) {
						local99 += local137;
						local107 += local153;
						local153 += local123;
						local137 += local123;
						local23++;
					}
				}
				if (local107 < 0) {
					local107 += local153;
					local99 += local137;
					local23++;
					local137 += local123;
					local153 += local123;
				}
				local99 += -local159;
				local107 += -local143;
				local159 -= local119;
				local143 -= local119;
			}
			if (local90 < 0) {
				local81 += local127;
				local90 += local145;
				local145 += local115;
				local19++;
				local127 += local115;
			}
			local81 += -local151;
			local90 += -local133;
			local21--;
			local133 -= local111;
			local151 -= local111;
			@Pc(338) int local338 = arg3 - local21;
			@Pc(343) int local343 = arg3 + local21;
			@Pc(347) int local347 = local19 + arg5;
			@Pc(351) int local351 = arg5 - local19;
			if (local204) {
				@Pc(358) int local358 = arg5 + local23;
				@Pc(363) int local363 = arg5 - local23;
				Static329.method4871(local351, local363, Static280.anIntArrayArray25[local338], arg6);
				Static329.method4871(local363, local358, Static280.anIntArrayArray25[local338], arg2);
				Static329.method4871(local358, local347, Static280.anIntArrayArray25[local338], arg6);
				Static329.method4871(local351, local363, Static280.anIntArrayArray25[local343], arg6);
				Static329.method4871(local363, local358, Static280.anIntArrayArray25[local343], arg2);
				Static329.method4871(local358, local347, Static280.anIntArrayArray25[local343], arg6);
			} else {
				Static329.method4871(local351, local347, Static280.anIntArrayArray25[local338], arg6);
				Static329.method4871(local351, local347, Static280.anIntArrayArray25[local343], arg6);
			}
		}
	}
}
