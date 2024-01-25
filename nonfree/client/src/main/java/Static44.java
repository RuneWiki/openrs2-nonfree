import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
	public static int anInt1118;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_2 = new Class181(1, 19);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
	public static boolean method1012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static157.method2423(arg0, arg1) | (arg0 & 0x60000) != 0 || Static86.method1721(arg1, arg0);
	}
}
