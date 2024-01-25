import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static49 {

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Lclient!fs;")
	public static Class76 aClass76_27;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_98 = new Class22(33, 0);

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString28 = null;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
	public static int anInt2346 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
	public static boolean method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static190.method2975(arg0, arg1) | (arg0 & 0x70000) != 0 || Static273.method3914(arg1, arg0);
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z")
	public static boolean method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
