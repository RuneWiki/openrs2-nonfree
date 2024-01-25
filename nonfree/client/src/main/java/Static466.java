import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static466 {

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "Lclient!pu;")
	public static Class270 aClass270_99;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
	public static int[] anIntArray618;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "[Lclient!qk;")
	public static final Class1_Sub42[] aClass1_Sub42Array1 = new Class1_Sub42[1024];

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_7 = new Class308("WTRC", 1);

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method6425() {
		return Static554.aBoolean708 || Static446.aClass1_Sub51_5 == null ? "" : Static446.aClass1_Sub51_5.aString99;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)Z")
	public static boolean method6426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static455.aByteArrayArrayArray17[1].length > arg1 && arg0 < Static455.aByteArrayArrayArray17[1][arg1].length) {
			return (Static455.aByteArrayArrayArray17[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
