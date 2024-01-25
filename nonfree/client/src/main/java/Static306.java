import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "[Lclient!uq;")
	public static Class294[] aClass294Array1;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Z")
	public static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)Z")
	public static boolean method5089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
