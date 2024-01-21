import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!pb;")
	public static Class31 aClass31_20;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array19;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public static int anInt1217 = 0;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
	public static int[] anIntArray185 = new int[50];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!fa;")
	public static Class22 aClass22_9 = new Class22();

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_668 = Static23.method501(")3");

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!mc;")
	private static Class42 aClass42_671 = Static23.method501("as it was used to break our rules)3");

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_669 = aClass42_671;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!mc;")
	private static Class42 aClass42_674 = Static23.method501(" has logged in)3");

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_670 = aClass42_674;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_672 = Static23.method501(" x");

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
	public static int anInt1226 = 1;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!mc;")
	private static Class42 aClass42_673 = Static23.method501("skill)2");

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_675 = aClass42_673;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method855() {
		aClass42_675 = null;
		aClass42_672 = null;
		aClass42_673 = null;
		aClass42_674 = null;
		aClass1_Sub1_Sub1_Sub1Array19 = null;
		aClass31_20 = null;
		aClass42_671 = null;
		anIntArray185 = null;
		aClass22_9 = null;
		aClass42_669 = null;
		aClass42_668 = null;
		aClass42_670 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ja;Lclient!ja;)V")
	public static void method857(@OriginalArg(1) Class33 arg0, @OriginalArg(2) Class33 arg1) {
		Static27.aClass33_9 = arg1;
		Static17.aClass33_6 = arg0;
		Static49.anInt1278 = Static27.aClass33_9.method1299(3);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIIIII[B[Lclient!ba;)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) Class6[] arg8) {
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if (arg0 + local11 > 0 && arg0 + local11 < 103 && local15 + arg2 > 0 && arg2 + local15 < 103) {
					arg8[arg5].anIntArrayArray1[arg0 + local11][local15 + arg2] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(84) Class1_Sub8 local84 = new Class1_Sub8(arg7);
		for (@Pc(86) int local86 = 0; local86 < 4; local86++) {
			for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
				for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
					if (local86 == arg1 && arg4 <= local90 && local90 < arg4 + 8 && arg3 <= local94 && arg3 + 8 > local94) {
						Static58.method1004(local84, arg0 + Static52.method974(arg6, local94 & 0x7, local90 & 0x7), 0, 0, method862(local94 & 0x7, local90 & 0x7, arg6) + arg2, arg6, arg5);
					} else {
						Static58.method1004(local84, -1, 0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method859(@OriginalArg(0) Class1_Sub1_Sub8_Sub1 arg0) {
		@Pc(12) int local12 = arg0.anInt2549 - Static27.anInt768;
		@Pc(23) int local23 = arg0.anInt2591 * 128 + arg0.anInt2599 * 64;
		arg0.anInt2594 = 0;
		@Pc(36) int local36 = arg0.anInt2575 * 128 + arg0.anInt2599 * 64;
		if (arg0.anInt2555 == 0) {
			arg0.anInt2606 = 1024;
		}
		arg0.anInt2576 += (local23 - arg0.anInt2576) / local12;
		arg0.anInt2583 += (local36 - arg0.anInt2583) / local12;
		if (arg0.anInt2555 == 1) {
			arg0.anInt2606 = 1536;
		}
		if (arg0.anInt2555 == 2) {
			arg0.anInt2606 = 0;
		}
		if (arg0.anInt2555 == 3) {
			arg0.anInt2606 = 512;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method860() {
		for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) Static33.aClass22_7.method515(); local15 != null; local15 = (Class1_Sub3) Static33.aClass22_7.method519()) {
			if (local15.anInt595 > 0) {
				local15.anInt595--;
			}
			if (local15.anInt595 != 0) {
				if (local15.anInt582 > 0) {
					local15.anInt582--;
				}
				if (local15.anInt582 == 0 && local15.anInt596 >= 1 && local15.anInt583 >= 1 && local15.anInt596 <= 102 && local15.anInt583 <= 102 && (local15.anInt591 < 0 || Static64.method1095(local15.anInt591, local15.anInt586))) {
					Static63.method1079(local15.anInt589, local15.anInt585, local15.anInt583, local15.anInt596, local15.anInt591, local15.anInt586, local15.anInt594);
					local15.anInt582 = -1;
					if (local15.anInt597 == local15.anInt591 && local15.anInt597 == -1) {
						local15.method1825();
					} else if (local15.anInt597 == local15.anInt591 && local15.anInt585 == local15.anInt590 && local15.anInt593 == local15.anInt586) {
						local15.method1825();
					}
				}
			} else if (local15.anInt597 < 0 || Static64.method1095(local15.anInt597, local15.anInt593)) {
				Static63.method1079(local15.anInt589, local15.anInt590, local15.anInt583, local15.anInt596, local15.anInt597, local15.anInt593, local15.anInt594);
				local15.method1825();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Z")
	public static boolean method861(@OriginalArg(1) int arg0) {
		if (!Static107.method1831(arg0)) {
			return false;
		}
		@Pc(20) Class1_Sub1_Sub12[] local20 = Static61.aClass1_Sub1_Sub12ArrayArray1[arg0];
		@Pc(22) boolean local22 = false;
		for (@Pc(24) int local24 = 0; local24 < local20.length; local24++) {
			@Pc(30) Class1_Sub1_Sub12 local30 = local20[local24];
			if (local30 != null && local30.anInt2177 == 6) {
				@Pc(56) int local56;
				if (local30.anInt2154 != -1 || local30.anInt2182 != -1) {
					@Pc(51) boolean local51 = Static23.method505(local30);
					if (local51) {
						local56 = local30.anInt2182;
					} else {
						local56 = local30.anInt2154;
					}
					if (local56 != -1) {
						@Pc(69) Class1_Sub1_Sub14 local69 = Static30.method574(local56);
						local30.anInt2147 += Static59.anInt1992;
						while (local69.anIntArray357[local30.anInt2157] < local30.anInt2147) {
							local30.anInt2147 -= local69.anIntArray357[local30.anInt2157];
							local30.anInt2157++;
							if (local30.anInt2157 >= local69.anIntArray355.length) {
								local30.anInt2157 -= local69.anInt2313;
								if (local30.anInt2157 < 0 || local69.anIntArray355.length <= local30.anInt2157) {
									local30.anInt2157 = 0;
								}
							}
							local22 = true;
						}
					}
				}
				if (local30.anInt2184 != 0) {
					local22 = true;
					local56 = local30.anInt2184 << 16 >> 16;
					local56 *= Static59.anInt1992;
					local30.anInt2186 = local30.anInt2186 + local56 & 0x7FF;
					@Pc(160) int local160 = local30.anInt2184 >> 16;
					@Pc(164) int local164 = local160 * Static59.anInt1992;
					local30.anInt2162 = local30.anInt2162 + local164 & 0x7FF;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I")
	private static int method862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
