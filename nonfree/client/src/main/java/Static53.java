import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILclient!pn;Lclient!pn;)V")
	public static void method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub2_Sub3 arg3, @OriginalArg(4) Class9_Sub2_Sub3 arg4) {
		@Pc(4) Class351 local4 = Static175.method2895(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub2_Sub3_2 = arg3;
		local4.aClass9_Sub2_Sub3_1 = arg4;
		@Pc(19) int local19 = Static637.aClass91Array4 == Static485.aClass91Array1 ? 1 : 0;
		if (!arg3.method8597()) {
			arg3.aClass9_Sub2_23 = Static164.aClass9_Sub2Array1[local19];
			Static164.aClass9_Sub2Array1[local19] = arg3;
		} else if (arg3.method8607()) {
			arg3.aClass9_Sub2_23 = Static250.aClass9_Sub2Array5[local19];
			Static250.aClass9_Sub2Array5[local19] = arg3;
		} else {
			arg3.aClass9_Sub2_23 = Static463.aClass9_Sub2Array6[local19];
			Static463.aClass9_Sub2Array6[local19] = arg3;
			Static334.aBoolean462 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8597()) {
			if (arg4.method8607()) {
				arg4.aClass9_Sub2_23 = Static250.aClass9_Sub2Array5[local19];
				Static250.aClass9_Sub2Array5[local19] = arg4;
				return;
			}
			arg4.aClass9_Sub2_23 = Static463.aClass9_Sub2Array6[local19];
			Static463.aClass9_Sub2Array6[local19] = arg4;
			Static334.aBoolean462 = true;
			return;
		}
		arg4.aClass9_Sub2_23 = Static164.aClass9_Sub2Array1[local19];
		Static164.aClass9_Sub2Array1[local19] = arg4;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[[[Lclient!ve;)V")
	public static void method973(@OriginalArg(1) Class351[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class351[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class351 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass9_Sub2_Sub4_1 instanceof Interface2) {
							((Interface2) local23.aClass9_Sub2_Sub4_1).method7497();
						}
						if (local23.aClass9_Sub2_Sub5_1 instanceof Interface2) {
							((Interface2) local23.aClass9_Sub2_Sub5_1).method7497();
						}
						if (local23.aClass9_Sub2_Sub5_2 instanceof Interface2) {
							((Interface2) local23.aClass9_Sub2_Sub5_2).method7497();
						}
						if (local23.aClass9_Sub2_Sub3_2 instanceof Interface2) {
							((Interface2) local23.aClass9_Sub2_Sub3_2).method7497();
						}
						if (local23.aClass9_Sub2_Sub3_1 instanceof Interface2) {
							((Interface2) local23.aClass9_Sub2_Sub3_1).method7497();
						}
						for (@Pc(79) Class105 local79 = local23.aClass105_3; local79 != null; local79 = local79.aClass105_1) {
							@Pc(84) Class9_Sub2_Sub1 local84 = local79.aClass9_Sub2_Sub1_1;
							if (local84 instanceof Interface2) {
								((Interface2) local84).method7497();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!uu;Lclient!uu;Lclient!uu;Lclient!efa;ZLclient!aea;)Z")
	public static boolean method974(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class89 arg3, @OriginalArg(5) Class3_Sub3_Sub1 arg4) {
		Static12.anIntArray26 = new int[16];
		Static383.aClass343_273 = arg0;
		Static298.aClass343_151 = arg1;
		Static611.aClass343_261 = arg2;
		Static466.aClass3_Sub3_Sub1_3 = arg4;
		Static405.aClass89_4 = arg3;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static12.anIntArray26[local25] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZB)V")
	public static void method975(@OriginalArg(0) boolean arg0) {
		Static133.aClass31_43.method7934(Static366.aClass82_11.method6174());
		@Pc(10) int[] local10 = Static366.aClass82_11.Y();
		Static506.anInt8542 = local10[0];
		Static533.anInt1376 = local10[3];
		Static165.anInt3256 = local10[2];
		Static576.anInt9418 = local10[1];
		if (arg0) {
			Static366.aClass82_11.DA(Static184.anInt3507, Static350.anInt6508, Static485.anInt8242, Static202.anInt3744);
			Static159.method2763(Static298.aDouble9);
		} else {
			Static366.aClass82_11.DA(Static458.anInt7787, Static183.anInt3464, Static269.anInt5260, Static23.anInt339);
			Static159.method2763(Static124.aDouble4);
		}
	}
}
