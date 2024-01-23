import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Lclient!nn;")
	public static Class119 aClass119_8;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString184 = "Loaded wordpack";

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	public static int anInt5456 = 0;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	public static int anInt5463 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method4343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass181_1 != null && local7.aClass181_1.aLong206 == arg3) {
			return true;
		} else if (local7.aClass35_1 != null && local7.aClass35_1.aLong48 == arg3) {
			return true;
		} else if (local7.aClass67_1 != null && local7.aClass67_1.aLong80 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2694; local46++) {
				if (local7.aClass99Array19[local46].aLong117 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
