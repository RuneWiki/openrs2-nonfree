import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public static int anInt1346;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt1356;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "J")
	public static volatile long aLong57 = 0L;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
	public static void method1045() {
		@Pc(9) byte[][] local9 = Static6.aByteArrayArray1;
		@Pc(12) int local12 = local9.length;
		@Pc(42) int local42;
		@Pc(27) int local27;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			local27 = (Static103.anIntArray197[local14] & 0xFF) * 64 - Static101.anInt2041;
			@Pc(31) byte[] local31 = local9[local14];
			local42 = (Static103.anIntArray197[local14] >> 8) * 64 - Static91.anInt4078;
			if (local31 != null) {
				Static192.method3138();
				Static179.method2938(Static22.aClass16Array1, local27, local31, local42, (Static11.anInt230 - 6) * 8, (Static201.anInt4067 - 6) * 8);
			}
		}
		for (local42 = 0; local42 < local12; local42++) {
			local27 = (Static103.anIntArray197[local42] >> 8) * 64 - Static91.anInt4078;
			@Pc(96) int local96 = (Static103.anIntArray197[local42] & 0xFF) * 64 - Static101.anInt2041;
			@Pc(100) byte[] local100 = local9[local42];
			if (local100 == null && Static201.anInt4067 < 800) {
				Static192.method3138();
				for (@Pc(109) int local109 = 0; local109 < 4; local109++) {
					method1046(64, local27, 64, local96, local109);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIII)V")
	public static void method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg0 + arg3; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg1 + arg2; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static24.aByteArrayArrayArray2[arg4][local11][local7] = 127;
				}
			}
		}
		@Pc(64) int local64;
		for (@Pc(60) int local60 = arg3; local60 < arg3 + arg0; local60++) {
			for (local64 = arg1; local64 < arg2 + arg1; local64++) {
				if (local64 >= 0 && local64 < 104 && local60 >= 0 && local60 < 104) {
					Static119.anIntArrayArrayArray10[arg4][local64][local60] = arg4 <= 0 ? 0 : Static119.anIntArrayArrayArray10[arg4 - 1][local64][local60];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local64 = arg3 + 1; local64 < arg0 + arg3; local64++) {
				if (local64 >= 0 && local64 < 104) {
					Static119.anIntArrayArrayArray10[arg4][arg1][local64] = Static119.anIntArrayArrayArray10[arg4][arg1 - 1][local64];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local64 = arg1 + 1; local64 < arg2 + arg1; local64++) {
				if (local64 >= 0 && local64 < 104) {
					Static119.anIntArrayArrayArray10[arg4][local64][arg3] = Static119.anIntArrayArrayArray10[arg4][local64][arg3 - 1];
				}
			}
		}
		if (arg1 < 0 || arg3 < 0 || arg1 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 > 0 && Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3] != 0) {
				Static119.anIntArrayArrayArray10[arg4][arg1][arg3] = Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3];
				return;
			}
			if (arg3 > 0 && Static119.anIntArrayArrayArray10[arg4][arg1][arg3 - 1] != 0) {
				Static119.anIntArrayArrayArray10[arg4][arg1][arg3] = Static119.anIntArrayArrayArray10[arg4][arg1][arg3 - 1];
				return;
			}
			if (arg1 > 0 && arg3 > 0 && Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3 - 1] != 0) {
				Static119.anIntArrayArrayArray10[arg4][arg1][arg3] = Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3] != Static119.anIntArrayArrayArray10[arg4 - 1][arg1 - 1][arg3]) {
			Static119.anIntArrayArrayArray10[arg4][arg1][arg3] = Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3];
			return;
		}
		if (arg3 > 0 && Static119.anIntArrayArrayArray10[arg4][arg1][arg3 - 1] != Static119.anIntArrayArrayArray10[arg4 - 1][arg1][arg3 - 1]) {
			Static119.anIntArrayArrayArray10[arg4][arg1][arg3] = Static119.anIntArrayArrayArray10[arg4][arg1][arg3 - 1];
			return;
		}
		if (arg1 > 0 && arg3 > 0 && Static119.anIntArrayArrayArray10[arg4 - 1][arg1 - 1][arg3 - 1] != Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3 - 1]) {
			Static119.anIntArrayArrayArray10[arg4][arg1][arg3] = Static119.anIntArrayArrayArray10[arg4][arg1 - 1][arg3 - 1];
			return;
		}
	}
}
