import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!dr;")
	public static Class73 aClass73_98;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
	public static int anInt5088 = 0;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_57 = new Class136(8);

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Z")
	public static boolean aBoolean359 = true;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
	public static boolean method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static354.method6852(arg1, arg0) || Static516.method7139(arg1, arg0) || Static112.method1995(arg1, arg0);
	}
}
