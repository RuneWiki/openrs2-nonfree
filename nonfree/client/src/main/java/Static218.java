import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static218 {

	@OriginalMember(owner = "client!hn", name = "N", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_44 = new Class94(1, -1);

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)I")
	public static int method4234(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
