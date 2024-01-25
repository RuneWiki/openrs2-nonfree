import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!li", name = "J", descriptor = "[Lclient!tk;")
	public static Class233[] aClass233Array1;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!li", name = "A", descriptor = "Lclient!di;")
	public static final Class54 aClass54_61 = new Class54(29, 4);

	@OriginalMember(owner = "client!li", name = "B", descriptor = "Lclient!ht;")
	public static final Class112 aClass112_8 = new Class112();

	@OriginalMember(owner = "client!li", name = "F", descriptor = "I")
	public static int anInt4314 = 0;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "Lclient!di;")
	public static final Class54 aClass54_62 = new Class54(20, -1);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3483(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
