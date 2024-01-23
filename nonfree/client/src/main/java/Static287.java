import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
	public static int anInt5392;

	@OriginalMember(owner = "client!ul", name = "V", descriptor = "Lclient!tg;")
	public static Class4_Sub31 aClass4_Sub31_2;

	@OriginalMember(owner = "client!ul", name = "M", descriptor = "Lclient!cc;")
	public static Class26 aClass26_55 = new Class26(64);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!wf;IIIII)V")
	public static void method4397(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class83 local10 = Static142.method2192(arg3);
		if (local10 == null || !local10.aBoolean155 || !local10.method1811()) {
			return;
		}
		@Pc(34) int local34;
		if (local10.anIntArray188 != null) {
			@Pc(32) int[] local32 = new int[local10.anIntArray188.length];
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				@Pc(48) int local48 = (int) Static202.aFloat97 + Static269.anInt3585 & 0x7FF;
				@Pc(52) int local52 = Class111.anIntArray298[local48];
				@Pc(60) int local60 = local52 * 256 / (Static250.anInt4762 + 256);
				@Pc(64) int local64 = Class111.anIntArray299[local48];
				@Pc(72) int local72 = local64 * 256 / (Static250.anInt4762 + 256);
				local32[local34 * 2] = arg2 + arg1.anInt5897 / 2 + ((arg5 - -(local10.anIntArray188[local34 * 2 + 1] * 4)) * local72 + local60 * (arg4 - -(local10.anIntArray188[local34 * 2] * 4)) >> 16);
				local32[local34 * 2 + 1] = arg0 + arg1.anInt5953 / 2 - (local60 * (arg5 + local10.anIntArray188[local34 * 2 + 1] * 4) - local72 * (arg4 + local10.anIntArray188[local34 * 2] * 4) >> 16);
			}
			if (Static94.aBoolean138) {
				Static106.method1739(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			} else {
				Static95.method1630(local32, local10.anInt2283, local10.anInt2283 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
			for (local34 = 0; local34 < local32.length / 2 - 1; local34++) {
				if (Static94.aBoolean138) {
					Static104.method1690(local32[local34 * 2], local32[local34 * 2 + 1], local32[(local34 + 1) * 2], local32[local34 * 2 + 1 + 2], local10.anInt2266, local10.anInt2266 >>> 24, (Class4_Sub3_Sub14_Sub2) arg1.method4766(false));
				} else {
					Static270.method4256(local32[local34 * 2], local32[local34 * 2 + 1], local32[local34 * 2 + 2], local32[local34 * 2 + 3], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
				}
			}
			if (Static94.aBoolean138) {
				Static104.method1690(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, (Class4_Sub3_Sub14_Sub2) arg1.method4766(false));
			} else {
				Static270.method4256(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt2266, local10.anInt2266 >>> 24, arg1.anIntArray672, arg1.anIntArray657);
			}
		}
		@Pc(356) Class56 local356 = null;
		if (local10.anInt2277 != -1) {
			local356 = local10.method1812(false, false);
			if (local356 != null) {
				Static244.method3817(local356, arg2, arg1, arg4, arg5, arg0);
			}
		}
		if (local10.aString131 == null) {
			return;
		}
		local34 = 0;
		@Pc(386) Class4_Sub3_Sub5 local386 = Static32.aClass4_Sub3_Sub5_1;
		if (local10.anInt2270 == 1) {
			local386 = Static197.aClass4_Sub3_Sub5_2;
		}
		if (local10.anInt2270 == 2) {
			local386 = Static211.aClass4_Sub3_Sub5_3;
		}
		if (local356 != null) {
			local34 = local356.anInt3413;
		}
		Static11.method194(local10.anInt2286, local10.aString131, arg0, arg5, arg2, arg4, local34, local386, arg1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lclient!td;")
	public static Class165 method4398(@OriginalArg(0) int arg0) {
		@Pc(18) Class165 local18 = (Class165) Static189.aClass26_35.method518((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(34) byte[] local34 = Static213.aClass58_81.method1372(Static28.method394(arg0), Static259.method4095(arg0));
		local18 = new Class165();
		local18.anInt5067 = arg0;
		if (local34 != null) {
			local18.method4157(new Class4_Sub10(local34));
		}
		local18.method4164();
		if (local18.anInt5090 != -1) {
			local18.method4159(method4398(local18.anInt5101), method4398(local18.anInt5090));
		}
		if (local18.anInt5078 != -1) {
			local18.method4167(method4398(local18.anInt5068), method4398(local18.anInt5078));
		}
		if (!Static43.aBoolean200 && local18.aBoolean351) {
			local18.aString315 = Static115.aString133;
			local18.aStringArray33 = Static257.aStringArray29;
			local18.aStringArray32 = Static249.aStringArray26;
			local18.anInt5100 = 0;
			local18.aBoolean350 = false;
		}
		Static189.aClass26_35.method510(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
	public static void method4400() {
		Static65.anIntArray97 = Static3.method12(0.4F);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)Lclient!qm;")
	public static Class148 method4401(@OriginalArg(0) int arg0) {
		@Pc(10) Class148 local10 = (Class148) Static258.aClass26_52.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static118.aClass58_52.method1372(29, arg0);
		local10 = new Class148();
		if (local22 != null) {
			local10.method3655(arg0, new Class4_Sub10(local22));
		}
		Static258.aClass26_52.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIIZII)V")
	public static void method4402(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg5 >= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg5) / 2;
		@Pc(17) int local17 = arg5;
		@Pc(21) Class63_Sub1 local21 = Static133.aClass63_Sub1Array2[local15];
		Static133.aClass63_Sub1Array2[local15] = Static133.aClass63_Sub1Array2[arg3];
		Static133.aClass63_Sub1Array2[arg3] = local21;
		for (@Pc(33) int local33 = arg5; local33 < arg3; local33++) {
			if (Static73.method1202(arg2, arg0, local21, arg4, Static133.aClass63_Sub1Array2[local33], arg1) <= 0) {
				@Pc(55) Class63_Sub1 local55 = Static133.aClass63_Sub1Array2[local33];
				Static133.aClass63_Sub1Array2[local33] = Static133.aClass63_Sub1Array2[local17];
				Static133.aClass63_Sub1Array2[local17++] = local55;
			}
		}
		Static133.aClass63_Sub1Array2[arg3] = Static133.aClass63_Sub1Array2[local17];
		Static133.aClass63_Sub1Array2[local17] = local21;
		method4402(arg0, arg1, arg2, local17 - 1, arg4, arg5);
		method4402(arg0, arg1, arg2, arg3, arg4, local17 + 1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!gb;ILclient!gb;Z)I")
	public static int method4403(@OriginalArg(1) Class63_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(11) int local11 = arg2.anInt2023;
			@Pc(14) int local14 = arg0.anInt2023;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static306.method4748(arg0.method1552().aString277, Static9.anInt124, arg2.method1552().aString277);
		} else if (arg1 == 3) {
			if (arg2.aString110.equals("-")) {
				if (arg0.aString110.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString110.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static306.method4748(arg0.aString110, Static9.anInt124, arg2.aString110);
			}
		} else if (arg1 == 4) {
			return arg2.method1542() ? (arg0.method1542() ? 0 : 1) : (arg0.method1542() ? -1 : 0);
		} else if (arg1 == 5) {
			return arg2.method1543() ? (arg0.method1543() ? 0 : 1) : (arg0.method1543() ? -1 : 0);
		} else if (arg1 == 6) {
			return arg2.method1544() ? (arg0.method1544() ? 0 : 1) : (arg0.method1544() ? -1 : 0);
		} else if (arg1 == 7) {
			return arg2.method1540() ? (arg0.method1540() ? 0 : 1) : arg0.method1540() ? -1 : 0;
		} else {
			return arg2.anInt2037 - arg0.anInt2037;
		}
	}
}
