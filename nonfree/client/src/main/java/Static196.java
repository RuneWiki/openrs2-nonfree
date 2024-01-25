import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gs", name = "Vb", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!gs", name = "Jb", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_134 = new Class179(48, 3);

	@OriginalMember(owner = "client!gs", name = "Kb", descriptor = "I")
	public static int anInt3437 = 0;

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "(I)V")
	public static void method2875() {
		if (Static190.anInt3237 == 0 || Static190.anInt3237 == 5) {
			return;
		}
		try {
			@Pc(15) short local15;
			if (Static182.anInt3142 == 0) {
				local15 = 250;
			} else {
				local15 = 2000;
			}
			if (++Static655.anInt10514 > local15) {
				if (Static163.aClass170_1 != null) {
					Static163.aClass170_1.method8770();
					Static163.aClass170_1 = null;
				}
				if (Static182.anInt3142 >= 3) {
					Static190.anInt3237 = 0;
					Static82.method1399(-5);
					return;
				}
				if (Static560.anInt1380 == 2) {
					Static406.aClass354_3.method8303();
				} else {
					Static305.aClass354_2.method8303();
				}
				Static190.anInt3237 = 1;
				Static655.anInt10514 = 0;
				Static182.anInt3142++;
			}
			if (Static190.anInt3237 == 1) {
				if (Static560.anInt1380 == 2) {
					Static523.aClass103_8 = Static406.aClass354_3.method8301(Static569.aClass380_6);
				} else {
					Static523.aClass103_8 = Static305.aClass354_2.method8301(Static569.aClass380_6);
				}
				Static190.anInt3237 = 2;
			}
			@Pc(123) Class6_Sub26 local123;
			if (Static190.anInt3237 == 2) {
				if (Static523.aClass103_8.anInt2541 == 2) {
					throw new IOException();
				}
				if (Static523.aClass103_8.anInt2541 != 1) {
					return;
				}
				Static163.aClass170_1 = Static173.method2467((Socket) Static523.aClass103_8.anObject9);
				Static523.aClass103_8 = null;
				Static270.method3996();
				local123 = Static4.method111();
				local123.aClass6_Sub23_Sub1_2.method8366(Static367.aClass105_1.anInt2549);
				Static670.method9077(local123);
				Static356.method5157();
				Static190.anInt3237 = 3;
			}
			@Pc(164) int local164;
			if (Static190.anInt3237 == 3) {
				if (!Static163.aClass170_1.method8769(1)) {
					return;
				}
				Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
				local164 = Static204.aClass6_Sub23_Sub1_1.aByteArray101[0] & 0xFF;
				if (local164 != 0) {
					Static190.anInt3237 = 0;
					Static82.method1399(local164);
					Static163.aClass170_1.method8770();
					Static163.aClass170_1 = null;
					Static314.method4505();
					return;
				}
				Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
				@Pc(189) Class6_Sub23 local189 = new Class6_Sub23(518);
				@Pc(192) int[] local192 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local189.method8366(10);
				local189.method8364(local192[0]);
				local189.method8364(local192[1]);
				local189.method8364(local192[2]);
				local189.method8364(local192[3]);
				local189.method8392(0L);
				local189.method8398(Static633.aString140);
				local189.method8392(Static62.aLong38);
				local189.method8392(Static233.aLong124);
				local189.method8371(Static443.aBigInteger2, Static11.aBigInteger1);
				Static270.method3996();
				@Pc(278) Class6_Sub26 local278 = Static4.method111();
				@Pc(281) Class6_Sub23_Sub1 local281 = local278.aClass6_Sub23_Sub1_2;
				@Pc(310) int local310;
				@Pc(327) int local327;
				if (Static560.anInt1380 == 2) {
					if (Static556.anInt9319 == 13) {
						local281.method8366(Static367.aClass105_5.anInt2549);
					} else {
						local281.method8366(Static367.aClass105_3.anInt2549);
					}
					local281.method8347(0);
					local310 = local281.anInt9901;
					local281.method8364(646);
					local281.method8358(local189.aByteArray101, 0, local189.anInt9901);
					local327 = local281.anInt9901;
					local281.method8398(Static12.aString10);
					local281.method8366(Static595.anInt9707);
					local281.method8366(Static455.method6591());
					local281.method8347(Static449.anInt7506);
					local281.method8347(Static348.anInt5935);
					local281.method8366(Static96.aClass6_Sub22_7.aClass29_Sub6_1.method1664());
					Static356.method5145(local281);
					local281.method8398(Static245.aString52);
					local281.method8364(Static506.anInt8485);
					@Pc(374) Class6_Sub23 local374 = Static96.aClass6_Sub22_7.method2363();
					local281.method8366(local374.anInt9901);
					local281.method8358(local374.aByteArray101, 0, local374.anInt9901);
					Static274.aBoolean301 = true;
					@Pc(398) Class6_Sub23 local398 = new Class6_Sub23(Static296.aClass6_Sub33_1.method4274());
					Static296.aClass6_Sub33_1.method4272(local398);
					local281.method8358(local398.aByteArray101, 0, local398.aByteArray101.length);
					local281.method8347(Static102.anInt1886);
					local281.method8392(Static106.aLong65);
					local281.method8366(Static355.aString76 == null ? 0 : 1);
					if (Static355.aString76 != null) {
						local281.method8398(Static355.aString76);
					}
					local281.method8366(Static24.method599("jagtheora") ? 1 : 0);
					local281.method8366(Static301.aBoolean334 ? 1 : 0);
					Static422.method6276(local281);
					local281.method8360(local327, local281.anInt9901, local192);
					local281.method8394(local281.anInt9901 - local310);
				} else {
					local281.method8366(Static367.aClass105_6.anInt2549);
					local281.method8347(0);
					local310 = local281.anInt9901;
					local281.method8364(646);
					local281.method8358(local189.aByteArray101, 0, local189.anInt9901);
					local327 = local281.anInt9901;
					local281.method8398(Static12.aString10);
					local281.method8366(Static457.aClass176_6.anInt4801);
					local281.method8366(Static616.anInt10077);
					Static356.method5145(local281);
					local281.method8398(Static245.aString52);
					local281.method8364(Static506.anInt8485);
					Static422.method6276(local281);
					local281.method8360(local327, local281.anInt9901, local192);
					local281.method8394(local281.anInt9901 - local310);
				}
				Static670.method9077(local278);
				Static356.method5157();
				Static377.aClass15_2 = new Class15(local192);
				for (local310 = 0; local310 < 4; local310++) {
					local192[local310] += 50;
				}
				Static204.aClass6_Sub23_Sub1_1.method2880(local192);
				Static190.anInt3237 = 4;
			}
			if (Static190.anInt3237 == 4) {
				if (!Static163.aClass170_1.method8769(1)) {
					return;
				}
				Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
				local164 = Static204.aClass6_Sub23_Sub1_1.aByteArray101[0] & 0xFF;
				if (local164 == 21) {
					Static190.anInt3237 = 7;
				} else if (local164 == 29) {
					Static190.anInt3237 = 13;
				} else if (local164 == 1) {
					Static190.anInt3237 = 5;
					Static82.method1399(local164);
					return;
				} else if (local164 == 2) {
					Static190.anInt3237 = 8;
				} else if (local164 == 15) {
					Static655.anInt10505 = -2;
					Static190.anInt3237 = 14;
				} else if (local164 == 23 && Static182.anInt3142 < 3) {
					Static190.anInt3237 = 1;
					Static655.anInt10514 = 0;
					Static182.anInt3142++;
					Static163.aClass170_1.method8770();
					Static163.aClass170_1 = null;
					return;
				} else {
					Static190.anInt3237 = 0;
					Static82.method1399(local164);
					Static163.aClass170_1.method8770();
					Static163.aClass170_1 = null;
					Static314.method4505();
					return;
				}
			}
			if (Static190.anInt3237 == 6) {
				Static270.method3996();
				local123 = Static4.method111();
				@Pc(701) Class6_Sub23_Sub1 local701 = local123.aClass6_Sub23_Sub1_2;
				local701.method2879(Static377.aClass15_2);
				local701.method2874(Static367.aClass105_10.anInt2549);
				Static670.method9077(local123);
				Static356.method5157();
				Static190.anInt3237 = 4;
			} else if (Static190.anInt3237 == 7) {
				if (Static163.aClass170_1.method8769(1)) {
					Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
					local164 = Static204.aClass6_Sub23_Sub1_1.aByteArray101[0] & 0xFF;
					Static607.anInt9849 = local164 * 50;
					Static190.anInt3237 = 0;
					Static82.method1399(21);
					Static163.aClass170_1.method8770();
					Static163.aClass170_1 = null;
					Static314.method4505();
				}
			} else if (Static190.anInt3237 == 13) {
				if (Static163.aClass170_1.method8769(1)) {
					Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
					Static190.anInt3237 = 0;
					Static199.anInt3464 = Static204.aClass6_Sub23_Sub1_1.aByteArray101[0] & 0xFF;
					Static82.method1399(29);
					Static163.aClass170_1.method8770();
					Static163.aClass170_1 = null;
					Static314.method4505();
				}
			} else if (Static190.anInt3237 != 8) {
				@Pc(846) Class6_Sub23_Sub1 local846;
				if (Static190.anInt3237 == 9) {
					local846 = Static204.aClass6_Sub23_Sub1_1;
					if (Static560.anInt1380 == 2) {
						if (!Static163.aClass170_1.method8769(Static328.anInt8817)) {
							return;
						}
						Static163.aClass170_1.method8776(0, local846.aByteArray101, Static328.anInt8817);
						local846.anInt9901 = 0;
						Static26.anInt609 = local846.method8374();
						Static556.anInt9320 = local846.method8374();
						Static322.aBoolean346 = local846.method8374() == 1;
						Static377.aBoolean420 = local846.method8374() == 1;
						Static356.aBoolean402 = local846.method8374() == 1;
						Static525.aBoolean615 = local846.method8374() == 1;
						Static659.anInt7559 = local846.method8363();
						Static272.aBoolean295 = local846.method8374() == 1;
						Static560.anInt1378 = local846.method8340();
						Static618.aBoolean707 = local846.method8374() == 1;
						Static411.aClass88_3.method2023(Static618.aBoolean707);
						Static340.aClass121_1.method2642(Static618.aBoolean707);
						Static95.aClass188_1.method4261(Static618.aBoolean707);
					} else if (Static163.aClass170_1.method8769(Static328.anInt8817)) {
						Static163.aClass170_1.method8776(0, local846.aByteArray101, Static328.anInt8817);
						local846.anInt9901 = 0;
						Static26.anInt609 = local846.method8374();
						Static556.anInt9320 = local846.method8374();
						Static322.aBoolean346 = local846.method8374() == 1;
						Static377.aBoolean420 = local846.method8374() == 1;
						Static356.aBoolean402 = local846.method8374() == 1;
						Static553.aLong264 = local846.method8381();
						Static662.aLong305 = Static553.aLong264 - Static566.method7936() - local846.method8382();
						@Pc(925) int local925 = local846.method8374();
						Static206.aBoolean211 = (local925 & 0x2) != 0;
						Static272.aBoolean295 = (local925 & 0x1) != 0;
						Static375.anInt6324 = local846.method8369();
						Static283.anInt4844 = local846.method8363();
						Static330.anInt155 = local846.method8363();
						Static328.anInt8843 = local846.method8363();
						Static309.anInt2294 = local846.method8369();
						Static560.aClass103_3 = Static569.aClass380_6.method8812(Static309.anInt2294);
						Static581.anInt9565 = local846.method8374();
						Static139.anInt2421 = local846.method8363();
						Static365.anInt6246 = local846.method8363();
						Static467.aBoolean556 = local846.method8374() == 1;
						Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString46 = Static294.aString139 = local846.method8379();
						Static570.anInt9435 = local846.method8374();
						Static65.anInt1207 = local846.method8369();
						Static141.aBoolean156 = local846.method8374() == 1;
						Static34.aClass354_1 = new Class354();
						Static34.aClass354_1.anInt9837 = local846.method8363();
						if (Static34.aClass354_1.anInt9837 == 65535) {
							Static34.aClass354_1.anInt9837 = -1;
						}
						Static34.aClass354_1.aString135 = local846.method8379();
						if (Static648.aClass104_9 != Static74.aClass104_2) {
							Static34.aClass354_1.anInt9840 = Static34.aClass354_1.anInt9837 + 40000;
							Static34.aClass354_1.anInt9834 = Static34.aClass354_1.anInt9837 + 50000;
						}
						if (Static120.aClass104_5 != Static74.aClass104_2 && (Static44.aClass104_1 != Static74.aClass104_2 || Static26.anInt609 < 2) && (Static406.aClass354_3.method8298(Static506.aClass354_5) || Static406.aClass354_3.method8298(Static466.aClass354_4))) {
							Static666.method9033();
						}
					} else {
						return;
					}
					if (Static322.aBoolean346 && !Static356.aBoolean402 || Static272.aBoolean295) {
						try {
							Static683.method5174(Static180.anApplet6, "zap");
						} catch (@Pc(1228) Throwable local1228) {
							if (Static487.aBoolean562) {
								try {
									Static180.anApplet6.getAppletContext().showDocument(new URL(Static180.anApplet6.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1242) Exception local1242) {
								}
							}
						}
					} else {
						try {
							Static683.method5174(Static180.anApplet6, "unzap");
						} catch (@Pc(1219) Throwable local1219) {
						}
					}
					if (Static648.aClass104_9 == Static74.aClass104_2) {
						try {
							Static683.method5174(Static180.anApplet6, "loggedin");
						} catch (@Pc(1253) Throwable local1253) {
						}
					}
					if (Static560.anInt1380 != 2) {
						Static190.anInt3237 = 0;
						Static82.method1399(2);
						Static433.method6407();
						Static143.method2106(7);
						Static667.aClass179_372 = null;
						return;
					}
					Static190.anInt3237 = 11;
				}
				if (Static190.anInt3237 == 11) {
					if (!Static163.aClass170_1.method8769(3)) {
						return;
					}
					Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 3);
					Static190.anInt3237 = 12;
				}
				if (Static190.anInt3237 == 12) {
					local846 = Static204.aClass6_Sub23_Sub1_1;
					local846.anInt9901 = 0;
					if (local846.method2881()) {
						if (!Static163.aClass170_1.method8769(1)) {
							return;
						}
						Static163.aClass170_1.method8776(3, local846.aByteArray101, 1);
					}
					Static667.aClass179_372 = Static399.method5767()[local846.method2873()];
					Static655.anInt10505 = local846.method8363();
					Static190.anInt3237 = 10;
				}
				if (Static190.anInt3237 == 10) {
					if (Static163.aClass170_1.method8769(Static655.anInt10505)) {
						Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, Static655.anInt10505);
						Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
						Static190.anInt3237 = 0;
						local164 = Static655.anInt10505;
						Static82.method1399(2);
						Static402.method5809();
						Static388.method5534(Static204.aClass6_Sub23_Sub1_1);
						Static15.anInt438 = -1;
						if (Static173.aClass179_119 == Static667.aClass179_372) {
							Static575.method7985();
						} else {
							Static278.method8280();
						}
						if (local164 != Static204.aClass6_Sub23_Sub1_1.anInt9901) {
							throw new RuntimeException("lswp pos:" + Static204.aClass6_Sub23_Sub1_1.anInt9901 + " psize:" + local164);
						}
						Static667.aClass179_372 = null;
					}
				} else if (Static190.anInt3237 == 14) {
					if (Static655.anInt10505 == -2) {
						if (!Static163.aClass170_1.method8769(2)) {
							return;
						}
						Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 2);
						Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
						Static655.anInt10505 = Static204.aClass6_Sub23_Sub1_1.method8363();
					}
					if (Static163.aClass170_1.method8769(Static655.anInt10505)) {
						Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, Static655.anInt10505);
						Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
						local164 = Static655.anInt10505;
						Static190.anInt3237 = 0;
						Static82.method1399(15);
						Static238.method3588();
						Static388.method5534(Static204.aClass6_Sub23_Sub1_1);
						if (Static204.aClass6_Sub23_Sub1_1.anInt9901 != local164) {
							throw new RuntimeException("lswpr pos:" + Static204.aClass6_Sub23_Sub1_1.anInt9901 + " psize:" + local164);
						}
						Static667.aClass179_372 = null;
					}
				}
			} else if (Static163.aClass170_1.method8769(1)) {
				Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
				Static190.anInt3237 = 9;
				Static328.anInt8817 = Static204.aClass6_Sub23_Sub1_1.aByteArray101[0] & 0xFF;
			}
		} catch (@Pc(1494) IOException local1494) {
			if (Static163.aClass170_1 != null) {
				Static163.aClass170_1.method8770();
				Static163.aClass170_1 = null;
			}
			if (Static182.anInt3142 >= 3) {
				Static190.anInt3237 = 0;
				Static82.method1399(-4);
				Static314.method4505();
			} else {
				if (Static560.anInt1380 == 2) {
					Static406.aClass354_3.method8303();
				} else {
					Static305.aClass354_2.method8303();
				}
				Static655.anInt10514 = 0;
				Static190.anInt3237 = 1;
				Static182.anInt3142++;
			}
		}
	}
}
