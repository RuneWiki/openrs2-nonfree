import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array16;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public static int anInt5903 = 0;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)Z")
	public static boolean method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([Lclient!ov;II)V")
	public static void method5256(@OriginalArg(0) Class4_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10234;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10234 < local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5256(arg0, arg1, local10 - 1);
		method5256(arg0, local10 + 1, arg2);
	}
}
