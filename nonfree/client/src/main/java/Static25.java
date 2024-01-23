import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "Lclient!ai;")
	public static Class7 aClass7_6;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "Lclient!fi;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "Lclient!s;")
	public static Class88 aClass88_2;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!kh;")
	private static Class60 aClass60_193 = Static200.method3116("Loading interfaces )2 ");

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_190 = aClass60_193;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_192 = Static200.method3116("Malformed login packet)3");

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_191 = aClass60_192;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!ff;")
	public static Class33 aClass33_2 = new Class33(4096);

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "[I")
	public static int[] anIntArray98 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
	public static int anInt585 = 0;

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "Lclient!kh;")
	public static Class60 aClass60_194 = Static200.method3116("gelb:");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!kh;III[S)V")
	public static void method426(@OriginalArg(0) Class60[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(15) int local15 = arg1;
		@Pc(21) int local21 = (arg2 + arg1) / 2;
		@Pc(25) Class60 local25 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local25;
		@Pc(39) short local39 = arg3[local21];
		arg3[local21] = arg3[arg2];
		arg3[arg2] = local39;
		for (@Pc(51) int local51 = arg1; local51 < arg2; local51++) {
			if (local25 == null || arg0[local51] != null && arg0[local51].method1821(local25) < (local51 & 0x1)) {
				@Pc(77) Class60 local77 = arg0[local51];
				arg0[local51] = arg0[local15];
				arg0[local15] = local77;
				@Pc(91) short local91 = arg3[local51];
				arg3[local51] = arg3[local15];
				arg3[local15++] = local91;
			}
		}
		arg0[arg2] = arg0[local15];
		arg0[local15] = local25;
		arg3[arg2] = arg3[local15];
		arg3[local15] = local39;
		method426(arg0, arg1, local15 - 1, arg3);
		method426(arg0, local15 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!vg;Lclient!ai;Lclient!ai;)V")
	public static void method428(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2) {
		Static47.aClass7_10 = arg1;
		Static28.aClass7_25 = arg2;
		Static44.anInterface4_1 = arg0;
	}
}
