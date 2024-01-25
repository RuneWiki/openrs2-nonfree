import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
	public static int anInt5212 = 0;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
	public static int anInt5214 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I")
	public static int method4395(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
