import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pj", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!pj", name = "X", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_31 = new Class142();

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_269 = new Class12(89, 8);

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
	public static int anInt5194 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IFFFI)F")
	public static float method4218(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(12) float[] local12 = Static239.aFloatArrayArray2[arg0];
		return local12[0] * arg3 + arg1 * local12[1] + arg2 * local12[2];
	}
}
