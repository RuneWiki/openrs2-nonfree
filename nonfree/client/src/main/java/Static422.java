import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pba", name = "o", descriptor = "Lclient!da;")
	public static Class34 aClass34_8;

	@OriginalMember(owner = "client!pba", name = "u", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_8 = new Class352(15, 0, 1, 0);

	@OriginalMember(owner = "client!pba", name = "x", descriptor = "[I")
	public static final int[] anIntArray409 = new int[2];

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!bi;)I")
	public static int method6591(@OriginalArg(1) Class6_Sub8_Sub1 arg0) {
		@Pc(14) int local14 = arg0.method1512(2);
		@Pc(34) int local34;
		if (local14 == 0) {
			local34 = 0;
		} else if (local14 == 1) {
			local34 = arg0.method1512(5);
		} else if (local14 == 2) {
			local34 = arg0.method1512(8);
		} else {
			local34 = arg0.method1512(11);
		}
		return local34;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)Z")
	public static boolean method6593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static115.method2524(arg1, arg0) | Static191.method3516(arg0, arg1) | Static450.method6846(arg1, arg0)) & Static166.method8084(arg1, arg0);
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
	public static void method6594() {
		for (@Pc(3) int local3 = 0; local3 < Static495.aByteArrayArrayArray17.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static495.aByteArrayArrayArray17[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static495.aByteArrayArrayArray17[0][0].length; local11++) {
					Static495.aByteArrayArrayArray17[local3][local7][local11] = 0;
				}
			}
		}
	}
}
