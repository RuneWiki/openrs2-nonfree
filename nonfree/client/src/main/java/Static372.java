import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!mv;")
	public static Class229 aClass229_89;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
	public static int anInt6232;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public static int anInt6216 = -2;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
	public static int anInt6229 = 0;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!qg;")
	public static final Class285 aClass285_2 = new Class285("LIVE", 0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([[[Lclient!ms;Z)V")
	public static void method5208(@OriginalArg(0) Class228[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) Class228[][] local14 = arg0[local3];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class228 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass12_Sub2_Sub2_1 instanceof Interface14) {
							((Interface14) local28.aClass12_Sub2_Sub2_1).method7088();
						}
						if (local28.aClass12_Sub2_Sub4_1 instanceof Interface14) {
							((Interface14) local28.aClass12_Sub2_Sub4_1).method7088();
						}
						if (local28.aClass12_Sub2_Sub4_2 instanceof Interface14) {
							((Interface14) local28.aClass12_Sub2_Sub4_2).method7088();
						}
						if (local28.aClass12_Sub2_Sub5_1 instanceof Interface14) {
							((Interface14) local28.aClass12_Sub2_Sub5_1).method7088();
						}
						if (local28.aClass12_Sub2_Sub5_2 instanceof Interface14) {
							((Interface14) local28.aClass12_Sub2_Sub5_2).method7088();
						}
						for (@Pc(78) Class180 local78 = local28.aClass180_3; local78 != null; local78 = local78.aClass180_2) {
							@Pc(83) Class12_Sub2_Sub1 local83 = local78.aClass12_Sub2_Sub1_1;
							if (local83 instanceof Interface14) {
								((Interface14) local83).method7088();
							}
						}
					}
				}
			}
		}
	}
}
