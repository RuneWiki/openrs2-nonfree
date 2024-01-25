import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "F")
	public static float aFloat219;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!ei;")
	public static Class83 aClass83_6;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	public static final int anInt5129 = 1337;

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString52 = "";

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
	public static void method4334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg1) {
			Static321.method5153(arg0, arg1, Static352.anIntArrayArray51[arg3], arg2);
		} else {
			Static321.method5153(arg0, arg2, Static352.anIntArrayArray51[arg3], arg1);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
	public static boolean method4336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BIII)I")
	public static int method4338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg2;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static200.method3291(local17, local7);
		@Pc(35) int local35 = Static200.method3291(local17, local7 + 1);
		@Pc(42) int local42 = Static200.method3291(local17 + 1, local7);
		@Pc(51) int local51 = Static200.method3291(local17 + 1, local7 - -1);
		@Pc(67) int local67 = Static202.method3321(local28, local13, arg0, local35);
		@Pc(76) int local76 = Static202.method3321(local42, local13, arg0, local51);
		return Static202.method3321(local67, local23, arg0, local76);
	}
}
