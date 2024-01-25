import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!pl;")
	public static Class259 aClass259_166;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_160 = new Class286(11, 3);

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	public static int anInt9119 = 503;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public static int anInt9121 = -1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([Lclient!lo;II)V")
	public static void method7584(@OriginalArg(0) Class6_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class6_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8758;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8758 < local27 + (local29 & 0x1)) {
				@Pc(44) Class6_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7584(arg0, arg1, local10 - 1);
		method7584(arg0, local10 + 1, arg2);
	}
}
