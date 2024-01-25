import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!jf;")
	public static Class6_Sub17_Sub3 aClass6_Sub17_Sub3_2;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject23;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!mg;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_13 = new Class158(12, 0, 1, 0);

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt8813 = 0;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
	public static final int[] anIntArray584 = new int[2];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JB)V")
	public static void method7716(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
	public static int method7718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static272.aByteArrayArrayArray2[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static272.aByteArrayArrayArray2[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIII)Lclient!lga;")
	public static Class223 method7720(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class251 local5 = null;
		if (Static600.aClass130_8 != null) {
			local5 = new Class251(arg1, Static600.aClass130_8, Static644.aClass130Array1[arg1], 1000000);
		}
		Static16.aClass21_Sub1Array1[arg1] = Static38.aClass72_1.method1355(Static309.aClass251_4, local5, arg1);
		Static16.aClass21_Sub1Array1[arg1].method4627();
		return new Class223(Static16.aClass21_Sub1Array1[arg1], arg0, arg2);
	}
}
