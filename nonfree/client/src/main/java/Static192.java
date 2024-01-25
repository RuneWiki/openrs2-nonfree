import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!ln;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt3567 = 0;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_9 = new Class297(1, 2);

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public static final int anInt3569 = 0;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!gi;")
	public static final Class122 aClass122_8 = new Class122();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!gfa;B)V")
	public static void method2939(@OriginalArg(0) Class1_Sub20 arg0) {
		if (Static292.aClass39ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface19 local8 = null;
		if (arg0.anInt2955 == 0) {
			local8 = (Interface19) Static82.method1473(arg0.anInt2942, arg0.anInt2953, arg0.anInt2957);
		}
		if (arg0.anInt2955 == 1) {
			local8 = (Interface19) Static29.method345(arg0.anInt2942, arg0.anInt2953, arg0.anInt2957);
		}
		if (arg0.anInt2955 == 2) {
			local8 = (Interface19) Static14.method147(arg0.anInt2942, arg0.anInt2953, arg0.anInt2957, rda.class);
		}
		if (arg0.anInt2955 == 3) {
			local8 = (Interface19) Static308.method4292(arg0.anInt2942, arg0.anInt2953, arg0.anInt2957);
		}
		if (local8 == null) {
			arg0.anInt2949 = -1;
			arg0.anInt2941 = 0;
			arg0.anInt2943 = 0;
		} else {
			arg0.anInt2949 = local8.method7640();
			arg0.anInt2943 = local8.method7638();
			arg0.anInt2941 = local8.method7637();
		}
	}
}
