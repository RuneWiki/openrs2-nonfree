import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!ph;")
	public static Class187 aClass187_99;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	public static int anInt5607;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static int anInt5600 = 0;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_27 = new Class168(1, 16);

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	public static int anInt5606 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZ)I")
	public static int method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static332.aClass154Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg2 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static2.anInt7 - 1 || local15 > Static17.anInt315 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 < 3 && (Static181.aByteArrayArrayArray15[1][local11][local15] & 0x2) != 0) {
			local44 = arg0 + 1;
		}
		return Static332.aClass154Array3[local44].ca(arg1, arg2);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[[[BIIIIIIIILclient!za;II)V")
	public static void method4460(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class50 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg11 == 0 || arg8 == 0) {
			return;
		}
		if (arg11 == 9) {
			arg11 = 1;
			arg6 = arg6 + 1 & 0x3;
		}
		if (arg11 == 10) {
			arg11 = 1;
			arg6 = arg6 + 3 & 0x3;
		}
		if (arg11 == 11) {
			arg11 = 8;
			arg6 = arg6 + 3 & 0x3;
		}
		arg9.K(arg10, arg4, arg2, arg3, arg5, arg0, arg1[arg11 - 1][arg6], arg8, arg7);
	}
}
