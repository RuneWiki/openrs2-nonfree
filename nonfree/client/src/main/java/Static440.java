import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!ib;")
	public static Class102 aClass102_40 = new Class102(64);

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
	public static final int[] anIntArray543 = new int[250];

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZI)V")
	public static void method5561(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static122.aClass19_16 = Static455.method4241(Static80.anInterface7_3, Static323.aClass50_Sub1_1.anInt3440 * 2, Static273.aCanvas5, arg1, Static206.aClass66_4);
		} else {
			if (arg0) {
				Static122.aClass19_16 = Static455.method4241(Static80.anInterface7_3, 0, Static273.aCanvas5, 0, Static206.aClass66_4);
				Static122.aClass19_16.p(0);
				@Pc(22) Class89 local22 = Static239.method3546(Static62.anInt1122, Static209.aClass76_48);
				@Pc(31) Class46 local31 = Static122.aClass19_16.method4275(local22, Static456.method327(Static293.aClass76_60, Static62.anInt1122));
				Static436.method5519(true, Static439.aClass83_148.method2267(Static178.anInt3423), local31);
				Static122.aClass19_16.method4247();
				Static348.method4697();
				Static122.aClass19_16.method4267();
			}
			try {
				Static122.aClass19_16 = Static455.method4241(Static80.anInterface7_3, Static323.aClass50_Sub1_1.anInt3440 * 2, Static273.aCanvas5, arg1, Static206.aClass66_4);
				if (Static122.aClass19_16.method4300()) {
					@Pc(62) boolean local62 = true;
					try {
						local62 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(72) Throwable local72) {
					}
					@Pc(78) Class4_Sub2 local78;
					if (local62) {
						local78 = Static122.aClass19_16.method4284(146800640);
					} else {
						local78 = Static122.aClass19_16.method4284(104857600);
					}
					Static122.aClass19_16.method4244(local78);
				}
			} catch (@Pc(89) Throwable local89) {
				Static122.aClass19_16 = Static455.method4241(Static80.anInterface7_3, 0, Static273.aCanvas5, 0, Static206.aClass66_4);
				arg1 = 0;
			}
		}
		Static177.anInt2973 = arg1;
		Static103.method1813();
		if (!Static122.aClass19_16.method4264()) {
			Static218.anInt4043 = 1;
		}
		Static122.aClass19_16.method4283(Static218.anInt4043);
		Static122.aClass19_16.method4273(0);
		Static122.aClass19_16.MA(8);
		Static111.aClass31_1 = Static122.aClass19_16.method4274();
		Static247.aClass31_2 = Static122.aClass19_16.method4274();
		Static201.method4607();
		Static122.aClass19_16.method4237(!Static323.aClass50_Sub1_1.aBoolean296);
		if (Static122.aClass19_16.method4252()) {
			Static353.method4772(Static323.aClass50_Sub1_1.aBoolean300);
		}
		Static254.method3682(Static283.anInt5187 >> 3, Static122.aClass19_16, Static326.anInt5666 >> 3);
		Static222.method3355();
		Static249.aBoolean425 = false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!ya;IIIIIIIII[[[B)V")
	public static void method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg9 == 0 || arg1 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg0 = arg0 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg0 = arg0 + 3 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg0 = arg0 + 3 & 0x3;
		}
		arg2.DA(arg7, arg8, arg4, arg5, arg3, arg10, arg11[arg9 - 1][arg0], arg1, arg6);
	}
}
