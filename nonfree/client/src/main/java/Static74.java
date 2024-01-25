import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_24 = new Class253(95, 1);

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public static int anInt1409 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z[[[Lclient!rr;)V")
	public static void method1203(@OriginalArg(1) Class223[][][] arg0) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class223[][] local14 = arg0[local8];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class223 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass26_Sub4_2 instanceof Interface5) {
							((Interface5) local28.aClass26_Sub4_2).method5733();
						}
						if (local28.aClass26_Sub1_2 instanceof Interface5) {
							((Interface5) local28.aClass26_Sub1_2).method5733();
						}
						if (local28.aClass26_Sub1_1 instanceof Interface5) {
							((Interface5) local28.aClass26_Sub1_1).method5733();
						}
						if (local28.aClass26_Sub3_2 instanceof Interface5) {
							((Interface5) local28.aClass26_Sub3_2).method5733();
						}
						if (local28.aClass26_Sub3_1 instanceof Interface5) {
							((Interface5) local28.aClass26_Sub3_1).method5733();
						}
						for (@Pc(90) Class270 local90 = local28.aClass270_1; local90 != null; local90 = local90.aClass270_3) {
							@Pc(95) Class26_Sub2 local95 = local90.aClass26_Sub2_2;
							if (local95 instanceof Interface5) {
								((Interface5) local95).method5733();
							}
						}
					}
				}
			}
		}
	}
}
