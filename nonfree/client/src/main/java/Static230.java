import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
	public static int anInt4439;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ls", name = "P", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIF[BIFLclient!gl;IIIFIFF)V")
	public static void method3597(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg5.method2089(arg0, 0, arg6 / (float) 128, local12, arg1 / (float) 16, arg7 / (float) 128, arg4 * 127.0F);
			local42 = arg3;
			for (local44 = 0; local44 < 16384; local44++) {
				arg2[local42] = (byte) ((float) arg2[local42] + local12[local44]);
				local42++;
			}
			arg1 *= 2.0F;
			arg4 *= arg8;
			arg6 *= 2.0F;
			arg7 *= 2.0F;
		}
		local42 = arg3;
		for (local44 = 0; local44 < 16384; local44++) {
			arg2[local42] -= -127;
			local42++;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	public static void method3599() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static280.anInt5104 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIBIILclient!eq;III)Z")
	public static boolean method3601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class70 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg8;
		@Pc(17) int local17 = arg0 - 64;
		Static149.anIntArrayArray28[64][64] = 99;
		@Pc(28) int local28 = arg8 - 64;
		Static142.anIntArrayArray27[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static432.anIntArray602[0] = arg0;
		@Pc(45) int local45 = local36 + 1;
		Static185.anIntArray318[0] = arg8;
		@Pc(55) int[][] local55 = arg6.anIntArrayArray17;
		while (local45 != local38) {
			local9 = Static185.anIntArray318[local38];
			local7 = Static432.anIntArray602[local38];
			@Pc(70) int local70 = local7 - local17;
			@Pc(74) int local74 = local9 - local28;
			local38 = local38 + 1 & 0xFFF;
			@Pc(86) int local86 = local7 - arg6.anInt2303;
			@Pc(91) int local91 = local9 - arg6.anInt2305;
			if (arg1 == -4) {
				if (local7 == arg9 && arg3 == local9) {
					Static275.anInt5052 = local7;
					Static333.anInt5769 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static170.method2747(2, arg7, arg2, local9, arg3, local7, arg9, 2)) {
					Static333.anInt5769 = local9;
					Static275.anInt5052 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg6.method1805(arg7, local9, arg3, 2, arg2, arg5, 2, local7, arg9)) {
					Static333.anInt5769 = local9;
					Static275.anInt5052 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg6.method1803(arg5, arg3, local7, arg9, local9, 2, arg2, arg7)) {
					Static333.anInt5769 = local9;
					Static275.anInt5052 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg6.method1795(local7, arg9, arg4, arg3, 2, local9, arg1)) {
					Static333.anInt5769 = local9;
					Static275.anInt5052 = local7;
					return true;
				}
			} else if (arg6.method1796(arg9, arg4, 2, local7, arg3, local9, arg1)) {
				Static275.anInt5052 = local7;
				Static333.anInt5769 = local9;
				return true;
			}
			@Pc(239) int local239 = Static142.anIntArrayArray27[local70][local74] + 1;
			if (local70 > 0 && Static149.anIntArrayArray28[local70 - 1][local74] == 0 && (local55[local86 - 1][local91] & 0x43A40000) == 0 && (local55[local86 - 1][local91 + 1] & 0x4E240000) == 0) {
				Static432.anIntArray602[local45] = local7 - 1;
				Static185.anIntArray318[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local70 - 1][local74] = 2;
				Static142.anIntArrayArray27[local70 - 1][local74] = local239;
			}
			if (local70 < 126 && Static149.anIntArrayArray28[local70 + 1][local74] == 0 && (local55[local86 + 2][local91] & 0x60E40000) == 0 && (local55[local86 + 2][local91 + 1] & 0x78240000) == 0) {
				Static432.anIntArray602[local45] = local7 + 1;
				Static185.anIntArray318[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local70 + 1][local74] = 8;
				Static142.anIntArrayArray27[local70 + 1][local74] = local239;
			}
			if (local74 > 0 && Static149.anIntArrayArray28[local70][local74 - 1] == 0 && (local55[local86][local91 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local91 - 1] & 0x60E40000) == 0) {
				Static432.anIntArray602[local45] = local7;
				Static185.anIntArray318[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local70][local74 - 1] = 1;
				Static142.anIntArrayArray27[local70][local74 - 1] = local239;
			}
			if (local74 < 126 && Static149.anIntArrayArray28[local70][local74 + 1] == 0 && (local55[local86][local91 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local91 + 2] & 0x78240000) == 0) {
				Static432.anIntArray602[local45] = local7;
				Static185.anIntArray318[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local70][local74 + 1] = 4;
				Static142.anIntArrayArray27[local70][local74 + 1] = local239;
			}
			if (local70 > 0 && local74 > 0 && Static149.anIntArrayArray28[local70 - 1][local74 - 1] == 0 && (local55[local86 - 1][local91] & 0x4FA40000) == 0 && (local55[local86 - 1][local91 - 1] & 0x43A40000) == 0 && (local55[local86][local91 - 1] & 0x63E40000) == 0) {
				Static432.anIntArray602[local45] = local7 - 1;
				Static185.anIntArray318[local45] = local9 - 1;
				Static149.anIntArrayArray28[local70 - 1][local74 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local70 - 1][local74 - 1] = local239;
			}
			if (local70 < 126 && local74 > 0 && Static149.anIntArrayArray28[local70 + 1][local74 - 1] == 0 && (local55[local86 + 1][local91 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local91 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local91] & 0x78E40000) == 0) {
				Static432.anIntArray602[local45] = local7 + 1;
				Static185.anIntArray318[local45] = local9 - 1;
				Static149.anIntArrayArray28[local70 + 1][local74 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local70 + 1][local74 - 1] = local239;
			}
			if (local70 > 0 && local74 < 126 && Static149.anIntArrayArray28[local70 - 1][local74 + 1] == 0 && (local55[local86 - 1][local91 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local91 + 2] & 0x4E240000) == 0 && (local55[local86][local91 + 2] & 0x7E240000) == 0) {
				Static432.anIntArray602[local45] = local7 - 1;
				Static185.anIntArray318[local45] = local9 + 1;
				Static149.anIntArrayArray28[local70 - 1][local74 + 1] = 6;
				local45 = local45 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local70 - 1][local74 + 1] = local239;
			}
			if (local70 < 126 && local74 < 126 && Static149.anIntArrayArray28[local70 + 1][local74 + 1] == 0 && (local55[local86 + 1][local91 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local91 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local91 + 1] & 0x78E40000) == 0) {
				Static432.anIntArray602[local45] = local7 + 1;
				Static185.anIntArray318[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local70 + 1][local74 + 1] = 12;
				Static142.anIntArrayArray27[local70 + 1][local74 + 1] = local239;
			}
		}
		Static333.anInt5769 = local9;
		Static275.anInt5052 = local7;
		return false;
	}
}
