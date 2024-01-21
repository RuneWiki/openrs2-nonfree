import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!kb;")
	public static Class41 aClass41_32;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!af;")
	private static Class5 aClass5_1465 = Static45.method1937("Please enter your password)3");

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_1464 = aClass5_1465;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_1466 = Static45.method1937("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!gd;")
	public static Class28 aClass28_88 = new Class28(64);

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
	public static int[] anIntArray465 = new int[1000];

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_1467 = Static45.method1937("rect_debug=");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_1468 = Static45.method1937("null");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method2249() {
		aClass5_1466 = null;
		aClass5_1467 = null;
		aClass5_1465 = null;
		anIntArray465 = null;
		aClass5_1464 = null;
		aClass5_1468 = null;
		aClass41_32 = null;
		aClass28_88 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZIIIZ)Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 method2250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(24) long local24 = ((long) arg3 << 40) + ((long) arg0 << 16) + (long) arg1 + ((long) arg2 << 38);
		@Pc(32) Class1_Sub3_Sub1_Sub2 local32;
		if (!arg4) {
			local32 = (Class1_Sub3_Sub1_Sub2) Static121.aClass28_81.method796(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class1_Sub3_Sub16 local40 = Static56.method1022(arg1);
		if (arg0 > 1 && local40.anIntArray433 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (local40.anIntArray432[local52] <= arg0 && local40.anIntArray432[local52] != 0) {
					local50 = local40.anIntArray433[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static56.method1022(local50);
			}
		}
		@Pc(90) Class1_Sub3_Sub4_Sub4 local90 = local40.method2021(1);
		if (local90 == null) {
			return null;
		}
		@Pc(96) Class1_Sub3_Sub1_Sub2 local96 = null;
		if (local40.anInt2876 != -1) {
			local96 = method2250(10, local40.anInt2860, 1, 0, true);
			if (local96 == null) {
				return null;
			}
		}
		@Pc(115) int[] local115 = Static33.anIntArray421;
		@Pc(117) int local117 = Static33.anInt2810;
		@Pc(120) int[] local120 = new int[4];
		@Pc(122) int local122 = Static33.anInt2808;
		Static33.method1977(local120);
		local32 = new Class1_Sub3_Sub1_Sub2(36, 32);
		Static33.method1975(local32.anIntArray171, 36, 32);
		Static33.method1980();
		Static114.method1995();
		Static114.method1990(16, 16);
		Static114.aBoolean113 = false;
		@Pc(145) int local145 = local40.anInt2851;
		if (arg4) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg2 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(175) int local175 = local145 * Class1_Sub3_Sub1_Sub4.anIntArray424[local40.anInt2866] >> 16;
		@Pc(184) int local184 = local145 * Class1_Sub3_Sub1_Sub4.anIntArray425[local40.anInt2866] >> 16;
		local90.method634();
		local90.method647(local40.anInt2872, local40.anInt2861, local40.anInt2866, local40.anInt2874, local40.anInt2852 + local184 + local90.anInt3024 / 2, local40.anInt2852 + local175);
		if (arg2 >= 1) {
			local32.method749(1);
		}
		if (arg2 >= 2) {
			local32.method749(16777215);
		}
		if (arg3 != 0) {
			local32.method740(arg3);
		}
		Static33.method1975(local32.anIntArray171, 36, 32);
		if (local40.anInt2876 != -1) {
			local96.method735(0, 0);
		}
		if (!arg4 && (local40.anInt2857 == 1 || arg0 != 1) && arg0 != -1) {
			Static96.aClass1_Sub3_Sub1_Sub1_3.method165(Static51.method900(arg0), 0, 9, 16776960, 1);
		}
		if (!arg4) {
			Static121.aClass28_81.method789(local32, local24);
		}
		Static33.method1975(local115, local117, local122);
		Static33.method1973(local120);
		Static114.method1995();
		Static114.aBoolean113 = true;
		return local32;
	}
}
