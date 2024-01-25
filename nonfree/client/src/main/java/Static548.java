import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static548 {

	@OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
	public static int anInt8645;

	@OriginalMember(owner = "client!rga", name = "p", descriptor = "Lclient!iga;")
	public static Class176 aClass176_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!rga", name = "q", descriptor = "Ljava/lang/Class;")
	private static Class aClass47;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7659(@OriginalArg(1) String arg0) {
		return Static255.method3619(aClass47 == null ? (aClass47 = Class2_Sub49.a("vb")) : aClass47, arg0);
	}
}
