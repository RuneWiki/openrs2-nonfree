import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "Lclient!vc;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!jc", name = "kb", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!jc", name = "pb", descriptor = "I")
	public static int anInt1639;

	@OriginalMember(owner = "client!jc", name = "vb", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub14 aClass2_Sub1_Sub14_6;

	@OriginalMember(owner = "client!jc", name = "yb", descriptor = "I")
	public static int anInt1643;

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "Lclient!a;")
	private static Class1 aClass1_1642 = Static94.method1596("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1640 = aClass1_1642;

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][105][105];

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1641 = Static94.method1596("p11_full");

	@OriginalMember(owner = "client!jc", name = "lb", descriptor = "[I")
	public static int[] anIntArray166 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
	public static int anInt1637 = 0;

	@OriginalMember(owner = "client!jc", name = "ob", descriptor = "Lclient!a;")
	public static Class1 aClass1_1643 = Static94.method1596("overlay_multiway");

	@OriginalMember(owner = "client!jc", name = "Ab", descriptor = "Lclient!a;")
	private static Class1 aClass1_1646 = Static94.method1596("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!jc", name = "qb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1644 = aClass1_1646;

	@OriginalMember(owner = "client!jc", name = "sb", descriptor = "[I")
	public static int[] anIntArray167 = new int[128];

	@OriginalMember(owner = "client!jc", name = "tb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1645 = Static94.method1596("hitmarks");

	@OriginalMember(owner = "client!jc", name = "xb", descriptor = "I")
	public static int anInt1642 = 0;

	@OriginalMember(owner = "client!jc", name = "zb", descriptor = "I")
	public static int anInt1644 = 0;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method1105() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static6.anIntArray42[local9 + 32512] = 255;
			}
		}
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(59) int local59;
		for (local16 = 0; local16 < 100; local16++) {
			local46 = (int) (Math.random() * 124.0D) + 2;
			local53 = (int) (Math.random() * 128.0D) + 128;
			local59 = local46 + (local53 << 7);
			Static6.anIntArray42[local59] = 192;
		}
		for (local46 = 1; local46 < 255; local46++) {
			for (local53 = 1; local53 < 127; local53++) {
				local59 = local53 + (local46 << 7);
				Static97.anIntArray310[local59] = (Static6.anIntArray42[local59 + 1] + Static6.anIntArray42[local59 - 1] + Static6.anIntArray42[local59 + -128] + Static6.anIntArray42[local59 + 128]) / 4;
			}
		}
		Static38.anInt1370 += 128;
		if (Static38.anInt1370 > Static84.anIntArray284.length) {
			Static38.anInt1370 -= Static84.anIntArray284.length;
			local53 = (int) (Math.random() * 12.0D);
			Static106.method1755(Static40.aClass2_Sub1_Sub2_Sub2Array7[local53]);
		}
		@Pc(160) int local160;
		for (local53 = 1; local53 < 255; local53++) {
			for (local59 = 1; local59 < 127; local59++) {
				local160 = local59 + (local53 << 7);
				@Pc(181) int local181 = Static97.anIntArray310[local160 + 128] - Static84.anIntArray284[local160 + Static38.anInt1370 & Static84.anIntArray284.length + -1] / 5;
				if (local181 < 0) {
					local181 = 0;
				}
				Static6.anIntArray42[local160] = local181;
			}
		}
		for (local59 = 0; local59 < 255; local59++) {
			Static27.anIntArray114[local59] = Static27.anIntArray114[local59 + 1];
		}
		Static27.anIntArray114[255] = (int) (Math.sin((double) Static69.anInt2806 / 14.0D) * 16.0D + Math.sin((double) Static69.anInt2806 / 15.0D) * 14.0D + Math.sin((double) Static69.anInt2806 / 16.0D) * 12.0D);
		if (Static41.anInt1403 > 0) {
			Static41.anInt1403 -= 4;
		}
		if (Static79.anInt2106 > 0) {
			Static79.anInt2106 -= 4;
		}
		if (Static41.anInt1403 != 0 || Static79.anInt2106 != 0) {
			return;
		}
		local160 = (int) (Math.random() * 2000.0D);
		if (local160 == 0) {
			Static41.anInt1403 = 1024;
		}
		if (local160 == 1) {
			Static79.anInt2106 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	public static void method1106() {
		aClass1_1644 = null;
		anIntArrayArrayArray7 = null;
		aClass1_1645 = null;
		aClass1_1646 = null;
		aClass2_Sub1_Sub14_6 = null;
		aClass1_1642 = null;
		aClass1_1643 = null;
		aClass65_1 = null;
		aClass1_1640 = null;
		aClass1_1641 = null;
		anIntArray166 = null;
		aClass2_Sub1_Sub2_Sub2_14 = null;
		anIntArray167 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V")
	public static void method1107(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static71.anInt1968; local14++) {
			if (Static88.aLongArray5[local14] == arg0) {
				Static34.aBoolean60 = true;
				Static71.anInt1968--;
				for (@Pc(34) int local34 = local14; local34 < Static71.anInt1968; local34++) {
					Static88.aLongArray5[local34] = Static88.aLongArray5[local34 + 1];
				}
				Static59.aClass2_Sub3_Sub1_2.method841(28);
				Static59.aClass2_Sub3_Sub1_2.method804(arg0);
				return;
			}
		}
	}
}
