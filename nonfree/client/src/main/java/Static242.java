import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!io", name = "s", descriptor = "I")
	public static int anInt5467;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Z")
	public static boolean aBoolean481;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!tn;)Lclient!jv;")
	public static Class169 method4625(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method8401();
		@Pc(14) Class117 local14 = Static505.method7370()[arg0.method8401()];
		@Pc(21) Class178 local21 = Static324.method5445()[arg0.method8401()];
		@Pc(25) int local25 = arg0.method8444();
		@Pc(29) int local29 = arg0.method8444();
		@Pc(33) int local33 = arg0.method8414();
		@Pc(37) int local37 = arg0.method8414();
		@Pc(41) int local41 = arg0.method8402();
		@Pc(50) int local50 = arg0.method8402();
		@Pc(54) int local54 = arg0.method8402();
		@Pc(63) boolean local63 = arg0.method8401() == 1;
		return new Class169(local7, local14, local21, local25, local29, local33, local37, local41, local50, local54, local63);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([Lclient!mb;II)V")
	public static void method4626(@OriginalArg(0) Class2_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class2_Sub3 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10423;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10423 < local27 + (local29 & 0x1)) {
				@Pc(44) Class2_Sub3 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4626(arg0, arg1, local10 - 1);
		method4626(arg0, local10 + 1, arg2);
	}
}
