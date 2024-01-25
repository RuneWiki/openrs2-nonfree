import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!mea;")
	public static Class201 aClass201_8;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[4];

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
	public static int anInt4003 = 1;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
	public static int anInt4009 = 0;

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "[I")
	public static final int[] anIntArray169 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(B)I")
	public static int method3251() {
		return Static515.method6939(false);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3255(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([Lclient!pn;II)V")
	public static void method3256(@OriginalArg(0) Class25_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class25_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8478;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8478 < local27 + (local29 & 0x1)) {
				@Pc(44) Class25_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method3256(arg0, arg1, local10 - 1);
		method3256(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!pca;IIB)V")
	public static void method3258(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static160.anInt3599 = arg2;
		Static24.anInt233 = arg1;
		Static187.aClass251_5 = arg0;
	}
}
