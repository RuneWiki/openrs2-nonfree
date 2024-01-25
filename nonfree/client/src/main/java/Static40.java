import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "Lclient!gv;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "Z")
	public static boolean aBoolean28;

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_6 = new Class83(8);

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
	public static int anInt740 = -50;

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[JI[II)V")
	public static void method669(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg0) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) long local25 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg3; local61 < arg0; local61++) {
			if (arg1[local61] < local25 + (long) (local61 & local59)) {
				@Pc(79) long local79 = arg1[local61];
				arg1[local61] = arg1[local21];
				arg1[local21] = local79;
				@Pc(93) int local93 = arg2[local61];
				arg2[local61] = arg2[local21];
				arg2[local21++] = local93;
			}
		}
		arg1[arg0] = arg1[local21];
		arg1[local21] = local25;
		arg2[arg0] = arg2[local21];
		arg2[local21] = local39;
		method669(local21 - 1, arg1, arg2, arg3);
		method669(arg0, arg1, arg2, local21 + 1);
	}
}
