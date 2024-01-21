import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
	public static int[] anIntArray569;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!wh;")
	public static Class89 aClass89_5;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
	public static int[] anIntArray570;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	public static int anInt3925;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1348 = Static146.method2172("Stufe)2");

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public static int anInt3920 = 0;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	public static int anInt3921 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method2695() {
		anIntArray569 = null;
		aClass77_1348 = null;
		anIntArray570 = null;
		aClass89_5 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
	public static boolean method2696(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
