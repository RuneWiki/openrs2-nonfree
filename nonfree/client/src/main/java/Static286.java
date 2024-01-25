import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "[Lclient!sda;")
	public static Class306[] aClass306Array1;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_58 = new Class303(31, 3);

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
	public static final int[] anIntArray269 = new int[13];

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
	public static int anInt4910 = 0;

	@OriginalMember(owner = "client!kr", name = "K", descriptor = "I")
	public static int anInt4914 = 0;

	@OriginalMember(owner = "client!kr", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!kr", name = "M", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_31 = new Class112();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method4254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static12.aBoolean593 = Static511.aClass45_12.method7374() > 0;
		Static512.aBoolean635 = true;
		Static5.anInt120 = arg1 >> Static315.anInt5369;
		Static394.anInt6891 = arg3 >> Static315.anInt5369;
		Static565.anInt9225 = arg1;
		Static316.anInt5406 = arg3;
		Static535.anInt8571 = arg2;
		Static325.anInt5509 = Static5.anInt120 - Static453.anInt7589;
		if (Static325.anInt5509 < 0) {
			Static497.anInt8088 = -Static325.anInt5509;
			Static325.anInt5509 = 0;
		} else {
			Static497.anInt8088 = 0;
		}
		Static553.anInt8803 = Static394.anInt6891 - Static453.anInt7589;
		if (Static553.anInt8803 < 0) {
			Static65.anInt1512 = -Static553.anInt8803;
			Static553.anInt8803 = 0;
		} else {
			Static65.anInt1512 = 0;
		}
		Static120.anInt2772 = Static5.anInt120 + Static453.anInt7589;
		if (Static120.anInt2772 > Static155.anInt3254) {
			Static120.anInt2772 = Static155.anInt3254;
		}
		Static535.anInt8569 = Static394.anInt6891 + Static453.anInt7589;
		if (Static535.anInt8569 > Static39.anInt747) {
			Static535.anInt8569 = Static39.anInt747;
		}
		@Pc(70) boolean[][] local70 = Static562.aBooleanArrayArray7;
		@Pc(72) boolean[][] local72 = Static387.aBooleanArrayArray2;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static512.aBoolean635) {
			for (local76 = 0; local76 < Static453.anInt7589 + Static453.anInt7589 + 2; local76++) {
				for (local79 = 0; local79 < Static453.anInt7589 + Static453.anInt7589 + 2; local79++) {
					local86 = Static5.anInt120 + local76 - Static453.anInt7589;
					local92 = Static394.anInt6891 + local79 - Static453.anInt7589;
					if (local86 >= 0 && local92 >= 0 && local86 < Static155.anInt3254 && local92 < Static39.anInt747) {
						@Pc(106) int local106 = local86 << Static315.anInt5369;
						@Pc(110) int local110 = local92 << Static315.anInt5369;
						@Pc(127) int local127 = Static108.aClass34Array6[Static108.aClass34Array6.length - 1].method6525(local92, local86) - (0x3E8 << Static315.anInt5369 - 7);
						@Pc(149) int local149 = Static426.aClass34Array5 == null ? Static108.aClass34Array6[0].method6525(local92, local86) + Static467.anInt7776 : Static426.aClass34Array5[0].method6525(local92, local86) + Static467.anInt7776;
						Static387.aBooleanArrayArray2[local76][local79] = Static511.aClass45_12.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static387.aBooleanArrayArray2[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static453.anInt7589 + Static453.anInt7589 + 1; local79++) {
				for (local86 = 0; local86 < Static453.anInt7589 + Static453.anInt7589 + 1; local86++) {
					Static562.aBooleanArrayArray7[local79][local86] = Static387.aBooleanArrayArray2[local79][local86] || Static387.aBooleanArrayArray2[local79 + 1][local86] || Static387.aBooleanArrayArray2[local79][local86 + 1] || Static387.aBooleanArrayArray2[local79 + 1][local86 + 1];
				}
			}
			Static252.anIntArray241 = arg5;
			Static552.anIntArray575 = arg6;
			Static13.anIntArray302 = arg7;
			Static344.anIntArray331 = arg8;
			Static547.anIntArray572 = arg9;
			Static148.method2829(arg10, Static511.aClass45_12);
		} else {
			if (Static401.aBooleanArrayArray3 == null) {
				Static401.aBooleanArrayArray3 = new boolean[Static155.anInt3254 + Static155.anInt3254 + 1][Static39.anInt747 + Static155.anInt3254 + 1];
				for (local76 = 0; local76 < Static401.aBooleanArrayArray3.length; local76++) {
					for (local79 = 0; local79 < Static401.aBooleanArrayArray3[0].length; local79++) {
						Static401.aBooleanArrayArray3[local76][local79] = true;
					}
				}
			}
			Static387.aBooleanArrayArray2 = Static401.aBooleanArrayArray3;
			Static562.aBooleanArrayArray7 = Static401.aBooleanArrayArray3;
			Static325.anInt5509 = 0;
			Static553.anInt8803 = 0;
			Static120.anInt2772 = Static155.anInt3254;
			Static535.anInt8569 = Static39.anInt747;
			Static465.anInt7743 = 0;
		}
		Static401.method5820(Static511.aClass45_12);
		for (@Pc(322) Class41_Sub10 local322 = (Class41_Sub10) Static212.aClass178_7.method4168(); local322 != null; local322 = (Class41_Sub10) Static212.aClass178_7.method4165()) {
			local322.method7833();
			Static350.method5142(local322);
		}
		if (Static12.aBoolean593) {
			for (local79 = 0; local79 < Static497.anInt8087; local79++) {
				Static169.aClass129Array1[local79].method3312(arg14, arg0);
			}
		}
		if (Static74.aBoolean149) {
			Static63.anIntArray64 = Static511.aClass45_12.v();
			Static511.aClass45_12.oa(Static275.anIntArray261);
			local79 = (Static275.anIntArray261[2] - Static275.anIntArray261[0]) / Static261.anInt4596;
			for (local86 = 0; local86 < Static261.anInt4596 - 1; local86++) {
				Static574.anIntArray600[local86] = local79 * (local86 + 1) + Static336.anIntArray314[local86];
			}
			for (local92 = 0; local92 < Static174.aClass136Array1.length; local92++) {
				Static174.aClass136Array1[local92].method3393();
			}
		}
		if (Static250.aClass299ArrayArrayArray2 != null) {
			if (Static74.aBoolean149) {
				Static382.method5651(0);
			}
			Static366.method5362(true);
			Static511.aClass45_12.CA(-1, 1583160, 40, 127);
			Static136.method2671(true, arg4, arg10, arg11);
			if (Static74.aBoolean149) {
				Static86.method5361();
			}
			Static511.aClass45_12.L();
			Static366.method5362(false);
		}
		Static136.method2671(false, arg4, arg10, arg11);
		if (Static74.aBoolean149) {
			for (local79 = 0; local79 < Static459.anInt7698; local79++) {
				Static414.aBooleanArrayArrayArray2[local79] = Static128.aBooleanArrayArrayArray1[local79];
			}
			Static382.method5651(0);
			for (local86 = 0; local86 < Static174.aClass136Array1.length; local86++) {
				Static174.aClass136Array1[local86].method3393();
			}
		}
		if (Static74.aBoolean149) {
			Static86.method5361();
			for (local79 = 0; local79 < Static459.anInt7698; local79++) {
				Static128.aBooleanArrayArrayArray1[local79] = Static414.aBooleanArrayArrayArray2[local79];
			}
			if (Static89.anInt1889 == 2) {
				@Pc(505) int local505;
				if (Static253.aLongArray8[0] < Static253.aLongArray8[1]) {
					if (Static574.anIntArray600[0] + Static336.anIntArray314[0] > Static275.anIntArray261[0]) {
						local505 = Static336.anIntArray314[0]++;
					}
				} else if (Static253.aLongArray8[0] > Static253.aLongArray8[1] && Static574.anIntArray600[0] + Static336.anIntArray314[0] < Static275.anIntArray261[2]) {
					local505 = Static336.anIntArray314[0]--;
				}
			}
		}
		if (!Static512.aBoolean635) {
			Static562.aBooleanArrayArray7 = local70;
			Static387.aBooleanArrayArray2 = local72;
		}
		Static445.method6213();
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(B)V")
	public static void method4255() {
		@Pc(10) int local10 = Static405.aClass3_Sub3_Sub1_1.method6311(Static60.anInt1312);
		if (local10 == 0) {
			Static45.aByteArrayArrayArray8 = null;
			Static407.method5866(0);
		} else if (local10 == 1) {
			Static513.method3758((byte) 0);
			Static407.method5866(512);
			if (Static503.aByteArrayArrayArray11 != null) {
				Static152.method2880();
			}
		} else {
			Static513.method3758((byte) (Static81.anInt1761 - 4 & 0xFF));
			Static407.method5866(2);
		}
		Static294.anInt7434 = Static117.anInt2694;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZB)V")
	public static void method4256() {
		@Pc(18) Class3_Sub42 local18 = Static591.method7910(Static9.aClass199_3, Static473.aClass303_85);
		Static511.method6885(local18);
		for (@Pc(26) Class3_Sub49 local26 = (Class3_Sub49) Static216.aClass354_18.method7694(); local26 != null; local26 = (Class3_Sub49) Static216.aClass354_18.method7692()) {
			if (!local26.method7828()) {
				local26 = (Class3_Sub49) Static216.aClass354_18.method7694();
				if (local26 == null) {
					break;
				}
			}
			if (local26.anInt8837 == 0) {
				Static250.method3868(local26, true, true);
			}
		}
		if (Static19.aClass361_1 != null) {
			Static186.method3170(Static19.aClass361_1);
			Static19.aClass361_1 = null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFB)I")
	public static int method4257(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(32) float local32 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(41) float local41 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(50) float local50 = arg2 < 0.0F ? -arg2 : arg2;
		if (local41 > local32 && local41 > local50) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local50 > local32 && local41 < local50) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
