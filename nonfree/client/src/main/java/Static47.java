import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public static int anInt676;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!lt;")
	public static final Class1_Sub30 aClass1_Sub30_1 = new Class1_Sub30(0, 0);

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "[Lclient!tp;")
	public static final Class1_Sub44[] aClass1_Sub44Array1 = new Class1_Sub44[1024];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Z")
	public static boolean method629(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
