import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lclient!nc;")
	public static Class3_Sub14 aClass3_Sub14_1;

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_1;

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "Lclient!he;")
	public static Class26 aClass26_84 = method100("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ae", name = "ub", descriptor = "Lclient!he;")
	private static Class26 aClass26_90 = method100("Prepared sound engine");

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_85 = aClass26_90;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lclient!he;")
	public static Class26 aClass26_86 = method100("mn");

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lclient!he;")
	public static Class26 aClass26_87 = method100("Hidden)2use");

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
	public static int anInt162 = 0;

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lclient!he;")
	public static Class26 aClass26_88 = method100("(U0a )2 in: ");

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "[I")
	public static int[] anIntArray12 = new int[256];

	@OriginalMember(owner = "client!ae", name = "pb", descriptor = "[I")
	public static int[] anIntArray13 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ae", name = "rb", descriptor = "Lclient!he;")
	public static Class26 aClass26_89 = method100("::");

	@OriginalMember(owner = "client!ae", name = "zb", descriptor = "Lclient!he;")
	private static Class26 aClass26_92 = method100("To play on this world move to a free area first");

	@OriginalMember(owner = "client!ae", name = "yb", descriptor = "Lclient!he;")
	public static Class26 aClass26_91 = aClass26_92;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZILclient!ef;Lclient!ef;)Lclient!pc;")
	public static Class3_Sub1_Sub14 method95(@OriginalArg(0) int arg0, @OriginalArg(3) Class16 arg1, @OriginalArg(4) Class16 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(8) int[] local8 = arg2.method571(arg0);
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(25) byte[] local25 = arg2.method558(local8[local15], arg0);
			if (local25 == null) {
				local3 = false;
			} else {
				@Pc(45) int local45 = local25[1] & 0xFF | (local25[0] & 0xFF) << 8;
				@Pc(53) byte[] local53 = arg1.method558(0, local45);
				if (local53 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub14(arg2, arg1, arg0, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!nc;Z)Lclient!nc;")
	public static Class3_Sub14 method96(@OriginalArg(0) Class3_Sub14 arg0) {
		@Pc(11) int local11 = Static85.method1488(Static89.method1641(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			arg0 = Static100.method2212(arg0.anInt2159);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)V")
	public static void method98() {
		aClass26_87 = null;
		aClass26_84 = null;
		aClass26_86 = null;
		aClass26_89 = null;
		aClass26_91 = null;
		aClass26_88 = null;
		aClass3_Sub1_Sub4_Sub3_1 = null;
		aClass26_85 = null;
		anIntArray13 = null;
		aClass26_92 = null;
		aBooleanArray1 = null;
		aClass3_Sub14_1 = null;
		aClass26_90 = null;
		anIntArray12 = null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method99() {
		while (true) {
			if (Static33.aClass3_Sub11_Sub1_2.method1027(Static104.anInt2841) >= 27) {
				@Pc(14) int local14 = Static33.aClass3_Sub11_Sub1_2.method1031(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local14] == null) {
						Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local14] = new Class3_Sub1_Sub5_Sub1_Sub2();
						local19 = true;
					}
					@Pc(35) Class3_Sub1_Sub5_Sub1_Sub2 local35 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local14];
					Static48.anIntArray151[Static133.anInt560++] = local14;
					local35.anInt2722 = Static4.anInt136;
					@Pc(51) int local51 = Static33.aClass3_Sub11_Sub1_2.method1031(5);
					if (local51 > 15) {
						local51 -= 32;
					}
					local35.aClass3_Sub1_Sub3_1 = Static115.method2083(Static33.aClass3_Sub11_Sub1_2.method1031(14));
					@Pc(68) int local68 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
					if (local68 == 1) {
						Static76.anIntArray206[Static19.anInt512++] = local14;
					}
					@Pc(86) int local86 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
					@Pc(95) int local95 = Static55.anIntArray165[Static33.aClass3_Sub11_Sub1_2.method1031(3)];
					if (local19) {
						local35.anInt2691 = local35.anInt2692 = local95;
					}
					@Pc(108) int local108 = Static33.aClass3_Sub11_Sub1_2.method1031(5);
					local35.anInt2732 = local35.aClass3_Sub1_Sub3_1.anInt246;
					if (local108 > 15) {
						local108 -= 32;
					}
					local35.anInt2714 = local35.aClass3_Sub1_Sub3_1.anInt231;
					local35.anInt2707 = local35.aClass3_Sub1_Sub3_1.anInt254;
					local35.anInt2728 = local35.aClass3_Sub1_Sub3_1.anInt228;
					local35.anInt2734 = local35.aClass3_Sub1_Sub3_1.anInt232;
					if (local35.anInt2707 == 0) {
						local35.anInt2692 = 0;
					}
					local35.anInt2716 = local35.aClass3_Sub1_Sub3_1.anInt235;
					local35.anInt2717 = local35.aClass3_Sub1_Sub3_1.anInt229;
					local35.anInt2729 = local35.aClass3_Sub1_Sub3_1.anInt249;
					local35.anInt2712 = local35.aClass3_Sub1_Sub3_1.anInt227;
					local35.method1881(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0] + local108, local86 == 1, local51 + Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0]);
					continue;
				}
			}
			Static33.aClass3_Sub11_Sub1_2.method1039();
			return;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!he;")
	public static Class26 method100(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class26 local13 = new Class26();
		@Pc(15) int local15 = 0;
		local13.aByteArray7 = new byte[local9];
		while (local9 > local15) {
			@Pc(32) int local32 = local6[local15++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local15 >= local9) {
					break;
				}
				@Pc(48) int local48 = local6[local15++] & 0xFF;
				local13.aByteArray7[local13.anInt1345++] = (byte) ((local32 - 40) * 43 + local48 - 48);
			} else if (local32 != 0) {
				local13.aByteArray7[local13.anInt1345++] = (byte) local32;
			}
		}
		local13.method845();
		return local13.method842();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIIII)V")
	public static void method103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static12.aClass3_Sub1_Sub4_Sub1Array2[0].method345(arg2, arg3);
		Static12.aClass3_Sub1_Sub4_Sub1Array2[1].method345(arg2, arg4 + arg3 - 16);
		Static77.method2214(arg2, arg3 + 16, 16, arg4 - 32, Static69.anInt2514);
		@Pc(33) int local33 = arg4 * (arg4 - 32) / arg1;
		if (local33 < 8) {
			local33 = 8;
		}
		@Pc(58) int local58 = (arg4 - local33 - 32) * arg0 / (arg1 - arg4);
		Static77.method2214(arg2, local58 + arg3 + 16, 16, local33, Static27.anInt963);
		Static77.method2220(arg2, arg3 + local58 + 16, local33, Static106.anInt2863);
		Static77.method2220(arg2 + 1, arg3 - (-local58 + -16), local33, Static106.anInt2863);
		Static77.method2231(arg2, local58 + arg3 + 16, 16, Static106.anInt2863);
		Static77.method2231(arg2, arg3 + local58 + 17, 16, Static106.anInt2863);
		Static77.method2220(arg2 + 15, arg3 + (16 - -local58), local33, Static13.anInt356);
		Static77.method2220(arg2 + 14, arg3 - -local58 + 17, local33 - 1, Static13.anInt356);
		Static77.method2231(arg2, local33 + local58 + arg3 + 15, 16, Static13.anInt356);
		Static77.method2231(arg2 + 1, local33 + 14 + arg3 + local58, 15, Static13.anInt356);
	}
}
