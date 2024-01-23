import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Lclient!nk;")
	public static Class121 aClass121_123;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString294 = "scroll:";

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString295 = "rating: ";

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!nk;II)Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 method4316(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		return Static313.method2575(arg0, 0, arg1) ? Static171.method2901() : null;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	public static void method4317(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg0, 4);
		local8.method2873();
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public static void method4319() {
		for (@Pc(3) int local3 = -1; local3 < Static304.anInt5394; local3++) {
			@Pc(15) int local15;
			if (local3 == -1) {
				local15 = 2047;
			} else {
				local15 = Static275.anIntArray440[local3];
			}
			@Pc(23) Class15_Sub5_Sub2 local23 = Static17.aClass15_Sub5_Sub2Array1[local15];
			if (local23 != null) {
				Static237.method3674(local23, local23.method4702());
			}
		}
	}
}
