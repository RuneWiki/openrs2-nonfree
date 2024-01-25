import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString82 = null;

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "Lclient!go;")
	public static final Class121 aClass121_12 = new Class121(11, 0, 1, 2);

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Z")
	public static boolean aBoolean532 = false;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILclient!r;I)V")
	public static void method5587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static367.anInt6997 == 0 || Static432.anInt7736 == 0) {
			return;
		}
		arg2.la(Static517.anInt8882, Static103.anInt1779, Static367.anInt6997, Static432.anInt7736);
		arg2.da(Static209.anInt8894, Static34.anInt728, Static367.anInt6997, Static432.anInt7736);
		@Pc(35) Class34 local35 = arg2.method6833();
		local35.na(Static270.anInt4946, Static39.anInt811, Static262.anInt4773, Static245.anInt4527, Static55.anInt1064, Static315.anInt5766);
		arg2.method6812(local35);
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(127) int[] local127;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(157) int local157;
		@Pc(170) int local170;
		if (Static36.aClass129Array7 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			local55 = arg2.BA();
			local64 = local55 * (arg0 - Static517.anInt8882) / Static367.anInt6997;
			local73 = local55 * (arg1 - Static103.anInt1779) / Static432.anInt7736;
			local76 = arg2.U();
			local85 = local76 * (arg0 - Static517.anInt8882) / Static367.anInt6997;
			local94 = local76 * (arg1 - Static103.anInt1779) / Static432.anInt7736;
			@Pc(109) int[] local109 = new int[] { local64, local73, local55 };
			local35.YA(local109);
			local127 = new int[] { local85, local94, local76 };
			local35.YA(local127);
			@Pc(132) float local132 = 0.0F;
			local140 = local127[0] - local109[0];
			local148 = local127[1] - local109[1];
			local157 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				local170 = (int) ((float) local109[0] + local132 * (float) local140);
				@Pc(174) int local174 = local170 >> 9;
				@Pc(185) int local185 = (int) ((float) local109[2] + local132 * (float) local157);
				@Pc(189) int local189 = local185 >> 9;
				if (local174 > 0 && local189 > 0 && Static458.anInt9736 > local174 && Static378.anInt6747 > local189) {
					@Pc(213) int local213 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113;
					if (local213 < 3 && (Static85.aByteArrayArrayArray1[1][local174][local189] & 0x2) != 0) {
						local213++;
					}
					if ((float) Static36.aClass129Array7[local213].method6480(local185, local170) < (float) local109[1] + (float) local148 * local132) {
						local50 = (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() - 1 << 8) + local170 >> 9;
						local52 = local185 + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() - 1 << 8) >> 9;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static563.aBoolean697 && (Static420.anInt7401 & 0x40) != 0) {
					@Pc(341) Class160 local341 = Static420.method5959(Static594.anInt9808, Static299.anInt5617);
					if (local341 == null) {
						Static193.method3074();
					} else {
						Static385.method5573(9, local52, Static318.aString69, Static385.anInt6906, false, true, " ->", 0L, local50, -1);
					}
				} else {
					if (Static6.aBoolean717) {
						Static385.method5573(4, local52, Static375.aClass253_31.method5453(Static161.anInt3095), -1, false, true, "", 0L, local50, -1);
					}
					Static385.method5573(23, local52, Static383.aString80, Static358.anInt9364, false, true, "", 0L, local50, -1);
				}
			}
		}
		@Pc(361) Class196 local361 = Static572.aClass196_9;
		for (@Pc(375) Class11_Sub2 local375 = (Class11_Sub2) local361.method4024(); local375 != null; local375 = (Class11_Sub2) local361.method4028()) {
			if ((Static393.aBoolean536 || local375.aClass11_Sub1_1.aByte113 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) && local375.method599(arg2, arg1, arg0)) {
				if (local375.aClass11_Sub1_1 instanceof Class11_Sub1_Sub1) {
					local55 = ((Class11_Sub1_Sub1) local375.aClass11_Sub1_1).aShort90;
					local64 = ((Class11_Sub1_Sub1) local375.aClass11_Sub1_1).aShort88;
				} else {
					local64 = local375.aClass11_Sub1_1.anInt8906 >> 9;
					local55 = local375.aClass11_Sub1_1.anInt8902 >> 9;
				}
				@Pc(497) int local497;
				@Pc(613) int local613;
				if (local375.aClass11_Sub1_1 instanceof Class11_Sub1_Sub1_Sub3_Sub1) {
					@Pc(436) Class11_Sub1_Sub1_Sub3_Sub1 local436 = (Class11_Sub1_Sub1_Sub3_Sub1) local375.aClass11_Sub1_1;
					local76 = local436.method6058();
					if ((local76 & 0x1) == 0 && (local436.anInt8902 & 0x1FF) == 0 && (local436.anInt8906 & 0x1FF) == 0 || (local76 & 0x1) == 1 && (local436.anInt8902 & 0x1FF) == 256 && (local436.anInt8906 & 0x1FF) == 256) {
						local85 = local436.anInt8902 - (local436.method6058() - 1 << 8);
						local94 = local436.anInt8906 - (local436.method6058() - 1 << 8);
						for (local497 = 0; local497 < Static306.anInt4911; local497++) {
							@Pc(508) Class1_Sub33 local508 = (Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local497]);
							if (local508 != null) {
								@Pc(513) Class11_Sub1_Sub1_Sub3_Sub2 local513 = local508.aClass11_Sub1_Sub1_Sub3_Sub2_2;
								if (local513.anInt7594 != Static518.anInt9331 && local513.aBoolean577) {
									local140 = local513.anInt8902 - (local513.aClass354_1.anInt9418 - 1 << 8);
									local148 = local513.anInt8906 - (local513.aClass354_1.anInt9418 - 1 << 8);
									if (local85 <= local140 && local513.aClass354_1.anInt9418 <= local436.method6058() - (local140 - local85 >> 9) && local148 >= local94 && local513.aClass354_1.anInt9418 <= local436.method6058() - (local148 - local94 >> 9)) {
										Static228.method3397(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 != local375.aClass11_Sub1_1.aByte113, local513);
										local513.anInt7594 = Static518.anInt9331;
									}
								}
							}
						}
						local613 = Static75.anInt1461;
						@Pc(615) int[] local615 = Static167.anIntArray145;
						for (local140 = 0; local140 < local613; local140++) {
							@Pc(625) Class11_Sub1_Sub1_Sub3_Sub1 local625 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local615[local140]];
							if (local625 != null && local625.anInt7594 != Static518.anInt9331 && local436 != local625 && local625.aBoolean577) {
								local157 = local625.anInt8902 - (local625.method6058() - 1 << 8);
								local170 = local625.anInt8906 - (local625.method6058() - 1 << 8);
								if (local85 <= local157 && local625.method6058() <= local436.method6058() - (local157 - local85 >> 9) && local170 >= local94 && local625.method6058() <= local436.method6058() - (local170 - local94 >> 9)) {
									Static154.method2539(local625, local375.aClass11_Sub1_1.aByte113 != Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113);
									local625.anInt7594 = Static518.anInt9331;
								}
							}
						}
					}
					if (Static518.anInt9331 == local436.anInt7594) {
						continue;
					}
					Static154.method2539(local436, local375.aClass11_Sub1_1.aByte113 != Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113);
					local436.anInt7594 = Static518.anInt9331;
				}
				@Pc(867) int local867;
				if (local375.aClass11_Sub1_1 instanceof Class11_Sub1_Sub1_Sub3_Sub2) {
					@Pc(759) Class11_Sub1_Sub1_Sub3_Sub2 local759 = (Class11_Sub1_Sub1_Sub3_Sub2) local375.aClass11_Sub1_1;
					if (local759.aClass354_1 != null) {
						if ((local759.aClass354_1.anInt9418 & 0x1) == 0 && (local759.anInt8902 & 0x1FF) == 0 && (local759.anInt8906 & 0x1FF) == 0 || (local759.aClass354_1.anInt9418 & 0x1) == 1 && (local759.anInt8902 & 0x1FF) == 256 && (local759.anInt8906 & 0x1FF) == 256) {
							local76 = local759.anInt8902 - (local759.aClass354_1.anInt9418 - 1 << 8);
							local85 = local759.anInt8906 - (local759.aClass354_1.anInt9418 - 1 << 8);
							for (local94 = 0; local94 < Static306.anInt4911; local94++) {
								@Pc(838) Class1_Sub33 local838 = (Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local94]);
								if (local838 != null) {
									@Pc(843) Class11_Sub1_Sub1_Sub3_Sub2 local843 = local838.aClass11_Sub1_Sub1_Sub3_Sub2_2;
									if (Static518.anInt9331 != local843.anInt7594 && local843 != local759 && local843.aBoolean577) {
										local867 = local843.anInt8902 - (local843.aClass354_1.anInt9418 - 1 << 8);
										local140 = local843.anInt8906 - (local843.aClass354_1.anInt9418 - 1 << 8);
										if (local867 >= local76 && local843.aClass354_1.anInt9418 <= local759.aClass354_1.anInt9418 - (local867 - local76 >> 9) && local140 >= local85 && local759.aClass354_1.anInt9418 - (local140 - local85 >> 9) >= local843.aClass354_1.anInt9418) {
											Static228.method3397(local375.aClass11_Sub1_1.aByte113 != Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, local843);
											local843.anInt7594 = Static518.anInt9331;
										}
									}
								}
							}
							local497 = Static75.anInt1461;
							local127 = Static167.anIntArray145;
							for (local867 = 0; local867 < local497; local867++) {
								@Pc(958) Class11_Sub1_Sub1_Sub3_Sub1 local958 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local127[local867]];
								if (local958 != null && local958.anInt7594 != Static518.anInt9331 && local958.aBoolean577) {
									local148 = local958.anInt8902 - (local958.method6058() - 1 << 8);
									local157 = local958.anInt8906 - (local958.method6058() - 1 << 8);
									if (local148 >= local76 && local958.method6058() <= local759.aClass354_1.anInt9418 - (local148 - local76 >> 9) && local85 <= local157 && local958.method6058() <= local759.aClass354_1.anInt9418 - (local157 - local85 >> 9)) {
										Static154.method2539(local958, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 != local375.aClass11_Sub1_1.aByte113);
										local958.anInt7594 = Static518.anInt9331;
									}
								}
							}
						}
						if (Static518.anInt9331 == local759.anInt7594) {
							continue;
						}
						Static228.method3397(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 != local375.aClass11_Sub1_1.aByte113, local759);
						local759.anInt7594 = Static518.anInt9331;
					}
				}
				if (local375.aClass11_Sub1_1 instanceof Class11_Sub1_Sub2_Sub1) {
					local73 = Static539.anInt9045 + local55;
					local76 = local64 + Static311.anInt5708;
					@Pc(1125) Class1_Sub20 local1125 = (Class1_Sub20) Static365.aClass91_29.method2271((long) (local73 | local375.aClass11_Sub1_1.aByte113 << 28 | local76 << 14));
					if (local1125 != null) {
						for (@Pc(1133) Class1_Sub37 local1133 = (Class1_Sub37) local1125.aClass111_10.method2544(); local1133 != null; local1133 = (Class1_Sub37) local1125.aClass111_10.method2551()) {
							@Pc(1141) Class222 local1141 = Static230.aClass225_1.method4857(local1133.anInt6970);
							if (Static563.aBoolean697 && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 == local375.aClass11_Sub1_1.aByte113) {
								@Pc(1159) Class94 local1159 = Static306.anInt4907 == -1 ? null : Static256.aClass263_1.method5592(Static306.anInt4907);
								if ((Static420.anInt7401 & 0x1) != 0 && (local1159 == null || local1141.method4794(local1159.anInt2658, Static306.anInt4907) != local1159.anInt2658)) {
									Static385.method5573(44, local64, Static318.aString69, Static385.anInt6906, false, true, Static146.aString26 + " -> <col=ff9040>" + local1141.aString70, (long) local1133.anInt6970, local55, -1);
								}
							}
							if (local375.aClass11_Sub1_1.aByte113 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) {
								@Pc(1211) String[] local1211 = local1141.aStringArray20;
								for (local867 = 4; local867 >= 0; local867--) {
									if (local1211 != null && local1211[local867] != null) {
										@Pc(1223) byte local1223 = 0;
										if (local867 == 0) {
											local1223 = 8;
										}
										local148 = Static133.anInt2655;
										if (local867 == 1) {
											local1223 = 19;
										}
										if (local867 == 2) {
											local1223 = 16;
										}
										if (local867 == 3) {
											local1223 = 60;
										}
										if (local867 == 4) {
											local1223 = 25;
										}
										if (local867 == local1141.anInt5865) {
											local148 = local1141.anInt5885;
										}
										if (local867 == local1141.anInt5863) {
											local148 = local1141.anInt5896;
										}
										Static385.method5573(local1223, local64, local1211[local867], local148, false, true, "<col=ff9040>" + local1141.aString70, (long) local1133.anInt6970, local55, -1);
									}
								}
							}
							Static385.method5573(1006, local64, Static375.aClass253_26.method5453(Static161.anInt3095), Static505.anInt8777, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 != local375.aClass11_Sub1_1.aByte113, true, "<col=ff9040>" + local1141.aString70, (long) local1133.anInt6970, local55, -1);
						}
					}
				}
				if (local375.aClass11_Sub1_1 instanceof Interface15) {
					@Pc(1356) Interface15 local1356 = (Interface15) local375.aClass11_Sub1_1;
					@Pc(1363) Class178 local1363 = Static347.aClass122_4.method2770(local1356.method7232());
					if (local1363.anIntArray252 != null) {
						local1363 = local1363.method3713(Static390.aClass353_29);
					}
					if (local1363 != null) {
						if (Static563.aBoolean697 && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 == local375.aClass11_Sub1_1.aByte113) {
							@Pc(1395) Class94 local1395 = Static306.anInt4907 == -1 ? null : Static256.aClass263_1.method5592(Static306.anInt4907);
							if ((Static420.anInt7401 & 0x4) != 0 && (local1395 == null || local1363.method3710(Static306.anInt4907, local1395.anInt2658) != local1395.anInt2658)) {
								Static385.method5573(59, local64, Static318.aString69, Static385.anInt6906, false, true, Static146.aString26 + " -> <col=00ffff>" + local1363.aString52, Static286.method4307(local55, local1356, local64), local55, -1);
							}
						}
						if (local375.aClass11_Sub1_1.aByte113 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) {
							@Pc(1456) String[] local1456 = local1363.aStringArray13;
							if (local1456 != null) {
								for (local94 = 4; local94 >= 0; local94--) {
									if (local1456[local94] != null) {
										@Pc(1468) short local1468 = 0;
										local613 = Static133.anInt2655;
										if (local94 == 0) {
											local1468 = 46;
										}
										if (local94 == 1) {
											local1468 = 30;
										}
										if (local94 == 2) {
											local1468 = 50;
										}
										if (local94 == 3) {
											local1468 = 11;
										}
										if (local94 == 4) {
											local1468 = 1003;
										}
										if (local94 == local1363.anInt4653) {
											local613 = local1363.anInt4640;
										}
										if (local1363.anInt4648 == local94) {
											local613 = local1363.anInt4665;
										}
										Static385.method5573(local1468, local64, local1456[local94], local613, false, true, "<col=00ffff>" + local1363.aString52, Static286.method4307(local55, local1356, local64), local55, -1);
									}
								}
							}
						}
						Static385.method5573(1010, local64, Static375.aClass253_26.method5453(Static161.anInt3095), Static505.anInt8777, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 != local375.aClass11_Sub1_1.aByte113, true, "<col=00ffff>" + local1363.aString52, (long) local1363.anInt4643, local55, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!laa;Ljava/lang/String;II)Lclient!kl;")
	public static Class191 method5588(@OriginalArg(0) Class198 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method4298(arg1);
		}
		@Pc(34) Class191 local34;
		if (arg2 == 1) {
			try {
				Static597.method646(new Object[] { (new URL(Static433.anApplet2.getCodeBase(), arg1)).toString() }, Static433.anApplet2, "openjs");
				local34 = new Class191();
				local34.anInt5014 = 1;
				return local34;
			} catch (@Pc(40) Throwable local40) {
				local34 = new Class191();
				local34.anInt5014 = 2;
				return local34;
			}
		} else if (arg2 == 2) {
			try {
				Static433.anApplet2.getAppletContext().showDocument(new URL(Static433.anApplet2.getCodeBase(), arg1), "_blank");
				local34 = new Class191();
				local34.anInt5014 = 1;
				return local34;
			} catch (@Pc(74) Exception local74) {
				local34 = new Class191();
				local34.anInt5014 = 2;
				return local34;
			}
		} else if (arg2 == 3) {
			try {
				Static597.method645(Static433.anApplet2, "loggedout");
			} catch (@Pc(95) Throwable local95) {
			}
			try {
				Static433.anApplet2.getAppletContext().showDocument(new URL(Static433.anApplet2.getCodeBase(), arg1), "_top");
				local34 = new Class191();
				local34.anInt5014 = 1;
				return local34;
			} catch (@Pc(115) Exception local115) {
				local34 = new Class191();
				local34.anInt5014 = 2;
				return local34;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
