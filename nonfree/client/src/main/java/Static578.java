import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public static int anInt9489;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
	public static boolean aBoolean801;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
	public static int anInt9494 = 0;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
	public static int anInt9502 = 0;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "J")
	public static long aLong269 = 0L;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
	public static void method7995() {
		Static300.aClass340_65.method7996(50);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V")
	public static void method7997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static422.method6270(arg3);
		@Pc(10) int local10 = 0;
		@Pc(19) int local19 = arg3 - arg5;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(25) int local25 = arg3;
		@Pc(28) int local28 = -arg3;
		@Pc(30) int local30 = local19;
		@Pc(33) int local33 = -local19;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(41) int[] local41 = Static16.anIntArrayArray2[arg0];
		@Pc(46) int local46 = arg4 - local19;
		Static197.method3240(local46, local41, arg4 - arg3, arg2);
		@Pc(60) int local60 = arg4 + local19;
		Static197.method3240(local60, local41, local46, arg1);
		Static197.method3240(arg4 + arg3, local41, local60, arg2);
		while (local25 > local10) {
			local35 += 2;
			local37 += 2;
			local28 += local35;
			local33 += local37;
			if (local33 >= 0 && local30 >= 1) {
				Static470.anIntArray446[local30] = local10;
				local30--;
				local33 -= local30 << 1;
			}
			local10++;
			@Pc(134) int[] local134;
			@Pc(140) int[] local140;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(161) int local161;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				if (local25 < local19) {
					local134 = Static16.anIntArrayArray2[arg0 + local25];
					local140 = Static16.anIntArrayArray2[arg0 - local25];
					local144 = Static470.anIntArray446[local25];
					local148 = local10 + arg4;
					local152 = arg4 - local10;
					local156 = local144 + arg4;
					local161 = arg4 - local144;
					Static197.method3240(local161, local134, local152, arg2);
					Static197.method3240(local156, local134, local161, arg1);
					Static197.method3240(local148, local134, local156, arg2);
					Static197.method3240(local161, local140, local152, arg2);
					Static197.method3240(local156, local140, local161, arg1);
					Static197.method3240(local148, local140, local156, arg2);
				} else {
					local134 = Static16.anIntArrayArray2[arg0 + local25];
					local140 = Static16.anIntArrayArray2[arg0 - local25];
					local144 = local10 + arg4;
					local148 = arg4 - local10;
					Static197.method3240(local144, local134, local148, arg2);
					Static197.method3240(local144, local140, local148, arg2);
				}
			}
			local134 = Static16.anIntArrayArray2[local10 + arg0];
			local140 = Static16.anIntArrayArray2[arg0 - local10];
			local144 = local25 + arg4;
			local148 = arg4 - local25;
			if (local19 <= local10) {
				Static197.method3240(local144, local134, local148, arg2);
				Static197.method3240(local144, local140, local148, arg2);
			} else {
				local152 = local10 <= local30 ? local30 : Static470.anIntArray446[local10];
				local156 = arg4 + local152;
				local161 = arg4 - local152;
				Static197.method3240(local161, local134, local148, arg2);
				Static197.method3240(local156, local134, local161, arg1);
				Static197.method3240(local144, local134, local156, arg2);
				Static197.method3240(local161, local140, local148, arg2);
				Static197.method3240(local156, local140, local161, arg1);
				Static197.method3240(local144, local140, local156, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method7998(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) int local9 = arg2.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) char local17 = 0;
		while (local6 > local11 - local15 || local9 > local13 - local17) {
			if (local11 - local15 >= local6) {
				return -1;
			}
			if (local9 <= local13 - local17) {
				return 1;
			}
			@Pc(51) char local51;
			if (local15 == '\u0000') {
				local51 = arg0.charAt(local11++);
			} else {
				local51 = local15;
			}
			@Pc(60) char local60;
			if (local17 == '\u0000') {
				local60 = arg2.charAt(local13++);
			} else {
				local60 = local17;
			}
			local15 = Static7.method107(local51);
			local17 = Static7.method107(local60);
			local51 = Static110.method2085(arg1, local51);
			local60 = Static110.method2085(arg1, local60);
			if (local60 != local51 && Character.toUpperCase(local51) != Character.toUpperCase(local60)) {
				local51 = Character.toLowerCase(local51);
				local60 = Character.toLowerCase(local60);
				if (local60 != local51) {
					return Static167.method2917(arg1, local51) - Static167.method2917(arg1, local60);
				}
			}
		}
		@Pc(127) int local127 = Math.min(local6, local9);
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			if (arg1 == 2) {
				local13 = local9 - local129 - 1;
				local11 = local6 - local129 - 1;
			} else {
				local13 = local129;
				local11 = local129;
			}
			@Pc(157) char local157 = arg0.charAt(local11);
			@Pc(161) char local161 = arg2.charAt(local13);
			if (local161 != local157 && Character.toUpperCase(local157) != Character.toUpperCase(local161)) {
				local157 = Character.toLowerCase(local157);
				local161 = Character.toLowerCase(local161);
				if (local161 != local157) {
					return Static167.method2917(arg1, local157) - Static167.method2917(arg1, local161);
				}
			}
		}
		@Pc(205) int local205 = local6 - local9;
		if (local205 != 0) {
			return local205;
		}
		for (@Pc(211) int local211 = 0; local211 < local127; local211++) {
			@Pc(216) char local216 = arg0.charAt(local211);
			@Pc(220) char local220 = arg2.charAt(local211);
			if (local220 != local216) {
				return Static167.method2917(arg1, local216) - Static167.method2917(arg1, local220);
			}
		}
		return 0;
	}
}
