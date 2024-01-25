import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public static int anInt5378;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Lclient!qj;")
	public static Class165 aClass165_83;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIZIILclient!aa;IIIII[[[BI)V")
	public static void method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg8 == 0 || arg5 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg8 = 1;
			arg7 = arg7 + 1 & 0x3;
		}
		if (arg8 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg8 = 1;
		}
		if (arg8 == 11) {
			arg7 = arg7 + 3 & 0x3;
			arg8 = 8;
		}
		arg4.method3308(arg1, arg9, arg2, arg11, arg6, arg0, arg10[arg8 - 1][arg7], arg5, arg3);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)I")
	public static int method4788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4789(@OriginalArg(1) String arg0) {
		if (Static204.aStringArray29 == null) {
			Static181.method3545();
		}
		@Pc(14) String[] local14 = Static62.method1317(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(20) int local20 = Static107.anInt2184; local20 > 0; local20--) {
				Static204.aStringArray29[local20] = Static204.aStringArray29[local20 - 1];
			}
			Static204.aStringArray29[0] = local14[local16];
			if (Static204.aStringArray29.length - 1 > Static107.anInt2184) {
				if (Static214.anInt4240 > 0) {
					Static214.anInt4240++;
				}
				Static107.anInt2184++;
			}
		}
	}
}
