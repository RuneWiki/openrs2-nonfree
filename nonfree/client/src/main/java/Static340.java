import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lclient!hca;")
	public static Class134 aClass134_3;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_145 = new Class362(31, 4);

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "[I")
	public static final int[] anIntArray338 = new int[500];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lclient!ub;II)V")
	public static void method5550(@OriginalArg(0) Class1_Sub4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class1_Sub4 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9938;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9938 < local27 + (local29 & 0x1)) {
				@Pc(44) Class1_Sub4 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5550(arg0, arg1, local10 - 1);
		method5550(arg0, local10 + 1, arg2);
	}
}
