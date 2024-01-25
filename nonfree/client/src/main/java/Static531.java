import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
	public static final int[] anIntArray633 = new int[14];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!qfa;III)Lclient!it;")
	public static Class2_Sub3_Sub8 method7293(@OriginalArg(0) Class269 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = arg2 << 10 | arg0.anInt7310;
		@Pc(23) Class2_Sub3_Sub8 local23 = (Class2_Sub3_Sub8) Static358.aClass209_7.method4599((long) local14 << 16);
		if (local23 != null) {
			return local23;
		}
		@Pc(35) byte[] local35 = Static355.aClass259_113.method5964(Static355.aClass259_113.method5966(local14));
		if (local35 == null) {
			local14 = arg0.anInt7310 | arg1 + 65536 << 10;
			local23 = (Class2_Sub3_Sub8) Static358.aClass209_7.method4599((long) local14 << 16);
			if (local23 != null) {
				return local23;
			}
			local35 = Static355.aClass259_113.method5964(Static355.aClass259_113.method5966(local14));
			if (local35 == null) {
				local14 = arg0.anInt7310 | 0x3FFFC00;
				local23 = (Class2_Sub3_Sub8) Static358.aClass209_7.method4599((long) local14 << 16);
				if (local23 != null) {
					return local23;
				}
				local35 = Static355.aClass259_113.method5964(Static355.aClass259_113.method5966(local14));
				if (local35 == null) {
					return null;
				} else if (local35.length <= 1) {
					return null;
				} else {
					try {
						local23 = Static352.method5249(local35);
					} catch (@Pc(199) Exception local199) {
						throw new RuntimeException(local199.getMessage() + " S: " + local14);
					}
					local23.aClass269_6 = arg0;
					Static358.aClass209_7.method4596(local23, (long) local14 << 16);
					return local23;
				}
			} else if (local35.length <= 1) {
				return null;
			} else {
				try {
					local23 = Static352.method5249(local35);
				} catch (@Pc(127) Exception local127) {
					throw new RuntimeException(local127.getMessage() + " S: " + local14);
				}
				local23.aClass269_6 = arg0;
				Static358.aClass209_7.method4596(local23, (long) local14 << 16);
				return local23;
			}
		} else if (local35.length <= 1) {
			return null;
		} else {
			try {
				local23 = Static352.method5249(local35);
			} catch (@Pc(51) Exception local51) {
				throw new RuntimeException(local51.getMessage() + " S: " + local14);
			}
			local23.aClass269_6 = arg0;
			Static358.aClass209_7.method4596(local23, (long) local14 << 16);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
	public static void method7294() {
		if (Static548.aClass29_15 == null) {
			return;
		}
		Static356.aClass100_8.oa(Static191.anIntArray225);
		for (@Pc(10) int local10 = 0; local10 < Static509.anIntArray604.length; local10++) {
			Static356.aClass100_8.method6189(Static509.anIntArray604[local10] + Static148.anIntArray183[local10], -256, Static191.anIntArray225[3] - Static191.anIntArray225[1], Static191.anIntArray225[1]);
		}
		for (@Pc(39) int local39 = 0; local39 < Static35.anInt907; local39++) {
			@Pc(44) Class148 local44 = Static259.aClass148Array1[local39];
			Static356.aClass100_8.MA(local44.anIntArray252[0], local44.anIntArray250[0], local44.anIntArray251[0], Static128.anIntArray160);
			Static356.aClass100_8.MA(local44.anIntArray252[1], local44.anIntArray250[1], local44.anIntArray251[1], Static68.anIntArray85);
			Static356.aClass100_8.MA(local44.anIntArray252[2], local44.anIntArray250[2], local44.anIntArray251[2], Static393.anIntArray477);
			Static356.aClass100_8.MA(local44.anIntArray252[3], local44.anIntArray250[3], local44.anIntArray251[3], Static44.anIntArray60);
			if (Static128.anIntArray160[2] != -1 && Static68.anIntArray85[2] != -1 && Static393.anIntArray477[2] != -1 && Static44.anIntArray60[2] != -1) {
				@Pc(126) int local126 = -65536;
				if (local44.aByte50 == 4) {
					local126 = -16776961;
				}
				Static356.aClass100_8.method6224(Static128.anIntArray160[1], local126, Static68.anIntArray85[1], Static128.anIntArray160[0], Static68.anIntArray85[0]);
				Static356.aClass100_8.method6224(Static68.anIntArray85[1], local126, Static393.anIntArray477[1], Static68.anIntArray85[0], Static393.anIntArray477[0]);
				Static356.aClass100_8.method6224(Static393.anIntArray477[1], local126, Static44.anIntArray60[1], Static393.anIntArray477[0], Static44.anIntArray60[0]);
				Static356.aClass100_8.method6224(Static44.anIntArray60[1], local126, Static128.anIntArray160[1], Static44.anIntArray60[0], Static128.anIntArray160[0]);
				Static356.aClass100_8.method6224(Static128.anIntArray160[1], local126, Static393.anIntArray477[1], Static128.anIntArray160[0], Static393.anIntArray477[0]);
			}
		}
		Static548.aClass29_15.method7111(-256, 10, "Static Opaque: OW: " + Static26.anIntArray39[0] + "/" + Static381.anIntArray483[0] + " UW: " + Static26.anIntArray39[1] + "/" + Static381.anIntArray483[1], -16777216, 30);
		Static548.aClass29_15.method7111(-256, 10, "Static Trans: OW: " + Static142.anIntArray179[0] + "/" + Static367.anIntArray449[0] + " UW: " + Static142.anIntArray179[1] + "/" + Static367.anIntArray449[1], -16777216, 45);
		Static548.aClass29_15.method7111(-256, 10, "Static Anim: OW: " + Static53.anIntArray64[0] + "/" + Static83.anIntArray94[0] + " UW: " + Static53.anIntArray64[1] + "/" + Static83.anIntArray94[1], -16777216, 60);
		Static548.aClass29_15.method7111(-256, 10, "Dynamic: " + Static2.anInt11 + "/" + 5000, -16777216, 75);
		Static548.aClass29_15.method7111(-256, 10, "Total Opaque Onscreen: " + Static223.anInt4187 + "/" + 10000, -16777216, 90);
		Static548.aClass29_15.method7111(-256, 10, "Total Trans Onscreen: " + Static524.anInt8650 + "/" + 5000, -16777216, 105);
		Static548.aClass29_15.method7111(-256, 10, "Occluders: " + (Static56.anInt1297 + Static572.anInt9312) + " Active: " + Static35.anInt907, -16777216, 120);
		Static548.aClass29_15.method7111(-256, 10, "Occluded: Ground:" + Static237.anInt8062 + " Walls: " + Static347.anInt6253 + " CPs: " + Static301.anInt5412 + " Pixels: " + Static228.anInt4256, -16777216, 135);
		Static548.aClass29_15.method7111(-256, 10, "Occlude Calc Took: " + Static277.aLong128 / 1000L + "us", -16777216, 150);
		if (Static266.anIntArray333 == null) {
			return;
		}
		for (@Pc(456) int local456 = 0; local456 < Static266.anIntArray333.length; local456++) {
			@Pc(462) float local462 = (float) Static266.anIntArray333[local456];
			local462 /= 4194304.0F;
			if (local462 > 1.0F) {
				local462 = 1.0F;
			}
			local462 *= 255.0F;
			local462 = 255.0F - local462;
			@Pc(483) int local483 = (int) local462;
			Static266.anIntArray333[local456] = local483 | local483 << 8 | local483 << 16 | 0xFF000000;
		}
		@Pc(510) Class39 local510 = Static356.aClass100_8.method6226(Static266.anIntArray333, Static98.anInt2032, Static98.anInt2032, Static499.anInt8381);
		local510.V(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!tba;B)V")
	public static void method7296(@OriginalArg(0) Class2_Sub42 arg0) {
		Static262.aClass8_27.method212(arg0);
		arg0.anInt8409 = arg0.aClass2_Sub15_Sub2_2.anInt5241;
		arg0.aClass2_Sub15_Sub2_2.anInt5241 = 0;
		Static445.anInt7786 += arg0.anInt8409;
	}
}
