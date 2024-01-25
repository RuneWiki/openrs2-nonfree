import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "J")
	public static long aLong247;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public static int anInt7721 = -1;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public static int anInt7722 = 0;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!of;")
	public static final Class174 aClass174_215 = new Class174("K", "T", "K", "K");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)Z")
	public static boolean method6243(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}
