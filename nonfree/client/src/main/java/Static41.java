import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!hba;")
	public static final Class134 aClass134_1 = new Class134();

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_16 = new Class289(35, 7);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lclient!oq;II)V")
	public static void method907(@OriginalArg(0) Class2_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class2_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10007;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10007 < local27 + (local29 & 0x1)) {
				@Pc(44) Class2_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method907(arg0, arg1, local10 - 1);
		method907(arg0, local10 + 1, arg2);
	}
}
