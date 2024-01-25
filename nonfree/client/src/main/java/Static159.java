import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public static int anInt2964;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3147(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, arg0.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(arg1.length() + local14);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ja;Lclient!dj;Lclient!qa;IIILclient!rr;)V")
	public static void method3148(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub35 arg6) {
		@Pc(14) int local14 = arg6.anInt5322 - arg4 / 2 - 5;
		@Pc(27) int local27 = arg5 + 2;
		if (arg3.anInt4670 != 0) {
			arg1.method3017(arg0 * arg2.method973() + arg5 + 1 - local27, arg3.anInt4670, arg4 + 10, local14, local27);
		}
		if (arg3.anInt4669 != 0) {
			arg1.method3002(local27, arg3.anInt4669, local14, arg4 + 10, -local27 + 1 + arg5 + arg2.method973() * arg0);
		}
		@Pc(84) int local84 = arg3.anInt4698;
		if (arg6.aBoolean367 && arg3.anInt4672 != -1) {
			local84 = arg3.anInt4672;
		}
		for (@Pc(96) int local96 = 0; local96 < arg0; local96++) {
			@Pc(102) String local102 = Static73.aStringArray7[local96];
			if (local96 < arg0 - 1) {
				local102 = local102.substring(0, local102.length() - 4);
			}
			arg2.method971(arg1, local102, arg6.anInt5322, arg5, local84);
			arg5 += arg2.method973();
		}
	}
}
