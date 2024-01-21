import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!de", name = "K", descriptor = "Lclient!ja;")
	public static Class33 aClass33_5;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Lclient!ja;")
	public static Class33 aClass33_6;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
	public static int anInt598;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_317 = Static23.method501("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	public static int anInt587 = 0;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "I")
	public static int anInt592 = 0;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "Lclient!mc;")
	public static Class42 aClass42_318 = Static23.method501("@cr2@");

	@OriginalMember(owner = "client!de", name = "S", descriptor = "I")
	public static int anInt600 = -1;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "[I")
	public static int[] anIntArray46 = new int[128];

	@OriginalMember(owner = "client!de", name = "V", descriptor = "Lclient!mc;")
	private static Class42 aClass42_319 = Static23.method501("Walk here");

	@OriginalMember(owner = "client!de", name = "W", descriptor = "I")
	public static int anInt601 = 0;

	@OriginalMember(owner = "client!de", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[1000][];

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_320 = aClass42_319;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)I")
	public static int method420() {
		return 19;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public static void method421() {
		aClass42_319 = null;
		aClass33_6 = null;
		aClass42_317 = null;
		anIntArray46 = null;
		aClass33_5 = null;
		aByteArrayArray2 = null;
		aClass42_320 = null;
		aClass42_318 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIIII)V")
	public static void method422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub13 local10 = (Class1_Sub13) Static73.aClass22_10.method515(); local10 != null; local10 = (Class1_Sub13) Static73.aClass22_10.method519()) {
			if (local10.anInt2213 != -1 || local10.anIntArray338 != null) {
				@Pc(22) int local22 = 0;
				if (arg0 > local10.anInt2215) {
					local22 = arg0 - local10.anInt2215;
				} else if (arg0 < local10.anInt2205) {
					local22 = local10.anInt2205 - arg0;
				}
				if (local10.anInt2208 < arg1) {
					local22 += arg1 - local10.anInt2208;
				} else if (arg1 < local10.anInt2210) {
					local22 += local10.anInt2210 - arg1;
				}
				if (local22 - 64 > local10.anInt2219 || Static62.anInt1488 == 0 || local10.anInt2211 != arg3) {
					if (local10.aClass1_Sub12_Sub2_1 != null) {
						Static91.aClass1_Sub12_Sub1_1.method1594(local10.aClass1_Sub12_Sub2_1);
						local10.aClass1_Sub12_Sub2_1 = null;
					}
					if (local10.aClass1_Sub12_Sub2_2 != null) {
						Static91.aClass1_Sub12_Sub1_1.method1594(local10.aClass1_Sub12_Sub2_2);
						local10.aClass1_Sub12_Sub2_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(139) int local139 = Static62.anInt1488 * (local10.anInt2219 - local22) / local10.anInt2219;
					if (local10.aClass1_Sub12_Sub2_1 != null) {
						local10.aClass1_Sub12_Sub2_1.method1796(local139);
					} else if (local10.anInt2213 >= 0) {
						@Pc(154) Class3 local154 = Static111.method89(Static7.aClass33_Sub1_1, local10.anInt2213);
						if (local154 != null) {
							@Pc(161) Class1_Sub10_Sub1 local161 = local154.method88().method1093(Static27.aClass16_1);
							@Pc(166) Class1_Sub12_Sub2 local166 = Static117.method1789(local161, local139);
							local166.method1797(-1);
							Static91.aClass1_Sub12_Sub1_1.method1591(local166);
							local10.aClass1_Sub12_Sub2_1 = local166;
						}
					}
					if (local10.aClass1_Sub12_Sub2_2 != null) {
						local10.aClass1_Sub12_Sub2_2.method1796(local139);
						if (!local10.aClass1_Sub12_Sub2_2.method1788()) {
							local10.aClass1_Sub12_Sub2_2 = null;
						}
					} else if (local10.anIntArray338 != null && (local10.anInt2214 -= arg2) <= 0) {
						@Pc(203) int local203 = (int) ((double) local10.anIntArray338.length * Math.random());
						@Pc(211) Class3 local211 = Static111.method89(Static7.aClass33_Sub1_1, local10.anIntArray338[local203]);
						if (local211 != null) {
							@Pc(218) Class1_Sub10_Sub1 local218 = local211.method88().method1093(Static27.aClass16_1);
							@Pc(223) Class1_Sub12_Sub2 local223 = Static117.method1789(local218, local139);
							local223.method1797(0);
							Static91.aClass1_Sub12_Sub1_1.method1591(local223);
							local10.aClass1_Sub12_Sub2_2 = local223;
							local10.anInt2214 = (int) (Math.random() * (double) (local10.anInt2204 - local10.anInt2209)) + local10.anInt2209;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
	public static void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static19.aClass1_Sub1_Sub1_Sub4Array1[0].method1147(arg2, arg4);
		Static19.aClass1_Sub1_Sub1_Sub4Array1[1].method1147(arg2, arg4 + arg3 - 16);
		Static55.method1129(arg2, arg4 + 16, 16, arg3 - 32, Static65.anInt1586);
		@Pc(38) int local38 = arg3 * (arg3 - 32) / arg1;
		if (local38 < 8) {
			local38 = 8;
		}
		@Pc(57) int local57 = (arg3 - local38 - 32) * arg0 / (arg1 - arg3);
		Static55.method1129(arg2, arg4 + local57 + 16, 16, local38, Static80.anInt2111);
		Static55.method1136(arg2, arg4 + local57 + 16, local38, Static56.anInt1423);
		Static55.method1136(arg2 + 1, arg4 + 16 + local57, local38, Static56.anInt1423);
		Static55.method1140(arg2, arg4 + local57 + 16, 16, Static56.anInt1423);
		Static55.method1140(arg2, arg4 + local57 + 17, 16, Static56.anInt1423);
		Static55.method1136(arg2 + 15, local57 + 16 + arg4, local38, Static97.anInt2475);
		Static55.method1136(arg2 + 14, arg4 + (17 - -local57), local38 - 1, Static97.anInt2475);
		Static55.method1140(arg2, local38 + local57 + arg4 + 15, 16, Static97.anInt2475);
		Static55.method1140(arg2 + 1, local38 + arg4 - (-14 - local57), 15, Static97.anInt2475);
	}
}
