import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!ni;")
	public static Class223 aClass223_90;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "Lclient!ni;")
	public static Class223 aClass223_91;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_86 = new Class185(15, 8);

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
	public static int method6494(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBI)Z")
	public static boolean method6495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
