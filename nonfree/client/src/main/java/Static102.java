import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[2];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([Lclient!rda;II)V")
	public static void method1576(@OriginalArg(0) Class4_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9798;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9798 < local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method1576(arg0, arg1, local10 - 1);
		method1576(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	public static void method1577() {
		@Pc(15) Class5_Sub1_Sub18 local15 = Static123.method1827(0L, 15);
		local15.method7444();
	}
}
