import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt306 = 0;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array3 = new Class24[8];

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_96 = Static81.method1507("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	public static int anInt308 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method304() {
		Static185.aClass1_Sub2_Sub8_Sub3_7.method2352(0, 0);
		Static57.aClass1_Sub2_Sub8_Sub3_1.method2352(382, 0);
		Static64.aClass1_Sub2_Sub8_Sub2_1.method1960(382 - Static64.aClass1_Sub2_Sub8_Sub2_1.anInt2563 / 2, 18);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
	public static void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class49 local13 = local7.aClass49_1;
		if (local13 != null) {
			local13.anInt2081 = local13.anInt2081 * arg3 / 16;
			local13.anInt2078 = local13.anInt2078 * arg3 / 16;
		}
	}
}
