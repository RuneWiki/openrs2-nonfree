import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
	public static int anInt2717 = 0;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
	public static int anInt2719 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	public static void method2245() {
		if (Static450.anInt7195 == 0 || Static450.anInt7195 == 5) {
			return;
		}
		try {
			if (++Static127.anInt2292 > 2000) {
				if (Static375.aClass160_3 != null) {
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
				}
				if (Static126.anInt546 >= 1) {
					Static450.anInt7195 = 0;
					Static409.method5176(-5);
					return;
				}
				Static127.anInt2292 = 0;
				Static450.anInt7195 = 1;
				Static126.anInt546++;
				if (Static263.anInt3675 == 2 || Static263.anInt3675 == 3) {
					Static14.aClass265_1.aBoolean518 = !Static14.aClass265_1.aBoolean518;
				} else {
					Static447.aClass265_5.aBoolean518 = !Static447.aClass265_5.aBoolean518;
				}
			}
			if (Static450.anInt7195 == 1) {
				if (Static263.anInt3675 == 2 || Static263.anInt3675 == 3) {
					Static229.aClass91_5 = Static79.aClass183_2.method3903(Static14.aClass265_1.aString199, Static14.aClass265_1.method5616());
				} else {
					Static229.aClass91_5 = Static79.aClass183_2.method3903(Static447.aClass265_5.aString199, Static447.aClass265_5.method5616());
				}
				Static450.anInt7195 = 2;
			}
			@Pc(181) int local181;
			if (Static450.anInt7195 == 2) {
				if (Static229.aClass91_5.anInt2446 == 2) {
					throw new IOException();
				}
				if (Static229.aClass91_5.anInt2446 != 1) {
					return;
				}
				Static375.aClass160_3 = new Class160((Socket) Static229.aClass91_5.anObject3, Static79.aClass183_2);
				Static229.aClass91_5 = null;
				@Pc(149) long local149 = Static141.aLong81 = Static380.method358(Static427.aString196);
				Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
				@Pc(159) int local159 = (int) (local149 >> 16 & 0x1FL);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static167.aClass236_1.anInt6448);
				Static456.aClass2_Sub13_Sub2_2.method3602(local159);
				Static375.aClass160_3.method3210(2, Static456.aClass2_Sub13_Sub2_2.aByteArray52);
				Static113.method1715();
				local181 = Static375.aClass160_3.method3205();
				Static113.method1715();
				if (local181 != 0) {
					Static450.anInt7195 = 0;
					Static409.method5176(local181);
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
					Static459.method3276();
					return;
				}
				Static450.anInt7195 = 3;
			}
			if (Static450.anInt7195 == 3) {
				if (Static375.aClass160_3.method3211() < 8) {
					return;
				}
				Static375.aClass160_3.method3207(8, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
				Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
				Static311.aLong201 = Static26.aClass2_Sub13_Sub2_1.method3597();
				@Pc(230) Class2_Sub13 local230 = new Class2_Sub13(70);
				@Pc(233) int[] local233 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static311.aLong201 >> 32), (int) Static311.aLong201 };
				local230.method3602(10);
				local230.method3569(local233[0]);
				local230.method3569(local233[1]);
				local230.method3569(local233[2]);
				local230.method3569(local233[3]);
				local230.method3570(Static380.method358(Static427.aString196));
				local230.method3590(Static258.aString121);
				local230.method3575(Static385.aBigInteger2, Static193.aBigInteger1);
				@Pc(304) Class2_Sub13_Sub2 local304 = Static456.aClass2_Sub13_Sub2_2;
				local304.anInt4347 = 0;
				if (Static263.anInt3675 == 2 || Static263.anInt3675 == 3) {
					if (Static290.anInt4777 == 12) {
						local304.method3602(Static167.aClass236_5.anInt6448);
					} else {
						local304.method3602(Static167.aClass236_3.anInt6448);
					}
					local304.method3568(0);
					local181 = local304.anInt4347;
					local304.method3569(599);
					local304.method3602(Static220.anInt3626);
					local304.method3602(Static284.method3772());
					local304.method3568(Static141.anInt2513);
					local304.method3568(Static314.anInt5426);
					local304.method3602(Static2.aClass148_Sub1_1.anInt3796);
					Static34.method523(local304);
					local304.method3590(Static182.aString95);
					local304.method3569(Static294.anInt979);
					@Pc(436) Class2_Sub13 local436 = Static2.aClass148_Sub1_1.method3044();
					local304.method3602(local436.anInt4347);
					local304.method3596(local436.anInt4347, local436.aByteArray52);
					Static418.aBoolean496 = true;
					local304.method3568(Static177.anInt3052);
					local304.method3568(Static302.anInt4872);
					Static96.method1497();
					local304.method3596(local230.anInt4347, local230.aByteArray52);
					local304.method3592(local304.anInt4347 - local181);
				} else {
					local304.method3602(Static167.aClass236_6.anInt6448);
					local304.method3568(0);
					local181 = local304.anInt4347;
					local304.method3569(599);
					local304.method3602(Static118.aClass4_1.anInt73);
					local304.method3602(Static331.anInt5597);
					Static34.method523(local304);
					local304.method3590(Static182.aString95);
					local304.method3569(Static294.anInt979);
					Static96.method1497();
					local304.method3596(local230.anInt4347, local230.aByteArray52);
					local304.method3592(local304.anInt4347 - local181);
				}
				Static375.aClass160_3.method3210(local304.anInt4347, local304.aByteArray52);
				local304.method3614(local233);
				for (local181 = 0; local181 < 4; local181++) {
					local233[local181] += 50;
				}
				Static26.aClass2_Sub13_Sub2_1.method3614(local233);
				Static450.anInt7195 = 4;
			}
			@Pc(526) int local526;
			if (Static450.anInt7195 == 4) {
				if (Static375.aClass160_3.method3211() < 1) {
					return;
				}
				local526 = Static375.aClass160_3.method3205();
				if (local526 == 21) {
					Static450.anInt7195 = 7;
				} else if (local526 == 29) {
					Static450.anInt7195 = 13;
				} else if (local526 == 1) {
					Static450.anInt7195 = 5;
					Static409.method5176(local526);
					return;
				} else if (local526 == 2) {
					Static450.anInt7195 = 8;
				} else if (local526 == 15) {
					Static450.anInt7195 = 14;
					Static209.anInt3493 = -2;
				} else if (local526 == 23 && Static126.anInt546 < 1) {
					Static450.anInt7195 = 1;
					Static126.anInt546++;
					Static127.anInt2292 = 0;
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
					return;
				} else {
					Static450.anInt7195 = 0;
					Static409.method5176(local526);
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
					Static459.method3276();
					return;
				}
			}
			if (Static450.anInt7195 == 6) {
				Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
				Static456.aClass2_Sub13_Sub2_2.method3611(Static167.aClass236_4.anInt6448);
				Static375.aClass160_3.method3210(Static456.aClass2_Sub13_Sub2_2.anInt4347, Static456.aClass2_Sub13_Sub2_2.aByteArray52);
				Static450.anInt7195 = 4;
			} else if (Static450.anInt7195 == 7) {
				if (Static375.aClass160_3.method3211() >= 1) {
					Static43.anInt801 = Static375.aClass160_3.method3205() * 60 + 180;
					Static450.anInt7195 = 0;
					Static409.method5176(21);
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
					Static459.method3276();
				}
			} else if (Static450.anInt7195 == 13) {
				if (Static375.aClass160_3.method3211() >= 1) {
					Static62.anInt1154 = Static375.aClass160_3.method3205();
					Static450.anInt7195 = 0;
					Static409.method5176(29);
					Static375.aClass160_3.method3202();
					Static375.aClass160_3 = null;
					Static459.method3276();
				}
			} else if (Static450.anInt7195 != 8) {
				@Pc(712) Class2_Sub13_Sub2 local712;
				if (Static450.anInt7195 == 9) {
					if (Static263.anInt3675 == 3) {
						Static238.aBoolean265 = true;
					} else {
						Static238.aBoolean265 = false;
					}
					local712 = Static26.aClass2_Sub13_Sub2_1;
					if (Static263.anInt3675 == 2 || Static263.anInt3675 == 3) {
						if (Static375.aClass160_3.method3211() < Static303.anInt5018) {
							return;
						}
						Static375.aClass160_3.method3207(Static303.anInt5018, local712.aByteArray52, 0);
						local712.anInt4347 = 0;
						Static440.anInt7085 = local712.method3580();
						Static18.anInt3417 = local712.method3580();
						Static409.aBoolean471 = local712.method3580() == 1;
						Static399.aBoolean464 = local712.method3580() == 1;
						Static7.aBoolean13 = local712.method3580() == 1;
						Static298.aBoolean16 = local712.method3580() == 1;
						Static201.anInt3383 = local712.method3555();
						Static291.aBoolean337 = local712.method3580() == 1;
						Static2.anInt4 = local712.method3541();
						Static47.aBoolean73 = local712.method3580() == 1;
						if (Static263.anInt3675 == 3) {
							@Pc(824) boolean local824 = local712.method3580() == 1;
							if (local824) {
								@Pc(830) long local830 = local712.method3597();
								@Pc(834) String local834 = Static134.method1995(local830);
								@Pc(838) int local838 = local712.method3580();
								@Pc(841) byte[] local841 = new byte[local838];
								local712.method3610(local838, local841);
								@Pc(851) String local851 = Static39.method595(local841);
								@Pc(853) Class178 local853 = null;
								try {
									@Pc(859) Class91 local859 = Static79.aClass183_2.method3921("3", false);
									while (local859.anInt2446 == 0) {
										Static429.method5376(1L);
									}
									if (local859.anInt2446 == 1) {
										local853 = (Class178) local859.anObject3;
										@Pc(890) int local890 = local834.length() + local851.length() + 3 + 2 + 4;
										if (local890 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(905) Class2_Sub13 local905 = new Class2_Sub13(local890 + 1);
										local905.method3602(local890);
										local905.method3602(0);
										local905.method3549(local834);
										local905.method3549(local851);
										local905.method3560();
										local853.method3782(local905.anInt4347, local905.aByteArray52, 0);
									}
								} catch (@Pc(935) Exception local935) {
								}
								try {
									if (local853 != null) {
										local853.method3779();
									}
								} catch (@Pc(942) Exception local942) {
								}
							}
						}
						Static50.aClass190_1.method4220(Static47.aBoolean73);
						Static384.aClass164_2.method3456(Static47.aBoolean73);
						Static155.aClass263_1.method5585(Static47.aBoolean73);
					} else if (Static375.aClass160_3.method3211() >= Static303.anInt5018) {
						Static375.aClass160_3.method3207(Static303.anInt5018, local712.aByteArray52, 0);
						local712.anInt4347 = 0;
						Static440.anInt7085 = local712.method3580();
						Static18.anInt3417 = local712.method3580();
						Static409.aBoolean471 = local712.method3580() == 1;
						Static399.aBoolean464 = local712.method3580() == 1;
						Static7.aBoolean13 = local712.method3580() == 1;
						Static13.anInt181 = local712.method3555();
						Static291.aBoolean337 = Static13.anInt181 > 0;
						Static413.anInt6774 = local712.method3555();
						Static72.anInt1389 = local712.method3555();
						Static255.anInt4111 = local712.method3555();
						Static175.anInt3046 = local712.method3574();
						Static129.aClass91_1 = Static79.aClass183_2.method3914(Static175.anInt3046);
						Static271.anInt3782 = local712.method3580();
						Static246.anInt3973 = local712.method3555();
						Static32.anInt616 = local712.method3555();
						Static190.aBoolean186 = local712.method3580() == 1;
						Static60.aClass3_Sub4_Sub1_Sub2_1.aString148 = Static60.aClass3_Sub4_Sub1_Sub2_1.aString147 = local712.method3589();
						Static140.aClass265_3 = new Class265();
						Static140.aClass265_3.anInt7137 = local712.method3555();
						if (Static140.aClass265_3.anInt7137 == 65535) {
							Static140.aClass265_3.anInt7137 = -1;
						}
						Static140.aClass265_3.aString199 = local712.method3589();
						if (Static260.aClass258_7 != Static60.aClass258_1) {
							Static140.aClass265_3.anInt7133 = Static140.aClass265_3.anInt7137 + 40000;
							Static140.aClass265_3.anInt7134 = Static140.aClass265_3.anInt7137 + 50000;
						}
						if (Static260.aClass258_7 != Static236.aClass258_6 && (Static14.aClass265_1.method5617(Static72.aClass265_2) || Static14.aClass265_1.method5617(Static149.aClass265_4))) {
							Static14.aClass265_1 = Static140.aClass265_3;
						}
					} else {
						return;
					}
					if (Static409.aBoolean471 && !Static7.aBoolean13 || Static291.aBoolean337) {
						try {
							Static469.method4194("zap", Static79.aClass183_2.anApplet1);
						} catch (@Pc(1155) Throwable local1155) {
							if (Static113.aBoolean140) {
								try {
									Static79.aClass183_2.anApplet1.getAppletContext().showDocument(new URL(Static79.aClass183_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1171) Exception local1171) {
								}
							}
						}
					} else {
						try {
							Static469.method4194("unzap", Static79.aClass183_2.anApplet1);
						} catch (@Pc(1145) Throwable local1145) {
						}
					}
					if (Static60.aClass258_1 == Static260.aClass258_7) {
						try {
							Static469.method4194("loggedin", Static79.aClass183_2.anApplet1);
						} catch (@Pc(1183) Throwable local1183) {
						}
					}
					if (Static263.anInt3675 != 2 && Static263.anInt3675 != 3) {
						Static450.anInt7195 = 0;
						Static409.method5176(2);
						Static286.method3816();
						Static37.method5022(6);
						Static175.aClass211_73 = null;
						return;
					}
					Static450.anInt7195 = 11;
				}
				if (Static450.anInt7195 == 11) {
					if (Static375.aClass160_3.method3211() < 3) {
						return;
					}
					Static375.aClass160_3.method3207(3, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
					Static450.anInt7195 = 12;
				}
				if (Static450.anInt7195 == 12) {
					local712 = Static26.aClass2_Sub13_Sub2_1;
					local712.anInt4347 = 0;
					if (local712.method3618()) {
						if (Static375.aClass160_3.method3211() < 1) {
							return;
						}
						Static375.aClass160_3.method3207(1, local712.aByteArray52, 3);
					}
					Static175.aClass211_73 = Static260.method3497()[local712.method3606()];
					Static209.anInt3493 = local712.method3555();
					Static450.anInt7195 = 10;
				}
				if (Static450.anInt7195 == 10) {
					if (Static375.aClass160_3.method3211() >= Static209.anInt3493) {
						Static375.aClass160_3.method3207(Static209.anInt3493, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
						Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
						local526 = Static209.anInt3493;
						Static450.anInt7195 = 0;
						Static409.method5176(2);
						Static312.method4253();
						Static175.method2475(Static26.aClass2_Sub13_Sub2_1);
						Static283.anInt4621 = -1;
						Static224.method2945();
						if (local526 != Static26.aClass2_Sub13_Sub2_1.anInt4347) {
							throw new RuntimeException("lswp pos:" + Static26.aClass2_Sub13_Sub2_1.anInt4347 + " psize:" + local526);
						}
						Static175.aClass211_73 = null;
					}
				} else if (Static450.anInt7195 == 14) {
					if (Static209.anInt3493 == -2) {
						if (Static375.aClass160_3.method3211() < 2) {
							return;
						}
						Static375.aClass160_3.method3207(2, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
						Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
						Static209.anInt3493 = Static26.aClass2_Sub13_Sub2_1.method3555();
					}
					if (Static375.aClass160_3.method3211() >= Static209.anInt3493) {
						Static375.aClass160_3.method3207(Static209.anInt3493, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
						Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
						Static450.anInt7195 = 0;
						local526 = Static209.anInt3493;
						Static409.method5176(15);
						Static174.method2463();
						Static175.method2475(Static26.aClass2_Sub13_Sub2_1);
						if (Static26.aClass2_Sub13_Sub2_1.anInt4347 != local526) {
							throw new RuntimeException("lswpr pos:" + Static26.aClass2_Sub13_Sub2_1.anInt4347 + " psize:" + local526);
						}
						Static175.aClass211_73 = null;
					}
				}
			} else if (Static375.aClass160_3.method3211() >= 1) {
				Static303.anInt5018 = Static375.aClass160_3.method3205();
				Static450.anInt7195 = 9;
			}
		} catch (@Pc(1419) IOException local1419) {
			if (Static375.aClass160_3 != null) {
				Static375.aClass160_3.method3202();
				Static375.aClass160_3 = null;
			}
			if (Static126.anInt546 >= 1) {
				Static450.anInt7195 = 0;
				Static409.method5176(-4);
				Static459.method3276();
			} else {
				if (Static263.anInt3675 == 2 || Static263.anInt3675 == 3) {
					Static14.aClass265_1.aBoolean518 = !Static14.aClass265_1.aBoolean518;
				} else {
					Static447.aClass265_5.aBoolean518 = !Static447.aClass265_5.aBoolean518;
				}
				Static450.anInt7195 = 1;
				Static126.anInt546++;
				Static127.anInt2292 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILclient!pm;ILclient!jm;Lclient!pf;II)V")
	public static void method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class192 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub4_Sub1_Sub1 arg4, @OriginalArg(5) Class3_Sub4_Sub1_Sub2 arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class2_Sub35 local7 = new Class2_Sub35();
		local7.anInt4565 = arg0 << 7;
		local7.anInt4556 = arg1 << 7;
		local7.anInt4561 = arg6;
		if (arg2 != null) {
			local7.aClass192_1 = arg2;
			@Pc(135) int local135 = arg2.anInt5321;
			@Pc(138) int local138 = arg2.anInt5355;
			if (arg3 == 1 || arg3 == 3) {
				local138 = arg2.anInt5321;
				local135 = arg2.anInt5355;
			}
			local7.anInt4550 = arg2.anInt5351;
			local7.anIntArray389 = arg2.anIntArray438;
			local7.anInt4554 = arg2.anInt5319;
			local7.anInt4563 = arg1 + local135 << 7;
			local7.anInt4562 = arg2.anInt5333 << 7;
			local7.anInt4553 = arg0 + local138 << 7;
			local7.anInt4555 = arg2.anInt5323;
			local7.anInt4551 = arg2.anInt5345;
			if (arg2.anIntArray434 != null) {
				local7.aBoolean324 = true;
				local7.method3719();
			}
			if (local7.anIntArray389 != null) {
				local7.anInt4559 = local7.anInt4550 + (int) (Math.random() * (double) (local7.anInt4555 - local7.anInt4550));
			}
			Static111.aClass156_12.method3157(local7);
		} else if (arg4 != null) {
			local7.aClass3_Sub4_Sub1_Sub1_2 = arg4;
			@Pc(80) Class245 local80 = arg4.aClass245_1;
			if (local80.anIntArray560 != null) {
				local7.aBoolean324 = true;
				local80 = local80.method5205(Static138.aClass268_1);
			}
			if (local80 != null) {
				local7.anInt4563 = local80.anInt6704 + arg1 << 7;
				local7.anInt4553 = local80.anInt6704 + arg0 << 7;
				local7.anInt4551 = Static397.method5062(arg4);
				local7.anInt4554 = local80.anInt6719;
				local7.anInt4562 = local80.lb << 7;
			}
			Static289.aClass156_36.method3157(local7);
		} else if (arg5 != null) {
			local7.aClass3_Sub4_Sub1_Sub2_2 = arg5;
			local7.anInt4563 = arg5.method4009() + arg1 << 7;
			local7.anInt4553 = arg0 + arg5.method4009() << 7;
			local7.anInt4551 = Static351.method4669(arg5);
			local7.anInt4554 = arg5.anInt4993;
			local7.anInt4562 = arg5.anInt5013 << 7;
			Static427.aClass72_47.method1653(local7, (long) arg5.anInt4915);
			return;
		}
	}
}
