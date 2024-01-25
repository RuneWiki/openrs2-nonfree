import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static429 {

	@OriginalMember(owner = "client!oia", name = "V", descriptor = "I")
	public static int anInt7378;

	@OriginalMember(owner = "client!oia", name = "R", descriptor = "Lclient!op;")
	public static final Class275 aClass275_13 = new Class275("", 18);

	@OriginalMember(owner = "client!oia", name = "cb", descriptor = "Z")
	public static boolean aBoolean549 = true;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IZ)I")
	public static int method6564(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
