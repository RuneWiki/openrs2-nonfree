import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!ufa", name = "K", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[8];

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[IB[II)V")
	public static void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local30;
		@Pc(47) int local47 = local16 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg0; local49 < arg3; local49++) {
			if ((local49 & local47) + local16 > arg1[local49]) {
				@Pc(64) int local64 = arg1[local49];
				arg1[local49] = arg1[local12];
				arg1[local12] = local64;
				@Pc(78) int local78 = arg2[local49];
				arg2[local49] = arg2[local12];
				arg2[local12++] = local78;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg2[arg3] = arg2[local12];
		arg2[local12] = local30;
		method8208(arg0, arg1, arg2, local12 - 1);
		method8208(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "()V")
	public static void method8210() {
		for (@Pc(1) int local1 = 0; local1 < Static454.anInt7719; local1++) {
			@Pc(6) Class4_Sub2_Sub1 local6 = Static210.aClass4_Sub2_Sub1Array1[local1];
			Static589.method4632(local6, true);
			Static210.aClass4_Sub2_Sub1Array1[local1] = null;
		}
		Static454.anInt7719 = 0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZ)Lclient!fe;")
	public static Class103 method8211(@OriginalArg(0) int arg0) {
		@Pc(8) Class103[] local8 = Static237.method3941();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class103 local21 = local8[local15];
			if (arg0 == local21.anInt2500) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZI)Z")
	public static boolean method8212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static553.method8062(arg1, arg0) | (arg1 & 0x10000) != 0 || Static551.method8045(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static180.method2777(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "()V")
	public static void method8213() {
		if (Static601.anInt10082 == 0 || Static589.aClass55_9 == null) {
			return;
		}
		Static517.aClass133_13.K(Static455.anIntArray416);
		for (@Pc(12) int local12 = 0; local12 < Static442.anIntArray407.length; local12++) {
			Static517.aClass133_13.method7320(Static455.anIntArray416[1], Static442.anIntArray407[local12] + Static570.anIntArray529[local12], -256, Static455.anIntArray416[3] - Static455.anIntArray416[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static333.anInt5654; local41++) {
			@Pc(46) Class34 local46 = Static41.aClass34Array2[local41];
			Static517.aClass133_13.H(local46.anIntArray62[0], local46.anIntArray60[0], local46.anIntArray61[0], Static57.anIntArray76);
			Static517.aClass133_13.H(local46.anIntArray62[1], local46.anIntArray60[1], local46.anIntArray61[1], Static29.anIntArray14);
			Static517.aClass133_13.H(local46.anIntArray62[2], local46.anIntArray60[2], local46.anIntArray61[2], Static140.anIntArray147);
			Static517.aClass133_13.H(local46.anIntArray62[3], local46.anIntArray60[3], local46.anIntArray61[3], Static512.anIntArray490);
			if (Static57.anIntArray76[2] != -1 && Static29.anIntArray14[2] != -1 && Static140.anIntArray147[2] != -1 && Static512.anIntArray490[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte32 == 4) {
					local128 = -16776961;
				}
				Static517.aClass133_13.method7285(Static57.anIntArray76[1], Static29.anIntArray14[0], Static57.anIntArray76[0], local128, Static29.anIntArray14[1]);
				Static517.aClass133_13.method7285(Static29.anIntArray14[1], Static140.anIntArray147[0], Static29.anIntArray14[0], local128, Static140.anIntArray147[1]);
				Static517.aClass133_13.method7285(Static140.anIntArray147[1], Static512.anIntArray490[0], Static140.anIntArray147[0], local128, Static512.anIntArray490[1]);
				Static517.aClass133_13.method7285(Static512.anIntArray490[1], Static57.anIntArray76[0], Static512.anIntArray490[0], local128, Static57.anIntArray76[1]);
				Static517.aClass133_13.method7285(Static57.anIntArray76[1], Static140.anIntArray147[0], Static57.anIntArray76[0], local128, Static140.anIntArray147[1]);
			}
		}
		Static589.aClass55_9.method6023(-256, 10, "Dynamic: " + Static454.anInt7719 + "/" + 5000, 75, -16777216);
		Static589.aClass55_9.method6023(-256, 10, "Total Opaque Onscreen: " + Static174.anInt3117 + "/" + 10000, 90, -16777216);
		Static589.aClass55_9.method6023(-256, 10, "Total Trans Onscreen: " + Static590.anInt9893 + "/" + 5000, 105, -16777216);
		Static589.aClass55_9.method6023(-256, 10, "Occluders: " + (Static274.anInt4914 + Static368.anInt6139) + " Active: " + Static333.anInt5654, 120, -16777216);
		Static589.aClass55_9.method6023(-256, 10, "Occluded: Ground:" + Static242.anInt4460 + " Walls: " + Static139.anInt2426 + " CPs: " + Static81.anInt1682 + " Pixels: " + Static192.anInt3358, 135, -16777216);
		Static589.aClass55_9.method6023(-256, 10, "Occlude Calc Took: " + Static340.aLong139 / 1000L + "us", 150, -16777216);
		if (Static601.anInt10082 != 2 || Static480.anIntArray460 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static480.anIntArray460.length; local355++) {
			@Pc(361) float local361 = (float) Static480.anIntArray460[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static480.anIntArray460[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class28 local410 = Static517.aClass133_13.method7261(Static480.anIntArray460, Static176.anInt3129, Static140.anInt2441, Static140.anInt2441);
		local410.method4034(10, 170, 1, 0, 0);
	}
}
