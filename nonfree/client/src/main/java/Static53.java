import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public static int anInt1121;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_374 = Static161.method2452("::fpsoff");

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_375 = Static161.method2452("Null");

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_376 = Static161.method2452("(U1");

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_377 = Static161.method2452("(Z");

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public static int anInt1122 = 500;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "J")
	public static long aLong64 = 0L;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "[I")
	public static final int[] anIntArray105 = new int[100];

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "[J")
	public static final long[] aLongArray12 = new long[32];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIII)V")
	public static void method915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class14[] local12 = Static218.aClass14Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class14 local20 = local12[local14];
			if (local20 != null && local20.anInt394 == 2) {
				Static145.method2239(arg3 >> 1, local20.anInt395 * 2, local20.anInt400 + (local20.anInt401 - Static86.anInt1895 << 7), arg2 >> 1, local20.anInt397 + (local20.anInt402 - Static110.anInt2295 << 7));
				if (Static36.anInt786 > -1 && Static177.anInt3533 % 20 < 10) {
					Static10.aClass5_Sub2_Sub10Array1[local20.anInt396].method2403(Static36.anInt786 + arg1 - 12, arg0 - (-Static192.anInt3781 - -28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!re;I)V")
	public static void method916(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt2247 > Static177.anInt3533) {
			Static21.method3194(arg0);
		} else if (arg0.anInt2269 >= Static177.anInt3533) {
			Static51.method891(arg0);
		} else {
			Static197.method2918(arg0);
		}
		if (arg0.anInt2241 < 128 || arg0.anInt2234 < 128 || arg0.anInt2241 >= 13184 || arg0.anInt2234 >= 13184) {
			arg0.anInt2247 = 0;
			arg0.anInt2241 = arg0.anIntArray250[0] * 128 + arg0.anInt2238 * 64;
			arg0.anInt2254 = -1;
			arg0.anInt2266 = -1;
			arg0.anInt2234 = arg0.anIntArray253[0] * 128 + arg0.anInt2238 * 64;
			arg0.anInt2269 = 0;
			arg0.method1742();
		}
		if (arg0 == Static210.aClass1_Sub2_Sub2_2 && (arg0.anInt2241 < 1536 || arg0.anInt2234 < 1536 || arg0.anInt2241 >= 11776 || arg0.anInt2234 >= 11776)) {
			arg0.anInt2234 = arg0.anInt2238 * 64 + arg0.anIntArray253[0] * 128;
			arg0.anInt2241 = arg0.anIntArray250[0] * 128 + arg0.anInt2238 * 64;
			arg0.anInt2266 = -1;
			arg0.anInt2269 = 0;
			arg0.anInt2254 = -1;
			arg0.anInt2247 = 0;
			arg0.method1742();
		}
		Static107.method1723(arg0);
		Static210.method732(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lclient!p;[BIIIZII)V")
	public static void method917(@OriginalArg(0) Class76[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			for (local21 = 0; local21 < 64; local21++) {
				for (local25 = 0; local25 < 64; local25++) {
					if (local21 + arg5 > 0 && arg5 + local21 < 103 && arg3 + local25 > 0 && arg3 + local25 < 103) {
						arg0[local17].anIntArrayArray30[local21 + arg5][local25 + arg3] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(107) Class5_Sub6 local107 = new Class5_Sub6(arg1);
		for (local21 = 0; local21 < 4; local21++) {
			for (local25 = 0; local25 < 64; local25++) {
				for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
					Static143.method2226(local117 + arg3, local107, local21, local25 + arg5, arg4, 0, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
	public static void method920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static37.method1027(arg2)) {
			Static170.method2602(Static155.aClass69ArrayArray1[arg2], arg1, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)I")
	public static int method924() {
		return Static153.anInt3126;
	}
}
