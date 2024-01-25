import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!lia", name = "L", descriptor = "I")
	public static int anInt5922;

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_78 = new Class241(32, 3);

	@OriginalMember(owner = "client!lia", name = "I", descriptor = "I")
	public static int anInt5923 = -1;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIBLclient!lga;)Lclient!rha;")
	public static Class316 method5332(@OriginalArg(0) int arg0, @OriginalArg(3) Class223 arg1) {
		@Pc(20) byte[] local20 = arg1.method5267(0, arg0);
		return local20 == null ? null : new Class316(local20);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)Lclient!vo;")
	public static Class381 method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class381 local7 = Static69.method899(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass381Array1 == null || arg0 >= local7.aClass381Array1.length) {
			return null;
		} else {
			return local7.aClass381Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "([II[JII)V")
	public static void method5334(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(11) int local11 = (arg2 + arg3) / 2;
		@Pc(13) int local13 = arg2;
		@Pc(17) long local17 = arg1[local11];
		arg1[local11] = arg1[arg3];
		arg1[arg3] = local17;
		@Pc(31) int local31 = arg0[local11];
		arg0[local11] = arg0[arg3];
		arg0[arg3] = local31;
		@Pc(52) int local52 = ~local17 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg2; local54 < arg3; local54++) {
			if (arg1[local54] < (long) (local52 & local54) + local17) {
				@Pc(77) long local77 = arg1[local54];
				arg1[local54] = arg1[local13];
				arg1[local13] = local77;
				@Pc(91) int local91 = arg0[local54];
				arg0[local54] = arg0[local13];
				arg0[local13++] = local91;
			}
		}
		arg1[arg3] = arg1[local13];
		arg1[local13] = local17;
		arg0[arg3] = arg0[local13];
		arg0[local13] = local31;
		method5334(arg0, arg1, arg2, local13 - 1);
		method5334(arg0, arg1, local13 + 1, arg3);
	}
}
