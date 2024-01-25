import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
	public static int anInt9414;

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString94;

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_170 = new Class319(59, -1);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "([Lclient!ir;II)V")
	public static void method7786(@OriginalArg(0) Class20_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class20_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8787;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8787 > local27 + (local29 & 0x1)) {
				@Pc(44) Class20_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7786(arg0, arg1, local10 - 1);
		method7786(arg0, local10 + 1, arg2);
	}
}
