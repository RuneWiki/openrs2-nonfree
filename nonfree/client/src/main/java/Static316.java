import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pt", name = "H", descriptor = "Lclient!lm;")
	public static Class153 aClass153_1;

	@OriginalMember(owner = "client!pt", name = "S", descriptor = "I")
	public static int anInt5491;

	@OriginalMember(owner = "client!pt", name = "M", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_89 = new Class96("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!pt", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!pt", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIIILclient!ds;IILclient!oa;Lclient!ea;Lclient!tn;Ljava/lang/String;)V")
	public static void method4364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class62 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4 arg7, @OriginalArg(9) Class34 arg8, @OriginalArg(10) Class229 arg9, @OriginalArg(11) String arg10) {
		@Pc(16) int local16;
		if (Static57.anInt883 == 4) {
			local16 = (int) Static147.aFloat59 & 0x3FFF;
		} else {
			local16 = (int) Static147.aFloat59 + Static388.anInt7297 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg9.anInt6905 / 2, arg9.anInt6895 / 2) + 10;
		@Pc(44) int local44 = arg2 * arg2 + arg6 * arg6;
		if (local35 * local35 < local44) {
			return;
		}
		@Pc(54) int local54 = Class262.anIntArray575[local16];
		@Pc(58) int local58 = Class262.anIntArray576[local16];
		if (Static57.anInt883 != 4) {
			local58 = local58 * 256 / (Static25.anInt430 + 256);
			local54 = local54 * 256 / (Static25.anInt430 + 256);
		}
		@Pc(94) int local94 = arg6 * local54 + local58 * arg2 >> 15;
		@Pc(105) int local105 = arg6 * local58 - local54 * arg2 >> 15;
		@Pc(112) int local112 = arg4.method1153(null, arg10, 100);
		@Pc(120) int local120 = arg4.method1156(arg10, null);
		@Pc(126) int local126 = local94 - local112 / 2;
		if (local126 >= -arg9.anInt6905 && arg9.anInt6905 >= local126 && -arg9.anInt6895 <= local105 && local105 <= arg9.anInt6895) {
			arg7.method5843(null, local112, 50, null, 0, arg1, arg8, arg10, arg5, local126 + arg1 + arg9.anInt6905 / 2, 0, arg3, arg9.anInt6895 / 2 + arg5 - local120 - local105 - arg0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)V")
	public static void method4366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0 != Static410.anInt7198) {
			Static400.anIntArray525 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static400.anIntArray525[local17] = (local17 << 12) / arg0;
			}
			Static410.anInt7198 = arg0;
			Static302.anInt5027 = arg0 * 32;
			Static301.anInt5026 = arg0 - 1;
		}
		if (Static214.anInt6457 == arg1) {
			return;
		}
		if (Static410.anInt7198 == arg1) {
			Static285.anIntArray17 = Static400.anIntArray525;
		} else {
			Static285.anIntArray17 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static285.anIntArray17[local17] = (local17 << 12) / arg1;
			}
		}
		Static214.anInt6457 = arg1;
		Static421.anInt7373 = arg1 - 1;
	}
}
