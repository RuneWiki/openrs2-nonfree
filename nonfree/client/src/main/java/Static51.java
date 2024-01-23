import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "[Lclient!nn;")
	public static Class13_Sub1[] aClass13_Sub1Array1 = new Class13_Sub1[0];

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public static int anInt1121 = 0;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt1122 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)I")
	public static int method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
