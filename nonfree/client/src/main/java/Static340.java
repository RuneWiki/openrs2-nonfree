import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array48;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public static int anInt6628 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([BB)[B")
	public static byte[] method5549(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static369.method2582(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
