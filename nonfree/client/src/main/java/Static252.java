import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "J")
	public static long aLong136 = 0L;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
	public static int anInt4971 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)Z")
	public static boolean method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V")
	public static void method4229() {
		if (Static326.anInt5812 <= 0) {
			Static221.aString45 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static192.aStringArray13.length; local18++) {
			if (Static192.aStringArray13[local18].startsWith("--> ")) {
				local16++;
				if (Static326.anInt5812 == local16) {
					Static221.aString45 = Static192.aStringArray13[local18].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Z")
	public static boolean method4230() {
		return Static469.aBoolean550;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIIII)V")
	public static void method4233(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static474.method3731(arg1)) {
			Static245.method4151(arg2, Static458.aClass115ArrayArray2[arg1], arg3, arg0, -1);
		}
	}
}
