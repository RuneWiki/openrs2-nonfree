import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static int anInt7659;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Lclient!tca;")
	public static Class325 aClass325_5;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[2];

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public static void method6565() {
		if (Static529.anInt9623 == 9) {
			Static66.method8375(5);
		} else if (Static529.anInt9623 == 5 || Static529.anInt9623 == 6) {
			Static66.method8375(3);
			return;
		} else if (Static529.anInt9623 == 12) {
			Static66.method8375(3);
			return;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[[[Lclient!es;)V")
	public static void method6567(@OriginalArg(1) Class100[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class100[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class100 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass3_Sub1_Sub1_1 instanceof Interface21) {
							((Interface21) local27.aClass3_Sub1_Sub1_1).method8623();
						}
						if (local27.aClass3_Sub1_Sub2_1 instanceof Interface21) {
							((Interface21) local27.aClass3_Sub1_Sub2_1).method8623();
						}
						if (local27.aClass3_Sub1_Sub2_2 instanceof Interface21) {
							((Interface21) local27.aClass3_Sub1_Sub2_2).method8623();
						}
						if (local27.aClass3_Sub1_Sub5_2 instanceof Interface21) {
							((Interface21) local27.aClass3_Sub1_Sub5_2).method8623();
						}
						if (local27.aClass3_Sub1_Sub5_1 instanceof Interface21) {
							((Interface21) local27.aClass3_Sub1_Sub5_1).method8623();
						}
						for (@Pc(77) Class243 local77 = local27.aClass243_1; local77 != null; local77 = local77.aClass243_3) {
							@Pc(82) Class3_Sub1_Sub3 local82 = local77.aClass3_Sub1_Sub3_1;
							if (local82 instanceof Interface21) {
								((Interface21) local82).method8623();
							}
						}
					}
				}
			}
		}
	}
}
