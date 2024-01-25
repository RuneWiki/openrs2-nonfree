import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static int anInt629;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Lclient!fia;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BB)[B")
	public static byte[] method651(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(13) byte[] local13 = new byte[arg0];
		Static691.method82(arg1, 0, local13, 0, arg0);
		return local13;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	public static void method652(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static590.aBooleanArray24[arg0]) {
			Static132.aClass310_32.method7781(arg0);
			Static339.aClass299ArrayArray1[arg0] = null;
			Static359.aClass299ArrayArray2[arg0] = null;
			Static590.aBooleanArray24[arg0] = false;
		}
	}
}
