import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public static int anInt4192 = 0;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1555 = Static161.method2452("welle2:");

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[J")
	public static final long[] aLongArray49 = new long[1000];

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	public static final int[] anIntArray428 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!re;B)V")
	public static void method3194(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.anInt2270 == 0) {
			arg0.anInt2246 = 1024;
		}
		arg0.anInt2213 = 0;
		@Pc(21) int local21 = arg0.anInt2247 - Static177.anInt3533;
		@Pc(31) int local31 = arg0.anInt2228 * 128 + arg0.anInt2238 * 64;
		if (arg0.anInt2270 == 1) {
			arg0.anInt2246 = 1536;
		}
		@Pc(50) int local50 = arg0.anInt2250 * 128 + arg0.anInt2238 * 64;
		arg0.anInt2241 += (local31 - arg0.anInt2241) / local21;
		arg0.anInt2234 += (local50 - arg0.anInt2234) / local21;
		if (arg0.anInt2270 == 2) {
			arg0.anInt2246 = 0;
		}
		if (arg0.anInt2270 == 3) {
			arg0.anInt2246 = 512;
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)[Lclient!ng;")
	public static Class47_Sub1[] method3198() {
		@Pc(8) Class47_Sub1[] local8 = new Class47_Sub1[Static99.anInt2138];
		for (@Pc(10) int local10 = 0; local10 < Static99.anInt2138; local10++) {
			local8[local10] = new Class47_Sub1(Static58.anInt1319, Static140.anInt2921, Static146.anIntArray320[local10], Static5.anIntArray10[local10], Static153.anIntArray337[local10], Static210.anIntArray84[local10], Static191.aByteArrayArray9[local10], Static3.anIntArray9);
		}
		Static85.method1452();
		return local8;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
	public static void method3201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		if (Static174.anInt3489 != arg0) {
			Static117.anIntArray274 = new int[arg0];
			for (local20 = 0; local20 < arg0; local20++) {
				Static117.anIntArray274[local20] = (local20 << 12) / arg0;
			}
			Static105.anInt2188 = arg0 == 64 ? 2048 : 4096;
			Static189.anInt3753 = arg0 - 1;
			Static174.anInt3489 = arg0;
		}
		if (Static207.anInt4072 == arg1) {
			return;
		}
		if (arg1 == Static174.anInt3489) {
			Static147.anIntArray321 = Static117.anIntArray274;
		} else {
			Static147.anIntArray321 = new int[arg1];
			for (local20 = 0; local20 < arg1; local20++) {
				Static147.anIntArray321[local20] = (local20 << 12) / arg1;
			}
		}
		Static207.anInt4072 = arg1;
		Static3.anInt74 = arg1 - 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wa;Lclient!wa;ILclient!wa;)V")
	public static void method3202(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) Class23 arg2) {
		Static189.aClass23_70 = arg2;
		Static84.aClass23_34 = arg0;
		Static141.aClass23_53 = arg1;
	}
}
