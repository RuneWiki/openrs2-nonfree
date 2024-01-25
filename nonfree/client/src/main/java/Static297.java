import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_184 = new Class217(27, 15);

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
	public static final int[] anIntArray443 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_185 = new Class217(50, 0);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)V")
	public static void method5177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static99.anInt2276;
		Static238.anInt4807 = 0;
		@Pc(11) int[] local11 = Static238.anIntArray382;
		@Pc(22) byte local22 = Static225.method4175() == 2 ? (byte) Static365.anInt7010 : 1;
		@Pc(80) int local80;
		@Pc(85) int local85;
		@Pc(276) int local276;
		@Pc(457) int local457;
		@Pc(572) int local572;
		@Pc(332) int local332;
		@Pc(689) int local689;
		@Pc(513) int local513;
		label434: for (@Pc(24) int local24 = 0; local24 < Static277.anInt5394 + local7; local24++) {
			@Pc(28) Class208 local28 = null;
			@Pc(40) Class11_Sub2_Sub6 local40;
			if (local7 <= local24) {
				local40 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local24 - local7]];
				local28 = ((Class11_Sub2_Sub6_Sub2) local40).aClass208_1;
				if (local28.anIntArray480 != null) {
					local28 = local28.method5539();
					if (local28 == null) {
						continue;
					}
				}
			} else {
				local40 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local11[local24]];
			}
			if (local40.anInt6770 >= 0) {
				if (Static341.aByteArrayArrayArray10 != null && local40.aByte79 > Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
					for (local80 = local40.aShort94; local80 <= local40.aShort92; local80++) {
						for (local85 = local40.aShort93; local85 <= local40.aShort91; local85++) {
							if (Static341.aByteArrayArrayArray10[local40.aByte79][local80][local85] == local22) {
								continue label434;
							}
						}
					}
				}
				Static289.method5103(arg2 >> 1, local40, local40.method5887(), arg1 >> 1);
				if (Static168.anIntArray261[0] >= 0) {
					if (local40.aString64 != null && (local7 <= local24 || Static311.anInt5657 == 0 || Static311.anInt5657 == 3 || Static311.anInt5657 == 1 && Static248.method4698(((Class11_Sub2_Sub6_Sub1) local40).aString63)) && Static238.anInt4807 < Static38.anInt946) {
						Static38.anIntArray66[Static238.anInt4807] = Static64.aClass80_17.method2543(local40.aString64) / 2;
						Static38.anIntArray64[Static238.anInt4807] = Static168.anIntArray261[0];
						Static38.anIntArray62[Static238.anInt4807] = Static168.anIntArray261[1];
						Static38.anIntArray67[Static238.anInt4807] = local40.anInt6740;
						Static38.anIntArray63[Static238.anInt4807] = local40.anInt6765;
						Static38.anIntArray65[Static238.anInt4807] = local40.anInt6753;
						Static38.aStringArray5[Static238.anInt4807] = local40.aString64;
						Static238.anInt4807++;
					}
					@Pc(216) Class4 local216 = Static365.aClass4Array21[0];
					local85 = Static168.anIntArray261[1] + arg0 - Math.max(Static64.aClass80_17.anInt2625, local216.method5952());
					@Pc(244) Class4 local244;
					@Pc(344) int local344;
					if (!local40.aBoolean502 && Static51.anInt1301 < local40.anInt6769) {
						local244 = Static365.aClass4Array21[1];
						if (local40 instanceof Class11_Sub2_Sub6_Sub2) {
							@Pc(250) Class11_Sub2_Sub6_Sub2 local250 = (Class11_Sub2_Sub6_Sub2) local40;
							@Pc(259) Class4[] local259 = (Class4[]) Static328.aClass21_165.method854((long) local250.aClass208_1.anInt6171);
							if (local259 == null) {
								@Pc(268) Class201[] local268 = Static382.method5434(Static280.aClass30_83, local250.aClass208_1.anInt6171);
								if (local268 != null) {
									local259 = new Class4[local268.length];
									for (local276 = 0; local276 < local268.length; local276++) {
										local259[local276] = Static9.aClass63_1.method4589(local268[local276]);
									}
									Static328.aClass21_165.method843(local259, (long) local250.aClass208_1.anInt6171);
								}
							}
							if (local259 != null && local259.length == 2) {
								local216 = local259[0];
								local244 = local259[1];
							}
						}
						local332 = arg3 + Static168.anIntArray261[0] - (local216.method5962() >> 1);
						local216.method5948(local332, local85);
						local344 = local216.method5962() * local40.anInt6780 / 255;
						if (local40.anInt6780 > 0 && local344 < 2) {
							local344 = 2;
						}
						Static9.aClass63_1.method4659(local332, local85, local332 + local344, local85 + local216.method5952());
						local244.method5948(local332, local85);
						Static9.aClass63_1.method4566(arg3, arg0, arg3 + arg2, arg1 + arg0);
					}
					local85 -= 2;
					if (!local40.aBoolean502) {
						if (local40.anInt6750 > Static51.anInt1301) {
							local244 = Static132.aClass4Array5[local40.aBoolean500 ? 2 : 0];
							@Pc(406) Class4 local406 = Static132.aClass4Array5[local40.aBoolean500 ? 3 : 1];
							if (local40 instanceof Class11_Sub2_Sub6_Sub2) {
								local344 = local28.anInt6194;
								if (local344 == -1) {
									local344 = local40.method5898().anInt2105;
								}
							} else {
								local344 = local40.method5898().anInt2105;
							}
							if (local344 != -1) {
								@Pc(442) Class4[] local442 = (Class4[]) Static217.aClass21_116.method854((long) local344);
								if (local442 == null) {
									@Pc(449) Class201[] local449 = Static382.method5434(Static280.aClass30_83, local344);
									if (local449 != null) {
										local442 = new Class4[local449.length];
										for (local457 = 0; local457 < local449.length; local457++) {
											local442[local457] = Static9.aClass63_1.method4589(local449[local457]);
										}
										Static217.aClass21_116.method843(local442, (long) local344);
									}
								}
								if (local442 != null && local442.length == 4) {
									local406 = local442[local40.aBoolean500 ? 3 : 1];
									local244 = local442[local40.aBoolean500 ? 2 : 0];
								}
							}
							local513 = local40.anInt6750 - Static51.anInt1301;
							if (local40.anInt6744 >= local513) {
								local276 = local244.method5962();
							} else {
								local513 -= local40.anInt6744;
								local457 = local40.anInt6771 == 0 ? 0 : (local40.anInt6757 - local513) / local40.anInt6771 * local40.anInt6771;
								local276 = local244.method5962() * local457 / local40.anInt6757;
							}
							local457 = local244.method5952();
							local85 -= local457;
							local572 = arg3 + Static168.anIntArray261[0] - (local244.method5962() >> 1);
							local244.method5948(local572, local85);
							Static9.aClass63_1.method4659(local572, local85, local572 + local276, local85 - -local457);
							local406.method5948(local572, local85);
							local85 -= 2;
							Static9.aClass63_1.method4566(arg3, arg0, arg2 + arg3, arg1 + arg0);
						}
						if (local24 < local7) {
							@Pc(639) Class11_Sub2_Sub6_Sub1 local639 = (Class11_Sub2_Sub6_Sub1) local40;
							if (local639.anInt6705 != -1) {
								local85 -= 25;
								Static320.aClass4Array12[local639.anInt6705].method5948(Static168.anIntArray261[0] + arg3 - 12, local85);
								local85 -= 2;
							}
							if (local639.anInt6677 != -1) {
								local85 -= 25;
								Static208.aClass4Array10[local639.anInt6677].method5948(arg3 + Static168.anIntArray261[0] - 12, local85);
								local85 -= 2;
							}
						} else if (local28.anInt6157 >= 0 && local28.anInt6157 < Static208.aClass4Array10.length) {
							local85 -= 25;
							local244 = Static208.aClass4Array10[local28.anInt6157];
							local244.method5948(arg3 + Static168.anIntArray261[0] - (local244.method5962() >> 1), local85);
							local85 -= 2;
						}
					}
					@Pc(691) Class101[] local691;
					@Pc(699) Class101 local699;
					@Pc(718) Class4 local718;
					if (!(local40 instanceof Class11_Sub2_Sub6_Sub1)) {
						local689 = 0;
						local691 = Static60.aClass101Array1;
						for (local344 = 0; local344 < local691.length; local344++) {
							local699 = local691[local344];
							if (local699 != null && local699.anInt3096 == 1 && Static81.anIntArray143[local24 - local7] == local699.anInt3103) {
								local718 = Static225.aClass4Array13[local699.anInt3104];
								if (local718.method5952() > local689) {
									local689 = local718.method5952();
								}
								if (Static51.anInt1301 % 20 < 10) {
									local718.method5948(Static168.anIntArray261[0] + arg3 - 12, local85 + -local718.method5952());
								}
							}
						}
						if (local689 > 0) {
						}
					} else if (local24 >= 0) {
						local689 = 0;
						local691 = Static60.aClass101Array1;
						for (local344 = 0; local344 < local691.length; local344++) {
							local699 = local691[local344];
							if (local699 != null && local699.anInt3096 == 10 && local699.anInt3103 == local11[local24]) {
								local718 = Static225.aClass4Array13[local699.anInt3104];
								if (local718.method5952() > local689) {
									local689 = local718.method5952();
								}
								local718.method5948(Static168.anIntArray261[0] + arg3 - 12, -local718.method5952() + local85);
							}
						}
						if (local689 > 0) {
						}
					}
					for (local689 = 0; local689 < 4; local689++) {
						if (Static51.anInt1301 < local40.anIntArray502[local689]) {
							local332 = local40.method5887() / 2;
							Static289.method5103(arg2 >> 1, local40, local332, arg1 >> 1);
							if (Static168.anIntArray261[0] > -1) {
								if (local689 == 1) {
									Static168.anIntArray261[1] -= 20;
								}
								if (local689 == 2) {
									Static168.anIntArray261[0] -= 15;
									Static168.anIntArray261[1] -= 10;
								}
								if (local689 == 3) {
									Static168.anIntArray261[0] += 15;
									Static168.anIntArray261[1] -= 10;
								}
								Static235.aClass4Array14[local40.anIntArray503[local689]].method5948(Static168.anIntArray261[0] + arg3 - 12, Static168.anIntArray261[1] + arg0 + -12);
								Static364.aClass33_4.method6036(-1, Static168.anIntArray261[1] + arg0 + 3, Integer.toString(local40.anIntArray501[local689]), 0, arg3 + Static168.anIntArray261[0] - 1);
							}
						}
					}
				}
			}
		}
		@Pc(974) int local974;
		for (@Pc(968) int local968 = 0; local968 < Static155.anInt3188; local968++) {
			local974 = Static209.anIntArray346[local968];
			@Pc(981) Class11_Sub2_Sub6 local981;
			if (local974 < 2048) {
				local981 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local974];
			} else {
				local981 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local974 - 2048];
			}
			local85 = Static180.anIntArray281[local968];
			@Pc(1002) Class11_Sub2_Sub6 local1002;
			if (local85 >= 2048) {
				local1002 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local85 - 2048];
			} else {
				local1002 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local85];
			}
			Static210.method3870(arg3, --local981.anInt6793, local1002, local981, arg0, arg1, arg2);
		}
		local974 = Static64.aClass80_17.anInt2611 + Static64.aClass80_17.anInt2625 + 2;
		for (local80 = 0; local80 < Static238.anInt4807; local80++) {
			local85 = Static38.anIntArray64[local80];
			local689 = Static38.anIntArray62[local80];
			local332 = Static38.anIntArray66[local80];
			@Pc(1060) boolean local1060 = true;
			while (local1060) {
				local1060 = false;
				for (local513 = 0; local513 < local80; local513++) {
					if (Static38.anIntArray62[local513] - local974 < local689 + 2 && local689 - local974 < Static38.anIntArray62[local513] + 2 && Static38.anIntArray66[local513] + Static38.anIntArray64[local513] > local85 - local332 && Static38.anIntArray64[local513] - Static38.anIntArray66[local513] < local85 - -local332 && Static38.anIntArray62[local513] - local974 < local689) {
						local689 = Static38.anIntArray62[local513] - local974;
						local1060 = true;
					}
				}
			}
			Static38.anIntArray62[local80] = local689;
			@Pc(1157) String local1157 = Static38.aStringArray5[local80];
			if (Static200.anInt4051 == 0) {
				local276 = 16776960;
				if (Static38.anIntArray67[local80] < 6) {
					local276 = Static197.anIntArray308[Static38.anIntArray67[local80]];
				}
				if (Static38.anIntArray67[local80] == 6) {
					local276 = Static365.anInt7010 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static38.anIntArray67[local80] == 7) {
					local276 = Static365.anInt7010 % 20 < 10 ? 255 : 65535;
				}
				if (Static38.anIntArray67[local80] == 8) {
					local276 = Static365.anInt7010 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static38.anIntArray67[local80] == 9) {
					local457 = 150 - Static38.anIntArray65[local80];
					if (local457 < 50) {
						local276 = local457 * 1280 + 16711680;
					} else if (local457 < 100) {
						local276 = 16776960 + 16384000 - local457 * 327680;
					} else if (local457 < 150) {
						local276 = (local457 - 100) * 5 + 65280;
					}
				}
				if (Static38.anIntArray67[local80] == 10) {
					local457 = 150 - Static38.anIntArray65[local80];
					if (local457 < 50) {
						local276 = local457 * 5 + 16711680;
					} else if (local457 < 100) {
						local276 = 16711935 + 16384000 - local457 * 327680;
					} else if (local457 < 150) {
						local276 = local457 * 327680 + 255 - (local457 - 100) * 5 - 32768000;
					}
				}
				if (Static38.anIntArray67[local80] == 11) {
					local457 = 150 - Static38.anIntArray65[local80];
					if (local457 < 50) {
						local276 = 16777215 - local457 * 327685;
					} else if (local457 < 100) {
						local276 = (local457 - 50) * 327685 + 65280;
					} else if (local457 < 150) {
						local276 = 16777215 - (local457 - 100) * 327680;
					}
				}
				local457 = local276 | 0xFF000000;
				if (Static38.anIntArray63[local80] == 0) {
					Static340.aClass33_3.method6036(local457, local689 + arg0, local1157, -16777216, arg3 + local85);
				}
				if (Static38.anIntArray63[local80] == 1) {
					Static340.aClass33_3.method6028(arg3 + local85, local457, arg0 + local689, local1157, Static365.anInt7010);
				}
				if (Static38.anIntArray63[local80] == 2) {
					Static340.aClass33_3.method6038(local689 + arg0, arg3 - -local85, local1157, Static365.anInt7010, local457);
				}
				if (Static38.anIntArray63[local80] == 3) {
					Static340.aClass33_3.method6021(150 - Static38.anIntArray65[local80], arg3 - -local85, local457, local1157, Static365.anInt7010, arg0 + local689);
				}
				if (Static38.anIntArray63[local80] == 4) {
					local572 = (150 - Static38.anIntArray65[local80]) * (Static64.aClass80_17.method2543(local1157) + 100) / 150;
					Static9.aClass63_1.method4659(arg3 + local85 - 50, arg0, arg3 + local85 + 50, arg1 + arg0);
					Static340.aClass33_3.method6024(-16777216, local689 + arg0, local1157, local457, local85 + arg3 + 50 - local572);
					Static9.aClass63_1.method4566(arg3, arg0, arg2 + arg3, arg1 + arg0);
				}
				if (Static38.anIntArray63[local80] == 5) {
					local572 = 150 - Static38.anIntArray65[local80];
					@Pc(1568) int local1568 = 0;
					if (local572 < 25) {
						local1568 = local572 - 25;
					} else if (local572 > 125) {
						local1568 = local572 - 125;
					}
					@Pc(1594) int local1594 = Static64.aClass80_17.anInt2625 + Static64.aClass80_17.anInt2611;
					Static9.aClass63_1.method4659(arg3, local689 + arg0 - local1594 - 1, arg2 + arg3, local689 + arg0 + 5);
					Static340.aClass33_3.method6036(local457, local1568 + arg0 + local689, local1157, -16777216, local85 + arg3);
					Static9.aClass63_1.method4566(arg3, arg0, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static340.aClass33_3.method6036(-256, arg0 + local689, local1157, -16777216, arg3 + local85);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	public static void method5179() {
		Static31.aClass112Array1 = null;
		Static239.method4430(Static336.anInt6389, 0, 0, 0, 0, Static213.anInt4274, Static130.anInt2825, -1);
		if (Static31.aClass112Array1 != null) {
			Static22.method5878(0, Static247.anInt5073, Static245.anInt5054, 0, Static213.anInt4274, Static130.anInt2825, Static31.aClass112Array1, -1412584499, Static110.aClass112_8.anInt3452);
			Static31.aClass112Array1 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
	public static int method5184(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/util/Random;BI)I")
	public static int method5193(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static49.method1155(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(44) int local44;
			do {
				local44 = arg0.nextInt();
			} while (local41 <= local44);
			return Static141.method2838(arg1, local44);
		}
	}
}
