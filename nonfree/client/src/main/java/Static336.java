import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mfa", name = "s", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
	public static int anInt6621 = 0;

	@OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_3 = new Class138(0, 1);

	@OriginalMember(owner = "client!mfa", name = "t", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_85 = new Class71(52, 1);

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[F)[F")
	public static float[] method5428(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static649.method5535(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
