import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "Lclient!gp;")
	public static Class117 aClass117_21;

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_7 = new Class236(74, 2);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1037(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static398.anInt7144 && arg3 <= Static71.anInt4958 && Static4.anInt6709 <= arg4 && arg5 <= Static492.anInt8451) {
			Static164.method2920(arg1, arg0, arg4, arg5, arg2, arg6, arg3);
		} else {
			Static58.method1163(arg2, arg5, arg1, arg4, arg3, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Lclient!ao;")
	public static Class15_Sub1 method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub1_2;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method1039(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static553.method2534(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V")
	public static void method1040() {
		for (@Pc(3) int local3 = 0; local3 < Static429.aByteArrayArrayArray17.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static429.aByteArrayArrayArray17[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static429.aByteArrayArrayArray17[0][0].length; local11++) {
					Static429.aByteArrayArrayArray17[local3][local7][local11] = 0;
				}
			}
		}
	}
}
