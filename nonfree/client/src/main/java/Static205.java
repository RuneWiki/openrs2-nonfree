import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "Lclient!db;")
	public static Class31 aClass31_31 = new Class31(64);

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
	public static int anInt4083 = 0;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[1000][];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)Lclient!oc;")
	public static Class1_Sub2_Sub13 method3208() {
		return Static188.aClass1_Sub2_Sub13_2;
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
	public static void method3209() {
		for (@Pc(3) int local3 = 0; local3 < Static292.anInt5804; local3++) {
			@Pc(10) Class164 local10 = Static173.method2623(local3);
			if (local10 != null && local10.anInt5451 == 0) {
				Static236.anIntArray578[local3] = 0;
				Static224.anIntArray535[local3] = 0;
			}
		}
		Static278.aClass22_21 = new Class22(16);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[Lclient!og;I)V")
	public static void method3212(@OriginalArg(0) int arg0, @OriginalArg(1) Class127[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(19) Class127 local19 = arg1[local7];
			if (local19 != null) {
				if (local19.anInt3570 == 0) {
					if (local19.aClass127Array1 != null) {
						method3212(arg0, local19.aClass127Array1);
					}
					@Pc(48) Class1_Sub32 local48 = (Class1_Sub32) Static67.aClass22_7.method633((long) local19.anInt3574);
					if (local48 != null) {
						Static244.method3859(arg0, local48.anInt5665);
					}
				}
				@Pc(67) Class1_Sub20 local67;
				if (arg0 == 0 && local19.anObjectArray7 != null) {
					local67 = new Class1_Sub20();
					local67.aClass127_9 = local19;
					local67.anObjectArray2 = local19.anObjectArray7;
					Static283.method4321(local67);
				}
				if (arg0 == 1 && local19.anObjectArray12 != null) {
					if (local19.anInt3573 >= 0) {
						@Pc(93) Class127 local93 = Static75.method1287(local19.anInt3574);
						if (local93 == null || local93.aClass127Array1 == null || local19.anInt3573 >= local93.aClass127Array1.length || local93.aClass127Array1[local19.anInt3573] != local19) {
							continue;
						}
					}
					local67 = new Class1_Sub20();
					local67.aClass127_9 = local19;
					local67.anObjectArray2 = local19.anObjectArray12;
					Static283.method4321(local67);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII)V")
	public static void method3213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(14) int local14 = arg1 - arg4;
		if (local9 == 0) {
			if (local14 != 0) {
				Static71.method1173(arg3, arg0, arg4, arg1);
			}
		} else if (local14 == 0) {
			Static76.method1297(arg0, arg2, arg4, arg3);
		} else {
			@Pc(45) int local45 = (local14 << 12) / local9;
			@Pc(60) int local60 = arg4 - (local45 * arg0 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (arg0 < Static245.anInt1237) {
				local71 = (local45 * Static245.anInt1237 >> 12) + local60;
				local73 = Static245.anInt1237;
			} else if (arg0 > Static28.anInt606) {
				local73 = Static28.anInt606;
				local71 = (Static28.anInt606 * local45 >> 12) + local60;
			} else {
				local73 = arg0;
				local71 = arg4;
			}
			if (Static24.anInt556 > local71) {
				local71 = Static24.anInt556;
				local73 = (Static24.anInt556 - local60 << 12) / local45;
			} else if (local71 > Static284.anInt5643) {
				local71 = Static284.anInt5643;
				local73 = (Static284.anInt5643 - local60 << 12) / local45;
			}
			@Pc(137) int local137;
			@Pc(135) int local135;
			if (arg2 < Static245.anInt1237) {
				local135 = (Static245.anInt1237 * local45 >> 12) + local60;
				local137 = Static245.anInt1237;
			} else if (arg2 > Static28.anInt606) {
				local137 = Static28.anInt606;
				local135 = local60 + (local45 * Static28.anInt606 >> 12);
			} else {
				local135 = arg1;
				local137 = arg2;
			}
			if (Static24.anInt556 > local135) {
				local137 = (Static24.anInt556 - local60 << 12) / local45;
				local135 = Static24.anInt556;
			} else if (Static284.anInt5643 < local135) {
				local135 = Static284.anInt5643;
				local137 = (Static284.anInt5643 - local60 << 12) / local45;
			}
			Static224.method3589(local73, local135, local137, local71, arg3);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(14) int local14 = arg0 - arg5;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg1 - arg5;
		@Pc(25) int local25 = local21 * local21;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = arg1 * arg1;
		@Pc(41) int local41 = local14 * local14;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local41 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = local14 << 1;
		@Pc(61) int local61 = local25 << 1;
		@Pc(65) int local65 = arg0 << 1;
		@Pc(73) int local73 = local29 - (local65 - 1) * local53;
		@Pc(81) int local81 = local49 + local25 * (1 - local57);
		@Pc(90) int local90 = local41 - (local57 - 1) * local61;
		@Pc(100) int local100 = local33 * (1 - local65) + local45;
		@Pc(104) int local104 = local25 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local45 * 3;
		@Pc(116) int local116 = local29 << 2;
		@Pc(120) int local120 = local41 << 2;
		@Pc(126) int local126 = local53 * (local65 - 3);
		@Pc(132) int local132 = local61 * (local57 - 3);
		@Pc(134) int local134 = local116;
		@Pc(138) int local138 = local49 * 3;
		@Pc(140) int local140 = local120;
		@Pc(146) int local146 = (local14 - 1) * local104;
		@Pc(152) int local152 = local108 * (arg0 - 1);
		@Pc(172) int local172;
		@Pc(181) int local181;
		@Pc(190) int local190;
		@Pc(198) int local198;
		if (arg2 >= Static24.anInt556 && Static284.anInt5643 >= arg2) {
			@Pc(163) int[] local163 = Static151.anIntArrayArray26[arg2];
			local172 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg3 - arg1);
			local181 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg3 + arg1);
			local190 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg3 - local21);
			local198 = Static45.method818(Static28.anInt606, Static245.anInt1237, local21 + arg3);
			Static288.method4405(arg4, local190, local172, local163);
			Static288.method4405(arg6, local198, local190, local163);
			Static288.method4405(arg4, local181, local198, local163);
		}
		while (local9 > 0) {
			if (local100 < 0) {
				while (local100 < 0) {
					local16++;
					local73 += local134;
					local134 += local116;
					local100 += local112;
					local112 += local116;
				}
			}
			if (local73 < 0) {
				local16++;
				local73 += local134;
				local134 += local116;
				local100 += local112;
				local112 += local116;
			}
			local100 += -local152;
			local73 += -local126;
			local126 -= local108;
			@Pc(295) boolean local295 = local9 <= local14;
			local9--;
			local152 -= local108;
			if (local295) {
				if (local81 < 0) {
					while (local81 < 0) {
						local90 += local140;
						local140 += local120;
						local7++;
						local81 += local138;
						local138 += local120;
					}
				}
				if (local90 < 0) {
					local90 += local140;
					local140 += local120;
					local81 += local138;
					local7++;
					local138 += local120;
				}
				local90 += -local132;
				local81 += -local146;
				local146 -= local104;
				local132 -= local104;
			}
			local172 = arg2 - local9;
			local181 = local9 + arg2;
			if (local181 >= Static24.anInt556 && local172 <= Static284.anInt5643) {
				local190 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg3 + local16);
				local198 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg3 - local16);
				if (local295) {
					@Pc(442) int local442 = Static45.method818(Static28.anInt606, Static245.anInt1237, local7 + arg3);
					@Pc(451) int local451 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg3 - local7);
					@Pc(463) int[] local463;
					if (Static24.anInt556 <= local172) {
						local463 = Static151.anIntArrayArray26[local172];
						Static288.method4405(arg4, local451, local198, local463);
						Static288.method4405(arg6, local442, local451, local463);
						Static288.method4405(arg4, local190, local442, local463);
					}
					if (local181 <= Static284.anInt5643) {
						local463 = Static151.anIntArrayArray26[local181];
						Static288.method4405(arg4, local451, local198, local463);
						Static288.method4405(arg6, local442, local451, local463);
						Static288.method4405(arg4, local190, local442, local463);
					}
				} else {
					if (Static24.anInt556 <= local172) {
						Static288.method4405(arg4, local190, local198, Static151.anIntArrayArray26[local172]);
					}
					if (Static284.anInt5643 >= local181) {
						Static288.method4405(arg4, local190, local198, Static151.anIntArrayArray26[local181]);
					}
				}
			}
		}
	}
}
