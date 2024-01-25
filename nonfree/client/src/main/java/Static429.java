import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
	public static int anInt7422;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
	public static int anInt7408 = 4;

	@OriginalMember(owner = "client!pia", name = "l", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_83 = new Class46(37, 0);

	@OriginalMember(owner = "client!pia", name = "r", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_84 = new Class46(68, 2);

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "([Lclient!ov;II)V")
	public static void method6565(@OriginalArg(0) Class4_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			if (arg0[local29].anInt10234 > local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6565(arg0, arg1, local10 - 1);
		method6565(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6567(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}
}
