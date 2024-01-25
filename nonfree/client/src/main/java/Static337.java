import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "[I")
	public static final int[] anIntArray410 = new int[3];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIB)V")
	public static void method4617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg2 - arg3;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static145.method2541(arg2, arg1, arg3, arg0);
			}
		} else if (local10 == 0) {
			Static535.method7191(arg0, arg1, arg3, arg4);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(59) boolean local59 = local15 < local10;
			@Pc(63) int local63;
			@Pc(67) int local67;
			if (local59) {
				local63 = arg1;
				arg1 = arg3;
				local67 = arg4;
				arg3 = local63;
				arg4 = arg2;
				arg2 = local67;
			}
			if (arg1 > arg4) {
				local63 = arg1;
				arg1 = arg4;
				local67 = arg3;
				arg3 = arg2;
				arg4 = local63;
				arg2 = local67;
			}
			local63 = arg3;
			local67 = arg4 - arg1;
			@Pc(104) int local104 = arg2 - arg3;
			@Pc(109) int local109 = -(local67 >> 1);
			@Pc(116) int local116 = arg2 > arg3 ? 1 : -1;
			if (local104 < 0) {
				local104 = -local104;
			}
			@Pc(128) int local128;
			if (local59) {
				for (local128 = arg1; local128 <= arg4; local128++) {
					local109 += local104;
					Static172.anIntArrayArray17[local128][local63] = arg0;
					if (local109 > 0) {
						local63 += local116;
						local109 -= local67;
					}
				}
			} else {
				for (local128 = arg1; local128 <= arg4; local128++) {
					Static172.anIntArrayArray17[local63][local128] = arg0;
					local109 += local104;
					if (local109 > 0) {
						local109 -= local67;
						local63 += local116;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	public static void method4618(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static290.anInt4589 == 2) {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[0]);
				Static409.aClass10Array1[1].method197(Static48.aClass394Array1[1]);
			} else if (Static290.anInt4589 == 3) {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[0]);
				Static409.aClass10Array1[1].method197(Static48.aClass394Array1[1]);
				Static409.aClass10Array1[2].method197(Static48.aClass394Array1[2]);
			} else {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[0]);
				Static409.aClass10Array1[1].method197(Static48.aClass394Array1[1]);
				Static409.aClass10Array1[2].method197(Static48.aClass394Array1[2]);
				Static409.aClass10Array1[3].method197(Static48.aClass394Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static290.anInt4589 == 2) {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[2]);
			} else if (Static290.anInt4589 == 3) {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[3]);
				Static409.aClass10Array1[1].method197(Static48.aClass394Array1[4]);
			} else {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[4]);
				Static409.aClass10Array1[1].method197(Static48.aClass394Array1[5]);
				Static409.aClass10Array1[2].method197(Static48.aClass394Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static290.anInt4589 == 2) {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[3]);
				return;
			}
			if (Static290.anInt4589 == 3) {
				Static409.aClass10Array1[0].method197(Static48.aClass394Array1[5]);
				return;
			}
			Static409.aClass10Array1[0].method197(Static48.aClass394Array1[7]);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!oaa;Lclient!ke;IIILclient!ha;)Z")
	public static boolean method4619(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class4_Sub30 arg1, @OriginalArg(5) Class33 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray462 != null) {
			local9 = (Static154.anInt432 - Static154.anInt430) * (arg0.anInt6658 + arg1.anInt4799 - Static154.anInt438) / (Static154.anInt435 - Static154.anInt438) + Static154.anInt430;
			local7 = (Static154.anInt432 - Static154.anInt430) * (arg1.anInt4799 + arg0.anInt6666 - Static154.anInt438) / (Static154.anInt435 - Static154.anInt438) + Static154.anInt430;
			local13 = Static154.anInt436 - (arg1.anInt4798 + arg0.anInt6660 - Static154.anInt429) * (Static154.anInt436 - Static154.anInt431) / (Static154.anInt434 - Static154.anInt429);
			local11 = Static154.anInt436 - (Static154.anInt436 - Static154.anInt431) * (arg1.anInt4798 + arg0.anInt6676 - Static154.anInt429) / (Static154.anInt434 - Static154.anInt429);
		}
		@Pc(97) Class17 local97 = null;
		@Pc(99) int local99 = 0;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		if (arg0.anInt6678 != -1) {
			if (arg1.aBoolean357 && arg0.anInt6682 != -1) {
				local97 = arg0.method5862(arg2, true);
			} else {
				local97 = arg0.method5862(arg2, false);
			}
			if (local97 != null) {
				local99 = arg1.anInt4801 - (local97.method5256() + 1 >> 1);
				local101 = arg1.anInt4801 + (local97.method5256() + 1 >> 1);
				if (local99 < local7) {
					local7 = local99;
				}
				local103 = arg1.anInt4796 - (local97.method5251() + 1 >> 1);
				if (local101 > local9) {
					local9 = local101;
				}
				local105 = arg1.anInt4796 + (local97.method5251() + 1 >> 1);
				if (local11 > local103) {
					local11 = local103;
				}
				if (local13 < local105) {
					local13 = local105;
				}
			}
		}
		@Pc(201) Class157 local201 = null;
		@Pc(203) int local203 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(306) int local306;
		if (arg0.aString80 != null) {
			local201 = Static208.method3120(arg0.anInt6685);
			if (local201 != null) {
				local203 = Static321.aClass31_5.method1023((int[]) null, arg0.aString80, Static326.aStringArray25, (Class17[]) null);
				local215 = arg1.anInt4801 + (Static154.anInt432 - Static154.anInt430) * arg0.anInt6665 / (Static154.anInt435 - Static154.anInt438);
				local217 = arg1.anInt4796 - (Static154.anInt436 - Static154.anInt431) * arg0.anInt6673 / (Static154.anInt434 - Static154.anInt429);
				if (local97 == null) {
					local217 -= local201.method3375() * local203 / 2;
				} else {
					local217 -= (local97.method5251() >> 1) + local203 * local201.method3373();
				}
				for (local306 = 0; local306 < local203; local306++) {
					@Pc(312) String local312 = Static326.aStringArray25[local306];
					if (local306 < local203 - 1) {
						local312 = local312.substring(0, local312.length() - 4);
					}
					@Pc(329) int local329 = local201.method3370(local312);
					if (local219 < local329) {
						local219 = local329;
					}
				}
				local221 = local215 - local219 / 2;
				if (local221 < local7) {
					local7 = local221;
				}
				local223 = local219 / 2 + local215;
				local225 = local217;
				if (local223 > local9) {
					local9 = local223;
				}
				local227 = local201.method3373() * local203 + local217;
				if (local225 < local11) {
					local11 = local225;
				}
				if (local13 < local227) {
					local13 = local227;
				}
			}
		}
		if (local9 < Static154.anInt430 || local7 > Static154.anInt432 || local13 < Static154.anInt431 || local11 > Static154.anInt436) {
			return true;
		}
		Static154.method460(arg2, arg1, arg0);
		if (local97 != null) {
			if (Static215.anInt3479 > 0 && (Static591.anInt9102 != -1 && Static591.anInt9102 == arg1.anInt4794 || Static294.anInt4646 != -1 && arg0.anInt6670 == Static294.anInt4646)) {
				if (Static300.anInt4711 > 50) {
					local306 = 200 - Static300.anInt4711 * 2;
				} else {
					local306 = Static300.anInt4711 * 2;
				}
				@Pc(489) int local489 = local306 << 24 | 0xFFFF00;
				arg2.method8079(arg1.anInt4796, local489, arg1.anInt4801, local97.method5268() / 2 + 7);
				arg2.method8079(arg1.anInt4796, local489, arg1.anInt4801, local97.method5268() / 2 + 5);
				arg2.method8079(arg1.anInt4796, local489, arg1.anInt4801, local97.method5268() / 2 + 3);
				arg2.method8079(arg1.anInt4796, local489, arg1.anInt4801, local97.method5268() / 2 + 1);
				arg2.method8079(arg1.anInt4796, local489, arg1.anInt4801, local97.method5268() / 2);
			}
			local97.method5246(arg1.anInt4801 - (local97.method5256() >> 1), arg1.anInt4796 + -(local97.method5251() >> 1));
		}
		if (arg0.aString80 != null && local201 != null) {
			Static580.method7648(local215, local203, local219, arg0, arg1, arg2, local217, local201);
		}
		if (arg0.anInt6678 != -1 || arg0.aString80 != null) {
			@Pc(603) Class4_Sub32 local603 = new Class4_Sub32(arg1);
			local603.anInt5361 = local225;
			local603.anInt5362 = local105;
			local603.anInt5354 = local227;
			local603.anInt5356 = local221;
			local603.anInt5359 = local99;
			local603.anInt5357 = local101;
			local603.anInt5358 = local223;
			local603.anInt5353 = local103;
			Static600.aClass163_64.method3646(local603);
		}
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
	public static void method4620() {
		Static205.aClient1.method1585();
		Static419.method5754();
		Static650.aClass151_220 = null;
		Static163.anInt2980 = 0;
		Static179.anInt3120 = 0;
		Static568.aClass151_190 = null;
		Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
		Static86.aClass151_42 = null;
		Static368.method4804();
		Static348.aString69 = null;
		Static345.aClass267_4 = null;
		Static140.aClass267_5 = null;
		Static547.aClass275Array1 = null;
		Static596.anInt9157 = 0;
		Static450.anInt7035 = 0;
		Static517.anInt8054 = 0;
	}
}
