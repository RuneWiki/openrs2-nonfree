import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Z")
	public static boolean aBoolean490;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([[[Lclient!af;I)V")
	public static void method5841(@OriginalArg(0) Class9[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class9[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class9 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass29_Sub3_1 instanceof Interface6) {
							((Interface6) local23.aClass29_Sub3_1).method7554();
						}
						if (local23.aClass29_Sub1_2 instanceof Interface6) {
							((Interface6) local23.aClass29_Sub1_2).method7554();
						}
						if (local23.aClass29_Sub1_1 instanceof Interface6) {
							((Interface6) local23.aClass29_Sub1_1).method7554();
						}
						if (local23.aClass29_Sub5_1 instanceof Interface6) {
							((Interface6) local23.aClass29_Sub5_1).method7554();
						}
						if (local23.aClass29_Sub5_2 instanceof Interface6) {
							((Interface6) local23.aClass29_Sub5_2).method7554();
						}
						for (@Pc(73) Class66 local73 = local23.aClass66_1; local73 != null; local73 = local73.aClass66_2) {
							@Pc(78) Class29_Sub2 local78 = local73.aClass29_Sub2_1;
							if (local78 instanceof Interface6) {
								((Interface6) local78).method7554();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!dga;)Lclient!ca;")
	public static Class38_Sub1 method5852(@OriginalArg(1) Class6_Sub14 arg0) {
		return new Class38_Sub1(arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method5988(), arg0.method6041());
	}
}
