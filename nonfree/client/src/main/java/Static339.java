import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!qr;")
	public static Class152 aClass152_3;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method5172(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static209.aStringArray43.length; local7++) {
			if (Static209.aStringArray43[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Lclient!eq;")
	public static Class9_Sub1_Sub2 method5173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "()V")
	public static void method5175() {
		if (Static593.aClass117_12 == null) {
			return;
		}
		Static482.aClass43_12.oa(Static47.anIntArray93);
		for (@Pc(10) int local10 = 0; local10 < Static228.anIntArray130.length; local10++) {
			Static482.aClass43_12.method7213(Static228.anIntArray130[local10] + Static188.anIntArray309[local10], Static47.anIntArray93[3] - Static47.anIntArray93[1], -256, Static47.anIntArray93[1]);
		}
		for (@Pc(39) int local39 = 0; local39 < Static123.anInt2786; local39++) {
			@Pc(44) Class241 local44 = Static466.aClass241Array37[local39];
			Static482.aClass43_12.MA(local44.anIntArray507[0], local44.anIntArray508[0], local44.anIntArray509[0], Static248.anIntArray693);
			Static482.aClass43_12.MA(local44.anIntArray507[1], local44.anIntArray508[1], local44.anIntArray509[1], Static373.anIntArray506);
			Static482.aClass43_12.MA(local44.anIntArray507[2], local44.anIntArray508[2], local44.anIntArray509[2], Static113.anIntArray187);
			Static482.aClass43_12.MA(local44.anIntArray507[3], local44.anIntArray508[3], local44.anIntArray509[3], Static595.anIntArray702);
			if (Static248.anIntArray693[2] != -1 && Static373.anIntArray506[2] != -1 && Static113.anIntArray187[2] != -1 && Static595.anIntArray702[2] != -1) {
				@Pc(126) int local126 = -65536;
				if (local44.aByte85 == 4) {
					local126 = -16776961;
				}
				Static482.aClass43_12.method7174(Static373.anIntArray506[0], Static373.anIntArray506[1], Static248.anIntArray693[1], Static248.anIntArray693[0], local126);
				Static482.aClass43_12.method7174(Static113.anIntArray187[0], Static113.anIntArray187[1], Static373.anIntArray506[1], Static373.anIntArray506[0], local126);
				Static482.aClass43_12.method7174(Static595.anIntArray702[0], Static595.anIntArray702[1], Static113.anIntArray187[1], Static113.anIntArray187[0], local126);
				Static482.aClass43_12.method7174(Static248.anIntArray693[0], Static248.anIntArray693[1], Static595.anIntArray702[1], Static595.anIntArray702[0], local126);
				Static482.aClass43_12.method7174(Static113.anIntArray187[0], Static113.anIntArray187[1], Static248.anIntArray693[1], Static248.anIntArray693[0], local126);
			}
		}
		Static593.aClass117_12.method7654("Static Opaque: OW: " + Static332.anIntArray459[0] + "/" + Static425.anIntArray561[0] + " UW: " + Static332.anIntArray459[1] + "/" + Static425.anIntArray561[1], 30, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Static Trans: OW: " + Static343.anIntArray471[0] + "/" + Static113.anIntArray190[0] + " UW: " + Static343.anIntArray471[1] + "/" + Static113.anIntArray190[1], 45, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Static Anim: OW: " + Static1.anIntArray1[0] + "/" + Static183.anIntArray305[0] + " UW: " + Static1.anIntArray1[1] + "/" + Static183.anIntArray305[1], 60, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Dynamic: " + Static472.anInt7698 + "/" + 5000, 75, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Total Opaque Onscreen: " + Static48.anInt1029 + "/" + 10000, 90, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Total Trans Onscreen: " + Static350.anInt8132 + "/" + 5000, 105, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Occluders: " + (Static333.anInt5940 + Static236.anInt4467) + " Active: " + Static123.anInt2786, 120, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Occluded: Ground:" + Static49.anInt1059 + " Walls: " + Static41.anInt968 + " CPs: " + Static145.anInt3068 + " Pixels: " + Static151.anInt3128, 135, -256, 10, -16777216);
		Static593.aClass117_12.method7654("Occlude Calc Took: " + Static453.aLong210 / 1000L + "us", 150, -256, 10, -16777216);
		if (Static571.anIntArray639 == null) {
			return;
		}
		for (@Pc(456) int local456 = 0; local456 < Static571.anIntArray639.length; local456++) {
			@Pc(462) float local462 = (float) Static571.anIntArray639[local456];
			local462 /= 4194304.0F;
			if (local462 > 1.0F) {
				local462 = 1.0F;
			}
			local462 *= 255.0F;
			local462 = 255.0F - local462;
			@Pc(483) int local483 = (int) local462;
			Static571.anIntArray639[local456] = local483 | local483 << 8 | local483 << 16 | 0xFF000000;
		}
		@Pc(510) Class46 local510 = Static482.aClass43_12.method7198(Static571.anIntArray639, Static28.anInt683, Static28.anInt683, Static91.anInt2280);
		local510.V(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([BB)[B")
	public static byte[] method5176(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static604.method5910(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
