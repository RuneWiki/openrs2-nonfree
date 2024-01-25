import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_4 = new Class46(33, 3);

	@OriginalMember(owner = "client!ap", name = "M", descriptor = "[S")
	public static final short[] aShortArray7 = new short[] { 12, 17, 49, 19, 9, 4, 22, 60 };

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ZII)Z")
	public static boolean method285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static305.aByteArrayArrayArray18[1].length > arg0 && Static305.aByteArrayArrayArray18[1][arg0].length > arg1) {
			return (Static305.aByteArrayArrayArray18[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
