import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!oa;")
	public static Class210 aClass210_7;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	public static int anInt9240;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!n;")
	public static Interface8 anInterface8_14;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	public static int anInt9244;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[[[Lclient!nj;)V")
	public static void method7798(@OriginalArg(1) Class206[][][] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(10) Class206[][] local10 = arg0[local5];
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				for (@Pc(15) int local15 = 0; local15 < local10[local12].length; local15++) {
					@Pc(22) Class206 local22 = local10[local12][local15];
					if (local22 != null) {
						if (local22.aClass47_Sub3_1 instanceof Interface17) {
							((Interface17) local22.aClass47_Sub3_1).method7179();
						}
						if (local22.aClass47_Sub5_1 instanceof Interface17) {
							((Interface17) local22.aClass47_Sub5_1).method7179();
						}
						if (local22.aClass47_Sub5_2 instanceof Interface17) {
							((Interface17) local22.aClass47_Sub5_2).method7179();
						}
						if (local22.aClass47_Sub4_2 instanceof Interface17) {
							((Interface17) local22.aClass47_Sub4_2).method7179();
						}
						if (local22.aClass47_Sub4_1 instanceof Interface17) {
							((Interface17) local22.aClass47_Sub4_1).method7179();
						}
						for (@Pc(74) Class168 local74 = local22.aClass168_2; local74 != null; local74 = local74.aClass168_1) {
							@Pc(78) Class47_Sub2 local78 = local74.aClass47_Sub2_2;
							if (local78 instanceof Interface17) {
								((Interface17) local78).method7179();
							}
						}
					}
				}
			}
		}
	}
}
