import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public static int anInt3107;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!ti;")
	public static Class4_Sub2_Sub9_Sub2 aClass4_Sub2_Sub9_Sub2_2;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public static int anInt3111;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "[I")
	public static int[] anIntArray245 = new int[1000];

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	public static int anInt3108 = 0;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "[I")
	public static int[] anIntArray246 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
	public static int[] anIntArray247 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method2511(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(14) int local14 = arg1.length();
		@Pc(16) char local16 = 0;
		@Pc(25) int local25 = arg2.length();
		while (local7 - local11 < local14 || local25 > local9 - local16) {
			if (local7 - local11 >= local14) {
				return -1;
			}
			if (local9 - local16 >= local25) {
				return 1;
			}
			@Pc(62) char local62;
			if (local11 == '\u0000') {
				local62 = arg1.charAt(local7++);
			} else {
				local62 = local11;
			}
			@Pc(78) char local78;
			if (local16 == '\u0000') {
				local78 = arg2.charAt(local9++);
			} else {
				local78 = local16;
			}
			local11 = Static42.method796(local62);
			local16 = Static42.method796(local78);
			local62 = Static199.method2415(arg0, local62);
			local78 = Static199.method2415(arg0, local78);
			if (local62 != local78 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local78 != local62) {
					return Static19.method421(arg0, local62) - Static19.method421(arg0, local78);
				}
			}
		}
		@Pc(142) int local142 = Math.min(local14, local25);
		@Pc(184) char local184;
		@Pc(144) int local144;
		for (local144 = 0; local144 < local142; local144++) {
			if (arg0 == 2) {
				local7 = local14 - local144 - 1;
				local9 = local25 - local144 - 1;
			} else {
				local9 = local144;
				local7 = local144;
			}
			@Pc(180) char local180 = arg1.charAt(local7);
			local184 = arg2.charAt(local9);
			if (local184 != local180 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local180 != local184) {
					return Static19.method421(arg0, local180) - Static19.method421(arg0, local184);
				}
			}
		}
		local144 = local14 - local25;
		if (local144 != 0) {
			return local144;
		}
		for (@Pc(231) int local231 = 0; local231 < local142; local231++) {
			local184 = arg1.charAt(local231);
			@Pc(246) char local246 = arg2.charAt(local231);
			if (local184 != local246) {
				return Static19.method421(arg0, local184) - Static19.method421(arg0, local246);
			}
		}
		return 0;
	}
}
