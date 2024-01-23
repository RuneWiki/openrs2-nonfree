import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString101 = "Prepared sound engine";

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "[S")
	public static short[] aShortArray43 = new short[256];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!km;I)Lclient!bc;")
	public static Class12 method1371(@OriginalArg(1) Class91 arg0, @OriginalArg(2) int arg1) {
		return Static163.method2824(arg0, arg1) ? Static126.method1524() : null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([SI[Ljava/lang/String;II)V")
	public static void method1378(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg3) / 2;
		@Pc(23) String local23 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local23;
		@Pc(35) int local35 = arg2;
		@Pc(39) short local39 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local39;
		for (@Pc(51) int local51 = arg2; local51 < arg3; local51++) {
			if (local23 == null || arg1[local51] != null && arg1[local51].compareTo(local23) < (local51 & 0x1)) {
				@Pc(78) String local78 = arg1[local51];
				arg1[local51] = arg1[local35];
				arg1[local35] = local78;
				@Pc(92) short local92 = arg0[local51];
				arg0[local51] = arg0[local35];
				arg0[local35++] = local92;
			}
		}
		arg1[arg3] = arg1[local35];
		arg1[local35] = local23;
		arg0[arg3] = arg0[local35];
		arg0[local35] = local39;
		method1378(arg0, arg1, arg2, local35 - 1);
		method1378(arg0, arg1, local35 + 1, arg3);
	}
}
