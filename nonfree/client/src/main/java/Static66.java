import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
	public static int anInt1398;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array4;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Lclient!rg;")
	public static Class177 aClass177_3 = null;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIII)Lclient!jj;")
	public static Class5_Sub3_Sub3 method1368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class204 local11 = Static138.aClass204ArrayArrayArray1[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class5_Sub3_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class17 local27 = local11.aClass17_3; local27 != null; local27 = local27.aClass17_1) {
			@Pc(31) Class5_Sub3 local31 = local27.aClass5_Sub3_1;
			if (local31 instanceof Class5_Sub3_Sub3) {
				@Pc(37) Class5_Sub3_Sub3 local37 = (Class5_Sub3_Sub3) local31;
				@Pc(47) int local47 = (local37.method4541() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt5050 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt5047 - local47 >> 7;
				@Pc(71) int local71 = local37.anInt5050 + local47 >> 7;
				@Pc(78) int local78 = local37.anInt5047 + local47 >> 7;
				if (local55 <= arg2 && arg0 >= local63 && local71 >= arg2 && local78 >= arg0) {
					@Pc(108) int local108 = (local78 + 1 - arg0) * (local71 + 1 + -arg2);
					if (local108 > local19) {
						local17 = local37;
						local19 = local108;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
	public static void method1369() {
		if (Static123.method2195() || Static47.anInt1095 == Static285.anInt5511) {
			Static183.method3574(Static34.aClass2_6);
			if (Static285.anInt5511 != Static129.anInt2515) {
				Static309.method5209();
			}
		} else {
			Static291.method4961(false, Static285.anInt5511, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0], Static51.anInt5042, Static58.anInt1291, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], false);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ne;Lclient!aa;Lclient!u;I)V")
	public static void method1370(@OriginalArg(0) Class1_Sub25 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) Class202 arg2) {
		@Pc(10) Class90 local10 = arg2.method5170(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5471();
		if (local10.method5466() > local16) {
			local16 = local10.method5466();
		}
		@Pc(28) int local28 = arg0.anInt4121;
		@Pc(31) int local31 = arg0.anInt4120;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg2.aString234 != null) {
			local33 = Static95.aClass38_3.method1314(null, null, Static107.aStringArray19, arg2.aString234);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static107.aStringArray19[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static281.aClass16_22.method438(local57);
				if (local74 > local35) {
					local35 = local74;
				}
			}
			local37 = Static281.aClass16_22.method435() * local33 + Static281.aClass16_22.method433() / 2;
		}
		local51 = arg0.anInt4121 + local16 / 2;
		if (local16 + Static342.anInt2145 > local28) {
			local51 = Static342.anInt2145 + local16 / 2 + local35 / 2 + 15;
			local28 = Static342.anInt2145;
		} else if (Static342.anInt2141 - local16 < local28) {
			local28 = Static342.anInt2141 - local16;
			local51 = Static342.anInt2141 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		@Pc(160) int local160 = arg0.anInt4120;
		if (Static342.anInt2142 + local16 > local31) {
			local160 = Static342.anInt2142 + local16 / 2 + 10;
			local31 = Static342.anInt2142;
		} else if (local31 > Static342.anInt2151 - local16) {
			local31 = Static342.anInt2151 - local16;
			local160 = Static342.anInt2151 - local37 - local16 / 2 - 10;
		}
		local74 = (int) ((double) 32767 * (Math.atan2((double) (local28 - arg0.anInt4121), (double) (local31 - arg0.anInt4120)) / 3.141592653589793D)) & 0xFFFF;
		local10.method5461((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(243) int local243 = -2;
		@Pc(245) int local245 = -2;
		@Pc(247) int local247 = -2;
		@Pc(249) int local249 = -2;
		if (arg2.aString234 != null) {
			local243 = local51 - local35 / 2 - 5;
			local245 = local160;
			local249 = local160 + Static281.aClass16_22.method435() * local33 + 3;
			local247 = local35 + local243 + 10;
			if (arg2.anInt5911 != 0) {
				arg1.method3277(local160, local249 - local160, local243, arg2.anInt5911, local247 - local243);
			}
			if (arg2.anInt5896 != 0) {
				arg1.method3269(arg2.anInt5896, local160, local247 - local243, local243, local249 - local160);
			}
			for (@Pc(318) int local318 = 0; local318 < local33; local318++) {
				@Pc(324) String local324 = Static107.aStringArray19[local318];
				if (local318 < local33 - 1) {
					local324 = local324.substring(0, local324.length() - 4);
				}
				Static281.aClass16_22.method436(arg1, local324, local51, local160, arg2.anInt5906);
				local160 += Static281.aClass16_22.method435();
			}
		}
		if (arg2.anInt5886 == -1 && arg2.aString234 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(372) Class1_Sub22 local372 = new Class1_Sub22(arg0);
		local372.anInt3991 = local247;
		local372.anInt3992 = local31 + local16;
		local372.anInt3983 = local16 + local28;
		local372.anInt3984 = local249;
		local372.anInt3989 = local28 - local16;
		local372.anInt3982 = local245;
		local372.anInt3987 = local31 - local16;
		local372.anInt3985 = local243;
		Static185.aClass195_5.method5018(local372);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!cp;")
	public static Class5_Sub3 method1372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class17 local14 = local7.aClass17_3; local14 != null; local14 = local14.aClass17_1) {
			@Pc(18) Class5_Sub3 local18 = local14.aClass5_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort75 == arg1 && local18.aShort77 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
