import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!sp;")
	public static Class5_Sub37 aClass5_Sub37_2;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_153 = new Class220(4, 1, 1, 1);

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public static int anInt7324 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIB)Z")
	public static boolean method5804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIII[J)V")
	public static void method5805(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if (local20 + (long) (local54 & local56) > arg3[local56]) {
				@Pc(77) long local77 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16] = local77;
				@Pc(91) int local91 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16++] = local91;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method5805(arg0, local16 - 1, arg2, arg3);
		method5805(arg0, arg1, local16 + 1, arg3);
	}
}
