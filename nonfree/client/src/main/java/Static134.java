import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!eo;")
	public static Class52 aClass52_7;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!ll;")
	public static Class114 aClass114_26 = new Class114();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class188 local3 = new Class188();
		local3.anInt5871 = arg1 / 128;
		local3.anInt5862 = arg2 / 128;
		local3.anInt5880 = arg3 / 128;
		local3.anInt5874 = arg4 / 128;
		local3.anInt5870 = arg0;
		local3.anInt5866 = arg1;
		local3.anInt5881 = arg2;
		local3.anInt5864 = arg3;
		local3.anInt5883 = arg4;
		local3.anInt5876 = arg5;
		local3.anInt5885 = arg6;
		Static294.aClass188Array13[Static77.anInt1742++] = local3;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)I")
	public static int method3298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub18 local10 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray386.length > arg0) {
			return local10.anIntArray386[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
	public static boolean method3300() throws IOException {
		if (aClass52_7 == null) {
			return false;
		}
		@Pc(15) int local15 = aClass52_7.method1101();
		if (local15 == 0) {
			return false;
		}
		if (Static34.anInt552 == -1) {
			aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, 1);
			Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
			local15--;
			Static34.anInt552 = Static189.aClass4_Sub10_Sub1_2.method4683();
			Static21.anInt1052 = Static143.anIntArray242[Static34.anInt552];
		}
		if (Static21.anInt1052 == -1) {
			if (local15 <= 0) {
				return false;
			}
			local15--;
			aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, 1);
			Static21.anInt1052 = Static189.aClass4_Sub10_Sub1_2.aByteArray71[0] & 0xFF;
		}
		if (Static21.anInt1052 == -2) {
			if (local15 <= 1) {
				return false;
			}
			local15 -= 2;
			aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, 2);
			Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
			Static21.anInt1052 = Static189.aClass4_Sub10_Sub1_2.method4653();
		}
		if (Static21.anInt1052 > local15) {
			return false;
		}
		Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
		aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, Static21.anInt1052);
		Static63.anInt1231 = Static113.anInt2273;
		Static113.anInt2273 = Static174.anInt3335;
		Static135.anInt2583 = 0;
		Static174.anInt3335 = Static34.anInt552;
		@Pc(130) int local130;
		if (Static34.anInt552 == 163) {
			for (local130 = 0; local130 < Static2.anIntArray2.length; local130++) {
				if (Static2.anIntArray2[local130] != Static46.anIntArray62[local130]) {
					Static2.anIntArray2[local130] = Static46.anIntArray62[local130];
					Static221.method3571(local130);
					Static135.anIntArray225[Static42.anInt788++ & 0x1F] = local130;
				}
			}
			Static34.anInt552 = -1;
			return true;
		}
		@Pc(184) int local184;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(213) int local213;
		@Pc(193) Class189 local193;
		if (Static34.anInt552 == 34) {
			local130 = Static189.aClass4_Sub10_Sub1_2.method4632();
			local184 = Static189.aClass4_Sub10_Sub1_2.method4653();
			if (local130 >= 0) {
				local193 = Static114.method1814(local130);
			} else {
				local193 = null;
			}
			if (local130 < -70000) {
				local184 += 32768;
			}
			while (Static189.aClass4_Sub10_Sub1_2.anInt5713 < Static21.anInt1052) {
				local213 = 0;
				local217 = Static189.aClass4_Sub10_Sub1_2.method4616();
				local221 = Static189.aClass4_Sub10_Sub1_2.method4653();
				if (local221 != 0) {
					local213 = Static189.aClass4_Sub10_Sub1_2.method4666();
					if (local213 == 255) {
						local213 = Static189.aClass4_Sub10_Sub1_2.method4632();
					}
				}
				if (local193 != null && local217 >= 0 && local193.anIntArray660.length > local217) {
					local193.anIntArray660[local217] = local221;
					local193.anIntArray661[local217] = local213;
				}
				Static185.method2985(local184, local217, local221 - 1, local213);
			}
			if (local193 != null) {
				Static205.method3283(local193);
			}
			Static138.method2063();
			Static306.anIntArray656[Static51.anInt959++ & 0x1F] = local184 & 0x7FFF;
			Static34.anInt552 = -1;
			return true;
		} else if (Static34.anInt552 == 53) {
			Static44.anInt818 = Static189.aClass4_Sub10_Sub1_2.method4642();
			Static48.anInt894 = Static189.aClass4_Sub10_Sub1_2.method4660();
			while (Static21.anInt1052 > Static189.aClass4_Sub10_Sub1_2.anInt5713) {
				Static34.anInt552 = Static189.aClass4_Sub10_Sub1_2.method4666();
				Static312.method4826();
			}
			Static34.anInt552 = -1;
			return true;
		} else if (Static34.anInt552 == 192) {
			Static115.method1819();
			Static34.anInt552 = -1;
			return false;
		} else {
			@Pc(364) byte local364;
			if (Static34.anInt552 == 176) {
				local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local184 = Static189.aClass4_Sub10_Sub1_2.method4625();
				local364 = Static189.aClass4_Sub10_Sub1_2.method4652();
				if (Static289.method4418(local130)) {
					Static28.method397(local184, local364);
				}
				Static34.anInt552 = -1;
				return true;
			} else if (Static34.anInt552 == 4) {
				Static297.anInt5498 = Static189.aClass4_Sub10_Sub1_2.method4666();
				Static98.anInt2102 = Static261.anInt4980;
				Static34.anInt552 = -1;
				return true;
			} else {
				@Pc(409) int local409;
				@Pc(425) Class4_Sub27 local425;
				if (Static34.anInt552 == 35) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4626();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4625();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4657();
					local217 = Static189.aClass4_Sub10_Sub1_2.method4672();
					if (Static289.method4418(local184)) {
						local425 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local409);
						if (local425 != null) {
							Static203.method3259(local217 != local425.anInt4621, local425);
						}
						Static24.method318(local217, local130, local409);
					}
					Static34.anInt552 = -1;
					return true;
				}
				@Pc(462) String local462;
				@Pc(487) boolean local487;
				@Pc(485) long local485;
				@Pc(621) String local621;
				@Pc(481) String local481;
				if (Static34.anInt552 == 59) {
					local462 = Static189.aClass4_Sub10_Sub1_2.method4630();
					if (local462.endsWith(":tradereq:")) {
						local481 = local462.substring(0, local462.indexOf(":"));
						local487 = false;
						local485 = Static108.method1747(local481);
						for (local213 = 0; local213 < Static239.anInt4517; local213++) {
							if (Static132.aLongArray16[local213] == local485) {
								local487 = true;
								break;
							}
						}
						if (!local487 && Static112.anInt5406 == 0) {
							Static186.method4394(local481, 4, Static98.aString118);
						}
					} else if (local462.endsWith(":chalreq:")) {
						local481 = local462.substring(0, local462.indexOf(":"));
						local487 = false;
						local485 = Static108.method1747(local481);
						for (local213 = 0; local213 < Static239.anInt4517; local213++) {
							if (Static132.aLongArray16[local213] == local485) {
								local487 = true;
								break;
							}
						}
						if (!local487 && Static112.anInt5406 == 0) {
							local621 = local462.substring(local462.indexOf(":") + 1, local462.length() + -9);
							Static186.method4394(local481, 8, local621);
						}
					} else if (local462.endsWith(":assistreq:")) {
						local481 = local462.substring(0, local462.indexOf(":"));
						local485 = Static108.method1747(local481);
						local487 = false;
						for (local213 = 0; local213 < Static239.anInt4517; local213++) {
							if (local485 == Static132.aLongArray16[local213]) {
								local487 = true;
								break;
							}
						}
						if (!local487 && Static112.anInt5406 == 0) {
							Static186.method4394(local481, 10, "");
						}
					} else if (local462.endsWith(":clan:")) {
						local481 = local462.substring(0, local462.indexOf(":clan:"));
						Static186.method4394("", 11, local481);
					} else if (local462.endsWith(":trade:")) {
						local481 = local462.substring(0, local462.indexOf(":trade:"));
						if (Static112.anInt5406 == 0) {
							Static186.method4394("", 12, local481);
						}
					} else if (local462.endsWith(":assist:")) {
						local481 = local462.substring(0, local462.indexOf(":assist:"));
						if (Static112.anInt5406 == 0) {
							Static186.method4394("", 13, local481);
						}
					} else if (local462.endsWith(":duelstake:")) {
						local481 = local462.substring(0, local462.indexOf(":"));
						local485 = Static108.method1747(local481);
						local487 = false;
						for (local213 = 0; local213 < Static239.anInt4517; local213++) {
							if (Static132.aLongArray16[local213] == local485) {
								local487 = true;
								break;
							}
						}
						if (!local487 && Static112.anInt5406 == 0) {
							Static186.method4394(local481, 14, "");
						}
					} else if (local462.endsWith(":duelfriend:")) {
						local481 = local462.substring(0, local462.indexOf(":"));
						local487 = false;
						local485 = Static108.method1747(local481);
						for (local213 = 0; local213 < Static239.anInt4517; local213++) {
							if (local485 == Static132.aLongArray16[local213]) {
								local487 = true;
								break;
							}
						}
						if (!local487 && Static112.anInt5406 == 0) {
							Static186.method4394(local481, 15, "");
						}
					} else if (local462.endsWith(":clanreq:")) {
						local481 = local462.substring(0, local462.indexOf(":"));
						local485 = Static108.method1747(local481);
						local487 = false;
						for (local213 = 0; local213 < Static239.anInt4517; local213++) {
							if (local485 == Static132.aLongArray16[local213]) {
								local487 = true;
								break;
							}
						}
						if (!local487 && Static112.anInt5406 == 0) {
							Static186.method4394(local481, 16, "");
						}
					} else if (local462.endsWith(":allyreq:")) {
						local481 = local462.substring(0, local462.indexOf(":"));
						local485 = Static108.method1747(local481);
						local487 = false;
						for (local213 = 0; local213 < Static239.anInt4517; local213++) {
							if (local485 == Static132.aLongArray16[local213]) {
								local487 = true;
								break;
							}
						}
						if (!local487 && Static112.anInt5406 == 0) {
							local621 = local462.substring(local462.indexOf(":") + 1, local462.length() - 9);
							Static186.method4394(local481, 21, local621);
						}
					} else if (local462.endsWith(":spam:")) {
						local481 = local462.substring(0, local462.length() - 6);
						if (Static112.anInt5406 == 0) {
							Static186.method4394("", 22, local481);
						}
					} else {
						Static186.method4394("", 0, local462);
					}
					Static34.anInt552 = -1;
					return true;
				}
				@Pc(1015) long local1015;
				@Pc(1037) Class4_Sub21 local1037;
				@Pc(1021) Class4_Sub21 local1021;
				if (Static34.anInt552 == 162) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4632();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4632();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4653();
					local217 = Static189.aClass4_Sub10_Sub1_2.method4625();
					if (local409 == 65535) {
						local409 = -1;
					}
					if (local217 == 65535) {
						local217 = -1;
					}
					local221 = Static189.aClass4_Sub10_Sub1_2.method4625();
					if (Static289.method4418(local221)) {
						for (local213 = local217; local213 <= local409; local213++) {
							local1015 = ((long) local184 << 32) + ((long) local213);
							local1021 = (Class4_Sub21) Static65.aClass85_5.method1845(local1015);
							if (local1021 != null) {
								local1037 = new Class4_Sub21(local130, local1021.anInt3939);
								local1021.method4854();
							} else if (local213 == -1) {
								local1037 = new Class4_Sub21(local130, Static114.method1814(local184).aClass4_Sub21_2.anInt3939);
							} else {
								local1037 = new Class4_Sub21(local130, -1);
							}
							Static65.aClass85_5.method1841(local1037, local1015);
						}
					}
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 1) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4672();
					local481 = Static189.aClass4_Sub10_Sub1_2.method4630();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4620();
					if (Static289.method4418(local130)) {
						Static140.method2080(local409, local481);
					}
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 11) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4672();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4624();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4667();
					if (Static289.method4418(local130)) {
						Static110.method1774(local409, local184);
					}
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 148) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4657();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4653();
					if (Static289.method4418(local409)) {
						Static28.method397(local130, local184);
					}
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 95) {
					Static138.method2063();
					Static91.anInt2048 = Static189.aClass4_Sub10_Sub1_2.method4613();
					Static16.anInt925 = Static261.anInt4980;
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 164) {
					Static138.method2063();
					local130 = Static189.aClass4_Sub10_Sub1_2.method4666();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4620();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4666();
					Static299.anIntArray637[local409] = local184;
					Static294.anIntArray501[local409] = local130;
					Static279.anIntArray599[local409] = 1;
					for (local217 = 0; local217 < 98; local217++) {
						if (local184 >= Class65.anIntArray165[local217]) {
							Static279.anIntArray599[local409] = local217 + 2;
						}
					}
					Static179.anIntArray336[Static214.anInt4210++ & 0x1F] = local409;
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 8) {
					Static138.method2063();
					Static52.anInt2248 = Static189.aClass4_Sub10_Sub1_2.method4666();
					Static16.anInt925 = Static261.anInt4980;
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 86) {
					Static226.method419(Static189.aClass4_Sub10_Sub1_2.method4630());
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 87) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4625();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4653();
					if (local184 == 65535) {
						local184 = -1;
					}
					local409 = Static189.aClass4_Sub10_Sub1_2.method4657();
					if (Static289.method4418(local130)) {
						Static214.method3484(1, -1, local409, local184);
					}
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 49) {
					Static262.method4126(false);
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 138) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4625();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4624();
					Static224.method3587(local184, local130);
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 96) {
					if (Static107.anInt5399 != -1) {
						Static205.method3290(Static107.anInt5399, 0);
					}
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 97) {
					Static44.anInt818 = Static189.aClass4_Sub10_Sub1_2.method4642();
					Static48.anInt894 = Static189.aClass4_Sub10_Sub1_2.method4660();
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 25) {
					Static277.method4306();
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 126) {
					local462 = Static189.aClass4_Sub10_Sub1_2.method4630();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4626();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4672();
					local217 = Static189.aClass4_Sub10_Sub1_2.method4642();
					if (local409 == 65535) {
						local409 = -1;
					}
					if (local217 >= 1 && local217 <= 8) {
						if (local462.equalsIgnoreCase("null")) {
							local462 = null;
						}
						Static76.aStringArray40[local217 - 1] = local462;
						Static186.anIntArray615[local217 - 1] = local409;
						Static127.aBooleanArray11[local217 - 1] = local184 == 0;
					}
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 55) {
					Static194.anInt5207 = Static189.aClass4_Sub10_Sub1_2.method4666();
					Static34.anInt552 = -1;
					return true;
				} else if (Static34.anInt552 == 31) {
					local130 = Static189.aClass4_Sub10_Sub1_2.method4632();
					local184 = Static189.aClass4_Sub10_Sub1_2.method4653();
					local409 = Static189.aClass4_Sub10_Sub1_2.method4667();
					local217 = Static189.aClass4_Sub10_Sub1_2.method4653();
					local221 = Static189.aClass4_Sub10_Sub1_2.method4653();
					if (local217 == 65535) {
						local217 = -1;
					}
					if (local221 == 65535) {
						local221 = -1;
					}
					if (Static289.method4418(local409)) {
						for (local213 = local221; local213 <= local217; local213++) {
							local1015 = ((long) local130 << 32) + (long) local213;
							local1021 = (Class4_Sub21) Static65.aClass85_5.method1845(local1015);
							if (local1021 != null) {
								local1037 = new Class4_Sub21(local1021.anInt3947, local184);
								local1021.method4854();
							} else if (local213 == -1) {
								local1037 = new Class4_Sub21(Static114.method1814(local130).aClass4_Sub21_2.anInt3947, local184);
							} else {
								local1037 = new Class4_Sub21(0, local184);
							}
							Static65.aClass85_5.method1841(local1037, local1015);
						}
					}
					Static34.anInt552 = -1;
					return true;
				} else {
					@Pc(1653) int local1653;
					@Pc(1598) long local1598;
					@Pc(1663) int local1663;
					if (Static34.anInt552 == 174) {
						local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
						local409 = Static189.aClass4_Sub10_Sub1_2.method4653();
						local487 = false;
						if ((Long.MIN_VALUE & local1598) != 0L) {
							local487 = true;
						}
						@Pc(1619) byte local1619 = Static189.aClass4_Sub10_Sub1_2.method4674();
						if (local487) {
							if (Static164.anInt3260 == 0) {
								Static34.anInt552 = -1;
								return true;
							}
							local1598 &= Long.MAX_VALUE;
							for (local213 = 0; Static164.anInt3260 > local213 && (Static255.aClass4_Sub15Array1[local213].aLong217 != local1598 || local409 != Static255.aClass4_Sub15Array1[local213].anInt2988); local213++) {
							}
							if (local213 < Static164.anInt3260) {
								while (local213 < Static164.anInt3260 - 1) {
									Static255.aClass4_Sub15Array1[local213] = Static255.aClass4_Sub15Array1[local213 + 1];
									local213++;
								}
								Static164.anInt3260--;
								Static255.aClass4_Sub15Array1[Static164.anInt3260] = null;
							}
						} else {
							local621 = Static189.aClass4_Sub10_Sub1_2.method4630();
							@Pc(1629) Class4_Sub15 local1629 = new Class4_Sub15();
							local1629.aLong217 = local1598;
							local1629.aString182 = Static282.method4356(local1629.aLong217);
							local1629.aByte5 = local1619;
							local1629.anInt2988 = local409;
							local1629.aString181 = local621;
							for (local1653 = Static164.anInt3260 - 1; local1653 >= 0; local1653--) {
								local1663 = Static255.aClass4_Sub15Array1[local1653].aString182.compareTo(local1629.aString182);
								if (local1663 == 0) {
									Static255.aClass4_Sub15Array1[local1653].anInt2988 = local409;
									Static255.aClass4_Sub15Array1[local1653].aByte5 = local1619;
									Static255.aClass4_Sub15Array1[local1653].aString181 = local621;
									Static137.anInt2616 = Static261.anInt4980;
									if (Static28.aLong23 == local1598) {
										Static185.aByte13 = local1619;
									}
									Static34.anInt552 = -1;
									return true;
								}
								if (local1663 < 0) {
									break;
								}
							}
							if (Static164.anInt3260 >= Static255.aClass4_Sub15Array1.length) {
								Static34.anInt552 = -1;
								return true;
							}
							for (local1663 = Static164.anInt3260 - 1; local1663 > local1653; local1663--) {
								Static255.aClass4_Sub15Array1[local1663 + 1] = Static255.aClass4_Sub15Array1[local1663];
							}
							if (Static164.anInt3260 == 0) {
								Static255.aClass4_Sub15Array1 = new Class4_Sub15[100];
							}
							Static255.aClass4_Sub15Array1[local1653 + 1] = local1629;
							if (local1598 == Static28.aLong23) {
								Static185.aByte13 = local1619;
							}
							Static164.anInt3260++;
						}
						Static137.anInt2616 = Static261.anInt4980;
						Static34.anInt552 = -1;
						return true;
					}
					@Pc(1865) String local1865;
					if (Static34.anInt552 == 104) {
						local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
						local1865 = Static97.method2272(Static225.method3606(Static7.method110(Static189.aClass4_Sub10_Sub1_2)));
						Static186.method4394(Static216.method3514(local1598), 6, local1865);
						Static34.anInt552 = -1;
						return true;
					} else if (Static34.anInt552 == 253) {
						local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
						local481 = Static189.aClass4_Sub10_Sub1_2.method4630();
						@Pc(1895) Object[] local1895 = new Object[local481.length() + 1];
						for (local217 = local481.length() - 1; local217 >= 0; local217--) {
							if (local481.charAt(local217) == 's') {
								local1895[local217 + 1] = Static189.aClass4_Sub10_Sub1_2.method4630();
							} else {
								local1895[local217 + 1] = Integer.valueOf(Static189.aClass4_Sub10_Sub1_2.method4632());
							}
						}
						local1895[0] = Integer.valueOf(Static189.aClass4_Sub10_Sub1_2.method4632());
						if (Static289.method4418(local130)) {
							@Pc(1953) Class4_Sub13 local1953 = new Class4_Sub13();
							local1953.anObjectArray2 = local1895;
							Static135.method2020(local1953);
						}
						Static34.anInt552 = -1;
						return true;
					} else {
						@Pc(2004) int local2004;
						if (Static34.anInt552 == 63) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4672();
							local184 = Static189.aClass4_Sub10_Sub1_2.method4642();
							if (local130 == 65535) {
								local130 = -1;
							}
							local409 = local184 >> 2;
							local221 = Static37.anIntArray52[local409];
							local217 = local184 & 0x3;
							local213 = Static189.aClass4_Sub10_Sub1_2.method4632();
							local2004 = local213 >> 28 & 0x3;
							local1653 = local213 >> 14 & 0x3FFF;
							local1663 = local213 & 0x3FFF;
							local1663 -= Static295.anInt5480;
							local1653 -= Static220.anInt3983;
							Static272.method4287(local130, local1653, local2004, local1663, local221, local217, local409);
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 30) {
							if (Static122.aFrame1 != null) {
								Static285.method4549(false, Static192.anInt3637, -1, -1);
							}
							@Pc(2051) byte[] local2051 = new byte[Static21.anInt1052];
							Static189.aClass4_Sub10_Sub1_2.method4684(local2051, Static21.anInt1052);
							local481 = Static277.method4308(0, local2051, Static21.anInt1052);
							if (Static172.aFrame2 == null && (Static215.anInt4212 == 3 || !Static215.aString254.startsWith("win") || Static83.aBoolean118)) {
								Static307.method4756(local481, true);
							} else {
								Static238.aString276 = local481;
								Static151.aBoolean206 = true;
								Static3.aClass185_1 = Static276.aClass139_4.method3504(local481);
							}
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 147) {
							Static48.anInt894 = Static189.aClass4_Sub10_Sub1_2.method4666();
							Static44.anInt818 = Static189.aClass4_Sub10_Sub1_2.method4660();
							for (local130 = Static48.anInt894; local130 < Static48.anInt894 + 8; local130++) {
								for (local184 = Static44.anInt818; local184 < Static44.anInt818 + 8; local184++) {
									if (Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local130][local184] != null) {
										Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local130][local184] = null;
										Static5.method89(local130, local184);
									}
								}
							}
							for (@Pc(2157) Class4_Sub25 local2157 = (Class4_Sub25) Static57.aClass114_7.method2623(); local2157 != null; local2157 = (Class4_Sub25) Static57.aClass114_7.method2629()) {
								if (Static48.anInt894 <= local2157.anInt4446 && local2157.anInt4446 < Static48.anInt894 + 8 && Static44.anInt818 <= local2157.anInt4442 && Static44.anInt818 + 8 > local2157.anInt4442 && Static281.anInt5335 == local2157.anInt4439) {
									local2157.anInt4437 = 0;
								}
							}
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 10) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4620();
							local184 = Static189.aClass4_Sub10_Sub1_2.method4667();
							Static10.method173(local184, local130);
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 100) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
							if (local130 == 65535) {
								local130 = -1;
							}
							local184 = Static189.aClass4_Sub10_Sub1_2.method4660();
							Static297.method4481(local184, local130);
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 206) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4666();
							local184 = Static189.aClass4_Sub10_Sub1_2.method4625();
							if (local184 == 65535) {
								local184 = -1;
							}
							local409 = Static189.aClass4_Sub10_Sub1_2.method4627();
							Static155.method1934(local130, local409, local184);
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 54) {
							if (Static21.anInt1052 == 0) {
								Static206.aString236 = Static4.aString6;
							} else {
								Static206.aString236 = Static189.aClass4_Sub10_Sub1_2.method4630();
							}
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 33) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4666();
							local184 = Static189.aClass4_Sub10_Sub1_2.method4666();
							local364 = Static189.aClass4_Sub10_Sub1_2.method4674();
							if (Static41.aByte1 != local364) {
								Static34.anInt552 = -1;
								return true;
							}
							Static34.anInt552 = -1;
							if (local130 == 255) {
								Static105.aBoolean147 = false;
								Static239.anInt4507 = 0;
								Static102.anInt2140 = 0;
							} else {
								Static105.aBoolean147 = true;
								Static102.anInt2140 = local184;
								Static239.anInt4507 = local130;
							}
							return true;
						} else if (Static34.anInt552 == 183) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4632();
							local184 = Static189.aClass4_Sub10_Sub1_2.method4625();
							if (local184 == 65535) {
								local184 = -1;
							}
							local409 = Static189.aClass4_Sub10_Sub1_2.method4667();
							local217 = Static189.aClass4_Sub10_Sub1_2.method4632();
							if (Static289.method4418(local409)) {
								@Pc(2395) Class189 local2395 = Static114.method1814(local130);
								@Pc(2409) Class165 local2409;
								if (local2395.aBoolean417) {
									Static240.method3753(local217, local130, local184);
									local2409 = Static287.method4398(local184);
									Static63.method1019(local2409.anInt5096, local2409.anInt5058, local2409.anInt5081, local130);
									Static293.method4470(local2409.anInt5099, local2409.anInt5063, local2409.anInt5066, local130);
								} else if (local184 == -1) {
									local2395.anInt5943 = 0;
									Static34.anInt552 = -1;
									return true;
								} else {
									local2409 = Static287.method4398(local184);
									local2395.anInt5980 = local2409.anInt5096;
									local2395.anInt5943 = 4;
									local2395.anInt5899 = local184;
									local2395.anInt5948 = local2409.anInt5081;
									local2395.anInt5922 = local2409.anInt5058 * 100 / local217;
									Static205.method3283(local2395);
								}
							}
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 65) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4624();
							local184 = Static189.aClass4_Sub10_Sub1_2.method4625();
							local409 = Static189.aClass4_Sub10_Sub1_2.method4663();
							local217 = Static189.aClass4_Sub10_Sub1_2.method4622();
							if (Static289.method4418(local184)) {
								Static45.method726(local130, local409, local217);
							}
							Static34.anInt552 = -1;
							return true;
						} else if (Static34.anInt552 == 152) {
							local130 = Static189.aClass4_Sub10_Sub1_2.method4625();
							local184 = Static189.aClass4_Sub10_Sub1_2.method4625();
							local409 = Static189.aClass4_Sub10_Sub1_2.method4667();
							local217 = Static189.aClass4_Sub10_Sub1_2.method4657();
							if (Static289.method4418(local130)) {
								Static136.method2022(local409 + (local184 << 16), local217);
							}
							Static34.anInt552 = -1;
							return true;
						} else {
							@Pc(2573) long local2573;
							@Pc(2585) int local2585;
							if (Static34.anInt552 == 44) {
								@Pc(2559) boolean local2559 = false;
								local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
								local485 = Static189.aClass4_Sub10_Sub1_2.method4653();
								local2573 = Static189.aClass4_Sub10_Sub1_2.method4655();
								@Pc(2579) long local2579 = (local485 << 32) + local2573;
								local2004 = Static189.aClass4_Sub10_Sub1_2.method4666();
								local2585 = 0;
								label1451: while (true) {
									if (local2585 >= 100) {
										if (local2004 <= 1) {
											if (Static42.aBoolean47 && !Static207.aBoolean287 || Static60.aBoolean67) {
												local2559 = true;
											} else {
												for (local2585 = 0; local2585 < Static239.anInt4517; local2585++) {
													if (local1598 == Static132.aLongArray16[local2585]) {
														local2559 = true;
														break label1451;
													}
												}
											}
										}
										break;
									}
									if (Static153.aLongArray24[local2585] == local2579) {
										local2559 = true;
										break;
									}
									local2585++;
								}
								if (!local2559 && Static112.anInt5406 == 0) {
									Static153.aLongArray24[Static36.anInt595] = local2579;
									Static36.anInt595 = (Static36.anInt595 + 1) % 100;
									@Pc(2663) String local2663 = Static97.method2272(Static225.method3606(Static7.method110(Static189.aClass4_Sub10_Sub1_2)));
									if (local2004 == 2 || local2004 == 3) {
										Static186.method4394("<img=1>" + Static216.method3514(local1598), 7, local2663);
									} else if (local2004 == 1) {
										Static186.method4394("<img=0>" + Static216.method3514(local1598), 7, local2663);
									} else {
										Static186.method4394(Static216.method3514(local1598), 3, local2663);
									}
								}
								Static34.anInt552 = -1;
								return true;
							} else if (Static34.anInt552 == 89) {
								local130 = Static189.aClass4_Sub10_Sub1_2.method4672();
								local184 = Static189.aClass4_Sub10_Sub1_2.method4632();
								local409 = Static189.aClass4_Sub10_Sub1_2.method4657();
								if (Static289.method4418(local130)) {
									@Pc(2747) Class4_Sub27 local2747 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local184);
									local425 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local409);
									if (local425 != null) {
										Static203.method3259(local2747 == null || local425.anInt4621 != local2747.anInt4621, local425);
									}
									if (local2747 != null) {
										local2747.method4854();
										Static148.aClass85_13.method1841(local2747, (long) local409);
									}
									@Pc(2788) Class189 local2788 = Static114.method1814(local184);
									if (local2788 != null) {
										Static205.method3283(local2788);
									}
									local2788 = Static114.method1814(local409);
									if (local2788 != null) {
										Static205.method3283(local2788);
										Static272.method4288(true, local2788);
									}
									if (Static107.anInt5399 != -1) {
										Static205.method3290(Static107.anInt5399, 1);
									}
								}
								Static34.anInt552 = -1;
								return true;
							} else {
								@Pc(2939) String local2939;
								if (Static34.anInt552 == 246) {
									local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
									Static189.aClass4_Sub10_Sub1_2.method4674();
									local485 = Static189.aClass4_Sub10_Sub1_2.method4659();
									local2573 = Static189.aClass4_Sub10_Sub1_2.method4653();
									local1015 = Static189.aClass4_Sub10_Sub1_2.method4655();
									@Pc(2855) long local2855 = (local2573 << 32) + local1015;
									local1663 = Static189.aClass4_Sub10_Sub1_2.method4666();
									@Pc(2861) boolean local2861 = false;
									@Pc(2863) int local2863 = 0;
									label1702: while (true) {
										if (local2863 < 100) {
											if (Static153.aLongArray24[local2863] != local2855) {
												local2863++;
												continue;
											}
											local2861 = true;
											break;
										}
										if (local1663 <= 1) {
											if (Static42.aBoolean47 && !Static207.aBoolean287 || Static60.aBoolean67) {
												local2861 = true;
											} else {
												for (local2863 = 0; local2863 < Static239.anInt4517; local2863++) {
													if (local1598 == Static132.aLongArray16[local2863]) {
														local2861 = true;
														break label1702;
													}
												}
											}
										}
										break;
									}
									if (!local2861 && Static112.anInt5406 == 0) {
										Static153.aLongArray24[Static36.anInt595] = local2855;
										Static36.anInt595 = (Static36.anInt595 + 1) % 100;
										local2939 = Static97.method2272(Static225.method3606(Static7.method110(Static189.aClass4_Sub10_Sub1_2)));
										if (local1663 == 2 || local1663 == 3) {
											Static187.method2995("<img=1>" + Static216.method3514(local1598), Static216.method3514(local485), local2939);
										} else if (local1663 == 1) {
											Static187.method2995("<img=0>" + Static216.method3514(local1598), Static216.method3514(local485), local2939);
										} else {
											Static187.method2995(Static216.method3514(local1598), Static216.method3514(local485), local2939);
										}
									}
									Static34.anInt552 = -1;
									return true;
								} else if (Static34.anInt552 == 90) {
									local130 = Static189.aClass4_Sub10_Sub1_2.method4625();
									local184 = Static189.aClass4_Sub10_Sub1_2.method4667();
									local409 = Static189.aClass4_Sub10_Sub1_2.method4667();
									local217 = Static189.aClass4_Sub10_Sub1_2.method4672();
									local221 = Static189.aClass4_Sub10_Sub1_2.method4657();
									if (Static289.method4418(local409)) {
										Static63.method1019(local184, local130, local217, local221);
									}
									Static34.anInt552 = -1;
									return true;
								} else if (Static34.anInt552 == 130) {
									local130 = Static189.aClass4_Sub10_Sub1_2.method4660();
									local184 = Static189.aClass4_Sub10_Sub1_2.method4626();
									local409 = Static189.aClass4_Sub10_Sub1_2.method4666();
									Static281.anInt5335 = local409 >> 1;
									Static154.aClass53_Sub1_Sub1_2.method1174(local130, (local409 & 0x1) == 1, local184);
									Static34.anInt552 = -1;
									return true;
								} else if (Static34.anInt552 == 172) {
									local130 = Static189.aClass4_Sub10_Sub1_2.method4657();
									local184 = Static189.aClass4_Sub10_Sub1_2.method4613();
									local409 = Static189.aClass4_Sub10_Sub1_2.method4625();
									if (Static289.method4418(local409)) {
										Static315.method4861(local130, local184);
									}
									Static34.anInt552 = -1;
									return true;
								} else if (Static34.anInt552 == 103) {
									local130 = Static189.aClass4_Sub10_Sub1_2.method4632();
									Static6.aClass185_2 = Static276.aClass139_4.method3499(local130);
									Static34.anInt552 = -1;
									return true;
								} else if (Static34.anInt552 == 242) {
									local130 = Static189.aClass4_Sub10_Sub1_2.method4666();
									local184 = Static189.aClass4_Sub10_Sub1_2.method4672();
									if (Static289.method4418(local184)) {
										Static212.anInt4166 = local130;
									}
									Static34.anInt552 = -1;
									return true;
								} else {
									@Pc(3297) boolean local3297;
									@Pc(3299) int local3299;
									if (Static34.anInt552 == 2) {
										Static137.anInt2616 = Static261.anInt4980;
										local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
										if (local1598 == 0L) {
											Static86.aString108 = null;
											Static164.anInt3260 = 0;
											Static237.aString275 = null;
											Static34.anInt552 = -1;
											Static255.aClass4_Sub15Array1 = null;
											return true;
										}
										local485 = Static189.aClass4_Sub10_Sub1_2.method4659();
										Static86.aString108 = Static282.method4356(local485);
										Static237.aString275 = Static282.method4356(local1598);
										Static172.aByte6 = Static189.aClass4_Sub10_Sub1_2.method4674();
										local221 = Static189.aClass4_Sub10_Sub1_2.method4666();
										if (local221 == 255) {
											Static34.anInt552 = -1;
											return true;
										}
										Static164.anInt3260 = local221;
										@Pc(3217) Class4_Sub15[] local3217 = new Class4_Sub15[100];
										for (local2004 = 0; local2004 < Static164.anInt3260; local2004++) {
											local3217[local2004] = new Class4_Sub15();
											local3217[local2004].aLong217 = Static189.aClass4_Sub10_Sub1_2.method4659();
											local3217[local2004].aString182 = Static282.method4356(local3217[local2004].aLong217);
											local3217[local2004].anInt2988 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local3217[local2004].aByte5 = Static189.aClass4_Sub10_Sub1_2.method4674();
											local3217[local2004].aString181 = Static189.aClass4_Sub10_Sub1_2.method4630();
											if (Static28.aLong23 == local3217[local2004].aLong217) {
												Static185.aByte13 = local3217[local2004].aByte5;
											}
										}
										local1663 = Static164.anInt3260;
										while (local1663 > 0) {
											local1663--;
											local3297 = true;
											for (local3299 = 0; local3299 < local1663; local3299++) {
												if (local3217[local3299].aString182.compareTo(local3217[local3299 + 1].aString182) > 0) {
													@Pc(3321) Class4_Sub15 local3321 = local3217[local3299];
													local3217[local3299] = local3217[local3299 + 1];
													local3217[local3299 + 1] = local3321;
													local3297 = false;
												}
											}
											if (local3297) {
												break;
											}
										}
										Static34.anInt552 = -1;
										Static255.aClass4_Sub15Array1 = local3217;
										return true;
									} else if (Static34.anInt552 == 173) {
										Static141.method4726(Static276.aClass139_4, Static21.anInt1052, Static189.aClass4_Sub10_Sub1_2);
										Static34.anInt552 = -1;
										return true;
									} else if (Static34.anInt552 == 115 || Static34.anInt552 == 111 || Static34.anInt552 == 17 || Static34.anInt552 == 144 || Static34.anInt552 == 114 || Static34.anInt552 == 133 || Static34.anInt552 == 47 || Static34.anInt552 == 158 || Static34.anInt552 == 105 || Static34.anInt552 == 120 || Static34.anInt552 == 60 || Static34.anInt552 == 179 || Static34.anInt552 == 232 || Static34.anInt552 == 131) {
										Static312.method4826();
										Static34.anInt552 = -1;
										return true;
									} else if (Static34.anInt552 == 113) {
										local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
										local184 = Static189.aClass4_Sub10_Sub1_2.method4624();
										local409 = Static189.aClass4_Sub10_Sub1_2.method4625();
										local217 = Static189.aClass4_Sub10_Sub1_2.method4625();
										local221 = Static189.aClass4_Sub10_Sub1_2.method4625();
										if (Static289.method4418(local217)) {
											Static214.method3484(7, local130, local184, local409 << 16 | local221);
										}
										Static34.anInt552 = -1;
										return true;
									} else {
										@Pc(3709) String local3709;
										if (Static34.anInt552 == 182) {
											local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local217 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local487 = true;
											if (local1598 < 0L) {
												local487 = false;
												local1598 &= Long.MAX_VALUE;
											}
											local621 = "";
											if (local409 > 0) {
												local621 = Static189.aClass4_Sub10_Sub1_2.method4630();
											}
											@Pc(3518) String local3518 = Static216.method3514(local1598);
											for (local1653 = 0; local1653 < Static272.anInt5215; local1653++) {
												if (Static285.aLongArray54[local1653] == local1598) {
													if (local409 != Static157.anIntArray293[local1653]) {
														Static157.anIntArray293[local1653] = local409;
														if (local409 > 0) {
															Static186.method4394("", 5, local3518 + Static214.aString249);
														}
														if (local409 == 0) {
															Static186.method4394("", 5, local3518 + Static210.aString224);
														}
													}
													Static150.aStringArray22[local1653] = local621;
													Static251.anIntArray517[local1653] = local217;
													Static81.aBooleanArray7[local1653] = local487;
													local3518 = null;
													break;
												}
											}
											if (local3518 != null && Static272.anInt5215 < 200) {
												Static285.aLongArray54[Static272.anInt5215] = local1598;
												Static181.aStringArray23[Static272.anInt5215] = local3518;
												Static157.anIntArray293[Static272.anInt5215] = local409;
												Static150.aStringArray22[Static272.anInt5215] = local621;
												Static251.anIntArray517[Static272.anInt5215] = local217;
												Static81.aBooleanArray7[Static272.anInt5215] = local487;
												Static272.anInt5215++;
											}
											Static98.anInt2102 = Static261.anInt4980;
											local1663 = Static272.anInt5215;
											while (local1663 > 0) {
												@Pc(3651) boolean local3651 = true;
												local1663--;
												for (local3299 = 0; local3299 < local1663; local3299++) {
													if (Static157.anIntArray293[local3299] != Static254.anInt4847 && Static254.anInt4847 == Static157.anIntArray293[local3299 + 1] || Static157.anIntArray293[local3299] == 0 && Static157.anIntArray293[local3299 + 1] != 0) {
														local3651 = false;
														local2585 = Static157.anIntArray293[local3299];
														Static157.anIntArray293[local3299] = Static157.anIntArray293[local3299 + 1];
														Static157.anIntArray293[local3299 + 1] = local2585;
														local3709 = Static150.aStringArray22[local3299];
														Static150.aStringArray22[local3299] = Static150.aStringArray22[local3299 + 1];
														Static150.aStringArray22[local3299 + 1] = local3709;
														local2939 = Static181.aStringArray23[local3299];
														Static181.aStringArray23[local3299] = Static181.aStringArray23[local3299 + 1];
														Static181.aStringArray23[local3299 + 1] = local2939;
														@Pc(3745) long local3745 = Static285.aLongArray54[local3299];
														Static285.aLongArray54[local3299] = Static285.aLongArray54[local3299 + 1];
														Static285.aLongArray54[local3299 + 1] = local3745;
														@Pc(3763) int local3763 = Static251.anIntArray517[local3299];
														Static251.anIntArray517[local3299] = Static251.anIntArray517[local3299 + 1];
														Static251.anIntArray517[local3299 + 1] = local3763;
														@Pc(3781) boolean local3781 = Static81.aBooleanArray7[local3299];
														Static81.aBooleanArray7[local3299] = Static81.aBooleanArray7[local3299 + 1];
														Static81.aBooleanArray7[local3299 + 1] = local3781;
													}
												}
												if (local3651) {
													break;
												}
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 225) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4625();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4642();
											if (Static289.method4418(local184)) {
												if (local409 == 2) {
													Static89.method1557();
												}
												Static107.anInt5399 = local130;
												Static15.method230(local130);
												Static50.method777(false);
												Static71.method1102(Static107.anInt5399);
												for (local217 = 0; local217 < 100; local217++) {
													Static85.aBooleanArray8[local217] = true;
												}
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 156) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											if (Static289.method4418(local130)) {
												Static3.method11();
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 229) {
											for (local130 = 0; local130 < Static182.aClass53_Sub1_Sub1Array1.length; local130++) {
												if (Static182.aClass53_Sub1_Sub1Array1[local130] != null) {
													Static182.aClass53_Sub1_Sub1Array1[local130].anInt4007 = -1;
												}
											}
											for (local130 = 0; local130 < Static110.aClass53_Sub1_Sub2Array1.length; local130++) {
												if (Static110.aClass53_Sub1_Sub2Array1[local130] != null) {
													Static110.aClass53_Sub1_Sub2Array1[local130].anInt4007 = -1;
												}
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 78) {
											Static51.method778();
											Static138.method2063();
											Static34.anInt552 = -1;
											Static42.anInt788 += 32;
											return true;
										} else if (Static34.anInt552 == 177) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local184 = local130 >> 5;
											local409 = local130 & 0x1F;
											if (local409 == 0) {
												Static305.aClass95Array1[local184] = null;
												Static34.anInt552 = -1;
												return true;
											}
											@Pc(3976) Class95 local3976 = new Class95();
											local3976.anInt2561 = local409;
											local3976.anInt2559 = Static189.aClass4_Sub10_Sub1_2.method4666();
											if (local3976.anInt2559 >= 0 && local3976.anInt2559 < Static241.aClass4_Sub3_Sub14Array11.length) {
												if (local3976.anInt2561 == 1 || local3976.anInt2561 == 10) {
													local3976.anInt2560 = Static189.aClass4_Sub10_Sub1_2.method4653();
													Static189.aClass4_Sub10_Sub1_2.anInt5713 += 5;
												} else if (local3976.anInt2561 >= 2 && local3976.anInt2561 <= 6) {
													if (local3976.anInt2561 == 2) {
														local3976.anInt2564 = 64;
														local3976.anInt2568 = 64;
													}
													if (local3976.anInt2561 == 3) {
														local3976.anInt2568 = 64;
														local3976.anInt2564 = 0;
													}
													if (local3976.anInt2561 == 4) {
														local3976.anInt2564 = 128;
														local3976.anInt2568 = 64;
													}
													if (local3976.anInt2561 == 5) {
														local3976.anInt2564 = 64;
														local3976.anInt2568 = 0;
													}
													if (local3976.anInt2561 == 6) {
														local3976.anInt2568 = 128;
														local3976.anInt2564 = 64;
													}
													local3976.anInt2561 = 2;
													local3976.anInt2558 = Static189.aClass4_Sub10_Sub1_2.method4653();
													local3976.anInt2565 = Static189.aClass4_Sub10_Sub1_2.method4653();
													local3976.anInt2567 = Static189.aClass4_Sub10_Sub1_2.method4666();
													local3976.anInt2562 = Static189.aClass4_Sub10_Sub1_2.method4653();
												}
												local3976.anInt2563 = Static189.aClass4_Sub10_Sub1_2.method4653();
												if (local3976.anInt2563 == 65535) {
													local3976.anInt2563 = -1;
												}
												Static305.aClass95Array1[local184] = local3976;
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 136) {
											Static300.method4559();
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 155) {
											Static262.method4126(true);
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 75) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4625();
											local481 = Static189.aClass4_Sub10_Sub1_2.method4630();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4625();
											if (Static289.method4418(local130)) {
												Static244.method3816(local481, local409);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 137) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4672();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4666();
											Static224.method3587(local184, local130);
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 72) {
											Static225.anInt4330 = Static189.aClass4_Sub10_Sub1_2.method4672() * 30;
											Static16.anInt925 = Static261.anInt4980;
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 26) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4620();
											@Pc(4232) Class189 local4232 = Static114.method1814(local130);
											for (local409 = 0; local409 < local4232.anIntArray660.length; local409++) {
												local4232.anIntArray660[local409] = -1;
												local4232.anIntArray660[local409] = 0;
											}
											Static205.method3283(local4232);
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 99) {
											local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
											Static189.aClass4_Sub10_Sub1_2.method4674();
											local485 = Static189.aClass4_Sub10_Sub1_2.method4659();
											local2573 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local1015 = Static189.aClass4_Sub10_Sub1_2.method4655();
											@Pc(4295) long local4295 = (local2573 << 32) + local1015;
											local1663 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local3299 = Static189.aClass4_Sub10_Sub1_2.method4653();
											@Pc(4305) boolean local4305 = false;
											@Pc(4307) int local4307 = 0;
											label1529: while (true) {
												if (local4307 < 100) {
													if (Static153.aLongArray24[local4307] != local4295) {
														local4307++;
														continue;
													}
													local4305 = true;
													break;
												}
												if (local1663 <= 1) {
													for (local4307 = 0; local4307 < Static239.anInt4517; local4307++) {
														if (local1598 == Static132.aLongArray16[local4307]) {
															local4305 = true;
															break label1529;
														}
													}
												}
												break;
											}
											if (!local4305 && Static112.anInt5406 == 0) {
												Static153.aLongArray24[Static36.anInt595] = local4295;
												Static36.anInt595 = (Static36.anInt595 + 1) % 100;
												@Pc(4375) String local4375 = Static190.method3004(local3299).method1910(Static189.aClass4_Sub10_Sub1_2);
												if (local1663 == 2 || local1663 == 3) {
													Static181.method2940("<img=1>" + Static216.method3514(local1598), local3299, Static216.method3514(local485), 20, local4375);
												} else if (local1663 == 1) {
													Static181.method2940("<img=0>" + Static216.method3514(local1598), local3299, Static216.method3514(local485), 20, local4375);
												} else {
													Static181.method2940(Static216.method3514(local1598), local3299, Static216.method3514(local485), 20, local4375);
												}
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 237) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4672();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4667();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4672();
											local217 = Static189.aClass4_Sub10_Sub1_2.method4620();
											if (local217 >> 30 == 0) {
												@Pc(4605) Class112 local4605;
												@Pc(4627) Class46 local4627;
												@Pc(4632) Class46 local4632;
												@Pc(4610) Class112 local4610;
												@Pc(4663) Class46 local4663;
												if (local217 >> 29 != 0) {
													local221 = local217 & 0xFFFF;
													@Pc(4809) Class53_Sub1_Sub2 local4809 = Static110.aClass53_Sub1_Sub2Array1[local221];
													if (local4809 != null) {
														if (local130 == 65535) {
															local130 = -1;
														}
														local3297 = true;
														if (local130 != -1 && local4809.anInt3961 != -1) {
															if (local130 == local4809.anInt3961) {
																local4605 = Static132.method2005(local130);
																if (local4605.aBoolean222 && local4605.anInt3134 != -1) {
																	local4663 = Static156.method2501(local4605.anInt3134);
																	local3299 = local4663.anInt1238;
																	if (local3299 == 1) {
																		local3297 = false;
																		local4809.anInt3984 = Static50.anInt954 + local184;
																		local4809.anInt4026 = 0;
																		local4809.anInt3976 = 1;
																		local4809.anInt3968 = 0;
																		local4809.anInt3989 = 0;
																		Static213.method3474(local4663, local4809.anInt4002, local4809.anInt3974, local4809.anInt4026, false);
																	} else if (local3299 == 2) {
																		local4809.anInt4001 = 0;
																		local3297 = false;
																	}
																}
															} else {
																local4605 = Static132.method2005(local130);
																local4610 = Static132.method2005(local4809.anInt3961);
																if (local4605.anInt3134 != -1 && local4610.anInt3134 != -1) {
																	local4627 = Static156.method2501(local4605.anInt3134);
																	local4632 = Static156.method2501(local4610.anInt3134);
																	if (local4627.anInt1243 < local4632.anInt1243) {
																		local3297 = false;
																	}
																}
															}
														}
														if (local3297) {
															local4809.anInt3961 = local130;
															local4809.anInt4026 = 0;
															local4809.anInt3976 = 1;
															local4809.anInt3971 = local409;
															local4809.anInt3968 = 0;
															local4809.anInt3984 = local184 + Static50.anInt954;
															if (local4809.anInt3984 > Static50.anInt954) {
																local4809.anInt4026 = -1;
															}
															if (local4809.anInt3961 != -1 && Static50.anInt954 == local4809.anInt3984) {
																local1653 = Static132.method2005(local4809.anInt3961).anInt3134;
																if (local1653 != -1) {
																	local4663 = Static156.method2501(local1653);
																	if (local4663 != null && local4663.anIntArray95 != null) {
																		Static213.method3474(local4663, local4809.anInt4002, local4809.anInt3974, 0, false);
																	}
																}
															}
														}
													}
												} else if (local217 >> 28 != 0) {
													local221 = local217 & 0xFFFF;
													@Pc(4569) Class53_Sub1_Sub1 local4569;
													if (Static273.anInt2022 == local221) {
														local4569 = Static154.aClass53_Sub1_Sub1_2;
													} else {
														local4569 = Static182.aClass53_Sub1_Sub1Array1[local221];
													}
													if (local4569 != null) {
														if (local130 == 65535) {
															local130 = -1;
														}
														local3297 = true;
														if (local130 != -1 && local4569.anInt3961 != -1) {
															if (local130 == local4569.anInt3961) {
																local4605 = Static132.method2005(local130);
																if (local4605.aBoolean222 && local4605.anInt3134 != -1) {
																	local4663 = Static156.method2501(local4605.anInt3134);
																	local3299 = local4663.anInt1238;
																	if (local3299 == 1) {
																		local4569.anInt4026 = 0;
																		local4569.anInt3968 = 0;
																		local4569.anInt3976 = 1;
																		local3297 = false;
																		local4569.anInt3984 = local184 + Static50.anInt954;
																		local4569.anInt3989 = 0;
																		Static213.method3474(local4663, local4569.anInt4002, local4569.anInt3974, local4569.anInt4026, false);
																	} else if (local3299 == 2) {
																		local4569.anInt4001 = 0;
																		local3297 = false;
																	}
																}
															} else {
																local4605 = Static132.method2005(local130);
																local4610 = Static132.method2005(local4569.anInt3961);
																if (local4605.anInt3134 != -1 && local4610.anInt3134 != -1) {
																	local4627 = Static156.method2501(local4605.anInt3134);
																	local4632 = Static156.method2501(local4610.anInt3134);
																	if (local4627.anInt1243 < local4632.anInt1243) {
																		local3297 = false;
																	}
																}
															}
														}
														if (local3297) {
															local4569.anInt3968 = 0;
															local4569.anInt3976 = 1;
															local4569.anInt3984 = Static50.anInt954 + local184;
															local4569.anInt3971 = local409;
															local4569.anInt4026 = 0;
															local4569.anInt3961 = local130;
															if (local4569.anInt3984 > Static50.anInt954) {
																local4569.anInt4026 = -1;
															}
															if (local4569.anInt3961 == 65535) {
																local4569.anInt3961 = -1;
															}
															if (local4569.anInt3961 != -1 && local4569.anInt3984 == Static50.anInt954) {
																local1653 = Static132.method2005(local4569.anInt3961).anInt3134;
																if (local1653 != -1) {
																	local4663 = Static156.method2501(local1653);
																	if (local4663 != null && local4663.anIntArray95 != null) {
																		Static213.method3474(local4663, local4569.anInt4002, local4569.anInt3974, 0, local4569 == Static154.aClass53_Sub1_Sub1_2);
																	}
																}
															}
														}
													}
												}
											} else {
												local221 = local217 >> 28 & 0x3;
												local213 = (local217 >> 14 & 0x3FFF) - Static220.anInt3983;
												local2004 = (local217 & 0x3FFF) - Static295.anInt5480;
												if (local213 >= 0 && local2004 >= 0 && local213 < 104 && local2004 < 104) {
													local2004 = local2004 * 128 + 64;
													local213 = local213 * 128 + 64;
													@Pc(4539) Class53_Sub5 local4539 = new Class53_Sub5(local130, local221, local213, local2004, Static33.method522(local2004, local213, local221) - local409, local184, Static50.anInt954);
													Static73.aClass114_8.method2625(new Class4_Sub3_Sub6(local4539));
												}
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 151) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local217 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local221 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local213 = Static189.aClass4_Sub10_Sub1_2.method4666();
											if (Static289.method4418(local130)) {
												Static310.method4810(local221, local184, local213, local217, true, local409);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 116) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4667();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4667();
											local1865 = Static189.aClass4_Sub10_Sub1_2.method4630();
											if (Static289.method4418(local184)) {
												Static244.method3816(local1865, local130);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 222) {
											local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
											local485 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local2573 = Static189.aClass4_Sub10_Sub1_2.method4655();
											local2004 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local1653 = Static189.aClass4_Sub10_Sub1_2.method4653();
											@Pc(5131) boolean local5131 = false;
											@Pc(5137) long local5137 = (local485 << 32) + local2573;
											@Pc(5139) int local5139 = 0;
											label1545: while (true) {
												if (local5139 < 100) {
													if (local5137 != Static153.aLongArray24[local5139]) {
														local5139++;
														continue;
													}
													local5131 = true;
													break;
												}
												if (local2004 <= 1) {
													for (local5139 = 0; local5139 < Static239.anInt4517; local5139++) {
														if (Static132.aLongArray16[local5139] == local1598) {
															local5131 = true;
															break label1545;
														}
													}
												}
												break;
											}
											if (!local5131 && Static112.anInt5406 == 0) {
												Static153.aLongArray24[Static36.anInt595] = local5137;
												Static36.anInt595 = (Static36.anInt595 + 1) % 100;
												local3709 = Static190.method3004(local1653).method1910(Static189.aClass4_Sub10_Sub1_2);
												if (local2004 == 2) {
													Static181.method2940("<img=1>" + Static216.method3514(local1598), local1653, null, 18, local3709);
												} else if (local2004 == 1) {
													Static181.method2940("<img=0>" + Static216.method3514(local1598), local1653, null, 18, local3709);
												} else {
													Static181.method2940(Static216.method3514(local1598), local1653, null, 18, local3709);
												}
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 46) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local217 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local221 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local213 = Static189.aClass4_Sub10_Sub1_2.method4653();
											if (Static289.method4418(local130)) {
												Static137.aBooleanArray13[local184] = true;
												Static293.anIntArray625[local184] = local409;
												Static295.anIntArray626[local184] = local217;
												Static6.anIntArray13[local184] = local221;
												Static6.anIntArray14[local184] = local213;
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 153) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											if (local130 == 65535) {
												local130 = -1;
											}
											local184 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local217 = Static189.aClass4_Sub10_Sub1_2.method4666();
											Static75.method1227(local409, local130, local184, local217);
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 135) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4632();
											if (Static289.method4418(local130)) {
												@Pc(5392) Class4_Sub27 local5392 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local184);
												if (local5392 != null) {
													Static203.method3259(true, local5392);
												}
												if (Static252.aClass189_14 != null) {
													Static205.method3283(Static252.aClass189_14);
													Static252.aClass189_14 = null;
												}
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 40) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4657();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4672();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4666();
											if (Static289.method4418(local184)) {
												Static269.method3010(local130, local409);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 23) {
											Static289.anInt5414 = Static189.aClass4_Sub10_Sub1_2.method4666();
											Static253.anInt4838 = Static189.aClass4_Sub10_Sub1_2.method4666();
											Static263.anInt5017 = Static189.aClass4_Sub10_Sub1_2.method4666();
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 168) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											Static133.method2011(local130);
											Static306.anIntArray656[Static51.anInt959++ & 0x1F] = local130 & 0x7FFF;
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 52) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											if (Static289.method4418(local130)) {
												Static160.method2576();
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 38) {
											@Pc(5517) byte local5517 = Static189.aClass4_Sub10_Sub1_2.method4674();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4672();
											Static10.method173(local184, local5517);
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 194) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4632();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4653();
											if (local130 < -70000) {
												local184 += 32768;
											}
											if (local130 < 0) {
												local193 = null;
											} else {
												local193 = Static114.method1814(local130);
											}
											if (local193 != null) {
												for (local217 = 0; local217 < local193.anIntArray660.length; local217++) {
													local193.anIntArray660[local217] = 0;
													local193.anIntArray661[local217] = 0;
												}
											}
											Static292.method4444(local184);
											local217 = Static189.aClass4_Sub10_Sub1_2.method4653();
											for (local221 = 0; local221 < local217; local221++) {
												local213 = Static189.aClass4_Sub10_Sub1_2.method4653();
												local2004 = Static189.aClass4_Sub10_Sub1_2.method4626();
												if (local2004 == 255) {
													local2004 = Static189.aClass4_Sub10_Sub1_2.method4632();
												}
												if (local193 != null && local221 < local193.anIntArray660.length) {
													local193.anIntArray660[local221] = local213;
													local193.anIntArray661[local221] = local2004;
												}
												Static185.method2985(local184, local221, local213 - 1, local2004);
											}
											if (local193 != null) {
												Static205.method3283(local193);
											}
											Static138.method2063();
											Static306.anIntArray656[Static51.anInt959++ & 0x1F] = local184 & 0x7FFF;
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 150) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4667();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4626();
											@Pc(5699) Class53_Sub1_Sub2 local5699 = Static110.aClass53_Sub1_Sub2Array1[local184];
											if (local5699 != null) {
												Static34.method529(local130, local5699, local409);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 93) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local217 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local221 = Static189.aClass4_Sub10_Sub1_2.method4666();
											local213 = Static189.aClass4_Sub10_Sub1_2.method4666();
											if (Static289.method4418(local130)) {
												Static157.method2549(local217, local221, local184, local409, local213);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 166) {
											Static189.aClass4_Sub10_Sub1_2.anInt5713 += 28;
											if (Static189.aClass4_Sub10_Sub1_2.method4638()) {
												Static20.method281(Static189.aClass4_Sub10_Sub1_2.anInt5713 - 28, Static189.aClass4_Sub10_Sub1_2);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 42) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4625();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4667();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4625();
											if (Static289.method4418(local130)) {
												Static99.method1654(local409, local184);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 18) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4672();
											if (local130 == 65535) {
												local130 = -1;
											}
											local184 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4632();
											if (Static289.method4418(local184)) {
												Static214.method3484(2, -1, local409, local130);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 43) {
											Static239.anInt4517 = Static21.anInt1052 / 8;
											for (local130 = 0; local130 < Static239.anInt4517; local130++) {
												Static132.aLongArray16[local130] = Static189.aClass4_Sub10_Sub1_2.method4659();
												Static130.aStringArray18[local130] = Static226.method423(Static132.aLongArray16[local130]);
												Static60.aBooleanArray5[local130] = false;
											}
											Static34.anInt552 = -1;
											Static98.anInt2102 = Static261.anInt4980;
											return true;
										} else if (Static34.anInt552 == 221) {
											local1598 = Static189.aClass4_Sub10_Sub1_2.method4659();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4653();
											@Pc(5920) String local5920 = Static190.method3004(local409).method1910(Static189.aClass4_Sub10_Sub1_2);
											Static181.method2940(Static216.method3514(local1598), local409, null, 19, local5920);
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 199) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4620();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4653();
											if (Static289.method4418(local184)) {
												local409 = 0;
												if (Static154.aClass53_Sub1_Sub1_2.aClass147_2 != null) {
													local409 = Static154.aClass53_Sub1_Sub1_2.aClass147_2.method3648();
												}
												Static214.method3484(3, -1, local130, local409);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 243) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4653();
											local184 = Static189.aClass4_Sub10_Sub1_2.method4620();
											local409 = Static189.aClass4_Sub10_Sub1_2.method4625();
											if (Static289.method4418(local409)) {
												Static45.method722(local184, local130);
											}
											Static34.anInt552 = -1;
											return true;
										} else if (Static34.anInt552 == 19) {
											local130 = Static189.aClass4_Sub10_Sub1_2.method4666();
											if (Static189.aClass4_Sub10_Sub1_2.method4666() == 0) {
												Static20.aClass163Array1[local130] = new Class163();
											} else {
												Static189.aClass4_Sub10_Sub1_2.anInt5713--;
												Static20.aClass163Array1[local130] = new Class163(Static189.aClass4_Sub10_Sub1_2);
											}
											Static34.anInt552 = -1;
											Static262.anInt4997 = Static261.anInt4980;
											return true;
										} else {
											Static193.method3072(null, "T1 - " + Static34.anInt552 + "," + Static113.anInt2273 + "," + Static63.anInt1231 + " - " + Static21.anInt1052);
											Static115.method1819();
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
