import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
	public static int anInt6666;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
	public static int anInt6678;

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
	public static int anInt6682;

	@OriginalMember(owner = "client!uk", name = "F", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_247 = new Class137(76, 8);

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
	public static int anInt6680 = -1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
	public static void method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static159.aClass82ArrayArrayArray2[0][arg1][arg2] != null && Static159.aClass82ArrayArrayArray2[0][arg1][arg2].aClass82_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static159.aClass82ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class82 local46 = Static159.aClass82ArrayArrayArray2[local22][arg1][arg2] = new Class82(local22, arg1, arg2);
				if (local20) {
					local46.aByte17++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ic;BLclient!ic;Lclient!ic;Lclient!ic;)V")
	public static void method5130(@OriginalArg(0) Class113 arg0, @OriginalArg(2) Class113 arg1, @OriginalArg(3) Class113 arg2, @OriginalArg(4) Class113 arg3) {
		Static142.aClass113_47 = arg1;
		Static205.aClass113_68 = arg2;
		Static441.aClass113_132 = arg0;
		Static270.aClass113_83 = arg3;
		Static369.aClass250ArrayArray5 = new Class250[Static142.aClass113_47.method2272()][];
		Static332.aBooleanArray26 = new boolean[Static142.aClass113_47.method2272()];
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(ILclient!qa;)V")
	public static void method5131(@OriginalArg(1) Class128 arg0) {
		if (Static411.aBoolean546) {
			Static117.method1607(arg0);
		} else {
			Static100.method1441(arg0);
		}
	}
}
