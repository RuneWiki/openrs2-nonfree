import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!ba;")
	public static Class7 aClass7_6;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1211 = Static119.method1462("Please wait)3)3)3");

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1212 = aClass65_1211;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1213 = Static119.method1462("Loaded textures");

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1214 = Static119.method1462("(U0a )2 via: ");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1215 = aClass65_1213;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int anInt2751 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
	public static int[] anIntArray363 = new int[2000];

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1216 = Static119.method1462("hitmarks");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;IIZ)Lclient!cc;")
	public static Class6 method1957(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub2");
			@Pc(15) Class6 local15 = (Class6) local11.getDeclaredConstructor().newInstance();
			local15.method1598(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub1 local28 = new Class6_Sub1();
			local28.method1598(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!wa;)Z")
	public static boolean method1958(@OriginalArg(1) Class2_Sub22 arg0) {
		if (Static12.aBoolean14) {
			if (Static114.method1834(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2813 == 0) {
				return false;
			}
		}
		return arg0.aBoolean128;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZIIB)Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(21) long local21 = (long) arg0 + ((long) arg4 << 16) + ((long) arg1 << 38) + ((long) arg3 << 40);
		@Pc(33) Class2_Sub1_Sub4_Sub1 local33;
		if (!arg2) {
			local33 = (Class2_Sub1_Sub4_Sub1) Static36.aClass8_21.method172(local21);
			if (local33 != null) {
				return local33;
			}
		}
		@Pc(46) Class2_Sub1_Sub11 local46 = Static4.method872(arg0);
		if (arg4 > 1 && local46.anIntArray279 != null) {
			@Pc(56) int local56 = -1;
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (arg4 >= local46.anIntArray278[local58] && local46.anIntArray278[local58] != 0) {
					local56 = local46.anIntArray279[local58];
				}
			}
			if (local56 != -1) {
				local46 = Static4.method872(local56);
			}
		}
		@Pc(95) Class2_Sub1_Sub1_Sub7 local95 = local46.method1537(1);
		if (local95 == null) {
			return null;
		}
		@Pc(101) Class2_Sub1_Sub4_Sub1 local101 = null;
		if (local46.anInt2091 != -1) {
			local101 = method1959(local46.anInt2101, 1, true, 0, 10);
			if (local101 == null) {
				return null;
			}
		}
		@Pc(121) int[] local121 = Static118.anIntArray419;
		@Pc(123) int local123 = Static118.anInt2966;
		@Pc(125) int local125 = Static118.anInt2964;
		@Pc(128) int[] local128 = new int[4];
		Static118.method2074(local128);
		local33 = new Class2_Sub1_Sub4_Sub1(36, 32);
		Static118.method2064(local33.anIntArray54, 36, 32);
		Static118.method2065();
		Static87.method1426();
		Static87.method1423(16, 16);
		@Pc(149) int local149 = local46.anInt2076;
		if (arg2) {
			local149 = (int) ((double) local149 * 1.5D);
		} else if (arg1 == 2) {
			local149 = (int) ((double) local149 * 1.04D);
		}
		Static87.aBoolean73 = false;
		@Pc(181) int local181 = Class2_Sub1_Sub4_Sub4.anIntArray251[local46.anInt2069] * local149 >> 16;
		@Pc(190) int local190 = Class2_Sub1_Sub4_Sub4.anIntArray248[local46.anInt2069] * local149 >> 16;
		local95.method2006();
		local95.method2009(local46.anInt2080, local46.anInt2060, local46.anInt2069, local46.anInt2068, local46.anInt2061 + local181 + local95.anInt2855 / 2, local46.anInt2061 + local190);
		if (arg1 >= 1) {
			local33.method443(1);
		}
		if (arg1 >= 2) {
			local33.method443(16777215);
		}
		if (arg3 != 0) {
			local33.method455(arg3);
		}
		Static118.method2064(local33.anIntArray54, 36, 32);
		if (local46.anInt2091 != -1) {
			local101.method461(0, 0);
		}
		if (!arg2 && (local46.anInt2071 == 1 || arg4 != 1) && arg4 != -1) {
			Static69.aClass2_Sub1_Sub4_Sub3_Sub1_2.method2099(Static28.method576(arg4), 0, 9, 16776960, 1);
		}
		if (!arg2) {
			Static36.aClass8_21.method176(local21, local33);
		}
		Static118.method2064(local121, local125, local123);
		Static118.method2076(local128);
		Static87.method1426();
		Static87.aBoolean73 = true;
		return local33;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public static void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static112.anInt2513 = -1;
			Static84.anInt1814 = -1;
			return;
		}
		@Pc(36) int local36 = Static106.method1718(arg0, arg2, Static59.anInt1479) - arg1;
		@Pc(40) int local40 = Class2_Sub1_Sub4_Sub4.anIntArray251[Static97.anInt2216];
		@Pc(52) int local52 = arg0 - Static130.anInt2838;
		@Pc(56) int local56 = Class2_Sub1_Sub4_Sub4.anIntArray248[Static97.anInt2216];
		@Pc(60) int local60 = arg2 - Static69.anInt1610;
		@Pc(64) int local64 = Class2_Sub1_Sub4_Sub4.anIntArray251[Static45.anInt1096];
		@Pc(68) int local68 = local36 - Static84.anInt1818;
		@Pc(72) int local72 = Class2_Sub1_Sub4_Sub4.anIntArray248[Static45.anInt1096];
		@Pc(82) int local82 = local64 * local52 + local60 * local72 >> 16;
		@Pc(93) int local93 = local72 * local52 - local60 * local64 >> 16;
		@Pc(95) int local95 = local82;
		@Pc(106) int local106 = local68 * local56 - local40 * local93 >> 16;
		@Pc(116) int local116 = local56 * local93 + local40 * local68 >> 16;
		if (local116 >= 50) {
			Static112.anInt2513 = (local95 << 9) / local116 + 256;
			Static84.anInt1814 = (local106 << 9) / local116 + 167;
		} else {
			Static112.anInt2513 = -1;
			Static84.anInt1814 = -1;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method1962() {
		aByteArrayArrayArray7 = null;
		aClass65_1212 = null;
		aClass65_1216 = null;
		aClass7_6 = null;
		anIntArray363 = null;
		aClass65_1211 = null;
		aClass65_1215 = null;
		aClass65_1213 = null;
		aClass65_1214 = null;
	}
}
