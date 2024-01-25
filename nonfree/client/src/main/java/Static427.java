import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!oea", name = "s", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!oea", name = "B", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5927(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static450.anInt7035; local16++) {
			if (arg0.equalsIgnoreCase(Static289.aStringArray20[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIII)V")
	public static void method5928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static81.anInt1714 = arg1;
		Static420.anInt6622 = arg3;
		Static119.anInt2267 = arg2;
		Static446.anInt6959 = arg5;
		Static653.anInt10298 = arg0;
		Static513.anInt8005 = arg4;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([[[Lclient!dq;I)V")
	public static void method5929(@OriginalArg(0) Class73[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class73[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class73 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass3_Sub1_Sub5_1 instanceof Interface20) {
							((Interface20) local23.aClass3_Sub1_Sub5_1).method7090();
						}
						if (local23.aClass3_Sub1_Sub3_1 instanceof Interface20) {
							((Interface20) local23.aClass3_Sub1_Sub3_1).method7090();
						}
						if (local23.aClass3_Sub1_Sub3_2 instanceof Interface20) {
							((Interface20) local23.aClass3_Sub1_Sub3_2).method7090();
						}
						if (local23.aClass3_Sub1_Sub4_1 instanceof Interface20) {
							((Interface20) local23.aClass3_Sub1_Sub4_1).method7090();
						}
						if (local23.aClass3_Sub1_Sub4_2 instanceof Interface20) {
							((Interface20) local23.aClass3_Sub1_Sub4_2).method7090();
						}
						for (@Pc(73) Class144 local73 = local23.aClass144_1; local73 != null; local73 = local73.aClass144_2) {
							@Pc(78) Class3_Sub1_Sub2 local78 = local73.aClass3_Sub1_Sub2_1;
							if (local78 instanceof Interface20) {
								((Interface20) local78).method7090();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZII)V")
	public static void method5930(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub55 local9 = arg0 ? Static64.aClass4_Sub55_1 : Static252.aClass4_Sub55_3;
		if (local9 == null || arg1 < 0 || arg1 >= local9.anInt10602) {
			return;
		}
		@Pc(26) Class357 local26 = local9.aClass357Array1[arg1];
		if (local26.aByte136 != -1) {
			return;
		}
		@Pc(36) String local36 = local26.aString111;
		@Pc(41) Class4_Sub48 local41 = Static335.method4615(Static653.aClass216_149, Static669.aClass196_2);
		local41.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(local36) + 3);
		local41.aClass4_Sub11_Sub1_2.method8822(arg0 ? 1 : 0);
		local41.aClass4_Sub11_Sub1_2.method8838(arg1);
		local41.aClass4_Sub11_Sub1_2.method8857(local36);
		Static410.method5170(local41);
	}
}
