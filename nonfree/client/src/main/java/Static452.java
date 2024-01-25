import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!ci;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_131 = new Class98(39, 6);

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Lclient!faa;")
	public static Class97 aClass97_19 = null;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILclient!vfa;Lclient!jd;Lclient!vu;ILclient!oa;)V")
	public static void method6339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class329 arg2, @OriginalArg(4) Class6_Sub22 arg3, @OriginalArg(5) Class336 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class90 arg6) {
		@Pc(21) int local21 = arg3.anInt4397 - arg5 / 2 - 5;
		@Pc(25) int local25 = arg1 + 2;
		if (arg4.anInt9761 != 0) {
			arg6.method7482(local25, arg4.anInt9761, arg5 + 10, -local25 + 1 + arg1 + arg2.method7445() * arg0, local21);
		}
		if (arg4.anInt9750 != 0) {
			arg6.method7516(arg4.anInt9750, arg1 + arg0 * arg2.method7445() + 1 - local25, local21, local25, arg5 + 10);
		}
		@Pc(80) int local80 = arg4.anInt9743;
		if (arg3.aBoolean323 && arg4.anInt9747 != -1) {
			local80 = arg4.anInt9747;
		}
		for (@Pc(92) int local92 = 0; local92 < arg0; local92++) {
			@Pc(98) String local98 = Static12.aStringArray1[local92];
			if (arg0 - 1 > local92) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg2.method7446(arg6, local98, arg3.anInt4397, arg1, local80);
			arg1 += arg2.method7445();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III[I[J)V")
	public static void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg1; local54 < arg0; local54++) {
			if (arg3[local54] < (long) (local54 & local52) + local20) {
				@Pc(71) long local71 = arg3[local54];
				arg3[local54] = arg3[local16];
				arg3[local16] = local71;
				@Pc(85) int local85 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16++] = local85;
			}
		}
		arg3[arg0] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg0] = arg2[local16];
		arg2[local16] = local34;
		method6340(local16 - 1, arg1, arg2, arg3);
		method6340(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)Z")
	public static boolean method6341(@OriginalArg(0) int arg0) {
		if (arg0 == 4 || arg0 == 17 || arg0 == 57 || arg0 == 8 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 3 || arg0 == 1009;
		}
	}
}
