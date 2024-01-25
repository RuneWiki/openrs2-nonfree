import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public static final int[] anIntArray328 = new int[1000];

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	public static int anInt3948 = 0;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public static int anInt3951 = -1;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
	public static int method3571(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method3572() {
		Static322.aClass293_39.method6930();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method3573(@OriginalArg(0) int arg0) {
		Static205.anInt3601 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static129.anInt6336; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static150.anInt2400; local6++) {
				if (Static535.aClass156ArrayArrayArray2[arg0][local3][local6] == null) {
					Static535.aClass156ArrayArrayArray2[arg0][local3][local6] = new Class156(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZJJZIIZIILjava/lang/String;BLjava/lang/String;I)V")
	public static void method3576(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(11) String arg10, @OriginalArg(12) int arg11) {
		if (!Static251.aBoolean343 && Static642.anInt10370 < 500) {
			@Pc(17) int local17 = arg8 == -1 ? Static522.anInt7724 : arg8;
			@Pc(33) Class5_Sub4_Sub14 local33 = new Class5_Sub4_Sub14(arg9, arg10, local17, arg5, arg7, arg2, arg11, arg4, arg0, arg6, arg1, arg3);
			Static437.method6511(local33);
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public static void method3580() {
		Static578.anInt9491 = -1;
		Static500.aClass44_22 = null;
	}
}
