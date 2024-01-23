import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lclient!qh;")
	public static Class8_Sub25[] aClass8_Sub25Array1;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	public static int anInt3787;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public static int anInt3789;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString134 = null;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString135 = "wave:";

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIIIIII)V")
	public static void method2949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static92.method1483(arg1)) {
			Static42.method667(Static210.aClass159ArrayArray6[arg1], -1, arg2, arg4, arg0, arg6, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method2951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static92.method1483(arg1)) {
			Static158.method2551(arg3, arg7, arg5, -1, arg2, Static210.aClass159ArrayArray6[arg1], arg4, arg6, arg0);
		} else if (arg4 == -1) {
			for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
				Static128.aBooleanArray7[local21] = true;
			}
		} else {
			Static128.aBooleanArray7[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	public static void method2953() {
		Static138.aClass61_21.method1381(5);
		Static114.aClass61_19.method1381(5);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method2958(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) char local19 = 0;
		while (local17 - local15 < local8 || local11 > local13 - local19) {
			if (local8 <= local17 - local15) {
				return -1;
			}
			if (local13 - local19 >= local11) {
				return 1;
			}
			@Pc(59) char local59;
			if (local15 == '\u0000') {
				local59 = arg1.charAt(local17++);
			} else {
				local59 = local15;
			}
			@Pc(72) char local72;
			if (local19 == '\u0000') {
				local72 = arg0.charAt(local13++);
			} else {
				local72 = local19;
			}
			local15 = Static227.method3517(local59);
			local19 = Static227.method3517(local72);
			local59 = Static174.method2691(local59, arg2);
			local72 = Static174.method2691(local72, arg2);
			if (local59 != local72 && Character.toUpperCase(local59) != Character.toUpperCase(local72)) {
				local59 = Character.toLowerCase(local59);
				local72 = Character.toLowerCase(local72);
				if (local72 != local59) {
					return Static185.method2876(local59, arg2) - Static185.method2876(local72, arg2);
				}
			}
		}
		@Pc(146) int local146 = Math.min(local8, local11);
		@Pc(184) char local184;
		@Pc(148) int local148;
		for (local148 = 0; local148 < local146; local148++) {
			if (arg2 == 2) {
				local13 = local11 - local148 - 1;
				local17 = local8 - local148 - 1;
			} else {
				local13 = local148;
				local17 = local148;
			}
			@Pc(180) char local180 = arg1.charAt(local17);
			local184 = arg0.charAt(local13);
			if (local184 != local180 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local184 != local180) {
					return Static185.method2876(local180, arg2) - Static185.method2876(local184, arg2);
				}
			}
		}
		local148 = local8 - local11;
		if (local148 != 0) {
			return local148;
		}
		for (@Pc(237) int local237 = 0; local237 < local146; local237++) {
			local184 = arg1.charAt(local237);
			@Pc(252) char local252 = arg0.charAt(local237);
			if (local184 != local252) {
				return Static185.method2876(local184, arg2) - Static185.method2876(local252, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[Lclient!tk;I)V")
	public static void method2959(@OriginalArg(1) Class159[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(25) Class159 local25 = arg0[local13];
			if (local25 != null && arg1 == local25.anInt5116 && (!local25.aBoolean423 || !Static42.method663(local25))) {
				if (local25.anInt5197 == 0) {
					if (!local25.aBoolean423 && Static42.method663(local25) && local25 != Static164.aClass159_13) {
						continue;
					}
					method2959(arg0, local25.anInt5199);
					if (local25.aClass159Array1 != null) {
						method2959(local25.aClass159Array1, local25.anInt5199);
					}
					@Pc(84) Class8_Sub32 local84 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local25.anInt5199);
					if (local84 != null) {
						Static70.method1136(local84.anInt5295);
					}
				}
				if (local25.anInt5197 == 6) {
					@Pc(116) int local116;
					if (local25.anInt5141 != -1 || local25.anInt5147 != -1) {
						@Pc(111) boolean local111 = Static33.method527(local25);
						if (local111) {
							local116 = local25.anInt5147;
						} else {
							local116 = local25.anInt5141;
						}
						if (local116 != -1) {
							@Pc(128) Class76 local128 = Static115.method1855(local116);
							if (local128 != null) {
								local25.anInt5175 += Static185.anInt3691;
								while (local25.anInt5175 > local128.anIntArray158[local25.anInt5194]) {
									local25.anInt5175 -= local128.anIntArray158[local25.anInt5194];
									local25.anInt5194++;
									if (local128.anIntArray159.length <= local25.anInt5194) {
										local25.anInt5194 -= local128.anInt2214;
										if (local25.anInt5194 < 0 || local128.anIntArray159.length <= local25.anInt5194) {
											local25.anInt5194 = 0;
										}
									}
									local25.anInt5137 = local25.anInt5194 + 1;
									if (local25.anInt5137 >= local128.anIntArray159.length) {
										local25.anInt5137 -= local128.anInt2214;
										if (local25.anInt5137 < 0 || local128.anIntArray159.length <= local25.anInt5137) {
											local25.anInt5137 = -1;
										}
									}
									Static128.method2075(local25);
								}
							}
						}
					}
					if (local25.anInt5191 != 0 && !local25.aBoolean423) {
						local116 = local25.anInt5191 << 16 >> 16;
						local116 *= Static185.anInt3691;
						local25.anInt5138 = local116 + local25.anInt5138 & 0x7FF;
						@Pc(265) int local265 = local25.anInt5191 >> 16;
						@Pc(269) int local269 = local265 * Static185.anInt3691;
						local25.anInt5163 = local25.anInt5163 + local269 & 0x7FF;
						Static128.method2075(local25);
					}
				}
			}
		}
	}
}
