import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public static int anInt3207;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1120 = Static200.method3116("overlay2)3dat");

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public static int anInt3208 = 0;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "[I")
	public static int[] anIntArray418 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	public static int anInt3217 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V")
	public static void method2449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static130.aClass73Array6[0].method2270(arg4, arg0);
		@Pc(21) int local21 = (arg1 - 32) * arg1 / arg2;
		if (local21 < 8) {
			local21 = 8;
		}
		Static130.aClass73Array6[1].method2270(arg4, arg1 + arg0 - 16);
		@Pc(51) int local51 = (arg1 - local21 - 32) * arg3 / (arg2 - arg1);
		Static76.method1367(arg4, arg0 + 16, 16, arg1 - 32, Static27.anInt642);
		Static76.method1367(arg4, local51 + arg0 + 16, 16, local21, Static53.anInt1427);
		Static76.method1365(arg4, arg0 + local51 + 16, local21, Static211.anInt3464);
		Static76.method1365(arg4 + 1, arg0 - (-16 - local51), local21, Static211.anInt3464);
		Static76.method1357(arg4, arg0 + local51 + 16, 16, Static211.anInt3464);
		Static76.method1357(arg4, local51 + arg0 + 17, 16, Static211.anInt3464);
		Static76.method1365(arg4 + 15, arg0 - (-16 - local51), local21, Static55.anInt1478);
		Static76.method1365(arg4 + 14, arg0 + 17 - -local51, local21 - 1, Static55.anInt1478);
		Static76.method1357(arg4, arg0 + local51 + local21 + 15, 16, Static55.anInt1478);
		Static76.method1357(arg4 + 1, local51 + 14 + arg0 + local21, 15, Static55.anInt1478);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Lclient!we;")
	public static Class1_Sub1_Sub28 method2450(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub28 local12 = (Class1_Sub1_Sub28) Static168.aClass39_21.method1161((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(35) byte[] local35 = Static96.aClass7_18.method3242(Static78.method1387(arg0), Static105.method1785(arg0));
		local12 = new Class1_Sub1_Sub28();
		if (local35 != null) {
			local12.method3441(new Class1_Sub9(local35));
		}
		Static168.aClass39_21.method1152((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V")
	public static void method2453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6 local8 = Static92.method1619(arg0, arg2);
		if (local8 != null && local8.anObjectArray9 != null) {
			@Pc(17) Class1_Sub8 local17 = new Class1_Sub8();
			local17.aClass6_5 = local8;
			local17.anObjectArray29 = local8.anObjectArray9;
			Static93.method1622(local17);
		}
		Static210.anInt3912 = arg1;
		Static96.anInt2254 = arg2;
		Static27.anInt640 = arg0;
		Static75.aBoolean98 = true;
		Static57.method1068(local8);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)Lclient!kh;")
	public static Class60 method2455(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static34.method611(new Class60[] { Static12.aClass60_100, Static40.method681(arg0), Static175.aClass60_1289 });
		} else if (arg0 < 10000000) {
			return Static34.method611(new Class60[] { Static108.aClass60_810, Static40.method681(arg0 / 1000), Static188.aClass60_1362, Static175.aClass60_1289 });
		} else {
			return Static34.method611(new Class60[] { Static213.aClass60_1559, Static40.method681(arg0 / 1000000), Static201.aClass60_1467, Static175.aClass60_1289 });
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIBI)I")
	public static int method2456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg1;
		@Pc(9) int local9 = arg2 & arg1 - 1;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(22) int local22 = Static167.method2735(local3, local17);
		@Pc(28) int local28 = arg1 - 1 & arg0;
		@Pc(40) int local40 = Static167.method2735(local3 + 1, local17);
		@Pc(47) int local47 = Static167.method2735(local3, local17 + 1);
		@Pc(56) int local56 = Static167.method2735(local3 + 1, local17 + 1);
		@Pc(63) int local63 = Static38.method658(local22, local40, arg1, local9);
		@Pc(70) int local70 = Static38.method658(local47, local56, arg1, local9);
		return Static38.method658(local63, local70, arg1, local28);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg0 - arg3;
		@Pc(14) int local14 = arg6 - arg5;
		@Pc(23) int local23 = (arg2 - arg4 << 16) / local5;
		@Pc(31) int local31 = (arg7 - arg1 << 16) / local14;
		@Pc(43) boolean local43;
		if (Static216.anInt4616 > 0 && Static216.anInt4616 % 10 < 5) {
			local43 = true;
		} else {
			local43 = false;
		}
		@Pc(65) int local65;
		@Pc(70) int local70;
		@Pc(91) int local91;
		@Pc(99) int local99;
		@Pc(107) int local107;
		@Pc(150) int local150;
		@Pc(156) int local156;
		for (@Pc(49) int local49 = 0; local49 < local5; local49++) {
			@Pc(57) int local57 = local49 * local23 >> 16;
			local65 = (local49 + 1) * local23 >> 16;
			local70 = local65 - local57;
			if (local70 > 0) {
				local57 += arg4;
				@Pc(89) int[][] local89 = Static52.anIntArrayArrayArray8[local49 + arg3 >> 6];
				for (local91 = 0; local91 < local14; local91++) {
					local99 = local91 * local31 >> 16;
					local107 = local31 * (local91 + 1) >> 16;
					@Pc(112) int local112 = local107 - local99;
					if (local112 > 0) {
						local99 += arg1;
						@Pc(131) int local131 = arg5 + local91 >> 6;
						if (local89[local131] != null) {
							local150 = ((local91 + arg5 & 0x3F) << 6) + (local49 + arg3 & 0x3F);
							local156 = local89[local131][local150];
							if (local156 != 0) {
								@Pc(167) Class1_Sub1_Sub23 local167 = Static44.method760(local156 - 1);
								if (local43 && Static164.anInt3599 == local167.anInt4035) {
									@Pc(181) Class1_Sub20 local181 = new Class1_Sub20();
									local181.anInt3103 = local57;
									local181.anInt3104 = local167.anInt4035;
									local181.anInt3106 = local99;
									Static122.aClass19_11.method620(local181);
								}
								Static1.aClass1_Sub1_Sub6_Sub1Array1[local167.anInt4035].method2164(local57 - 7, local99 + -7);
							}
						}
					}
				}
			}
		}
		if (Static8.aDouble1 == Static82.aDouble2) {
			for (@Pc(227) Class1_Sub10 local227 = (Class1_Sub10) Static39.aClass19_5.method609(); local227 != null; local227 = (Class1_Sub10) Static39.aClass19_5.method615()) {
				local65 = local227.anInt1611;
				local65 -= Static73.anInt1791;
				local70 = local227.anInt1614;
				local70 = Static153.anInt3417 + Static30.anInt724 - local70;
				@Pc(261) int local261 = arg4 + (arg2 - arg4) * (local65 - arg3) / (arg0 - arg3);
				local91 = arg1 + (arg7 - arg1) * (local70 - arg5) / (arg6 - arg5);
				@Pc(279) Class88 local279 = null;
				local107 = 16777215;
				local99 = local227.anInt1609;
				if (local99 == 0) {
					if (Static82.aDouble2 == 3.0D) {
						local279 = Static93.aClass88_4;
					}
					if (Static82.aDouble2 == 4.0D) {
						local279 = Static25.aClass88_2;
					}
					if (Static82.aDouble2 == 6.0D) {
						local279 = Static154.aClass88_6;
					}
					if (Static82.aDouble2 == 8.0D) {
						local279 = Static139.aClass88_5;
					}
				}
				if (local99 == 1) {
					if (Static82.aDouble2 == 3.0D) {
						local279 = Static154.aClass88_6;
					}
					if (Static82.aDouble2 == 4.0D) {
						local279 = Static139.aClass88_5;
					}
					if (Static82.aDouble2 == 6.0D) {
						local279 = Static168.aClass88_7;
					}
					if (Static82.aDouble2 == 8.0D) {
						local279 = Static199.aClass88_8;
					}
				}
				if (local99 == 2) {
					if (Static82.aDouble2 == 3.0D) {
						local279 = Static168.aClass88_7;
					}
					local107 = 16755200;
					if (Static82.aDouble2 == 4.0D) {
						local279 = Static199.aClass88_8;
					}
					if (Static82.aDouble2 == 6.0D) {
						local279 = Static2.aClass88_1;
					}
					if (Static82.aDouble2 == 8.0D) {
						local279 = Static64.aClass88_3;
					}
				}
				if (local279 != null) {
					@Pc(376) Class60[] local376 = local227.aClass60Array11;
					local150 = local376.length;
					local91 -= (local150 - 1) * local279.method2796() / 2;
					local91 += local279.method2801() / 2;
					for (local156 = 0; local156 < local150; local156++) {
						local279.method2800(local376[local156], local261, local91, local107);
						local91 += local279.method2796();
					}
				}
			}
		}
		for (@Pc(437) Class1_Sub20 local437 = (Class1_Sub20) Static122.aClass19_11.method609(); local437 != null; local437 = (Class1_Sub20) Static122.aClass19_11.method615()) {
			Static1.aClass1_Sub1_Sub6_Sub1Array1[local437.anInt3104].method2164(local437.anInt3103 - 7, local437.anInt3106 + -7);
			Static76.method1371(local437.anInt3103, local437.anInt3106, 15, 16776960, 128);
			Static76.method1371(local437.anInt3103, local437.anInt3106, 7, 16777215, 256);
		}
		Static122.aClass19_11.method619();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(JI)V")
	public static void method2459(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}
}
