import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_58 = new Class124();

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!pw;I)Z")
	public static boolean method5225(@OriginalArg(0) Class280 arg0) {
		return arg0 == null ? false : Static87.method1315(arg0.anInt8092 - arg0.anInt8087, arg0.anInt8093, arg0.anInt8087, arg0.anInt8084 - arg0.anInt8093, arg0.anInt8085, arg0.anInt8080 - arg0.anInt8085);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public static void method5229() {
		Static386.aClass5_Sub15_Sub2_2.method3701();
		@Pc(11) int local11 = Static386.aClass5_Sub15_Sub2_2.method3702(8);
		@Pc(16) int local16;
		if (local11 < Static386.anInt6720) {
			for (local16 = local11; local16 < Static386.anInt6720; local16++) {
				Static287.anIntArray264[Static80.anInt1293++] = Static662.anIntArray600[local16];
			}
		}
		if (Static386.anInt6720 < local11) {
			throw new RuntimeException("gnpov1");
		}
		Static386.anInt6720 = 0;
		for (local16 = 0; local16 < local11; local16++) {
			@Pc(53) int local53 = Static662.anIntArray600[local16];
			@Pc(61) Class41_Sub1_Sub1_Sub3_Sub1 local61 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) local53)).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			@Pc(66) int local66 = Static386.aClass5_Sub15_Sub2_2.method3702(1);
			if (local66 == 0) {
				Static662.anIntArray600[Static386.anInt6720++] = local53;
				local61.anInt9500 = Static483.anInt8316;
			} else {
				@Pc(88) int local88 = Static386.aClass5_Sub15_Sub2_2.method3702(2);
				if (local88 == 0) {
					Static662.anIntArray600[Static386.anInt6720++] = local53;
					local61.anInt9500 = Static483.anInt8316;
					Static109.anIntArray103[Static118.anInt2047++] = local53;
				} else {
					@Pc(131) int local131;
					@Pc(141) int local141;
					if (local88 == 1) {
						Static662.anIntArray600[Static386.anInt6720++] = local53;
						local61.anInt9500 = Static483.anInt8316;
						local131 = Static386.aClass5_Sub15_Sub2_2.method3702(3);
						local61.method4715(1, local131);
						local141 = Static386.aClass5_Sub15_Sub2_2.method3702(1);
						if (local141 == 1) {
							Static109.anIntArray103[Static118.anInt2047++] = local53;
						}
					} else if (local88 == 2) {
						Static662.anIntArray600[Static386.anInt6720++] = local53;
						local61.anInt9500 = Static483.anInt8316;
						if (Static386.aClass5_Sub15_Sub2_2.method3702(1) == 1) {
							local131 = Static386.aClass5_Sub15_Sub2_2.method3702(3);
							local61.method4715(2, local131);
							local141 = Static386.aClass5_Sub15_Sub2_2.method3702(3);
							local61.method4715(2, local141);
						} else {
							local131 = Static386.aClass5_Sub15_Sub2_2.method3702(3);
							local61.method4715(0, local131);
						}
						local131 = Static386.aClass5_Sub15_Sub2_2.method3702(1);
						if (local131 == 1) {
							Static109.anIntArray103[Static118.anInt2047++] = local53;
						}
					} else if (local88 == 3) {
						Static287.anIntArray264[Static80.anInt1293++] = local53;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!wq;)Lclient!wq;")
	public static Class394 method5230(@OriginalArg(1) Class394 arg0) {
		if (arg0.anInt10530 != -1) {
			return Static238.method3422(arg0.anInt10530);
		}
		@Pc(17) int local17 = arg0.anInt10490 >>> 16;
		@Pc(27) Class304 local27 = new Class304(Static131.aClass335_15);
		for (@Pc(32) Class5_Sub4 local32 = (Class5_Sub4) local27.method7247(); local32 != null; local32 = (Class5_Sub4) local27.method7246()) {
			if (local17 == local32.anInt257) {
				return Static238.method3422((int) local32.aLong329);
			}
		}
		return null;
	}
}
