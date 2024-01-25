import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_261 = new Class160(80, -2);

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_13 = new Class162("", 13);

	@OriginalMember(owner = "client!un", name = "g", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_262 = new Class160(5, 28);

	@OriginalMember(owner = "client!un", name = "f", descriptor = "[I")
	public static final int[] anIntArray554 = new int[4];

	@OriginalMember(owner = "client!un", name = "d", descriptor = "[B")
	public static byte[] aByteArray106 = null;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([Lclient!haa;II)V")
	public static void method8759(@OriginalArg(0) Class4_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub3 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt11177;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt11177 > local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub3 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method8759(arg0, arg1, local10 - 1);
		method8759(arg0, local10 + 1, arg2);
	}
}
