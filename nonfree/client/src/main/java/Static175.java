import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "Lclient!r;")
	public static Class197 aClass197_52;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 49)
	public static void method3466(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 101)
	public static void method3467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class22 local13 = local7.aClass22_2; local13 != null; local13 = local13.aClass22_1) {
			@Pc(17) Class11_Sub5 local17 = local13.aClass11_Sub5_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort103 == arg1 && local17.aShort101 == arg2) {
				Static308.method5660(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([SZII[Ljava/lang/String;)V", line = 200)
	public static void method3469(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) String local25 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local25;
		@Pc(39) short local39 = arg0[local19];
		arg0[local19] = arg0[arg2];
		arg0[arg2] = local39;
		for (@Pc(51) int local51 = arg1; local51 < arg2; local51++) {
			if (local25 == null || arg3[local51] != null && arg3[local51].compareTo(local25) < (local51 & 0x1)) {
				@Pc(72) String local72 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21] = local72;
				@Pc(86) short local86 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21++] = local86;
			}
		}
		arg3[arg2] = arg3[local21];
		arg3[local21] = local25;
		arg0[arg2] = arg0[local21];
		arg0[local21] = local39;
		method3469(arg0, arg1, local21 - 1, arg3);
		method3469(arg0, local21 + 1, arg2, arg3);
	}
}
