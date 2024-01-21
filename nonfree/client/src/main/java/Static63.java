import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_4 = new Class94(5);

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	public static int anInt1331 = -1;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_611 = Static193.method3027("sl_back");

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_612 = Static193.method3027("Fallen lassen");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIBIII)V")
	public static void method962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static16.method302(arg2, arg0 - arg4, arg4 + arg0, Static157.anIntArrayArray24[arg1]);
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(34) int local34 = 0;
		@Pc(38) int local38 = local24 << 1;
		@Pc(42) int local42 = arg3 << 1;
		@Pc(46) int local46 = arg4 * arg4;
		@Pc(50) int local50 = local46 << 2;
		@Pc(58) int local58 = local38 + (1 - local42) * local46;
		@Pc(62) int local62 = local46 << 1;
		@Pc(70) int local70 = local38 * 3;
		@Pc(74) int local74 = local24 << 2;
		@Pc(82) int local82 = local24 - (local42 - 1) * local62;
		@Pc(90) int local90 = local62 * ((arg3 << 1) - 3);
		@Pc(96) int local96 = local74;
		@Pc(102) int local102 = (arg3 - 1) * local50;
		while (local20 > 0) {
			local20--;
			if (local58 < 0) {
				while (local58 < 0) {
					local34++;
					local82 += local96;
					local96 += local74;
					local58 += local70;
					local70 += local74;
				}
			}
			@Pc(138) int local138 = local20 + arg1;
			@Pc(142) int local142 = arg1 - local20;
			if (local82 < 0) {
				local58 += local70;
				local70 += local74;
				local82 += local96;
				local34++;
				local96 += local74;
			}
			@Pc(166) int local166 = arg0 + local34;
			local58 += -local102;
			local102 -= local50;
			local82 += -local90;
			local90 -= local50;
			@Pc(188) int local188 = arg0 - local34;
			Static16.method302(arg2, local188, local166, Static157.anIntArrayArray24[local142]);
			Static16.method302(arg2, local188, local166, Static157.anIntArrayArray24[local138]);
		}
	}
}
