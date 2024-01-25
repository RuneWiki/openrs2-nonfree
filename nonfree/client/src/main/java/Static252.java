import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Lclient!tl;")
	public static Class9 aClass9_3;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_130 = new Class214(46, -1);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)I")
	public static int method2867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = ((arg2 & 0xFF00) * arg0 & 0xFF0000 | (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - arg0;
		return local21 + (((arg1 & 0xFF00FF) * local30 & 0xFF00FF00 | (arg1 & 0xFF00) * local30 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public static void method2868() {
		if (Static48.aClass3_2 != null) {
			Static48.aClass3_2.method63();
			Static48.aClass3_2 = null;
		}
		Static336.method4290();
		Static34.method589();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static383.aClass247Array1[local17].method5261();
		}
		Static240.method3130(false);
		System.gc();
		Static207.method2798();
		Static170.anInt2817 = -1;
		Static17.aBoolean28 = false;
		Static363.method4723(true);
		Static92.anInt1619 = 0;
		Static108.anInt1918 = 0;
		Static278.anInt4392 = 0;
		Static64.anInt1135 = 0;
		Static101.anInt6646 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static162.aClass209Array1.length; local56++) {
			Static162.aClass209Array1[local56] = null;
		}
		Static363.method4721();
		for (@Pc(76) int local76 = 0; local76 < 2048; local76++) {
			Static73.aClass20_Sub3_Sub3_Sub1Array1[local76] = null;
		}
		Static411.anInt6695 = 0;
		for (@Pc(92) int local92 = 0; local92 < 32768; local92++) {
			Static98.aClass20_Sub3_Sub3_Sub2Array1[local92] = null;
		}
		Static194.aClass257_13.method5499();
		Static428.method5377();
		Static41.anInt752 = 0;
		Static364.aClass259_1.method5521();
		Static155.method2183();
		Static364.method4729();
		Static239.method3125(true);
		try {
			Static460.method3422("loggedout", Static41.aClass124_2.anApplet1);
		} catch (@Pc(135) Throwable local135) {
		}
		Static15.aLong18 = 0L;
		Static52.aClass1_Sub10_1 = null;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!vg;BI)V")
	public static void method2869(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class59 local13 = arg1.method5342(Static213.aClass128_22);
		if (local13 == null) {
			return;
		}
		Static213.aClass128_22.pa(arg2, arg0, arg1.anInt7041 + arg2, arg1.anInt6997 + arg0);
		if (Static345.anInt5644 >= 3) {
			Static213.aClass128_22.j(-16777216, local13, arg2, arg0);
		} else {
			Static40.aClass49_13.method5637((float) arg1.anInt7041 / 2.0F + (float) arg2, (float) arg1.anInt6997 / 2.0F + (float) arg0, ((int) -Static95.aFloat27 & 0x3FFF) << 2, local13, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II[I[JI)V")
	public static void method2872(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg3; local50 < arg0; local50++) {
			if (arg2[local50] < local16 + (long) (local50 & local48)) {
				@Pc(72) long local72 = arg2[local50];
				arg2[local50] = arg2[local12];
				arg2[local12] = local72;
				@Pc(86) int local86 = arg1[local50];
				arg1[local50] = arg1[local12];
				arg1[local12++] = local86;
			}
		}
		arg2[arg0] = arg2[local12];
		arg2[local12] = local16;
		arg1[arg0] = arg1[local12];
		arg1[local12] = local30;
		method2872(local12 - 1, arg1, arg2, arg3);
		method2872(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BJ)V")
	public static void method2874(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static418.method5196(arg0 - 1L);
			Static418.method5196(1L);
		} else {
			Static418.method5196(arg0);
		}
	}
}
