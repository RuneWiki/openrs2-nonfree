import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array2;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Lclient!pe;")
	private static Class65 aClass65_401 = Static119.method1462("Drop");

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "Lclient!pe;")
	public static Class65 aClass65_402 = aClass65_401;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
	public static int anInt834 = 0;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "Lclient!pe;")
	public static Class65 aClass65_403 = Static119.method1462("gr-Un:");

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[104][104];

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method667() {
		aClass65_402 = null;
		aClass65_403 = null;
		aBooleanArray7 = null;
		aClass65_401 = null;
		aClass2_Sub1_Sub4_Sub2Array2 = null;
		anIntArrayArray10 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BI)V")
	public static void method668(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub4 local4 = new Class2_Sub4(arg0);
		local4.anInt1298 = arg0.length - 2;
		Static72.anInt1650 = local4.method896();
		Static45.anIntArray130 = new int[Static72.anInt1650];
		Static76.aByteArrayArray6 = new byte[Static72.anInt1650][];
		Static100.anIntArray294 = new int[Static72.anInt1650];
		Static88.anIntArray256 = new int[Static72.anInt1650];
		Static128.anIntArray359 = new int[Static72.anInt1650];
		local4.anInt1298 = arg0.length - Static72.anInt1650 * 8 - 7;
		Static19.anInt471 = local4.method896();
		Static47.anInt1144 = local4.method896();
		@Pc(61) int local61 = (local4.method933() & 0xFF) + 1;
		for (@Pc(63) int local63 = 0; local63 < Static72.anInt1650; local63++) {
			Static88.anIntArray256[local63] = local4.method896();
		}
		for (@Pc(76) int local76 = 0; local76 < Static72.anInt1650; local76++) {
			Static128.anIntArray359[local76] = local4.method896();
		}
		for (@Pc(89) int local89 = 0; local89 < Static72.anInt1650; local89++) {
			Static45.anIntArray130[local89] = local4.method896();
		}
		for (@Pc(106) int local106 = 0; local106 < Static72.anInt1650; local106++) {
			Static100.anIntArray294[local106] = local4.method896();
		}
		local4.anInt1298 = arg0.length - Static72.anInt1650 * 8 - (local61 + -1) * 3 - 7;
		Static110.anIntArray328 = new int[local61];
		for (@Pc(138) int local138 = 1; local138 < local61; local138++) {
			Static110.anIntArray328[local138] = local4.method940();
			if (Static110.anIntArray328[local138] == 0) {
				Static110.anIntArray328[local138] = 1;
			}
		}
		local4.anInt1298 = 0;
		for (@Pc(169) int local169 = 0; local169 < Static72.anInt1650; local169++) {
			@Pc(174) int local174 = Static45.anIntArray130[local169];
			@Pc(178) int local178 = Static100.anIntArray294[local169];
			@Pc(182) int local182 = local178 * local174;
			@Pc(185) byte[] local185 = new byte[local182];
			Static76.aByteArrayArray6[local169] = local185;
			@Pc(193) int local193 = local4.method933();
			@Pc(200) int local200;
			if (local193 == 0) {
				for (local200 = 0; local200 < local182; local200++) {
					local185[local200] = local4.method922();
				}
			} else if (local193 == 1) {
				for (local200 = 0; local200 < local174; local200++) {
					for (@Pc(224) int local224 = 0; local224 < local178; local224++) {
						local185[local224 * local174 + local200] = local4.method922();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	public static void method669() {
		@Pc(10) int local10 = Static66.aClass2_Sub4_Sub1_2.method953(8);
		@Pc(20) int local20;
		if (local10 < Static35.anInt795) {
			for (local20 = local10; local20 < Static35.anInt795; local20++) {
				Static98.anIntArray290[Static47.anInt1129++] = Static76.anIntArray223[local20];
			}
		}
		if (Static35.anInt795 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static35.anInt795 = 0;
		for (local20 = 0; local20 < local10; local20++) {
			@Pc(62) int local62 = Static76.anIntArray223[local20];
			@Pc(66) Class2_Sub1_Sub1_Sub4_Sub1 local66 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local62];
			@Pc(71) int local71 = Static66.aClass2_Sub4_Sub1_2.method953(1);
			if (local71 == 0) {
				Static76.anIntArray223[Static35.anInt795++] = local62;
				local66.anInt1969 = Static10.anInt2951;
			} else {
				@Pc(91) int local91 = Static66.aClass2_Sub4_Sub1_2.method953(2);
				if (local91 == 0) {
					Static76.anIntArray223[Static35.anInt795++] = local62;
					local66.anInt1969 = Static10.anInt2951;
					Static68.anIntArray376[Static33.anInt761++] = local62;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local91 == 1) {
						Static76.anIntArray223[Static35.anInt795++] = local62;
						local66.anInt1969 = Static10.anInt2951;
						local136 = Static66.aClass2_Sub4_Sub1_2.method953(3);
						local66.method1470(false, local136);
						local146 = Static66.aClass2_Sub4_Sub1_2.method953(1);
						if (local146 == 1) {
							Static68.anIntArray376[Static33.anInt761++] = local62;
						}
					} else if (local91 == 2) {
						Static76.anIntArray223[Static35.anInt795++] = local62;
						local66.anInt1969 = Static10.anInt2951;
						local136 = Static66.aClass2_Sub4_Sub1_2.method953(3);
						local66.method1470(true, local136);
						local146 = Static66.aClass2_Sub4_Sub1_2.method953(3);
						local66.method1470(true, local146);
						@Pc(202) int local202 = Static66.aClass2_Sub4_Sub1_2.method953(1);
						if (local202 == 1) {
							Static68.anIntArray376[Static33.anInt761++] = local62;
						}
					} else if (local91 == 3) {
						Static98.anIntArray290[Static47.anInt1129++] = local62;
					}
				}
			}
		}
	}
}
