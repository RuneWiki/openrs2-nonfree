import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_51 = new Class36(27, 3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBI)Z")
	public static boolean method1585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method1589(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static451.method5804(arg0);
	}
}
