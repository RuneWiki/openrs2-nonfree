import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public static void method5853() {
		Static189.aBoolean270 = true;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([Lclient!vv;II)V")
	public static void method5854(@OriginalArg(0) Class11_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class11_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8899;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8899 > local27 + (local29 & 0x1)) {
				@Pc(44) Class11_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5854(arg0, arg1, local10 - 1);
		method5854(arg0, local10 + 1, arg2);
	}
}
