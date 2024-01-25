import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!oja", name = "h", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_135 = new Class225(61, 2);

	@OriginalMember(owner = "client!oja", name = "k", descriptor = "Z")
	public static boolean aBoolean644 = false;

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "I")
	public static int anInt7470 = 0;

	@OriginalMember(owner = "client!oja", name = "j", descriptor = "Z")
	public static final boolean aBoolean645 = true;

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "([Lclient!tl;II)V")
	public static void method6646(@OriginalArg(0) Class4_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10233;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10233 > local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6646(arg0, arg1, local10 - 1);
		method6646(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(I[Ljava/lang/Object;I[II)V")
	public static void method6647(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(27) int local27 = (arg3 + arg1) / 2;
		@Pc(29) int local29 = arg3;
		@Pc(33) int local33 = arg2[local27];
		arg2[local27] = arg2[arg1];
		arg2[arg1] = local33;
		@Pc(47) Object local47 = arg0[local27];
		arg0[local27] = arg0[arg1];
		arg0[arg1] = local47;
		@Pc(67) int local67 = ~local33 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(69) int local69 = arg3; local69 < arg1; local69++) {
			if (local33 + (local69 & local67) > arg2[local69]) {
				@Pc(86) int local86 = arg2[local69];
				arg2[local69] = arg2[local29];
				arg2[local29] = local86;
				@Pc(100) Object local100 = arg0[local69];
				arg0[local69] = arg0[local29];
				arg0[local29++] = local100;
			}
		}
		arg2[arg1] = arg2[local29];
		arg2[local29] = local33;
		arg0[arg1] = arg0[local29];
		arg0[local29] = local47;
		method6647(arg0, local29 - 1, arg2, arg3);
		method6647(arg0, arg1, arg2, local29 + 1);
	}

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "(I)V")
	public static void method6649() {
		@Pc(10) Class221 local10 = Static87.method1292();
		@Pc(24) Class2_Sub33 local24 = Static592.method8154(Static113.aClass349_33, local10.aClass48_1);
		local24.aClass2_Sub20_Sub2_1.method8584(0);
		local10.method5173(local24);
	}
}
