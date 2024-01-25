import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!gp;")
	public static Class117 aClass117_189;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "Lclient!eo;")
	public static Class88 aClass88_3;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!cba;")
	public static Class43 aClass43_4;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
	public static int anInt7863;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "F")
	public static float aFloat328;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public static int anInt7860 = 1;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[128][128];

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
	public static final int[] anIntArray593 = new int[8];

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBII)I")
	public static int method6366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static213.anInt4055 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(23) int local23 = arg1 - Static245.anInt7314;
		@Pc(28) int local28 = arg2 - Static245.anInt7315;
		for (@Pc(33) Class5_Sub18 local33 = (Class5_Sub18) Static245.aClass99_60.method2526(); local33 != null; local33 = (Class5_Sub18) Static245.aClass99_60.method2519()) {
			if (arg0 == local33.anInt3138) {
				@Pc(42) int local42 = local33.anInt3137;
				@Pc(45) int local45 = local33.anInt3144;
				@Pc(55) int local55 = Static245.anInt7315 + local45 | local42 + Static245.anInt7314 << 14;
				@Pc(74) int local74 = (local28 - local45) * (local28 + -local45) + (local23 - local42) * (-local42 + local23);
				if (local17 < 0 || local74 < local19) {
					local17 = local55;
					local19 = local74;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	public static void method6368(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 4);
		local8.method1324();
	}
}
