import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt7388;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static int anInt7389;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[F")
	public static final float[] aFloatArray61 = new float[4];

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_152 = new Class298(53, -1);

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
	public static final int[] anIntArray577 = new int[3];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([Lclient!gfa;II)V")
	public static void method6270(@OriginalArg(0) Class9_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class9_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8976;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8976 > local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6270(arg0, arg1, local10 - 1);
		method6270(arg0, local10 + 1, arg2);
	}
}
