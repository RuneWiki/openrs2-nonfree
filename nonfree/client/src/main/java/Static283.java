import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!wj;IZII)V")
	public static void method4053(@OriginalArg(0) Class1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(27) Class142 local27 = arg0.method6189();
		@Pc(37) int local37 = arg0.anInt7625 - arg0.aClass234_7.anInt6541 & 0x3FFF;
		if (arg2 == -1) {
			if (local37 != 0 || arg0.anInt7583 > 25) {
				arg0.aBoolean507 = false;
				if (arg3 < 0 && local27.anInt4159 != -1) {
					arg0.anInt7586 = local27.anInt4159;
				} else if (arg3 <= 0 || local27.anInt4163 == -1) {
					arg0.anInt7586 = local27.anInt4162;
				} else {
					arg0.anInt7586 = local27.anInt4163;
				}
			} else if (!arg0.aBoolean507 || !local27.method3513(arg0.anInt7586)) {
				arg0.anInt7586 = local27.method3512();
				arg0.aBoolean507 = arg0.anInt7586 != -1;
			}
		} else if (arg0.anInt7580 != -1 && (local37 >= 10240 || local37 <= 2048)) {
			@Pc(129) int local129 = Static406.anIntArray424[arg1] - arg0.aClass234_7.anInt6541 & 0x3FFF;
			if (arg2 == 2 && local27.anInt4153 != -1) {
				if (local129 > 2048 && local129 <= 6144 && local27.anInt4157 != -1) {
					arg0.anInt7586 = local27.anInt4157;
				} else if (local129 >= 10240 && local129 < 14336 && local27.anInt4191 != -1) {
					arg0.anInt7586 = local27.anInt4191;
				} else if (local129 <= 6144 || local129 >= 10240 || local27.anInt4182 == -1) {
					arg0.anInt7586 = local27.anInt4153;
				} else {
					arg0.anInt7586 = local27.anInt4182;
				}
			} else if (arg2 == 0 && local27.anInt4175 != -1) {
				if (local129 > 2048 && local129 <= 6144 && local27.anInt4181 != -1) {
					arg0.anInt7586 = local27.anInt4181;
				} else if (local129 >= 10240 && local129 < 14336 && local27.anInt4195 != -1) {
					arg0.anInt7586 = local27.anInt4195;
				} else if (local129 <= 6144 || local129 >= 10240 || local27.anInt4176 == -1) {
					arg0.anInt7586 = local27.anInt4175;
				} else {
					arg0.anInt7586 = local27.anInt4176;
				}
			} else if (local129 > 2048 && local129 <= 6144 && local27.anInt4170 != -1) {
				arg0.anInt7586 = local27.anInt4170;
			} else if (local129 >= 10240 && local129 < 14336 && local27.anInt4177 != -1) {
				arg0.anInt7586 = local27.anInt4177;
			} else if (local129 <= 6144 || local129 >= 10240 || local27.anInt4166 == -1) {
				arg0.anInt7586 = local27.anInt4162;
			} else {
				arg0.anInt7586 = local27.anInt4166;
			}
			arg0.aBoolean507 = false;
		} else if (local37 == 0 && arg0.anInt7583 <= 25) {
			if (arg2 == 2 && local27.anInt4153 != -1) {
				arg0.anInt7586 = local27.anInt4153;
			} else if (arg2 == 0 && local27.anInt4175 != -1) {
				arg0.anInt7586 = local27.anInt4175;
			} else {
				arg0.anInt7586 = local27.anInt4162;
			}
			arg0.aBoolean507 = false;
		} else {
			if (arg2 == 2 && local27.anInt4153 != -1) {
				if (arg3 < 0 && local27.anInt4164 != -1) {
					arg0.anInt7586 = local27.anInt4164;
				} else if (arg3 <= 0 || local27.anInt4169 == -1) {
					arg0.anInt7586 = local27.anInt4153;
				} else {
					arg0.anInt7586 = local27.anInt4169;
				}
			} else if (arg2 == 0 && local27.anInt4175 != -1) {
				if (arg3 < 0 && local27.anInt4155 != -1) {
					arg0.anInt7586 = local27.anInt4155;
				} else if (arg3 <= 0 || local27.anInt4173 == -1) {
					arg0.anInt7586 = local27.anInt4175;
				} else {
					arg0.anInt7586 = local27.anInt4173;
				}
			} else if (arg3 < 0 && local27.anInt4183 != -1) {
				arg0.anInt7586 = local27.anInt4183;
			} else if (arg3 <= 0 || local27.anInt4186 == -1) {
				arg0.anInt7586 = local27.anInt4162;
			} else {
				arg0.anInt7586 = local27.anInt4186;
			}
			arg0.aBoolean507 = false;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method4054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static178.aClass55Array1 == null) {
			return;
		}
		@Pc(8) Class1_Sub2_Sub6 local8 = null;
		@Pc(17) int local17;
		if (arg4 >= 0) {
			local17 = arg4 - 1;
			@Pc(24) Class3_Sub40 local24 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local17);
			if (local24 != null) {
				local8 = local24.aClass1_Sub2_Sub6_Sub1_2;
			}
		} else {
			local17 = -arg4 - 1;
			if (Static317.anInt5364 == local17) {
				local8 = Static203.aClass1_Sub2_Sub6_Sub2_1;
			} else {
				local8 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local17];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(57) Class31 local57 = Static9.aClass149_1.method3573(arg8);
		@Pc(71) int local71;
		@Pc(68) int local68;
		if (arg1 == 1 || arg1 == 3) {
			local68 = local57.anInt784;
			local71 = local57.anInt786;
		} else {
			local71 = local57.anInt784;
			local68 = local57.anInt786;
		}
		@Pc(86) int local86 = arg12 + (local68 >> 1);
		@Pc(94) int local94 = arg12 + (local68 + 1 >> 1);
		@Pc(100) int local100 = arg6 + (local71 >> 1);
		@Pc(108) int local108 = arg6 + (local71 + 1 >> 1);
		@Pc(112) Class55 local112 = Static178.aClass55Array1[arg10];
		@Pc(137) int local137 = local112.oa(local86, local100) + local112.oa(local94, local100) + local112.oa(local86, local108) + local112.oa(local94, local108) >> 2;
		@Pc(141) Class3_Sub47 local141 = new Class3_Sub47();
		local141.anInt7693 = arg9 + Static172.anInt3107;
		local141.anInt7695 = arg8;
		local141.anInt7690 = arg6;
		local141.anInt7700 = arg1;
		local141.anInt7697 = arg7;
		local141.anInt7701 = Static172.anInt3107 + arg2;
		@Pc(169) int local169;
		if (arg5 < arg3) {
			local169 = arg3;
			arg3 = arg5;
			arg5 = local169;
		}
		local141.anInt7699 = arg12;
		local141.anInt7704 = local8.aByte101;
		local141.anInt7694 = arg5 + arg12;
		if (arg11 < arg0) {
			local169 = arg0;
			arg0 = arg11;
			arg11 = local169;
		}
		local141.anInt7696 = arg12 + arg3;
		local141.anInt7698 = local137;
		local141.anInt7703 = (local141.anInt7699 << 7) + (local68 << 6);
		local141.anInt7706 = arg6 + arg11;
		local141.anInt7707 = (local71 << 6) + (local141.anInt7690 << 7);
		local141.anInt7702 = arg6 + arg0;
		Static70.aClass193_13.method4527(local141);
		local8.aClass3_Sub47_3 = local141;
	}
}
