import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray52;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!jd;")
	public static Class84 aClass84_46;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Lclient!wn;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fc;III)V")
	public static void method1995(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub31 local12;
		if (arg2 < Static26.anInt552) {
			local12 = Static180.aClass2_Sub31ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass65_1 != null && local12.aClass65_1.aClass36_5.method4891()) {
				arg0.method4877(local12.aClass65_1.aClass36_5, 128, 0, 0, true);
			}
		}
		if (arg3 < Static26.anInt552) {
			local12 = Static180.aClass2_Sub31ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass65_1 != null && local12.aClass65_1.aClass36_5.method4891()) {
				arg0.method4877(local12.aClass65_1.aClass36_5, 0, 0, 128, true);
			}
		}
		if (arg2 < Static26.anInt552 && arg3 < Static232.anInt4787) {
			local12 = Static180.aClass2_Sub31ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass65_1 != null && local12.aClass65_1.aClass36_5.method4891()) {
				arg0.method4877(local12.aClass65_1.aClass36_5, 128, 0, 128, true);
			}
		}
		if (arg2 < Static26.anInt552 && arg3 > 0) {
			local12 = Static180.aClass2_Sub31ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass65_1 != null && local12.aClass65_1.aClass36_5.method4891()) {
				arg0.method4877(local12.aClass65_1.aClass36_5, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = arg5 - arg0;
		@Pc(12) int local12 = arg7 - arg1;
		@Pc(21) int local21 = (arg2 - arg3 << 16) / local8;
		@Pc(29) int local29 = (arg6 - arg4 << 16) / local12;
		Static31.method516(arg4, local21, arg3, local29, arg0, arg7, arg5, arg1);
	}
}
