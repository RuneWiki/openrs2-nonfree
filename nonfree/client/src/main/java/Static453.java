import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!tda", name = "t", descriptor = "[I")
	public static int[] anIntArray631;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method6916(@OriginalArg(0) Class39 arg0) {
		@Pc(7) int local7 = Static536.anInt9313;
		@Pc(9) int local9 = Static178.anInt3307;
		@Pc(11) int local11 = Static529.anInt9144;
		@Pc(13) int local13 = Static193.anInt3519;
		arg0.method6052(local9, -10660793, local7, local13, local11);
		arg0.method6052(local9 + 1, -16777216, local7 + 1, 16, local11 - 2);
		arg0.method6061(local11 - 2, -16777216, local13 - 19, local9 + 18, local7 + 1);
		Static175.aClass47_1.method7617(-10660793, -1, Static239.aClass202_253.method5139(Static172.anInt6352), local7 + 3, local9 - -14);
		@Pc(76) int local76 = Static61.aClass214_1.method7241();
		@Pc(80) int local80 = Static61.aClass214_1.method7240();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class2_Sub44 local87 = (Class2_Sub44) Static448.aClass249_63.method6527(); local87 != null; local87 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			@Pc(101) int local101 = local9 + (Static323.anInt6016 - local82 + -1) * 16 + 31;
			@Pc(103) short local103 = -1;
			if (local7 < local76 && local7 + local11 > local76 && local101 - 13 < local80 && local101 + 3 > local80 && local87.aBoolean611) {
				local103 = -256;
			}
			@Pc(133) int[] local133 = null;
			if (Static450.method6872(local87.anInt8460)) {
				local133 = Static464.aClass115_1.method2970((int) local87.aLong215).anIntArray682;
			} else if (local87.anInt8465 != -1) {
				local133 = Static464.aClass115_1.method2970(local87.anInt8465).anIntArray682;
			} else if (Static224.method3540(local87.anInt8460)) {
				@Pc(217) Class2_Sub11 local217 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local87.aLong215);
				if (local217 != null) {
					@Pc(222) Class1_Sub1_Sub2_Sub2 local222 = local217.aClass1_Sub1_Sub2_Sub2_1;
					@Pc(225) Class12 local225 = local222.aClass12_1;
					if (local225.anIntArray21 != null) {
						local225 = local225.method455(Static84.aClass302_1);
					}
					if (local225 != null) {
						local133 = local225.anIntArray22;
					}
				}
			} else if (Static326.method5156(local87.anInt8460)) {
				@Pc(186) Class129 local186;
				if (local87.anInt8460 == 1006) {
					local186 = Static505.aClass206_4.method5326((int) local87.aLong215);
				} else {
					local186 = Static505.aClass206_4.method5326((int) (local87.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local186.anIntArray392 != null) {
					local186 = local186.method3276(Static84.aClass302_1);
				}
				if (local186 != null) {
					local133 = local186.anIntArray396;
				}
			}
			@Pc(242) String local242 = Static288.method5991(local87);
			if (local133 != null) {
				local242 = local242 + Static98.method1916(local133);
			}
			Static175.aClass47_1.method7611(Static376.aClass35Array31, local103, local7 + 3, local101, local242, Static55.anIntArray91);
			if (local87.aBoolean610) {
				Static98.aClass35_13.method7351(Static188.aClass52_2.method1582(local242) + local7 + 5, local101 + -12);
			}
			local82++;
		}
		Static247.method3923(Static536.anInt9313, Static193.anInt3519, Static178.anInt3307, Static529.anInt9144);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIIIILclient!qa;)V")
	public static void method6917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class39 arg7) {
		@Pc(24) Interface6 local24 = (Interface6) Static524.method7595(arg5, arg6, arg0);
		@Pc(33) Class129 local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(58) int local58;
		if (local24 != null) {
			local33 = Static505.aClass206_4.method5326(local24.method7688());
			local39 = local24.method7687() & 0x3;
			local43 = local24.method7685();
			if (local33.anInt3666 == -1) {
				local58 = arg1;
				if (local33.anInt3660 > 0) {
					local58 = arg4;
				}
				if (local43 == 0 || local43 == 2) {
					if (local39 == 0) {
						arg7.method6071(4, local58, arg2, arg3);
					} else if (local39 == 1) {
						arg7.method6067(local58, arg2, arg3, 4);
					} else if (local39 == 2) {
						arg7.method6071(4, local58, arg2, arg3 + 3);
					} else if (local39 == 3) {
						arg7.method6067(local58, arg2 + 3, arg3, 4);
					}
				}
				if (local43 == 3) {
					if (local39 == 0) {
						arg7.method6052(arg2, local58, arg3, 1, 1);
					} else if (local39 == 1) {
						arg7.method6052(arg2, local58, arg3 + 3, 1, 1);
					} else if (local39 == 2) {
						arg7.method6052(arg2 + 3, local58, arg3 + 3, 1, 1);
					} else if (local39 == 3) {
						arg7.method6052(arg2 + 3, local58, arg3, 1, 1);
					}
				}
				if (local43 == 2) {
					if (local39 == 0) {
						arg7.method6067(local58, arg2, arg3, 4);
					} else if (local39 == 1) {
						arg7.method6071(4, local58, arg2, arg3 + 3);
					} else if (local39 == 2) {
						arg7.method6067(local58, arg2 + 3, arg3, 4);
					} else if (local39 == 3) {
						arg7.method6071(4, local58, arg2, arg3);
					}
				}
			} else {
				Static340.method5356(arg2, arg3, local39, local33, arg7);
			}
		}
		local24 = (Interface6) Static214.method3907(arg5, arg6, arg0, ej.class);
		if (local24 != null) {
			local33 = Static505.aClass206_4.method5326(local24.method7688());
			local39 = local24.method7687() & 0x3;
			local43 = local24.method7685();
			if (local33.anInt3666 != -1) {
				Static340.method5356(arg2, arg3, local39, local33, arg7);
			} else if (local43 == 9) {
				local58 = -1118482;
				if (local33.anInt3660 > 0) {
					local58 = -1179648;
				}
				if (local39 == 0 || local39 == 2) {
					arg7.method6048(arg2, arg3 + 3, local58, arg3, arg2 + 3);
				} else {
					arg7.method6048(arg2 + 3, arg3 + 3, local58, arg3, arg2);
				}
			}
		}
		local24 = (Interface6) Static427.method6584(arg5, arg6, arg0);
		if (local24 == null) {
			return;
		}
		local33 = Static505.aClass206_4.method5326(local24.method7688());
		local39 = local24.method7687() & 0x3;
		if (local33.anInt3666 != -1) {
			Static340.method5356(arg2, arg3, local39, local33, arg7);
			return;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILclient!wca;ZII)V")
	public static void method6919(@OriginalArg(1) Class310 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt9163;
		@Pc(16) int local16 = arg0.anInt9198;
		if (arg0.aByte109 == 0) {
			arg0.anInt9163 = arg0.anInt9165;
		} else if (arg0.aByte109 == 1) {
			arg0.anInt9163 = arg3 - arg0.anInt9165;
		} else if (arg0.aByte109 == 2) {
			arg0.anInt9163 = arg3 * arg0.anInt9165 >> 14;
		}
		if (arg0.aByte108 == 0) {
			arg0.anInt9198 = arg0.anInt9159;
		} else if (arg0.aByte108 == 1) {
			arg0.anInt9198 = arg2 - arg0.anInt9159;
		} else if (arg0.aByte108 == 2) {
			arg0.anInt9198 = arg2 * arg0.anInt9159 >> 14;
		}
		if (arg0.aByte109 == 4) {
			arg0.anInt9163 = arg0.anInt9198 * arg0.anInt9233 / arg0.anInt9181;
		}
		if (arg0.aByte108 == 4) {
			arg0.anInt9198 = arg0.anInt9163 * arg0.anInt9181 / arg0.anInt9233;
		}
		if (Static372.aBoolean522 && (Static67.method1257(arg0).anInt7446 != 0 || arg0.anInt9220 == 0)) {
			if (arg0.anInt9198 < 5 && arg0.anInt9163 < 5) {
				arg0.anInt9163 = 5;
				arg0.anInt9198 = 5;
			} else {
				if (arg0.anInt9163 <= 0) {
					arg0.anInt9163 = 5;
				}
				if (arg0.anInt9198 <= 0) {
					arg0.anInt9198 = 5;
				}
			}
		}
		if (Static249.anInt4562 == arg0.anInt9234) {
			Static65.aClass310_3 = arg0;
		}
		if (arg1 && arg0.anObjectArray6 != null && (arg0.anInt9163 != local8 || arg0.anInt9198 != local16)) {
			@Pc(197) Class2_Sub28 local197 = new Class2_Sub28();
			local197.aClass310_8 = arg0;
			local197.anObjectArray2 = arg0.anObjectArray6;
			Static17.aClass249_4.method6523(local197);
		}
	}
}
