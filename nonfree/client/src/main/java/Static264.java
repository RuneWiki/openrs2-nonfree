import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Lclient!la;")
	public static Class208 aClass208_59;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "Lclient!fs;")
	public static Class134 aClass134_25;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "S")
	public static short aShort56 = 32767;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	public static int anInt4559 = 765;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZI)Z")
	public static boolean method3873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static135.method1945(arg1, arg0) || Static395.method5775(arg1, arg0);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method3874(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static463.anInt7895; local12++) {
			if (arg0.equalsIgnoreCase(Static444.aStringArray54[local12])) {
				return local12;
			}
		}
		if (false) {
			aClass208_59 = null;
		}
		return -1;
	}
}
