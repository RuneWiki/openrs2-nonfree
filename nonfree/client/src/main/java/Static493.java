import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "Z")
	public static boolean aBoolean629;

	@OriginalMember(owner = "client!rm", name = "Q", descriptor = "Lclient!eq;")
	public static Class97 aClass97_124;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "Lclient!vt;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "Lclient!nj;")
	public static final Class234 aClass234_1 = new Class234();

	@OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
	public static final int anInt8410 = 1403;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII)V")
	public static void method7073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static177.anInt3963 < arg2 || Static570.anInt9385 > arg1) {
			return;
		}
		@Pc(24) boolean local24;
		if (Static306.anInt5020 > arg4) {
			local24 = false;
			arg4 = Static306.anInt5020;
		} else if (arg4 <= Static252.anInt4988) {
			local24 = true;
		} else {
			arg4 = Static252.anInt4988;
			local24 = false;
		}
		@Pc(48) boolean local48;
		if (Static306.anInt5020 > arg0) {
			local48 = false;
			arg0 = Static306.anInt5020;
		} else if (Static252.anInt4988 < arg0) {
			local48 = false;
			arg0 = Static252.anInt4988;
		} else {
			local48 = true;
		}
		if (Static570.anInt9385 > arg2) {
			arg2 = Static570.anInt9385;
		} else {
			Static259.method4236(arg4, arg0, arg3, Static618.anIntArrayArray101[arg2++]);
		}
		if (arg1 <= Static177.anInt3963) {
			Static259.method4236(arg4, arg0, arg3, Static618.anIntArrayArray101[arg1--]);
		} else {
			arg1 = Static177.anInt3963;
		}
		@Pc(107) int local107;
		if (local24 && local48) {
			for (local107 = arg2; local107 <= arg1; local107++) {
				@Pc(147) int[] local147 = Static618.anIntArrayArray101[local107];
				local147[arg4] = local147[arg0] = arg3;
			}
		} else if (local24) {
			for (local107 = arg2; local107 <= arg1; local107++) {
				Static618.anIntArrayArray101[local107][arg4] = arg3;
			}
		} else if (local48) {
			for (local107 = arg2; local107 <= arg1; local107++) {
				Static618.anIntArrayArray101[local107][arg0] = arg3;
			}
		}
	}
}
