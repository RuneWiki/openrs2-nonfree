import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "Lclient!ls;")
	public static Class6_Sub5_Sub3 aClass6_Sub5_Sub3_8;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
	public static int anInt6341;

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
	public static int anInt6347;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "[B")
	public static final byte[] aByteArray80 = new byte[520];

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "[I")
	public static final int[] anIntArray555 = new int[5];

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_42 = new Class88();

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IFFFI)F")
	public static float method5307(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(7) float[] local7 = Static231.aFloatArrayArray5[arg3];
		return local7[1] * arg1 + local7[0] * arg2 + arg0 * local7[2];
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5308(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
