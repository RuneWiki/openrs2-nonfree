import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static562 {

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "Lclient!fn;")
	public static Class2_Sub3_Sub2 aClass2_Sub3_Sub2_6;

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
	public static int anInt9207;

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "Lclient!la;")
	public static Class37 aClass37_19;

	@OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
	public static int anInt9209;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_29 = new Class225(1, 2);

	@OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
	public static int anInt9208 = 0;

	@OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
	public static int[] anIntArray596 = new int[1];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
	public static boolean method7350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static433.aByteArrayArrayArray15[1].length && Static433.aByteArrayArrayArray15[1][arg0].length > arg1) {
			return (Static433.aByteArrayArrayArray15[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
