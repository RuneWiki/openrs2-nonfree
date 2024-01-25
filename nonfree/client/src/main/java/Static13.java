import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
	public static int anInt486 = 999999;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
	public static int anInt489 = 3;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!pd;Lclient!na;ZIILclient!uo;)Z")
	public static boolean method379(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(5) Class32 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray381 != null) {
			local11 = Static79.anInt4160 - (Static79.anInt4160 - Static79.anInt4167) * (arg0.anInt4774 + arg1.anInt4230 - Static79.anInt4166) / (Static79.anInt4168 - Static79.anInt4166);
			local9 = Static79.anInt4163 + (arg1.anInt4232 + arg0.anInt4779 - Static79.anInt4159) * (-Static79.anInt4163 + Static79.anInt4164) / (Static79.anInt4161 - Static79.anInt4159);
			local7 = Static79.anInt4163 + (arg1.anInt4229 + arg0.anInt4779 - Static79.anInt4159) * (-Static79.anInt4163 + Static79.anInt4164) / (Static79.anInt4161 - Static79.anInt4159);
			local13 = Static79.anInt4160 - (Static79.anInt4160 - Static79.anInt4167) * (arg0.anInt4774 + (arg1.anInt4243 - Static79.anInt4166)) / (Static79.anInt4168 - Static79.anInt4166);
		}
		@Pc(101) Class5 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (arg1.anInt4245 != -1) {
			if (arg0.aBoolean461 && arg1.anInt4219 != -1) {
				local101 = arg1.method3818(true, arg2);
			} else {
				local101 = arg1.method3818(false, arg2);
			}
			if (local101 != null) {
				local103 = arg0.anInt4781 - (local101.method3632() + 1 >> 1);
				local105 = arg0.anInt4781 + (local101.method3632() + 1 >> 1);
				if (local7 > local103) {
					local7 = local103;
				}
				local107 = arg0.anInt4782 - (local101.method3630() + 1 >> 1);
				if (local105 > local9) {
					local9 = local105;
				}
				if (local11 > local107) {
					local11 = local107;
				}
				local109 = arg0.anInt4782 + (local101.method3630() + 1 >> 1);
				if (local109 > local13) {
					local13 = local109;
				}
			}
		}
		@Pc(205) Class106 local205 = null;
		@Pc(207) int local207 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(279) int local279;
		@Pc(306) int local306;
		if (arg1.aString37 != null) {
			local205 = Static191.method3706(arg1.anInt4233);
			if (local205 != null) {
				local207 = Static26.aClass63_2.method1745(Static92.aStringArray33, null, null, arg1.aString37);
				local215 = arg0.anInt4782;
				if (local101 == null) {
					local215 -= local207 * local205.method2848() / 2;
				} else {
					local215 -= (local101.method3630() >> 1) + (local205.method2842() * local207);
				}
				for (local279 = 0; local279 < local207; local279++) {
					@Pc(285) String local285 = Static92.aStringArray33[local279];
					if (local279 < local207 - 1) {
						local285 = local285.substring(0, local285.length() - 4);
					}
					local306 = local205.method2846(local285);
					if (local217 < local306) {
						local217 = local306;
					}
				}
				local219 = arg0.anInt4781 - local217 / 2;
				if (local7 > local219) {
					local7 = local219;
				}
				local221 = arg0.anInt4781 + local217 / 2;
				local223 = local215;
				if (local9 < local221) {
					local9 = local221;
				}
				if (local11 > local223) {
					local11 = local223;
				}
				local225 = local215 + local205.method2842() * local207;
				if (local225 > local13) {
					local13 = local225;
				}
			}
		}
		if (local9 < Static79.anInt4163 || Static79.anInt4164 < local7 || local13 < Static79.anInt4167 || Static79.anInt4160 < local11) {
			return true;
		}
		@Pc(417) int local417;
		if (arg1.anIntArray381 != null) {
			@Pc(415) int[] local415 = new int[arg1.anIntArray381.length];
			for (local417 = 0; local417 < local415.length / 2; local417++) {
				local306 = arg1.anIntArray381[local417 * 2] + arg0.anInt4779;
				@Pc(442) int local442 = arg1.anIntArray381[local417 * 2 + 1] + arg0.anInt4774;
				local415[local417 * 2] = Static79.anInt4163 + (Static79.anInt4164 - Static79.anInt4163) * (local306 - Static79.anInt4159) / (Static79.anInt4161 - Static79.anInt4159);
				local415[local417 * 2 + 1] = Static79.anInt4160 - (Static79.anInt4160 - Static79.anInt4167) * (-Static79.anInt4166 + local442) / (Static79.anInt4168 - Static79.anInt4166);
			}
			Static217.method4137(arg2, local415, arg1.anInt4235);
			for (local306 = 0; local306 < local415.length / 2 - 1; local306++) {
				arg2.method2185(local415[local306 * 2 + 1 + 2], local415[local306 * 2], arg1.anInt4215, local415[local306 * 2 + 1], local415[(local306 + 1) * 2]);
			}
			arg2.method2185(local415[1], local415[local415.length - 2], arg1.anInt4215, local415[local415.length - 1], local415[0]);
		}
		if (local101 != null) {
			if (Static339.anInt6507 > 0 && (Static128.anInt6686 != -1 && arg0.anInt4777 == Static128.anInt6686 || Static259.anInt2903 != -1 && arg1.anInt4246 == Static259.anInt2903)) {
				if (Static139.anInt4713 > 50) {
					local279 = (100 - Static139.anInt4713) * 2;
				} else {
					local279 = Static139.anInt4713 * 2;
				}
				local417 = local279 << 24 | 0xFFFF00;
				arg2.method2205(arg0.anInt4782, arg0.anInt4781, local417, local101.method3629() / 2 + 7);
				arg2.method2205(arg0.anInt4782, arg0.anInt4781, local417, local101.method3629() / 2 + 5);
				arg2.method2205(arg0.anInt4782, arg0.anInt4781, local417, local101.method3629() / 2 + 3);
				arg2.method2205(arg0.anInt4782, arg0.anInt4781, local417, local101.method3629() / 2 + 1);
				arg2.method2205(arg0.anInt4782, arg0.anInt4781, local417, local101.method3629() / 2);
			}
			local101.method3621(arg0.anInt4781 - (local101.method3632() >> 1), arg0.anInt4782 + -(local101.method3630() >> 1));
		}
		if (arg1.aString37 != null && local205 != null) {
			Static54.method1417(local215, arg2, arg1, local205, local207, arg0, local217);
		}
		if (arg1.anInt4245 != -1 || arg1.aString37 != null) {
			@Pc(723) Class1_Sub28 local723 = new Class1_Sub28(arg0);
			local723.anInt5212 = local105;
			local723.anInt5219 = local221;
			local723.anInt5208 = local107;
			local723.anInt5215 = local225;
			local723.anInt5221 = local223;
			local723.anInt5210 = local103;
			local723.anInt5207 = local219;
			local723.anInt5220 = local109;
			Static280.aClass16_32.method416(local723);
		}
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIB)Z")
	public static boolean method380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface5 local9 = (Interface5) Static352.method5612(arg0, arg1, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static76.method1726(local9) & true;
		}
		local9 = (Interface5) Static258.method4649(arg0, arg1, arg2, ol.class);
		if (local9 != null) {
			local11 &= Static76.method1726(local9);
		}
		local9 = (Interface5) Static127.method2619(arg0, arg1, arg2);
		if (local9 != null) {
			local11 &= Static76.method1726(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Lclient!oo;")
	public static Class104_Sub1 method381() {
		anInt486 = 0;
		return Static224.method4192();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!aq;II)V")
	public static void method382(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static238.anInt4919 = arg1;
		Static243.aClass12_14 = arg0;
		Static334.anInt6416 = arg2;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!bg;B)Lclient!rl;")
	public static Class14_Sub2 method383(@OriginalArg(0) Class1_Sub8 arg0) {
		return new Class14_Sub2(arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4514(), arg0.method4532());
	}
}
