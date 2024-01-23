import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!so", name = "L", descriptor = "I")
	public static int anInt5267;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "Lclient!th;")
	public static Class168 aClass168_177;

	@OriginalMember(owner = "client!so", name = "N", descriptor = "[I")
	public static int[] anIntArray478 = new int[500];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII)V")
	public static void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		for (local3 = arg1; local3 <= arg4 + arg1; local3++) {
			for (local14 = arg0; local14 <= arg0 + arg2; local14++) {
				if (local14 >= 0 && local14 < 104 && local3 >= 0 && local3 < 104) {
					Static170.aByteArrayArrayArray14[arg3][local14][local3] = 127;
				}
			}
		}
		for (local3 = arg1; local3 < arg4 + arg1; local3++) {
			for (local14 = arg0; local14 < arg0 + arg2; local14++) {
				if (local14 >= 0 && local14 < 104 && local3 >= 0 && local3 < 104) {
					Static46.anIntArrayArrayArray1[arg3][local14][local3] = arg3 > 0 ? Static46.anIntArrayArrayArray1[arg3 - 1][local14][local3] : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (local3 = arg1 + 1; local3 < arg4 + arg1; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static46.anIntArrayArrayArray1[arg3][arg0][local3] = Static46.anIntArrayArrayArray1[arg3][arg0 - 1][local3];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local3 = arg0 + 1; local3 < arg0 + arg2; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static46.anIntArrayArrayArray1[arg3][local3][arg1] = Static46.anIntArrayArrayArray1[arg3][local3][arg1 - 1];
				}
			}
		}
		if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 > 0 && Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1] != 0) {
				Static46.anIntArrayArrayArray1[arg3][arg0][arg1] = Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1];
			} else if (arg1 > 0 && Static46.anIntArrayArrayArray1[arg3][arg0][arg1 - 1] != 0) {
				Static46.anIntArrayArrayArray1[arg3][arg0][arg1] = Static46.anIntArrayArrayArray1[arg3][arg0][arg1 - 1];
			} else if (arg0 > 0 && arg1 > 0 && Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1 - 1] != 0) {
				Static46.anIntArrayArrayArray1[arg3][arg0][arg1] = Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1 - 1];
			}
		} else if (arg0 > 0 && Static46.anIntArrayArrayArray1[arg3 - 1][arg0 - 1][arg1] != Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1]) {
			Static46.anIntArrayArrayArray1[arg3][arg0][arg1] = Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static46.anIntArrayArrayArray1[arg3 - 1][arg0][arg1 - 1] != Static46.anIntArrayArrayArray1[arg3][arg0][arg1 - 1]) {
			Static46.anIntArrayArrayArray1[arg3][arg0][arg1] = Static46.anIntArrayArrayArray1[arg3][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static46.anIntArrayArrayArray1[arg3 - 1][arg0 - 1][arg1 - 1] != Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1 - 1]) {
			Static46.anIntArrayArrayArray1[arg3][arg0][arg1] = Static46.anIntArrayArrayArray1[arg3][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!ci;BII)V")
	public static void method3992(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static315.aClass26_62.method667();
		if (Static230.aBoolean186) {
			return;
		}
		for (@Pc(21) Class1_Sub3_Sub11 local21 = (Class1_Sub3_Sub11) arg0.method666(); local21 != null; local21 = (Class1_Sub3_Sub11) arg0.method672()) {
			@Pc(29) Class107 local29 = Static173.method2819(local21.anInt3104);
			if (Static302.method4609(local29)) {
				Static24.method509(local21, arg1, local29, arg2);
				if (local21.aBoolean189) {
					Static129.method2074(local21, local29);
				}
			}
		}
	}
}
