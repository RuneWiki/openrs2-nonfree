import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!da", name = "ob", descriptor = "Lclient!wd;")
	private static Class80 aClass80_310 = Static2.method59("Close");

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_308 = aClass80_310;

	@OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
	public static int anInt963 = 127;

	@OriginalMember(owner = "client!da", name = "lb", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!da", name = "qb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_311 = Static2.method59("Please reload this page)3");

	@OriginalMember(owner = "client!da", name = "nb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_309 = aClass80_311;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIII)V")
	public static void method509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class2_Sub6 local11 = (Class2_Sub6) Static107.aClass58_14.method1285(); local11 != null; local11 = (Class2_Sub6) Static107.aClass58_14.method1281()) {
			if (local11.anInt1766 != -1 || local11.anIntArray220 != null) {
				@Pc(22) int local22 = 0;
				if (local11.anInt1753 < arg2) {
					local22 = arg2 - local11.anInt1753;
				} else if (arg2 < local11.anInt1760) {
					local22 = local11.anInt1760 - arg2;
				}
				if (arg1 > local11.anInt1758) {
					local22 += arg1 - local11.anInt1758;
				} else if (arg1 < local11.anInt1762) {
					local22 += local11.anInt1762 - arg1;
				}
				if (local22 - 64 > local11.anInt1752 || anInt963 == 0 || local11.anInt1765 != arg0) {
					if (local11.aClass2_Sub2_Sub4_1 != null) {
						Static123.aClass2_Sub2_Sub2_2.method1229(local11.aClass2_Sub2_Sub4_1);
						local11.aClass2_Sub2_Sub4_1 = null;
					}
					if (local11.aClass2_Sub2_Sub4_2 != null) {
						Static123.aClass2_Sub2_Sub2_2.method1229(local11.aClass2_Sub2_Sub4_2);
						local11.aClass2_Sub2_Sub4_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(149) int local149 = anInt963 * (local11.anInt1752 - local22) / local11.anInt1752;
					if (local11.aClass2_Sub2_Sub4_1 != null) {
						local11.aClass2_Sub2_Sub4_1.method1538(local149);
					} else if (local11.anInt1766 >= 0) {
						@Pc(164) Class25 local164 = Static128.method675(Static90.aClass11_Sub1_13, local11.anInt1766);
						if (local164 != null) {
							@Pc(171) Class2_Sub16_Sub1 local171 = local164.method677().method1509(Static36.aClass18_1);
							@Pc(176) Class2_Sub2_Sub4 local176 = Static133.method1558(local171, local149);
							local176.method1551(-1);
							Static123.aClass2_Sub2_Sub2_2.method1231(local176);
							local11.aClass2_Sub2_Sub4_1 = local176;
						}
					}
					if (local11.aClass2_Sub2_Sub4_2 != null) {
						local11.aClass2_Sub2_Sub4_2.method1538(local149);
						if (!local11.aClass2_Sub2_Sub4_2.method1958()) {
							local11.aClass2_Sub2_Sub4_2 = null;
						}
					} else if (local11.anIntArray220 != null && (local11.anInt1759 -= arg3) <= 0) {
						@Pc(213) int local213 = (int) (Math.random() * (double) local11.anIntArray220.length);
						@Pc(221) Class25 local221 = Static128.method675(Static90.aClass11_Sub1_13, local11.anIntArray220[local213]);
						if (local221 != null) {
							@Pc(228) Class2_Sub16_Sub1 local228 = local221.method677().method1509(Static36.aClass18_1);
							@Pc(233) Class2_Sub2_Sub4 local233 = Static133.method1558(local228, local149);
							local233.method1551(0);
							Static123.aClass2_Sub2_Sub2_2.method1231(local233);
							local11.anInt1759 = (int) (Math.random() * (double) (local11.anInt1763 - local11.anInt1761)) + local11.anInt1761;
							local11.aClass2_Sub2_Sub4_2 = local233;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	public static void method510() {
		aClass80_308 = null;
		aClass80_311 = null;
		aClass80_310 = null;
		aClass80_309 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public static void method511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(15) int[] local15 = new int[4];
		@Pc(17) int local17 = 1;
		local15[0] = arg0;
		local8[0] = arg1;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			if (Static123.anIntArray406[local27] != arg0) {
				local15[local17] = Static123.anIntArray406[local27];
				local8[local17] = Static80.anIntArray272[local27];
				local17++;
			}
		}
		Static123.anIntArray406 = local15;
		Static80.anIntArray272 = local8;
		Static10.method177(0, Static106.aClass51Array1, Static123.anIntArray406, Static106.aClass51Array1.length - 1, Static80.anIntArray272);
	}
}
