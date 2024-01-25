import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "Lclient!saa;")
	public static final Class309 aClass309_2 = new Class309();

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "Lclient!saa;")
	public static final Class309 aClass309_5 = new Class309();

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Lclient!saa;")
	public static final Class309 aClass309_3 = new Class309();

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "Lclient!saa;")
	public static final Class309 aClass309_4 = new Class309();

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_24 = new Class74("", 13);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ee;I)Lclient!ta;")
	public static Class3_Sub3 method7361(@OriginalArg(0) Class5_Sub12 arg0) {
		return new Class3_Sub3(arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8657(), arg0.method8645());
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([JII[II)V")
	public static void method7363(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(21) int local21 = (arg3 + arg1) / 2;
		@Pc(23) int local23 = arg3;
		@Pc(27) long local27 = arg0[local21];
		arg0[local21] = arg0[arg1];
		arg0[arg1] = local27;
		@Pc(41) int local41 = arg2[local21];
		arg2[local21] = arg2[arg1];
		arg2[arg1] = local41;
		@Pc(61) int local61 = ~local27 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg1; local63++) {
			if (arg0[local63] < (long) (local63 & local61) + local27) {
				@Pc(80) long local80 = arg0[local63];
				arg0[local63] = arg0[local23];
				arg0[local23] = local80;
				@Pc(94) int local94 = arg2[local63];
				arg2[local63] = arg2[local23];
				arg2[local23++] = local94;
			}
		}
		arg0[arg1] = arg0[local23];
		arg0[local23] = local27;
		arg2[arg1] = arg2[local23];
		arg2[local23] = local41;
		method7363(arg0, local23 - 1, arg2, arg3);
		method7363(arg0, arg1, arg2, local23 + 1);
	}
}
