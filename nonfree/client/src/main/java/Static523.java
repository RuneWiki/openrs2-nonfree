import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt7894;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)Z")
	public static boolean method6290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(13) Class178 local13 = Static347.aClass122_4.method2770(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local13.method3705(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
	public static int method6293(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
	public static void method6295(@OriginalArg(0) int arg0) {
		Static417.anInt7371 = arg0;
		Static95.aClass207_6.method4392();
	}
}
