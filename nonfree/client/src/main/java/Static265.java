import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!fh;")
	public static Class58 aClass58_94;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "C")
	public static char aChar4;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "[I")
	public static int[] anIntArray550 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
	public static int anInt5089 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Lclient!vl;")
	public static Class186 method4163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass186_1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fh;II)Z")
	public static boolean method4168(@OriginalArg(0) Class58 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1343(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static222.method3579(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)V")
	public static void method4169(@OriginalArg(0) boolean arg0) {
		if (Static52.aBoolean152 != arg0) {
			Static52.aBoolean152 = arg0;
			Static227.method3636();
		}
	}
}
