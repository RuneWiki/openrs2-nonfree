import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sa", name = "J", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_104 = new Class25(40, 10);

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_105 = new Class25(49, 3);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static195.method2779(arg0)) {
			if (Static118.aClass93ArrayArray1[arg0] == null) {
				Static454.method6176(arg7, arg5, Static188.aClass93ArrayArray4[arg0], arg3, arg6, arg4, -1, arg1, arg2);
			} else {
				Static454.method6176(arg7, arg5, Static118.aClass93ArrayArray1[arg0], arg3, arg6, arg4, -1, arg1, arg2);
			}
		} else if (arg3 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static186.aBooleanArray12[local19] = true;
			}
		} else {
			Static186.aBooleanArray12[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)I")
	public static int method3532(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI)I")
	public static int method3535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static241.aClass22Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 7;
		@Pc(20) int local20 = arg2 >> 7;
		if (local16 < 0 || local20 < 0 || Static234.anInt3949 - 1 < local16 || Static371.anInt6492 - 1 < local20) {
			return 0;
		}
		@Pc(49) int local49 = arg0;
		if (arg0 < 3 && (Static326.aByteArrayArrayArray15[1][local16][local20] & 0x2) != 0) {
			local49 = arg0 + 1;
		}
		return Static241.aClass22Array3[local49].ca(arg1, arg2);
	}
}
