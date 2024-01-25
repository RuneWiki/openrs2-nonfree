import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "[I")
	public static final int[] anIntArray199 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!gs", name = "H", descriptor = "Z")
	public static boolean aBoolean327 = false;

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "[I")
	public static final int[] anIntArray200 = new int[25];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!cja;)I")
	public static int method3347(@OriginalArg(1) Class64 arg0) {
		if (arg0 == Static536.aClass64_4) {
			return 5890;
		} else if (Static235.aClass64_2 == arg0) {
			return 34167;
		} else if (Static169.aClass64_1 == arg0) {
			return 34168;
		} else if (arg0 == Static413.aClass64_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[FI)[F")
	public static float[] method3349(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static686.method4968(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)V")
	public static void method3350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1007) {
			Static652.method8744(Static467.aClass394_129, arg2, arg1);
		} else if (arg0 == 1010) {
			Static652.method8744(Static305.aClass394_88, arg2, arg1);
		} else if (arg0 == 1004) {
			Static652.method8744(Static414.aClass394_114, arg2, arg1);
		} else if (arg0 == 1008) {
			Static652.method8744(Static320.aClass394_176, arg2, arg1);
		} else if (arg0 == 1006) {
			Static652.method8744(Static600.aClass394_163, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!uaa;I)V")
	public static void method3351(@OriginalArg(0) Class345 arg0) {
		if (Static145.anInt2974 == arg0.anInt9579) {
			Static57.aBooleanArray2[arg0.anInt9643] = true;
		}
	}
}
