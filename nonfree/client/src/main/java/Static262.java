import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_66 = new Class349(21, -1);

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static final int anInt4076 = 1403;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method3709() {
		if (Static614.aClass145_15 != null) {
			Static614.aClass145_15.method9661();
			Static98.aClass68_4 = null;
			Static614.aClass145_15 = null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!et;Lclient!vo;ZI)V")
	public static void method3710(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) Class389 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub52 local9 = new Class2_Sub52();
		local9.anInt9333 = arg0.method8581(-17416);
		local9.anInt9332 = arg0.method8555(-9372);
		local9.anIntArray682 = new int[local9.anInt9333];
		local9.aClass163Array1 = new Class163[local9.anInt9333];
		local9.anIntArray681 = new int[local9.anInt9333];
		local9.aClass163Array2 = new Class163[local9.anInt9333];
		local9.aByteArrayArrayArray18 = new byte[local9.anInt9333][][];
		local9.anIntArray683 = new int[local9.anInt9333];
		for (@Pc(61) int local61 = 0; local61 < local9.anInt9333; local61++) {
			try {
				@Pc(67) int local67 = arg0.method8581(-17416);
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(93) int local93;
				if (local67 == 0 || local67 == 1 || local67 == 2) {
					local87 = arg0.method8553();
					local91 = arg0.method8553();
					local93 = 0;
					if (local67 == 1) {
						local93 = arg0.method8555(-9372);
					}
					local9.anIntArray683[local61] = local67;
					local9.anIntArray681[local61] = local93;
					local9.aClass163Array2[local61] = arg1.method9271(Static282.method3954(local87), local91);
				} else if (local67 == 3 || local67 == 4) {
					local87 = arg0.method8553();
					local91 = arg0.method8553();
					local93 = arg0.method8581(-17416);
					@Pc(154) String[] local154 = new String[local93];
					for (@Pc(156) int local156 = 0; local156 < local93; local156++) {
						local154[local156] = arg0.method8553();
					}
					@Pc(177) byte[][] local177 = new byte[local93][];
					@Pc(190) int local190;
					if (local67 == 3) {
						for (@Pc(184) int local184 = 0; local184 < local93; local184++) {
							local190 = arg0.method8555(-9372);
							local177[local184] = new byte[local190];
							arg0.method8573(local190, 0, local177[local184]);
						}
					}
					local9.anIntArray683[local61] = local67;
					@Pc(215) Class[] local215 = new Class[local93];
					for (local190 = 0; local190 < local93; local190++) {
						local215[local190] = Static282.method3954(local154[local190]);
					}
					local9.aClass163Array1[local61] = arg1.method9269(Static282.method3954(local87), local215, local91);
					local9.aByteArrayArrayArray18[local61] = local177;
				}
			} catch (@Pc(254) ClassNotFoundException local254) {
				local9.anIntArray682[local61] = -1;
			} catch (@Pc(261) SecurityException local261) {
				local9.anIntArray682[local61] = -2;
			} catch (@Pc(268) NullPointerException local268) {
				local9.anIntArray682[local61] = -3;
			} catch (@Pc(275) Exception local275) {
				local9.anIntArray682[local61] = -4;
			} catch (@Pc(282) Throwable local282) {
				local9.anIntArray682[local61] = -5;
			}
		}
		Static49.aClass60_17.method1233(local9);
	}
}
