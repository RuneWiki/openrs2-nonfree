import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static635 {

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "Lclient!wh;")
	public static Class386 aClass386_2;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "Lclient!aga;")
	public static final Class10 aClass10_3 = new Class10();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)I")
	public static int method8846(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
