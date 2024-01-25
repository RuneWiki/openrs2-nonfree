import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "B")
	public static byte aByte33;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("952b9b4dee13fb995ac5e3e88183d143c3c5988d3af155e9c1134ba1ce36408d087d06fcd09fa6a2b7209a1348ccc35af3b440db87c92aab0eb4455d5f8007fbbd9d5d074a61ef0a1c53d869805e6d64ed52ea9b11853dcac93ac258cc2284a311e5688b1312bec6e9c2025f9f9758faa6cc0f96849d2727dd5f0f139a872a106cd5ff5fda8612c79cef29a0511e25449bb476c8fd37e79d097c3294563d9922d37d1dcc48268e0654dd9baf8f825865489976cfa0ca9c511cb4813284732a6f3ea79483c6815f5dfef27ab45c3195988f29b3a10d7a1b6891ae488274d9247a6a75faab92dd000a50f7836ebdcc76923e21881f0388ace393022a436183b177dba0b47dc1eee7293f76ae015a0dc5438b77e3146b55b489d744ac6bbb2551f5d60a11e4be3c97a2ed3bc3652f07ec97be74001a3d2c573efef1f855fdc0fe3a725863de691b5d7e9523915c880133df49171f97e90235f7fc621dde2bab861f6fea708217f1bb8e243b24a999a018c6abe3763f36b99fa73fa1becfe3938dd9c2a689ec07d1b7d8f51f597de5188a57117b127d8520fdd463c0029700e02f62900a6a6610d58a5e498b19963df41614388a92485892791d03f2371485486b9f375753adface025134647eeaa31268ef7cbaaae2abaca42a3fe2cede731d47ecbaf59b19a1daa6eef8c0635740686f896db83539abe835815103b63b17c7554f", 16);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public static int anInt2596 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Lclient!rh;")
	public static Class28_Sub1_Sub5 method2386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class28_Sub1_Sub5 local14 = local7.aClass28_Sub1_Sub5_1;
			local7.aClass28_Sub1_Sub5_1 = null;
			Static346.method5177(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)Z")
	public static boolean method2387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lclient!vc;")
	public static Class361 method2388() {
		return new Class361(1, false);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method2389(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static158.anInt927 - 104) / 2;
		@Pc(17) int local17 = (Static515.anInt8292 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static426.method6149(local25, local21, arg1, local29)) {
						local40 = local29;
						if (Static488.method7052(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static429.method6177(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(85) int[] local85 = new int[262144];
		for (local29 = 0; local29 < local85.length; local29++) {
			local85[local29] = -16777216;
		}
		Static304.aClass33_11 = arg0.method8479(512, local85, 512, 512);
		Static368.method5382();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(157) int local157 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(191) boolean[][] local191 = new boolean[Static494.anInt8122 + 2 + 1][Static494.anInt8122 + 3];
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(205) int local205;
		@Pc(211) int local211;
		@Pc(221) int local221;
		@Pc(230) int local230;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(314) int local314;
		@Pc(320) int local320;
		@Pc(325) int local325;
		@Pc(340) int local340;
		for (@Pc(193) int local193 = local11; local193 < local11 + 104; local193 += Static494.anInt8122) {
			for (local197 = local17; local197 < local17 + 104; local197 += Static494.anInt8122) {
				local201 = 0;
				local203 = 0;
				local205 = local193;
				if (local193 > 0) {
					local201 += 4;
					local205 = local193 - 1;
				}
				local211 = local197;
				if (local197 > 0) {
					local211 = local197 - 1;
				}
				local221 = local193 + Static494.anInt8122;
				if (local221 < 104) {
					local221++;
				}
				local230 = local197 + Static494.anInt8122;
				if (local230 < 104) {
					local230++;
					local203 += 4;
				}
				arg0.KA(0, 0, local201 + Static494.anInt8122 * 4, local203 + Static494.anInt8122 * 4);
				arg0.GA(-16777216);
				@Pc(264) int local264;
				for (local256 = arg1; local256 <= 3; local256++) {
					for (local260 = 0; local260 <= Static494.anInt8122; local260++) {
						for (local264 = 0; local264 <= Static494.anInt8122; local264++) {
							local191[local260][local264] = Static426.method6149(local211 + local264, local205 - -local260, arg1, local256);
						}
					}
					Static582.aClass21Array3[local256].method7974(local205, local211, local221, local230, local191);
					if (!Static185.aBoolean283) {
						for (local264 = -4; local264 < Static494.anInt8122; local264++) {
							for (local314 = -4; local314 < Static494.anInt8122; local314++) {
								local320 = local193 + local264;
								local325 = local197 + local314;
								if (local320 >= local11 && local325 >= local17 && Static426.method6149(local325, local320, arg1, local256)) {
									local340 = local256;
									if (Static488.method7052(local320, local325)) {
										local340 = local256 - 1;
									}
									if (local340 >= 0) {
										Static503.method7148(local325, local201 + local264 * 4, arg0, local203 + (Static494.anInt8122 - local314) * 4 - 4, local340, local320, local40, local157);
									}
								}
							}
						}
					}
				}
				if (Static185.aBoolean283) {
					@Pc(394) Class252 local394 = Static1.aClass252Array5[arg1];
					for (local264 = 0; local264 < Static494.anInt8122; local264++) {
						for (local314 = 0; local314 < Static494.anInt8122; local314++) {
							local320 = local264 + local193;
							local325 = local197 + local314;
							local340 = local394.anIntArrayArray45[local320 - local394.anInt6837][local325 - local394.anInt6831];
							if ((local340 & 0x40240000) != 0) {
								arg0.method8452(4, local203 + (Static494.anInt8122 - local314) * 4 - 4, 4, local201 + local264 * 4, -1713569622);
							} else if ((local340 & 0x800000) != 0) {
								arg0.method8493(local203 + (Static494.anInt8122 - local314) * 4 - 4, local264 * 4 + local201, -1713569622, 4);
							} else if ((local340 & 0x2000000) != 0) {
								arg0.method8482(4, local201 + local264 * 4 + 3, local203 + -4 + (Static494.anInt8122 - local314) * 4, -1713569622);
							} else if ((local340 & 0x8000000) != 0) {
								arg0.method8493(local203 + (Static494.anInt8122 - local314) * 4 + 3 - 4, local264 * 4 + local201, -1713569622, 4);
							} else if ((local340 & 0x20000000) != 0) {
								arg0.method8482(4, local264 * 4 + local201, (Static494.anInt8122 + -local314) * 4 + -4 + local203, -1713569622);
							}
						}
					}
				}
				arg0.aa(local201, local203, Static494.anInt8122 * 4, Static494.anInt8122 * 4, local181, 2);
				Static304.aClass33_11.method7653((local193 - local11) * 4 + 48, -((-local17 + local197) * 4) - Static494.anInt8122 * 4 + 464, Static494.anInt8122 * 4, Static494.anInt8122 * 4, local201, local203);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static540.method7765();
		Static275.anInt4800 = 0;
		Static522.aClass338_197.method8175();
		if (!Static185.aBoolean283) {
			for (local197 = local11; local197 < local11 + 104; local197++) {
				for (local201 = local17; local201 < local17 + 104; local201++) {
					for (local203 = arg1; arg1 + 1 >= local203 && local203 <= 3; local203++) {
						if (Static426.method6149(local201, local197, arg1, local203)) {
							@Pc(687) Interface11 local687 = (Interface11) Static280.method4469(local203, local197, local201);
							if (local687 == null) {
								local687 = (Interface11) Static318.method4861(local203, local197, local201, he.class);
							}
							if (local687 == null) {
								local687 = (Interface11) Static583.method8200(local203, local197, local201);
							}
							if (local687 == null) {
								local687 = (Interface11) Static358.method5269(local203, local197, local201);
							}
							if (local687 != null) {
								@Pc(728) Class277 local728 = Static652.aClass267_4.method6682(local687.method9221());
								if (!local728.aBoolean584 || Static128.aBoolean206) {
									local221 = local728.anInt7728;
									if (local728.anIntArray660 != null) {
										for (local230 = 0; local230 < local728.anIntArray660.length; local230++) {
											if (local728.anIntArray660[local230] != -1) {
												@Pc(758) Class277 local758 = Static652.aClass267_4.method6682(local728.anIntArray660[local230]);
												if (local758.anInt7728 >= 0) {
													local221 = local758.anInt7728;
												}
											}
										}
									}
									if (local221 >= 0) {
										@Pc(781) boolean local781 = false;
										if (local221 >= 0) {
											@Pc(791) Class308 local791 = Static84.aClass27_1.method693(local221);
											if (local791 != null && local791.aBoolean684) {
												local781 = true;
											}
										}
										local256 = local197;
										local260 = local201;
										if (local781) {
											@Pc(809) int[][] local809 = Static1.aClass252Array5[local203].anIntArrayArray45;
											local314 = Static1.aClass252Array5[local203].anInt6837;
											local320 = Static1.aClass252Array5[local203].anInt6831;
											for (local325 = 0; local325 < 10; local325++) {
												local340 = (int) (Math.random() * 4.0D);
												if (local340 == 0 && local256 > local11 && local197 - 3 < local256 && (local809[local256 - local314 - 1][local260 - local320] & 0x2C0108) == 0) {
													local256--;
												}
												if (local340 == 1 && local11 + 103 > local256 && local197 + 3 > local256 && (local809[local256 + 1 - local314][local260 - local320] & 0x2C0180) == 0) {
													local256++;
												}
												if (local340 == 2 && local17 < local260 && local201 - 3 < local260 && (local809[local256 - local314][local260 - local320 - 1] & 0x2C0102) == 0) {
													local260--;
												}
												if (local340 == 3 && local260 < local17 + 103 && local201 + 3 > local260 && (local809[local256 - local314][local260 + 1 - local320] & 0x2C0120) == 0) {
													local260++;
												}
											}
										}
										Static150.anIntArray491[Static275.anInt4800] = local728.anInt7714;
										Static479.anIntArray672[Static275.anInt4800] = local256;
										Static670.anIntArray815[Static275.anInt4800] = local260;
										Static275.anInt4800++;
									}
								}
							}
						}
					}
				}
			}
			if (Static537.aClass130_2 != null) {
				Static277.aClass15_108.anInt425 = 1;
				Static84.aClass27_1.method695(1024, 64);
				for (local201 = 0; local201 < Static537.aClass130_2.anInt4121; local201++) {
					local203 = Static537.aClass130_2.anIntArray363[local201];
					if (local203 >> 28 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174) {
						local205 = (local203 >> 14 & 0x3FFF) - Static287.anInt4910;
						local211 = (local203 & 0x3FFF) - Static72.anInt1361;
						if (local205 >= 0 && Static158.anInt927 > local205 && local211 >= 0 && local211 < Static515.anInt8292) {
							Static522.aClass338_197.method8171(new Class3_Sub33(local201));
						} else {
							@Pc(1100) Class308 local1100 = Static84.aClass27_1.method693(Static537.aClass130_2.anIntArray364[local201]);
							if (local1100.anIntArray748 != null && local1100.anInt8808 + local205 >= 0 && Static158.anInt927 > local1100.anInt8785 + local205 && local211 + local1100.anInt8776 >= 0 && local1100.anInt8783 + local211 < Static515.anInt8292) {
								Static522.aClass338_197.method8171(new Class3_Sub33(local201));
							}
						}
					}
				}
				Static84.aClass27_1.method695(128, 64);
				Static277.aClass15_108.anInt425 = 2;
				Static277.aClass15_108.method541();
			}
		}
		return true;
	}
}
