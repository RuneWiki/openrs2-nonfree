import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "B")
	public static byte aByte79;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
	public static int anInt5206;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lclient!ig;II)V")
	public static void method4393(@OriginalArg(0) Class13_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class13_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10091;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10091 > local27 + (local29 & 0x1)) {
				@Pc(44) Class13_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4393(arg0, arg1, local10 - 1);
		method4393(arg0, local10 + 1, arg2);
	}
}
