import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!nl;")
	public static Class171 aClass171_2;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_1 = new Class11(78, 4);

	@OriginalMember(owner = "client!af", name = "k", descriptor = "J")
	public static long aLong6 = 0L;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_2 = new Class205(29, 8);

	@OriginalMember(owner = "client!af", name = "q", descriptor = "J")
	public static long aLong7 = 0L;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "[I")
	public static final int[] anIntArray45 = new int[250];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lclient!lk;")
	public static Class147 method84() {
		try {
			return (Class147) Class.forName("Class147_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Z")
	public static boolean method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static386.anInt6583; local1++) {
			@Pc(6) Class227 local6 = Static343.aClass227Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5777 == 1) {
				local15 = local6.anInt5776 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5780 + (local6.anInt5774 * local15 >> 8);
					local37 = local6.anInt5775 + (local6.anInt5781 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5785 * local15 >> 8);
					local57 = local6.anInt5778 + (local6.anInt5771 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5777 == 2) {
				local15 = arg0 - local6.anInt5776;
				if (local15 > 0) {
					local27 = local6.anInt5780 + (local6.anInt5774 * local15 >> 8);
					local37 = local6.anInt5775 + (local6.anInt5781 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5785 * local15 >> 8);
					local57 = local6.anInt5778 + (local6.anInt5771 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5777 == 3) {
				local15 = local6.anInt5780 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5776 + (local6.anInt5786 * local15 >> 8);
					local37 = local6.anInt5791 + (local6.anInt5790 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5785 * local15 >> 8);
					local57 = local6.anInt5778 + (local6.anInt5771 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5777 == 4) {
				local15 = arg2 - local6.anInt5780;
				if (local15 > 0) {
					local27 = local6.anInt5776 + (local6.anInt5786 * local15 >> 8);
					local37 = local6.anInt5791 + (local6.anInt5790 * local15 >> 8);
					local47 = local6.anInt5789 + (local6.anInt5785 * local15 >> 8);
					local57 = local6.anInt5778 + (local6.anInt5771 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5777 == 5) {
				local15 = arg1 - local6.anInt5789;
				if (local15 > 0) {
					local27 = local6.anInt5776 + (local6.anInt5786 * local15 >> 8);
					local37 = local6.anInt5791 + (local6.anInt5790 * local15 >> 8);
					local47 = local6.anInt5780 + (local6.anInt5774 * local15 >> 8);
					local57 = local6.anInt5775 + (local6.anInt5781 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lclient!bc;")
	public static Class17[] method88() {
		return new Class17[] { Static320.aClass17_1, Static320.aClass17_2, Static320.aClass17_3, Static320.aClass17_4, Static320.aClass17_5, Static320.aClass17_6, Static320.aClass17_7, Static320.aClass17_8, Static320.aClass17_9, Static320.aClass17_10 };
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method89() {
		Static149.method5444();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static58.aClass188Array1[local13].method4043();
		}
		Static51.method869();
		Static206.method3485();
		System.gc();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
	public static void method91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg0, 16);
		local8.method864();
		local8.anInt1037 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!gf;IBLclient!vh;I)V")
	public static void method94(@OriginalArg(0) Class1_Sub5_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub16_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg1 & 0x1000) != 0) {
			arg0.aString66 = arg2.method5364();
			if (arg0.aString66.charAt(0) == '~') {
				arg0.aString66 = arg0.aString66.substring(1);
				Static292.method4413(arg0.method2253(), 2, arg0.aString66, 0, arg0.method2250());
			} else if (arg0 == Static206.aClass1_Sub5_Sub1_Sub1_1) {
				Static292.method4413(arg0.method2253(), 2, arg0.aString66, 0, arg0.method2250());
			}
			arg0.anInt6449 = 150;
			arg0.anInt6393 = 0;
			arg0.anInt6434 = 0;
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(137) int local137;
		@Pc(212) int local212;
		@Pc(260) int local260;
		if ((arg1 & 0x100) != 0) {
			local88 = arg2.method5349();
			local92 = arg2.method5366();
			if (local88 == 65535) {
				local88 = -1;
			}
			@Pc(99) boolean local99 = true;
			@Pc(191) Class202 local191;
			if (local88 != -1 && arg0.anInt6420 != -1) {
				@Pc(120) Class34 local120;
				if (local88 == arg0.anInt6420) {
					local120 = Static149.aClass173_5.method3800(local88);
					if (local120.aBoolean65 && local120.anInt863 != -1) {
						@Pc(134) Class202 local134 = Static36.aClass236_1.method5396(local120.anInt863);
						local137 = local134.anInt4932;
						if (local137 == 0) {
							local99 = false;
						} else if (local137 == 1) {
							local99 = true;
						} else if (local137 == 2) {
							local99 = false;
							arg0.anInt6452 = 0;
						}
					}
				} else {
					local120 = Static149.aClass173_5.method3800(local88);
					@Pc(175) Class34 local175 = Static149.aClass173_5.method3800(arg0.anInt6420);
					if (local120.anInt863 != -1 && local175.anInt863 != -1) {
						local191 = Static36.aClass236_1.method5396(local120.anInt863);
						@Pc(197) Class202 local197 = Static36.aClass236_1.method5396(local175.anInt863);
						if (local197.anInt4945 > local191.anInt4945) {
							local99 = false;
						}
					}
				}
			}
			if (local99) {
				local212 = Static253.anInt4469;
				arg0.anInt6420 = local88;
				arg0.anInt6411 = local92 >> 16;
				arg0.anInt6404 = 0;
				arg0.anInt6395 = local212 + (local92 & 0xFFFF);
				arg0.anInt6400 = 0;
				arg0.anInt6442 = 1;
				if (arg0.anInt6395 > local212) {
					arg0.anInt6404 = -1;
				}
				if (arg0.anInt6420 != -1 && arg0.anInt6395 == local212) {
					local260 = Static149.aClass173_5.method3800(arg0.anInt6420).anInt863;
					if (local260 != -1) {
						local191 = Static36.aClass236_1.method5396(local260);
						if (local191 != null && local191.anIntArray974 != null) {
							Static169.method2965(0, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg0, arg0.aByte69, arg0.anInt6390, local191, arg0.anInt6386);
						}
					}
				}
			}
		}
		if ((arg1 & 0x20) != 0) {
			local88 = arg2.method5359();
			@Pc(305) byte[] local305 = new byte[local88];
			@Pc(310) Class2_Sub16 local310 = new Class2_Sub16(local305);
			arg2.method5357(local88, local305);
			Static43.aClass2_Sub16Array1[arg3] = local310;
			arg0.method2251(local310);
		}
		if ((arg1 & 0x4) != 0) {
			local88 = arg2.method5323();
			if (local88 == 65535) {
				local88 = -1;
			}
			arg0.anInt6410 = local88;
		}
		if ((arg1 & 0x2) != 0) {
			Static95.aByteArray114[arg3] = arg2.method5371();
		}
		@Pc(367) int local367;
		if ((arg1 & 0x4000) != 0) {
			local88 = Static253.anInt4469;
			local92 = arg2.method5311();
			local367 = arg2.method5359();
			arg0.method5543(local367, local92, local88);
		}
		if ((arg1 & 0x1) != 0) {
			local88 = arg2.method5312();
			local92 = arg2.method5338();
			local367 = arg2.method5338();
			local212 = arg2.anInt6145;
			@Pc(403) boolean local403 = (local88 & 0x8000) != 0;
			if (arg0.aString24 != null && arg0.aClass224_1 != null) {
				@Pc(411) boolean local411 = false;
				if (local92 <= 1) {
					if (!local403 && (Static305.aBoolean386 && !Static169.aBoolean245 || Static51.aBoolean82)) {
						local411 = true;
					} else if (Static67.method1057(arg0.aString24)) {
						local411 = true;
					}
				}
				if (!local411 && Static380.anInt6478 == 0) {
					Static111.aClass2_Sub16_3.anInt6145 = 0;
					arg2.method5340(Static111.aClass2_Sub16_3.aByteArray112, local367);
					Static111.aClass2_Sub16_3.anInt6145 = 0;
					@Pc(457) int local457 = -1;
					@Pc(478) String local478;
					if (local403) {
						local88 &= 0x7FFF;
						@Pc(467) Class53 local467 = Static373.method5467(Static111.aClass2_Sub16_3);
						local457 = local467.anInt1274;
						local478 = local467.aClass2_Sub10_Sub6_1.method1145(Static111.aClass2_Sub16_3);
					} else {
						local478 = Static249.method5599(Static373.method5465(Static185.method3199(Static111.aClass2_Sub16_3)));
					}
					arg0.aString66 = local478.trim();
					arg0.anInt6393 = local88 & 0xFF;
					arg0.anInt6434 = local88 >> 8;
					arg0.anInt6449 = 150;
					@Pc(521) int local521;
					if (local92 == 1 || local92 == 2) {
						local521 = local403 ? 17 : 1;
					} else {
						local521 = local403 ? 17 : 2;
					}
					if (local92 == 2) {
						Static64.method1050("<img=1>" + arg0.method2250(), 0, local521, "<img=1>" + arg0.method2253(), local478, null, local457);
					} else if (local92 == 1) {
						Static64.method1050("<img=0>" + arg0.method2250(), 0, local521, "<img=0>" + arg0.method2253(), local478, null, local457);
					} else {
						Static64.method1050(arg0.method2250(), 0, local521, arg0.method2253(), local478, null, local457);
					}
				}
			}
			arg2.anInt6145 = local367 + local212;
		}
		if ((arg1 & 0x800) != 0) {
			local88 = arg2.method5315();
			@Pc(629) int[] local629 = new int[local88];
			@Pc(632) int[] local632 = new int[local88];
			@Pc(635) int[] local635 = new int[local88];
			for (local260 = 0; local260 < local88; local260++) {
				local137 = arg2.method5312();
				if (local137 == 65535) {
					local137 = -1;
				}
				local629[local260] = local137;
				local632[local260] = arg2.method5359();
				local635[local260] = arg2.method5349();
			}
			Static287.method4352(local632, arg0, local629, local635);
		}
		if ((arg1 & 0x200) != 0) {
			arg0.anInt6433 = arg2.method5371();
			arg0.anInt6437 = arg2.method5371();
			arg0.anInt6407 = arg2.method5373();
			arg0.anInt6432 = arg2.method5373();
			arg0.anInt6412 = arg2.method5312() + Static253.anInt4469;
			arg0.anInt6441 = arg2.method5323() + Static253.anInt4469;
			arg0.lb = arg2.method5359();
			arg0.anInt6455 = 0;
			if (arg0.anInt2281 == -1) {
				arg0.anInt6407 += arg0.anIntArray1324[0];
				arg0.anInt6456 = 1;
				arg0.anInt6433 += arg0.anIntArray1324[0];
				arg0.anInt6432 += arg0.anIntArray1323[0];
				arg0.anInt6437 += arg0.anIntArray1323[0];
			} else {
				arg0.anInt6407 += arg0.anInt2281;
				arg0.anInt6433 += arg0.anInt2281;
				arg0.anInt6456 = 0;
				arg0.anInt6432 += arg0.anInt2276;
				arg0.anInt6437 += arg0.anInt2276;
			}
		}
		if ((arg1 & 0x8) != 0) {
			arg0.anInt2280 = arg2.method5323();
			if (arg0.anInt6456 == 0) {
				arg0.method5554(arg0.anInt2280);
				arg0.anInt2280 = -1;
			}
		}
		if ((arg1 & 0x400) != 0) {
			local88 = arg2.method5323();
			arg0.anInt6446 = arg2.method5359();
			arg0.anInt6424 = arg2.method5359();
			arg0.anInt6401 = local88 & 0x7FFF;
			arg0.aBoolean458 = (local88 & 0x8000) != 0;
			arg0.anInt6447 = arg0.anInt6401 + Static253.anInt4469 + arg0.anInt6446;
		}
		if ((arg1 & 0x10) != 0) {
			local88 = arg2.method5312();
			if (local88 == 65535) {
				local88 = -1;
			}
			local92 = arg2.method5350();
			Static359.method5244(local88, arg0, local92);
		}
		if ((arg1 & 0x80) != 0) {
			local88 = arg2.method5311();
			local92 = arg2.method5350();
			arg0.method5543(local92, local88, Static253.anInt4469);
			arg0.anInt6421 = Static253.anInt4469 + 300;
			arg0.anInt6403 = arg2.method5359();
		}
		if ((arg1 & 0x2000) != 0) {
			local7 = arg2.method5330();
		}
		if (arg0.anInt2281 == -1) {
			return;
		}
		if (local7 == 127) {
			arg0.method2248(arg0.anInt2276, arg0.anInt2281);
			return;
		}
		@Pc(954) byte local954;
		if (local7 == -1) {
			local954 = Static95.aByteArray114[arg3];
		} else {
			local954 = local7;
		}
		arg0.method2252(arg0.anInt2276, arg0.anInt2281, local954);
	}
}
