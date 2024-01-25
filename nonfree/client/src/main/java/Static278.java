import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static278 {

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static int anInt4621;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "[Lclient!ta;")
	public static Class41[] aClass41Array3;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_62 = new Class146(0, 0);

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	public static int anInt4618 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
	public static int method3677(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
