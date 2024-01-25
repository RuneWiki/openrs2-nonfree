import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "[I")
	public static final int[] anIntArray66 = new int[4];

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(B)V")
	public static void method703() {
		@Pc(8) Class26 local8 = Static91.aClass26_16;
		synchronized (Static91.aClass26_16) {
			Static91.aClass26_16.method333();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!er;)V")
	public static void method704(@OriginalArg(1) Class11_Sub10 arg0) {
		if (arg0.aClass11_Sub15_5 != null) {
			arg0.aClass11_Sub15_5.anInt6416 = 0;
		}
		arg0.aBoolean308 = false;
		for (@Pc(18) Class11_Sub10 local18 = arg0.method4059(); local18 != null; local18 = arg0.method4058()) {
			method704(local18);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBI)I")
	public static int method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(ZI)V")
	public static void method707(@OriginalArg(0) boolean arg0) {
		Static325.aBoolean81 = arg0;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(80) int local80;
		@Pc(95) int local95;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(193) int local193;
		if (!Static325.aBoolean81) {
			local22 = Static246.aClass11_Sub25_Sub1_3.method5171();
			@Pc(26) int local26 = Static246.aClass11_Sub25_Sub1_3.method5179();
			local30 = Static246.aClass11_Sub25_Sub1_3.method5190();
			local38 = (Static315.anInt6163 - Static246.aClass11_Sub25_Sub1_3.anInt6076) / 16;
			Static253.anIntArrayArray57 = new int[local38][4];
			for (local44 = 0; local44 < local38; local44++) {
				for (local48 = 0; local48 < 4; local48++) {
					Static253.anIntArrayArray57[local44][local48] = Static246.aClass11_Sub25_Sub1_3.method5218();
				}
			}
			local48 = Static246.aClass11_Sub25_Sub1_3.method5190();
			local80 = Static246.aClass11_Sub25_Sub1_3.method5179();
			@Pc(91) boolean local91 = Static246.aClass11_Sub25_Sub1_3.method5185() == 1;
			local95 = Static246.aClass11_Sub25_Sub1_3.method5179();
			Static322.method5357(local30);
			Static70.anIntArray89 = new int[local38];
			Static131.anIntArray171 = null;
			Static178.aByteArrayArray25 = new byte[local38][];
			Static311.aByteArrayArray6 = new byte[local38][];
			Static157.anIntArray201 = new int[local38];
			Static82.aByteArrayArray13 = null;
			Static211.anIntArray332 = new int[local38];
			Static114.aByteArrayArray18 = new byte[local38][];
			Static217.anIntArray339 = new int[local38];
			Static293.anIntArray451 = new int[local38];
			Static245.aByteArrayArray49 = new byte[local38][];
			@Pc(133) boolean local133 = false;
			if ((local26 / 8 == 48 || local26 / 8 == 49) && (local95 / 8) == 48) {
				local133 = true;
			}
			if (local26 / 8 == 48 && local95 / 8 == 148) {
				local133 = true;
			}
			local38 = 0;
			for (local174 = (local26 - (Static24.anInt454 >> 4)) / 8; local174 <= ((Static24.anInt454 >> 4) + local26) / 8; local174++) {
				for (local185 = (local95 - (Static240.anInt4832 >> 4)) / 8; local185 <= ((Static240.anInt4832 >> 4) + local95) / 8; local185++) {
					local193 = local185 + (local174 << 8);
					if (local133 && (local185 == 49 || local185 == 149 || local185 == 147 || local174 == 50 || local174 == 49 && local185 == 47)) {
						Static157.anIntArray201[local38] = local193;
						Static293.anIntArray451[local38] = -1;
						Static211.anIntArray332[local38] = -1;
						Static217.anIntArray339[local38] = -1;
						Static70.anIntArray89[local38] = -1;
					} else {
						Static157.anIntArray201[local38] = local193;
						Static293.anIntArray451[local38] = Static316.aClass144_100.method3902("m" + local174 + "_" + local185);
						Static211.anIntArray332[local38] = Static316.aClass144_100.method3902("l" + local174 + "_" + local185);
						Static217.anIntArray339[local38] = Static316.aClass144_100.method3902("um" + local174 + "_" + local185);
						Static70.anIntArray89[local38] = Static316.aClass144_100.method3902("ul" + local174 + "_" + local185);
					}
					local38++;
				}
			}
			Static19.method1626(false, local22, local26, local91, local80, local95, local48);
			return;
		}
		local22 = Static246.aClass11_Sub25_Sub1_3.method5185();
		@Pc(377) boolean local377 = Static246.aClass11_Sub25_Sub1_3.method5219() == 1;
		local30 = Static246.aClass11_Sub25_Sub1_3.method5187();
		local38 = Static246.aClass11_Sub25_Sub1_3.method5171();
		local44 = Static246.aClass11_Sub25_Sub1_3.method5219();
		local48 = Static246.aClass11_Sub25_Sub1_3.method5179();
		local80 = Static246.aClass11_Sub25_Sub1_3.method5187();
		Static322.method5357(local44);
		Static246.aClass11_Sub25_Sub1_3.method2464();
		@Pc(417) int local417;
		for (@Pc(409) int local409 = 0; local409 < 4; local409++) {
			for (local95 = 0; local95 < Static24.anInt454 >> 3; local95++) {
				for (local417 = 0; local417 < Static240.anInt4832 >> 3; local417++) {
					local174 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
					if (local174 == 1) {
						Static230.anIntArrayArrayArray12[local409][local95][local417] = Static246.aClass11_Sub25_Sub1_3.method2462(26);
					} else {
						Static230.anIntArrayArrayArray12[local409][local95][local417] = -1;
					}
				}
			}
		}
		Static246.aClass11_Sub25_Sub1_3.method2461();
		local95 = (Static315.anInt6163 - Static246.aClass11_Sub25_Sub1_3.anInt6076) / 16;
		Static253.anIntArrayArray57 = new int[local95][4];
		for (local417 = 0; local417 < local95; local417++) {
			for (local174 = 0; local174 < 4; local174++) {
				Static253.anIntArrayArray57[local417][local174] = Static246.aClass11_Sub25_Sub1_3.method5198();
			}
		}
		Static217.anIntArray339 = new int[local95];
		Static157.anIntArray201 = new int[local95];
		Static245.aByteArrayArray49 = new byte[local95][];
		Static82.aByteArrayArray13 = null;
		Static131.anIntArray171 = null;
		Static178.aByteArrayArray25 = new byte[local95][];
		Static114.aByteArrayArray18 = new byte[local95][];
		Static70.anIntArray89 = new int[local95];
		Static293.anIntArray451 = new int[local95];
		Static311.aByteArrayArray6 = new byte[local95][];
		Static211.anIntArray332 = new int[local95];
		local95 = 0;
		for (local174 = 0; local174 < 4; local174++) {
			for (local185 = 0; local185 < Static24.anInt454 >> 3; local185++) {
				for (local193 = 0; local193 < Static240.anInt4832 >> 3; local193++) {
					@Pc(566) int local566 = Static230.anIntArrayArrayArray12[local174][local185][local193];
					if (local566 != -1) {
						@Pc(576) int local576 = local566 >> 14 & 0x3FF;
						@Pc(582) int local582 = local566 >> 3 & 0x7FF;
						@Pc(593) int local593 = (local576 / 8 << 8) + (local582 / 8);
						for (@Pc(595) int local595 = 0; local595 < local95; local595++) {
							if (local593 == Static157.anIntArray201[local595]) {
								local593 = -1;
								break;
							}
						}
						if (local593 != -1) {
							Static157.anIntArray201[local95] = local593;
							@Pc(631) int local631 = local593 >> 8 & 0xFF;
							@Pc(635) int local635 = local593 & 0xFF;
							Static293.anIntArray451[local95] = Static316.aClass144_100.method3902("m" + local631 + "_" + local635);
							Static211.anIntArray332[local95] = Static316.aClass144_100.method3902("l" + local631 + "_" + local635);
							Static217.anIntArray339[local95] = Static316.aClass144_100.method3902("um" + local631 + "_" + local635);
							Static70.anIntArray89[local95] = Static316.aClass144_100.method3902("ul" + local631 + "_" + local635);
							local95++;
						}
					}
				}
			}
		}
		Static19.method1626(false, local38, local30, local377, local80, local48, local22);
	}
}
