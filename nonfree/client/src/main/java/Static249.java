import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
	public static int anInt4901 = 0;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	public static int anInt4907 = -1;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lclient!og;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	public static void method4523() {
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) Static147.aClass216_8.method5992(); local15 != null; local15 = (Class2_Sub20) Static147.aClass216_8.method6000()) {
			if (local15.anInt2467 > 0) {
				local15.anInt2467--;
			}
			if (local15.anInt2467 != 0) {
				if (local15.anInt2465 > 0) {
					local15.anInt2465--;
				}
				if (local15.anInt2465 == 0 && local15.anInt2464 >= 1 && local15.anInt2468 >= 1 && Static95.anInt6381 - 2 >= local15.anInt2464 && local15.anInt2468 <= Static237.anInt4532 - 2 && (local15.anInt2463 < 0 || Static269.method4865(local15.anInt2459, local15.anInt2463))) {
					Static180.method3292(local15.anInt2463, local15.anInt2462, local15.anInt2459, local15.anInt2466, local15.anInt2464, -1, local15.anInt2468, local15.anInt2461);
					local15.anInt2465 = -1;
					if (local15.anInt2463 == local15.anInt2458 && local15.anInt2458 == -1) {
						local15.method5945();
					} else if (local15.anInt2463 == local15.anInt2458 && local15.anInt2460 == local15.anInt2466 && local15.anInt2472 == local15.anInt2459) {
						local15.method5945();
					}
				}
			} else if (local15.anInt2458 < 0 || Static269.method4865(local15.anInt2472, local15.anInt2458)) {
				Static180.method3292(local15.anInt2458, local15.anInt2462, local15.anInt2472, local15.anInt2460, local15.anInt2464, -1, local15.anInt2468, local15.anInt2461);
				local15.method5945();
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ae;Lclient!tq;B)V")
	public static void method4524(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class191 arg1) {
		@Pc(10) Class76[] local10 = Static361.method2367(arg1, Static96.anInt2181);
		Static65.aClass31Array3 = new Class31[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static65.aClass31Array3[local16] = arg0.method4214(local10[local16]);
		}
		local10 = Static361.method2367(arg1, Static237.anInt4546);
		Static338.aClass31Array18 = new Class31[local10.length];
		for (@Pc(52) int local52 = 0; local52 < local10.length; local52++) {
			Static338.aClass31Array18[local52] = arg0.method4214(local10[local52]);
		}
		local10 = Static361.method2367(arg1, Static39.anInt792);
		Static209.aClass31Array15 = new Class31[local10.length];
		for (@Pc(79) int local79 = 0; local79 < local10.length; local79++) {
			Static209.aClass31Array15[local79] = arg0.method4214(local10[local79]);
		}
		local10 = Static361.method2367(arg1, Static350.anInt6742);
		Static105.aClass31Array5 = new Class31[local10.length];
		for (@Pc(110) int local110 = 0; local110 < local10.length; local110++) {
			Static105.aClass31Array5[local110] = arg0.method4214(local10[local110]);
		}
		local10 = Static361.method2367(arg1, Static118.anInt4999);
		Static144.aClass31Array9 = new Class31[local10.length];
		for (@Pc(141) int local141 = 0; local141 < local10.length; local141++) {
			Static144.aClass31Array9[local141] = arg0.method4214(local10[local141]);
		}
		local10 = Static361.method2367(arg1, Static205.anInt3972);
		Static170.aClass31Array11 = new Class31[local10.length];
		for (@Pc(172) int local172 = 0; local172 < local10.length; local172++) {
			Static170.aClass31Array11[local172] = arg0.method4214(local10[local172]);
		}
		local10 = Static361.method2367(arg1, Static192.anInt3750);
		Static87.aClass31Array4 = new Class31[local10.length];
		for (@Pc(203) int local203 = 0; local203 < local10.length; local203++) {
			Static87.aClass31Array4[local203] = arg0.method4214(local10[local203]);
		}
		local10 = Static361.method2367(arg1, Static17.anInt392);
		Static38.aClass31Array2 = new Class31[local10.length];
		for (@Pc(234) int local234 = 0; local234 < local10.length; local234++) {
			Static38.aClass31Array2[local234] = arg0.method4214(local10[local234]);
		}
		local10 = Static361.method2367(arg1, Static18.anInt426);
		Static355.aClass31Array19 = new Class31[local10.length];
		for (@Pc(265) int local265 = 0; local265 < local10.length; local265++) {
			Static355.aClass31Array19[local265] = arg0.method4214(local10[local265]);
		}
		local10 = Static361.method2367(arg1, Static55.anInt4788);
		Static148.aClass31Array10 = new Class31[local10.length];
		for (@Pc(296) int local296 = 0; local296 < local10.length; local296++) {
			Static148.aClass31Array10[local296] = arg0.method4214(local10[local296]);
		}
		local10 = Static361.method2367(arg1, Static39.anInt790);
		Static125.aClass31Array6 = new Class31[local10.length];
		for (@Pc(327) int local327 = 0; local327 < local10.length; local327++) {
			Static125.aClass31Array6[local327] = arg0.method4214(local10[local327]);
		}
		local10 = Static361.method2367(arg1, Static37.anInt701);
		Static326.aClass31Array17 = new Class31[local10.length];
		for (@Pc(358) int local358 = 0; local358 < local10.length; local358++) {
			Static326.aClass31Array17[local358] = arg0.method4214(local10[local358]);
		}
		local10 = Static361.method2367(arg1, Static173.anInt3525);
		Static262.aClass31Array16 = new Class31[local10.length];
		for (@Pc(389) int local389 = 0; local389 < local10.length; local389++) {
			Static262.aClass31Array16[local389] = arg0.method4214(local10[local389]);
		}
		Static253.aClass31_141 = arg0.method4214(Static361.method2368(arg1, Static65.anInt1428, 0));
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLjava/lang/String;ZIILjava/lang/String;ZZIJI)V")
	public static void method4525(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class2_Sub10 local28 = new Class2_Sub10(128);
		local28.method4430(10);
		local28.method4452((arg2 ? 4 : 0) | (arg0 ? 1 : 0) | (arg6 ? 2 : 0));
		local28.method4462(arg8);
		local28.method4450(local8[0]);
		local28.method4443(arg5);
		local28.method4450(local8[1]);
		local28.method4452(Static94.anInt2145);
		local28.method4430(arg4);
		local28.method4430(arg7);
		local28.method4450(local8[2]);
		local28.method4452(arg9);
		local28.method4452(arg3);
		local28.method4450(local8[3]);
		local28.method4405(Static302.aBigInteger2, Static31.aBigInteger1);
		@Pc(118) Class2_Sub10 local118 = new Class2_Sub10(350);
		local118.method4443(arg1);
		@Pc(131) int local131 = 8 - Static124.method3876(arg1) % 8;
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			local118.method4430((int) (Math.random() * 255.0D));
		}
		local118.method4406(local8);
		Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
		Static74.aClass2_Sub10_Sub1_2.method4430(22);
		Static74.aClass2_Sub10_Sub1_2.method4452(local118.anInt4807 + local28.anInt4807 + 2);
		Static74.aClass2_Sub10_Sub1_2.method4452(569);
		Static74.aClass2_Sub10_Sub1_2.method4418(local28.aByteArray57, local28.anInt4807);
		Static74.aClass2_Sub10_Sub1_2.method4418(local118.aByteArray57, local118.anInt4807);
		Static32.anInt582 = -3;
		Static59.anInt1289 = 0;
		Static345.anInt664 = 1;
		Static341.anInt6833 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Ljava/lang/Object;[JBII)V")
	public static void method4526(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if (arg1[local46] < (long) (local46 & 0x1) + local20) {
				@Pc(67) long local67 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local67;
				@Pc(81) Object local81 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local81;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method4526(arg0, arg1, arg2, local16 - 1);
		method4526(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
	public static void method4527(@OriginalArg(0) int arg0) {
		Static315.method5541();
		@Pc(10) int local10 = Static183.method3316(arg0).anInt4348;
		if (local10 == 0) {
			return;
		}
		@Pc(28) int local28 = Static133.anIntArray238[arg0];
		if (local10 == 6) {
			Static302.anInt6072 = local28;
		}
		if (local10 == 5) {
			Static277.anInt5640 = local28;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	public static void method4528() {
		Static318.method5586();
		Static324.method5679();
		Static92.method727();
		Static96.method2167();
		Static76.method1679();
		Static305.method5361();
		Static238.method4108();
		Static337.method5830();
		Static179.method3266();
		Static356.method6002();
		Static157.method2972();
		Static321.method5619();
		Static93.method2108();
		Static267.method4826();
		Static347.method3871();
		Static2.method59();
		Static64.method1479();
		Static313.method5506();
		Static23.method713();
		Static131.method2633();
		Static110.method2387();
		Static342.method5922();
		Static137.method2723();
		Static112.aClass119_75.method3315(5);
		Static50.aClass119_31.method3315(5);
		Static121.aClass119_77.method3315(5);
		Static151.aClass119_94.method3315(5);
		Static72.aClass119_47.method3315(5);
	}
}
