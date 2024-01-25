import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
	public static int anInt5506;

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)I")
	public static int method4738(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIBII)V")
	public static void method4741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static458.anInt8431;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static138.anInt3391 = arg0;
			Static72.anInt1758 = arg1;
			Static527.anInt10839 = arg3;
			Static458.anInt8431 = 2;
			Static72.anInt1756 = arg2;
		} else if (local5 == 2) {
			if (Static72.anInt1756 < arg2) {
				Static72.anInt1756 = arg2;
			}
			if (arg1 < Static72.anInt1758) {
				Static72.anInt1758 = arg1;
			}
			if (arg3 < Static527.anInt10839) {
				Static527.anInt10839 = arg3;
			}
			if (arg0 > Static138.anInt3391) {
				Static138.anInt3391 = arg0;
			}
		}
	}
}
