import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
	public static int anInt123;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "([Lclient!rga;II)V")
	public static void method97(@OriginalArg(0) Class8_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class8_Sub3 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9367;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9367 > local27 + (local29 & 0x1)) {
				@Pc(44) Class8_Sub3 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method97(arg0, arg1, local10 - 1);
		method97(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIII)I")
	public static int method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(29) int local29 = (arg1 * (arg0 & 0xFF00) & 0xFF0000 | arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(34) int local34 = 255 - arg1;
		return (((arg2 & 0xFF00FF) * local34 & 0xFF00FF00 | (arg2 & 0xFF00) * local34 & 0xFF0000) >>> 8) + local29;
	}
}
