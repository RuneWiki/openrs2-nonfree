import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!uca", name = "tb", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_121 = new Class154(2, 3);

	@OriginalMember(owner = "client!uca", name = "Ed", descriptor = "Lclient!rf;")
	public static final Class297 aClass297_3 = new Class297();

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILjava/lang/String;Lclient!ua;Lclient!fo;ILclient!la;Lclient!ps;IIII)V")
	public static void method6892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) Class112 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class37 arg6, @OriginalArg(7) Class273 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(11) int local11;
		if (Static489.anInt7763 == 4) {
			local11 = (int) Static313.aFloat157 & 0x3FFF;
		} else {
			local11 = (int) Static313.aFloat157 + Static525.anInt8446 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg7.anInt6883 / 2, arg7.anInt6814 / 2) + 10;
		@Pc(42) int local42 = arg10 * arg10 + arg0 * arg0;
		if (local33 * local33 < local42) {
			return;
		}
		@Pc(56) int local56 = Class285.anIntArray476[local11];
		@Pc(60) int local60 = Class285.anIntArray475[local11];
		if (Static489.anInt7763 != 4) {
			local60 = local60 * 256 / (Static434.anInt6973 + 256);
			local56 = local56 * 256 / (Static434.anInt6973 + 256);
		}
		@Pc(90) int local90 = local56 * arg0 + arg10 * local60 >> 14;
		@Pc(100) int local100 = local60 * arg0 - arg10 * local56 >> 14;
		@Pc(107) int local107 = arg4.method2083(null, 100, arg2);
		@Pc(113) int local113 = local90 - local107 / 2;
		@Pc(128) int local128 = arg4.method2075(0, 100, null, arg2);
		if (-arg7.anInt6883 <= local113 && arg7.anInt6883 >= local113 && -arg7.anInt6814 <= local100 && arg7.anInt6814 >= local100) {
			arg6.method7710(null, null, arg2, local107, local113 + arg9 + arg7.anInt6883 / 2, 50, arg8, arg1 + arg7.anInt6814 / 2 - arg5 - local100 - local128, 1, arg9, 0, 0, arg3, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(II)Z")
	public static boolean method6928(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
