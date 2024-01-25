import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static351 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray111;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "J")
	public static final long aLong159 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
	public static int method5219(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lclient!ega;")
	public static Class94 method5220() {
		return new Class94(1, false);
	}
}
