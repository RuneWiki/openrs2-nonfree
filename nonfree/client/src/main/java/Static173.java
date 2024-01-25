import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Lclient!aq;")
	public static Class12 aClass12_8 = null;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "[I")
	public static int[] anIntArray346 = new int[2];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method3435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static91.anIntArray217[arg0] = arg1;
		@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) Static192.aClass197_17.method5157((long) arg0);
		if (local18 == null) {
			local18 = new Class1_Sub12(4611686018427387905L);
			Static192.aClass197_17.method5166(local18, (long) arg0);
		} else if (local18.aLong55 != 4611686018427387905L) {
			local18.aLong55 = Static162.method3252() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIZ)V")
	public static void method3437(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static208.aClass32_11 = Static326.method2152(Static357.anInterface2_7, arg0, Static349.aCanvas5, Static15.aClass143_1, Static322.anInt6180 * 2);
		} else {
			if (arg1) {
				Static208.aClass32_11 = Static326.method2152(Static357.anInterface2_7, 0, Static349.aCanvas5, Static15.aClass143_1, 0);
				Static208.aClass32_11.method2180(0);
				@Pc(27) Class63 local27 = Static7.method272(Static86.anInt2149, Static34.aClass216_8);
				@Pc(36) Class9 local36 = Static208.aClass32_11.method2199(local27, Static366.method2659(Static193.aClass216_64, Static86.anInt2149));
				Static176.method3473(Static46.aClass34_34.method1285(Static259.anInt2907), true, local36);
				Static208.aClass32_11.method2209();
				Static231.method4265();
				Static208.aClass32_11.method2197();
			}
			try {
				Static208.aClass32_11 = Static326.method2152(Static357.anInterface2_7, arg0, Static349.aCanvas5, Static15.aClass143_1, Static322.anInt6180 * 2);
			} catch (@Pc(63) Throwable local63) {
				Static208.aClass32_11 = Static326.method2152(Static357.anInterface2_7, 0, Static349.aCanvas5, Static15.aClass143_1, 0);
				arg0 = 0;
			}
		}
		if (Static208.aClass32_11.method2163()) {
			@Pc(92) Class1_Sub2 local92 = Static208.aClass32_11.method2210();
			Static208.aClass32_11.method2176(local92);
		}
		Static306.anInt6046 = arg0;
		Static87.method1891();
		if (!Static208.aClass32_11.method2141()) {
			Static131.anInt3019 = 1;
		}
		Static208.aClass32_11.method2147(Static131.anInt3019);
		Static208.aClass32_11.method2211(0);
		Static265.aClass109_33 = Static208.aClass32_11.method2221();
		Static9.aClass109_3 = Static208.aClass32_11.method2221();
		@Pc(122) int local122 = (int) ((double) Static233.anInt5573 * 34.46D);
		if (Static208.aClass32_11.method2144()) {
			local122 += 128;
		}
		Static208.aClass32_11.method2202(50, local122);
		Static208.aClass32_11.method2239(!Static125.aBoolean268);
		if (Static208.aClass32_11.method2237()) {
			Static159.method3232(Static278.aBoolean547);
		}
		Static267.aBoolean522 = !Static40.method953();
		Static327.method5304(Static134.anInt2971 >> 3, Static233.anInt5573 >> 3, Static208.aClass32_11);
		Static308.method2772();
		Static269.aBoolean537 = false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII)V")
	public static void method3438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static268.anInt5477 <= arg1 - arg3 && arg3 + arg1 <= Static342.anInt3000 && arg4 - arg3 >= Static197.anInt4211 && Static326.anInt2469 >= arg4 + arg3) {
			Static233.method4785(arg2, arg3, arg4, arg1, arg5, arg0);
		} else {
			Static312.method4114(arg4, arg3, arg1, arg0, arg5, arg2);
		}
	}
}
