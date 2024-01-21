import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!je", name = "H", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!je", name = "Y", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_9;

	@OriginalMember(owner = "client!je", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!je", name = "bb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray51;

	@OriginalMember(owner = "client!je", name = "J", descriptor = "Lclient!rd;")
	public static Class63 aClass63_948 = Static80.method1463("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!je", name = "K", descriptor = "Lclient!rd;")
	public static Class63 aClass63_949 = Static80.method1463("::");

	@OriginalMember(owner = "client!je", name = "S", descriptor = "Lclient!rd;")
	private static Class63 aClass63_953 = Static80.method1463("flash3:");

	@OriginalMember(owner = "client!je", name = "L", descriptor = "Lclient!rd;")
	public static Class63 aClass63_950 = aClass63_953;

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_951 = aClass63_953;

	@OriginalMember(owner = "client!je", name = "R", descriptor = "Lclient!rd;")
	public static Class63 aClass63_952 = Static80.method1463("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "Lclient!rd;")
	private static Class63 aClass63_957 = Static80.method1463("No response from server)3");

	@OriginalMember(owner = "client!je", name = "T", descriptor = "Lclient!rd;")
	public static Class63 aClass63_954 = aClass63_957;

	@OriginalMember(owner = "client!je", name = "V", descriptor = "Lclient!rd;")
	public static Class63 aClass63_955 = Static80.method1463("Texturen geladen)3");

	@OriginalMember(owner = "client!je", name = "X", descriptor = "Lclient!rd;")
	public static Class63 aClass63_956 = Static80.method1463("redstone2");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)I")
	public static int method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static5.method37(arg1 + 45365, 4, arg0 + 91923) + (Static5.method37(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static5.method37(arg1, 1, arg0) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILclient!ge;IIZ)V")
	public static void method1174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(5) int arg3) {
		Static69.anInt1998 = 1;
		Static23.anInt2345 = 2;
		Static68.anInt1982 = arg3;
		Static37.anInt1224 = arg0;
		Static64.anInt1833 = arg1;
		Static29.aClass7_17 = arg2;
		Static114.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public static void method1175() {
		for (@Pc(11) Class6_Sub18 local11 = (Class6_Sub18) Static39.aClass1_3.method3(); local11 != null; local11 = (Class6_Sub18) Static39.aClass1_3.method14()) {
			if (local11.anInt3016 == -1) {
				local11.anInt3024 = 0;
				Static120.method2138(local11);
			} else {
				local11.method2123();
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	public static void method1176() {
		aClass63_956 = null;
		aClass63_953 = null;
		aClass63_954 = null;
		aByteArrayArray5 = null;
		aClass63_950 = null;
		aClass63_951 = null;
		aClass7_Sub1_9 = null;
		aClass63_957 = null;
		aClass63_952 = null;
		aClass63_955 = null;
		aClass63_949 = null;
		aFontMetrics1 = null;
		aByteArrayArrayArray51 = null;
		aClass63_948 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method1177(@OriginalArg(1) Class6_Sub3_Sub1_Sub2 arg0) {
		if (arg0.anInt2320 == 0) {
			return;
		}
		@Pc(43) int local43;
		@Pc(37) int local37;
		if (arg0.anInt2300 != -1 && arg0.anInt2300 < 32768) {
			@Pc(28) Class6_Sub3_Sub1_Sub2_Sub1 local28 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[arg0.anInt2300];
			if (local28 != null) {
				local37 = arg0.anInt2347 - local28.anInt2347;
				local43 = arg0.anInt2319 - local28.anInt2319;
				if (local43 != 0 || local37 != 0) {
					arg0.anInt2309 = (int) (Math.atan2((double) local43, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(74) int local74;
		if (arg0.anInt2300 >= 32768) {
			local74 = arg0.anInt2300 - 32768;
			if (local74 == Static88.anInt2466) {
				local74 = 2047;
			}
			@Pc(83) Class6_Sub3_Sub1_Sub2_Sub2 local83 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local74];
			if (local83 != null) {
				local37 = arg0.anInt2319 - local83.anInt2319;
				@Pc(98) int local98 = arg0.anInt2347 - local83.anInt2347;
				if (local37 != 0 || local98 != 0) {
					arg0.anInt2309 = (int) (Math.atan2((double) local37, (double) local98) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2311 != 0 || arg0.anInt2339 != 0) && (arg0.anInt2337 == 0 || arg0.anInt2302 > 0)) {
			local43 = arg0.anInt2347 - (arg0.anInt2339 - Static91.anInt2560 - Static91.anInt2560) * 64;
			local74 = arg0.anInt2319 - (arg0.anInt2311 - Static80.anInt2169 - Static80.anInt2169) * 64;
			if (local74 != 0 || local43 != 0) {
				arg0.anInt2309 = (int) (Math.atan2((double) local74, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt2339 = 0;
			arg0.anInt2311 = 0;
		}
		local74 = arg0.anInt2309 - arg0.anInt2301 & 0x7FF;
		if (local74 == 0) {
			arg0.anInt2312 = 0;
			return;
		}
		arg0.anInt2312++;
		@Pc(226) boolean local226;
		if (local74 > 1024) {
			arg0.anInt2301 -= arg0.anInt2320;
			local226 = true;
			if (arg0.anInt2320 > local74 || 2048 - arg0.anInt2320 < local74) {
				local226 = false;
				arg0.anInt2301 = arg0.anInt2309;
			}
			if (arg0.anInt2308 == arg0.anInt2328 && (arg0.anInt2312 > 25 || local226)) {
				if (arg0.anInt2323 == -1) {
					arg0.anInt2308 = arg0.anInt2330;
				} else {
					arg0.anInt2308 = arg0.anInt2323;
				}
			}
		} else {
			arg0.anInt2301 += arg0.anInt2320;
			local226 = true;
			if (local74 < arg0.anInt2320 || 2048 - arg0.anInt2320 < local74) {
				arg0.anInt2301 = arg0.anInt2309;
				local226 = false;
			}
			if (arg0.anInt2328 == arg0.anInt2308 && (arg0.anInt2312 > 25 || local226)) {
				if (arg0.anInt2346 == -1) {
					arg0.anInt2308 = arg0.anInt2330;
				} else {
					arg0.anInt2308 = arg0.anInt2346;
				}
			}
		}
		arg0.anInt2301 &= 0x7FF;
	}
}
