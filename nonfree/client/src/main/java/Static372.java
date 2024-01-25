import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static372 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt5998;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt6000;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "Lclient!oi;")
	public static Class185 aClass185_98;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt5995 = 0;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "[I")
	public static int[] anIntArray452 = new int[2];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZILclient!hm;)Ljava/lang/String;")
	public static String method4834(@OriginalArg(1) int arg0, @OriginalArg(2) Class107 arg1) {
		if (!Static55.method767(arg1).method3035(arg0) && arg1.anObjectArray14 == null) {
			return null;
		} else if (arg1.aStringArray15 == null || arg0 >= arg1.aStringArray15.length || arg1.aStringArray15[arg0] == null || arg1.aStringArray15[arg0].trim().length() == 0) {
			return Static312.aBoolean465 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray15[arg0];
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Z")
	public static boolean method4835(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
	public static int method4836(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static442.anIntArray498[arg1 & 0x3] : 256;
	}
}
