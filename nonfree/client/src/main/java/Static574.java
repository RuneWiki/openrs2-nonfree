import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static574 {

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "Lclient!cd;")
	public static Class53 aClass53_13;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_111 = new Class241(29, 4);

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
	public static int anInt9192 = 0;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZI)Z")
	public static boolean method8021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
