import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "F")
	public static float aFloat215;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array25;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_48 = new Class201(9, 0, 4, 1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method7943(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		if (local13 == 0) {
			return new byte[0];
		}
		@Pc(27) int local27 = local13 + 3 & 0xFFFFFFFC;
		@Pc(33) int local33 = local27 / 4 * 3;
		if (local27 - 2 >= local13 || Static31.method780(arg0.charAt(local27 - 2)) == -1) {
			local33 -= 2;
		} else if (local13 <= local27 - 1 || Static31.method780(arg0.charAt(local27 - 1)) == -1) {
			local33--;
		}
		@Pc(73) byte[] local73 = new byte[local33];
		Static561.method5041(0, local73, arg0);
		return local73;
	}
}
