import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[Lclient!aca;")
	public static Class6_Sub1[] aClass6_Sub1Array1;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
	public static int anInt3707;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method3179() {
		Static184.anInt3598 = -1;
		Static35.anInt561 = -1;
		Static504.aClass254_7 = null;
		Static1.anInt9943 = -1;
		Static516.anIntArray483 = null;
		Static572.aClass254_9 = null;
		Static65.aClass254_1 = null;
		Static528.anInterface15_1 = null;
		Static374.aClass65_12 = null;
		Static420.anInterface15Array5 = null;
		Static273.anInt5013 = -1;
		Static281.aClass270_1.method6362();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4 - arg1;
		@Pc(19) int local19 = arg6 - arg1;
		@Pc(23) int local23 = arg4 * arg4;
		@Pc(27) int local27 = arg6 * arg6;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = local23 << 1;
		@Pc(47) int local47 = local35 << 1;
		@Pc(51) int local51 = local31 << 1;
		@Pc(55) int local55 = arg6 << 1;
		@Pc(59) int local59 = local19 << 1;
		@Pc(68) int local68 = (1 - local55) * local23 + local39;
		@Pc(77) int local77 = local27 - local43 * (local55 - 1);
		@Pc(85) int local85 = (1 - local59) * local31 + local47;
		@Pc(94) int local94 = local35 - (local59 - 1) * local51;
		@Pc(98) int local98 = local23 << 2;
		@Pc(102) int local102 = local27 << 2;
		@Pc(106) int local106 = local31 << 2;
		@Pc(110) int local110 = local35 << 2;
		@Pc(119) int local119 = local39 * 3;
		@Pc(125) int local125 = (local55 - 3) * local43;
		@Pc(129) int local129 = local47 * 3;
		@Pc(135) int local135 = (local59 - 3) * local51;
		@Pc(137) int local137 = local102;
		@Pc(143) int local143 = local98 * (arg6 - 1);
		@Pc(145) int local145 = local110;
		@Pc(151) int local151 = (local19 - 1) * local106;
		@Pc(174) int local174;
		@Pc(183) int local183;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (Static639.anInt10384 <= arg5 && arg5 <= Static496.anInt8305) {
			@Pc(165) int[] local165 = Static16.anIntArrayArray2[arg5];
			local174 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 - arg4);
			local183 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 + arg4);
			local191 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 - local15);
			local199 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, local15 + arg2);
			Static197.method3240(local191, local165, local174, arg0);
			Static197.method3240(local199, local165, local191, arg3);
			Static197.method3240(local183, local165, local199, arg0);
		}
		while (local9 > 0) {
			@Pc(226) boolean local226 = local9 <= local19;
			if (local226) {
				if (local85 < 0) {
					while (local85 < 0) {
						local94 += local145;
						local85 += local129;
						local145 += local110;
						local11++;
						local129 += local110;
					}
				}
				if (local94 < 0) {
					local85 += local129;
					local94 += local145;
					local129 += local110;
					local145 += local110;
					local11++;
				}
				local85 += -local151;
				local94 += -local135;
				local151 -= local106;
				local135 -= local106;
			}
			if (local68 < 0) {
				while (local68 < 0) {
					local77 += local137;
					local68 += local119;
					local7++;
					local119 += local102;
					local137 += local102;
				}
			}
			if (local77 < 0) {
				local77 += local137;
				local68 += local119;
				local119 += local102;
				local137 += local102;
				local7++;
			}
			local77 += -local125;
			local68 += -local143;
			local143 -= local98;
			local9--;
			local125 -= local98;
			local174 = arg5 - local9;
			local183 = arg5 + local9;
			if (local183 >= Static639.anInt10384 && Static496.anInt8305 >= local174) {
				local191 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 + local7);
				local199 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 - local7);
				if (local226) {
					@Pc(404) int local404 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, local11 + arg2);
					@Pc(413) int local413 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg2 - local11);
					@Pc(424) int[] local424;
					if (Static639.anInt10384 <= local174) {
						local424 = Static16.anIntArrayArray2[local174];
						Static197.method3240(local413, local424, local199, arg0);
						Static197.method3240(local404, local424, local413, arg3);
						Static197.method3240(local191, local424, local404, arg0);
					}
					if (Static496.anInt8305 >= local183) {
						local424 = Static16.anIntArrayArray2[local183];
						Static197.method3240(local413, local424, local199, arg0);
						Static197.method3240(local404, local424, local413, arg3);
						Static197.method3240(local191, local424, local404, arg0);
					}
				} else {
					if (local174 >= Static639.anInt10384) {
						Static197.method3240(local191, Static16.anIntArrayArray2[local174], local199, arg0);
					}
					if (Static496.anInt8305 >= local183) {
						Static197.method3240(local191, Static16.anIntArrayArray2[local183], local199, arg0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
	public static boolean method3181() {
		@Pc(5) boolean local5 = true;
		if (Static288.aClass369_1 == null) {
			if (Static257.aClass390_60.method8905(Static518.anInt8634)) {
				Static288.aClass369_1 = Static689.method8548(Static257.aClass390_60, Static518.anInt8634);
			} else {
				local5 = false;
			}
		}
		if (Static479.aClass369_2 == null) {
			if (Static257.aClass390_60.method8905(Static215.anInt8115)) {
				Static479.aClass369_2 = Static689.method8548(Static257.aClass390_60, Static215.anInt8115);
			} else {
				local5 = false;
			}
		}
		if (Static559.aClass369_3 == null) {
			if (Static257.aClass390_60.method8905(Static140.anInt2759)) {
				Static559.aClass369_3 = Static689.method8548(Static257.aClass390_60, Static140.anInt2759);
			} else {
				local5 = false;
			}
		}
		if (Static569.aClass247_15 == null) {
			if (Static536.aClass390_104.method8905(Static678.anInt10878)) {
				Static569.aClass247_15 = Static331.method5104(Static536.aClass390_104, Static678.anInt10878);
			} else {
				local5 = false;
			}
		}
		if (Static72.aClass369Array1 == null) {
			if (Static257.aClass390_60.method8905(Static678.anInt10878)) {
				Static72.aClass369Array1 = Static689.method8546(Static257.aClass390_60, Static678.anInt10878);
			} else {
				local5 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3183(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			@Pc(21) char local21 = arg0.charAt(local16);
			if (local21 == '<' || local21 == '>') {
				local8 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local8 + local6);
		for (@Pc(45) int local45 = 0; local45 < local6; local45++) {
			@Pc(50) char local50 = arg0.charAt(local45);
			if (local50 == '<') {
				local43.append("<lt>");
			} else if (local50 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local50);
			}
		}
		return local43.toString();
	}
}
