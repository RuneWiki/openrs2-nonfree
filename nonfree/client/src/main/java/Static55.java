import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt1302;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "Lclient!bo;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Lclient!f;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "[Lclient!iu;")
	public static final Class3_Sub3_Sub13[] aClass3_Sub3_Sub13Array1 = new Class3_Sub3_Sub13[14];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[II[[B[B[[B[I)I")
	public static int method1110(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg6[arg0];
		@Pc(13) int local13 = arg1[arg0] + local7;
		@Pc(17) int local17 = arg6[arg2];
		@Pc(28) int local28 = arg1[arg2] + local17;
		@Pc(30) int local30 = local7;
		if (local7 < local17) {
			local30 = local17;
		}
		@Pc(41) int local41 = local13;
		if (local13 > local28) {
			local41 = local28;
		}
		@Pc(56) int local56 = arg4[arg0] & 0xFF;
		if ((arg4[arg2] & 0xFF) < local56) {
			local56 = arg4[arg2] & 0xFF;
		}
		@Pc(73) byte[] local73 = arg3[arg0];
		@Pc(77) byte[] local77 = arg5[arg2];
		@Pc(81) int local81 = local30 - local7;
		@Pc(86) int local86 = local30 - local17;
		for (@Pc(88) int local88 = local30; local88 < local41; local88++) {
			@Pc(100) int local100 = local73[local81++] + local77[local86++];
			if (local100 < local56) {
				local56 = local100;
			}
		}
		return -local56;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	public static void method1112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static69.aClass89_1 == Static114.aClass89_2) {
			if (!Static454.method6065(1, 0, false, 1, arg0, arg1, 0, -2)) {
				Static454.method6065(1, 0, false, 1, arg0, arg1, 0, -3);
			}
		} else if (!Static454.method6065(1, 0, false, 1, arg0, arg1, 0, -3)) {
			Static454.method6065(1, 0, false, 1, arg0, arg1, 0, -2);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1113(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static363.anInt6512; local14++) {
			if (arg0.equalsIgnoreCase(Static422.aStringArray169[local14])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static411.aStringArray164[local14])) {
				return true;
			}
		}
		return false;
	}
}
