import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
	public static void method4512() {
		@Pc(9) int local9 = Static373.anInt6267 * 512 + 256;
		@Pc(15) int local15 = Static458.anInt7890 * 512 + 256;
		@Pc(23) int local23 = Static66.method1191(local9, Static433.anInt7592, local15) - Static291.anInt5025;
		if (Static15.anInt199 < 100) {
			if (local9 > Static405.anInt7085) {
				Static405.anInt7085 += Static15.anInt199 * (local9 - Static405.anInt7085) / 1000 + Static593.anInt9645;
				if (Static405.anInt7085 > local9) {
					Static405.anInt7085 = local9;
				}
			}
			if (local23 > Static295.anInt5077) {
				Static295.anInt5077 += Static15.anInt199 * (local23 - Static295.anInt5077) / 1000 + Static593.anInt9645;
				if (local23 < Static295.anInt5077) {
					Static295.anInt5077 = local23;
				}
			}
			if (local9 < Static405.anInt7085) {
				Static405.anInt7085 -= Static593.anInt9645 + Static15.anInt199 * (Static405.anInt7085 - local9) / 1000;
				if (Static405.anInt7085 < local9) {
					Static405.anInt7085 = local9;
				}
			}
			if (Static59.anInt1132 < local15) {
				Static59.anInt1132 += Static593.anInt9645 + (local15 - Static59.anInt1132) * Static15.anInt199 / 1000;
				if (local15 < Static59.anInt1132) {
					Static59.anInt1132 = local15;
				}
			}
			if (local23 < Static295.anInt5077) {
				Static295.anInt5077 -= (Static295.anInt5077 - local23) * Static15.anInt199 / 1000 + Static593.anInt9645;
				if (Static295.anInt5077 < local23) {
					Static295.anInt5077 = local23;
				}
			}
			if (Static59.anInt1132 > local15) {
				Static59.anInt1132 -= (Static59.anInt1132 - local15) * Static15.anInt199 / 1000 + Static593.anInt9645;
				if (local15 > Static59.anInt1132) {
					Static59.anInt1132 = local15;
				}
			}
		} else {
			Static405.anInt7085 = Static373.anInt6267 * 512 + 256;
			Static59.anInt1132 = Static458.anInt7890 * 512 + 256;
			Static295.anInt5077 = Static66.method1191(Static405.anInt7085, Static433.anInt7592, Static59.anInt1132) - Static291.anInt5025;
		}
		local9 = Static319.anInt5419 * 512 + 256;
		local15 = Static273.anInt4793 * 512 + 256;
		local23 = Static66.method1191(local9, Static433.anInt7592, local15) - Static432.anInt7579;
		@Pc(229) int local229 = local9 - Static405.anInt7085;
		@Pc(233) int local233 = local23 - Static295.anInt5077;
		@Pc(238) int local238 = local15 - Static59.anInt1132;
		@Pc(250) int local250 = (int) Math.sqrt((double) (local229 * local229 + local238 * local238));
		@Pc(261) int local261 = (int) (Math.atan2((double) local233, (double) local250) * 2607.5945876176133D) & 0x3FFF;
		if (local261 < 1024) {
			local261 = 1024;
		}
		@Pc(277) int local277 = (int) (-2607.5945876176133D * Math.atan2((double) local229, (double) local238)) & 0x3FFF;
		if (local261 > 3072) {
			local261 = 3072;
		}
		if (Static103.anInt2093 < local261) {
			Static103.anInt2093 += (local261 - Static103.anInt2093 >> 3) * Static581.anInt6126 / 1000 + Static336.anInt5683 << 3;
			if (local261 < Static103.anInt2093) {
				Static103.anInt2093 = local261;
			}
		}
		if (Static103.anInt2093 > local261) {
			Static103.anInt2093 -= (Static103.anInt2093 - local261 >> 3) * Static581.anInt6126 / 1000 + Static336.anInt5683 << 3;
			if (local261 > Static103.anInt2093) {
				Static103.anInt2093 = local261;
			}
		}
		@Pc(353) int local353 = local277 - Static561.anInt9344;
		if (local353 > 8192) {
			local353 -= 16384;
		}
		if (local353 < -8192) {
			local353 += 16384;
		}
		local353 >>= 0x3;
		if (local353 > 0) {
			Static561.anInt9344 += local353 * Static581.anInt6126 / 1000 + Static336.anInt5683 << 3;
			Static561.anInt9344 &= 0x3FFF;
		}
		if (local353 < 0) {
			Static561.anInt9344 -= -local353 * Static581.anInt6126 / 1000 + Static336.anInt5683 << 3;
			Static561.anInt9344 &= 0x3FFF;
		}
		@Pc(407) int local407 = local277 - Static561.anInt9344;
		if (local407 > 8192) {
			local407 -= 16384;
		}
		if (local407 < -8192) {
			local407 += 16384;
		}
		if (local407 < 0 && local353 > 0 || local407 > 0 && local353 < 0) {
			Static561.anInt9344 = local277;
		}
		Static395.anInt6894 = 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIFIII[FIF)V")
	public static void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg5 - arg6;
		@Pc(9) int local9 = arg1 - arg0;
		@Pc(17) int local17 = arg8 - arg4;
		@Pc(38) float local38 = (float) local5 * arg7[0] + (float) local17 * arg7[1] + (float) local9 * arg7[2];
		@Pc(59) float local59 = arg7[3] * (float) local5 + (float) local17 * arg7[4] + arg7[5] * (float) local9;
		@Pc(80) float local80 = (float) local17 * arg7[7] + (float) local5 * arg7[6] + (float) local9 * arg7[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local91 *= arg3;
		}
		@Pc(105) float local105 = local59 + arg9 + 0.5F;
		@Pc(110) float local110;
		if (arg2 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg2 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg2 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		Static419.aFloat163 = local105;
		Static238.aFloat111 = local91;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method4514(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(26) String local26;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			local26 = local16.aString63 + " | ";
			arg0 = local16.aThrowable1;
		} else {
			local26 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local26 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local26 = local26 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local26 = local26 + local64.substring(local130 + 5, local77);
				}
			}
			local26 = local26 + ' ';
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZZBI)V")
	public static void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= arg5) {
			return;
		}
		@Pc(26) int local26 = (arg1 + arg5) / 2;
		@Pc(28) int local28 = arg1;
		@Pc(32) Class317_Sub1 local32 = Static436.aClass317_Sub1Array2[local26];
		Static436.aClass317_Sub1Array2[local26] = Static436.aClass317_Sub1Array2[arg5];
		Static436.aClass317_Sub1Array2[arg5] = local32;
		for (@Pc(44) int local44 = arg1; local44 < arg5; local44++) {
			if (Static342.method4696(arg0, arg4, local32, arg3, arg2, Static436.aClass317_Sub1Array2[local44]) <= 0) {
				@Pc(64) Class317_Sub1 local64 = Static436.aClass317_Sub1Array2[local44];
				Static436.aClass317_Sub1Array2[local44] = Static436.aClass317_Sub1Array2[local28];
				Static436.aClass317_Sub1Array2[local28++] = local64;
			}
		}
		Static436.aClass317_Sub1Array2[arg5] = Static436.aClass317_Sub1Array2[local28];
		Static436.aClass317_Sub1Array2[local28] = local32;
		method4515(arg0, arg1, arg2, arg3, arg4, local28 - 1);
		method4515(arg0, local28 + 1, arg2, arg3, arg4, arg5);
	}
}
