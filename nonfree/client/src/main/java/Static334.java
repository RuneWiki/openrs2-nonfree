import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "B")
	public static byte aByte71;

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
	public static int anInt6311;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "Lclient!tm;")
	public static Class194 aClass194_3;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString363 = "Loading - please wait.";

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
	public static int anInt6315 = 100;

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5595(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static322.method5425(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static322.method5425(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(55) int local55 = local14 - local11;
		if (local55 < 1 || local55 > 12) {
			return null;
		}
		@Pc(70) StringBuffer local70 = new StringBuffer(local55);
		for (@Pc(72) int local72 = local11; local72 < local14; local72++) {
			@Pc(78) char local78 = arg0.charAt(local72);
			if (Static209.method3731(local78)) {
				@Pc(86) char local86 = Static326.method5506(local78);
				if (local86 != '\u0000') {
					local70.append(local86);
				}
			}
		}
		if (local70.length() == 0) {
			return null;
		} else {
			return local70.toString();
		}
	}
}
