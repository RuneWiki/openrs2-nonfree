import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!n;")
	public static Class173_Sub1 aClass173_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_3 = new Class186(25, 6);

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt159 = -1;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "S")
	public static short aShort3 = 32767;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public static int anInt160 = 1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([III[JI)V")
	public static void method124(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg3; local56 < arg1; local56++) {
			if (arg2[local56] < local20 + (long) (local56 & local54)) {
				@Pc(77) long local77 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16] = local77;
				@Pc(91) int local91 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16++] = local91;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method124(arg0, local16 - 1, arg2, arg3);
		method124(arg0, arg1, arg2, local16 + 1);
	}
}
