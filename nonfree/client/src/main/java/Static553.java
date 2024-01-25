import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "Lclient!bd;")
	public static final Class27 aClass27_7 = new Class27();

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
	public static int anInt9422 = 0;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	public static int anInt9423 = -1;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "[I")
	public static int[] anIntArray816 = new int[1];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public static void method7873(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class6 local5 = Static122.aClass305_17.method7445(); local5 != null; local5 = Static122.aClass305_17.method7449()) {
			if ((long) arg0 == (local5.aLong252 >> 48 & 0xFFFFL)) {
				local5.method8151();
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Z")
	public static boolean method7874(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 4;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method7875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static501.method4264(arg2, Static289.anInt5545, Static96.anInt2302);
		@Pc(17) int local17 = Static501.method4264(arg5, Static289.anInt5545, Static96.anInt2302);
		@Pc(23) int local23 = Static501.method4264(arg6, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(29) int local29 = Static501.method4264(arg0, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(37) int local37 = Static501.method4264(arg3 + arg2, Static289.anInt5545, Static96.anInt2302);
		@Pc(46) int local46 = Static501.method4264(arg5 - arg3, Static289.anInt5545, Static96.anInt2302);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static115.method2332(local23, local29, arg1, Static183.anIntArrayArray26[local48]);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static115.method2332(local23, local29, arg1, Static183.anIntArrayArray26[local64]);
		}
		@Pc(87) int local87 = Static501.method4264(arg6 + arg3, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(96) int local96 = Static501.method4264(arg0 - arg3, Class179_Sub2.lb, Static376.anInt7071);
		for (@Pc(102) int local102 = local37; local102 <= local46; local102++) {
			@Pc(108) int[] local108 = Static183.anIntArrayArray26[local102];
			Static115.method2332(local23, local87, arg1, local108);
			Static115.method2332(local87, local96, arg4, local108);
			Static115.method2332(local96, local29, arg1, local108);
		}
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)I")
	public static int method7876() {
		return 46;
	}
}
