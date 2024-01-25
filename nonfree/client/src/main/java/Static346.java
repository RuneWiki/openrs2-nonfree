import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
	public static int anInt6641;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
	public static int anInt6643;

	@OriginalMember(owner = "client!nea", name = "l", descriptor = "J")
	public static long aLong178;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "I")
	public static int anInt6650;

	@OriginalMember(owner = "client!nea", name = "p", descriptor = "[I")
	public static final int[] anIntArray371 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!nea", name = "t", descriptor = "[I")
	public static final int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIIII)V")
	public static void method5264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static57.anInt1513;
		@Pc(14) int[] local14 = Static447.anIntArray571;
		Static539.anInt9811 = 0;
		@Pc(185) int local185;
		@Pc(230) int local230;
		@Pc(277) int local277;
		@Pc(348) int local348;
		@Pc(421) int local421;
		@Pc(854) int local854;
		@Pc(548) int local548;
		for (@Pc(18) int local18 = 0; local18 < local7 + Static137.anInt3042; local18++) {
			@Pc(22) Class51 local22 = null;
			@Pc(44) Class21_Sub1_Sub1_Sub1 local44;
			if (local7 <= local18) {
				local44 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local18 - local7])).aClass21_Sub1_Sub1_Sub1_Sub1_1;
				local22 = ((Class21_Sub1_Sub1_Sub1_Sub1) local44).aClass51_1;
				if (local22.anIntArray61 != null) {
					local22 = local22.method1371(Static523.aClass173_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local44 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local14[local18]];
			}
			if (local44.anInt4220 >= 0 && (local44.anInt4203 == Static70.anInt1864 || local44.aByte127 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127)) {
				Static451.method6632(arg0 >> 1, local44.method3326(), arg2 >> 1, local44);
				if (Static509.anIntArray540[0] >= 0) {
					if (local44.aString86 != null && (local18 >= local7 || Static409.anInt7963 == 0 || Static409.anInt7963 == 3 || Static409.anInt7963 == 1 && Static313.method4938(((Class21_Sub1_Sub1_Sub1_Sub2) local44).aString87)) && Static539.anInt9811 < Static456.anInt8709) {
						Static456.anIntArray512[Static539.anInt9811] = Static503.aClass198_12.method4769(local44.aString86) / 2;
						Static456.anIntArray508[Static539.anInt9811] = Static509.anIntArray540[0];
						Static456.anIntArray507[Static539.anInt9811] = Static509.anIntArray540[1];
						Static456.anIntArray511[Static539.anInt9811] = local44.anInt4248;
						Static456.anIntArray509[Static539.anInt9811] = local44.anInt4205;
						Static456.anIntArray510[Static539.anInt9811] = local44.anInt4240;
						Static456.aStringArray33[Static539.anInt9811] = local44.aString86;
						Static539.anInt9811++;
					}
					local185 = Static509.anIntArray540[1] + arg1;
					@Pc(262) Class88[] local262;
					@Pc(269) Class103[] local269;
					@Pc(321) Class88 local321;
					if (local44.aBoolean295 || Static306.anInt6122 >= local44.anInt4264) {
						local185 -= Math.max(Static503.aClass198_12.anInt6043, Static224.aClass88Array5[0].u());
					} else {
						@Pc(212) byte local212 = 1;
						if (local18 < local7) {
							@Pc(225) Class21_Sub1_Sub1_Sub1_Sub2 local225 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local14[local18]];
							local230 = local44.method3322().anInt7512;
							if (local225.aBoolean302) {
								local212 = 2;
							}
						} else {
							local230 = local22.anInt1592;
							if (local230 == -1) {
								local230 = local44.method3322().anInt7512;
							}
						}
						@Pc(250) Class88[] local250 = Static224.aClass88Array5;
						if (local230 != -1) {
							local262 = (Class88[]) Static365.aClass167_34.method3966((long) local230);
							if (local262 == null) {
								local269 = Static598.method2456(Static159.aClass348_38, local230);
								if (local269 != null) {
									local262 = new Class88[local269.length];
									for (local277 = 0; local277 < local269.length; local277++) {
										local262[local277] = Static39.aClass7_2.method7808(local269[local277], true);
									}
									Static365.aClass167_34.method3974((long) local230, local262);
								}
							}
							if (local262 != null && local262.length >= 2) {
								local250 = local262;
							}
						}
						if (local250.length <= local212) {
							local212 = 1;
						}
						@Pc(317) Class88 local317 = local250[0];
						local321 = local250[local212];
						local185 -= Math.max(Static503.aClass198_12.anInt6043, local317.u());
						local277 = arg3 + Static509.anIntArray540[0] - (local317.E() >> 1);
						local348 = local317.E() * local44.anInt4276 / 255;
						if (local44.anInt4276 > 0 && local348 < 2) {
							local348 = 2;
						}
						local317.method8051(local277, local185);
						Static39.aClass7_2.V(local277, local185, local277 + local348, local317.u() + local185);
						local321.method8051(local277, local185);
						Static39.aClass7_2.da(arg3, arg1, arg3 + arg0, arg1 + arg2);
					}
					local185 -= 2;
					if (!local44.aBoolean295) {
						@Pc(402) Class88 local402;
						if (local44.anInt4229 > Static306.anInt6122) {
							local402 = Static356.aClass88Array8[local44.aBoolean296 ? 2 : 0];
							@Pc(411) Class88 local411 = Static356.aClass88Array8[local44.aBoolean296 ? 3 : 1];
							if (local44 instanceof Class21_Sub1_Sub1_Sub1_Sub1) {
								local421 = local22.anInt1615;
								if (local421 == -1) {
									local421 = local44.method3322().anInt7479;
								}
							} else {
								local421 = local44.method3322().anInt7479;
							}
							if (local421 != -1) {
								local262 = (Class88[]) Static278.aClass167_20.method3966((long) local421);
								if (local262 == null) {
									local269 = Static598.method2456(Static159.aClass348_38, local421);
									if (local269 != null) {
										local262 = new Class88[local269.length];
										for (local277 = 0; local277 < local269.length; local277++) {
											local262[local277] = Static39.aClass7_2.method7808(local269[local277], true);
										}
										Static278.aClass167_20.method3974((long) local421, local262);
									}
								}
								if (local262 != null && local262.length == 4) {
									local411 = local262[local44.aBoolean296 ? 3 : 1];
									local402 = local262[local44.aBoolean296 ? 2 : 0];
								}
							}
							@Pc(514) int local514 = local44.anInt4229 - Static306.anInt6122;
							if (local44.anInt4238 < local514) {
								local514 -= local44.anInt4238;
								local277 = local44.anInt4208 == 0 ? 0 : (local44.anInt4221 - local514) / local44.anInt4208 * local44.anInt4208;
								local548 = local402.E() * local277 / local44.anInt4221;
							} else {
								local548 = local402.E();
							}
							local277 = local402.u();
							local185 -= local277;
							local348 = arg3 + Static509.anIntArray540[0] - (local402.E() >> 1);
							local402.method8051(local348, local185);
							Static39.aClass7_2.V(local348, local185, local348 + local548, local185 + local277);
							local411.method8051(local348, local185);
							Static39.aClass7_2.da(arg3, arg1, arg0 + arg3, arg1 - -arg2);
							local185 -= 2;
						}
						if (local18 < local7) {
							@Pc(638) Class21_Sub1_Sub1_Sub1_Sub2 local638 = (Class21_Sub1_Sub1_Sub1_Sub2) local44;
							if (local638.anInt4306 != -1) {
								local185 -= 25;
								Static460.aClass88Array11[local638.anInt4306].method8051(Static509.anIntArray540[0] + arg3 - 12, local185);
								local185 -= 2;
							}
							if (local638.anInt4316 != -1) {
								local185 -= 25;
								Static488.aClass88Array13[local638.anInt4316].method8051(arg3 + Static509.anIntArray540[0] - 12, local185);
								local185 -= 2;
							}
						} else if (local22.anInt1616 >= 0 && Static488.aClass88Array13.length > local22.anInt1616) {
							local402 = Static488.aClass88Array13[local22.anInt1616];
							local185 -= 25;
							local402.method8051(Static509.anIntArray540[0] + arg3 - (local402.E() >> 1), local185);
							local185 -= 2;
						}
					}
					@Pc(689) Class292[] local689;
					@Pc(697) Class292 local697;
					if (!(local44 instanceof Class21_Sub1_Sub1_Sub1_Sub2)) {
						local230 = 0;
						local689 = Static553.aClass292Array1;
						for (local421 = 0; local421 < local689.length; local421++) {
							local697 = local689[local421];
							if (local697 != null && local697.anInt8837 == 1 && local697.anInt8834 == Static24.anIntArray24[local18 - local7]) {
								local321 = Static50.aClass88Array1[local697.anInt8830];
								if (local230 < local321.u()) {
									local230 = local321.u();
								}
								if (Static306.anInt6122 % 20 < 10) {
									local321.method8051(arg3 + Static509.anIntArray540[0] - 12, local185 + -local321.u());
								}
							}
						}
						if (local230 > 0) {
						}
					} else if (local18 >= 0) {
						local230 = 0;
						local689 = Static553.aClass292Array1;
						for (local421 = 0; local421 < local689.length; local421++) {
							local697 = local689[local421];
							if (local697 != null && local697.anInt8837 == 10 && local697.anInt8834 == local14[local18]) {
								local321 = Static50.aClass88Array1[local697.anInt8830];
								if (local321.u() > local230) {
									local230 = local321.u();
								}
								local321.method8051(Static509.anIntArray540[0] + arg3 - 12, local185 + -local321.u());
							}
						}
						if (local230 > 0) {
						}
					}
					for (local230 = 0; local230 < 4; local230++) {
						if (local44.anIntArray200[local230] > Static306.anInt6122) {
							local854 = local44.method3326() / 2;
							Static451.method6632(arg0 >> 1, local854, arg2 >> 1, local44);
							if (Static509.anIntArray540[0] > -1) {
								local421 = Static161.aClass88Array3[local44.anIntArray204[local230]].E();
								if (local230 == 1) {
									Static509.anIntArray540[1] -= 20;
								}
								if (local230 == 2) {
									Static509.anIntArray540[0] -= local421 - 9;
									Static509.anIntArray540[1] -= 10;
								}
								if (local230 == 3) {
									Static509.anIntArray540[0] += local421 - 9;
									Static509.anIntArray540[1] -= 10;
								}
								Static161.aClass88Array3[local44.anIntArray204[local230]].method8051(Static509.anIntArray540[0] + arg3 - (local421 >> 1), arg1 + -12 + Static509.anIntArray540[1]);
								Static464.aClass45_9.method4849(-1, Static509.anIntArray540[0] + arg3 - 1, arg1 + 3 - -Static509.anIntArray540[1], 0, Integer.toString(local44.anIntArray203[local230]));
							}
						}
					}
				}
			}
		}
		@Pc(1002) int local1002;
		for (@Pc(996) int local996 = 0; local996 < Static215.anInt4514; local996++) {
			local1002 = Static475.anIntArray590[local996];
			@Pc(1009) Class21_Sub1_Sub1_Sub1 local1009;
			if (local1002 < 2048) {
				local1009 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local1002];
			} else {
				local1009 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) (local1002 - 2048))).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			}
			local230 = Static7.anIntArray11[local996];
			@Pc(1044) Class21_Sub1_Sub1_Sub1 local1044;
			if (local230 >= 2048) {
				local1044 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) (local230 - 2048))).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			} else {
				local1044 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local230];
			}
			Static139.method2487(arg0, arg3, local1009, arg2, --local1009.anInt4202, arg1, local1044);
		}
		local1002 = Static503.aClass198_12.anInt6045 + Static503.aClass198_12.anInt6043 + 2;
		for (local185 = 0; local185 < Static539.anInt9811; local185++) {
			local230 = Static456.anIntArray508[local185];
			local854 = Static456.anIntArray507[local185];
			local421 = Static456.anIntArray512[local185];
			@Pc(1097) boolean local1097 = true;
			while (local1097) {
				local1097 = false;
				for (local548 = 0; local548 < local185; local548++) {
					if (local854 + 2 > -local1002 + Static456.anIntArray507[local548] && local854 - local1002 < Static456.anIntArray507[local548] + 2 && Static456.anIntArray512[local548] + Static456.anIntArray508[local548] > local230 - local421 && Static456.anIntArray508[local548] - Static456.anIntArray512[local548] < local230 - -local421 && Static456.anIntArray507[local548] - local1002 < local854) {
						local854 = Static456.anIntArray507[local548] - local1002;
						local1097 = true;
					}
				}
			}
			Static456.anIntArray507[local185] = local854;
			@Pc(1196) String local1196 = Static456.aStringArray33[local185];
			if (Static278.anInt5785 == 0) {
				local277 = 16776960;
				if (Static456.anIntArray511[local185] < 6) {
					local277 = Static203.anIntArray198[Static456.anIntArray511[local185]];
				}
				if (Static456.anIntArray511[local185] == 6) {
					local277 = Static70.anInt1864 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static456.anIntArray511[local185] == 7) {
					local277 = Static70.anInt1864 % 20 < 10 ? 255 : 65535;
				}
				if (Static456.anIntArray511[local185] == 8) {
					local277 = Static70.anInt1864 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static456.anIntArray511[local185] == 9) {
					local348 = 150 - Static456.anIntArray510[local185];
					if (local348 < 50) {
						local277 = local348 * 1280 + 16711680;
					} else if (local348 < 100) {
						local277 = 16384000 + 16776960 - local348 * 327680;
					} else if (local348 < 150) {
						local277 = local348 * 5 + 65280 - 500;
					}
				}
				if (Static456.anIntArray511[local185] == 10) {
					local348 = 150 - Static456.anIntArray510[local185];
					if (local348 < 50) {
						local277 = local348 * 5 + 16711680;
					} else if (local348 < 100) {
						local277 = 16711935 - (local348 - 50) * 327680;
					} else if (local348 < 150) {
						local277 = (local348 - 100) * 327680 + 500 + 255 - local348 * 5;
					}
				}
				if (Static456.anIntArray511[local185] == 11) {
					local348 = 150 - Static456.anIntArray510[local185];
					if (local348 < 50) {
						local277 = 16777215 - local348 * 327685;
					} else if (local348 < 100) {
						local277 = local348 * 327685 + 65280 - 16384250;
					} else if (local348 < 150) {
						local277 = 16777215 + 32768000 - local348 * 327680;
					}
				}
				local348 = local277 | 0xFF000000;
				if (Static456.anIntArray509[local185] == 0) {
					Static306.aClass45_4.method4849(local348, arg3 + local230, local854 + arg1, -16777216, local1196);
				}
				if (Static456.anIntArray509[local185] == 1) {
					Static306.aClass45_4.method4836(arg3 + local230, local854 + arg1, local1196, local348, Static70.anInt1864);
				}
				if (Static456.anIntArray509[local185] == 2) {
					Static306.aClass45_4.method4850(local348, local1196, local230 + arg3, local854 + arg1, Static70.anInt1864);
				}
				if (Static456.anIntArray509[local185] == 3) {
					Static306.aClass45_4.method4834(local230 + arg3, arg1 - -local854, 150 - Static456.anIntArray510[local185], local348, Static70.anInt1864, local1196);
				}
				@Pc(1551) int local1551;
				if (Static456.anIntArray509[local185] == 4) {
					local1551 = (150 - Static456.anIntArray510[local185]) * (Static503.aClass198_12.method4769(local1196) - -100) / 150;
					Static39.aClass7_2.V(local230 + arg3 - 50, arg1, arg3 + local230 + 50, arg2 + arg1);
					Static306.aClass45_4.method4843(arg3 + local230 + 50 - local1551, local1196, -16777216, local348, arg1 + local854);
					Static39.aClass7_2.da(arg3, arg1, arg3 + arg0, arg1 + arg2);
				}
				if (Static456.anIntArray509[local185] == 5) {
					local1551 = 150 - Static456.anIntArray510[local185];
					@Pc(1611) int local1611 = 0;
					if (local1551 < 25) {
						local1611 = local1551 - 25;
					} else if (local1551 > 125) {
						local1611 = local1551 - 125;
					}
					@Pc(1637) int local1637 = Static503.aClass198_12.anInt6045 + Static503.aClass198_12.anInt6043;
					Static39.aClass7_2.V(arg3, arg1 + local854 - local1637 - 1, arg3 + arg0, arg1 + local854 + 5);
					Static306.aClass45_4.method4849(local348, local230 + arg3, local1611 + local854 + arg1, -16777216, local1196);
					Static39.aClass7_2.da(arg3, arg1, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static306.aClass45_4.method4849(-256, local230 + arg3, arg1 - -local854, -16777216, local1196);
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static505.aBoolean639 = Static299.aClass7_12.method7835() > 0;
		Static202.aBoolean290 = true;
		Static465.anInt8858 = arg1 >> Static392.anInt3635;
		Static78.anInt1933 = arg3 >> Static392.anInt3635;
		Static184.anInt3856 = arg1;
		Static515.anInt4127 = arg3;
		Static80.anInt2175 = arg2;
		Static175.anInt3714 = Static465.anInt8858 - Static30.anInt1124;
		if (Static175.anInt3714 < 0) {
			Static406.anInt7855 = -Static175.anInt3714;
			Static175.anInt3714 = 0;
		} else {
			Static406.anInt7855 = 0;
		}
		Static36.anInt1228 = Static78.anInt1933 - Static30.anInt1124;
		if (Static36.anInt1228 < 0) {
			Static118.anInt2706 = -Static36.anInt1228;
			Static36.anInt1228 = 0;
		} else {
			Static118.anInt2706 = 0;
		}
		Static482.anInt9103 = Static465.anInt8858 + Static30.anInt1124;
		if (Static482.anInt9103 > Static10.anInt812) {
			Static482.anInt9103 = Static10.anInt812;
		}
		Static190.anInt3975 = Static78.anInt1933 + Static30.anInt1124;
		if (Static190.anInt3975 > Static255.anInt5209) {
			Static190.anInt3975 = Static255.anInt5209;
		}
		@Pc(70) boolean[][] local70 = Static339.aBooleanArrayArray8;
		@Pc(72) boolean[][] local72 = Static586.aBooleanArrayArray12;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static202.aBoolean290) {
			for (local76 = 0; local76 < Static30.anInt1124 + Static30.anInt1124 + 2; local76++) {
				for (local79 = 0; local79 < Static30.anInt1124 + Static30.anInt1124 + 2; local79++) {
					local86 = Static465.anInt8858 + local76 - Static30.anInt1124;
					local92 = Static78.anInt1933 + local79 - Static30.anInt1124;
					if (local86 >= 0 && local92 >= 0 && local86 < Static10.anInt812 && local92 < Static255.anInt5209) {
						@Pc(106) int local106 = local86 << Static392.anInt3635;
						@Pc(110) int local110 = local92 << Static392.anInt3635;
						@Pc(127) int local127 = Static432.aClass115Array3[Static432.aClass115Array3.length - 1].method8055(local92, local86) - (0x3E8 << Static392.anInt3635 - 7);
						@Pc(149) int local149 = Static140.aClass115Array1 == null ? Static432.aClass115Array3[0].method8055(local92, local86) + Static168.anInt3487 : Static140.aClass115Array1[0].method8055(local92, local86) + Static168.anInt3487;
						Static586.aBooleanArrayArray12[local76][local79] = Static299.aClass7_12.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static586.aBooleanArrayArray12[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static30.anInt1124 + Static30.anInt1124 + 1; local79++) {
				for (local86 = 0; local86 < Static30.anInt1124 + Static30.anInt1124 + 1; local86++) {
					Static339.aBooleanArrayArray8[local79][local86] = Static586.aBooleanArrayArray12[local79][local86] || Static586.aBooleanArrayArray12[local79 + 1][local86] || Static586.aBooleanArrayArray12[local79][local86 + 1] || Static586.aBooleanArrayArray12[local79 + 1][local86 + 1];
				}
			}
			Static247.anIntArray278 = arg5;
			Static380.anIntArray406 = arg6;
			Static83.anIntArray108 = arg7;
			Static123.anIntArray530 = arg8;
			Static358.anIntArray388 = arg9;
			Static552.method7773(arg10, Static299.aClass7_12);
		} else {
			if (Static99.aBooleanArrayArray3 == null) {
				Static99.aBooleanArrayArray3 = new boolean[Static10.anInt812 + Static10.anInt812 + 1][Static255.anInt5209 + Static10.anInt812 + 1];
				for (local76 = 0; local76 < Static99.aBooleanArrayArray3.length; local76++) {
					for (local79 = 0; local79 < Static99.aBooleanArrayArray3[0].length; local79++) {
						Static99.aBooleanArrayArray3[local76][local79] = true;
					}
				}
			}
			Static586.aBooleanArrayArray12 = Static99.aBooleanArrayArray3;
			Static339.aBooleanArrayArray8 = Static99.aBooleanArrayArray3;
			Static175.anInt3714 = 0;
			Static36.anInt1228 = 0;
			Static482.anInt9103 = Static10.anInt812;
			Static190.anInt3975 = Static255.anInt5209;
			Static407.anInt7866 = 0;
		}
		Static24.method902(Static299.aClass7_12);
		for (@Pc(322) Class21_Sub4 local322 = (Class21_Sub4) Static322.aClass158_13.method3726(); local322 != null; local322 = (Class21_Sub4) Static322.aClass158_13.method3721()) {
			local322.method8246();
			Static125.method5997(local322);
		}
		if (Static505.aBoolean639) {
			for (local79 = 0; local79 < Static566.anInt10281; local79++) {
				Static201.aClass85Array1[local79].method2044(arg14, arg0);
			}
		}
		if (Static406.aBoolean566) {
			Static445.anIntArray493 = Static299.aClass7_12.v();
			Static299.aClass7_12.oa(Static500.anIntArray534);
			local79 = (Static500.anIntArray534[2] - Static500.anIntArray534[0]) / Static8.anInt745;
			for (local86 = 0; local86 < Static8.anInt745 - 1; local86++) {
				Static13.anIntArray13[local86] = local79 * (local86 + 1) + Static427.anIntArray456[local86];
			}
			for (local92 = 0; local92 < Static574.aClass180Array1.length; local92++) {
				Static574.aClass180Array1[local92].method4444();
			}
		}
		if (Static288.aClass182ArrayArrayArray2 != null) {
			if (Static406.aBoolean566) {
				Static233.method3766(0);
			}
			Static402.method6122(true);
			Static299.aClass7_12.CA(-1, 1583160, 40, 127);
			Static523.method7405(true, arg4, arg10, arg11);
			if (Static406.aBoolean566) {
				Static392.method2876();
			}
			Static299.aClass7_12.L();
			Static402.method6122(false);
		}
		Static523.method7405(false, arg4, arg10, arg11);
		if (Static406.aBoolean566) {
			for (local79 = 0; local79 < Static218.anInt4559; local79++) {
				Static212.aBooleanArrayArrayArray1[local79] = Static375.aBooleanArrayArrayArray2[local79];
			}
			Static233.method3766(0);
			for (local86 = 0; local86 < Static574.aClass180Array1.length; local86++) {
				Static574.aClass180Array1[local86].method4444();
			}
		}
		if (Static406.aBoolean566) {
			Static392.method2876();
			for (local79 = 0; local79 < Static218.anInt4559; local79++) {
				Static375.aBooleanArrayArrayArray2[local79] = Static212.aBooleanArrayArrayArray1[local79];
			}
			if (Static315.anInt6311 == 2) {
				@Pc(505) int local505;
				if (Static376.aLongArray15[0] < Static376.aLongArray15[1]) {
					if (Static13.anIntArray13[0] + Static427.anIntArray456[0] > Static500.anIntArray534[0]) {
						local505 = Static427.anIntArray456[0]++;
					}
				} else if (Static376.aLongArray15[0] > Static376.aLongArray15[1] && Static13.anIntArray13[0] + Static427.anIntArray456[0] < Static500.anIntArray534[2]) {
					local505 = Static427.anIntArray456[0]--;
				}
			}
		}
		if (!Static202.aBoolean290) {
			Static339.aBooleanArrayArray8 = local70;
			Static586.aBooleanArrayArray12 = local72;
		}
		Static433.method6465();
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
	public static void method5280() {
		if (Static54.anInt1437 < 102) {
			Static54.anInt1437 += 6;
		}
		@Pc(28) int local28;
		if (Static61.anInt1631 != -1 && Static322.aLong169 < Static112.method2047()) {
			for (local28 = Static61.anInt1631; local28 < Static123.aStringArray37.length; local28++) {
				if (Static123.aStringArray37[local28].startsWith("pause")) {
					@Pc(38) int local38 = 5;
					try {
						local38 = Integer.parseInt(Static123.aStringArray37[local28].substring(6));
					} catch (@Pc(47) Exception local47) {
					}
					Static47.method1139("Pausing for " + local38 + " seconds...");
					Static61.anInt1631 = local28 + 1;
					Static322.aLong169 = Static112.method2047() + (long) (local38 * 1000);
					return;
				}
				Static437.aString173 = Static123.aStringArray37[local28];
				Static84.method1789(false);
			}
			Static61.anInt1631 = -1;
		}
		if (Static56.anInt1480 != 0) {
			Static85.anInt2259 -= Static56.anInt1480 * 5;
			if (Static85.anInt2259 >= Static506.anInt9457) {
				Static85.anInt2259 = Static506.anInt9457 - 1;
			}
			Static56.anInt1480 = 0;
			if (Static85.anInt2259 < 0) {
				Static85.anInt2259 = 0;
			}
		}
		for (local28 = 0; local28 < Static173.anInt3654; local28++) {
			@Pc(127) Interface19 local127 = Static504.anInterface19Array2[local28];
			@Pc(131) int local131 = local127.method5458();
			@Pc(135) char local135 = local127.method5461();
			@Pc(139) int local139 = local127.method5459();
			if (local131 == 84) {
				Static84.method1789(false);
			}
			if (local131 == 80) {
				Static84.method1789(true);
			} else if (local131 == 66 && (local139 & 0x4) != 0) {
				if (Static499.aClipboard3 != null) {
					@Pc(415) String local415 = "";
					for (@Pc(420) int local420 = Static404.aStringArray31.length - 1; local420 >= 0; local420--) {
						if (Static404.aStringArray31[local420] != null && Static404.aStringArray31[local420].length() > 0) {
							local415 = local415 + Static404.aStringArray31[local420] + '\n';
						}
					}
					Static499.aClipboard3.setContents(new StringSelection(local415), null);
				}
			} else if (local131 == 67 && (local139 & 0x4) != 0) {
				if (Static499.aClipboard3 != null) {
					@Pc(176) Transferable local176 = Static499.aClipboard3.getContents(null);
					if (local176 != null) {
						try {
							@Pc(183) String local183 = (String) local176.getTransferData(DataFlavor.stringFlavor);
							if (local183 != null) {
								@Pc(190) String[] local190 = Static297.method4750(local183, '\n');
								Static272.method8238(local190);
							}
						} catch (@Pc(195) Exception local195) {
						}
					}
				}
			} else if (local131 == 85 && Static50.anInt1334 > 0) {
				Static437.aString173 = Static437.aString173.substring(0, Static50.anInt1334 - 1) + Static437.aString173.substring(Static50.anInt1334);
				Static50.anInt1334--;
			} else if (local131 == 101 && Static50.anInt1334 < Static437.aString173.length()) {
				Static437.aString173 = Static437.aString173.substring(0, Static50.anInt1334) + Static437.aString173.substring(Static50.anInt1334 + 1);
			} else if (local131 == 96 && Static50.anInt1334 > 0) {
				Static50.anInt1334--;
			} else if (local131 == 97 && Static50.anInt1334 < Static437.aString173.length()) {
				Static50.anInt1334++;
			} else if (local131 == 102) {
				Static50.anInt1334 = 0;
			} else if (local131 == 103) {
				Static50.anInt1334 = Static437.aString173.length();
			} else if (local131 == 104 && Static404.aStringArray31.length > Static241.anInt5029) {
				Static241.anInt5029++;
				Static413.method6235();
				Static50.anInt1334 = Static437.aString173.length();
			} else if (local131 == 105 && Static241.anInt5029 > 0) {
				Static241.anInt5029--;
				Static413.method6235();
				Static50.anInt1334 = Static437.aString173.length();
			} else if (Static73.method1574(local135) || local135 == '\\' || local135 == '/' || local135 == '.' || local135 == ':' || local135 == ',' || local135 == ' ' || local135 == '_' || local135 == '-' || local135 == '+' || local135 == '[' || local135 == ']') {
				Static437.aString173 = Static437.aString173.substring(0, Static50.anInt1334) + Static504.anInterface19Array2[local28].method5461() + Static437.aString173.substring(Static50.anInt1334);
				Static50.anInt1334++;
			}
		}
		Static451.anInt8607 = 0;
		Static173.anInt3654 = 0;
		Static533.method7519();
	}
}
