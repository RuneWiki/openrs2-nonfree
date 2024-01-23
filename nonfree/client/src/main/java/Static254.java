import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "C")
	public static char aChar4;

	@OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
	public static int anInt4972;

	@OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
	public static int anInt4973;

	@OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
	public static int anInt4974;

	@OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
	public static int anInt4978;

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "Lclient!c;")
	public static Class17 aClass17_28 = new Class17();

	@OriginalMember(owner = "client!sk", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString169 = "glow2:";

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II[II[I)V")
	public static void method3929(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg0) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg2; local47++) {
			if (arg1[local47] > local21 + (local47 & 0x1)) {
				@Pc(68) int local68 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local68;
				@Pc(82) int local82 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local82;
			}
		}
		arg1[arg2] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg2] = arg3[local17];
		arg3[local17] = local35;
		method3929(arg0, arg1, local17 - 1, arg3);
		method3929(local17 + 1, arg1, arg2, arg3);
	}
}
