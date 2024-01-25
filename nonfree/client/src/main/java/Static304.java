import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	public static int anInt5617;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	public static int anInt5622;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_90 = new Class274(17, 0);

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "[I")
	public static final int[] anIntArray381 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public static int anInt5623 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!cv;I)I")
	public static int method4693(@OriginalArg(0) Class62 arg0) {
		if (arg0 == Static322.aClass62_3) {
			return 9216;
		} else if (Static577.aClass62_4 == arg0) {
			return 34065;
		} else if (arg0 == Static261.aClass62_1) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Z")
	public static boolean method4694(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static24.method591(arg5, 0, arg3, arg1, arg4, arg0, arg2);
	}
}
