import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static281 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_94 = new Class319(57, 3);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Z")
	public static boolean method4326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static77.method6754(arg1, arg0) || Static128.method2206(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static515.method7050(arg0, arg1);
		}
	}
}
