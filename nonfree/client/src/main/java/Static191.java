import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "Lclient!ln;")
	public static final Class203 aClass203_2 = new Class203();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;Z)V")
	public static void method3505(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		Static506.aString86 = arg2;
		Static344.aBoolean410 = arg3;
		Static492.aString90 = arg0;
		if (!arg3) {
			Static252.anInt4525 = -1;
		}
		Static111.aBoolean188 = arg1;
		if (!Static344.aBoolean410 && (Static506.aString86.equals("") || Static492.aString90.equals(""))) {
			Static425.method6144(3);
			return;
		}
		if (Static46.anInt1071 != 1) {
			Static425.anInt6802 = -1;
			Static215.anInt4111 = 0;
		}
		Static286.aBoolean362 = false;
		Static425.method6144(-3);
		Static260.anInt4398 = 1;
		Static91.anInt1765 = 0;
		Static289.anInt4927 = 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ha;ZILclient!or;I)V")
	public static void method3507(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class260 arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 7; local3 >= 0; local3--) {
			for (@Pc(7) int local7 = 127; local7 >= 0; local7--) {
				@Pc(25) int local25 = (arg2 & 0x3F) << 10 | (local3 & 0x7) << 7 | local7 & 0x7F;
				Static164.method2975(true, false);
				@Pc(33) int local33 = Static363.anIntArray518[local25];
				Static211.method7571(true, false);
				arg1.aa((local7 * arg3.anInt6963 >> 7) + arg0, arg4 + ((-local3 + 7) * arg3.anInt6971 >> 3), (arg3.anInt6963 >> 7) + 1, (arg3.anInt6971 >> 3) - -1, local33, 0);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I")
	public static int method3508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(17) int local17 = arg0 - 1 & arg1;
		@Pc(21) int local21 = arg2 / arg0;
		@Pc(27) int local27 = arg0 - 1 & arg2;
		@Pc(32) int local32 = Static388.method5517(local7, local21);
		@Pc(39) int local39 = Static388.method5517(local7 + 1, local21);
		@Pc(46) int local46 = Static388.method5517(local7, local21 + 1);
		@Pc(55) int local55 = Static388.method5517(local7 + 1, local21 + 1);
		@Pc(64) int local64 = Static666.method9183(local17, local32, arg0, local39);
		@Pc(71) int local71 = Static666.method9183(local17, local46, arg0, local55);
		return Static666.method9183(local27, local64, arg0, local71);
	}
}
