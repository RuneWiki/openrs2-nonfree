import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
	public static int anInt2256;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	public static int anInt2260;

	@OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
	public static int anInt2261;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "[I")
	public static final int[] anIntArray185 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "[Lclient!hq;")
	public static final Class148[] aClass148Array2 = new Class148[14];

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "[I")
	public static final int[] anIntArray187 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	public static int anInt2259 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ[J[Ljava/lang/Object;)V")
	public static void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) long local24 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local24;
		@Pc(38) Object local38 = arg3[local18];
		arg3[local18] = arg3[arg0];
		arg3[arg0] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg1; local58 < arg0; local58++) {
			if (arg2[local58] < local24 + (long) (local56 & local58)) {
				@Pc(76) long local76 = arg2[local58];
				arg2[local58] = arg2[local20];
				arg2[local20] = local76;
				@Pc(90) Object local90 = arg3[local58];
				arg3[local58] = arg3[local20];
				arg3[local20++] = local90;
			}
		}
		arg2[arg0] = arg2[local20];
		arg2[local20] = local24;
		arg3[arg0] = arg3[local20];
		arg3[local20] = local38;
		method1904(local20 - 1, arg1, arg2, arg3);
		method1904(arg0, local20 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/lang/String;Lclient!gk;)I")
	public static int method1906(@OriginalArg(1) String arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		@Pc(6) int local6 = arg1.anInt5186;
		@Pc(10) byte[] local10 = Static165.method2187(arg0);
		arg1.method4500(local10.length);
		arg1.anInt5186 += Static11.aClass320_1.method6527(arg1.anInt5186, 0, local10.length, arg1.aByteArray52, local10);
		return arg1.anInt5186 - local6;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!la;)V")
	public static void method1910(@OriginalArg(0) Class37 arg0) {
		Static562.aClass37_19 = arg0;
	}
}
