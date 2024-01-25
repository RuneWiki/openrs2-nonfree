import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_176 = new Class81(63, -2);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public static int anInt6998 = 0;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
	public static boolean aBoolean595 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method5477(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(32) int local32 = 2;
		for (@Pc(36) int local36 = arg0 / 10; local36 != 0; local36 /= 10) {
			local32++;
		}
		@Pc(51) char[] local51 = new char[local32];
		local51[0] = '+';
		for (@Pc(59) int local59 = local32 - 1; local59 > 0; local59--) {
			@Pc(63) int local63 = arg0;
			arg0 /= 10;
			@Pc(73) int local73 = local63 - arg0 * 10;
			if (local73 >= 10) {
				local51[local59] = (char) (local73 + 87);
			} else {
				local51[local59] = (char) (local73 + 48);
			}
		}
		return new String(local51);
	}
}
