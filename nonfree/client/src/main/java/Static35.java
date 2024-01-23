import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cl", name = "N", descriptor = "[Lclient!co;")
	public static Class25[] aClass25Array3;

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!cl", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString104 = "Unable to find ";

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)I")
	public static int method1447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(15) int local15 = arg2;
			arg2 = arg5;
			arg5 = local15;
		}
		@Pc(27) int local27 = arg0 & 0x3;
		if (local27 == 0) {
			return arg4;
		} else if (local27 == 1) {
			return arg3;
		} else if (local27 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return 1 + 7 - arg5 - arg3;
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)V")
	public static void method1448(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = Static278.anInt5374;
		if (arg0 == 0) {
			local3 = 1;
		}
		@Pc(16) int local16;
		@Pc(30) Class14_Sub2_Sub1 local30;
		@Pc(85) int local85;
		@Pc(174) int local174;
		@Pc(184) int local184;
		@Pc(207) int local207;
		@Pc(212) int local212;
		@Pc(109) int local109;
		for (local16 = 0; local16 < local3; local16++) {
			if (arg0 == 0) {
				local30 = Static197.aClass14_Sub2_Sub1_2;
			} else {
				local30 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local16]];
			}
			if (local30 != null && local30.method3647()) {
				@Pc(49) int local49 = local30.method3656();
				if (arg0 == 0 || arg0 == local49) {
					@Pc(80) int local80;
					if (local49 == 1) {
						if ((local30.anInt4680 & 0x7F) == 64 && (local30.anInt4630 & 0x7F) == 64) {
							local80 = local30.anInt4680 >> 7;
							local85 = local30.anInt4630 >> 7;
							if (local80 >= 0 && local80 < 104 && local85 >= 0 && local85 < 104) {
								local109 = Static225.anIntArrayArray28[local80][local85]++;
							}
						}
					} else if (((local49 & 0x1) != 0 || (local30.anInt4680 & 0x7F) == 0 && (local30.anInt4630 & 0x7F) == 0) && ((local49 & 0x1) != 1 || (local30.anInt4680 & 0x7F) == 64 && (local30.anInt4630 & 0x7F) == 64)) {
						local85 = local30.anInt4630 - local49 * 64 >> 7;
						local80 = local30.anInt4680 - local49 * 64 >> 7;
						local174 = local30.method3656() + local80;
						if (local80 < 0) {
							local80 = 0;
						}
						local184 = local85 + local30.method3656();
						if (local85 < 0) {
							local85 = 0;
						}
						if (local184 > 104) {
							local184 = 104;
						}
						if (local174 > 104) {
							local174 = 104;
						}
						for (local207 = local80; local207 < local174; local207++) {
							for (local212 = local85; local212 < local184; local212++) {
								local109 = Static225.anIntArrayArray28[local207][local212]++;
							}
						}
					}
				}
			}
		}
		label218: for (local16 = 0; local16 < local3; local16++) {
			@Pc(258) long local258;
			if (arg0 == 0) {
				local30 = Static197.aClass14_Sub2_Sub1_2;
				local258 = 8791798054912L;
			} else {
				local30 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local16]];
				local258 = (long) Static17.anIntArray444[local16] << 32;
			}
			if (local30 != null && local30.method3647()) {
				local85 = local30.method3656();
				if (arg0 == 0 || local85 == arg0) {
					local30.aBoolean123 = false;
					local30.aBoolean358 = true;
					if ((Static209.aBoolean321 && Static278.anInt5374 > 200 || Static278.anInt5374 > 50) && arg0 != 0 && local30.anInt4658 == local30.method3650().anInt5190) {
						local30.aBoolean123 = true;
					}
					if (local85 == 1) {
						if ((local30.anInt4680 & 0x7F) == 64 && (local30.anInt4630 & 0x7F) == 64) {
							local174 = local30.anInt4680 >> 7;
							local184 = local30.anInt4630 >> 7;
							if (local174 < 0 || local174 >= 104 || local184 < 0 || local184 >= 104) {
								continue;
							}
							if (Static225.anIntArrayArray28[local174][local184] > 1) {
								local109 = Static225.anIntArrayArray28[local174][local184]--;
								continue;
							}
						}
					} else if ((local85 & 0x1) == 0 && (local30.anInt4680 & 0x7F) == 0 && (local30.anInt4630 & 0x7F) == 0 || (local85 & 0x1) == 1 && (local30.anInt4680 & 0x7F) == 64 && (local30.anInt4630 & 0x7F) == 0) {
						local174 = local30.anInt4680 - local85 * 64 >> 7;
						local184 = local30.anInt4630 - local85 * 64 >> 7;
						local212 = local184 + local85;
						if (local184 < 0) {
							local184 = 0;
						}
						if (local212 > 104) {
							local212 = 104;
						}
						@Pc(460) boolean local460 = true;
						local207 = local174 + local85;
						if (local207 > 104) {
							local207 = 104;
						}
						if (local174 < 0) {
							local174 = 0;
						}
						@Pc(477) int local477;
						@Pc(486) int local486;
						for (local477 = local174; local477 < local207; local477++) {
							for (local486 = local184; local486 < local212; local486++) {
								if (Static225.anIntArrayArray28[local477][local486] <= 1) {
									local460 = false;
									break;
								}
							}
						}
						if (local460) {
							local477 = local174;
							while (true) {
								if (local207 <= local477) {
									continue label218;
								}
								for (local486 = local184; local486 < local212; local486++) {
									local109 = Static225.anIntArrayArray28[local477][local486]--;
								}
								local477++;
							}
						}
					}
					if (local30.anObject6 == null || local30.anInt4640 > Static237.anInt4710 || Static237.anInt4710 >= local30.anInt4683) {
						local30.aBoolean358 = false;
						local30.anInt4694 = Static20.method383(local30.anInt4630, Static140.anInt3034, local30.anInt4680);
						Static22.method423(Static140.anInt3034, local30.anInt4680, local30.anInt4630, local30.anInt4694, (local85 - 1) * 64 + 60, local30, local30.anInt4681, local258, local30.aBoolean356);
					} else {
						local30.aBoolean123 = false;
						local30.aBoolean358 = false;
						local30.anInt4694 = Static20.method383(local30.anInt4630, Static140.anInt3034, local30.anInt4680);
						Static295.method4420(Static140.anInt3034, local30.anInt4680, local30.anInt4630, local30.anInt4694, local30, local30.anInt4681, local258, local30.anInt4688, local30.anInt4697, local30.anInt4682, local30.anInt4667);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!km;BLclient!km;)V")
	public static void method1450(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		Static105.aClass91_87 = arg0;
		Static123.aClass91_97 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BIIII)V")
	public static void method1451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static88.anInt1962 = Static164.anInt3508 * arg2 / arg1;
		Static258.anInt5077 = -1;
		Static207.anInt4867 = arg0 * Static95.anInt2218 / arg3;
		Static22.anInt448 = -1;
		Static196.method1928();
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)I")
	public static int method1452() {
		return Static244.anInt4846;
	}
}
