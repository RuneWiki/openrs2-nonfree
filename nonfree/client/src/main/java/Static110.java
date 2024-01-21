import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!w", name = "db", descriptor = "I")
	public static int anInt2867;

	@OriginalMember(owner = "client!w", name = "gb", descriptor = "Lclient!oc;")
	public static Class34 aClass34_83;

	@OriginalMember(owner = "client!w", name = "Ob", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_24;

	@OriginalMember(owner = "client!w", name = "kb", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!w", name = "nb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1695 = null;

	@OriginalMember(owner = "client!w", name = "Db", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1699 = Static15.method178("Select");

	@OriginalMember(owner = "client!w", name = "sb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1696 = aClass23_1699;

	@OriginalMember(owner = "client!w", name = "yb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1697 = Static15.method178(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!w", name = "Cb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1698 = Static15.method178("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!w", name = "Ib", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1700 = Static15.method178("headicons_hint");

	@OriginalMember(owner = "client!w", name = "Kb", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array19 = new Class23[1000];

	@OriginalMember(owner = "client!w", name = "Lb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1701 = Static15.method178("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!hb;I)V")
	public static void method1889(@OriginalArg(1) Class1_Sub5_Sub1 arg0) {
		while (true) {
			@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) Static82.aClass45_7.method1299();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2724; local22++) {
				if (local15.aClass62Array2[local22] != null) {
					if (local15.aClass62Array2[local22].anInt2572 == 2) {
						local15.anIntArray377[local22] = -5;
					}
					if (local15.aClass62Array2[local22].anInt2572 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass62Array1[local22] != null) {
					if (local15.aClass62Array1[local22].anInt2572 == 2) {
						local15.anIntArray377[local22] = -6;
					}
					if (local15.aClass62Array1[local22].anInt2572 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method731(145);
			arg0.method674(0);
			@Pc(102) int local102 = arg0.anInt1266;
			arg0.method679(local15.anInt2717);
			for (@Pc(109) int local109 = 0; local109 < local15.anInt2724; local109++) {
				if (local15.anIntArray377[local109] == 0) {
					try {
						@Pc(130) int local130 = local15.anIntArray378[local109];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local130 == 0) {
							local142 = (Field) local15.aClass62Array2[local109].anObject4;
							local146 = local142.getInt(null);
							arg0.method674(0);
							arg0.method679(local146);
						} else if (local130 == 1) {
							local142 = (Field) local15.aClass62Array2[local109].anObject4;
							local142.setInt(null, local15.anIntArray376[local109]);
							arg0.method674(0);
						} else if (local130 == 2) {
							local142 = (Field) local15.aClass62Array2[local109].anObject4;
							local146 = local142.getModifiers();
							arg0.method674(0);
							arg0.method679(local146);
						}
						@Pc(219) Method local219;
						if (local130 == 3) {
							local219 = (Method) local15.aClass62Array1[local109].anObject4;
							@Pc(244) byte[][] local244 = local15.aByteArrayArrayArray6[local109];
							@Pc(248) Object[] local248 = new Object[local244.length];
							for (@Pc(250) int local250 = 0; local250 < local244.length; local250++) {
								@Pc(262) ObjectInputStream local262 = new ObjectInputStream(new ByteArrayInputStream(local244[local250]));
								local248[local250] = local262.readObject();
							}
							@Pc(281) Object local281 = local219.invoke(null, local248);
							if (local281 == null) {
								arg0.method674(0);
							} else if (local281 instanceof Number) {
								arg0.method674(1);
								arg0.method711(((Number) local281).longValue());
							} else if (local281 instanceof Class23) {
								arg0.method674(2);
								arg0.method707((Class23) local281);
							} else {
								arg0.method674(4);
							}
						} else if (local130 == 4) {
							local219 = (Method) local15.aClass62Array1[local109].anObject4;
							local146 = local219.getModifiers();
							arg0.method674(0);
							arg0.method679(local146);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method674(-10);
					} catch (@Pc(330) InvalidClassException local330) {
						arg0.method674(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method674(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method674(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method674(-14);
					} catch (@Pc(354) IllegalArgumentException local354) {
						arg0.method674(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method674(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method674(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method674(-18);
					} catch (@Pc(378) NullPointerException local378) {
						arg0.method674(-19);
					} catch (@Pc(384) Exception local384) {
						arg0.method674(-20);
					} catch (@Pc(390) Throwable local390) {
						arg0.method674(-21);
					}
				} else {
					arg0.method674(local15.anIntArray377[local109]);
				}
			}
			arg0.method703(local102);
			arg0.method684(arg0.anInt1266 - local102);
			local15.method1913();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!q;Lclient!ud;I)V")
	public static void method1891(@OriginalArg(0) Class50[] arg0, @OriginalArg(1) Class65 arg1) {
		@Pc(11) int local11;
		@Pc(27) int local27;
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 104; local8++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static95.aByteArrayArrayArray5[local5][local8][local11] & 0x1) == 1) {
						local27 = local5;
						if ((Static95.aByteArrayArrayArray5[1][local8][local11] & 0x2) == 2) {
							local27 = local5 - 1;
						}
						if (local27 >= 0) {
							arg0[local27].method1362(local11, local8);
						}
					}
				}
			}
		}
		Static76.anInt2080 += (int) (Math.random() * 5.0D) - 2;
		if (Static76.anInt2080 < -16) {
			Static76.anInt2080 = -16;
		}
		if (Static76.anInt2080 > 16) {
			Static76.anInt2080 = 16;
		}
		Static94.anInt2486 += (int) (Math.random() * 5.0D) - 2;
		if (Static94.anInt2486 < -8) {
			Static94.anInt2486 = -8;
		}
		if (Static94.anInt2486 > 8) {
			Static94.anInt2486 = 8;
		}
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(135) int local135;
		@Pc(138) int local138;
		@Pc(160) int local160;
		@Pc(181) int local181;
		@Pc(194) int local194;
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(210) int local210;
		@Pc(277) int local277;
		@Pc(261) int local261;
		@Pc(503) int local503;
		@Pc(545) int local545;
		@Pc(646) int local646;
		@Pc(656) int local656;
		@Pc(671) int local671;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(123) byte[][] local123 = Static20.aByteArrayArrayArray1[local11];
			local127 = (int) Math.sqrt(5100.0D);
			local133 = local127 * 768 >> 8;
			for (local135 = 1; local135 < 103; local135++) {
				for (local138 = 1; local138 < 103; local138++) {
					local160 = Static72.anIntArrayArrayArray5[local11][local138 + 1][local135] - Static72.anIntArrayArrayArray5[local11][local138 - 1][local135];
					local181 = Static72.anIntArrayArrayArray5[local11][local138][local135 + 1] - Static72.anIntArrayArrayArray5[local11][local138][local135 - 1];
					local194 = (int) Math.sqrt((double) (local160 * local160 + local181 * local181 + 65536));
					local200 = (local160 << 8) / local194;
					local204 = 65536 / local194;
					local210 = (local181 << 8) / local194;
					local261 = (local123[local138 - 1][local135] >> 2) - (-(local123[local138 + 1][local135] >> 3) - (local123[local138][local135 - 1] >> 2) - ((local123[local138][local135 - -1] >> 3) - -(local123[local138][local135] >> 1)));
					local277 = (local210 * -50 + local204 * -10 + local200 * -50) / local133 + 96;
					Static51.anIntArrayArray33[local138][local135] = local277 - local261;
				}
			}
			for (local138 = 0; local138 < 104; local138++) {
				Static8.anIntArray37[local138] = 0;
				Static10.anIntArray41[local138] = 0;
				Static98.anIntArray345[local138] = 0;
				Static89.anIntArray320[local138] = 0;
				Static28.anIntArray265[local138] = 0;
			}
			for (local160 = -5; local160 < 109; local160++) {
				for (local181 = 0; local181 < 104; local181++) {
					local194 = local160 + 5;
					@Pc(402) int local402;
					if (local194 >= 0 && local194 < 104) {
						local200 = Static21.aByteArrayArrayArray2[local11][local194][local181] & 0xFF;
						if (local200 > 0) {
							@Pc(366) Class1_Sub1_Sub14 local366 = Static88.method710(local200 - 1);
							Static8.anIntArray37[local181] += local366.anInt2621;
							Static10.anIntArray41[local181] += local366.anInt2615;
							Static98.anIntArray345[local181] += local366.anInt2624;
							Static89.anIntArray320[local181] += local366.anInt2619;
							local402 = Static28.anIntArray265[local181]++;
						}
					}
					local200 = local160 - 5;
					if (local200 >= 0 && local200 < 104) {
						local204 = Static21.aByteArrayArrayArray2[local11][local200][local181] & 0xFF;
						if (local204 > 0) {
							@Pc(435) Class1_Sub1_Sub14 local435 = Static88.method710(local204 - 1);
							Static8.anIntArray37[local181] -= local435.anInt2621;
							Static10.anIntArray41[local181] -= local435.anInt2615;
							Static98.anIntArray345[local181] -= local435.anInt2624;
							Static89.anIntArray320[local181] -= local435.anInt2619;
							local402 = Static28.anIntArray265[local181]--;
						}
					}
				}
				if (local160 >= 1 && local160 < 103) {
					local200 = 0;
					local194 = 0;
					local210 = 0;
					local204 = 0;
					local277 = 0;
					for (local261 = -5; local261 < 109; local261++) {
						local503 = local261 + 5;
						if (local503 >= 0 && local503 < 104) {
							local277 += Static28.anIntArray265[local503];
							local210 += Static89.anIntArray320[local503];
							local204 += Static98.anIntArray345[local503];
							local200 += Static10.anIntArray41[local503];
							local194 += Static8.anIntArray37[local503];
						}
						local545 = local261 - 5;
						if (local545 >= 0 && local545 < 104) {
							local194 -= Static8.anIntArray37[local545];
							local200 -= Static10.anIntArray41[local545];
							local210 -= Static89.anIntArray320[local545];
							local204 -= Static98.anIntArray345[local545];
							local277 -= Static28.anIntArray265[local545];
						}
						if (local261 >= 1 && local261 < 103 && (!Static9.aBoolean7 || (Static95.aByteArrayArrayArray5[0][local160][local261] & 0x2) != 0 || (Static95.aByteArrayArrayArray5[local11][local160][local261] & 0x10) == 0 && Static8.method95(local261, local11, local160) == Static61.anInt1894)) {
							if (Static80.anInt2258 > local11) {
								Static80.anInt2258 = local11;
							}
							local646 = Static21.aByteArrayArrayArray2[local11][local160][local261] & 0xFF;
							local656 = Static61.aByteArrayArrayArray3[local11][local160][local261] & 0xFF;
							if (local646 > 0 || local656 > 0) {
								local671 = Static72.anIntArrayArrayArray5[local11][local160][local261];
								@Pc(681) int local681 = Static72.anIntArrayArrayArray5[local11][local160 + 1][local261];
								@Pc(693) int local693 = Static72.anIntArrayArrayArray5[local11][local160 + 1][local261 + 1];
								@Pc(703) int local703 = Static72.anIntArrayArrayArray5[local11][local160][local261 + 1];
								@Pc(709) int local709 = Static51.anIntArrayArray33[local160][local261];
								@Pc(717) int local717 = Static51.anIntArrayArray33[local160 + 1][local261];
								@Pc(727) int local727 = Static51.anIntArrayArray33[local160 + 1][local261 + 1];
								@Pc(735) int local735 = Static51.anIntArrayArray33[local160][local261 + 1];
								@Pc(737) int local737 = -1;
								@Pc(739) int local739 = -1;
								@Pc(747) int local747;
								@Pc(755) int local755;
								if (local646 > 0) {
									local747 = local194 * 256 / local210;
									@Pc(751) int local751 = local204 / local277;
									local755 = local200 / local277;
									local737 = Static40.method875(local747, local755, local751);
									@Pc(768) int local768 = local747 + Static94.anInt2486 & 0xFF;
									local751 += Static76.anInt2080;
									if (local751 < 0) {
										local751 = 0;
									} else if (local751 > 255) {
										local751 = 255;
									}
									local739 = Static40.method875(local768, local755, local751);
								}
								if (local11 > 0) {
									@Pc(795) boolean local795 = true;
									if (local646 == 0 && Static109.aByteArrayArrayArray8[local11][local160][local261] != 0) {
										local795 = false;
									}
									if (local656 > 0 && !Static27.method443(local656 - 1).aBoolean29) {
										local795 = false;
									}
									if (local795 && local671 == local681 && local693 == local671 && local671 == local703) {
										Static45.anIntArrayArrayArray4[local11][local160][local261] |= 0x924;
									}
								}
								local747 = 0;
								if (local739 != -1) {
									local747 = Static93.anIntArray339[Static9.method104(local739, 96)];
								}
								if (local656 == 0) {
									arg1.method1723(local11, local160, local261, 0, 0, -1, local671, local681, local693, local703, Static9.method104(local737, local709), Static9.method104(local737, local717), Static9.method104(local737, local727), Static9.method104(local737, local735), 0, 0, 0, 0, local747, 0);
								} else {
									local755 = Static109.aByteArrayArrayArray8[local11][local160][local261] + 1;
									@Pc(899) byte local899 = Static108.aByteArrayArrayArray7[local11][local160][local261];
									@Pc(905) Class1_Sub1_Sub5 local905 = Static27.method443(local656 - 1);
									@Pc(908) int local908 = local905.anInt455;
									@Pc(917) int local917;
									@Pc(915) int local915;
									@Pc(945) int local945;
									@Pc(950) int local950;
									if (local908 >= 0) {
										local915 = Static93.anInterface2_1.method1331(local908);
										local917 = -1;
									} else if (local905.anInt456 == 16711935) {
										local915 = -2;
										local908 = -1;
										local917 = -2;
									} else {
										local917 = Static40.method875(local905.anInt462, local905.anInt454, local905.anInt464);
										local945 = Static94.anInt2486 + local905.anInt462 & 0xFF;
										local950 = Static76.anInt2080 + local905.anInt464;
										if (local950 < 0) {
											local950 = 0;
										} else if (local950 > 255) {
											local950 = 255;
										}
										local915 = Static40.method875(local945, local905.anInt454, local950);
									}
									local945 = 0;
									if (local915 != -2) {
										local945 = Static93.anIntArray339[Static102.method1708(96, local915)];
									}
									if (local905.anInt453 != -1) {
										@Pc(991) int local991 = Static76.anInt2080 + local905.anInt466;
										local950 = Static94.anInt2486 + local905.anInt452 & 0xFF;
										if (local991 < 0) {
											local991 = 0;
										} else if (local991 > 255) {
											local991 = 255;
										}
										local915 = Static40.method875(local950, local905.anInt457, local991);
										local945 = Static93.anIntArray339[Static102.method1708(96, local915)];
									}
									arg1.method1723(local11, local160, local261, local755, local899, local908, local671, local681, local693, local703, Static9.method104(local737, local709), Static9.method104(local737, local717), Static9.method104(local737, local727), Static9.method104(local737, local735), Static102.method1708(local709, local917), Static102.method1708(local717, local917), Static102.method1708(local727, local917), Static102.method1708(local735, local917), local747, local945);
								}
							}
						}
					}
				}
			}
			for (local181 = 1; local181 < 103; local181++) {
				for (local194 = 1; local194 < 103; local194++) {
					arg1.method1728(local11, local194, local181, Static8.method95(local181, local11, local194));
				}
			}
			Static21.aByteArrayArrayArray2[local11] = null;
			Static61.aByteArrayArrayArray3[local11] = null;
			Static109.aByteArrayArrayArray8[local11] = null;
			Static108.aByteArrayArrayArray7[local11] = null;
			Static20.aByteArrayArrayArray1[local11] = null;
		}
		arg1.method1737();
		for (local27 = 0; local27 < 104; local27++) {
			for (local127 = 0; local127 < 104; local127++) {
				if ((Static95.aByteArrayArrayArray5[1][local27][local127] & 0x2) == 2) {
					arg1.method1746(local27, local127);
				}
			}
		}
		local133 = 2;
		local135 = 4;
		local127 = 1;
		for (local138 = 0; local138 < 4; local138++) {
			if (local138 > 0) {
				local133 <<= 0x3;
				local135 <<= 0x3;
				local127 <<= 0x3;
			}
			for (local160 = 0; local160 <= local138; local160++) {
				for (local181 = 0; local181 <= 104; local181++) {
					for (local194 = 0; local194 <= 104; local194++) {
						if ((local127 & Static45.anIntArrayArrayArray4[local160][local194][local181]) != 0) {
							for (local200 = local181; local200 > 0 && (Static45.anIntArrayArrayArray4[local160][local194][local200 - 1] & local127) != 0; local200--) {
							}
							local204 = local181;
							local210 = local160;
							while (local204 < 104 && (local127 & Static45.anIntArrayArrayArray4[local160][local194][local204 + 1]) != 0) {
								local204++;
							}
							local277 = local160;
							label347: while (local210 > 0) {
								for (local261 = local200; local261 <= local204; local261++) {
									if ((Static45.anIntArrayArrayArray4[local210 - 1][local194][local261] & local127) == 0) {
										break label347;
									}
								}
								local210--;
							}
							label336: while (local277 < local138) {
								for (local261 = local200; local261 <= local204; local261++) {
									if ((Static45.anIntArrayArrayArray4[local277 + 1][local194][local261] & local127) == 0) {
										break label336;
									}
								}
								local277++;
							}
							local261 = (local204 + 1 - local200) * (local277 + 1 - local210);
							if (local261 >= 8) {
								local545 = Static72.anIntArrayArrayArray5[local277][local194][local200] - 240;
								local646 = Static72.anIntArrayArrayArray5[local210][local194][local200];
								Static103.method1727(local138, 1, local194 * 128, local194 * 128, local200 * 128, local204 * 128 + 128, local545, local646);
								for (local656 = local210; local656 <= local277; local656++) {
									for (local671 = local200; local671 <= local204; local671++) {
										Static45.anIntArrayArrayArray4[local656][local194][local671] &= ~local127;
									}
								}
							}
						}
						if ((local133 & Static45.anIntArrayArrayArray4[local160][local194][local181]) != 0) {
							local200 = local194;
							local204 = local194;
							while (local200 > 0 && (Static45.anIntArrayArrayArray4[local160][local200 - 1][local181] & local133) != 0) {
								local200--;
							}
							local210 = local160;
							while (local204 < 104 && (Static45.anIntArrayArrayArray4[local160][local204 + 1][local181] & local133) != 0) {
								local204++;
							}
							label403: while (local210 > 0) {
								for (local261 = local200; local261 <= local204; local261++) {
									if ((local133 & Static45.anIntArrayArrayArray4[local210 - 1][local261][local181]) == 0) {
										break label403;
									}
								}
								local210--;
							}
							label391: for (local277 = local160; local277 < local138; local277++) {
								for (local261 = local200; local261 <= local204; local261++) {
									if ((Static45.anIntArrayArrayArray4[local277 + 1][local261][local181] & local133) == 0) {
										break label391;
									}
								}
							}
							local261 = (local204 + 1 - local200) * (local277 + 1 - local210);
							if (local261 >= 8) {
								local545 = Static72.anIntArrayArrayArray5[local277][local200][local181] - 240;
								local646 = Static72.anIntArrayArrayArray5[local210][local200][local181];
								Static103.method1727(local138, 2, local200 * 128, local204 * 128 + 128, local181 * 128, local181 * 128, local545, local646);
								for (local656 = local210; local656 <= local277; local656++) {
									for (local671 = local200; local671 <= local204; local671++) {
										Static45.anIntArrayArrayArray4[local656][local671][local181] &= ~local133;
									}
								}
							}
						}
						if ((Static45.anIntArrayArrayArray4[local160][local194][local181] & local135) != 0) {
							local200 = local194;
							local204 = local194;
							for (local277 = local181; local277 < 104 && (local135 & Static45.anIntArrayArrayArray4[local160][local194][local277 + 1]) != 0; local277++) {
							}
							for (local210 = local181; local210 > 0 && (local135 & Static45.anIntArrayArrayArray4[local160][local194][local210 - 1]) != 0; local210--) {
							}
							label457: while (local200 > 0) {
								for (local261 = local210; local261 <= local277; local261++) {
									if ((local135 & Static45.anIntArrayArrayArray4[local160][local200 - 1][local261]) == 0) {
										break label457;
									}
								}
								local200--;
							}
							label446: while (local204 < 104) {
								for (local261 = local210; local261 <= local277; local261++) {
									if ((Static45.anIntArrayArrayArray4[local160][local204 + 1][local261] & local135) == 0) {
										break label446;
									}
								}
								local204++;
							}
							if ((local277 + 1 - local210) * (-local200 + 1 + local204) >= 4) {
								local261 = Static72.anIntArrayArrayArray5[local160][local200][local210];
								Static103.method1727(local138, 4, local200 * 128, local204 * 128 + 128, local210 * 128, local277 * 128 + 128, local261, local261);
								for (local503 = local200; local503 <= local204; local503++) {
									for (local545 = local210; local545 <= local277; local545++) {
										Static45.anIntArrayArrayArray4[local160][local503][local545] &= ~local135;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(II)Z")
	public static boolean method1893(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static34.anIntArray142[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 27;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZBZ)I")
	public static int method1894() {
		return Static94.anInt2484 + Static52.anInt1630;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public static void method1896() {
		aClass23Array19 = null;
		aClass1_Sub1_Sub6_Sub3_24 = null;
		aClass23_1696 = null;
		aClass23_1698 = null;
		aClass23_1701 = null;
		aClass23_1699 = null;
		aClass23_1695 = null;
		aClass23_1700 = null;
		aClass23_1697 = null;
		aClass34_83 = null;
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	public static void method1900() {
		if (Static104.anInt2686 != 0 || Static65.anInt1963 != 1) {
			return;
		}
		@Pc(31) int local31 = Static111.anInt2890 - 25 - 550;
		@Pc(37) int local37 = Static74.anInt1803 - 5 - 4;
		if (local31 < 0 || local37 < 0 || local31 >= 146 || local37 >= 151) {
			return;
		}
		local37 -= 75;
		@Pc(62) int local62 = Static35.anInt1096 + Static3.anInt133 & 0x7FF;
		local31 -= 73;
		@Pc(67) int local67 = Class1_Sub1_Sub6_Sub4.anIntArray338[local62];
		@Pc(71) int local71 = Class1_Sub1_Sub6_Sub4.anIntArray337[local62];
		@Pc(79) int local79 = (Static50.anInt1618 + 256) * local67 >> 8;
		@Pc(87) int local87 = local71 * (Static50.anInt1618 + 256) >> 8;
		@Pc(97) int local97 = local37 * local79 + local87 * local31 >> 11;
		@Pc(108) int local108 = local87 * local37 - local31 * local79 >> 11;
		@Pc(115) int local115 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196 + local97 >> 7;
		@Pc(123) int local123 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232 - local108 >> 7;
		@Pc(143) boolean local143 = Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], local115, local123, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], true, 0, 0, 0, 1, 0);
		if (!local143) {
			return;
		}
		Static76.aClass1_Sub5_Sub1_2.method674(local31);
		Static76.aClass1_Sub5_Sub1_2.method674(local37);
		Static76.aClass1_Sub5_Sub1_2.method686(Static3.anInt133);
		Static76.aClass1_Sub5_Sub1_2.method674(57);
		Static76.aClass1_Sub5_Sub1_2.method674(Static35.anInt1096);
		Static76.aClass1_Sub5_Sub1_2.method674(Static50.anInt1618);
		Static76.aClass1_Sub5_Sub1_2.method674(89);
		Static76.aClass1_Sub5_Sub1_2.method686(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196);
		Static76.aClass1_Sub5_Sub1_2.method686(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232);
		Static76.aClass1_Sub5_Sub1_2.method674(Static89.anInt2390);
		Static76.aClass1_Sub5_Sub1_2.method674(63);
		return;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!q;IIIIILclient!ud;I)V")
	public static void method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class65 arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = Static72.anIntArrayArrayArray5[arg6][arg4][arg1];
		@Pc(23) int local23 = Static72.anIntArrayArrayArray5[arg6][arg4 + 1][arg1];
		@Pc(35) int local35 = Static72.anIntArrayArrayArray5[arg6][arg4 + 1][arg1 + 1];
		@Pc(45) int local45 = Static72.anIntArrayArrayArray5[arg6][arg4][arg1 + 1];
		@Pc(56) int local56 = local45 + local23 + local9 + local35 >> 2;
		@Pc(60) Class1_Sub1_Sub4 local60 = Static97.method1645(arg5);
		@Pc(81) int local81 = (arg5 << 14) + (arg4 + (arg1 << 7) + 1073741824);
		@Pc(87) int local87 = arg8 + (arg3 << 6);
		if (local60.anInt318 == 1) {
			local87 += 256;
		}
		if (local60.anInt298 == 0) {
			local81 += Integer.MIN_VALUE;
		}
		@Pc(130) Class1_Sub1_Sub2 local130;
		if (arg8 == 22) {
			if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
				local130 = local60.method173(local35, 22, local9, local23, local45, arg3);
			} else {
				local130 = new Class1_Sub1_Sub2_Sub2(arg5, 22, arg3, local9, local23, local35, local45, local60.anInt313, true, null);
			}
			arg7.method1715(arg0, arg4, arg1, local56, local130, local81, local87);
			if (local60.aBoolean21 && local60.anInt298 == 1) {
				arg2.method1362(arg1, arg4);
			}
			return;
		}
		@Pc(222) int local222;
		if (arg8 == 10 || arg8 == 11) {
			if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
				local130 = local60.method173(local35, 10, local9, local23, local45, arg3);
			} else {
				local130 = new Class1_Sub1_Sub2_Sub2(arg5, 10, arg3, local9, local23, local35, local45, local60.anInt313, true, null);
			}
			if (local130 != null) {
				@Pc(219) int local219;
				if (arg3 == 1 || arg3 == 3) {
					local222 = local60.anInt305;
					local219 = local60.anInt299;
				} else {
					local219 = local60.anInt305;
					local222 = local60.anInt299;
				}
				@Pc(232) int local232 = 0;
				if (arg8 == 11) {
					local232 += 256;
				}
				arg7.method1720(arg0, arg4, arg1, local56, local222, local219, local130, local232, local81, local87);
			}
			if (local60.aBoolean21) {
				arg2.method1356(arg3, local60.aBoolean14, local60.anInt299, arg1, local60.anInt305, arg4);
			}
		} else if (arg8 >= 12) {
			if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
				local130 = local60.method173(local35, arg8, local9, local23, local45, arg3);
			} else {
				local130 = new Class1_Sub1_Sub2_Sub2(arg5, arg8, arg3, local9, local23, local35, local45, local60.anInt313, true, null);
			}
			arg7.method1720(arg0, arg4, arg1, local56, 1, 1, local130, 0, local81, local87);
			if (local60.aBoolean21) {
				arg2.method1356(arg3, local60.aBoolean14, local60.anInt299, arg1, local60.anInt305, arg4);
			}
		} else if (arg8 == 0) {
			if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
				local130 = local60.method173(local35, 0, local9, local23, local45, arg3);
			} else {
				local130 = new Class1_Sub1_Sub2_Sub2(arg5, 0, arg3, local9, local23, local35, local45, local60.anInt313, true, null);
			}
			arg7.method1744(arg0, arg4, arg1, local56, local130, null, Static29.anIntArray130[arg3], 0, local81, local87);
			if (local60.aBoolean21) {
				arg2.method1357(arg4, arg1, arg3, local60.aBoolean14, arg8);
			}
		} else if (arg8 == 1) {
			if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
				local130 = local60.method173(local35, 1, local9, local23, local45, arg3);
			} else {
				local130 = new Class1_Sub1_Sub2_Sub2(arg5, 1, arg3, local9, local23, local35, local45, local60.anInt313, true, null);
			}
			arg7.method1744(arg0, arg4, arg1, local56, local130, null, Static80.anIntArray269[arg3], 0, local81, local87);
			if (local60.aBoolean21) {
				arg2.method1357(arg4, arg1, arg3, local60.aBoolean14, arg8);
			}
		} else {
			@Pc(473) int local473;
			@Pc(504) Class1_Sub1_Sub2 local504;
			if (arg8 == 2) {
				local473 = arg3 + 1 & 0x3;
				@Pc(494) Class1_Sub1_Sub2 local494;
				if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
					local494 = local60.method173(local35, 2, local9, local23, local45, arg3 + 4);
					local504 = local60.method173(local35, 2, local9, local23, local45, local473);
				} else {
					local494 = new Class1_Sub1_Sub2_Sub2(arg5, 2, arg3 + 4, local9, local23, local35, local45, local60.anInt313, true, null);
					local504 = new Class1_Sub1_Sub2_Sub2(arg5, 2, local473, local9, local23, local35, local45, local60.anInt313, true, null);
				}
				arg7.method1744(arg0, arg4, arg1, local56, local494, local504, Static29.anIntArray130[arg3], Static29.anIntArray130[local473], local81, local87);
				if (local60.aBoolean21) {
					arg2.method1357(arg4, arg1, arg3, local60.aBoolean14, arg8);
				}
			} else if (arg8 == 3) {
				if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
					local130 = local60.method173(local35, 3, local9, local23, local45, arg3);
				} else {
					local130 = new Class1_Sub1_Sub2_Sub2(arg5, 3, arg3, local9, local23, local35, local45, local60.anInt313, true, null);
				}
				arg7.method1744(arg0, arg4, arg1, local56, local130, null, Static80.anIntArray269[arg3], 0, local81, local87);
				if (local60.aBoolean21) {
					arg2.method1357(arg4, arg1, arg3, local60.aBoolean14, arg8);
				}
			} else if (arg8 == 9) {
				if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
					local130 = local60.method173(local35, arg8, local9, local23, local45, arg3);
				} else {
					local130 = new Class1_Sub1_Sub2_Sub2(arg5, arg8, arg3, local9, local23, local35, local45, local60.anInt313, true, null);
				}
				arg7.method1720(arg0, arg4, arg1, local56, 1, 1, local130, 0, local81, local87);
				if (local60.aBoolean21) {
					arg2.method1356(arg3, local60.aBoolean14, local60.anInt299, arg1, local60.anInt305, arg4);
				}
			} else {
				if (local60.aBoolean12) {
					if (arg3 == 1) {
						local473 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local9;
						local9 = local473;
					} else if (arg3 == 2) {
						local473 = local45;
						local45 = local23;
						local23 = local473;
						local473 = local35;
						local35 = local9;
						local9 = local473;
					} else if (arg3 == 3) {
						local473 = local45;
						local45 = local9;
						local9 = local23;
						local23 = local35;
						local35 = local473;
					}
				}
				if (arg8 == 4) {
					if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
						local130 = local60.method173(local35, 4, local9, local23, local45, 0);
					} else {
						local130 = new Class1_Sub1_Sub2_Sub2(arg5, 4, 0, local9, local23, local35, local45, local60.anInt313, true, null);
					}
					arg7.method1747(arg0, arg4, arg1, local56, local130, Static29.anIntArray130[arg3], arg3 * 512, 0, 0, local81, local87);
				} else if (arg8 == 5) {
					local473 = 16;
					local222 = arg7.method1743(arg0, arg4, arg1);
					if (local222 > 0) {
						local473 = Static97.method1645(local222 >> 14 & 0x7FFF).anInt301;
					}
					if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
						local504 = local60.method173(local35, 4, local9, local23, local45, 0);
					} else {
						local504 = new Class1_Sub1_Sub2_Sub2(arg5, 4, 0, local9, local23, local35, local45, local60.anInt313, true, null);
					}
					arg7.method1747(arg0, arg4, arg1, local56, local504, Static29.anIntArray130[arg3], arg3 * 512, Static10.anIntArray42[arg3] * local473, local473 * Static20.anIntArray91[arg3], local81, local87);
				} else if (arg8 == 6) {
					if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
						local130 = local60.method173(local35, 4, local9, local23, local45, 0);
					} else {
						local130 = new Class1_Sub1_Sub2_Sub2(arg5, 4, 0, local9, local23, local35, local45, local60.anInt313, true, null);
					}
					arg7.method1747(arg0, arg4, arg1, local56, local130, 256, arg3, 0, 0, local81, local87);
				} else if (arg8 == 7) {
					if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
						local130 = local60.method173(local35, 4, local9, local23, local45, 0);
					} else {
						local130 = new Class1_Sub1_Sub2_Sub2(arg5, 4, 0, local9, local23, local35, local45, local60.anInt313, true, null);
					}
					arg7.method1747(arg0, arg4, arg1, local56, local130, 512, arg3, 0, 0, local81, local87);
				} else if (arg8 == 8) {
					if (local60.anInt313 == -1 && local60.anIntArray54 == null) {
						local130 = local60.method173(local35, 4, local9, local23, local45, 0);
					} else {
						local130 = new Class1_Sub1_Sub2_Sub2(arg5, 4, 0, local9, local23, local35, local45, local60.anInt313, true, null);
					}
					arg7.method1747(arg0, arg4, arg1, local56, local130, 768, arg3, 0, 0, local81, local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
	public static void method1903() {
		try {
			if (Static26.anInt847 == 0) {
				if (Static94.aClass68_4 != null) {
					Static94.aClass68_4.method1935();
					Static94.aClass68_4 = null;
				}
				Static26.anInt847 = 1;
				Static10.anInt208 = 0;
				Static92.aClass62_55 = null;
				Static55.aBoolean87 = false;
			}
			if (Static26.anInt847 == 1) {
				if (Static92.aClass62_55 == null) {
					Static92.aClass62_55 = Static26.aClass54_2.method1492(Static19.anInt493);
				}
				if (Static92.aClass62_55.anInt2572 == 2) {
					throw new IOException();
				}
				if (Static92.aClass62_55.anInt2572 == 1) {
					Static94.aClass68_4 = new Class68((Socket) Static92.aClass62_55.anObject4, Static26.aClass54_2);
					Static92.aClass62_55 = null;
					Static26.anInt847 = 2;
				}
			}
			if (Static26.anInt847 == 2) {
				@Pc(72) long local72 = Static41.aLong34 = Static76.aClass23_1212.method516();
				@Pc(79) int local79 = (int) (local72 >> 16 & 0x1FL);
				Static76.aClass1_Sub5_Sub1_2.anInt1266 = 0;
				Static76.aClass1_Sub5_Sub1_2.method674(14);
				Static76.aClass1_Sub5_Sub1_2.method674(local79);
				Static94.aClass68_4.method1942(Static76.aClass1_Sub5_Sub1_2.aByteArray6, 2);
				Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
				Static26.anInt847 = 3;
			}
			@Pc(111) int local111;
			if (Static26.anInt847 == 3) {
				local111 = Static94.aClass68_4.method1940();
				if (local111 != 0) {
					Static96.method1102(local111);
					return;
				}
				Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
				Static26.anInt847 = 4;
			}
			if (Static26.anInt847 == 4) {
				if (Static83.aClass1_Sub5_Sub1_3.anInt1266 < 8) {
					local111 = Static94.aClass68_4.method1941();
					if (8 - Static83.aClass1_Sub5_Sub1_3.anInt1266 < local111) {
						local111 = 8 - Static83.aClass1_Sub5_Sub1_3.anInt1266;
					}
					if (local111 > 0) {
						Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, local111, Static83.aClass1_Sub5_Sub1_3.anInt1266);
						Static83.aClass1_Sub5_Sub1_3.anInt1266 += local111;
					}
				}
				if (Static83.aClass1_Sub5_Sub1_3.anInt1266 == 8) {
					Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
					Static33.aLong26 = Static83.aClass1_Sub5_Sub1_3.method726();
					Static26.anInt847 = 5;
				}
			}
			@Pc(386) int local386;
			if (Static26.anInt847 == 5) {
				@Pc(182) int[] local182 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static33.aLong26 >> 32), (int) Static33.aLong26 };
				Static76.aClass1_Sub5_Sub1_2.anInt1266 = 0;
				Static76.aClass1_Sub5_Sub1_2.method674(10);
				Static76.aClass1_Sub5_Sub1_2.method679(local182[0]);
				Static76.aClass1_Sub5_Sub1_2.method679(local182[1]);
				Static76.aClass1_Sub5_Sub1_2.method679(local182[2]);
				Static76.aClass1_Sub5_Sub1_2.method679(local182[3]);
				Static76.aClass1_Sub5_Sub1_2.method679(Static26.aClass54_2.anInt2355);
				Static76.aClass1_Sub5_Sub1_2.method711(Static76.aClass23_1212.method516());
				Static76.aClass1_Sub5_Sub1_2.method707(Static76.aClass23_1218);
				Static76.aClass1_Sub5_Sub1_2.method722(Static19.aBigInteger1, Static106.aBigInteger2);
				Static39.aClass1_Sub5_Sub1_1.anInt1266 = 0;
				if (Static98.anInt2537 == 40) {
					Static39.aClass1_Sub5_Sub1_1.method674(18);
				} else {
					Static39.aClass1_Sub5_Sub1_1.method674(16);
				}
				Static39.aClass1_Sub5_Sub1_1.method674(Static76.aClass1_Sub5_Sub1_2.anInt1266 + 61);
				Static39.aClass1_Sub5_Sub1_1.method679(441);
				Static39.aClass1_Sub5_Sub1_1.method674(Static9.aBoolean7 ? 1 : 0);
				Static39.aClass1_Sub5_Sub1_1.method679(Static35.aClass55_Sub1_5.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static36.aClass55_Sub1_6.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static18.aClass55_Sub1_2.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static25.aClass55_Sub1_3.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static33.aClass55_Sub1_4.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static65.aClass55_Sub1_12.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static42.aClass55_Sub1_7.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static90.aClass55_Sub1_17.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static89.aClass55_Sub1_16.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static3.aClass55_Sub1_1.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static87.aClass55_Sub1_18.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static82.aClass55_Sub1_14.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static114.aClass55_Sub1_19.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method679(Static74.aClass55_Sub1_11.anInt2838);
				Static39.aClass1_Sub5_Sub1_1.method729(Static76.aClass1_Sub5_Sub1_2.anInt1266, Static76.aClass1_Sub5_Sub1_2.aByteArray6);
				Static94.aClass68_4.method1942(Static39.aClass1_Sub5_Sub1_1.aByteArray6, Static39.aClass1_Sub5_Sub1_1.anInt1266);
				Static76.aClass1_Sub5_Sub1_2.method734(local182);
				for (local386 = 0; local386 < 4; local386++) {
					local182[local386] += 50;
				}
				Static83.aClass1_Sub5_Sub1_3.method734(local182);
				Static26.anInt847 = 6;
			}
			if (Static26.anInt847 == 6 && Static94.aClass68_4.method1941() > 0) {
				local386 = Static94.aClass68_4.method1940();
				if (local386 == 21 && Static98.anInt2537 == 20) {
					Static26.anInt847 = 7;
				} else if (local386 == 2) {
					Static26.anInt847 = 9;
				} else if (local386 == 15 && Static98.anInt2537 == 40) {
					Static19.method277();
					return;
				} else if (local386 == 23 && Static54.anInt1678 < 1) {
					Static26.anInt847 = 0;
					Static54.anInt1678++;
				} else {
					Static96.method1102(local386);
					return;
				}
			}
			if (Static26.anInt847 == 7 && Static94.aClass68_4.method1941() > 0) {
				Static100.anInt2590 = Static94.aClass68_4.method1940() * 60 + 180;
				Static26.anInt847 = 8;
			}
			if (Static26.anInt847 == 8) {
				Static10.anInt208 = 0;
				Static73.method1308(Static40.aClass23_732, Static17.method233(new Class23[] { Static19.method274(Static100.anInt2590 / 60), Static33.aClass23_567 }), Static71.aClass23_1178);
				if (--Static100.anInt2590 <= 0) {
					Static26.anInt847 = 0;
				}
			} else {
				if (Static26.anInt847 == 9 && Static94.aClass68_4.method1941() >= 8) {
					Static90.anInt2422 = Static94.aClass68_4.method1940();
					Static33.aBoolean59 = Static94.aClass68_4.method1940() == 1;
					Static84.anInt2353 = Static94.aClass68_4.method1940();
					Static84.anInt2353 <<= 0x8;
					Static84.anInt2353 += Static94.aClass68_4.method1940();
					Static72.anInt2012 = Static94.aClass68_4.method1940();
					Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, 1, 0);
					Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
					Static96.anInt1794 = Static83.aClass1_Sub5_Sub1_3.method736();
					Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, 2, 0);
					Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
					Static39.anInt1382 = Static83.aClass1_Sub5_Sub1_3.method715();
					Static26.anInt847 = 10;
				}
				if (Static26.anInt847 != 10) {
					Static10.anInt208++;
					if (Static10.anInt208 > 2000) {
						if (Static54.anInt1678 < 1) {
							Static54.anInt1678++;
							if (Static92.anInt2923 == Static19.anInt493) {
								Static19.anInt493 = Static100.anInt2580;
							} else {
								Static19.anInt493 = Static92.anInt2923;
							}
							Static26.anInt847 = 0;
						} else {
							Static96.method1102(-3);
						}
					}
				} else if (Static94.aClass68_4.method1941() >= Static39.anInt1382) {
					Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
					Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, Static39.anInt1382, 0);
					Static105.method1786();
					Static104.anInt2681 = -1;
					Static69.method1282(false);
					Static96.anInt1794 = -1;
				}
			}
		} catch (@Pc(664) IOException local664) {
			if (Static54.anInt1678 < 1) {
				Static26.anInt847 = 0;
				if (Static19.anInt493 == Static92.anInt2923) {
					Static19.anInt493 = Static100.anInt2580;
				} else {
					Static19.anInt493 = Static92.anInt2923;
				}
				Static54.anInt1678++;
			} else {
				Static96.method1102(-2);
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method1904() {
		Static32.aClass5_27.method99();
	}
}
