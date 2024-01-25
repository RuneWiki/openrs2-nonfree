import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "Lclient!nd;")
	public static Class238 aClass238_178;

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
	public static int anInt6681;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	public static int anInt6686;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "[I")
	public static final int[] anIntArray438 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IC)I")
	public static int method5733(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class16_Sub4.anIntArray292.length ? Class16_Sub4.anIntArray292[arg0] : -1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIB)I")
	public static int method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(28) int local28 = local13 * (arg1 & 0x7F) + (arg0 & 0x7F) * arg2 >> 7;
		@Pc(42) int local42 = (arg0 & 0x380) * arg2 + local13 * (arg1 & 0x380) >> 7;
		@Pc(61) int local61 = (arg0 & 0xFC00) * arg2 + local13 * (arg1 & 0xFC00) >> 7;
		return local61 & 0xFC00 | local42 & 0x380 | local28 & 0x7F;
	}
}
