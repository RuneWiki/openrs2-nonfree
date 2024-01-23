import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_37;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array3;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array4;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Lclient!sc;")
	private static Class107 aClass107_429 = Static231.method3737("Members object");

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_426 = aClass107_429;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
	public static int anInt1524 = 50;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "[I")
	public static int[] anIntArray127 = new int[anInt1524];

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array8 = new Class107[anInt1524];

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "[I")
	public static int[] anIntArray128 = new int[anInt1524];

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	public static int[] anIntArray129 = new int[anInt1524];

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "Lclient!sc;")
	public static Class107 aClass107_427 = Static231.method3737("");

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!sc;")
	public static Class107 aClass107_428 = Static231.method3737("(U2");

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "[I")
	public static int[] anIntArray130 = new int[anInt1524];

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "Lclient!sc;")
	public static Class107 aClass107_430 = aClass107_427;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "Lclient!sc;")
	public static Class107 aClass107_431 = aClass107_427;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
	public static int[] anIntArray131 = new int[anInt1524];

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "[I")
	public static int[] anIntArray132 = new int[anInt1524];

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "[I")
	public static int[] anIntArray133 = new int[anInt1524];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	public static int method1194(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xF3333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	public static void method1195(@OriginalArg(0) boolean arg0) {
		if (Static184.anInt4144 == Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7 && Static95.anInt2072 == Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7) {
			Static184.anInt4144 = 0;
		}
		@Pc(25) int local25 = Static10.anInt285;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(48) Class5_Sub5_Sub1 local48;
			@Pc(42) long local42;
			if (arg0) {
				local42 = 8791798054912L;
				local48 = Static204.aClass5_Sub5_Sub1_2;
			} else {
				local42 = (long) Static16.anIntArray38[local31] << 32;
				local48 = Static198.aClass5_Sub5_Sub1Array1[Static16.anIntArray38[local31]];
			}
			if (local48 != null && local48.method2308()) {
				local48.aBoolean108 = false;
				if ((Static14.aBoolean30 && Static10.anInt285 > 200 || Static10.anInt285 > 50) && !arg0 && local48.anInt3005 == local48.anInt3022) {
					local48.aBoolean108 = true;
				}
				@Pc(88) int local88 = local48.anInt3021 >> 7;
				@Pc(93) int local93 = local48.anInt3044 >> 7;
				if (local88 >= 0 && local88 < 104 && local93 >= 0 && local93 < 104) {
					if (local48.aClass5_Sub3_1 == null || Static128.anInt2802 < local48.anInt1283 || Static128.anInt2802 >= local48.anInt1267) {
						if (local48.anInt2997 == 1 && (local48.anInt3021 & 0x7F) == 64 && (local48.anInt3044 & 0x7F) == 64) {
							if (Static157.anInt3451 == Static140.anIntArrayArray12[local88][local93]) {
								continue;
							}
							Static140.anIntArrayArray12[local88][local93] = Static157.anInt3451;
						}
						local48.anInt3000 = Static130.method2174(Static191.anInt4237, local48.anInt3044, local48.anInt3021);
						Static58.method1127(Static191.anInt4237, local48.anInt3021, local48.anInt3044, local48.anInt3000, local48.anInt2997 * 64 - 4, local48, local48.anInt3040, local42, local48.aBoolean257);
					} else {
						local48.aBoolean108 = false;
						local48.anInt3000 = Static130.method2174(Static191.anInt4237, local48.anInt3044, local48.anInt3021);
						Static162.method2603(Static191.anInt4237, local48.anInt3021, local48.anInt3044, local48.anInt3000, local48, local48.anInt3040, local42, local48.anInt1285, local48.anInt1289, local48.anInt1268, local48.anInt1279);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!hc;IIIIIIZ)V")
	public static void method1197(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray174.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray174[local5] - Static95.anInt2063;
			local20 = arg0.anIntArray171[local5] - Static156.anInt3421;
			local27 = arg0.anIntArray167[local5] - Static15.anInt343;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray164 != null) {
				Static78.anIntArray166[local5] = local37;
				Static78.anIntArray165[local5] = local59;
				Static78.anIntArray177[local5] = local69;
			}
			Static78.anIntArray172[local5] = Static74.anInt1682 + (local37 << 9) / local69;
			Static78.anIntArray176[local5] = Static74.anInt1680 + (local59 << 9) / local69;
		}
		Static74.anInt1681 = 0;
		local3 = arg0.anIntArray175.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray175[local13];
			local27 = arg0.anIntArray169[local13];
			local37 = arg0.anIntArray168[local13];
			@Pc(142) int local142 = Static78.anIntArray172[local20];
			@Pc(146) int local146 = Static78.anIntArray172[local27];
			@Pc(150) int local150 = Static78.anIntArray172[local37];
			@Pc(154) int local154 = Static78.anIntArray176[local20];
			@Pc(158) int local158 = Static78.anIntArray176[local27];
			@Pc(162) int local162 = Static78.anIntArray176[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static231.aBoolean446 && Static216.method3529(Static3.anInt3933 + Static74.anInt1682, Static191.anInt4240 + Static74.anInt1680, local154, local158, local162, local142, local146, local150)) {
					Static192.anInt4246 = arg5;
					Static59.anInt1434 = arg6;
				}
				if (!arg7) {
					Static74.aBoolean154 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static74.anInt1684 || local146 > Static74.anInt1684 || local150 > Static74.anInt1684) {
						Static74.aBoolean154 = true;
					}
					if (arg0.anIntArray164 == null || arg0.anIntArray164[local13] == -1) {
						if (arg0.anIntArray173[local13] != 12345678) {
							Static74.method1323(local154, local158, local162, local142, local146, local150, arg0.anIntArray173[local13], arg0.anIntArray170[local13], arg0.anIntArray163[local13]);
						}
					} else if (!Static153.aBoolean296) {
						@Pc(369) int local369 = Static74.anInterface4_1.method1632(arg0.anIntArray164[local13]);
						Static74.method1323(local154, local158, local162, local142, local146, local150, Static196.method3174(local369, arg0.anIntArray173[local13]), Static196.method3174(local369, arg0.anIntArray170[local13]), Static196.method3174(local369, arg0.anIntArray163[local13]));
					} else if (arg0.aBoolean159) {
						Static74.method1315(local154, local158, local162, local142, local146, local150, arg0.anIntArray173[local13], arg0.anIntArray170[local13], arg0.anIntArray163[local13], Static78.anIntArray166[0], Static78.anIntArray166[1], Static78.anIntArray166[3], Static78.anIntArray165[0], Static78.anIntArray165[1], Static78.anIntArray165[3], Static78.anIntArray177[0], Static78.anIntArray177[1], Static78.anIntArray177[3], arg0.anIntArray164[local13]);
					} else {
						Static74.method1315(local154, local158, local162, local142, local146, local150, arg0.anIntArray173[local13], arg0.anIntArray170[local13], arg0.anIntArray163[local13], Static78.anIntArray166[local20], Static78.anIntArray166[local27], Static78.anIntArray166[local37], Static78.anIntArray165[local20], Static78.anIntArray165[local27], Static78.anIntArray165[local37], Static78.anIntArray177[local20], Static78.anIntArray177[local27], Static78.anIntArray177[local37], arg0.anIntArray164[local13]);
					}
				}
			}
		}
	}
}
