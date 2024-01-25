import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	public static int anInt7959;

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
	public static int anInt7966;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	public static int anInt7963 = 0;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
	public static int anInt7964 = 0;

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
	public static int anInt7967 = -1;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(CI)Z")
	public static boolean method7021(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static141.method2642(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static440.aCharArray7;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(38) char[] local38 = Static391.aCharArray6;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (arg0 == local46) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIII)V")
	public static void method7025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = Static286.aClass1_Sub15_Sub1_1.anInt7042 * arg0 >> 8;
		if (arg2 == -1 && !Static410.aBoolean568) {
			Static70.method1697();
		} else if (arg2 != -1 && (arg2 != Static261.anInt5068 || !Static344.method5746()) && local18 != 0 && !Static410.aBoolean568) {
			Static66.method1654(Static521.aClass69_96, arg1, local18, arg2);
		}
		Static261.anInt5068 = arg2;
	}
}
