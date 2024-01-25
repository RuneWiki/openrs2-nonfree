import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public static final int anInt590 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)Z")
	public static boolean method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static315.method5167(arg1, arg0) | (arg1 & 0x70000) != 0 || Static136.method2563(arg1, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!sl;)Lclient!ada;")
	public static Class6 method672(@OriginalArg(1) Class3_Sub3 arg0) {
		@Pc(10) Class83 local10 = Static352.method5820()[arg0.method4225()];
		@Pc(17) Class50 local17 = Static496.method2282()[arg0.method4225()];
		@Pc(29) int local29 = arg0.method4209();
		@Pc(33) int local33 = arg0.method4209();
		@Pc(37) int local37 = arg0.method4221();
		@Pc(43) int local43 = arg0.method4221();
		@Pc(47) int local47 = arg0.method4209();
		@Pc(51) int local51 = arg0.method4207();
		@Pc(55) int local55 = arg0.method4207();
		return new Class6(local10, local17, local29, local33, local37, local43, local47, local51, local55);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method673() {
		for (@Pc(3) int local3 = 0; local3 < Static513.aByteArrayArrayArray18.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static513.aByteArrayArrayArray18[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static513.aByteArrayArrayArray18[0][0].length; local11++) {
					Static513.aByteArrayArrayArray18[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[F)[F")
	public static float[] method674(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(14) float[] local14 = new float[arg0];
		Static653.method6854(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
