import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ufa", name = "H", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!ufa", name = "I", descriptor = "I")
	public static int anInt9777 = 0;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(IB)I")
	public static int method8265(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(IB)V")
	public static void method8267() {
		Static194.anInt3305 = -1;
		Static589.aClass8_129 = null;
		Static471.aClass6_Sub8_Sub4_9 = null;
		Static335.anInt5754 = 2;
		Static382.anInt6400 = 0;
		Static338.anInt5833 = 1;
		Static363.anInt6191 = -1;
		Static459.aBoolean514 = false;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLclient!sha;ILclient!ha;I)V")
	public static void method8268(@OriginalArg(1) Class321 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1 local10 = arg0.method7689(arg2);
		if (local10 == null) {
			return;
		}
		arg2.KA(arg3, arg1, arg3 + arg0.anInt9103, arg1 - -arg0.anInt9077);
		if (Static426.anInt7557 == 2 || Static426.anInt7557 == 5 || Static402.aClass9_27 == null) {
			arg2.A(-16777216, local10, arg3, arg1);
			return;
		}
		@Pc(60) int local60;
		@Pc(50) int local50;
		@Pc(69) int local69;
		@Pc(57) int local57;
		if (Static407.anInt6820 == 4) {
			local57 = 4096;
			local69 = (int) -Static228.aFloat26 & 0x3FFF;
			local60 = Static555.anInt9303;
			local50 = Static502.anInt8454;
		} else {
			local50 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001;
			local57 = 4096 - Static605.anInt9842 * 16;
			local60 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006;
			local69 = (int) -Static228.aFloat26 + Static553.anInt9285 & 0x3FFF;
		}
		@Pc(97) int local97 = local60 / 128 + 48 + 208 - Static491.anInt9856 * 2;
		@Pc(114) int local114 = Static393.anInt6574 * 4 + 48 + 208 - local50 / 128 - Static393.anInt6574 * 2;
		Static402.aClass9_27.method8914((float) arg0.anInt9103 / 2.0F + (float) arg3, (float) arg0.anInt9077 / 2.0F + (float) arg1, (float) local97, (float) local114, local57, local69 << 2, local10, arg3, arg1);
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(186) int local186;
		@Pc(197) int local197;
		for (@Pc(148) Class6_Sub36 local148 = (Class6_Sub36) Static30.aClass362_2.method8538(); local148 != null; local148 = (Class6_Sub36) Static30.aClass362_2.method8530()) {
			@Pc(153) int local153 = local148.anInt5996;
			local165 = (Static297.aClass17_1.anIntArray16[local153] >> 14 & 0x3FFF) - Static534.anInt8753;
			local175 = (Static297.aClass17_1.anIntArray16[local153] & 0x3FFF) - Static234.anInt4239;
			local186 = local165 * 4 + 2 - local60 / 128;
			local197 = local175 * 4 + 2 - local50 / 128;
			Static221.method3208(local10, arg0, local186, arg2, local197, Static297.aClass17_1.anIntArray15[local153], arg3, arg1);
		}
		for (local165 = 0; local165 < Static499.anInt8440; local165++) {
			local175 = Static347.anIntArray709[local165] * 4 + 2 - local60 / 128;
			local186 = Static627.anIntArray672[local165] * 4 + 2 - local50 / 128;
			@Pc(253) Class308 local253 = Static411.aClass88_3.method2024(Static115.anIntArray124[local165]);
			if (local253.anIntArray566 != null) {
				local253 = local253.method7297(Static659.aClass363_3);
				if (local253 == null || local253.anInt8620 == -1) {
					continue;
				}
			}
			Static221.method3208(local10, arg0, local175, arg2, local186, local253.anInt8620, arg3, arg1);
		}
		@Pc(336) int local336;
		@Pc(347) int local347;
		for (@Pc(289) Class6_Sub52 local289 = (Class6_Sub52) Static33.aClass209_3.method5037(); local289 != null; local289 = (Class6_Sub52) Static33.aClass209_3.method5036()) {
			local186 = (int) (local289.aLong314 >> 28 & 0x3L);
			if (local186 == Static552.anInt9275) {
				local197 = (int) (local289.aLong314 & 0x3FFFL) - Static534.anInt8753;
				@Pc(326) int local326 = (int) (local289.aLong314 >> 14 & 0x3FFFL) - Static234.anInt4239;
				local336 = local197 * 4 + 2 - local60 / 128;
				local347 = local326 * 4 + 2 - local50 / 128;
				Static474.method6310(local10, local347, Static156.aClass9Array47[0], arg0, arg3, local336, arg1);
			}
		}
		@Pc(433) int local433;
		for (local186 = 0; local186 < Static133.anInt2316; local186++) {
			@Pc(378) Class6_Sub44 local378 = (Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local186]);
			if (local378 != null) {
				@Pc(383) Class2_Sub1_Sub1_Sub3_Sub2 local383 = local378.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				if (local383.method4338() && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 == local383.aByte140) {
					@Pc(395) Class91 local395 = local383.aClass91_1;
					if (local395 != null && local395.anIntArray140 != null) {
						local395 = local395.method2036(Static659.aClass363_3);
					}
					if (local395 != null && local395.aBoolean142 && local395.lb) {
						local347 = local383.anInt10006 / 128 - local60 / 128;
						local433 = local383.anInt10001 / 128 - local50 / 128;
						if (local395.anInt2347 == -1) {
							Static474.method6310(local10, local433, Static156.aClass9Array47[1], arg0, arg3, local347, arg1);
						} else {
							Static221.method3208(local10, arg0, local347, arg2, local433, local395.anInt2347, arg3, arg1);
						}
					}
				}
			}
		}
		local197 = Static475.anInt8165;
		@Pc(474) int[] local474 = Static75.anIntArray82;
		@Pc(521) int local521;
		@Pc(525) int local525;
		@Pc(557) int local557;
		for (local336 = 0; local336 < local197; local336++) {
			@Pc(484) Class2_Sub1_Sub1_Sub3_Sub1 local484 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local474[local336]];
			if (local484 != null && local484.method3520() && !local484.aBoolean257 && local484 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 && local484.aByte140 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140) {
				local433 = local484.anInt10006 / 128 - local60 / 128;
				local521 = local484.anInt10001 / 128 - local50 / 128;
				@Pc(523) boolean local523 = false;
				for (local525 = 0; local525 < Static96.anInt1739; local525++) {
					if (local484.aString45.equals(Static480.aStringArray50[local525]) && Static577.anIntArray643[local525] != 0) {
						local523 = true;
						break;
					}
				}
				@Pc(555) boolean local555 = false;
				for (local557 = 0; local557 < Static619.anInt10114; local557++) {
					if (local484.aString45.equals(Static365.aClass232Array1[local557].aString86)) {
						local555 = true;
						break;
					}
				}
				@Pc(577) boolean local577 = false;
				if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4178 != 0 && local484.anInt4178 != 0 && local484.anInt4178 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4178) {
					local577 = true;
				}
				if (local484.aBoolean260) {
					Static474.method6310(local10, local521, Static156.aClass9Array47[6], arg0, arg3, local433, arg1);
				} else if (local577) {
					Static474.method6310(local10, local521, Static156.aClass9Array47[4], arg0, arg3, local433, arg1);
				} else if (local484.aBoolean258) {
					Static474.method6310(local10, local521, Static156.aClass9Array47[7], arg0, arg3, local433, arg1);
				} else if (local523) {
					Static474.method6310(local10, local521, Static156.aClass9Array47[3], arg0, arg3, local433, arg1);
				} else if (local555) {
					Static474.method6310(local10, local521, Static156.aClass9Array47[5], arg0, arg3, local433, arg1);
				} else {
					Static474.method6310(local10, local521, Static156.aClass9Array47[2], arg0, arg3, local433, arg1);
				}
			}
		}
		@Pc(691) Class167[] local691 = Static539.aClass167Array1;
		@Pc(778) int local778;
		for (local433 = 0; local433 < local691.length; local433++) {
			@Pc(699) Class167 local699 = local691[local433];
			if (local699 != null && local699.anInt4342 != 0 && Static90.anInt1698 % 20 < 10) {
				@Pc(741) int local741;
				if (local699.anInt4342 == 1) {
					@Pc(726) Class6_Sub44 local726 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local699.anInt4346);
					if (local726 != null) {
						@Pc(731) Class2_Sub1_Sub1_Sub3_Sub2 local731 = local726.aClass2_Sub1_Sub1_Sub3_Sub2_2;
						local741 = local731.anInt10006 / 128 - local60 / 128;
						local557 = local731.anInt10001 / 128 - local50 / 128;
						Static112.method1780(local699.anInt4341, arg1, arg3, 360000L, arg0, local557, local10, local741);
					}
				}
				if (local699.anInt4342 == 2) {
					local778 = local699.anInt4348 / 128 - local60 / 128;
					local525 = local699.anInt4344 / 128 - local50 / 128;
					@Pc(794) long local794 = (long) (local699.anInt4336 << 7);
					@Pc(798) long local798 = local794 * local794;
					Static112.method1780(local699.anInt4341, arg1, arg3, local798, arg0, local525, local10, local778);
				}
				if (local699.anInt4342 == 10 && local699.anInt4346 >= 0 && Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1.length > local699.anInt4346) {
					@Pc(835) Class2_Sub1_Sub1_Sub3_Sub1 local835 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local699.anInt4346];
					if (local835 != null) {
						local525 = local835.anInt10006 / 128 - local60 / 128;
						local741 = local835.anInt10001 / 128 - local50 / 128;
						Static112.method1780(local699.anInt4341, arg1, arg3, 360000L, arg0, local741, local10, local525);
					}
				}
			}
		}
		if (Static407.anInt6820 == 4) {
			return;
		}
		if (Static566.anInt9418 != 0) {
			local521 = Static566.anInt9418 * 4 + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() + -1) * 2 + 2 - local60 / 128;
			local778 = Static508.anInt9992 * 4 + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() - 1) * 2 + 2 - local50 / 128;
			Static474.method6310(local10, local778, Static566.aClass9Array152[Static291.aBoolean316 ? 1 : 0], arg0, arg3, local521, arg1);
		}
		if (!Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aBoolean257) {
			arg2.method7512(3, 3, arg0.anInt9103 / 2 + arg3 - 1, arg1 + -1 + arg0.anInt9077 / 2, -1);
			return;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIILclient!wc;)Z")
	public static boolean method8269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub2 arg3) {
		if (!Static267.aBoolean292 || !Static322.aBoolean345) {
			return false;
		} else if (Static339.anInt5857 < 100) {
			return false;
		} else if (Static354.method5134(arg1, arg2, arg0)) {
			@Pc(36) int local36 = arg1 << Static185.anInt3178;
			@Pc(40) int local40 = arg2 << Static185.anInt3178;
			@Pc(50) int local50 = Static289.aClass12Array3[arg0].method7846(arg1, arg2) - 1;
			@Pc(56) int local56 = local50 + arg3.method8444();
			if (arg3.aShort27 == 1) {
				if (!Static641.method8755(local40, local36, local36, local50, local36, local56, local56, local40 + Static655.anInt10510, local40)) {
					return false;
				} else if (Static641.method8755(local40, local36, local36, local50, local36, local56, local50, Static655.anInt10510 + local40, local40 + Static655.anInt10510)) {
					Static428.anInt7351++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort27 == 2) {
				if (!Static641.method8755(local40 + Static655.anInt10510, local36, local36, local50, local36 + Static655.anInt10510, local56, local56, local40 + Static655.anInt10510, local40 + Static655.anInt10510)) {
					return false;
				} else if (Static641.method8755(local40 + Static655.anInt10510, local36, local36 + Static655.anInt10510, local50, Static655.anInt10510 + local36, local50, local56, Static655.anInt10510 + local40, local40 - -Static655.anInt10510)) {
					Static428.anInt7351++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort27 == 4) {
				if (!Static641.method8755(local40, Static655.anInt10510 + local36, Static655.anInt10510 + local36, local50, Static655.anInt10510 + local36, local56, local56, local40 + Static655.anInt10510, local40)) {
					return false;
				} else if (Static641.method8755(local40, Static655.anInt10510 + local36, Static655.anInt10510 + local36, local50, Static655.anInt10510 + local36, local56, local50, local40 + Static655.anInt10510, Static655.anInt10510 + local40)) {
					Static428.anInt7351++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort27 == 8) {
				if (!Static641.method8755(local40, local36, local36, local50, Static655.anInt10510 + local36, local56, local56, local40, local40)) {
					return false;
				} else if (Static641.method8755(local40, local36, local36 + Static655.anInt10510, local50, local36 + Static655.anInt10510, local50, local56, local40, local40)) {
					Static428.anInt7351++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort27 == 16) {
				if (Static602.method8296(local50, Static625.anInt10177, local56, Static625.anInt10177 + local40, local36, Static625.anInt10177)) {
					Static428.anInt7351++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort27 == 32) {
				if (Static602.method8296(local50, Static625.anInt10177, local56, Static625.anInt10177 + local40, Static625.anInt10177 + local36, Static625.anInt10177)) {
					Static428.anInt7351++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort27 == 64) {
				if (Static602.method8296(local50, Static625.anInt10177, local56, local40, Static625.anInt10177 + local36, Static625.anInt10177)) {
					Static428.anInt7351++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort27 != 128) {
				return true;
			} else if (Static602.method8296(local50, Static625.anInt10177, local56, local40, local36, Static625.anInt10177)) {
				Static428.anInt7351++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
