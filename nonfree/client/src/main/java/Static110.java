import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public static int anInt1988;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(III)V")
	public static void method1644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18;
		if (Static51.anInt1085 != arg0) {
			Static586.anIntArray653 = new int[arg0];
			for (local18 = 0; local18 < arg0; local18++) {
				Static586.anIntArray653[local18] = (local18 << 12) / arg0;
			}
			Static51.anInt1085 = arg0;
			Static332.anInt5256 = arg0 - 1;
			Static385.anInt6041 = arg0 * 32;
		}
		if (Static262.anInt5589 == arg1) {
			return;
		}
		if (Static51.anInt1085 == arg1) {
			Static564.anIntArray630 = Static586.anIntArray653;
		} else {
			Static564.anIntArray630 = new int[arg1];
			for (local18 = 0; local18 < arg1; local18++) {
				Static564.anIntArray630[local18] = (local18 << 12) / arg1;
			}
		}
		Static262.anInt5589 = arg1;
		Static53.anInt1098 = arg1 - 1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Z")
	public static boolean method1645() throws IOException {
		if (Static155.aClass121_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static468.aClass288_250 == null) {
			if (Static92.aBoolean134) {
				if (!Static155.aClass121_2.method2934(1)) {
					return false;
				}
				Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
				Static135.anInt2273++;
				Static243.anInt3928 = 0;
				Static92.aBoolean134 = false;
			}
			Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
			if (Static53.aClass2_Sub22_Sub2_1.method8565()) {
				if (!Static155.aClass121_2.method2934(1)) {
					return false;
				}
				Static155.aClass121_2.method2938(1, 1, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
				Static243.anInt3928 = 0;
				Static135.anInt2273++;
			}
			Static92.aBoolean134 = true;
			@Pc(69) Class288[] local69 = Static152.method2264();
			local73 = Static53.aClass2_Sub22_Sub2_1.method8563();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static53.aClass2_Sub22_Sub2_1.anInt10247);
			}
			Static468.aClass288_250 = local69[local73];
			Static84.anInt1498 = Static468.aClass288_250.anInt7466;
		}
		if (Static84.anInt1498 == -1) {
			if (!Static155.aClass121_2.method2934(1)) {
				return false;
			}
			Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
			Static84.anInt1498 = Static53.aClass2_Sub22_Sub2_1.aByteArray115[0] & 0xFF;
			Static135.anInt2273++;
			Static243.anInt3928 = 0;
		}
		if (Static84.anInt1498 == -2) {
			if (!Static155.aClass121_2.method2934(2)) {
				return false;
			}
			Static155.aClass121_2.method2938(2, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
			Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
			Static84.anInt1498 = Static53.aClass2_Sub22_Sub2_1.method8546();
			Static135.anInt2273 += 2;
			Static243.anInt3928 = 0;
		}
		if (Static84.anInt1498 > 0) {
			if (!Static155.aClass121_2.method2934(Static84.anInt1498)) {
				return false;
			}
			Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
			Static155.aClass121_2.method2938(Static84.anInt1498, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
			Static243.anInt3928 = 0;
			Static135.anInt2273 += Static84.anInt1498;
		}
		Static198.aClass288_282 = Static109.aClass288_71;
		Static109.aClass288_71 = Static146.aClass288_90;
		Static146.aClass288_90 = Static468.aClass288_250;
		@Pc(219) int local219;
		@Pc(211) int local211;
		@Pc(223) int local223;
		@Pc(229) int local229;
		if (Static116.aClass288_77 == Static468.aClass288_250) {
			local211 = Static53.aClass2_Sub22_Sub2_1.method8527();
			local73 = Static53.aClass2_Sub22_Sub2_1.method8527();
			local219 = Static53.aClass2_Sub22_Sub2_1.method8496();
			local223 = Static53.aClass2_Sub22_Sub2_1.method8527();
			local229 = Static53.aClass2_Sub22_Sub2_1.method8520() << 2;
			Static168.method2500();
			Static88.method1313(local211, local229, local73, true, local219, local223);
			Static468.aClass288_250 = null;
			return true;
		} else if (Static468.aClass288_250 == Static211.aClass288_118) {
			Static230.method3181(Static184.aClass168_4);
			Static468.aClass288_250 = null;
			return true;
		} else {
			@Pc(291) boolean local291;
			@Pc(327) int local327;
			@Pc(422) int local422;
			@Pc(429) int local429;
			@Pc(426) boolean local426;
			if (Static468.aClass288_250 == Static646.aClass288_361) {
				Static620.anInt9960 = Static542.anInt8903;
				if (Static84.anInt1498 == 0) {
					Static619.aClass211Array1 = null;
					Static392.aString84 = null;
					Static37.aString9 = null;
					Static468.aClass288_250 = null;
					Static159.anInt2843 = 0;
					return true;
				}
				Static392.aString84 = Static53.aClass2_Sub22_Sub2_1.method8549();
				local291 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
				if (local291) {
					Static53.aClass2_Sub22_Sub2_1.method8549();
				}
				@Pc(301) long local301 = Static53.aClass2_Sub22_Sub2_1.method8506();
				Static37.aString9 = Static309.method4208(local301);
				Static100.aByte29 = Static53.aClass2_Sub22_Sub2_1.method8548();
				local223 = Static53.aClass2_Sub22_Sub2_1.method8547();
				if (local223 == 255) {
					Static468.aClass288_250 = null;
					return true;
				}
				Static159.anInt2843 = local223;
				@Pc(325) Class211[] local325 = new Class211[100];
				for (local327 = 0; local327 < Static159.anInt2843; local327++) {
					local325[local327] = new Class211();
					local325[local327].aString59 = Static53.aClass2_Sub22_Sub2_1.method8549();
					local291 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
					if (local291) {
						local325[local327].aString61 = Static53.aClass2_Sub22_Sub2_1.method8549();
					} else {
						local325[local327].aString61 = local325[local327].aString59;
					}
					local325[local327].aString60 = Static60.method906(local325[local327].aString61);
					local325[local327].anInt5229 = Static53.aClass2_Sub22_Sub2_1.method8546();
					local325[local327].aByte80 = Static53.aClass2_Sub22_Sub2_1.method8548();
					local325[local327].aString62 = Static53.aClass2_Sub22_Sub2_1.method8549();
					if (local325[local327].aString61.equals(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50)) {
						Static326.aByte79 = local325[local327].aByte80;
					}
				}
				local422 = Static159.anInt2843;
				while (local422 > 0) {
					local426 = true;
					local422--;
					for (local429 = 0; local429 < local422; local429++) {
						if (local325[local429].aString60.compareTo(local325[local429 + 1].aString60) > 0) {
							@Pc(447) Class211 local447 = local325[local429];
							local325[local429] = local325[local429 + 1];
							local325[local429 + 1] = local447;
							local426 = false;
						}
					}
					if (local426) {
						break;
					}
				}
				Static619.aClass211Array1 = local325;
				Static468.aClass288_250 = null;
				return true;
			} else if (Static294.aClass288_167 == Static468.aClass288_250) {
				local211 = Static53.aClass2_Sub22_Sub2_1.method8555();
				Static168.method2500();
				Static625.method8365(5, local211, Static528.anInt8672, 0);
				Static468.aClass288_250 = null;
				return true;
			} else if (Static468.aClass288_250 == Static639.aClass288_357) {
				Static230.method3181(Static312.aClass168_8);
				Static468.aClass288_250 = null;
				return true;
			} else {
				@Pc(569) String local569;
				@Pc(543) boolean local543;
				@Pc(527) String local527;
				@Pc(525) String local525;
				if (Static468.aClass288_250 == Static292.aClass288_163) {
					local291 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
					local525 = Static53.aClass2_Sub22_Sub2_1.method8549();
					local527 = local525;
					if (local291) {
						local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
					}
					local223 = Static53.aClass2_Sub22_Sub2_1.method8547();
					local229 = Static53.aClass2_Sub22_Sub2_1.method8546();
					local543 = false;
					if (local223 <= 1 && Static260.method3557(local527)) {
						local543 = true;
					}
					if (!local543 && Static71.anInt1258 == 0) {
						local569 = Static295.aClass362_2.method8112(local229).method3156(Static53.aClass2_Sub22_Sub2_1);
						if (local223 == 2) {
							Static150.method2241(0, local525, local569, "<img=1>" + local527, "<img=1>" + local525, local229, null, 25);
						} else if (local223 == 1) {
							Static150.method2241(0, local525, local569, "<img=0>" + local527, "<img=0>" + local525, local229, null, 25);
						} else {
							Static150.method2241(0, local525, local569, local527, local525, local229, null, 25);
						}
					}
					Static468.aClass288_250 = null;
					return true;
				} else if (Static334.aClass288_184 == Static468.aClass288_250) {
					Static379.method5066();
					Static468.aClass288_250 = null;
					return true;
				} else {
					@Pc(673) Class2_Sub9 local673;
					if (Static452.aClass288_245 == Static468.aClass288_250) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8542();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
						local219 = Static53.aClass2_Sub22_Sub2_1.method8545();
						Static168.method2500();
						local673 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local211);
						if (local673 != null) {
							Static588.method8013(local673, false, local673.anInt2171 != local73);
						}
						Static389.method5232(local211, false, local219, local73);
						Static468.aClass288_250 = null;
						return true;
					} else if (Static468.aClass288_250 == Static7.aClass288_10) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8520();
						Static168.method2500();
						Static157.method7239(local211);
						Static468.aClass288_250 = null;
						return true;
					} else if (Static468.aClass288_250 == Static21.aClass288_18) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8520();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8494();
						Static168.method2500();
						Static131.method8466(local211, local73);
						Static468.aClass288_250 = null;
						return true;
					} else if (Static468.aClass288_250 == Static373.aClass288_205) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8547();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8527();
						local219 = Static53.aClass2_Sub22_Sub2_1.method8527();
						local223 = Static53.aClass2_Sub22_Sub2_1.method8527();
						local229 = Static53.aClass2_Sub22_Sub2_1.method8544() << 2;
						Static168.method2500();
						Static167.method2470(local229, local223, local219, local73, local211);
						Static468.aClass288_250 = null;
						return true;
					} else if (Static464.aClass288_248 == Static468.aClass288_250) {
						@Pc(782) String local782 = Static53.aClass2_Sub22_Sub2_1.method8549();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
						local527 = Static295.aClass362_2.method8112(local73).method3156(Static53.aClass2_Sub22_Sub2_1);
						Static150.method2241(0, local782, local527, local782, local782, local73, null, 19);
						Static468.aClass288_250 = null;
						return true;
					} else if (Static468.aClass288_250 == Static55.aClass288_41) {
						Static211.method2746(false);
						Static468.aClass288_250 = null;
						return false;
					} else if (Static468.aClass288_250 == Static469.aClass288_22) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8545();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8521();
						local219 = Static53.aClass2_Sub22_Sub2_1.method8547();
						local223 = Static53.aClass2_Sub22_Sub2_1.method8545();
						local229 = Static53.aClass2_Sub22_Sub2_1.method8545();
						Static168.method2500();
						Static85.aBooleanArray124[local211] = true;
						Static598.anIntArray663[local211] = local229;
						Static637.anIntArray694[local211] = local223;
						Static243.anIntArray271[local211] = local219;
						Static356.anIntArray402[local211] = local73;
						Static468.aClass288_250 = null;
						return true;
					} else if (Static491.aClass288_275 == Static468.aClass288_250) {
						Static124.anInt2182 = Static53.aClass2_Sub22_Sub2_1.method8547();
						for (local211 = 0; local211 < Static124.anInt2182; local211++) {
							Static214.aStringArray14[local211] = Static53.aClass2_Sub22_Sub2_1.method8549();
							Static55.aStringArray5[local211] = Static53.aClass2_Sub22_Sub2_1.method8549();
							if (Static55.aStringArray5[local211].equals("")) {
								Static55.aStringArray5[local211] = Static214.aStringArray14[local211];
							}
							Static594.aStringArray45[local211] = Static53.aClass2_Sub22_Sub2_1.method8549();
							Static198.aStringArray40[local211] = Static53.aClass2_Sub22_Sub2_1.method8549();
							if (Static198.aStringArray40[local211].equals("")) {
								Static198.aStringArray40[local211] = Static594.aStringArray45[local211];
							}
							Static240.aBooleanArray14[local211] = false;
						}
						Static111.anInt2031 = Static542.anInt8903;
						Static468.aClass288_250 = null;
						return true;
					} else if (Static58.aClass288_43 == Static468.aClass288_250) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8547();
						local73 = local211 >> 5;
						local219 = local211 & 0x1F;
						if (local219 == 0) {
							Static341.aClass372Array1[local73] = null;
							Static468.aClass288_250 = null;
							return true;
						}
						@Pc(974) Class372 local974 = new Class372();
						local974.anInt9971 = local219;
						local974.anInt9970 = Static53.aClass2_Sub22_Sub2_1.method8547();
						if (local974.anInt9970 >= 0 && Static564.aClass61Array14.length > local974.anInt9970) {
							if (local974.anInt9971 == 1 || local974.anInt9971 == 10) {
								local974.anInt9978 = Static53.aClass2_Sub22_Sub2_1.method8546();
								Static53.aClass2_Sub22_Sub2_1.anInt10247 += 6;
							} else if (local974.anInt9971 >= 2 && local974.anInt9971 <= 6) {
								if (local974.anInt9971 == 2) {
									local974.anInt9975 = 256;
									local974.anInt9972 = 256;
								}
								if (local974.anInt9971 == 3) {
									local974.anInt9975 = 256;
									local974.anInt9972 = 0;
								}
								if (local974.anInt9971 == 4) {
									local974.anInt9972 = 512;
									local974.anInt9975 = 256;
								}
								if (local974.anInt9971 == 5) {
									local974.anInt9972 = 256;
									local974.anInt9975 = 0;
								}
								if (local974.anInt9971 == 6) {
									local974.anInt9975 = 512;
									local974.anInt9972 = 256;
								}
								local974.anInt9971 = 2;
								local974.anInt9976 = Static53.aClass2_Sub22_Sub2_1.method8547();
								local974.anInt9972 += Static53.aClass2_Sub22_Sub2_1.method8546() - Static132.anInt2246 << 9;
								local974.anInt9975 += Static53.aClass2_Sub22_Sub2_1.method8546() - Static123.anInt2176 << 9;
								local974.anInt9969 = Static53.aClass2_Sub22_Sub2_1.method8547() << 2;
								local974.anInt9967 = Static53.aClass2_Sub22_Sub2_1.method8546();
							}
							local974.anInt9979 = Static53.aClass2_Sub22_Sub2_1.method8546();
							if (local974.anInt9979 == 65535) {
								local974.anInt9979 = -1;
							}
							Static341.aClass372Array1[local73] = local974;
						}
						Static468.aClass288_250 = null;
						return true;
					} else if (Static520.aClass288_289 == Static468.aClass288_250) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8497();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8497();
						local219 = Static53.aClass2_Sub22_Sub2_1.method8544();
						Static168.method2500();
						if (local219 == 65535) {
							local219 = -1;
						}
						Static81.method1115(local73, local211, local219);
						@Pc(1188) Class34 local1188 = Static72.aClass225_2.method4789(local219);
						Static463.method6283(local1188.anInt885, local1188.anInt855, local1188.anInt893, local73);
						Static155.method2312(local1188.anInt892, local1188.anInt854, local73, local1188.anInt878);
						Static468.aClass288_250 = null;
						return true;
					} else if (Static548.aClass288_302 == Static468.aClass288_250) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8546();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
						local219 = Static53.aClass2_Sub22_Sub2_1.method8546();
						Static168.method2500();
						if (Static559.aClass261ArrayArray2[local211] != null) {
							for (local223 = local73; local223 < local219; local223++) {
								local229 = Static53.aClass2_Sub22_Sub2_1.method8539();
								if (local223 < Static559.aClass261ArrayArray2[local211].length && Static559.aClass261ArrayArray2[local211][local223] != null) {
									Static559.aClass261ArrayArray2[local211][local223].anInt6652 = local229;
								}
							}
						}
						Static468.aClass288_250 = null;
						return true;
					} else if (Static468.aClass288_250 == Static562.aClass288_310) {
						Static356.aString65 = Static84.anInt1498 <= 2 ? Static434.aClass271_26.method5972(Static483.anInt7694) : Static53.aClass2_Sub22_Sub2_1.method8549();
						Static480.anInt10368 = Static84.anInt1498 <= 0 ? -1 : Static53.aClass2_Sub22_Sub2_1.method8546();
						Static468.aClass288_250 = null;
						if (Static480.anInt10368 == 65535) {
							Static480.anInt10368 = -1;
						}
						return true;
					} else if (Static468.aClass288_250 == Static344.aClass288_190) {
						local211 = Static53.aClass2_Sub22_Sub2_1.method8520();
						local73 = Static53.aClass2_Sub22_Sub2_1.method8542();
						Static168.method2500();
						Static439.method6024(local211, local73);
						Static468.aClass288_250 = null;
						return true;
					} else {
						@Pc(1373) Class2_Sub41 local1373;
						if (Static468.aClass288_250 == Static262.aClass288_193) {
							local211 = Static53.aClass2_Sub22_Sub2_1.method8546();
							if (local211 == 65535) {
								local211 = -1;
							}
							local73 = Static53.aClass2_Sub22_Sub2_1.method8544();
							if (local73 == 65535) {
								local73 = -1;
							}
							local219 = Static53.aClass2_Sub22_Sub2_1.method8542();
							local223 = Static53.aClass2_Sub22_Sub2_1.method8497();
							Static168.method2500();
							for (local229 = local211; local229 <= local73; local229++) {
								@Pc(1367) long local1367 = (long) local229 + ((long) local219 << 32);
								local1373 = (Class2_Sub41) Static247.aClass118_22.method2595(local1367);
								@Pc(1382) Class2_Sub41 local1382;
								if (local1373 != null) {
									local1382 = new Class2_Sub41(local223, local1373.anInt8112);
									local1373.method8653();
								} else if (local229 == -1) {
									local1382 = new Class2_Sub41(local223, Static357.method4826(local219).aClass2_Sub41_2.anInt8112);
								} else {
									local1382 = new Class2_Sub41(local223, -1);
								}
								Static247.aClass118_22.method2601(local1382, local1367);
							}
							Static468.aClass288_250 = null;
							return true;
						} else if (Static468.aClass288_250 == Static293.aClass288_166) {
							local211 = Static53.aClass2_Sub22_Sub2_1.method8520();
							local525 = Static53.aClass2_Sub22_Sub2_1.method8549();
							Static168.method2500();
							Static493.method6854(local211, local525);
							Static468.aClass288_250 = null;
							return true;
						} else if (Static576.aClass288_322 == Static468.aClass288_250) {
							Static230.method3181(Static137.aClass168_3);
							Static468.aClass288_250 = null;
							return true;
						} else if (Static554.aClass288_304 == Static468.aClass288_250) {
							local211 = Static53.aClass2_Sub22_Sub2_1.method8542();
							local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
							Static168.method2500();
							if (local73 == 65535) {
								local73 = -1;
							}
							Static571.method7829(local73, local211);
							Static468.aClass288_250 = null;
							return true;
						} else if (Static468.aClass288_250 == Static296.aClass288_168) {
							Static230.method3181(Static476.aClass168_11);
							Static468.aClass288_250 = null;
							return true;
						} else if (Static468.aClass288_250 == Static32.aClass288_28) {
							Static230.method3181(Static392.aClass168_10);
							Static468.aClass288_250 = null;
							return true;
						} else if (Static46.aClass288_36 == Static468.aClass288_250) {
							local211 = Static53.aClass2_Sub22_Sub2_1.method8546();
							if (local211 == 65535) {
								local211 = -1;
							}
							local73 = Static53.aClass2_Sub22_Sub2_1.method8547();
							local219 = Static53.aClass2_Sub22_Sub2_1.method8546();
							local223 = Static53.aClass2_Sub22_Sub2_1.method8547();
							local229 = Static53.aClass2_Sub22_Sub2_1.method8546();
							Static305.method4186(local219, false, local211, local229, local73, local223);
							Static468.aClass288_250 = null;
							return true;
						} else if (Static638.aClass288_268 == Static468.aClass288_250) {
							@Pc(1555) byte local1555 = Static53.aClass2_Sub22_Sub2_1.method8499();
							local73 = Static53.aClass2_Sub22_Sub2_1.method8544();
							Static431.aClass205_1.method4255(local1555, local73);
							Static468.aClass288_250 = null;
							return true;
						} else if (Static468.aClass288_250 == Static56.aClass288_185) {
							Static429.anInt6738 = Static53.aClass2_Sub22_Sub2_1.method8503();
							Static416.aBoolean461 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
							Static468.aClass288_250 = null;
							return true;
						} else {
							@Pc(1882) String local1882;
							@Pc(1622) String local1622;
							@Pc(1643) int local1643;
							if (Static430.aClass288_284 == Static468.aClass288_250) {
								@Pc(1681) boolean local1681;
								while (Static84.anInt1498 > Static53.aClass2_Sub22_Sub2_1.anInt10247) {
									local291 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
									local525 = Static53.aClass2_Sub22_Sub2_1.method8549();
									local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
									local223 = Static53.aClass2_Sub22_Sub2_1.method8546();
									local229 = Static53.aClass2_Sub22_Sub2_1.method8547();
									local1622 = "";
									local426 = false;
									if (local223 > 0) {
										local1622 = Static53.aClass2_Sub22_Sub2_1.method8549();
										local426 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
									}
									for (local1643 = 0; local1643 < Static352.anInt5497; local1643++) {
										if (local291) {
											if (local527.equals(Static213.aStringArray13[local1643])) {
												Static213.aStringArray13[local1643] = local525;
												local525 = null;
												Static565.aStringArray44[local1643] = local527;
												break;
											}
										} else if (local525.equals(Static213.aStringArray13[local1643])) {
											if (local223 != Static320.anIntArray351[local1643]) {
												local1681 = true;
												for (@Pc(1686) Class13_Sub3_Sub1 local1686 = (Class13_Sub3_Sub1) Static121.aClass171_2.method3745(); local1686 != null; local1686 = (Class13_Sub3_Sub1) Static121.aClass171_2.method3744()) {
													if (local1686.aString15.equals(local525)) {
														if (local223 != 0 && local1686.aShort25 == 0) {
															local1686.method8394();
															local1681 = false;
														} else if (local223 == 0 && local1686.aShort25 != 0) {
															local1686.method8394();
															local1681 = false;
														}
													}
												}
												if (local1681) {
													Static121.aClass171_2.method3746(new Class13_Sub3_Sub1(local525, local223));
												}
												Static320.anIntArray351[local1643] = local223;
											}
											Static565.aStringArray44[local1643] = local527;
											Static564.aStringArray43[local1643] = local1622;
											Static167.anIntArray196[local1643] = local229;
											Static146.aBooleanArray42[local1643] = local426;
											local525 = null;
											break;
										}
									}
									if (local525 != null && Static352.anInt5497 < 200) {
										Static213.aStringArray13[Static352.anInt5497] = local525;
										Static565.aStringArray44[Static352.anInt5497] = local527;
										Static320.anIntArray351[Static352.anInt5497] = local223;
										Static564.aStringArray43[Static352.anInt5497] = local1622;
										Static167.anIntArray196[Static352.anInt5497] = local229;
										Static146.aBooleanArray42[Static352.anInt5497] = local426;
										Static352.anInt5497++;
									}
								}
								Static641.anInt10324 = 2;
								Static111.anInt2031 = Static542.anInt8903;
								local73 = Static352.anInt5497;
								while (local73 > 0) {
									local291 = true;
									local73--;
									for (local219 = 0; local219 < local73; local219++) {
										if (Static216.aClass326_9.anInt8758 != Static320.anIntArray351[local219] && Static216.aClass326_9.anInt8758 == Static320.anIntArray351[local219 + 1] || Static320.anIntArray351[local219] == 0 && Static320.anIntArray351[local219 + 1] != 0) {
											local223 = Static320.anIntArray351[local219];
											Static320.anIntArray351[local219] = Static320.anIntArray351[local219 + 1];
											Static320.anIntArray351[local219 + 1] = local223;
											local1882 = Static564.aStringArray43[local219];
											Static564.aStringArray43[local219] = Static564.aStringArray43[local219 + 1];
											Static564.aStringArray43[local219 + 1] = local1882;
											local1622 = Static213.aStringArray13[local219];
											Static213.aStringArray13[local219] = Static213.aStringArray13[local219 + 1];
											Static213.aStringArray13[local219 + 1] = local1622;
											local569 = Static565.aStringArray44[local219];
											Static565.aStringArray44[local219] = Static565.aStringArray44[local219 + 1];
											Static565.aStringArray44[local219 + 1] = local569;
											local1643 = Static167.anIntArray196[local219];
											Static167.anIntArray196[local219] = Static167.anIntArray196[local219 + 1];
											Static167.anIntArray196[local219 + 1] = local1643;
											local1681 = Static146.aBooleanArray42[local219];
											Static146.aBooleanArray42[local219] = Static146.aBooleanArray42[local219 + 1];
											Static146.aBooleanArray42[local219 + 1] = local1681;
											local291 = false;
										}
									}
									if (local291) {
										break;
									}
								}
								Static468.aClass288_250 = null;
								return true;
							} else if (Static468.aClass288_250 == Static508.aClass288_285) {
								Static230.method3181(Static4.aClass168_1);
								Static468.aClass288_250 = null;
								return true;
							} else if (Static619.aClass288_347 == Static468.aClass288_250) {
								Static307.anInt4957 = Static53.aClass2_Sub22_Sub2_1.method8525() << 3;
								Static258.anInt4069 = Static53.aClass2_Sub22_Sub2_1.method8491() << 3;
								Static170.anInt9508 = Static53.aClass2_Sub22_Sub2_1.method8496();
								while (Static84.anInt1498 > Static53.aClass2_Sub22_Sub2_1.anInt10247) {
									@Pc(2022) Class168 local2022 = Static616.method8276()[Static53.aClass2_Sub22_Sub2_1.method8547()];
									Static230.method3181(local2022);
								}
								Static468.aClass288_250 = null;
								return true;
							} else if (Static238.aClass288_144 == Static468.aClass288_250) {
								local211 = Static53.aClass2_Sub22_Sub2_1.method8547();
								if (Static53.aClass2_Sub22_Sub2_1.method8547() == 0) {
									Static81.aClass36Array1[local211] = new Class36();
								} else {
									Static53.aClass2_Sub22_Sub2_1.anInt10247--;
									Static81.aClass36Array1[local211] = new Class36(Static53.aClass2_Sub22_Sub2_1);
								}
								Static55.anInt1108 = Static542.anInt8903;
								Static468.aClass288_250 = null;
								return true;
							} else if (Static468.aClass288_250 == Static483.aClass288_263) {
								Static232.method3186();
								Static468.aClass288_250 = null;
								return false;
							} else {
								@Pc(2109) String local2109;
								if (Static69.aClass288_45 == Static468.aClass288_250) {
									local211 = Static53.aClass2_Sub22_Sub2_1.method8496();
									local73 = Static53.aClass2_Sub22_Sub2_1.method8527();
									local219 = Static53.aClass2_Sub22_Sub2_1.method8544();
									if (local219 == 65535) {
										local219 = -1;
									}
									local2109 = Static53.aClass2_Sub22_Sub2_1.method8549();
									if (local73 >= 1 && local73 <= 8) {
										if (local2109.equalsIgnoreCase("null")) {
											local2109 = null;
										}
										Static634.aStringArray47[local73 - 1] = local2109;
										Static614.anIntArray679[local73 - 1] = local219;
										Static50.aBooleanArray22[local73 - 1] = local211 == 0;
									}
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static297.aClass288_170) {
									Static230.method3181(Static259.aClass168_7);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static429.aClass288_233) {
									Static128.method1809();
									Static468.aClass288_250 = null;
									return false;
								} else if (Static198.aClass288_283 == Static468.aClass288_250) {
									Static211.method2746(Static427.aBoolean500);
									Static468.aClass288_250 = null;
									return false;
								} else if (Static468.aClass288_250 == Static471.aClass288_253) {
									if (Static155.method2317(Static324.anInt5145)) {
										Static363.anInt5740 = (int) ((float) Static53.aClass2_Sub22_Sub2_1.method8546() * 2.5F);
									} else {
										Static363.anInt5740 = Static53.aClass2_Sub22_Sub2_1.method8546() * 30;
									}
									Static468.aClass288_250 = null;
									Static369.anInt5832 = Static542.anInt8903;
									return true;
								} else if (Static159.aClass288_101 == Static468.aClass288_250) {
									Static563.aClass45_4 = Static293.method4046(Static53.aClass2_Sub22_Sub2_1.method8547());
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static89.aClass288_260) {
									Static168.method2500();
									Static204.method2871();
									Static468.aClass288_250 = null;
									return true;
								} else if (Static256.aClass288_149 == Static468.aClass288_250) {
									Static53.aClass2_Sub22_Sub2_1.anInt10247 += 28;
									if (Static53.aClass2_Sub22_Sub2_1.method8504()) {
										Static567.method7770(Static53.aClass2_Sub22_Sub2_1, Static53.aClass2_Sub22_Sub2_1.anInt10247 - 28);
									}
									Static468.aClass288_250 = null;
									return true;
								} else if (Static491.aClass288_276 == Static468.aClass288_250) {
									if (Static298.aFrame3 != null) {
										Static424.method5664(false, -1, -1, Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437());
									}
									@Pc(2276) byte[] local2276 = new byte[Static84.anInt1498];
									Static53.aClass2_Sub22_Sub2_1.method8564(local2276, Static84.anInt1498);
									local525 = Static131.method8468(0, local2276, Static84.anInt1498);
									Static407.method7597(Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 1, true, local525, Static452.aClass226_6);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static239.aClass288_146) {
									local291 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
									local525 = Static53.aClass2_Sub22_Sub2_1.method8549();
									local527 = local525;
									if (local291) {
										local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
									}
									local223 = Static53.aClass2_Sub22_Sub2_1.method8547();
									@Pc(2338) boolean local2338 = false;
									if (local223 <= 1) {
										if (Static416.aBoolean461 && !Static463.aBoolean554 || Static32.aBoolean58) {
											local2338 = true;
										} else if (local223 <= 1 && Static260.method3557(local527)) {
											local2338 = true;
										}
									}
									if (!local2338 && Static71.anInt1258 == 0) {
										local1622 = Static645.method8270(Static602.method8117(Static53.aClass2_Sub22_Sub2_1));
										if (local223 == 2) {
											Static150.method2241(0, local525, local1622, "<img=1>" + local527, "<img=1>" + local525, -1, null, 24);
										} else if (local223 == 1) {
											Static150.method2241(0, local525, local1622, "<img=0>" + local527, "<img=0>" + local525, -1, null, 24);
										} else {
											Static150.method2241(0, local525, local1622, local527, local525, -1, null, 24);
										}
									}
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static77.aClass288_138) {
									Static431.aClass205_1.method4262();
									Static245.anInt3947 += 32;
									Static468.aClass288_250 = null;
									return true;
								} else if (Static236.aClass288_140 == Static468.aClass288_250) {
									Static583.method7948(Static53.aClass2_Sub22_Sub2_1, Static84.anInt1498, Static452.aClass226_6);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static628.aClass288_353 == Static468.aClass288_250) {
									local73 = Static53.aClass2_Sub22_Sub2_1.method8555();
									local219 = Static53.aClass2_Sub22_Sub2_1.method8520();
									if (local219 == 65535) {
										local219 = -1;
									}
									Static168.method2500();
									Static625.method8365(1, local73, local219, -1);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static265.aClass288_157 == Static468.aClass288_250) {
									local73 = Static53.aClass2_Sub22_Sub2_1.method8496();
									local219 = Static53.aClass2_Sub22_Sub2_1.method8546();
									Static168.method2500();
									Static59.method903(local219, local73, true);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static2.aClass288_7 == Static468.aClass288_250) {
									Static39.method626(Static53.aClass2_Sub22_Sub2_1.method8549());
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static223.aClass288_132) {
									Static230.method3181(Static548.aClass168_12);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static94.aClass288_61 == Static468.aClass288_250) {
									local73 = Static53.aClass2_Sub22_Sub2_1.method8496();
									local219 = Static53.aClass2_Sub22_Sub2_1.method8547();
									if (local73 == 255) {
										local73 = -1;
										local219 = -1;
									}
									Static181.method2644(local219, local73);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static639.aClass288_359) {
									local73 = Static53.aClass2_Sub22_Sub2_1.method8542();
									Static168.method2500();
									if (local73 == -1) {
										Static12.anInt159 = -1;
										Static8.anInt107 = -1;
									} else {
										local219 = local73 >> 14 & 0x3FFF;
										local219 -= Static132.anInt2246;
										local223 = local73 & 0x3FFF;
										local223 -= Static123.anInt2176;
										if (local219 < 0) {
											local219 = 0;
										} else if (local219 >= Static228.anInt3704) {
											local219 = Static228.anInt3704;
										}
										if (local223 < 0) {
											local223 = 0;
										} else if (local223 >= Static162.anInt2911) {
											local223 = Static162.anInt2911;
										}
										Static8.anInt107 = (local219 << 9) + 256;
										Static12.anInt159 = (local223 << 9) + 256;
									}
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static206.aClass288_127) {
									local73 = Static53.aClass2_Sub22_Sub2_1.method8497();
									local219 = Static53.aClass2_Sub22_Sub2_1.method8527();
									Static168.method2500();
									Static164.method2460(local73, local219);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static174.aClass288_108) {
									Static468.aClass288_250 = null;
									return false;
								} else if (Static8.aClass288_11 == Static468.aClass288_250) {
									Static230.method3181(Static554.aClass168_14);
									Static468.aClass288_250 = null;
									return true;
								} else if (Static468.aClass288_250 == Static342.aClass288_189) {
									Static168.method2500();
									Static216.method6829();
									Static468.aClass288_250 = null;
									return true;
								} else {
									@Pc(2733) int local2733;
									if (Static639.aClass288_358 == Static468.aClass288_250) {
										local73 = Static53.aClass2_Sub22_Sub2_1.method8496();
										local219 = local73 >> 2;
										local223 = local73 & 0x3;
										local229 = Static588.anIntArray654[local219];
										local327 = Static53.aClass2_Sub22_Sub2_1.method8542();
										local2733 = local327 >> 28 & 0x3;
										local1643 = local327 >> 14 & 0x3FFF;
										local422 = local327 & 0x3FFF;
										local429 = Static53.aClass2_Sub22_Sub2_1.method8521();
										if (local429 == 65535) {
											local429 = -1;
										}
										local422 -= Static123.anInt2176;
										local1643 -= Static132.anInt2246;
										Static408.method5478(local229, local2733, local1643, local219, local429, local223, local422);
										Static468.aClass288_250 = null;
										return true;
									} else if (Static468.aClass288_250 == Static129.aClass288_301) {
										local73 = Static53.aClass2_Sub22_Sub2_1.method8520();
										@Pc(2785) int[] local2785 = new int[4];
										for (local223 = 0; local223 < 4; local223++) {
											local2785[local223] = Static53.aClass2_Sub22_Sub2_1.method8520();
										}
										local229 = Static53.aClass2_Sub22_Sub2_1.method8527();
										@Pc(2812) Class2_Sub43 local2812 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local73);
										if (local2812 != null) {
											Static337.method7188(local2812.aClass13_Sub1_Sub1_Sub1_Sub1_2, local2785, local229);
										}
										Static468.aClass288_250 = null;
										return true;
									} else {
										@Pc(2876) int local2876;
										@Pc(2852) long local2852;
										@Pc(2857) long local2857;
										@Pc(2836) boolean local2836;
										@Pc(2866) int local2866;
										@Pc(2862) long local2862;
										if (Static503.aClass288_280 == Static468.aClass288_250) {
											local2836 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
											local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
											local2109 = local527;
											if (local2836) {
												local2109 = Static53.aClass2_Sub22_Sub2_1.method8549();
											}
											local2852 = Static53.aClass2_Sub22_Sub2_1.method8506();
											local2857 = Static53.aClass2_Sub22_Sub2_1.method8546();
											local2862 = Static53.aClass2_Sub22_Sub2_1.method8539();
											local2866 = Static53.aClass2_Sub22_Sub2_1.method8547();
											@Pc(2872) long local2872 = local2862 + (local2857 << 32);
											@Pc(2874) boolean local2874 = false;
											local2876 = 0;
											while (true) {
												if (local2876 >= 100) {
													if (local2866 <= 1) {
														if (Static416.aBoolean461 && !Static463.aBoolean554 || Static32.aBoolean58) {
															local2874 = true;
														} else if (Static260.method3557(local2109)) {
															local2874 = true;
														}
													}
													break;
												}
												if (local2872 == Static131.aLongArray55[local2876]) {
													local2874 = true;
													break;
												}
												local2876++;
											}
											if (!local2874 && Static71.anInt1258 == 0) {
												Static131.aLongArray55[Static101.anInt1893] = local2872;
												Static101.anInt1893 = (Static101.anInt1893 + 1) % 100;
												@Pc(2934) String local2934 = Static645.method8270(Static602.method8117(Static53.aClass2_Sub22_Sub2_1));
												if (local2866 == 2 || local2866 == 3) {
													Static150.method2241(0, local527, local2934, "<img=1>" + local2109, "<img=1>" + local527, -1, Static605.method8155(local2852), 9);
												} else if (local2866 == 1) {
													Static150.method2241(0, local527, local2934, "<img=0>" + local2109, "<img=0>" + local527, -1, Static605.method8155(local2852), 9);
												} else {
													Static150.method2241(0, local527, local2934, local2109, local527, -1, Static605.method8155(local2852), 9);
												}
											}
											Static468.aClass288_250 = null;
											return true;
										} else if (Static468.aClass288_250 == Static101.aClass288_66) {
											Static370.anInt5838 = Static53.aClass2_Sub22_Sub2_1.method8526();
											Static369.anInt5832 = Static542.anInt8903;
											Static468.aClass288_250 = null;
											return true;
										} else if (Static468.aClass288_250 == Static486.aClass288_271) {
											local73 = Static53.aClass2_Sub22_Sub2_1.method8545();
											Static168.method2500();
											Static271.anInt4365 = local73;
											Static468.aClass288_250 = null;
											return true;
										} else {
											@Pc(3088) int local3088;
											@Pc(3098) int local3098;
											if (Static468.aClass288_250 == Static506.aClass288_281) {
												local2836 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
												local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
												local2109 = local527;
												if (local2836) {
													local2109 = Static53.aClass2_Sub22_Sub2_1.method8549();
												}
												local2852 = Static53.aClass2_Sub22_Sub2_1.method8506();
												local2857 = Static53.aClass2_Sub22_Sub2_1.method8546();
												local2862 = Static53.aClass2_Sub22_Sub2_1.method8539();
												local2866 = Static53.aClass2_Sub22_Sub2_1.method8547();
												local3088 = Static53.aClass2_Sub22_Sub2_1.method8546();
												@Pc(3094) long local3094 = local2862 + (local2857 << 32);
												@Pc(3096) boolean local3096 = false;
												local3098 = 0;
												while (true) {
													if (local3098 >= 100) {
														if (local2866 <= 1 && Static260.method3557(local2109)) {
															local3096 = true;
														}
														break;
													}
													if (Static131.aLongArray55[local3098] == local3094) {
														local3096 = true;
														break;
													}
													local3098++;
												}
												if (!local3096 && Static71.anInt1258 == 0) {
													Static131.aLongArray55[Static101.anInt1893] = local3094;
													Static101.anInt1893 = (Static101.anInt1893 + 1) % 100;
													@Pc(3149) String local3149 = Static295.aClass362_2.method8112(local3088).method3156(Static53.aClass2_Sub22_Sub2_1);
													if (local2866 == 2) {
														Static150.method2241(0, local527, local3149, "<img=1>" + local2109, "<img=1>" + local527, local3088, Static605.method8155(local2852), 20);
													} else if (local2866 == 1) {
														Static150.method2241(0, local527, local3149, "<img=0>" + local2109, "<img=0>" + local527, local3088, Static605.method8155(local2852), 20);
													} else {
														Static150.method2241(0, local527, local3149, local2109, local527, local3088, Static605.method8155(local2852), 20);
													}
												}
												Static468.aClass288_250 = null;
												return true;
											} else if (Static573.aClass288_320 == Static468.aClass288_250) {
												local73 = Static53.aClass2_Sub22_Sub2_1.method8545();
												local219 = Static53.aClass2_Sub22_Sub2_1.method8494();
												local223 = Static53.aClass2_Sub22_Sub2_1.method8547();
												Static225.anIntArray250[local223] = local219;
												Static448.anIntArray510[local223] = local73;
												Static7.anIntArray31[local223] = 1;
												local229 = Static19.anIntArray55[local223] - 1;
												for (local327 = 0; local327 < local229; local327++) {
													if (Class163.anIntArray277[local327] <= local219) {
														Static7.anIntArray31[local223] = local327 + 2;
													}
												}
												Static559.anIntArray625[Static518.anInt8602++ & 0x1F] = local223;
												Static468.aClass288_250 = null;
												return true;
											} else if (Static468.aClass288_250 == Static202.aClass288_124) {
												Static502.anInt2999 = Static53.aClass2_Sub22_Sub2_1.method8547();
												Static468.aClass288_250 = null;
												return true;
											} else if (Static468.aClass288_250 == Static521.aClass288_290) {
												local525 = Static53.aClass2_Sub22_Sub2_1.method8549();
												local527 = Static645.method8270(Static602.method8117(Static53.aClass2_Sub22_Sub2_1));
												Static443.method6042(local525, 0, local525, local527, local525, 6);
												Static468.aClass288_250 = null;
												return true;
											} else if (Static301.aClass288_174 == Static468.aClass288_250) {
												local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
												local219 = Static53.aClass2_Sub22_Sub2_1.method8520();
												local223 = Static53.aClass2_Sub22_Sub2_1.method8521();
												local229 = Static53.aClass2_Sub22_Sub2_1.method8494();
												Static168.method2500();
												Static625.method8365(7, local229, local223 | local219 << 16, local73);
												Static468.aClass288_250 = null;
												return true;
											} else if (Static468.aClass288_250 == Static175.aClass288_109) {
												for (local73 = 0; local73 < Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1.length; local73++) {
													if (Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local73] != null) {
														Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local73].anIntArray300 = null;
														Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local73].anInt4559 = -1;
													}
												}
												for (local219 = 0; local219 < Static645.anInt9916; local219++) {
													Static38.aClass2_Sub43Array1[local219].aClass13_Sub1_Sub1_Sub1_Sub1_2.anIntArray300 = null;
													Static38.aClass2_Sub43Array1[local219].aClass13_Sub1_Sub1_Sub1_Sub1_2.anInt4559 = -1;
												}
												Static468.aClass288_250 = null;
												return true;
											} else {
												@Pc(3521) String local3521;
												if (Static163.aClass288_106 == Static468.aClass288_250) {
													local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
													@Pc(3443) Class13_Sub1_Sub1_Sub1_Sub2 local3443;
													if (Static528.anInt8672 == local73) {
														local3443 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1;
													} else {
														local3443 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local73];
													}
													if (local3443 == null) {
														Static468.aClass288_250 = null;
														return true;
													}
													local223 = Static53.aClass2_Sub22_Sub2_1.method8546();
													local229 = Static53.aClass2_Sub22_Sub2_1.method8547();
													local543 = (local223 & 0x8000) != 0;
													if (local3443.aString50 != null && local3443.aClass218_1 != null) {
														local426 = false;
														if (local229 <= 1) {
															if (!local543 && (Static416.aBoolean461 && !Static463.aBoolean554 || Static32.aBoolean58)) {
																local426 = true;
															} else if (Static260.method3557(local3443.aString50)) {
																local426 = true;
															}
														}
														if (!local426 && Static71.anInt1258 == 0) {
															local422 = -1;
															if (local543) {
																local223 &= 0x7FFF;
																@Pc(3531) Class379 local3531 = Static448.method6101(Static53.aClass2_Sub22_Sub2_1);
																local422 = local3531.anInt10329;
																local3521 = local3531.aClass2_Sub2_Sub10_1.method3156(Static53.aClass2_Sub22_Sub2_1);
															} else {
																local3521 = Static645.method8270(Static602.method8117(Static53.aClass2_Sub22_Sub2_1));
															}
															local3443.aString48 = local3521.trim();
															local3443.anInt4576 = 150;
															local3443.anInt4587 = local223 & 0xFF;
															local3443.anInt4583 = local223 >> 8;
															if (local229 == 1 || local229 == 2) {
																local429 = local543 ? 17 : 1;
															} else {
																local429 = local543 ? 17 : 2;
															}
															if (local229 == 2) {
																Static150.method2241(0, local3443.aString49, local3521, "<img=1>" + local3443.method3978(), "<img=1>" + local3443.method3977(), local422, null, local429);
															} else if (local229 == 1) {
																Static150.method2241(0, local3443.aString49, local3521, "<img=0>" + local3443.method3978(), "<img=0>" + local3443.method3977(), local422, null, local429);
															} else {
																Static150.method2241(0, local3443.aString49, local3521, local3443.method3978(), local3443.method3977(), local422, null, local429);
															}
														}
													}
													Static468.aClass288_250 = null;
													return true;
												} else if (Static468.aClass288_250 == Static197.aClass288_123) {
													local73 = Static53.aClass2_Sub22_Sub2_1.method8544();
													local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
													Static168.method2500();
													Static493.method6854(local73, local527);
													Static468.aClass288_250 = null;
													return true;
												} else if (Static468.aClass288_250 == Static532.aClass288_295) {
													Static230.method3181(Static204.aClass168_6);
													Static468.aClass288_250 = null;
													return true;
												} else {
													@Pc(3709) byte local3709;
													if (Static407.aClass288_303 == Static468.aClass288_250) {
														local3709 = Static53.aClass2_Sub22_Sub2_1.method8525();
														local219 = Static53.aClass2_Sub22_Sub2_1.method8496();
														Static168.method2500();
														Static398.method5441(local3709, local219);
														Static468.aClass288_250 = null;
														return true;
													} else if (Static235.aClass288_139 == Static468.aClass288_250) {
														local73 = Static53.aClass2_Sub22_Sub2_1.method8542();
														local219 = Static53.aClass2_Sub22_Sub2_1.method8555();
														local223 = Static53.aClass2_Sub22_Sub2_1.method8544();
														Static168.method2500();
														Static625.method8365(5, local73, local223, local219);
														Static468.aClass288_250 = null;
														return true;
													} else if (Static468.aClass288_250 == Static606.aClass288_337) {
														Static230.method3181(Static184.aClass168_5);
														Static468.aClass288_250 = null;
														return true;
													} else if (Static299.aClass288_172 == Static468.aClass288_250) {
														local73 = Static53.aClass2_Sub22_Sub2_1.method8521();
														local219 = Static53.aClass2_Sub22_Sub2_1.method8555();
														Static431.aClass205_1.method4255(local219, local73);
														Static468.aClass288_250 = null;
														return true;
													} else if (Static481.aClass288_261 == Static468.aClass288_250) {
														Static307.anInt4957 = Static53.aClass2_Sub22_Sub2_1.method8499() << 3;
														Static170.anInt9508 = Static53.aClass2_Sub22_Sub2_1.method8547();
														Static258.anInt4069 = Static53.aClass2_Sub22_Sub2_1.method8525() << 3;
														for (@Pc(3806) Class2_Sub11 local3806 = (Class2_Sub11) Static41.aClass118_6.method2596(); local3806 != null; local3806 = (Class2_Sub11) Static41.aClass118_6.method2597()) {
															local219 = (int) (local3806.aLong280 >> 28 & 0x3L);
															local223 = (int) (local3806.aLong280 & 0x3FFFL);
															local229 = local223 - Static132.anInt2246;
															local327 = (int) (local3806.aLong280 >> 14 & 0x3FFFL);
															local2733 = local327 - Static123.anInt2176;
															if (local219 == Static170.anInt9508 && Static258.anInt4069 <= local229 && Static258.anInt4069 + 8 > local229 && local2733 >= Static307.anInt4957 && local2733 < Static307.anInt4957 + 8) {
																local3806.method8653();
																if (local229 >= 0 && local2733 >= 0 && local229 < Static228.anInt3704 && Static162.anInt2911 > local2733) {
																	Static185.method2704(local2733, local229, Static170.anInt9508);
																}
															}
														}
														for (@Pc(3903) Class2_Sub52 local3903 = (Class2_Sub52) Static212.aClass109_28.method2325(); local3903 != null; local3903 = (Class2_Sub52) Static212.aClass109_28.method2318()) {
															if (Static258.anInt4069 <= local3903.anInt9843 && Static258.anInt4069 + 8 > local3903.anInt9843 && local3903.anInt9838 >= Static307.anInt4957 && Static307.anInt4957 + 8 > local3903.anInt9838 && local3903.anInt9836 == Static170.anInt9508) {
																local3903.anInt9842 = 0;
															}
														}
														Static468.aClass288_250 = null;
														return true;
													} else if (Static446.aClass288_305 == Static468.aClass288_250) {
														local525 = Static53.aClass2_Sub22_Sub2_1.method8549();
														@Pc(3964) Object[] local3964 = new Object[local525.length() + 1];
														for (local223 = local525.length() - 1; local223 >= 0; local223--) {
															if (local525.charAt(local223) == 's') {
																local3964[local223 + 1] = Static53.aClass2_Sub22_Sub2_1.method8549();
															} else {
																local3964[local223 + 1] = Integer.valueOf(Static53.aClass2_Sub22_Sub2_1.method8542());
															}
														}
														local3964[0] = Integer.valueOf(Static53.aClass2_Sub22_Sub2_1.method8542());
														Static168.method2500();
														@Pc(4021) Class2_Sub46 local4021 = new Class2_Sub46();
														local4021.anObjectArray32 = local3964;
														Static300.method4138(local4021);
														Static468.aClass288_250 = null;
														return true;
													} else {
														@Pc(4502) boolean local4502;
														@Pc(4216) boolean local4216;
														@Pc(4143) int local4143;
														@Pc(4137) int local4137;
														if (Static468.aClass288_250 == Static64.aClass288_44) {
															local73 = Static53.aClass2_Sub22_Sub2_1.method8520();
															local219 = Static53.aClass2_Sub22_Sub2_1.method8521();
															local223 = Static53.aClass2_Sub22_Sub2_1.method8497();
															local229 = Static53.aClass2_Sub22_Sub2_1.method8521();
															local327 = Static53.aClass2_Sub22_Sub2_1.method8545();
															local426 = (local327 & 0x80) != 0;
															local1643 = local327 & 0x7;
															local422 = local327 >> 3 & 0xF;
															if (local422 == 15) {
																local422 = -1;
															}
															if (local223 >> 30 == 0) {
																@Pc(4307) Class81 local4307;
																@Pc(4242) Class39 local4242;
																@Pc(4256) Class81 local4256;
																if (local223 >> 29 != 0) {
																	local429 = local223 & 0xFFFF;
																	@Pc(4202) Class2_Sub43 local4202 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local429);
																	if (local4202 != null) {
																		if (local229 == 65535) {
																			local229 = -1;
																		}
																		@Pc(4214) Class13_Sub1_Sub1_Sub1_Sub1 local4214 = local4202.aClass13_Sub1_Sub1_Sub1_Sub1_2;
																		local4216 = true;
																		local4143 = local426 ? local4214.anInt4624 : local4214.anInt4556;
																		if (local229 != -1 && local4143 != -1) {
																			if (local4143 == local229) {
																				local4242 = Static460.aClass155_2.method3363(local229);
																				if (local4242.aBoolean74 && local4242.anInt1044 != -1) {
																					local4256 = Static540.aClass173_2.method3791(local4242.anInt1044);
																					@Pc(4259) int local4259 = local4256.anInt2141;
																					if (local4259 == 0 || local4259 == 2) {
																						local4216 = false;
																					} else if (local4259 == 1) {
																						local4216 = true;
																					}
																				}
																			} else {
																				local4242 = Static460.aClass155_2.method3363(local229);
																				@Pc(4292) Class39 local4292 = Static460.aClass155_2.method3363(local4143);
																				if (local4242.anInt1044 != -1 && local4292.anInt1044 != -1) {
																					local4307 = Static540.aClass173_2.method3791(local4242.anInt1044);
																					@Pc(4313) Class81 local4313 = Static540.aClass173_2.method3791(local4292.anInt1044);
																					if (local4307.anInt2151 < local4313.anInt2151) {
																						local4216 = false;
																					}
																				}
																			}
																		}
																		if (local4216) {
																			if (local426) {
																				local4214.anInt4560 = local219;
																				local4214.anInt4627 = local73 + Static262.anInt5597;
																				local4214.anInt4592 = 0;
																				local4214.anInt4558 = local422;
																				local4214.anInt4624 = local229;
																				local4214.anInt4561 = 0;
																				local4214.anInt4603 = 1;
																				local4214.anInt4633 = local1643;
																				if (local4214.anInt4627 > Static262.anInt5597) {
																					local4214.anInt4592 = -1;
																				}
																				if (local4214.anInt4624 != -1 && Static262.anInt5597 == local4214.anInt4627) {
																					local2876 = Static460.aClass155_2.method3363(local4214.anInt4624).anInt1044;
																					if (local2876 != -1) {
																						local4256 = Static540.aClass173_2.method3791(local2876);
																						if (local4256 != null && local4256.anIntArray149 != null && !local4214.aBoolean317) {
																							Static589.method8022(0, local4256, local4214);
																						}
																					}
																				}
																			} else {
																				local4214.anInt4608 = 0;
																				local4214.anInt4562 = local219;
																				local4214.lb = local73 + Static262.anInt5597;
																				local4214.anInt4556 = local229;
																				local4214.anInt4629 = 0;
																				local4214.anInt4596 = local422;
																				local4214.anInt4575 = 1;
																				local4214.anInt4626 = local1643;
																				if (Static262.anInt5597 < local4214.lb) {
																					local4214.anInt4608 = -1;
																				}
																				if (local4214.anInt4556 != -1 && local4214.lb == Static262.anInt5597) {
																					local2876 = Static460.aClass155_2.method3363(local4214.anInt4556).anInt1044;
																					if (local2876 != -1) {
																						local4256 = Static540.aClass173_2.method3791(local2876);
																						if (local4256 != null && local4256.anIntArray149 != null && !local4214.aBoolean317) {
																							Static589.method8022(0, local4256, local4214);
																						}
																					}
																				}
																			}
																		}
																	}
																} else if (local223 >> 28 != 0) {
																	local429 = local223 & 0xFFFF;
																	@Pc(4487) Class13_Sub1_Sub1_Sub1_Sub2 local4487;
																	if (Static528.anInt8672 == local429) {
																		local4487 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1;
																	} else {
																		local4487 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local429];
																	}
																	if (local4487 != null) {
																		if (local229 == 65535) {
																			local229 = -1;
																		}
																		local4502 = true;
																		local4137 = local426 ? local4487.anInt4624 : local4487.anInt4556;
																		@Pc(4586) Class81 local4586;
																		if (local229 != -1 && local4137 != -1) {
																			@Pc(4528) Class39 local4528;
																			if (local4137 == local229) {
																				local4528 = Static460.aClass155_2.method3363(local229);
																				if (local4528.aBoolean74 && local4528.anInt1044 != -1) {
																					local4586 = Static540.aClass173_2.method3791(local4528.anInt1044);
																					local3098 = local4586.anInt2141;
																					if (local3098 == 0 || local3098 == 2) {
																						local4502 = false;
																					} else if (local3098 == 1) {
																						local4502 = true;
																					}
																				}
																			} else {
																				local4528 = Static460.aClass155_2.method3363(local229);
																				local4242 = Static460.aClass155_2.method3363(local4137);
																				if (local4528.anInt1044 != -1 && local4242.anInt1044 != -1) {
																					local4256 = Static540.aClass173_2.method3791(local4528.anInt1044);
																					local4307 = Static540.aClass173_2.method3791(local4242.anInt1044);
																					if (local4256.anInt2151 < local4307.anInt2151) {
																						local4502 = false;
																					}
																				}
																			}
																		}
																		if (local4502) {
																			if (local426) {
																				local4487.anInt4633 = local1643;
																				local4487.anInt4560 = local219;
																				local4487.anInt4592 = 0;
																				local4487.anInt4627 = local73 + Static262.anInt5597;
																				local4487.anInt4561 = 0;
																				local4487.anInt4624 = local229;
																				local4487.anInt4603 = 1;
																				local4487.anInt4558 = local422;
																				if (Static262.anInt5597 < local4487.anInt4627) {
																					local4487.anInt4592 = -1;
																				}
																				if (local4487.anInt4624 == 65535) {
																					local4487.anInt4624 = -1;
																				}
																				if (local4487.anInt4624 != -1 && Static262.anInt5597 == local4487.anInt4627) {
																					local4143 = Static460.aClass155_2.method3363(local4487.anInt4624).anInt1044;
																					if (local4143 != -1) {
																						local4586 = Static540.aClass173_2.method3791(local4143);
																						if (local4586 != null && local4586.anIntArray149 != null && !local4487.aBoolean317) {
																							Static589.method8022(0, local4586, local4487);
																						}
																					}
																				}
																			} else {
																				local4487.anInt4562 = local219;
																				local4487.anInt4608 = 0;
																				local4487.lb = local73 + Static262.anInt5597;
																				local4487.anInt4596 = local422;
																				local4487.anInt4575 = 1;
																				local4487.anInt4629 = 0;
																				local4487.anInt4626 = local1643;
																				local4487.anInt4556 = local229;
																				if (local4487.lb > Static262.anInt5597) {
																					local4487.anInt4608 = -1;
																				}
																				if (local4487.anInt4556 == 65535) {
																					local4487.anInt4556 = -1;
																				}
																				if (local4487.anInt4556 != -1 && local4487.lb == Static262.anInt5597) {
																					local4143 = Static460.aClass155_2.method3363(local4487.anInt4556).anInt1044;
																					if (local4143 != -1) {
																						local4586 = Static540.aClass173_2.method3791(local4143);
																						if (local4586 != null && local4586.anIntArray149 != null && !local4487.aBoolean317) {
																							Static589.method8022(0, local4586, local4487);
																						}
																					}
																				}
																			}
																		}
																	}
																}
															} else {
																local429 = local223 >> 28 & 0x3;
																local2866 = (local223 >> 14 & 0x3FFF) - Static132.anInt2246;
																local3088 = (local223 & 0x3FFF) - Static123.anInt2176;
																if (local2866 >= 0 && local3088 >= 0 && Static228.anInt3704 > local2866 && local3088 < Static162.anInt2911) {
																	local4137 = local2866 * 512 + 256;
																	local4143 = local3088 * 512 + 256;
																	local2876 = local429;
																	if (local429 < 3 && Static181.method2642(local3088, local2866)) {
																		local2876 = local429 + 1;
																	}
																	@Pc(4178) Class13_Sub1_Sub1_Sub2 local4178 = new Class13_Sub1_Sub1_Sub2(local229, local73, Static262.anInt5597, local429, local2876, local4137, Static504.method6917(local4137, local429, local4143) - local219, local4143, local2866, local2866, local3088, local3088, local1643);
																	Static616.aClass109_73.method2323(new Class2_Sub2_Sub21(local4178));
																}
															}
															Static468.aClass288_250 = null;
															return true;
														} else if (Static556.aClass288_360 == Static468.aClass288_250) {
															local73 = Static53.aClass2_Sub22_Sub2_1.method8542();
															Static224.aClass108_4 = Static452.aClass226_6.method4845(local73);
															Static468.aClass288_250 = null;
															return true;
														} else if (Static384.aClass288_213 == Static468.aClass288_250) {
															local73 = Static53.aClass2_Sub22_Sub2_1.method8494();
															local219 = Static53.aClass2_Sub22_Sub2_1.method8521();
															Static168.method2500();
															Static488.method6822(local73, local219);
															Static468.aClass288_250 = null;
															return true;
														} else if (Static468.aClass288_250 == Static619.aClass288_346) {
															Static134.anInt2258 = Static53.aClass2_Sub22_Sub2_1.method8496();
															Static633.anInt10152 = Static53.aClass2_Sub22_Sub2_1.method8547();
															Static468.aClass288_250 = null;
															return true;
														} else if (Static586.aClass288_330 == Static468.aClass288_250) {
															local2836 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
															Static168.method2500();
															Static344.aBoolean390 = local2836;
															Static468.aClass288_250 = null;
															return true;
														} else if (Static48.aClass288_37 == Static468.aClass288_250) {
															local73 = Static53.aClass2_Sub22_Sub2_1.method8497();
															local219 = Static53.aClass2_Sub22_Sub2_1.method8546();
															Static168.method2500();
															Static4.method96(local219, local73);
															Static468.aClass288_250 = null;
															return true;
														} else {
															@Pc(4895) boolean local4895;
															if (Static131.aClass288_355 == Static468.aClass288_250) {
																local525 = Static53.aClass2_Sub22_Sub2_1.method8549();
																local4895 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
																if (local4895) {
																	local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
																} else {
																	local527 = local525;
																}
																local229 = Static53.aClass2_Sub22_Sub2_1.method8546();
																@Pc(4913) byte local4913 = Static53.aClass2_Sub22_Sub2_1.method8548();
																local426 = false;
																if (local4913 == -128) {
																	local426 = true;
																}
																if (local426) {
																	if (Static159.anInt2843 == 0) {
																		Static468.aClass288_250 = null;
																		return true;
																	}
																	for (local1643 = 0; local1643 < Static159.anInt2843 && (!Static619.aClass211Array1[local1643].aString61.equals(local527) || local229 != Static619.aClass211Array1[local1643].anInt5229); local1643++) {
																	}
																	if (local1643 < Static159.anInt2843) {
																		while (local1643 < Static159.anInt2843 - 1) {
																			Static619.aClass211Array1[local1643] = Static619.aClass211Array1[local1643 + 1];
																			local1643++;
																		}
																		Static159.anInt2843--;
																		Static619.aClass211Array1[Static159.anInt2843] = null;
																	}
																} else {
																	local3521 = Static53.aClass2_Sub22_Sub2_1.method8549();
																	@Pc(5007) Class211 local5007 = new Class211();
																	local5007.aString59 = local525;
																	local5007.aString61 = local527;
																	local5007.aString60 = Static60.method906(local5007.aString61);
																	local5007.aString62 = local3521;
																	local5007.anInt5229 = local229;
																	local5007.aByte80 = local4913;
																	for (local429 = Static159.anInt2843 - 1; local429 >= 0; local429--) {
																		local2866 = Static619.aClass211Array1[local429].aString60.compareTo(local5007.aString60);
																		if (local2866 == 0) {
																			Static619.aClass211Array1[local429].anInt5229 = local229;
																			Static619.aClass211Array1[local429].aByte80 = local4913;
																			Static619.aClass211Array1[local429].aString62 = local3521;
																			if (local527.equals(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50)) {
																				Static326.aByte79 = local4913;
																			}
																			Static620.anInt9960 = Static542.anInt8903;
																			Static468.aClass288_250 = null;
																			return true;
																		}
																		if (local2866 < 0) {
																			break;
																		}
																	}
																	if (Static619.aClass211Array1.length <= Static159.anInt2843) {
																		Static468.aClass288_250 = null;
																		return true;
																	}
																	for (local2866 = Static159.anInt2843 - 1; local2866 > local429; local2866--) {
																		Static619.aClass211Array1[local2866 + 1] = Static619.aClass211Array1[local2866];
																	}
																	if (Static159.anInt2843 == 0) {
																		Static619.aClass211Array1 = new Class211[100];
																	}
																	Static619.aClass211Array1[local429 + 1] = local5007;
																	Static159.anInt2843++;
																	if (local527.equals(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50)) {
																		Static326.aByte79 = local4913;
																	}
																}
																Static468.aClass288_250 = null;
																Static620.anInt9960 = Static542.anInt8903;
																return true;
															} else if (Static299.aClass288_171 == Static468.aClass288_250) {
																Static230.method3181(Static60.aClass168_2);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static259.aClass288_151) {
																Static221.method3026();
																Static468.aClass288_250 = null;
																return true;
															} else if (Static325.aClass288_181 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8521();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8544();
																local223 = Static53.aClass2_Sub22_Sub2_1.method8555();
																Static168.method2500();
																Static528.method7300(local223, (local73 << 16) + local219);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static28.aClass288_25) {
																local3709 = Static53.aClass2_Sub22_Sub2_1.method8499();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8521();
																Static168.method2500();
																Static131.method8466(local219, local3709);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static177.aClass288_298) {
																local2836 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
																local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
																local2109 = local527;
																if (local2836) {
																	local2109 = Static53.aClass2_Sub22_Sub2_1.method8549();
																}
																local2852 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local2857 = Static53.aClass2_Sub22_Sub2_1.method8539();
																local422 = Static53.aClass2_Sub22_Sub2_1.method8547();
																@Pc(5264) long local5264 = local2857 + (local2852 << 32);
																local4502 = false;
																local4137 = 0;
																while (true) {
																	if (local4137 >= 100) {
																		if (local422 <= 1) {
																			if (Static416.aBoolean461 && !Static463.aBoolean554 || Static32.aBoolean58) {
																				local4502 = true;
																			} else if (Static260.method3557(local2109)) {
																				local4502 = true;
																			}
																		}
																		break;
																	}
																	if (Static131.aLongArray55[local4137] == local5264) {
																		local4502 = true;
																		break;
																	}
																	local4137++;
																}
																if (!local4502 && Static71.anInt1258 == 0) {
																	Static131.aLongArray55[Static101.anInt1893] = local5264;
																	Static101.anInt1893 = (Static101.anInt1893 + 1) % 100;
																	@Pc(5330) String local5330 = Static645.method8270(Static602.method8117(Static53.aClass2_Sub22_Sub2_1));
																	if (local422 == 2) {
																		Static150.method2241(0, local527, local5330, "<img=1>" + local2109, "<img=1>" + local527, -1, null, 7);
																	} else if (local422 == 1) {
																		Static150.method2241(0, local527, local5330, "<img=0>" + local2109, "<img=0>" + local527, -1, null, 7);
																	} else {
																		Static150.method2241(0, local527, local5330, local2109, local527, -1, null, 3);
																	}
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static646.aClass288_362) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8494();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local223 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local229 = Static53.aClass2_Sub22_Sub2_1.method8521();
																Static168.method2500();
																Static463.method6283(local229, local223, local219, local73);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static89.aClass288_259 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8555();
																local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
																Static168.method2500();
																Static181.method2643(local527, local73);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static413.aClass288_228) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
																if (local73 == 65535) {
																	local73 = -1;
																}
																local219 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local223 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local229 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local327 = Static53.aClass2_Sub22_Sub2_1.method8546();
																Static245.method3378(local229, local219, local73, local327, local223);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static289.aClass288_162 == Static468.aClass288_250) {
																if (Static38.anInt777 != -1) {
																	Static170.method7974(Static38.anInt777, 0);
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static257.aClass288_150 == Static468.aClass288_250) {
																local2836 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
																@Pc(5527) byte[] local5527 = new byte[Static84.anInt1498 - 1];
																Static53.aClass2_Sub22_Sub2_1.method8502(local5527, 0, Static84.anInt1498 - 1);
																Static588.method8018(local5527, local2836);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static101.aClass288_67 == Static468.aClass288_250) {
																local2836 = Static53.aClass2_Sub22_Sub2_1.method8547() == 1;
																local527 = Static53.aClass2_Sub22_Sub2_1.method8549();
																local2109 = local527;
																if (local2836) {
																	local2109 = Static53.aClass2_Sub22_Sub2_1.method8549();
																}
																local2852 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local2857 = Static53.aClass2_Sub22_Sub2_1.method8539();
																local422 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local429 = Static53.aClass2_Sub22_Sub2_1.method8546();
																@Pc(5593) long local5593 = local2857 + (local2852 << 32);
																local4216 = false;
																local4143 = 0;
																while (true) {
																	if (local4143 >= 100) {
																		if (local422 <= 1 && Static260.method3557(local2109)) {
																			local4216 = true;
																		}
																		break;
																	}
																	if (local5593 == Static131.aLongArray55[local4143]) {
																		local4216 = true;
																		break;
																	}
																	local4143++;
																}
																if (!local4216 && Static71.anInt1258 == 0) {
																	Static131.aLongArray55[Static101.anInt1893] = local5593;
																	Static101.anInt1893 = (Static101.anInt1893 + 1) % 100;
																	@Pc(5652) String local5652 = Static295.aClass362_2.method8112(local429).method3156(Static53.aClass2_Sub22_Sub2_1);
																	if (local422 == 2) {
																		Static150.method2241(0, local527, local5652, "<img=1>" + local2109, "<img=1>" + local527, local429, null, 18);
																	} else if (local422 == 1) {
																		Static150.method2241(0, local527, local5652, "<img=0>" + local2109, "<img=0>" + local527, local429, null, 18);
																	} else {
																		Static150.method2241(0, local527, local5652, local2109, local527, local429, null, 18);
																	}
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static375.aClass288_208) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8520();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8496();
																Static168.method2500();
																if (local219 == 2) {
																	Static493.method6855();
																}
																Static38.anInt777 = local73;
																Static570.method7809(local73);
																Static311.method4222(false);
																Static300.method4134(Static38.anInt777);
																for (local223 = 0; local223 < 100; local223++) {
																	Static69.aBooleanArray25[local223] = true;
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static291.aClass288_83) {
																Static111.anInt2031 = Static542.anInt8903;
																Static641.anInt10324 = 1;
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static274.aClass288_159) {
																Static510.anInt8540 = Static53.aClass2_Sub22_Sub2_1.method8547();
																Static369.anInt5832 = Static542.anInt8903;
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static225.aClass288_133) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
																if (local73 == 65535) {
																	local73 = -1;
																}
																local219 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local223 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local229 = Static53.aClass2_Sub22_Sub2_1.method8547();
																Static305.method4186(local223, true, local73, 256, local219, local229);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static102.aClass288_54) {
																Static230.method3181(Static548.aClass168_13);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static488.aClass288_273) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local4895 = (local219 & 0x1) == 1;
																while (Static84.anInt1498 > Static53.aClass2_Sub22_Sub2_1.anInt10247) {
																	local229 = Static53.aClass2_Sub22_Sub2_1.method8543();
																	local327 = Static53.aClass2_Sub22_Sub2_1.method8546();
																	local2733 = 0;
																	if (local327 != 0) {
																		local2733 = Static53.aClass2_Sub22_Sub2_1.method8547();
																		if (local2733 == 255) {
																			local2733 = Static53.aClass2_Sub22_Sub2_1.method8542();
																		}
																	}
																	Static157.method7240(local327 - 1, local2733, local229, local4895, local73);
																}
																Static421.anIntArray495[Static180.anInt3120++ & 0x1F] = local73;
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static573.aClass288_321) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8497();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8520();
																if (local219 == 65535) {
																	local219 = -1;
																}
																Static168.method2500();
																Static625.method8365(2, local73, local219, -1);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static217.aClass288_131) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8522();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8542();
																local223 = Static53.aClass2_Sub22_Sub2_1.method8526();
																Static168.method2500();
																Static106.method1596(local223, local73, local219);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static429.aClass288_234 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8518();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8494();
																Static168.method2500();
																Static124.method1781(local219, local73);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static36.aClass288_31 == Static468.aClass288_250) {
																Static320.method4282(Static84.anInt1498, Static53.aClass2_Sub22_Sub2_1);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static259.aClass288_152 == Static468.aClass288_250) {
																Static258.anInt4069 = Static53.aClass2_Sub22_Sub2_1.method8499() << 3;
																Static307.anInt4957 = Static53.aClass2_Sub22_Sub2_1.method8525() << 3;
																Static170.anInt9508 = Static53.aClass2_Sub22_Sub2_1.method8545();
																Static468.aClass288_250 = null;
																return true;
															} else if (Static592.aClass288_332 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8497();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8542();
																Static168.method2500();
																local673 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local219);
																@Pc(6057) Class2_Sub9 local6057 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local73);
																if (local6057 != null) {
																	Static588.method8013(local6057, false, local673 == null || local6057.anInt2171 != local673.anInt2171);
																}
																if (local673 != null) {
																	local673.method8653();
																	Static606.aClass118_47.method2601(local673, (long) local73);
																}
																@Pc(6088) Class261 local6088 = Static357.method4826(local219);
																if (local6088 != null) {
																	Static624.method8351(local6088);
																}
																local6088 = Static357.method4826(local73);
																if (local6088 != null) {
																	Static624.method8351(local6088);
																	Static338.method4549(true, local6088);
																}
																if (Static38.anInt777 != -1) {
																	Static170.method7974(Static38.anInt777, 1);
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static482.aClass288_262 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8527();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8544();
																if (local219 == 65535) {
																	local219 = -1;
																}
																local223 = Static53.aClass2_Sub22_Sub2_1.method8496();
																Static637.method8582(local73, local219, local223);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static167.aClass288_107 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8554();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8527();
																local223 = Static53.aClass2_Sub22_Sub2_1.method8521();
																if (local223 == 65535) {
																	local223 = -1;
																}
																Static318.method4264(local223, local73, local219);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static597.aClass288_335) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8527();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8544();
																Static431.aClass205_1.method4259(local219, local73);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static598.aClass288_336) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8520();
																Static168.method2500();
																Static419.method5599(local73, local219);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static106.aClass288_70) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8544();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8497();
																Static168.method2500();
																Static106.method1597(local73, local219);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static133.aClass288_84 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8497();
																Static168.method2500();
																Static625.method8365(3, local73, -1, -1);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static162.aClass288_104) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8555();
																Static168.method2500();
																@Pc(6282) Class2_Sub9 local6282 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local73);
																if (local6282 != null) {
																	Static588.method8013(local6282, false, true);
																}
																if (Static11.aClass261_1 != null) {
																	Static624.method8351(Static11.aClass261_1);
																	Static11.aClass261_1 = null;
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static596.aClass288_333) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8520();
																if (local219 == 65535) {
																	local219 = -1;
																}
																local223 = Static53.aClass2_Sub22_Sub2_1.method8494();
																local229 = Static53.aClass2_Sub22_Sub2_1.method8520();
																Static168.method2500();
																if (local229 == 65535) {
																	local229 = -1;
																}
																for (local327 = local229; local327 <= local219; local327++) {
																	local2857 = (long) local327 + ((long) local223 << 32);
																	@Pc(6352) Class2_Sub41 local6352 = (Class2_Sub41) Static247.aClass118_22.method2595(local2857);
																	if (local6352 != null) {
																		local1373 = new Class2_Sub41(local6352.anInt8108, local73);
																		local6352.method8653();
																	} else if (local327 == -1) {
																		local1373 = new Class2_Sub41(Static357.method4826(local223).aClass2_Sub41_2.anInt8108, local73);
																	} else {
																		local1373 = new Class2_Sub41(0, local73);
																	}
																	Static247.aClass118_22.method2601(local1373, local2857);
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static49.aClass288_286) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8555();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8546();
																Static431.aClass205_1.method4259(local219, local73);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static176.aClass288_110) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8547();
																@Pc(6437) boolean local6437 = (local73 & 0x1) == 1;
																local2109 = Static53.aClass2_Sub22_Sub2_1.method8549();
																local1882 = Static53.aClass2_Sub22_Sub2_1.method8549();
																if (local1882.equals("")) {
																	local1882 = local2109;
																}
																local1622 = Static53.aClass2_Sub22_Sub2_1.method8549();
																local569 = Static53.aClass2_Sub22_Sub2_1.method8549();
																if (local569.equals("")) {
																	local569 = local1622;
																}
																if (local6437) {
																	for (local1643 = 0; local1643 < Static124.anInt2182; local1643++) {
																		if (Static55.aStringArray5[local1643].equals(local569)) {
																			Static214.aStringArray14[local1643] = local2109;
																			Static55.aStringArray5[local1643] = local1882;
																			Static594.aStringArray45[local1643] = local1622;
																			Static198.aStringArray40[local1643] = local569;
																			break;
																		}
																	}
																} else {
																	Static214.aStringArray14[Static124.anInt2182] = local2109;
																	Static55.aStringArray5[Static124.anInt2182] = local1882;
																	Static594.aStringArray45[Static124.anInt2182] = local1622;
																	Static198.aStringArray40[Static124.anInt2182] = local569;
																	Static240.aBooleanArray14[Static124.anInt2182] = (local73 & 0x2) == 2;
																	Static124.anInt2182++;
																}
																Static111.anInt2031 = Static542.anInt8903;
																Static468.aClass288_250 = null;
																return true;
															} else if (Static527.aClass288_291 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8546();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local4895 = (local219 & 0x1) == 1;
																Static410.method5512(local73, local4895);
																local229 = Static53.aClass2_Sub22_Sub2_1.method8546();
																for (local327 = 0; local327 < local229; local327++) {
																	local2733 = Static53.aClass2_Sub22_Sub2_1.method8496();
																	if (local2733 == 255) {
																		local2733 = Static53.aClass2_Sub22_Sub2_1.method8494();
																	}
																	local1643 = Static53.aClass2_Sub22_Sub2_1.method8521();
																	Static157.method7240(local1643 - 1, local2733, local327, local4895, local73);
																}
																Static421.anIntArray495[Static180.anInt3120++ & 0x1F] = local73;
																Static468.aClass288_250 = null;
																return true;
															} else if (Static468.aClass288_250 == Static488.aClass288_274) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8521();
																Static168.method2500();
																Static183.method2678(local73);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static501.aClass288_279 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8543();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8542();
																local223 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local1882 = "";
																local1622 = local1882;
																if ((local223 & 0x1) != 0) {
																	local1882 = Static53.aClass2_Sub22_Sub2_1.method8549();
																	if ((local223 & 0x2) == 0) {
																		local1622 = local1882;
																	} else {
																		local1622 = Static53.aClass2_Sub22_Sub2_1.method8549();
																	}
																}
																local569 = Static53.aClass2_Sub22_Sub2_1.method8549();
																if (local73 == 99) {
																	Static338.method4547(local569);
																} else if (local1622.equals("") || !Static260.method3557(local1622)) {
																	Static443.method6042(local1622, local219, local1882, local569, local1882, local73);
																} else {
																	Static468.aClass288_250 = null;
																	return true;
																}
																Static468.aClass288_250 = null;
																return true;
															} else if (Static196.aClass288_122 == Static468.aClass288_250) {
																Static230.method3181(Static368.aClass168_9);
																Static468.aClass288_250 = null;
																return true;
															} else if (Static585.aClass288_329 == Static468.aClass288_250) {
																local73 = Static53.aClass2_Sub22_Sub2_1.method8520();
																local219 = Static53.aClass2_Sub22_Sub2_1.method8547();
																local4895 = (local219 & 0x1) == 1;
																Static460.method6254(local73, local4895);
																Static421.anIntArray495[Static180.anInt3120++ & 0x1F] = local73;
																Static468.aClass288_250 = null;
																return true;
															} else {
																Static163.method2447(null, "T1 - " + (Static468.aClass288_250 == null ? -1 : Static468.aClass288_250.method6317()) + "," + (Static109.aClass288_71 == null ? -1 : Static109.aClass288_71.method6317()) + "," + (Static198.aClass288_282 == null ? -1 : Static198.aClass288_282.method6317()) + " - " + Static84.anInt1498);
																Static211.method2746(false);
																return true;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
