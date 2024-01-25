import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "Lclient!bm;")
	public static Interface1 anInterface1_4;

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "J")
	public static long aLong114 = 0L;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString193 = "Continue";

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[SI[Ljava/lang/String;B)V")
	public static void method2883(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg2) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) String local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) short local42 = arg1[local22];
		arg1[local22] = arg1[arg2];
		arg1[arg2] = local42;
		for (@Pc(54) int local54 = arg0; local54 < arg2; local54++) {
			if (local28 == null || arg3[local54] != null && arg3[local54].compareTo(local28) < (local54 & 0x1)) {
				@Pc(74) String local74 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24] = local74;
				@Pc(88) short local88 = arg1[local54];
				arg1[local54] = arg1[local24];
				arg1[local24++] = local88;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg1[arg2] = arg1[local24];
		arg1[local24] = local42;
		method2883(arg0, arg1, local24 - 1, arg3);
		method2883(local24 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public static void method2884() {
		Static126.aClass66_44.method1942();
		Static261.aClass66_87.method1942();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method2885(@OriginalArg(1) Class170 arg0) {
		Static228.aClass170_81 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)I")
	public static int method2886(@OriginalArg(1) int arg0) {
		@Pc(16) Class27 local16 = Static140.method2608(arg0);
		@Pc(19) int local19 = local16.anInt828;
		@Pc(22) int local22 = local16.anInt833;
		@Pc(25) int local25 = local16.anInt826;
		@Pc(32) int local32 = Class107.anIntArray216[local25 - local22];
		return local32 & Static69.anIntArray80[local19] >> local22;
	}
}
