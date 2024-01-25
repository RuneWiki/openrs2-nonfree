import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array12;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_90 = new Class185(35, 5);

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public static int anInt8106 = 0;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public static void method6817() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static306.anInt6176; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static108.anInt2930; local18++) {
				if (Static446.method6806(local14, local7, Static26.aClass186ArrayArrayArray1, local18, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIBIIIIII)Z")
	public static boolean method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static136.method2732(arg2, arg8, arg3)) {
			return false;
		}
		@Pc(17) int local17 = Static212.anIntArray204[1];
		@Pc(21) int local21 = Static212.anIntArray204[2];
		@Pc(25) int local25 = Static212.anIntArray204[0];
		if (!Static136.method2732(arg6, arg7, arg0)) {
			return false;
		}
		@Pc(42) int local42 = Static212.anIntArray204[1];
		@Pc(46) int local46 = Static212.anIntArray204[2];
		@Pc(50) int local50 = Static212.anIntArray204[0];
		if (Static136.method2732(arg4, arg1, arg5)) {
			@Pc(62) int local62 = Static212.anIntArray204[1];
			@Pc(66) int local66 = Static212.anIntArray204[0];
			@Pc(70) int local70 = Static212.anIntArray204[2];
			return Static470.method7000(local50, local25, local46, local62, local17, local66, local42, local21, local70);
		} else {
			return false;
		}
	}
}
