import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
	public static int anInt6749;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "[I")
	public static int[] anIntArray543;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!ff;")
	public static final Class104 aClass104_3 = new Class104(2);

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Z")
	public static boolean aBoolean501 = false;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_83 = new Class61(56, -1);

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	public static int anInt6751 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
	public static void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static359.anInt6232 || arg2 < Static252.anInt4971) {
			return;
		}
		@Pc(22) boolean local22;
		if (Static68.anInt1306 > arg0) {
			arg0 = Static68.anInt1306;
			local22 = false;
		} else if (Static589.anInt9684 >= arg0) {
			local22 = true;
		} else {
			local22 = false;
			arg0 = Static589.anInt9684;
		}
		@Pc(51) boolean local51;
		if (arg3 < Static68.anInt1306) {
			local51 = false;
			arg3 = Static68.anInt1306;
		} else if (arg3 <= Static589.anInt9684) {
			local51 = true;
		} else {
			local51 = false;
			arg3 = Static589.anInt9684;
		}
		if (arg4 >= Static252.anInt4971) {
			Static336.method5023(arg1, arg3, Static383.anIntArrayArray62[arg4++], arg0);
		} else {
			arg4 = Static252.anInt4971;
		}
		if (arg2 <= Static359.anInt6232) {
			Static336.method5023(arg1, arg3, Static383.anIntArrayArray62[arg2--], arg0);
		} else {
			arg2 = Static359.anInt6232;
		}
		@Pc(109) int local109;
		if (local22 && local51) {
			for (local109 = arg4; local109 <= arg2; local109++) {
				@Pc(151) int[] local151 = Static383.anIntArrayArray62[local109];
				local151[arg0] = local151[arg3] = arg1;
			}
		} else if (local22) {
			for (local109 = arg4; local109 <= arg2; local109++) {
				Static383.anIntArrayArray62[local109][arg0] = arg1;
			}
		} else if (local51) {
			for (local109 = arg4; local109 <= arg2; local109++) {
				Static383.anIntArrayArray62[local109][arg3] = arg1;
			}
		}
	}
}
