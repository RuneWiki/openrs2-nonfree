import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!ug", name = "P", descriptor = "Lclient!ps;")
	public static Class262 aClass262_8;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "Lclient!uca;")
	public static Class327 aClass327_1;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_62 = new Class329(10, 2, 2, 0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V")
	public static void method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg0) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) long local29 = arg2[local23];
		arg2[local23] = arg2[arg1];
		arg2[arg1] = local29;
		@Pc(43) Object local43 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local43;
		@Pc(63) int local63 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg0; local65 < arg1; local65++) {
			if ((long) (local63 & local65) + local29 > arg2[local65]) {
				@Pc(82) long local82 = arg2[local65];
				arg2[local65] = arg2[local25];
				arg2[local25] = local82;
				@Pc(96) Object local96 = arg3[local65];
				arg3[local65] = arg3[local25];
				arg3[local25++] = local96;
			}
		}
		arg2[arg1] = arg2[local25];
		arg2[local25] = local29;
		arg3[arg1] = arg3[local25];
		arg3[local25] = local43;
		method7397(arg0, local25 - 1, arg2, arg3);
		method7397(local25 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)V")
	public static void method7399() {
		Static121.aClass342_49.method7693();
	}
}
