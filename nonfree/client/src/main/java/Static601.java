import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static601 {

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public static int anInt10083;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Lclient!vu;")
	public static final Class368 aClass368_13 = new Class368();

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public static int anInt10082 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIII)Z")
	public static boolean method8613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static305.aByteArrayArrayArray18[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static305.aByteArrayArrayArray18[arg2][arg3][arg0] & 0x10) == 0) {
			return arg1 == Static329.method2411(arg3, arg0, arg2);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method8614() {
		Static252.anInt4597 = 0;
		Static339.anInt5748 = 0;
		Static522.anInt8988 = 0;
		Static270.anInt4865 = 0;
	}
}
