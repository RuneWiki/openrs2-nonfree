import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
	public static int anInt9142;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "[I")
	public static final int[] anIntArray511 = new int[14];

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString87 = null;

	@OriginalMember(owner = "client!tda", name = "h", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_62 = new Class114();

	@OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
	public static int anInt9143 = 0;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method7749(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) Class374 local7 = Static122.aClass374Array3[99];
		for (@Pc(9) int local9 = 99; local9 > 0; local9--) {
			Static122.aClass374Array3[local9] = Static122.aClass374Array3[local9 - 1];
		}
		if (local7 == null) {
			local7 = new Class374(arg7, arg2, arg5, arg4, arg0, arg3, arg6, arg1);
		} else {
			local7.method8645(arg1, arg3, arg7, arg4, arg2, arg5, arg0, arg6);
		}
		Static401.anInt7137 = Static370.anInt8567;
		Static406.anInt7204++;
		Static122.aClass374Array3[0] = local7;
	}
}
