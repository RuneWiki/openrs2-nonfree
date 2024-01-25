import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[Lclient!id;")
	public static Class111[] aClass111Array1;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	public static final int[] anIntArray61 = new int[32];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B[[[Lclient!vt;)V")
	public static void method1035(@OriginalArg(1) Class258[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(18) Class258[][] local18 = arg0[local7];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class258 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass2_Sub3_2 instanceof Interface2) {
							((Interface2) local32.aClass2_Sub3_2).method6041();
						}
						if (local32.aClass2_Sub2_2 instanceof Interface2) {
							((Interface2) local32.aClass2_Sub2_2).method6041();
						}
						if (local32.aClass2_Sub2_3 instanceof Interface2) {
							((Interface2) local32.aClass2_Sub2_3).method6041();
						}
						if (local32.aClass2_Sub4_2 instanceof Interface2) {
							((Interface2) local32.aClass2_Sub4_2).method6041();
						}
						if (local32.aClass2_Sub4_3 instanceof Interface2) {
							((Interface2) local32.aClass2_Sub4_3).method6041();
						}
						for (@Pc(82) Class122 local82 = local32.aClass122_3; local82 != null; local82 = local82.aClass122_1) {
							@Pc(87) Class2_Sub1 local87 = local82.aClass2_Sub1_1;
							if (local87 instanceof Interface2) {
								((Interface2) local87).method6041();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public static void method1036(@OriginalArg(1) int arg0) {
		if (!Static305.method3794(arg0)) {
			return;
		}
		@Pc(22) Class76[] local22 = Static34.aClass76ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class76 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt2051 = 1;
				local30.anInt2050 = 0;
				local30.anInt2064 = 0;
			}
		}
	}
}
