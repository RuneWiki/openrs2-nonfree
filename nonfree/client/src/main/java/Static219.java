import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
	public static int anInt2994;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1010 = null;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1011 = Static186.method3527("rot:");

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
	public static int anInt2996 = 0;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[50][];

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
	public static void method2416() {
		Static35.aClass84_15.method2576();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Lclient!le;")
	public static Class1_Sub1_Sub11 method2418(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub11 local10 = (Class1_Sub1_Sub11) Static133.aClass4_6.method81((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = Static217.aClass86_80.method3325(1, arg0);
		} else {
			local27 = Static103.aClass86_34.method3325(1, arg0 & 0x7FFF);
		}
		local10 = new Class1_Sub1_Sub11();
		if (local27 != null) {
			local10.method1915(new Class1_Sub17(local27));
		}
		if (arg0 >= 32768) {
			local10.method1914();
		}
		Static133.aClass4_6.method83(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLclient!pa;)V")
	public static void method2419(@OriginalArg(1) Class86 arg0) {
		Static82.aClass78_Sub1Array2 = Static190.method3117(Static34.anInt661, arg0);
		Static233.aClass78_Sub1Array9 = new Class78_Sub1[Static82.aClass78_Sub1Array2.length];
		Static102.aClass78_Sub1Array3 = new Class78_Sub1[Static82.aClass78_Sub1Array2.length];
		Static204.aClass78_Sub1Array6 = new Class78_Sub1[Static82.aClass78_Sub1Array2.length];
		for (@Pc(25) int local25 = 0; local25 < Static82.aClass78_Sub1Array2.length; local25++) {
			Static82.aClass78_Sub1Array2[local25].method3023();
			Static233.aClass78_Sub1Array9[local25] = Static82.aClass78_Sub1Array2[local25].method3021();
			Static82.aClass78_Sub1Array2[local25].method3023();
			Static102.aClass78_Sub1Array3[local25] = Static82.aClass78_Sub1Array2[local25].method3021();
			Static82.aClass78_Sub1Array2[local25].method3023();
			Static204.aClass78_Sub1Array6[local25] = Static82.aClass78_Sub1Array2[local25].method3021();
			Static82.aClass78_Sub1Array2[local25].method3023();
		}
		Static73.aClass1_Sub1_Sub8_Sub1Array7 = Static34.method509(arg0, Static150.anInt3127);
		Static220.aClass1_Sub1_Sub8Array11 = Static135.method2285(Static56.anInt1101, arg0);
		Static145.aClass1_Sub1_Sub8Array5 = Static135.method2285(Static104.anInt2076, arg0);
		Static146.aClass1_Sub1_Sub8Array6 = Static135.method2285(Static62.anInt1227, arg0);
		Static76.aClass1_Sub1_Sub8Array2 = Static135.method2285(Static83.anInt2313, arg0);
		Static14.aClass1_Sub1_Sub8Array1 = Static231.method3484(arg0, Static79.anInt3171);
		Static98.aClass1_Sub1_Sub8Array3 = Static231.method3484(arg0, Static8.anInt184);
		Static35.aClass1_Sub1_Sub8_3 = Static3.method48(arg0, Static4.anInt91);
		Static209.aClass1_Sub1_Sub8Array9 = Static231.method3484(arg0, Static135.anInt2792);
		Static147.aClass1_Sub1_Sub8Array7 = Static231.method3484(arg0, Static173.anInt3574);
		Static14.aClass78Array1 = Static117.method1864(arg0, Static230.anInt3198);
		Static208.aClass78Array7 = Static117.method1864(arg0, Static132.anInt2746);
		Static5.aClass1_Sub1_Sub10_1.method1832(Static208.aClass78Array7, null);
		Static130.aClass1_Sub1_Sub10_2.method1832(Static208.aClass78Array7, null);
		Static187.aClass1_Sub1_Sub10_3.method1832(Static208.aClass78Array7, null);
		@Pc(163) Class1_Sub1_Sub8_Sub1 local163 = Static131.method2206(arg0, anInt2994);
		local163.method2432();
		Static114.aClass1_Sub1_Sub8_4 = local163;
		@Pc(173) Class1_Sub1_Sub8_Sub1[] local173 = Static34.method509(arg0, Static17.anInt326);
		for (@Pc(175) int local175 = 0; local175 < local173.length; local175++) {
			local173[local175].method2432();
		}
		Static144.aClass1_Sub1_Sub8Array4 = local173;
		@Pc(199) int local199 = (int) (Math.random() * 21.0D) - 10;
		@Pc(206) int local206 = (int) (Math.random() * 21.0D) - 10;
		@Pc(213) int local213 = (int) (Math.random() * 41.0D) - 20;
		@Pc(220) int local220 = (int) (Math.random() * 21.0D) - 10;
		for (@Pc(222) int local222 = 0; local222 < Static73.aClass1_Sub1_Sub8_Sub1Array7.length; local222++) {
			Static73.aClass1_Sub1_Sub8_Sub1Array7[local222].method2439(local213 + local199, local213 + local206, local213 + local220);
		}
		Static82.aClass78_Sub1Array2[0].method3024(local213 + local199, local213 + local206, local220 + local213);
		Static210.aClass1_Sub1_Sub8Array10 = Static73.aClass1_Sub1_Sub8_Sub1Array7;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIIII)V")
	public static void method2422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - arg2;
		@Pc(14) int local14 = arg1 - arg0;
		if (local14 == 0) {
			if (local9 != 0) {
				Static18.method264(arg2, arg4, arg3, arg0);
			}
		} else if (local9 == 0) {
			Static126.method2029(arg2, arg3, arg0, arg1);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(57) boolean local57 = local9 > local14;
			@Pc(66) int local66;
			@Pc(70) int local70;
			if (local57) {
				local66 = arg0;
				arg0 = arg2;
				local70 = arg1;
				arg1 = arg4;
				arg4 = local70;
				arg2 = local66;
			}
			if (arg1 < arg0) {
				local66 = arg0;
				arg0 = arg1;
				arg1 = local66;
				local70 = arg2;
				arg2 = arg4;
				arg4 = local70;
			}
			local66 = arg2;
			local70 = arg1 - arg0;
			@Pc(102) int local102 = -(local70 >> 1);
			@Pc(106) int local106 = arg4 - arg2;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(125) int local125 = arg2 < arg4 ? 1 : -1;
			@Pc(129) int local129;
			if (local57) {
				for (local129 = arg0; local129 <= arg1; local129++) {
					local102 += local106;
					Static139.anIntArrayArray21[local129][local66] = arg3;
					if (local102 > 0) {
						local66 += local125;
						local102 -= local70;
					}
				}
			} else {
				for (local129 = arg0; local129 <= arg1; local129++) {
					local102 += local106;
					Static139.anIntArrayArray21[local66][local129] = arg3;
					if (local102 > 0) {
						local66 += local125;
						local102 -= local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZIIIZ)V")
	public static void method2426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static207.anInt4153 = (short) arg1;
		Static97.anInt1975 = (short) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!pg;Lclient!hh;B)I")
	public static int method2430(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) Class50 arg1) {
		@Pc(7) int local7 = arg0.anInt2656;
		arg0.method2168(arg1.anInt1705);
		arg0.anInt2656 += Static229.aClass59_1.method1584(arg1.aByteArray12, arg1.anInt1705, 0, arg0.aByteArray40, arg0.anInt2656);
		return arg0.anInt2656 - local7;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIII)V")
	public static void method2431(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class111 local13 = local7.aClass111_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4053;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class98 local58 = local7.aClass98_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3727;
		@Pc(67) int local67 = local58.anInt3729;
		@Pc(70) int local70 = local58.anInt3730;
		@Pc(73) int local73 = local58.anInt3728;
		@Pc(77) int[] local77 = Static98.anIntArrayArray11[local23];
		@Pc(81) int[] local81 = Static138.anIntArrayArray20[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}
}
