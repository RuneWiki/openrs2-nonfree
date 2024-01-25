import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!go", name = "w", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array5;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "Lclient!em;")
	public static Class68 aClass68_4 = null;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	public static int anInt2821 = 0;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_25 = new Class14();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIZLclient!vf;II)V")
	public static void method2230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class250 arg4, @OriginalArg(5) int arg5) {
		if (Static66.anInt133 >= 50 || (arg4 == null || arg4.anIntArrayArray60 == null || arg4.anIntArrayArray60.length <= arg5 || arg4.anIntArrayArray60[arg5] == null)) {
			return;
		}
		@Pc(43) int local43 = arg4.anIntArrayArray60[arg5][0];
		@Pc(47) int local47 = local43 >> 8;
		@Pc(53) int local53 = local43 >> 5 & 0x7;
		@Pc(57) int local57 = local43 & 0x1F;
		@Pc(76) int local76;
		if (arg4.anIntArrayArray60[arg5].length > 1) {
			local76 = (int) (Math.random() * (double) arg4.anIntArrayArray60[arg5].length);
			if (local76 > 0) {
				local47 = arg4.anIntArrayArray60[arg5][local76];
			}
		}
		if (local57 == 0) {
			if (arg3) {
				Static346.method4765(local47, local53, 0, 255);
			}
		} else if (Static12.aClass79_Sub1_1.anInt4915 != 0) {
			local76 = arg0 - 64 >> 7;
			@Pc(121) int local121 = arg1 - 64 >> 7;
			Static62.aClass218Array1[Static66.anInt133++] = new Class218((byte) 1, local47, local53, 0, 255, (arg2 << 24) + (local76 << 16) + (local121 << 8) + local57);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IJ)V")
	public static void method2232(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	public static void method2234(@OriginalArg(0) int arg0) {
		if (Static16.method318(arg0)) {
			Static105.method1943(Static60.aClass68ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLclient!vc;)V")
	public static void method2235(@OriginalArg(1) Class2_Sub23_Sub2 arg0) {
		arg0.method5515();
		@Pc(14) int local14 = Static399.anInt6656;
		@Pc(24) Class3_Sub2_Sub1_Sub2 local24 = Static375.aClass3_Sub2_Sub1_Sub2_7 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local14] = new Class3_Sub2_Sub1_Sub2();
		local24.anInt6137 = local14;
		@Pc(32) int local32 = arg0.method5519(30);
		@Pc(37) byte local37 = (byte) (local32 >> 28);
		@Pc(43) int local43 = local32 >> 14 & 0x3FFF;
		@Pc(47) int local47 = local32 & 0x3FFF;
		local24.anIntArray525[0] = local43 - Static48.anInt962;
		local24.anInt6119 = (local24.anIntArray525[0] << 7) + (local24.method4935() << 6);
		local24.anIntArray524[0] = local47 - Static324.anInt5624;
		local24.anInt6121 = (local24.anIntArray524[0] << 7) + (local24.method4935() << 6);
		Static383.anInt6436 = local24.aByte89 = local37;
		if (Static316.aClass2_Sub23Array2[local14] != null) {
			local24.method4942(Static316.aClass2_Sub23Array2[local14]);
		}
		Static337.anInt5822 = 0;
		Static203.anIntArray384[Static337.anInt5822++] = local14;
		Static361.aByteArray118[local14] = 0;
		Static117.anInt2663 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local125 != local14) {
				@Pc(135) int local135 = arg0.method5519(18);
				@Pc(139) int local139 = local135 >> 16;
				@Pc(145) int local145 = local135 >> 8 & 0xFF;
				@Pc(149) int local149 = local135 & 0xFF;
				@Pc(157) Class224 local157 = Static171.aClass224Array1[local125] = new Class224();
				local157.anInt6251 = -1;
				local157.anInt6255 = 0;
				local157.anInt6249 = (local145 << 14) + ((local139 << 28) + local149);
				local157.aBoolean436 = false;
				Static376.anIntArray543[Static117.anInt2663++] = local125;
				Static361.aByteArray118[local125] = 0;
			}
		}
		arg0.method5513();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBZI)I")
	public static int method2236(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub38 local13 = Static448.method5748(arg2, arg1);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray513.length) {
			return local13.anIntArray513[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Lclient!tt;")
	public static Class219_Sub1 method2237() {
		Static34.anInt679 = 0;
		return Static96.method1837();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
	public static boolean method2243() throws IOException {
		if (Static34.aClass34_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static34.aClass34_2.method613();
		if (local13 == 0) {
			return false;
		}
		@Pc(67) int local67;
		if (Static138.aClass265_54 == null) {
			if (Static304.aBoolean390) {
				local13--;
				Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 1);
				Static304.aBoolean390 = false;
				Static203.anInt4633++;
			}
			Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
			if (Static438.aClass2_Sub23_Sub2_2.method5514()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static34.aClass34_2.method604(1, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 1);
				Static203.anInt4633++;
			}
			Static304.aBoolean390 = true;
			@Pc(63) Class265[] local63 = Static354.method4833();
			local67 = Static438.aClass2_Sub23_Sub2_2.method5524();
			if (local67 < 0 || local67 >= local63.length) {
				throw new IOException("invo:" + local67 + " ip:" + Static438.aClass2_Sub23_Sub2_2.anInt6952);
			}
			Static138.aClass265_54 = local63[local67];
			Static379.anInt6425 = Static138.aClass265_54.anInt7230;
		}
		if (Static379.anInt6425 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 1);
			local13--;
			Static379.anInt6425 = Static438.aClass2_Sub23_Sub2_2.aByteArray130[0] & 0xFF;
			Static203.anInt4633++;
		}
		if (Static379.anInt6425 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, 2);
			Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
			Static379.anInt6425 = Static438.aClass2_Sub23_Sub2_2.method5500();
			local13 -= 2;
			Static203.anInt4633 += 2;
		}
		if (local13 < Static379.anInt6425) {
			return false;
		}
		Static438.aClass2_Sub23_Sub2_2.anInt6952 = 0;
		Static34.aClass34_2.method604(0, Static438.aClass2_Sub23_Sub2_2.aByteArray130, Static379.anInt6425);
		Static317.aClass265_122 = Static171.aClass265_69;
		Static194.anInt3721 = 0;
		Static203.anInt4633 += Static379.anInt6425;
		Static171.aClass265_69 = Static365.aClass265_139;
		Static365.aClass265_139 = Static138.aClass265_54;
		if (Static121.aClass265_50 == Static138.aClass265_54) {
			Static78.method1461(true);
			Static138.aClass265_54 = null;
			return true;
		} else if (Static138.aClass265_54 == Static352.aClass265_135) {
			Static316.method4367(Static216.aClass214_22);
			Static138.aClass265_54 = null;
			return true;
		} else {
			@Pc(235) int local235;
			@Pc(239) int local239;
			@Pc(227) int local227;
			@Pc(250) Class2_Sub35 local250;
			if (Static185.aClass265_75 == Static138.aClass265_54) {
				local227 = Static438.aClass2_Sub23_Sub2_2.method5464();
				local67 = Static438.aClass2_Sub23_Sub2_2.method5468();
				local235 = Static438.aClass2_Sub23_Sub2_2.method5492();
				local239 = Static438.aClass2_Sub23_Sub2_2.method5460();
				if (Static391.method3868(local239)) {
					local250 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local67);
					if (local250 != null) {
						Static313.method4400(local250, local250.anInt5537 != local235, false);
					}
					Static144.method2415(local227, false, local235, local67);
				}
				Static138.aClass265_54 = null;
				return true;
			}
			@Pc(310) int local310;
			@Pc(294) String local294;
			@Pc(296) String local296;
			@Pc(290) boolean local290;
			@Pc(338) String local338;
			@Pc(312) boolean local312;
			if (Static138.aClass265_54 == Static20.aClass265_11) {
				local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
				local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
				local296 = local294;
				if (local290) {
					local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
				}
				local239 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local310 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local312 = false;
				if (local239 <= 1 && Static309.method4371(local296)) {
					local312 = true;
				}
				if (!local312 && Static68.anInt5456 == 0) {
					local338 = Static181.aClass71_1.method1830(local310).method3922(Static438.aClass2_Sub23_Sub2_2);
					if (local239 == 2) {
						Static8.method202(local310, "<img=1>" + local296, 25, 0, "<img=1>" + local294, null, local338);
					} else if (local239 == 1) {
						Static8.method202(local310, "<img=0>" + local296, 25, 0, "<img=0>" + local294, null, local338);
					} else {
						Static8.method202(local310, local296, 25, 0, local294, null, local338);
					}
				}
				Static138.aClass265_54 = null;
				return true;
			} else if (Static206.aClass265_83 == Static138.aClass265_54) {
				local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
				local67 = Static438.aClass2_Sub23_Sub2_2.method5492();
				local235 = Static438.aClass2_Sub23_Sub2_2.method5472();
				local239 = Static438.aClass2_Sub23_Sub2_2.method5492();
				if (Static391.method3868(local227)) {
					Static74.method1383((local239 << 16) + local67, local235);
				}
				Static138.aClass265_54 = null;
				return true;
			} else {
				@Pc(509) int local509;
				@Pc(613) boolean local613;
				@Pc(615) int local615;
				@Pc(633) Class81 local633;
				@Pc(608) int local608;
				if (Static138.aClass265_54 == Static320.aClass265_123) {
					Static379.anInt6423 = Static37.anInt715;
					if (Static379.anInt6425 == 0) {
						Static93.aClass81Array1 = null;
						Static170.aString39 = null;
						Static138.aClass265_54 = null;
						Static139.aString36 = null;
						Static107.anInt2532 = 0;
						return true;
					}
					Static139.aString36 = Static438.aClass2_Sub23_Sub2_2.method5494();
					local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
					if (local290) {
						Static438.aClass2_Sub23_Sub2_2.method5494();
					}
					@Pc(483) long local483 = Static438.aClass2_Sub23_Sub2_2.method5453();
					Static170.aString39 = Static302.method4326(local483);
					Static16.aByte6 = Static438.aClass2_Sub23_Sub2_2.method5484();
					local239 = Static438.aClass2_Sub23_Sub2_2.method5495();
					if (local239 == 255) {
						Static138.aClass265_54 = null;
						return true;
					}
					Static107.anInt2532 = local239;
					@Pc(507) Class81[] local507 = new Class81[100];
					for (local509 = 0; local509 < Static107.anInt2532; local509++) {
						local507[local509] = new Class81();
						local507[local509].aString32 = Static438.aClass2_Sub23_Sub2_2.method5494();
						local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
						if (local290) {
							local507[local509].aString31 = Static438.aClass2_Sub23_Sub2_2.method5494();
						} else {
							local507[local509].aString31 = local507[local509].aString32;
						}
						local507[local509].aString29 = Static259.method3902(local507[local509].aString31);
						local507[local509].anInt2582 = Static438.aClass2_Sub23_Sub2_2.method5500();
						local507[local509].aByte37 = Static438.aClass2_Sub23_Sub2_2.method5484();
						local507[local509].aString30 = Static438.aClass2_Sub23_Sub2_2.method5494();
						if (local507[local509].aString31.equals(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56)) {
							Static282.aByte78 = local507[local509].aByte37;
						}
					}
					local608 = Static107.anInt2532;
					while (local608 > 0) {
						local608--;
						local613 = true;
						for (local615 = 0; local615 < local608; local615++) {
							if (local507[local615].aString29.compareTo(local507[local615 + 1].aString29) > 0) {
								local633 = local507[local615];
								local507[local615] = local507[local615 + 1];
								local613 = false;
								local507[local615 + 1] = local633;
							}
						}
						if (local613) {
							break;
						}
					}
					Static93.aClass81Array1 = local507;
					Static138.aClass265_54 = null;
					return true;
				} else if (Static338.aClass265_143 == Static138.aClass265_54) {
					local227 = Static438.aClass2_Sub23_Sub2_2.method5452();
					local67 = Static438.aClass2_Sub23_Sub2_2.method5468();
					local235 = Static438.aClass2_Sub23_Sub2_2.method5460();
					if (Static391.method3868(local235)) {
						Static176.method187(local227, local67);
					}
					Static138.aClass265_54 = null;
					return true;
				} else if (Static398.aClass265_156 == Static138.aClass265_54) {
					Static106.method1966();
					Static138.aClass265_54 = null;
					return false;
				} else if (Static299.aClass265_116 == Static138.aClass265_54) {
					Static255.anInt4791 = Static438.aClass2_Sub23_Sub2_2.method5495();
					Static138.aClass265_54 = null;
					Static453.anInt7434 = Static37.anInt715;
					return true;
				} else if (Static72.aClass265_32 == Static138.aClass265_54) {
					Static316.method4367(Static278.aClass214_19);
					Static138.aClass265_54 = null;
					return true;
				} else if (Static376.aClass265_146 == Static138.aClass265_54) {
					local227 = Static438.aClass2_Sub23_Sub2_2.method5508();
					Static285.aClass138_9 = Static43.aClass59_5.method1350(local227);
					Static138.aClass265_54 = null;
					return true;
				} else if (Static138.aClass265_54 == Static185.aClass265_74) {
					Static316.method4367(Static402.aClass214_23);
					Static138.aClass265_54 = null;
					return true;
				} else if (Static425.aClass265_161 == Static138.aClass265_54) {
					Static438.aClass2_Sub23_Sub2_2.anInt6952 += 28;
					if (Static438.aClass2_Sub23_Sub2_2.method5491()) {
						Static105.method1942(Static438.aClass2_Sub23_Sub2_2, Static438.aClass2_Sub23_Sub2_2.anInt6952 - 28);
					}
					Static138.aClass265_54 = null;
					return true;
				} else if (Static138.aClass265_54 == Static366.aClass265_140) {
					Static316.method4367(Static391.aClass214_18);
					Static138.aClass265_54 = null;
					return true;
				} else if (Static138.aClass265_54 == Static56.aClass265_23) {
					local227 = Static438.aClass2_Sub23_Sub2_2.method5493();
					local67 = Static438.aClass2_Sub23_Sub2_2.method5464();
					Static344.aClass108_1.method2426(local67, local227);
					Static138.aClass265_54 = null;
					return true;
				} else if (Static138.aClass265_54 == Static385.aClass265_149) {
					for (local227 = 0; local227 < Static74.aClass3_Sub2_Sub1_Sub2Array1.length; local227++) {
						if (Static74.aClass3_Sub2_Sub1_Sub2Array1[local227] != null) {
							Static74.aClass3_Sub2_Sub1_Sub2Array1[local227].anInt6163 = -1;
						}
					}
					for (local67 = 0; local67 < Static174.aClass3_Sub2_Sub1_Sub1Array1.length; local67++) {
						if (Static174.aClass3_Sub2_Sub1_Sub1Array1[local67] != null) {
							Static174.aClass3_Sub2_Sub1_Sub1Array1[local67].anInt6163 = -1;
						}
					}
					Static138.aClass265_54 = null;
					return true;
				} else if (Static138.aClass265_54 == Static173.aClass265_71) {
					local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
					local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
					@Pc(876) Object[] local876 = new Object[local294.length() + 1];
					for (local239 = local294.length() - 1; local239 >= 0; local239--) {
						if (local294.charAt(local239) == 's') {
							local876[local239 + 1] = Static438.aClass2_Sub23_Sub2_2.method5494();
						} else {
							local876[local239 + 1] = Integer.valueOf(Static438.aClass2_Sub23_Sub2_2.method5508());
						}
					}
					local876[0] = Integer.valueOf(Static438.aClass2_Sub23_Sub2_2.method5508());
					if (Static391.method3868(local227)) {
						@Pc(931) Class2_Sub30 local931 = new Class2_Sub30();
						local931.anObjectArray35 = local876;
						Static168.method2731(local931);
					}
					Static138.aClass265_54 = null;
					return true;
				} else if (Static293.aClass265_113 == Static138.aClass265_54) {
					local227 = Static438.aClass2_Sub23_Sub2_2.method5472();
					local67 = Static438.aClass2_Sub23_Sub2_2.method5492();
					Static344.aClass108_1.method2426(local227, local67);
					Static138.aClass265_54 = null;
					return true;
				} else if (Static138.aClass265_54 == Static45.aClass265_19) {
					local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
					if (Static391.method3868(local227)) {
						Static408.method5377();
					}
					Static138.aClass265_54 = null;
					return true;
				} else {
					@Pc(1012) int local1012;
					@Pc(1016) int local1016;
					if (Static275.aClass265_105 == Static138.aClass265_54) {
						local227 = Static438.aClass2_Sub23_Sub2_2.method5452();
						local67 = local227 >> 2;
						local235 = local227 & 0x3;
						local239 = Static284.anIntArray418[local67];
						local310 = Static438.aClass2_Sub23_Sub2_2.method5505();
						local509 = local310 >> 28 & 0x3;
						local1012 = local310 >> 14 & 0x3FFF;
						local1016 = local310 & 0x3FFF;
						local608 = Static438.aClass2_Sub23_Sub2_2.method5493();
						if (local608 == 65535) {
							local608 = -1;
						}
						local1016 -= Static324.anInt5624;
						local1012 -= Static48.anInt962;
						Static258.method583(local67, local608, local235, local1012, local1016, local239, local509);
						Static138.aClass265_54 = null;
						return true;
					} else if (Static346.aClass265_134 == Static138.aClass265_54) {
						local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
						local67 = Static438.aClass2_Sub23_Sub2_2.method5508();
						local235 = Static438.aClass2_Sub23_Sub2_2.method5487();
						if (Static391.method3868(local227)) {
							Static232.method3612(local235, local67);
						}
						Static138.aClass265_54 = null;
						return true;
					} else if (Static138.aClass265_54 == Static389.aClass265_153) {
						Static176.anInt206 = Static438.aClass2_Sub23_Sub2_2.method5464();
						Static51.anInt1139 = Static438.aClass2_Sub23_Sub2_2.method5495();
						Static138.aClass265_54 = null;
						return true;
					} else if (Static138.aClass265_54 == Static290.aClass265_112) {
						local227 = Static438.aClass2_Sub23_Sub2_2.method5495();
						local67 = local227 >> 5;
						local235 = local227 & 0x1F;
						if (local235 == 0) {
							Static20.aClass237Array1[local67] = null;
							Static138.aClass265_54 = null;
							return true;
						}
						@Pc(1119) Class237 local1119 = new Class237();
						local1119.anInt6468 = local235;
						local1119.anInt6470 = Static438.aClass2_Sub23_Sub2_2.method5495();
						if (local1119.anInt6470 >= 0 && Static226.aClass17Array7.length > local1119.anInt6470) {
							if (local1119.anInt6468 == 1 || local1119.anInt6468 == 10) {
								local1119.anInt6464 = Static438.aClass2_Sub23_Sub2_2.method5500();
								Static438.aClass2_Sub23_Sub2_2.anInt6952 += 6;
							} else if (local1119.anInt6468 >= 2 && local1119.anInt6468 <= 6) {
								if (local1119.anInt6468 == 2) {
									local1119.anInt6458 = 64;
									local1119.anInt6459 = 64;
								}
								if (local1119.anInt6468 == 3) {
									local1119.anInt6459 = 0;
									local1119.anInt6458 = 64;
								}
								if (local1119.anInt6468 == 4) {
									local1119.anInt6459 = 128;
									local1119.anInt6458 = 64;
								}
								if (local1119.anInt6468 == 5) {
									local1119.anInt6458 = 0;
									local1119.anInt6459 = 64;
								}
								if (local1119.anInt6468 == 6) {
									local1119.anInt6458 = 128;
									local1119.anInt6459 = 64;
								}
								local1119.anInt6468 = 2;
								local1119.anInt6461 = Static438.aClass2_Sub23_Sub2_2.method5495();
								local1119.anInt6459 += Static438.aClass2_Sub23_Sub2_2.method5500() - Static48.anInt962 << 7;
								local1119.anInt6458 += Static438.aClass2_Sub23_Sub2_2.method5500() - Static324.anInt5624 << 7;
								local1119.anInt6460 = Static438.aClass2_Sub23_Sub2_2.method5495();
								local1119.anInt6465 = Static438.aClass2_Sub23_Sub2_2.method5500();
							}
							local1119.anInt6466 = Static438.aClass2_Sub23_Sub2_2.method5500();
							if (local1119.anInt6466 == 65535) {
								local1119.anInt6466 = -1;
							}
							Static20.aClass237Array1[local67] = local1119;
						}
						Static138.aClass265_54 = null;
						return true;
					} else {
						@Pc(1323) long local1323;
						@Pc(1313) long local1313;
						@Pc(1318) long local1318;
						@Pc(1331) int local1331;
						if (Static138.aClass265_54 == Static204.aClass265_68) {
							local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
							local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
							local296 = local294;
							if (local290) {
								local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
							}
							local1313 = Static438.aClass2_Sub23_Sub2_2.method5453();
							local1318 = Static438.aClass2_Sub23_Sub2_2.method5500();
							local1323 = Static438.aClass2_Sub23_Sub2_2.method5485();
							local615 = Static438.aClass2_Sub23_Sub2_2.method5495();
							local1331 = Static438.aClass2_Sub23_Sub2_2.method5500();
							@Pc(1337) long local1337 = (local1318 << 32) + local1323;
							@Pc(1339) boolean local1339 = false;
							@Pc(1341) int local1341 = 0;
							while (true) {
								if (local1341 >= 100) {
									if (local615 <= 1 && Static309.method4371(local296)) {
										local1339 = true;
									}
									break;
								}
								if (local1337 == Static344.aLongArray6[local1341]) {
									local1339 = true;
									break;
								}
								local1341++;
							}
							if (!local1339 && Static68.anInt5456 == 0) {
								Static344.aLongArray6[Static197.anInt3804] = local1337;
								Static197.anInt3804 = (Static197.anInt3804 + 1) % 100;
								@Pc(1391) String local1391 = Static181.aClass71_1.method1830(local1331).method3922(Static438.aClass2_Sub23_Sub2_2);
								if (local615 == 2) {
									Static8.method202(local1331, "<img=1>" + local296, 20, 0, "<img=1>" + local294, Static408.method5373(local1313), local1391);
								} else if (local615 == 1) {
									Static8.method202(local1331, "<img=0>" + local296, 20, 0, "<img=0>" + local294, Static408.method5373(local1313), local1391);
								} else {
									Static8.method202(local1331, local296, 20, 0, local294, Static408.method5373(local1313), local1391);
								}
							}
							Static138.aClass265_54 = null;
							return true;
						} else if (Static320.aClass265_124 == Static138.aClass265_54) {
							Static316.method4367(Static80.aClass214_26);
							Static138.aClass265_54 = null;
							return true;
						} else if (Static138.aClass265_54 == Static161.aClass265_160) {
							Static344.aClass108_1.method2428();
							Static214.anInt4155 += 32;
							Static138.aClass265_54 = null;
							return true;
						} else if (Static210.aClass265_84 == Static138.aClass265_54) {
							local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
							local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
							local235 = Static438.aClass2_Sub23_Sub2_2.method5495();
							local239 = Static438.aClass2_Sub23_Sub2_2.method5500() << 0;
							local310 = Static438.aClass2_Sub23_Sub2_2.method5495();
							local509 = Static438.aClass2_Sub23_Sub2_2.method5495();
							if (Static391.method3868(local227)) {
								Static308.method4348(local67, local509, local239, local310, local235);
							}
							Static138.aClass265_54 = null;
							return true;
						} else if (Static297.aClass265_115 == Static138.aClass265_54) {
							local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
							local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
							local235 = Static438.aClass2_Sub23_Sub2_2.method5500();
							local239 = Static438.aClass2_Sub23_Sub2_2.method5500();
							if (Static391.method3868(local227) && Static60.aClass68ArrayArray1[local67] != null) {
								for (local310 = local235; local310 < local239; local310++) {
									local509 = Static438.aClass2_Sub23_Sub2_2.method5485();
									if (Static60.aClass68ArrayArray1[local67].length > local310 && Static60.aClass68ArrayArray1[local67][local310] != null) {
										Static60.aClass68ArrayArray1[local67][local310].anInt2225 = local509;
									}
								}
							}
							Static138.aClass265_54 = null;
							return true;
						} else if (Static12.aClass265_5 == Static138.aClass265_54) {
							local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
							local67 = Static438.aClass2_Sub23_Sub2_2.method5452();
							local235 = Static438.aClass2_Sub23_Sub2_2.method5492();
							@Pc(1615) Class3_Sub2_Sub1_Sub1 local1615 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local227];
							if (local1615 != null) {
								Static182.method2924(local1615, local67, local235);
							}
							Static138.aClass265_54 = null;
							return true;
						} else if (Static277.aClass265_106 == Static138.aClass265_54) {
							Static397.anInt6600 = Static438.aClass2_Sub23_Sub2_2.method5471() << 3;
							Static317.anInt5575 = Static438.aClass2_Sub23_Sub2_2.method5452();
							Static31.anInt640 = Static438.aClass2_Sub23_Sub2_2.method5471() << 3;
							for (@Pc(1650) Class2_Sub14 local1650 = (Class2_Sub14) Static132.aClass163_13.method3771(); local1650 != null; local1650 = (Class2_Sub14) Static132.aClass163_13.method3770()) {
								local67 = (int) (local1650.aLong227 & 0x3FFFL);
								local235 = (int) (local1650.aLong227 >> 14 & 0x3FFFL);
								local239 = (int) (local1650.aLong227 >> 28 & 0x3L);
								if (Static317.anInt5575 == local239 && Static397.anInt6600 <= local67 && Static397.anInt6600 + 8 > local67 && local235 >= Static31.anInt640 && local235 < Static31.anInt640 + 8) {
									local1650.method5866();
									Static181.method2904(Static317.anInt5575, local235, local67);
								}
							}
							for (@Pc(1725) Class2_Sub11 local1725 = (Class2_Sub11) Static362.aClass14_42.method309(); local1725 != null; local1725 = (Class2_Sub11) Static362.aClass14_42.method311()) {
								if (Static397.anInt6600 <= local1725.anInt1614 && Static397.anInt6600 + 8 > local1725.anInt1614 && local1725.anInt1615 >= Static31.anInt640 && local1725.anInt1615 < Static31.anInt640 + 8 && Static317.anInt5575 == local1725.anInt1613) {
									local1725.anInt1612 = 0;
								}
							}
							Static138.aClass265_54 = null;
							return true;
						} else if (Static138.aClass265_54 == Static454.aClass265_170) {
							Static316.method4367(Static136.aClass214_7);
							Static138.aClass265_54 = null;
							return true;
						} else if (Static38.aClass265_144 == Static138.aClass265_54) {
							local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
							local67 = Static438.aClass2_Sub23_Sub2_2.method5492();
							if (local67 == 65535) {
								local67 = -1;
							}
							local235 = Static438.aClass2_Sub23_Sub2_2.method5468();
							if (Static391.method3868(local227)) {
								Static36.method601(local235, -1, local67, 2);
							}
							Static138.aClass265_54 = null;
							return true;
						} else if (Static138.aClass265_54 == Static272.aClass265_103) {
							Static317.anInt5575 = Static438.aClass2_Sub23_Sub2_2.method5499();
							Static397.anInt6600 = Static438.aClass2_Sub23_Sub2_2.method5497() << 3;
							Static31.anInt640 = Static438.aClass2_Sub23_Sub2_2.method5471() << 3;
							Static138.aClass265_54 = null;
							return true;
						} else {
							@Pc(1851) String local1851;
							@Pc(1860) boolean local1860;
							if (Static138.aClass265_54 == Static203.aClass265_91) {
								local1851 = Static438.aClass2_Sub23_Sub2_2.method5494();
								local1860 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
								if (local1860) {
									local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
								} else {
									local294 = local1851;
								}
								local239 = Static438.aClass2_Sub23_Sub2_2.method5500();
								@Pc(1878) byte local1878 = Static438.aClass2_Sub23_Sub2_2.method5484();
								local312 = false;
								if (local1878 == -128) {
									local312 = true;
								}
								if (local312) {
									if (Static107.anInt2532 == 0) {
										Static138.aClass265_54 = null;
										return true;
									}
									for (local1012 = 0; local1012 < Static107.anInt2532 && (!Static93.aClass81Array1[local1012].aString31.equals(local294) || local239 != Static93.aClass81Array1[local1012].anInt2582); local1012++) {
									}
									if (Static107.anInt2532 > local1012) {
										while (Static107.anInt2532 - 1 > local1012) {
											Static93.aClass81Array1[local1012] = Static93.aClass81Array1[local1012 + 1];
											local1012++;
										}
										Static107.anInt2532--;
										Static93.aClass81Array1[Static107.anInt2532] = null;
									}
								} else {
									local338 = Static438.aClass2_Sub23_Sub2_2.method5494();
									local633 = new Class81();
									local633.aString31 = local294;
									local633.aString32 = local1851;
									local633.aString29 = Static259.method3902(local633.aString31);
									local633.aByte37 = local1878;
									local633.anInt2582 = local239;
									local633.aString30 = local338;
									for (local608 = Static107.anInt2532 - 1; local608 >= 0; local608--) {
										local615 = Static93.aClass81Array1[local608].aString29.compareTo(local633.aString29);
										if (local615 == 0) {
											Static93.aClass81Array1[local608].anInt2582 = local239;
											Static93.aClass81Array1[local608].aByte37 = local1878;
											Static93.aClass81Array1[local608].aString30 = local338;
											if (local294.equals(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56)) {
												Static282.aByte78 = local1878;
											}
											Static379.anInt6423 = Static37.anInt715;
											Static138.aClass265_54 = null;
											return true;
										}
										if (local615 < 0) {
											break;
										}
									}
									if (Static93.aClass81Array1.length <= Static107.anInt2532) {
										Static138.aClass265_54 = null;
										return true;
									}
									for (local615 = Static107.anInt2532 - 1; local615 > local608; local615--) {
										Static93.aClass81Array1[local615 + 1] = Static93.aClass81Array1[local615];
									}
									if (Static107.anInt2532 == 0) {
										Static93.aClass81Array1 = new Class81[100];
									}
									Static93.aClass81Array1[local608 + 1] = local633;
									Static107.anInt2532++;
									if (local294.equals(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56)) {
										Static282.aByte78 = local1878;
									}
								}
								Static379.anInt6423 = Static37.anInt715;
								Static138.aClass265_54 = null;
								return true;
							} else if (Static138.aClass265_54 == Static388.aClass265_152) {
								local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
								local67 = Static438.aClass2_Sub23_Sub2_2.method5492();
								local235 = Static438.aClass2_Sub23_Sub2_2.method5508();
								if (Static391.method3868(local227)) {
									Static267.method5789(local235, local67);
								}
								Static138.aClass265_54 = null;
								return true;
							} else if (Static173.aClass265_72 == Static138.aClass265_54) {
								local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
								local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
								local235 = Static438.aClass2_Sub23_Sub2_2.method5464();
								if (Static391.method3868(local67)) {
									if (local235 == 2) {
										Static20.method454();
									}
									Static410.anInt6841 = local227;
									Static95.method1833(local227);
									Static64.method1245(false);
									Static168.method2742(Static410.anInt6841);
									for (local239 = 0; local239 < 100; local239++) {
										Static243.aBooleanArray19[local239] = true;
									}
								}
								Static138.aClass265_54 = null;
								return true;
							} else {
								@Pc(2442) String local2442;
								@Pc(2217) String local2217;
								@Pc(2514) boolean local2514;
								if (Static309.aClass265_118 == Static138.aClass265_54) {
									while (Static379.anInt6425 > Static438.aClass2_Sub23_Sub2_2.anInt6952) {
										local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
										local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
										local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
										local239 = Static438.aClass2_Sub23_Sub2_2.method5500();
										local310 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local2217 = "";
										local613 = false;
										if (local239 > 0) {
											local2217 = Static438.aClass2_Sub23_Sub2_2.method5494();
											local613 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
										}
										for (local1016 = 0; local1016 < Static46.anInt861; local1016++) {
											if (local290) {
												if (local296.equals(Static284.aStringArray35[local1016])) {
													Static284.aStringArray35[local1016] = local294;
													local294 = null;
													Static297.aStringArray36[local1016] = local296;
													break;
												}
											} else if (local294.equals(Static284.aStringArray35[local1016])) {
												if (local239 != Static376.anIntArray544[local1016]) {
													Static376.anIntArray544[local1016] = local239;
													if (local239 > 0) {
														Static334.method4660(5, 0, "", "", local294 + Static201.aClass209_82.method4562(Static388.anInt6533));
													}
													if (local239 == 0) {
														Static334.method4660(5, 0, "", "", local294 + Static140.aClass209_66.method4562(Static388.anInt6533));
													}
												}
												Static297.aStringArray36[local1016] = local296;
												Static200.aStringArray37[local1016] = local2217;
												Static362.anIntArray526[local1016] = local310;
												local294 = null;
												Static275.aBooleanArray20[local1016] = local613;
												break;
											}
										}
										if (local294 != null && Static46.anInt861 < 200) {
											Static284.aStringArray35[Static46.anInt861] = local294;
											Static297.aStringArray36[Static46.anInt861] = local296;
											Static376.anIntArray544[Static46.anInt861] = local239;
											Static200.aStringArray37[Static46.anInt861] = local2217;
											Static362.anIntArray526[Static46.anInt861] = local310;
											Static275.aBooleanArray20[Static46.anInt861] = local613;
											Static46.anInt861++;
										}
									}
									Static162.anInt3249 = 2;
									Static118.anInt2673 = Static37.anInt715;
									local67 = Static46.anInt861;
									while (local67 > 0) {
										local67--;
										local290 = true;
										for (local235 = 0; local235 < local67; local235++) {
											if (Static376.anIntArray544[local235] != Static375.anInt5832 && Static376.anIntArray544[local235 + 1] == Static375.anInt5832 || Static376.anIntArray544[local235] == 0 && Static376.anIntArray544[local235 + 1] != 0) {
												local239 = Static376.anIntArray544[local235];
												Static376.anIntArray544[local235] = Static376.anIntArray544[local235 + 1];
												Static376.anIntArray544[local235 + 1] = local239;
												local2442 = Static200.aStringArray37[local235];
												Static200.aStringArray37[local235] = Static200.aStringArray37[local235 + 1];
												Static200.aStringArray37[local235 + 1] = local2442;
												local2217 = Static284.aStringArray35[local235];
												Static284.aStringArray35[local235] = Static284.aStringArray35[local235 + 1];
												Static284.aStringArray35[local235 + 1] = local2217;
												local338 = Static297.aStringArray36[local235];
												Static297.aStringArray36[local235] = Static297.aStringArray36[local235 + 1];
												Static297.aStringArray36[local235 + 1] = local338;
												local1016 = Static362.anIntArray526[local235];
												Static362.anIntArray526[local235] = Static362.anIntArray526[local235 + 1];
												Static362.anIntArray526[local235 + 1] = local1016;
												local2514 = Static275.aBooleanArray20[local235];
												Static275.aBooleanArray20[local235] = Static275.aBooleanArray20[local235 + 1];
												local290 = false;
												Static275.aBooleanArray20[local235 + 1] = local2514;
											}
										}
										if (local290) {
											break;
										}
									}
									Static138.aClass265_54 = null;
									return true;
								} else if (Static138.aClass265_54 == Static391.aClass265_95) {
									Static444.method5712();
									Static138.aClass265_54 = null;
									return false;
								} else if (Static138.aClass265_54 == Static265.aClass265_101) {
									local227 = Static438.aClass2_Sub23_Sub2_2.method5493();
									local67 = Static438.aClass2_Sub23_Sub2_2.method5508();
									if (Static391.method3868(local227)) {
										Static36.method601(local67, 0, Static399.anInt6656, 5);
									}
									Static138.aClass265_54 = null;
									return true;
								} else if (Static205.aClass265_82 == Static138.aClass265_54) {
									local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
									local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
									local1860 = (local67 & 0x1) == 1;
									Static13.method294(local227, local1860);
									local239 = Static438.aClass2_Sub23_Sub2_2.method5500();
									for (local310 = 0; local310 < local239; local310++) {
										local509 = Static438.aClass2_Sub23_Sub2_2.method5499();
										if (local509 == 255) {
											local509 = Static438.aClass2_Sub23_Sub2_2.method5472();
										}
										local1012 = Static438.aClass2_Sub23_Sub2_2.method5500();
										Static154.method2539(local1860, local310, local227, local509, local1012 - 1);
									}
									Static417.anIntArray590[Static147.anInt6563++ & 0x1F] = local227;
									Static138.aClass265_54 = null;
									return true;
								} else if (Static138.aClass265_54 == Static141.aClass265_55) {
									local1851 = Static438.aClass2_Sub23_Sub2_2.method5494();
									local67 = Static438.aClass2_Sub23_Sub2_2.method5492();
									local235 = Static438.aClass2_Sub23_Sub2_2.method5460();
									if (Static391.method3868(local235)) {
										Static241.method3947(local1851, local67);
									}
									Static138.aClass265_54 = null;
									return true;
								} else if (Static138.aClass265_54 == Static89.aClass265_37) {
									local227 = Static438.aClass2_Sub23_Sub2_2.method5505();
									local67 = Static438.aClass2_Sub23_Sub2_2.method5508();
									local235 = Static438.aClass2_Sub23_Sub2_2.method5460();
									if (local235 == 65535) {
										local235 = -1;
									}
									local239 = Static438.aClass2_Sub23_Sub2_2.method5492();
									if (Static391.method3868(local239)) {
										Static281.method5820(local235, local227, local67);
										@Pc(2727) Class45 local2727 = Static318.aClass144_6.method3265(local235);
										Static408.method5372(local67, local2727.anInt1113, local2727.anInt1135, local2727.anInt1098);
										Static294.method4238(local67, local2727.anInt1097, local2727.anInt1137, local2727.anInt1104);
									}
									Static138.aClass265_54 = null;
									return true;
								} else if (Static138.aClass265_54 == Static233.aClass265_88) {
									Static132.method2247(Static379.anInt6425, Static438.aClass2_Sub23_Sub2_2);
									Static138.aClass265_54 = null;
									return true;
								} else {
									@Pc(3454) int local3454;
									@Pc(2865) int local2865;
									if (Static138.aClass265_54 == Static144.aClass265_56) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5493();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5464();
										local239 = Static438.aClass2_Sub23_Sub2_2.method5468();
										local310 = Static438.aClass2_Sub23_Sub2_2.method5493();
										local312 = (local235 & 0x80) != 0;
										if (local239 >> 30 == 0) {
											@Pc(2849) Class203 local2849;
											@Pc(2895) Class203 local2895;
											@Pc(2862) Class250 local2862;
											@Pc(2916) Class250 local2916;
											@Pc(2910) Class250 local2910;
											if (local239 >> 29 != 0) {
												local1012 = local239 & 0xFFFF;
												@Pc(2810) Class3_Sub2_Sub1_Sub1 local2810 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local1012];
												if (local2810 != null) {
													if (local67 == 65535) {
														local67 = -1;
													}
													local2514 = true;
													local615 = local312 ? local2810.anInt6126 : local2810.anInt6150;
													if (local67 != -1 && local615 != -1) {
														if (local67 == local615) {
															local2849 = Static395.aClass247_2.method5407(local67);
															if (local2849.aBoolean398 && local2849.anInt5615 != -1) {
																local2862 = Static338.aClass12_2.method255(local2849.anInt5615);
																local2865 = local2862.anInt7015;
																if (local2865 == 0 || local2865 == 2) {
																	local2514 = false;
																} else if (local2865 == 1) {
																	local2514 = true;
																}
															}
														} else {
															local2849 = Static395.aClass247_2.method5407(local67);
															local2895 = Static395.aClass247_2.method5407(local615);
															if (local2849.anInt5615 != -1 && local2895.anInt5615 != -1) {
																local2910 = Static338.aClass12_2.method255(local2849.anInt5615);
																local2916 = Static338.aClass12_2.method255(local2895.anInt5615);
																if (local2910.anInt7019 < local2916.anInt7019) {
																	local2514 = false;
																}
															}
														}
													}
													if (local2514) {
														if (local312) {
															local2810.anInt6133 = local310;
															local2810.anInt6136 = 0;
															local2810.anInt6146 = anInt2821 + local227;
															local2810.anInt6152 = local235 & 0x7;
															local2810.anInt6126 = local67;
															local2810.anInt6185 = 0;
															local2810.anInt6166 = 1;
															if (anInt2821 < local2810.anInt6146) {
																local2810.anInt6185 = -1;
															}
															if (local2810.anInt6126 != -1 && anInt2821 == local2810.anInt6146) {
																local1331 = Static395.aClass247_2.method5407(local2810.anInt6126).anInt5615;
																if (local1331 != -1) {
																	local2862 = Static338.aClass12_2.method255(local1331);
																	if (local2862 != null && local2862.anIntArray592 != null) {
																		method2230(local2810.anInt6119, local2810.anInt6121, local2810.aByte89, false, local2862, 0);
																	}
																}
															}
														} else {
															local2810.anInt6150 = local67;
															local2810.anInt6186 = anInt2821 + local227;
															local2810.anInt6171 = 1;
															local2810.anInt6164 = 0;
															local2810.anInt6176 = 0;
															local2810.anInt6158 = local235 & 0x7;
															local2810.anInt6199 = local310;
															if (local2810.anInt6186 > anInt2821) {
																local2810.anInt6164 = -1;
															}
															if (local2810.anInt6150 != -1 && local2810.anInt6186 == anInt2821) {
																local1331 = Static395.aClass247_2.method5407(local2810.anInt6150).anInt5615;
																if (local1331 != -1) {
																	local2862 = Static338.aClass12_2.method255(local1331);
																	if (local2862 != null && local2862.anIntArray592 != null) {
																		method2230(local2810.anInt6119, local2810.anInt6121, local2810.aByte89, false, local2862, 0);
																	}
																}
															}
														}
													}
												}
											} else if (local239 >> 28 != 0) {
												local1012 = local239 & 0xFFFF;
												@Pc(3108) Class3_Sub2_Sub1_Sub2 local3108;
												if (local1012 == Static399.anInt6656) {
													local3108 = Static375.aClass3_Sub2_Sub1_Sub2_7;
												} else {
													local3108 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local1012];
												}
												if (local3108 != null) {
													if (local67 == 65535) {
														local67 = -1;
													}
													local2514 = true;
													local615 = local312 ? local3108.anInt6126 : local3108.anInt6150;
													if (local67 != -1 && local615 != -1) {
														if (local615 == local67) {
															local2849 = Static395.aClass247_2.method5407(local67);
															if (local2849.aBoolean398 && local2849.anInt5615 != -1) {
																local2862 = Static338.aClass12_2.method255(local2849.anInt5615);
																local2865 = local2862.anInt7015;
																if (local2865 == 0 || local2865 == 2) {
																	local2514 = false;
																} else if (local2865 == 1) {
																	local2514 = true;
																}
															}
														} else {
															local2849 = Static395.aClass247_2.method5407(local67);
															local2895 = Static395.aClass247_2.method5407(local615);
															if (local2849.anInt5615 != -1 && local2895.anInt5615 != -1) {
																local2910 = Static338.aClass12_2.method255(local2849.anInt5615);
																local2916 = Static338.aClass12_2.method255(local2895.anInt5615);
																if (local2916.anInt7019 > local2910.anInt7019) {
																	local2514 = false;
																}
															}
														}
													}
													if (local2514) {
														if (local312) {
															local3108.anInt6185 = 0;
															local3108.anInt6133 = local310;
															local3108.anInt6146 = anInt2821 + local227;
															local3108.anInt6152 = local235 & 0x7;
															local3108.anInt6136 = 0;
															local3108.anInt6126 = local67;
															local3108.anInt6166 = 1;
															if (local3108.anInt6126 == 65535) {
																local3108.anInt6126 = -1;
															}
															if (anInt2821 < local3108.anInt6146) {
																local3108.anInt6185 = -1;
															}
															if (local3108.anInt6126 != -1 && local3108.anInt6146 == anInt2821) {
																local1331 = Static395.aClass247_2.method5407(local3108.anInt6126).anInt5615;
																if (local1331 != -1) {
																	local2862 = Static338.aClass12_2.method255(local1331);
																	if (local2862 != null && local2862.anIntArray592 != null) {
																		method2230(local3108.anInt6119, local3108.anInt6121, local3108.aByte89, local3108 == Static375.aClass3_Sub2_Sub1_Sub2_7, local2862, 0);
																	}
																}
															}
														} else {
															local3108.anInt6171 = 1;
															local3108.anInt6176 = 0;
															local3108.anInt6164 = 0;
															local3108.anInt6186 = local227 + anInt2821;
															local3108.anInt6199 = local310;
															local3108.anInt6158 = local235 & 0x7;
															local3108.anInt6150 = local67;
															if (local3108.anInt6186 > anInt2821) {
																local3108.anInt6164 = -1;
															}
															if (local3108.anInt6150 == 65535) {
																local3108.anInt6150 = -1;
															}
															if (local3108.anInt6150 != -1 && anInt2821 == local3108.anInt6186) {
																local1331 = Static395.aClass247_2.method5407(local3108.anInt6150).anInt5615;
																if (local1331 != -1) {
																	local2862 = Static338.aClass12_2.method255(local1331);
																	if (local2862 != null && local2862.anIntArray592 != null) {
																		method2230(local3108.anInt6119, local3108.anInt6121, local3108.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == local3108, local2862, 0);
																	}
																}
															}
														}
													}
												}
											}
										} else {
											local1012 = local239 >> 28 & 0x3;
											local1016 = (local239 >> 14 & 0x3FFF) - Static48.anInt962;
											local608 = (local239 & 0x3FFF) - Static324.anInt5624;
											if (local1016 >= 0 && local608 >= 0 && local1016 < Static229.anInt4427 && local608 < Static379.anInt6422) {
												local615 = local1016 * 128 + 64;
												local1331 = local608 * 128 + 64;
												local3454 = local1012;
												if (local1012 < 3 && Static40.method645(local608, local1016)) {
													local3454 = local1012 + 1;
												}
												@Pc(3486) Class3_Sub2_Sub2 local3486 = new Class3_Sub2_Sub2(local67, 0, anInt2821, local1012, local3454, local615, Static85.method1695(local1012, local1331, local615) - local310, local1331, local1016, local1016, local608, local608, local235);
												Static31.aClass14_1.method300(new Class2_Sub5_Sub11(local3486));
											}
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static384.aClass265_148 == Static138.aClass265_54) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
										if (local227 == 65535) {
											local227 = -1;
										}
										local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5500();
										local239 = Static438.aClass2_Sub23_Sub2_2.method5495();
										Static346.method4765(local227, local67, local235, local239);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static321.aClass265_125 == Static138.aClass265_54) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5505();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5452();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5495();
										Static48.anIntArray73[local67] = local227;
										Static196.anIntArray335[local67] = local235;
										Static272.anIntArray411[local67] = 1;
										local239 = Static31.anIntArray57[local67] - 1;
										for (local310 = 0; local310 < local239; local310++) {
											if (Class30.anIntArray59[local310] <= local227) {
												Static272.anIntArray411[local67] = local310 + 2;
											}
										}
										Static104.anIntArray191[Static394.anInt6578++ & 0x1F] = local67;
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static248.aClass265_94) {
										local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
										local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
										local296 = local294;
										if (local290) {
											local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
										}
										local1313 = Static438.aClass2_Sub23_Sub2_2.method5500();
										local1318 = Static438.aClass2_Sub23_Sub2_2.method5485();
										local1016 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local608 = Static438.aClass2_Sub23_Sub2_2.method5500();
										@Pc(3651) long local3651 = (local1313 << 32) + local1318;
										@Pc(3653) boolean local3653 = false;
										local2865 = 0;
										while (true) {
											if (local2865 >= 100) {
												if (local1016 <= 1 && Static309.method4371(local296)) {
													local3653 = true;
												}
												break;
											}
											if (local3651 == Static344.aLongArray6[local2865]) {
												local3653 = true;
												break;
											}
											local2865++;
										}
										if (!local3653 && Static68.anInt5456 == 0) {
											Static344.aLongArray6[Static197.anInt3804] = local3651;
											Static197.anInt3804 = (Static197.anInt3804 + 1) % 100;
											@Pc(3707) String local3707 = Static181.aClass71_1.method1830(local608).method3922(Static438.aClass2_Sub23_Sub2_2);
											if (local1016 == 2) {
												Static8.method202(local608, "<img=1>" + local296, 18, 0, "<img=1>" + local294, null, local3707);
											} else if (local1016 == 1) {
												Static8.method202(local608, "<img=0>" + local296, 18, 0, "<img=0>" + local294, null, local3707);
											} else {
												Static8.method202(local608, local296, 18, 0, local294, null, local3707);
											}
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static305.aClass265_117) {
										local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
										local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
										local296 = local294;
										if (local290) {
											local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
										}
										local239 = Static438.aClass2_Sub23_Sub2_2.method5495();
										@Pc(3802) boolean local3802 = false;
										if (local239 <= 1) {
											if (Static340.aBoolean411 && !Static62.aBoolean83 || Static223.aBoolean314) {
												local3802 = true;
											} else if (local239 <= 1 && Static309.method4371(local296)) {
												local3802 = true;
											}
										}
										if (!local3802 && Static68.anInt5456 == 0) {
											local2217 = Static331.method4592(Static238.method3684(Static438.aClass2_Sub23_Sub2_2));
											if (local239 == 2) {
												Static8.method202(-1, "<img=1>" + local296, 24, 0, "<img=1>" + local294, null, local2217);
											} else if (local239 == 1) {
												Static8.method202(-1, "<img=0>" + local296, 24, 0, "<img=0>" + local294, null, local2217);
											} else {
												Static8.method202(-1, local296, 24, 0, local294, null, local2217);
											}
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static154.aClass265_60 == Static138.aClass265_54) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5464();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
										if (local67 == 255) {
											local227 = -1;
											local67 = -1;
										}
										Static135.method2306(local67, local227);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static340.aClass265_132) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5508();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5460();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5468();
										if (Static391.method3868(local67)) {
											@Pc(3957) Class2_Sub35 local3957 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local235);
											local250 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local227);
											if (local250 != null) {
												Static313.method4400(local250, local3957 == null || local250.anInt5537 != local3957.anInt5537, false);
											}
											if (local3957 != null) {
												local3957.method5866();
												Static113.aClass163_11.method3764((long) local227, local3957);
											}
											@Pc(3995) Class68 local3995 = Static165.method2704(local235);
											if (local3995 != null) {
												Static78.method1460(local3995);
											}
											local3995 = Static165.method2704(local227);
											if (local3995 != null) {
												Static78.method1460(local3995);
												Static49.method804(local3995, true);
											}
											if (Static410.anInt6841 != -1) {
												Static76.method1390(Static410.anInt6841, 1);
											}
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static390.aClass265_154 == Static138.aClass265_54) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5456();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5458();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5505();
										local239 = Static438.aClass2_Sub23_Sub2_2.method5460();
										if (Static391.method3868(local239)) {
											Static79.method1468(local227, local67, local235);
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static98.aClass265_38) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
										local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5500();
										if (Static391.method3868(local227)) {
											Static241.method3947(local294, local235);
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static436.aClass265_163) {
										Static38.anInt6363 = Static438.aClass2_Sub23_Sub2_2.method5500() * 30;
										Static453.anInt7434 = Static37.anInt715;
										Static138.aClass265_54 = null;
										return true;
									} else if (Static442.aClass265_164 == Static138.aClass265_54) {
										Static316.method4367(Static53.aClass214_5);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static187.aClass265_76 == Static138.aClass265_54) {
										Static78.method1461(false);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static135.aClass265_52) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
										if (Static391.method3868(local227)) {
											Static56.method924();
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static328.aClass265_127 == Static138.aClass265_54) {
										Static393.anInt6568 = Static438.aClass2_Sub23_Sub2_2.method5495();
										Static138.aClass265_54 = null;
										return true;
									} else if (Static453.aClass265_168 == Static138.aClass265_54) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5464();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5464();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5460();
										if (local235 == 65535) {
											local235 = -1;
										}
										Static419.method5563(local67, local227, local235);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static192.aClass265_78) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5464();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5482();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5493();
										if (local235 == 65535) {
											local235 = -1;
										}
										Static284.method4120(local67, local227, local235);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static59.aClass265_26 == Static138.aClass265_54) {
										Static69.anInt1561 = Static438.aClass2_Sub23_Sub2_2.method5458();
										Static453.anInt7434 = Static37.anInt715;
										Static138.aClass265_54 = null;
										return true;
									} else if (Static137.aClass265_53 == Static138.aClass265_54) {
										Static412.method5432(Static43.aClass59_5, Static379.anInt6425, Static438.aClass2_Sub23_Sub2_2);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static27.aClass265_166 == Static138.aClass265_54) {
										local1851 = Static438.aClass2_Sub23_Sub2_2.method5494();
										local294 = Static331.method4592(Static238.method3684(Static438.aClass2_Sub23_Sub2_2));
										Static334.method4660(6, 0, local1851, local1851, local294);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static104.aClass265_44 == Static138.aClass265_54) {
										Static91.aClass216_6 = Static245.method5123(Static438.aClass2_Sub23_Sub2_2.method5495());
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static273.aClass265_104) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local1860 = (local67 & 0x1) == 1;
										while (Static438.aClass2_Sub23_Sub2_2.anInt6952 < Static379.anInt6425) {
											local239 = Static438.aClass2_Sub23_Sub2_2.method5479();
											local310 = Static438.aClass2_Sub23_Sub2_2.method5500();
											local509 = 0;
											if (local310 != 0) {
												local509 = Static438.aClass2_Sub23_Sub2_2.method5495();
												if (local509 == 255) {
													local509 = Static438.aClass2_Sub23_Sub2_2.method5508();
												}
											}
											Static154.method2539(local1860, local239, local227, local509, local310 - 1);
										}
										Static417.anIntArray590[Static147.anInt6563++ & 0x1F] = local227;
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static450.aClass265_167) {
										Static136.method2314();
										Static138.aClass265_54 = null;
										return true;
									} else if (Static138.aClass265_54 == Static220.aClass265_86) {
										local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
										local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local235 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local239 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local310 = Static438.aClass2_Sub23_Sub2_2.method5495();
										local509 = Static438.aClass2_Sub23_Sub2_2.method5500();
										if (Static391.method3868(local227)) {
											Static129.aBooleanArray15[local67] = true;
											Static182.anIntArray314[local67] = local235;
											Static22.anIntArray48[local67] = local239;
											Static417.anIntArray591[local67] = local310;
											Static323.anIntArray461[local67] = local509;
										}
										Static138.aClass265_54 = null;
										return true;
									} else if (Static98.aClass265_39 == Static138.aClass265_54) {
										Static95.aString28 = Static379.anInt6425 > 2 ? Static438.aClass2_Sub23_Sub2_2.method5494() : Static296.aClass209_120.method4562(Static388.anInt6533);
										Static417.anInt7005 = Static379.anInt6425 > 0 ? Static438.aClass2_Sub23_Sub2_2.method5500() : -1;
										Static138.aClass265_54 = null;
										if (Static417.anInt7005 == 65535) {
											Static417.anInt7005 = -1;
										}
										return true;
									} else if (Static138.aClass265_54 == Static150.aClass265_85) {
										Static316.method4367(Static416.aClass214_25);
										Static138.aClass265_54 = null;
										return true;
									} else if (Static185.aClass265_73 == Static138.aClass265_54) {
										Static316.method4367(Static57.aClass214_6);
										Static138.aClass265_54 = null;
										return true;
									} else {
										@Pc(4485) String local4485;
										if (Static228.aClass265_87 == Static138.aClass265_54) {
											local227 = Static438.aClass2_Sub23_Sub2_2.method5479();
											local67 = Static438.aClass2_Sub23_Sub2_2.method5508();
											local235 = Static438.aClass2_Sub23_Sub2_2.method5495();
											local4485 = "";
											local2442 = local4485;
											if ((local235 & 0x1) != 0) {
												local4485 = Static438.aClass2_Sub23_Sub2_2.method5494();
												if ((local235 & 0x2) == 0) {
													local2442 = local4485;
												} else {
													local2442 = Static438.aClass2_Sub23_Sub2_2.method5494();
												}
											}
											local2217 = Static438.aClass2_Sub23_Sub2_2.method5494();
											if (local227 == 99) {
												Static99.method1879(local2217);
											} else if (local2442.equals("") || !Static309.method4371(local2442)) {
												Static334.method4660(local227, local67, local4485, local2442, local2217);
											} else {
												Static138.aClass265_54 = null;
												return true;
											}
											Static138.aClass265_54 = null;
											return true;
										} else if (Static69.aClass265_31 == Static138.aClass265_54) {
											Static316.method4367(Static404.aClass214_24);
											Static138.aClass265_54 = null;
											return true;
										} else {
											@Pc(4609) long local4609;
											@Pc(4624) Class2_Sub42 local4624;
											@Pc(4615) Class2_Sub42 local4615;
											if (Static313.aClass265_120 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (local67 == 65535) {
													local67 = -1;
												}
												local235 = Static438.aClass2_Sub23_Sub2_2.method5492();
												local239 = Static438.aClass2_Sub23_Sub2_2.method5508();
												local310 = Static438.aClass2_Sub23_Sub2_2.method5493();
												if (local310 == 65535) {
													local310 = -1;
												}
												if (Static391.method3868(local235)) {
													for (local509 = local67; local509 <= local310; local509++) {
														local4609 = (long) local509 + ((long) local239 << 32);
														local4615 = (Class2_Sub42) Static157.aClass163_18.method3769(local4609);
														if (local4615 != null) {
															local4624 = new Class2_Sub42(local4615.anInt6837, local227);
															local4615.method5866();
														} else if (local509 == -1) {
															local4624 = new Class2_Sub42(Static165.method2704(local239).aClass2_Sub42_3.anInt6837, local227);
														} else {
															local4624 = new Class2_Sub42(0, local227);
														}
														Static157.aClass163_18.method3764(local4609, local4624);
													}
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static412.aClass265_158) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5495();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (Static391.method3868(local67)) {
													Static413.anInt6881 = local227;
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static454.aClass265_169) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5472();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5472();
												local239 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (Static391.method3868(local239)) {
													Static36.method601(local67, local235, local227, 5);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static264.aClass265_100) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5492();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5493();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5505();
												if (Static391.method3868(local67)) {
													Static54.method897(local227, local235);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static256.aClass265_97 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5492();
												@Pc(4760) byte local4760 = Static438.aClass2_Sub23_Sub2_2.method5471();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (Static391.method3868(local235)) {
													Static54.method897(local227, local4760);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static340.aClass265_133) {
												Static316.method4367(Static353.aClass214_21);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static455.aClass265_121) {
												Static316.method4367(Static164.aClass214_13);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static365.aClass265_138 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5499();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local1860 = (local227 & 0x1) == 1;
												Static54.method900(local1860, local67);
												Static417.anIntArray590[Static147.anInt6563++ & 0x1F] = local67;
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static145.aClass265_57) {
												@Pc(4841) byte local4841 = Static438.aClass2_Sub23_Sub2_2.method5497();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5493();
												Static344.aClass108_1.method2430(local67, local4841);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static155.aClass265_61) {
												Static162.anInt3249 = 1;
												Static138.aClass265_54 = null;
												Static118.anInt2673 = Static37.anInt715;
												return true;
											} else if (Static138.aClass265_54 == Static370.aClass265_142) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5508();
												if (Static391.method3868(local227)) {
													@Pc(4887) Class2_Sub35 local4887 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local67);
													if (local4887 != null) {
														Static313.method4400(local4887, true, false);
													}
													if (Static412.aClass68_14 != null) {
														Static78.method1460(Static412.aClass68_14);
														Static412.aClass68_14 = null;
													}
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static239.aClass265_90 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5468();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5493();
												if (local235 == 65535) {
													local235 = -1;
												}
												if (Static391.method3868(local67)) {
													Static176.method186(local235, local227);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static172.aClass265_70 == Static138.aClass265_54) {
												local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
												local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
												local296 = local294;
												if (local290) {
													local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
												}
												local1313 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local1318 = Static438.aClass2_Sub23_Sub2_2.method5485();
												local1016 = Static438.aClass2_Sub23_Sub2_2.method5495();
												@Pc(4983) long local4983 = local1318 + (local1313 << 32);
												@Pc(4985) boolean local4985 = false;
												local3454 = 0;
												while (true) {
													if (local3454 >= 100) {
														if (local1016 <= 1) {
															if (Static340.aBoolean411 && !Static62.aBoolean83 || Static223.aBoolean314) {
																local4985 = true;
															} else if (Static309.method4371(local296)) {
																local4985 = true;
															}
														}
														break;
													}
													if (Static344.aLongArray6[local3454] == local4983) {
														local4985 = true;
														break;
													}
													local3454++;
												}
												if (!local4985 && Static68.anInt5456 == 0) {
													Static344.aLongArray6[Static197.anInt3804] = local4983;
													Static197.anInt3804 = (Static197.anInt3804 + 1) % 100;
													@Pc(5045) String local5045 = Static331.method4592(Static238.method3684(Static438.aClass2_Sub23_Sub2_2));
													if (local1016 == 2) {
														Static8.method202(-1, "<img=1>" + local296, 7, 0, "<img=1>" + local294, null, local5045);
													} else if (local1016 == 1) {
														Static8.method202(-1, "<img=0>" + local296, 7, 0, "<img=0>" + local294, null, local5045);
													} else {
														Static8.method202(-1, local296, 3, 0, local294, null, local5045);
													}
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static116.aClass265_49) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5505();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5493();
												if (Static391.method3868(local227)) {
													Static215.method3381(local67, local235);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static263.aClass265_99) {
												Static316.method4367(Static249.aClass214_17);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static284.aClass265_110) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5468();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5492();
												local239 = Static438.aClass2_Sub23_Sub2_2.method5493();
												local310 = Static438.aClass2_Sub23_Sub2_2.method5500();
												if (Static391.method3868(local310)) {
													Static408.method5372(local67, local239, local235, local227);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static31.aClass265_14) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5495();
												local239 = Static438.aClass2_Sub23_Sub2_2.method5500() << 0;
												local310 = Static438.aClass2_Sub23_Sub2_2.method5495();
												local509 = Static438.aClass2_Sub23_Sub2_2.method5495();
												if (Static391.method3868(local227)) {
													Static100.method1881(local310, local67, true, local509, local235, local239);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static12.aClass265_4 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5508();
												Static344.aClass108_1.method2430(local227, local67);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static157.aClass265_63) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												if (local227 == 65535) {
													local227 = -1;
												}
												local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local239 = Static438.aClass2_Sub23_Sub2_2.method5495();
												Static30.method535(local235, local227, local239, local67);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static333.aClass265_128 == Static138.aClass265_54) {
												local1851 = Static438.aClass2_Sub23_Sub2_2.method5494();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5460();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5468();
												if (Static391.method3868(local67)) {
													Static4.method143(local235, local1851);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static412.aClass265_157 == Static138.aClass265_54) {
												if (Static410.anInt6841 != -1) {
													Static76.method1390(Static410.anInt6841, 0);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static196.aClass265_79) {
												local290 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
												local294 = Static438.aClass2_Sub23_Sub2_2.method5494();
												local296 = local294;
												if (local290) {
													local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
												}
												local1313 = Static438.aClass2_Sub23_Sub2_2.method5453();
												local1318 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local1323 = Static438.aClass2_Sub23_Sub2_2.method5485();
												local615 = Static438.aClass2_Sub23_Sub2_2.method5495();
												@Pc(5377) long local5377 = (local1318 << 32) + local1323;
												@Pc(5379) boolean local5379 = false;
												@Pc(5381) int local5381 = 0;
												while (true) {
													if (local5381 >= 100) {
														if (local615 <= 1) {
															if (Static340.aBoolean411 && !Static62.aBoolean83 || Static223.aBoolean314) {
																local5379 = true;
															} else if (Static309.method4371(local296)) {
																local5379 = true;
															}
														}
														break;
													}
													if (local5377 == Static344.aLongArray6[local5381]) {
														local5379 = true;
														break;
													}
													local5381++;
												}
												if (!local5379 && Static68.anInt5456 == 0) {
													Static344.aLongArray6[Static197.anInt3804] = local5377;
													Static197.anInt3804 = (Static197.anInt3804 + 1) % 100;
													@Pc(5445) String local5445 = Static331.method4592(Static238.method3684(Static438.aClass2_Sub23_Sub2_2));
													if (local615 == 2 || local615 == 3) {
														Static8.method202(-1, "<img=1>" + local296, 9, 0, "<img=1>" + local294, Static408.method5373(local1313), local5445);
													} else if (local615 == 1) {
														Static8.method202(-1, "<img=0>" + local296, 9, 0, "<img=0>" + local294, Static408.method5373(local1313), local5445);
													} else {
														Static8.method202(-1, local296, 9, 0, local294, Static408.method5373(local1313), local5445);
													}
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static245.aClass265_150) {
												Static316.method4367(Static1.aClass214_4);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static8.aClass265_1 == Static138.aClass265_54) {
												Static397.anInt6600 = Static438.aClass2_Sub23_Sub2_2.method5511() << 3;
												Static317.anInt5575 = Static438.aClass2_Sub23_Sub2_2.method5452();
												Static31.anInt640 = Static438.aClass2_Sub23_Sub2_2.method5511() << 3;
												while (Static379.anInt6425 > Static438.aClass2_Sub23_Sub2_2.anInt6952) {
													@Pc(5561) Class214 local5561 = Static183.method2928()[Static438.aClass2_Sub23_Sub2_2.method5495()];
													Static316.method4367(local5561);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static413.aClass265_159) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5505();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (local67 == 65535) {
													local67 = -1;
												}
												local235 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (Static391.method3868(local235)) {
													Static36.method601(local227, -1, local67, 1);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static279.aClass265_107 == Static138.aClass265_54) {
												Static220.method3461();
												Static138.aClass265_54 = null;
												return false;
											} else if (Static43.aClass265_43 == Static138.aClass265_54) {
												Static81.method1478(Static438.aClass2_Sub23_Sub2_2.method5494());
												Static138.aClass265_54 = null;
												return true;
											} else if (Static251.aClass265_155 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5495();
												@Pc(5649) boolean local5649 = (local227 & 0x1) == 1;
												local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
												local4485 = Static438.aClass2_Sub23_Sub2_2.method5494();
												if (local4485.equals("")) {
													local4485 = local296;
												}
												local2442 = Static438.aClass2_Sub23_Sub2_2.method5494();
												local2217 = Static438.aClass2_Sub23_Sub2_2.method5494();
												if (local2217.equals("")) {
													local2217 = local2442;
												}
												if (local5649) {
													for (local1012 = 0; local1012 < Static393.anInt6567; local1012++) {
														if (Static227.aStringArray32[local1012].equals(local2217)) {
															Static367.aStringArray45[local1012] = local296;
															Static227.aStringArray32[local1012] = local4485;
															Static160.aStringArray31[local1012] = local2442;
															Static67.aStringArray8[local1012] = local2217;
															break;
														}
													}
												} else {
													Static367.aStringArray45[Static393.anInt6567] = local296;
													Static227.aStringArray32[Static393.anInt6567] = local4485;
													Static160.aStringArray31[Static393.anInt6567] = local2442;
													Static67.aStringArray8[Static393.anInt6567] = local2217;
													Static102.aBooleanArray11[Static393.anInt6567] = (local227 & 0x2) == 2;
													Static393.anInt6567++;
												}
												Static138.aClass265_54 = null;
												Static118.anInt2673 = Static37.anInt715;
												return true;
											} else if (Static270.aClass265_102 == Static138.aClass265_54) {
												if (Static150.aFrame5 != null) {
													Static243.method3738(-1, -1, false, Static12.aClass79_Sub1_1.anInt4917);
												}
												@Pc(5771) byte[] local5771 = new byte[Static379.anInt6425];
												Static438.aClass2_Sub23_Sub2_2.method5523(local5771, Static379.anInt6425);
												local294 = Static148.method2444(local5771, Static379.anInt6425, 0);
												Static363.method4953(true, Static43.aClass59_5, Static399.anInt6653 == 1, local294);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static64.aClass265_30) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5500();
												if (local227 == 65535) {
													local227 = -1;
												}
												local67 = Static438.aClass2_Sub23_Sub2_2.method5495();
												local296 = Static438.aClass2_Sub23_Sub2_2.method5494();
												local239 = Static438.aClass2_Sub23_Sub2_2.method5464();
												if (local67 >= 1 && local67 <= 8) {
													if (local296.equalsIgnoreCase("null")) {
														local296 = null;
													}
													Static199.aStringArray26[local67 - 1] = local296;
													Static326.anIntArray467[local67 - 1] = local227;
													Static82.aBooleanArray10[local67 - 1] = local239 == 0;
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static157.aClass265_62 == Static138.aClass265_54) {
												local1851 = Static438.aClass2_Sub23_Sub2_2.method5494();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local296 = Static181.aClass71_1.method1830(local67).method3922(Static438.aClass2_Sub23_Sub2_2);
												Static8.method202(local67, local1851, 19, 0, local1851, null, local296);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static47.aClass265_20 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (local227 == 65535) {
													local227 = -1;
												}
												local67 = Static438.aClass2_Sub23_Sub2_2.method5505();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5500();
												if (local235 == 65535) {
													local235 = -1;
												}
												local239 = Static438.aClass2_Sub23_Sub2_2.method5492();
												local310 = Static438.aClass2_Sub23_Sub2_2.method5472();
												if (Static391.method3868(local239)) {
													for (local509 = local235; local509 <= local227; local509++) {
														local4609 = (long) local509 + ((long) local67 << 32);
														local4615 = (Class2_Sub42) Static157.aClass163_18.method3769(local4609);
														if (local4615 != null) {
															local4624 = new Class2_Sub42(local310, local4615.anInt6838);
															local4615.method5866();
														} else if (local509 == -1) {
															local4624 = new Class2_Sub42(local310, Static165.method2704(local67).aClass2_Sub42_3.anInt6838);
														} else {
															local4624 = new Class2_Sub42(local310, -1);
														}
														Static157.aClass163_18.method3764(local4609, local4624);
													}
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static282.aClass265_108 == Static138.aClass265_54) {
												Static316.method4367(Static148.aClass214_8);
												Static138.aClass265_54 = null;
												return true;
											} else if (Static14.aClass265_6 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (Static391.method3868(local235)) {
													Static276.method4062(local227, local67);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static138.aClass265_54 == Static51.aClass265_21) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5508();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5493();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5500();
												if (Static391.method3868(local67)) {
													Static287.method4140(local235, local227);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static84.aClass265_34 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5493();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5500();
												local235 = Static438.aClass2_Sub23_Sub2_2.method5505();
												local239 = Static438.aClass2_Sub23_Sub2_2.method5493();
												local310 = Static438.aClass2_Sub23_Sub2_2.method5460();
												if (Static391.method3868(local239)) {
													Static36.method601(local235, local310, local67 | local227 << 16, 7);
												}
												Static138.aClass265_54 = null;
												return true;
											} else if (Static198.aClass265_80 == Static138.aClass265_54) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5495();
												if (Static438.aClass2_Sub23_Sub2_2.method5495() == 0) {
													Static173.aClass92Array1[local227] = new Class92();
												} else {
													Static438.aClass2_Sub23_Sub2_2.anInt6952--;
													Static173.aClass92Array1[local227] = new Class92(Static438.aClass2_Sub23_Sub2_2);
												}
												Static71.anInt1572 = Static37.anInt715;
												Static138.aClass265_54 = null;
												return true;
											} else if (Static442.aClass265_165 == Static138.aClass265_54) {
												Static393.anInt6567 = Static438.aClass2_Sub23_Sub2_2.method5495();
												for (local227 = 0; local227 < Static393.anInt6567; local227++) {
													Static367.aStringArray45[local227] = Static438.aClass2_Sub23_Sub2_2.method5494();
													Static227.aStringArray32[local227] = Static438.aClass2_Sub23_Sub2_2.method5494();
													if (Static227.aStringArray32[local227].equals("")) {
														Static227.aStringArray32[local227] = Static367.aStringArray45[local227];
													}
													Static160.aStringArray31[local227] = Static438.aClass2_Sub23_Sub2_2.method5494();
													Static67.aStringArray8[local227] = Static438.aClass2_Sub23_Sub2_2.method5494();
													if (Static67.aStringArray8[local227].equals("")) {
														Static67.aStringArray8[local227] = Static160.aStringArray31[local227];
													}
													Static102.aBooleanArray11[local227] = false;
												}
												Static138.aClass265_54 = null;
												Static118.anInt2673 = Static37.anInt715;
												return true;
											} else if (Static138.aClass265_54 == Static85.aClass265_36) {
												local227 = Static438.aClass2_Sub23_Sub2_2.method5460();
												local67 = Static438.aClass2_Sub23_Sub2_2.method5468();
												if (Static391.method3868(local227)) {
													Static36.method601(local67, -1, -1, 3);
												}
												Static138.aClass265_54 = null;
												return true;
											} else {
												Static361.method4904(null, "T1 - " + (Static138.aClass265_54 == null ? -1 : Static138.aClass265_54.method5715()) + "," + (Static171.aClass265_69 == null ? -1 : Static171.aClass265_69.method5715()) + "," + (Static317.aClass265_122 == null ? -1 : Static317.aClass265_122.method5715()) + " - " + Static379.anInt6425);
												Static220.method3461();
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
