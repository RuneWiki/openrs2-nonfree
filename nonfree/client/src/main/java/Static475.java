import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6318(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static345.anInt5912 >= 200 && !Static118.aBoolean679 || Static345.anInt5912 >= 200) {
			Static342.method4988(Static114.aClass84_11.method1729(Static654.anInt10668));
			return;
		}
		@Pc(30) String local30 = Static130.method8168(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(35) int local35 = 0; local35 < Static345.anInt5912; local35++) {
			@Pc(43) String local43 = Static130.method8168(Static651.aStringArray66[local35]);
			if (local43 != null && local43.equals(local30)) {
				Static342.method4988(arg0 + Static114.aClass84_38.method1729(Static654.anInt10668));
				return;
			}
			if (Static87.aStringArray15[local35] != null) {
				local74 = Static130.method8168(Static87.aStringArray15[local35]);
				if (local74 != null && local74.equals(local30)) {
					Static342.method4988(arg0 + Static114.aClass84_38.method1729(Static654.anInt10668));
					return;
				}
			}
		}
		for (@Pc(105) int local105 = 0; local105 < Static31.anInt753; local105++) {
			local74 = Static130.method8168(Static137.aStringArray22[local105]);
			if (local74 != null && local74.equals(local30)) {
				Static342.method4988(Static114.aClass84_43.method1729(Static654.anInt10668) + arg0 + Static114.aClass84_44.method1729(Static654.anInt10668));
				return;
			}
			if (Static632.aStringArray64[local105] != null) {
				@Pc(149) String local149 = Static130.method8168(Static632.aStringArray64[local105]);
				if (local149 != null && local149.equals(local30)) {
					Static342.method4988(Static114.aClass84_43.method1729(Static654.anInt10668) + arg0 + Static114.aClass84_44.method1729(Static654.anInt10668));
					return;
				}
			}
		}
		if (Static130.method8168(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25).equals(local30)) {
			Static342.method4988(Static114.aClass84_41.method1729(Static654.anInt10668));
		} else {
			@Pc(209) Class3_Sub37 local209 = Static90.method1509(Static402.aClass240_69, Static226.aClass144_2);
			local209.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(arg0));
			local209.aClass3_Sub4_Sub1_2.method7901(arg0);
			Static301.method2678(local209);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!uq;I)Lclient!c;")
	public static Class3_Sub5_Sub4 method6319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg2.method8368(arg0, arg1));
		@Pc(52) Class3_Sub5_Sub4 local52 = new Class3_Sub5_Sub4(arg1, local19.method7922(), local19.method7922(), local19.method7895(), local19.method7895(), local19.method7954() == 1, local19.method7954(), local19.method7954());
		@Pc(56) int local56 = local19.method7954();
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			local52.aClass302_6.method6613(new Class3_Sub34(local19.method7954(), local19.method7951(), local19.method7951(), local19.method7951(), local19.method7951(), local19.method7951(), local19.method7951(), local19.method7951(), local19.method7951()));
		}
		local52.method1148();
		return local52;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IFFF)I")
	public static int method6320(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(38) float local38 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local21 && local21 > local38) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local38 > local12 && local38 > local21) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z")
	public static boolean method6321(@OriginalArg(1) int arg0) {
		if (arg0 == 45 || arg0 == 20 || arg0 == 22 || arg0 == 58 || arg0 == 50) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIIIII)V")
	public static void method6322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static519.method6752(arg5);
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = arg5 - arg2;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(28) int local28 = arg5;
		@Pc(31) int local31 = -arg5;
		@Pc(33) int local33 = local19;
		@Pc(36) int local36 = -local19;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static276.anIntArrayArray32[arg3];
		@Pc(49) int local49 = arg1 - local19;
		@Pc(53) int local53 = local19 + arg1;
		Static578.method7640(arg4, arg1 - arg5, local49, local44);
		Static578.method7640(arg0, local49, local53, local44);
		Static578.method7640(arg4, local53, arg5 + arg1, local44);
		while (local14 < local28) {
			local38 += 2;
			local40 += 2;
			local31 += local38;
			local36 += local40;
			if (local36 >= 0 && local33 >= 1) {
				Static531.anIntArray443[local33] = local14;
				local33--;
				local36 -= local33 << 1;
			}
			local14++;
			@Pc(126) int[] local126;
			@Pc(133) int[] local133;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local31 >= 0) {
				local28--;
				local31 -= local28 << 1;
				if (local19 > local28) {
					local126 = Static276.anIntArrayArray32[arg3 + local28];
					local133 = Static276.anIntArrayArray32[arg3 - local28];
					local137 = Static531.anIntArray443[local28];
					local142 = arg1 + local14;
					local147 = arg1 - local14;
					local151 = arg1 + local137;
					local156 = arg1 - local137;
					Static578.method7640(arg4, local147, local156, local126);
					Static578.method7640(arg0, local156, local151, local126);
					Static578.method7640(arg4, local151, local142, local126);
					Static578.method7640(arg4, local147, local156, local133);
					Static578.method7640(arg0, local156, local151, local133);
					Static578.method7640(arg4, local151, local142, local133);
				} else {
					local126 = Static276.anIntArrayArray32[arg3 + local28];
					local133 = Static276.anIntArrayArray32[arg3 - local28];
					local137 = arg1 + local14;
					local142 = arg1 - local14;
					Static578.method7640(arg4, local142, local137, local126);
					Static578.method7640(arg4, local142, local137, local133);
				}
			}
			local126 = Static276.anIntArrayArray32[local14 + arg3];
			local133 = Static276.anIntArrayArray32[arg3 - local14];
			local137 = arg1 + local28;
			local142 = arg1 - local28;
			if (local19 <= local14) {
				Static578.method7640(arg4, local142, local137, local126);
				Static578.method7640(arg4, local142, local137, local133);
			} else {
				local147 = local33 < local14 ? Static531.anIntArray443[local14] : local33;
				local151 = arg1 + local147;
				local156 = arg1 - local147;
				Static578.method7640(arg4, local142, local156, local126);
				Static578.method7640(arg0, local156, local151, local126);
				Static578.method7640(arg4, local151, local137, local126);
				Static578.method7640(arg4, local142, local156, local133);
				Static578.method7640(arg0, local156, local151, local133);
				Static578.method7640(arg4, local151, local137, local133);
			}
		}
	}
}
