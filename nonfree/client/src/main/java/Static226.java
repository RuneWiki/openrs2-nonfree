import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
	public static int anInt3991;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "Lclient!oa;")
	public static Class28_Sub1_Sub1_Sub2 aClass28_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "[I")
	public static final int[] anIntArray427 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
	public static int anInt3990 = 0;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!us;")
	public static final Class234 aClass234_80 = new Class234(8, 7);

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Lclient!us;")
	public static final Class234 aClass234_81 = new Class234(37, -2);

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "[I")
	public static final int[] anIntArray428 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V")
	public static void method3727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg2) {
			Static349.method5265(arg0, arg2, arg3, Static325.anIntArrayArray50[arg1]);
		} else {
			Static349.method5265(arg2, arg0, arg3, Static325.anIntArrayArray50[arg1]);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)Lclient!hd;")
	public static Class3_Sub7_Sub7 method3728(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub7 local10 = (Class3_Sub7_Sub7) Static295.aClass21_4.method261((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static104.aClass20_28.method253(0, arg0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local10 = Static280.method4389(local22);
			Static295.aClass21_4.method259((long) arg0, local10);
			return local10;
		}
	}
}
