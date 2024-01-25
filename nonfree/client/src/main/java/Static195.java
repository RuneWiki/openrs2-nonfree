import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "[I")
	public static int[] anIntArray390;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[S")
	public static final short[] aShortArray57 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!os;")
	public static final Class182 aClass182_130 = new Class182("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "[I")
	public static final int[] anIntArray391 = new int[2];

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
	public static void method3105() {
		Static310.method4308(Static128.aClass27_102);
		Static337.aClass10_Sub8_Sub2_2.method2458(0);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	public static void method3106() {
		if (Static122.aBoolean183) {
			return;
		}
		if (Static361.aClass85_Sub1_1.aBoolean164) {
			Static16.aFloat6 = (int) Static16.aFloat6 + 47 & 0xFFFFFFF0;
		} else {
			Static141.aFloat52 += (12.0F - Static141.aFloat52) / 2.0F;
		}
		Static122.aBoolean183 = true;
		Static406.aBoolean448 = true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ke;IIII)V")
	public static void method3108(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static159.method2691(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static54.anInt998) {
			Static159.method2691(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static159.method2691(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static24.anInt401) {
			Static159.method2691(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static24.anInt401) {
			Static159.method2691(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static54.anInt998 && arg4 <= Static24.anInt401) {
			Static159.method2691(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static159.method2691(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static54.anInt998 && arg4 > 0) {
			Static159.method2691(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
