import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "Lclient!rh;")
	public static Class290 aClass290_1 = new Class290();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!np;)Lclient!cu;")
	public static Class3_Sub6 method3266(@OriginalArg(1) Class3_Sub11 arg0) {
		arg0.method5175();
		@Pc(18) int local18 = arg0.method5175();
		@Pc(22) Class3_Sub6 local22 = Static319.method4667(local18);
		local22.anInt9361 = arg0.method5175();
		@Pc(31) int local31 = arg0.method5175();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method5175();
			local22.method7771(arg0, local39);
		}
		local22.method7768();
		return local22;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!np;I)Lclient!md;")
	public static Class65_Sub3 method3267(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) Class65 local7 = Static5.method86(arg0);
		@Pc(11) int local11 = arg0.method5186();
		@Pc(23) int local23 = arg0.method5186();
		@Pc(27) int local27 = arg0.method5198();
		return new Class65_Sub3(local7.aClass63_16, local7.aClass249_16, local7.anInt5457, local7.anInt5460, local7.anInt5462, local7.anInt5461, local7.anInt5463, local7.anInt5459, local7.anInt5458, local11, local23, local27);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method3269(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static570.anInt9273 = 1;
		Static61.anInt1462 = -1;
		Static259.method3987(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[[[Lclient!ru;)V")
	public static void method3270(@OriginalArg(1) Class299[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class299[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class299 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass41_Sub2_Sub5_1 instanceof Interface4) {
							((Interface4) local23.aClass41_Sub2_Sub5_1).method7559();
						}
						if (local23.aClass41_Sub2_Sub2_2 instanceof Interface4) {
							((Interface4) local23.aClass41_Sub2_Sub2_2).method7559();
						}
						if (local23.aClass41_Sub2_Sub2_1 instanceof Interface4) {
							((Interface4) local23.aClass41_Sub2_Sub2_1).method7559();
						}
						if (local23.aClass41_Sub2_Sub3_1 instanceof Interface4) {
							((Interface4) local23.aClass41_Sub2_Sub3_1).method7559();
						}
						if (local23.aClass41_Sub2_Sub3_2 instanceof Interface4) {
							((Interface4) local23.aClass41_Sub2_Sub3_2).method7559();
						}
						for (@Pc(73) Class38 local73 = local23.aClass38_2; local73 != null; local73 = local73.aClass38_1) {
							@Pc(78) Class41_Sub2_Sub1 local78 = local73.aClass41_Sub2_Sub1_1;
							if (local78 instanceof Interface4) {
								((Interface4) local78).method7559();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V")
	public static void method3271() {
		if (Static143.aClass275_1 != null) {
			Static143.aClass275_1.method6104();
		}
		if (Static396.aThread3 == null) {
			return;
		}
		while (true) {
			try {
				Static396.aThread3.join();
				return;
			} catch (@Pc(18) InterruptedException local18) {
			}
		}
	}
}
