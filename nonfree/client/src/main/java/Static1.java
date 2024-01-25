import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "D", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	public static int anInt38 = 0;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I")
	public static int method35() {
		@Pc(12) Class207 local12 = Static236.aClass207_55;
		synchronized (Static236.aClass207_55) {
			return Static236.aClass207_55.method4389();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!r;)V")
	public static void method36(@OriginalArg(1) Class78 arg0) {
		Static442.aClass96_12 = Static387.method5580(arg0, Static456.anInt7982, true);
		Static439.aClass352_23 = Static333.method4906(arg0, Static456.anInt7982);
		Static339.aClass96_9 = Static387.method5580(arg0, Static414.anInt7794, true);
		Static552.aClass352_20 = Static333.method4906(arg0, Static414.anInt7794);
		Static62.aClass96_4 = Static387.method5580(arg0, Static377.anInt6738, true);
		Static88.aClass352_7 = Static333.method4906(arg0, Static377.anInt6738);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lclient!ch;")
	public static Class41 method37(@OriginalArg(0) int arg0) {
		@Pc(14) Class41[] local14 = Static538.method6120();
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class41 local22 = local14[local16];
			if (arg0 == local22.anInt1145) {
				return local22;
			}
		}
		return null;
	}
}
