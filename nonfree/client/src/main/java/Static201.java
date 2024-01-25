import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public static int anInt3303;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Lclient!bt;")
	public static Class34 aClass34_51;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!bt;")
	public static Class34 aClass34_52;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public static int anInt3305 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[Ljava/lang/Object;I[JI)V")
	public static void method3061(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg1) / 2;
		@Pc(25) int local25 = arg3;
		@Pc(29) long local29 = arg2[local23];
		arg2[local23] = arg2[arg1];
		arg2[arg1] = local29;
		@Pc(43) Object local43 = arg0[local23];
		arg0[local23] = arg0[arg1];
		arg0[arg1] = local43;
		@Pc(63) int local63 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg3; local65 < arg1; local65++) {
			if (arg2[local65] < local29 + (long) (local63 & local65)) {
				@Pc(87) long local87 = arg2[local65];
				arg2[local65] = arg2[local25];
				arg2[local25] = local87;
				@Pc(101) Object local101 = arg0[local65];
				arg0[local65] = arg0[local25];
				arg0[local25++] = local101;
			}
		}
		arg2[arg1] = arg2[local25];
		arg2[local25] = local29;
		arg0[arg1] = arg0[local25];
		arg0[local25] = local43;
		method3061(arg0, local25 - 1, arg2, arg3);
		method3061(arg0, arg1, arg2, local25 + 1);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V")
	public static void method3062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static91.anInt1809 != 0) {
			if (arg0 < 0) {
				for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
					Static475.anIntArray511[local17] = arg1;
				}
			} else {
				Static475.anIntArray511[arg0] = arg1;
			}
		}
		Static570.aClass4_Sub3_Sub4_6.method6780(arg1, arg0);
	}
}
