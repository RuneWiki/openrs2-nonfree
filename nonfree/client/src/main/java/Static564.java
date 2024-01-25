import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static564 {

	@OriginalMember(owner = "client!wfa", name = "v", descriptor = "[I")
	public static int[] anIntArray703;

	@OriginalMember(owner = "client!wfa", name = "cb", descriptor = "Lclient!nj;")
	public static Class212 aClass212_39 = new Class212(8);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)I")
	public static int method7701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILclient!nl;)I")
	public static int method7708(@OriginalArg(1) Class214 arg0) {
		if (Static43.aClass214_3 == arg0) {
			return 6407;
		} else if (arg0 == Static255.aClass214_8) {
			return 6408;
		} else if (arg0 == Static490.aClass214_14) {
			return 6406;
		} else if (Static134.aClass214_6 == arg0) {
			return 6409;
		} else if (arg0 == Static316.aClass214_10) {
			return 6410;
		} else if (Static466.aClass214_13 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)V")
	public static void method7711() {
		if (Static91.aClass121_11 != null) {
			Static91.aClass121_11.method7116();
			Static453.aClass56_5 = null;
			Static91.aClass121_11 = null;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIII)V")
	public static void method7723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg3) {
			Static221.method3234(arg2, arg4, arg1, arg0);
		} else if (arg4 - arg1 >= Static235.anInt3970 && arg1 + arg4 <= Static151.anInt2683 && Static134.anInt2364 <= arg0 - arg3 && arg0 + arg3 <= Static60.anInt971) {
			Static409.method1600(arg4, arg1, arg3, arg0, arg2);
		} else {
			Static281.method4013(arg2, arg0, arg1, arg4, arg3);
		}
	}
}
