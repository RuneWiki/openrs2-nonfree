import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array12;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
	public static int anInt4527 = -1;

	@OriginalMember(owner = "client!rf", name = "kb", descriptor = "I")
	public static int anInt4543 = 0;

	@OriginalMember(owner = "client!rf", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray34 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ak;[Lclient!ek;I)V")
	public static void method3501(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub1[] arg1) {
		Static241.aClass7_198 = arg0;
		Static76.aClass1_Sub2_Sub2_Sub1Array1 = arg1;
		Static257.aBooleanArray23 = new boolean[Static76.aClass1_Sub2_Sub2_Sub1Array1.length];
		Static45.aClass22_3.method635();
		@Pc(25) int local25 = Static241.aClass7_198.method264("details");
		@Pc(30) int[] local30 = Static241.aClass7_198.method266(local25);
		for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
			Static45.aClass22_3.method643((long) local30[local32], Static147.method2289(new Class1_Sub18(Static241.aClass7_198.method253(local30[local32], local25)), local30[local32]));
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z")
	public static boolean method3502(@OriginalArg(1) int arg0) {
		if (Static176.aBooleanArray13[arg0]) {
			return true;
		} else if (Static55.aClass7_49.method246(arg0)) {
			@Pc(30) int local30 = Static55.aClass7_49.method265(arg0);
			if (local30 == 0) {
				Static176.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static86.aClass127ArrayArray1[arg0] == null) {
				Static86.aClass127ArrayArray1[arg0] = new Class127[local30];
			}
			for (@Pc(53) int local53 = 0; local53 < local30; local53++) {
				if (Static86.aClass127ArrayArray1[arg0][local53] == null) {
					@Pc(68) byte[] local68 = Static55.aClass7_49.method253(local53, arg0);
					if (local68 != null) {
						@Pc(81) Class127 local81 = Static86.aClass127ArrayArray1[arg0][local53] = new Class127();
						local81.anInt3574 = local53 + (arg0 << 16);
						if (local68[0] == -1) {
							local81.method2848(new Class1_Sub18(local68));
						} else {
							local81.method2853(new Class1_Sub18(local68));
						}
					}
				}
			}
			Static176.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
