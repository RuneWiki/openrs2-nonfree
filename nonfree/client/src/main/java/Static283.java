import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
	public static int anInt5684 = 0;

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "Z")
	public static volatile boolean aBoolean358 = true;

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString404 = "wave2:";

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IC)Z")
	public static boolean method4308(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static149.aCharArray4;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(47) char local47 = local37[local39];
				if (arg0 == local47) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILclient!wf;II)V")
	public static void method4309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class191 arg4, @OriginalArg(5) int arg5) {
		@Pc(9) Class107 local9 = Static173.method2819(arg1);
		if (local9 == null || !local9.aBoolean240 || !local9.method2745()) {
			return;
		}
		@Pc(36) int local36;
		if (local9.anIntArray339 != null) {
			@Pc(34) int[] local34 = new int[local9.anIntArray339.length];
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				@Pc(52) int local52;
				if (Static106.anInt2378 == 4) {
					local52 = (int) Static62.aFloat16 & 0x7FF;
				} else {
					local52 = (int) Static62.aFloat16 + Static220.anInt4691 & 0x7FF;
				}
				@Pc(66) int local66 = Class146.anIntArray461[local52];
				@Pc(70) int local70 = Class146.anIntArray463[local52];
				if (Static106.anInt2378 != 4) {
					local66 = local66 * 256 / (Static253.anInt5117 + 256);
					local70 = local70 * 256 / (Static253.anInt5117 + 256);
				}
				local34[local36 * 2] = arg3 + arg4.anInt6088 / 2 + ((arg2 - -(local9.anIntArray339[local36 * 2 + 1] * 4)) * local66 + local70 * (local9.anIntArray339[local36 * 2] * 4 + arg0) >> 16);
				local34[local36 * 2 + 1] = arg5 + arg4.anInt6128 / 2 - (-(local66 * (arg0 + local9.anIntArray339[local36 * 2] * 4)) + (arg2 + local9.anIntArray339[local36 * 2 + 1] * 4) * local70 >> 16);
			}
			if (Static294.aBoolean367) {
				Static73.method1282(local34, local9.anInt3788, local9.anInt3788 >>> 24, arg4.anIntArray557, arg4.anIntArray554);
			} else {
				Static152.method2459(local34, local9.anInt3788, local9.anInt3788 >>> 24, arg4.anIntArray557, arg4.anIntArray554);
			}
			for (local36 = 0; local36 < local34.length / 2 - 1; local36++) {
				if (Static294.aBoolean367) {
					Static156.method2535(local34[local36 * 2], local34[local36 * 2 + 1], local34[(local36 + 1) * 2], local34[local36 * 2 + 1 + 2], local9.anInt3765, local9.anInt3765 >>> 24, (Class1_Sub3_Sub13_Sub1) arg4.method4674(false));
				} else {
					Static231.method3641(local34[local36 * 2], local34[local36 * 2 + 1], local34[(local36 + 1) * 2], local34[(local36 + 1) * 2 + 1], local9.anInt3765, local9.anInt3765 >>> 24, arg4.anIntArray557, arg4.anIntArray554);
				}
			}
			if (Static294.aBoolean367) {
				Static156.method2535(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local9.anInt3765, local9.anInt3765 >>> 24, (Class1_Sub3_Sub13_Sub1) arg4.method4674(false));
			} else {
				Static231.method3641(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local9.anInt3765, local9.anInt3765 >>> 24, arg4.anIntArray557, arg4.anIntArray554);
			}
		}
		@Pc(370) Class46 local370 = null;
		if (local9.anInt3781 != -1) {
			local370 = local9.method2740(false, false);
			if (local370 != null) {
				Static182.method2953(arg3, arg4, arg2, arg0, local370, arg5);
			}
		}
		if (local9.aString237 == null) {
			return;
		}
		@Pc(399) Class1_Sub3_Sub5 local399 = Static160.aClass1_Sub3_Sub5_1;
		if (local9.anInt3784 == 1) {
			local399 = Static195.aClass1_Sub3_Sub5_3;
		}
		local36 = 0;
		if (local370 != null) {
			local36 = local370.anInt4751;
		}
		if (local9.anInt3784 == 2) {
			local399 = Static176.aClass1_Sub3_Sub5_2;
		}
		Static1.method4724(local399, arg4, local9.aString237, arg3, arg2, local36, local9.anInt3773, arg0, arg5);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
	public static int method4312(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)V")
	public static void method4313(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static103.aBooleanArray17[arg0]) {
			return;
		}
		Static130.aClass168_99.method4047(arg0);
		if (Static34.aClass191ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(31) boolean local31 = true;
		for (@Pc(33) int local33 = 0; local33 < Static34.aClass191ArrayArray1[arg0].length; local33++) {
			if (Static34.aClass191ArrayArray1[arg0][local33] != null) {
				if (Static34.aClass191ArrayArray1[arg0][local33].anInt6086 == 2) {
					local31 = false;
				} else {
					Static34.aClass191ArrayArray1[arg0][local33] = null;
				}
			}
		}
		if (local31) {
			Static34.aClass191ArrayArray1[arg0] = null;
		}
		Static103.aBooleanArray17[arg0] = false;
	}
}
