import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public static int anInt6574;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	public static int anInt6575;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!dfa;")
	public static Class54 aClass54_5;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!pfa;")
	public static final Class253 aClass253_23 = new Class253(8);

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public static int anInt6573 = 0;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
	public static final int[] anIntArray370 = new int[6];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I")
	public static int method5393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class344.anIntArray578[arg0 * 8192 / arg3] >> 1;
		return (arg2 * local21 >> 16) + (arg1 * (65536 - local21) >> 16);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([Lclient!rr;II)V")
	public static void method5394(@OriginalArg(0) Class15_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class15_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10304;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10304 > local27 + (local29 & 0x1)) {
				@Pc(44) Class15_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5394(arg0, arg1, local10 - 1);
		method5394(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBZ)V")
	public static void method5396(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class8_Sub18 local8 = Static211.method4038(arg1, arg0);
		if (local8 != null) {
			local8.method8640();
		}
	}
}
