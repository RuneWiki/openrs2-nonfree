import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString49 = "";

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z[[[Lclient!mf;)V")
	public static void method3740(@OriginalArg(1) Class217[][][] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(10) Class217[][] local10 = arg0[local5];
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				for (@Pc(15) int local15 = 0; local15 < local10[local12].length; local15++) {
					@Pc(22) Class217 local22 = local10[local12][local15];
					if (local22 != null) {
						if (local22.aClass11_Sub1_Sub4_1 instanceof Interface27) {
							((Interface27) local22.aClass11_Sub1_Sub4_1).method8331();
						}
						if (local22.aClass11_Sub1_Sub3_1 instanceof Interface27) {
							((Interface27) local22.aClass11_Sub1_Sub3_1).method8331();
						}
						if (local22.aClass11_Sub1_Sub3_2 instanceof Interface27) {
							((Interface27) local22.aClass11_Sub1_Sub3_2).method8331();
						}
						if (local22.aClass11_Sub1_Sub2_1 instanceof Interface27) {
							((Interface27) local22.aClass11_Sub1_Sub2_1).method8331();
						}
						if (local22.aClass11_Sub1_Sub2_2 instanceof Interface27) {
							((Interface27) local22.aClass11_Sub1_Sub2_2).method8331();
						}
						for (@Pc(72) Class61 local72 = local22.aClass61_2; local72 != null; local72 = local72.aClass61_1) {
							@Pc(76) Class11_Sub1_Sub1 local76 = local72.aClass11_Sub1_Sub1_1;
							if (local76 instanceof Interface27) {
								((Interface27) local76).method8331();
							}
						}
					}
				}
			}
		}
	}
}
