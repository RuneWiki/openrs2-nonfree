import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "hd", descriptor = "I")
	public static int anInt430;

	@OriginalMember(owner = "client!ba", name = "cd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_147 = Static108.method1915("");

	@OriginalMember(owner = "client!ba", name = "Uc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_142 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "Vc", descriptor = "I")
	public static int anInt426 = 0;

	@OriginalMember(owner = "client!ba", name = "Wc", descriptor = "Lclient!kd;")
	private static Class39 aClass39_143 = Static108.method1915("Loading config )2 ");

	@OriginalMember(owner = "client!ba", name = "Xc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_144 = Static108.method1915("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ba", name = "Zc", descriptor = "Lclient!jb;")
	public static Class33 aClass33_4 = new Class33(200);

	@OriginalMember(owner = "client!ba", name = "ad", descriptor = "Lclient!kd;")
	public static Class39 aClass39_145 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "bd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_146 = aClass39_143;

	@OriginalMember(owner = "client!ba", name = "dd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_148 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "id", descriptor = "Lclient!kd;")
	public static Class39 aClass39_149 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "ld", descriptor = "Lclient!kd;")
	private static Class39 aClass39_150 = Static108.method1915("New User");

	@OriginalMember(owner = "client!ba", name = "md", descriptor = "I")
	public static int anInt433 = 1;

	@OriginalMember(owner = "client!ba", name = "nd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_151 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "pd", descriptor = "I")
	public static int anInt435 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ba", name = "qd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_152 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "rd", descriptor = "Lclient!kd;")
	public static Class39 aClass39_153 = aClass39_150;

	@OriginalMember(owner = "client!ba", name = "td", descriptor = "Lclient!kd;")
	public static Class39 aClass39_154 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "ud", descriptor = "Lclient!kd;")
	public static Class39 aClass39_155 = aClass39_147;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V")
	public static void method223() {
		if (Static71.anInt1792 == 0) {
			return;
		}
		@Pc(13) Class1_Sub1_Sub4_Sub3 local13 = Static93.aClass1_Sub1_Sub4_Sub3_3;
		@Pc(15) int local15 = 0;
		if (Static49.anInt1372 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static67.aClass39Array19[local21] != null) {
				@Pc(31) int local31 = Static94.anIntArray338[local21];
				@Pc(33) byte local33 = 0;
				@Pc(37) Class39 local37 = Static16.aClass39Array25[local21];
				if (local37 != null && local37.method1185(Static112.aClass39_1343)) {
					local37 = local37.method1181(5);
					local33 = 1;
				}
				if (local37 != null && local37.method1185(Static38.aClass39_534)) {
					local33 = 2;
					local37 = local37.method1181(5);
				}
				@Pc(91) int local91;
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static24.anInt816 == 0 || Static24.anInt816 == 1 && Static98.method1718(local37))) {
					local91 = 329 - local15 * 13;
					local13.method753(Static114.aClass39_1372, 4, local91 - 1, 65535, 0);
					local15++;
					@Pc(109) int local109 = local13.method755(Static114.aClass39_1372) + 4;
					local109 += local13.method761(32);
					if (local33 == 1) {
						Static74.aClass1_Sub1_Sub4_Sub1Array8[0].method492(local109, local91 - 12);
						local109 += 14;
					}
					if (local33 == 2) {
						Static74.aClass1_Sub1_Sub4_Sub1Array8[1].method492(local109, local91 - 12);
						local109 += 14;
					}
					local13.method753(Static30.method601(new Class39[] { local37, Static114.aClass39_1370, Static67.aClass39Array19[local21] }), local109, local91 - 1, 65535, 0);
					if (local15 >= 5) {
						return;
					}
				}
				if (local31 == 5 && Static24.anInt816 < 2) {
					local91 = 329 - local15 * 13;
					local15++;
					local13.method753(Static67.aClass39Array19[local21], 4, local91 - 1, 65535, 0);
					if (local15 >= 5) {
						return;
					}
				}
				if (local31 == 6 && Static24.anInt816 < 2) {
					local91 = 329 - local15 * 13;
					local13.method753(Static30.method601(new Class39[] { Static110.aClass39_1339, Static114.aClass39_1359, local37, Static114.aClass39_1370, Static67.aClass39Array19[local21] }), 4, local91 - 1, 65535, 0);
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(IB)Lclient!sb;")
	public static Class1_Sub1_Sub17 method224(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static55.aClass33_19.method1038((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static53.aClass62_15.method2008(arg0, 10);
		local10 = new Class1_Sub1_Sub17();
		local10.anInt2749 = arg0;
		if (local28 != null) {
			local10.method1920(new Class1_Sub18(local28));
		}
		local10.method1910();
		if (local10.anInt2748 != -1) {
			local10.method1908(method224(local10.anInt2729), method224(local10.anInt2748));
		}
		if (!Static68.aBoolean150 && local10.aBoolean220) {
			local10.anInt2732 = 0;
			local10.aClass39_1321 = Static120.aClass39_1524;
			local10.aClass39Array27 = null;
			local10.aClass39Array28 = null;
		}
		Static55.aClass33_19.method1042(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)I")
	public static int method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!a;Lclient!a;II)Lclient!a;")
	public static Class1_Sub1_Sub1 method226(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1 arg1, @OriginalArg(2) Class1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(27) Class1_Sub1_Sub1 local27 = Static90.method1483(0, arg0, Static102.aClass1_Sub1_Sub1ArrayArray1[arg2.anInt72 >> 16], arg3, arg2.anInt82, 0, arg2.anInt101, arg1, arg2.anInt87, arg2.anInt72, arg2.anInt95);
		if (local27 == null) {
			if (arg2.aClass1_Sub1_Sub1Array1 != null) {
				local27 = Static90.method1483(0, arg0, arg2.aClass1_Sub1_Sub1Array1, arg3, arg2.anInt82, 0, arg2.anInt101, arg1, arg2.anInt87, arg2.anInt72, arg2.anInt95);
			}
			return local27;
		} else {
			return local27;
		}
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(B)V")
	public static void method227() {
		aClass39_148 = null;
		aClass39_153 = null;
		aClass39_146 = null;
		aClass39_144 = null;
		aClass39_147 = null;
		aClass33_4 = null;
		aClass39_154 = null;
		aClass39_145 = null;
		aClass39_149 = null;
		aClass39_142 = null;
		aClass39_155 = null;
		aClass39_150 = null;
		aClass39_143 = null;
		aClass39_152 = null;
		aClass39_151 = null;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Lclient!kd;")
	public static Class39 method228(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static69.method1226(arg0) : Static91.aClass39_1088;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIZ)I")
	public static int method229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(48) int local48 = Static73.method1254(arg0 + 45365, 4, arg1 + 91923) + (Static73.method1254(arg0 - -10294, 2, arg1 + 37821) + -128 >> 1) + (Static73.method1254(arg0, 1, arg1) + -128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}
}
