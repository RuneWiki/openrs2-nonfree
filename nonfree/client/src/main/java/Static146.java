import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	public static int anInt3163;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
	public static int anInt3164;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
	public static int anInt3165;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "Lclient!o;")
	public static Class86 aClass86_7;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!vb;")
	public static Class120 aClass120_17 = new Class120();

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Lclient!rg;")
	public static Class102 aClass102_1 = new Class102();

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	public static int method2396(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
