import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIILclient!oba;I)Z")
	public static boolean method3226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class261 arg4, @OriginalArg(6) int arg5) {
		if (!Static671.aBoolean798 || !Static142.aBoolean362) {
			return false;
		} else if (Static267.anInt4311 < 100) {
			return false;
		} else if (arg1 != arg0 || arg3 != arg5) {
			for (@Pc(49) int local49 = arg0; local49 <= arg1; local49++) {
				for (@Pc(53) int local53 = arg5; local53 <= arg3; local53++) {
					if (Static233.anIntArrayArrayArray10[arg2][local49][local53] == -Static79.anInt1702) {
						return false;
					}
				}
			}
			if (Static82.method7285(arg4)) {
				Static679.anInt10636++;
				return true;
			} else {
				return false;
			}
		} else if (!Static592.method7783(arg2, arg5, arg0)) {
			return false;
		} else if (Static82.method7285(arg4)) {
			Static679.anInt10636++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBILclient!kg;ILclient!kg;III)V")
	public static void method3227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub2_Sub2 arg3, @OriginalArg(6) Class3_Sub1_Sub2_Sub2 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg3.method8519();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class17 local21 = (Class17) Static158.aClass352_71.method7653((long) local7);
		if (local21 == null) {
			@Pc(28) Class51[] local28 = Static682.method1651(Static368.aClass34_80, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static582.aClass33_13.method8147(local28[0], true);
			Static158.aClass352_71.method7655((long) local7, local21);
		}
		Static85.method1764(arg4.anInt9917, arg4.method8514() * 256, arg4.anInt9925, arg4.aByte141, arg5 >> 1, arg2 >> 1, 0);
		@Pc(74) int local74 = arg6 + Static519.anIntArray552[0] - 18;
		@Pc(82) int local82 = local74 + arg0 / 4 * 18;
		@Pc(92) int local92 = Static519.anIntArray552[1] + arg1 - 54 - 16;
		@Pc(100) int local100 = local92 + arg0 % 4 * 18;
		local21.method5246(local82, local100);
		if (arg3 == arg4) {
			Static582.aClass33_13.method8100(18, local100 - 1, local82 + -1, 18, -256);
		}
		Static100.method2025(local100 - 1, local82 + 18, local82 - 1, local100 + 18);
		@Pc(141) Class3_Sub10 local141 = Static665.method8803();
		local141.anInt10529 = local82;
		local141.anInt10532 = local82 + 16;
		local141.aClass3_Sub1_Sub2_Sub2_1 = arg3;
		local141.anInt10533 = local100 + 16;
		local141.anInt10534 = local100;
		Static592.aClass236_8.method4955(local141);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3228(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
