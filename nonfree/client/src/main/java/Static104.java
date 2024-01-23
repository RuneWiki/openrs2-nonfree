import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Z")
	public static boolean aBoolean169;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
	public static int anInt2460;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Lclient!mf;")
	public static Class1_Sub22 aClass1_Sub22_1 = new Class1_Sub22(0, 0);

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
	public static int anInt2455 = -1;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	public static int anInt2456 = 10;

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString141 = "Checking for updates - ";

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)Z")
	public static boolean method1932() {
		try {
			return Static147.method2583();
		} catch (@Pc(20) IOException local20) {
			Static136.method3363();
			return true;
		} catch (@Pc(25) Exception local25) {
			@Pc(66) String local66 = "T2 - " + Static201.anInt4077 + "," + Static227.anInt4510 + "," + Static33.anInt768 + " - " + Static33.anInt762 + "," + (Static197.aClass14_Sub2_Sub1_2.anIntArray415[0] + Static53.anInt5288) + "," + (Static197.aClass14_Sub2_Sub1_2.anIntArray418[0] + Static83.anInt1875) + " - ";
			for (@Pc(68) int local68 = 0; local68 < Static33.anInt762 && local68 < 50; local68++) {
				local66 = local66 + Static187.aClass1_Sub11_Sub1_2.aByteArray47[local68] + ",";
			}
			Static3.method136(local66, local25);
			Static39.method822();
			return true;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lclient!nk;")
	public static Class1_Sub2_Sub16 method1934(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub16 local10 = (Class1_Sub2_Sub16) Static297.aClass49_13.method1381((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static129.aClass91_101.method2495(5, arg0);
		local10 = new Class1_Sub2_Sub16();
		if (local29 != null) {
			local10.method3031(new Class1_Sub11(local29));
		}
		Static297.aClass49_13.method1385(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZI)I")
	public static int method1939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		while (arg0 > 0) {
			local11 = arg1 & 0x1 | local11 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)V")
	public static void method1942() {
		Static101.method1895(Static214.anInt4259);
		@Pc(23) int local23 = (Static239.anInt4738 >> 10) + (Static83.anInt1875 >> 3);
		@Pc(33) int local33 = (Static53.anInt5288 >> 3) + (Static69.anInt1504 >> 10);
		Static136.anIntArray379 = new int[18];
		Static270.aByteArrayArray14 = new byte[18][];
		Static124.anIntArrayArray9 = new int[18][4];
		Static24.anIntArray414 = new int[18];
		Static16.aByteArrayArray2 = new byte[18][];
		Static189.anIntArray350 = new int[18];
		Static39.aByteArrayArray5 = new byte[18][];
		Static170.aByteArrayArray9 = new byte[18][];
		Static225.anIntArray398 = new int[18];
		Static202.anIntArray365 = new int[18];
		Static143.aByteArrayArray8 = new byte[18][];
		Static118.anIntArray250 = new int[18];
		@Pc(78) int local78 = 0;
		@Pc(84) int local84;
		for (local84 = (local33 - 6) / 8; local84 <= (local33 + 6) / 8; local84++) {
			for (@Pc(97) int local97 = (local23 - 6) / 8; local97 <= (local23 + 6) / 8; local97++) {
				@Pc(115) int local115 = (local84 << 8) + local97;
				Static24.anIntArray414[local78] = local115;
				Static136.anIntArray379[local78] = Static203.aClass91_157.method2504("m" + local84 + "_" + local97);
				Static202.anIntArray365[local78] = Static203.aClass91_157.method2504("l" + local84 + "_" + local97);
				Static118.anIntArray250[local78] = Static203.aClass91_157.method2504("n" + local84 + "_" + local97);
				Static225.anIntArray398[local78] = Static203.aClass91_157.method2504("um" + local84 + "_" + local97);
				Static189.anIntArray350[local78] = Static203.aClass91_157.method2504("ul" + local84 + "_" + local97);
				if (Static118.anIntArray250[local78] == -1) {
					Static136.anIntArray379[local78] = -1;
					Static202.anIntArray365[local78] = -1;
					Static225.anIntArray398[local78] = -1;
					Static189.anIntArray350[local78] = -1;
				}
				local78++;
			}
		}
		for (local84 = local78; local84 < Static118.anIntArray250.length; local84++) {
			Static118.anIntArray250[local84] = -1;
			Static136.anIntArray379[local84] = -1;
			Static202.anIntArray365[local84] = -1;
			Static225.anIntArray398[local84] = -1;
			Static189.anIntArray350[local84] = -1;
		}
		Static102.method1907(local33, true, false, 8, 0, 8, local23);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII)V")
	public static void method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static168.method2914(arg2);
		@Pc(10) int local10 = 0;
		@Pc(16) int local16 = arg2;
		@Pc(19) int local19 = -arg2;
		@Pc(24) int local24 = arg2 - arg3;
		if (local24 < 0) {
			local24 = 0;
		}
		@Pc(34) int local34 = local24;
		@Pc(37) int local37 = -local24;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(91) int local91;
		if (Static297.anInt5619 <= arg5 && arg5 <= Static49.anInt1129) {
			@Pc(56) int[] local56 = Static22.anIntArrayArray3[arg5];
			local65 = Static23.method431(arg0 - arg2, Static68.anInt1451, Static224.anInt4436);
			local74 = Static23.method431(arg0 + arg2, Static68.anInt1451, Static224.anInt4436);
			local83 = Static23.method431(arg0 - local24, Static68.anInt1451, Static224.anInt4436);
			local91 = Static23.method431(arg0 + local24, Static68.anInt1451, Static224.anInt4436);
			Static126.method1523(local56, local83, arg1, local65);
			Static126.method1523(local56, local91, arg4, local83);
			Static126.method1523(local56, local74, arg1, local91);
		}
		@Pc(111) int local111 = -1;
		@Pc(113) int local113 = -1;
		while (local10 < local16) {
			local111 += 2;
			local37 += local111;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				Static21.anIntArray47[local34] = local10;
				local37 -= local34 << 1;
			}
			local113 += 2;
			local10++;
			local19 += local113;
			@Pc(213) int local213;
			@Pc(221) int local221;
			@Pc(232) int[] local232;
			@Pc(160) int local160;
			if (local19 >= 0) {
				local16--;
				local160 = arg5 - local16;
				local65 = arg5 + local16;
				local19 -= local16 << 1;
				if (local65 >= Static297.anInt5619 && local160 <= Static49.anInt1129) {
					if (local24 > local16) {
						local74 = Static21.anIntArray47[local16];
						local83 = Static23.method431(local10 + arg0, Static68.anInt1451, Static224.anInt4436);
						local91 = Static23.method431(arg0 - local10, Static68.anInt1451, Static224.anInt4436);
						local213 = Static23.method431(arg0 + local74, Static68.anInt1451, Static224.anInt4436);
						local221 = Static23.method431(arg0 - local74, Static68.anInt1451, Static224.anInt4436);
						if (Static49.anInt1129 >= local65) {
							local232 = Static22.anIntArrayArray3[local65];
							Static126.method1523(local232, local221, arg1, local91);
							Static126.method1523(local232, local213, arg4, local221);
							Static126.method1523(local232, local83, arg1, local213);
						}
						if (Static297.anInt5619 <= local160) {
							local232 = Static22.anIntArrayArray3[local160];
							Static126.method1523(local232, local221, arg1, local91);
							Static126.method1523(local232, local213, arg4, local221);
							Static126.method1523(local232, local83, arg1, local213);
						}
					} else {
						local74 = Static23.method431(local10 + arg0, Static68.anInt1451, Static224.anInt4436);
						local83 = Static23.method431(arg0 - local10, Static68.anInt1451, Static224.anInt4436);
						if (Static49.anInt1129 >= local65) {
							Static126.method1523(Static22.anIntArrayArray3[local65], local74, arg1, local83);
						}
						if (Static297.anInt5619 <= local160) {
							Static126.method1523(Static22.anIntArrayArray3[local160], local74, arg1, local83);
						}
					}
				}
			}
			local160 = arg5 - local10;
			local65 = local10 + arg5;
			if (local65 >= Static297.anInt5619 && local160 <= Static49.anInt1129) {
				local74 = arg0 + local16;
				local83 = arg0 - local16;
				if (local74 >= Static224.anInt4436 && Static68.anInt1451 >= local83) {
					local74 = Static23.method431(local74, Static68.anInt1451, Static224.anInt4436);
					local83 = Static23.method431(local83, Static68.anInt1451, Static224.anInt4436);
					if (local24 > local10) {
						local91 = local34 < local10 ? Static21.anIntArray47[local10] : local34;
						local213 = Static23.method431(local91 + arg0, Static68.anInt1451, Static224.anInt4436);
						local221 = Static23.method431(arg0 - local91, Static68.anInt1451, Static224.anInt4436);
						if (local65 <= Static49.anInt1129) {
							local232 = Static22.anIntArrayArray3[local65];
							Static126.method1523(local232, local221, arg1, local83);
							Static126.method1523(local232, local213, arg4, local221);
							Static126.method1523(local232, local74, arg1, local213);
						}
						if (Static297.anInt5619 <= local160) {
							local232 = Static22.anIntArrayArray3[local160];
							Static126.method1523(local232, local221, arg1, local83);
							Static126.method1523(local232, local213, arg4, local221);
							Static126.method1523(local232, local74, arg1, local213);
						}
					} else {
						if (Static49.anInt1129 >= local65) {
							Static126.method1523(Static22.anIntArrayArray3[local65], local74, arg1, local83);
						}
						if (local160 >= Static297.anInt5619) {
							Static126.method1523(Static22.anIntArrayArray3[local160], local74, arg1, local83);
						}
					}
				}
			}
		}
	}
}
