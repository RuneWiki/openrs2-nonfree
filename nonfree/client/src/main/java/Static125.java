import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!qa", name = "zc", descriptor = "I")
	public static int anInt3614;

	@OriginalMember(owner = "client!qa", name = "Tc", descriptor = "I")
	public static int anInt3628;

	@OriginalMember(owner = "client!qa", name = "qc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_900 = Static8.method128(" )2> ");

	@OriginalMember(owner = "client!qa", name = "Ec", descriptor = "Lclient!ea;")
	private static Class18 aClass18_903 = Static8.method128("Loaded textures");

	@OriginalMember(owner = "client!qa", name = "vc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_901 = aClass18_903;

	@OriginalMember(owner = "client!qa", name = "Bc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_902 = Static8.method128(")3runescape)3com");

	@OriginalMember(owner = "client!qa", name = "Hc", descriptor = "I")
	public static int anInt3620 = -1;

	@OriginalMember(owner = "client!qa", name = "Jc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_904 = Static8.method128("mod_icons");

	@OriginalMember(owner = "client!qa", name = "Oc", descriptor = "[I")
	public static int[] anIntArray318 = new int[4000];

	@OriginalMember(owner = "client!qa", name = "Uc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_905 = Static8.method128("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!qa", name = "Vc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_906 = Static8.method128("Lade Sprites )2 ");

	@OriginalMember(owner = "client!qa", name = "Wc", descriptor = "Lclient!ea;")
	public static Class18 aClass18_907 = Static8.method128(")1p");

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(Z)V")
	public static void method2484() {
		for (@Pc(7) int local7 = 0; local7 < Static155.anInt4267; local7++) {
			@Pc(13) int local13 = Static150.anIntArray382[local7];
			@Pc(17) Class1_Sub1_Sub5_Sub1_Sub1 local17 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local13];
			if (local17 != null) {
				Static15.method269(local17.aClass1_Sub1_Sub15_1.anInt3809, local17);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZZII)Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) long local20 = (long) arg0 + ((long) arg3 << 16) + ((long) arg1 << 38) + ((long) arg4 << 40);
		@Pc(32) Class1_Sub1_Sub8_Sub3 local32;
		if (!arg2) {
			local32 = (Class1_Sub1_Sub8_Sub3) Static165.aClass66_23.method2599(local20);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class1_Sub1_Sub1 local40 = Static101.method2134(arg0);
		if (arg3 > 1 && local40.anIntArray1 != null) {
			@Pc(48) int local48 = -1;
			for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
				if (local40.anIntArray2[local50] <= arg3 && local40.anIntArray2[local50] != 0) {
					local48 = local40.anIntArray1[local50];
				}
			}
			if (local48 != -1) {
				local40 = Static101.method2134(local48);
			}
		}
		@Pc(84) Class1_Sub1_Sub5_Sub4 local84 = local40.method49(1);
		if (local84 == null) {
			return null;
		}
		@Pc(90) Class1_Sub1_Sub8_Sub3 local90 = null;
		if (local40.anInt70 != -1) {
			local90 = method2485(local40.anInt54, 1, true, 10, 0);
			if (local90 == null) {
				return null;
			}
		}
		@Pc(109) int[] local109 = Static63.anIntArray254;
		@Pc(111) int local111 = Static63.anInt2849;
		@Pc(113) int local113 = Static63.anInt2852;
		@Pc(116) int[] local116 = new int[4];
		Static63.method2006(local116);
		local32 = new Class1_Sub1_Sub8_Sub3(36, 32);
		Static63.method1999(local32.anIntArray203, 36, 32);
		Static63.method1991();
		Static79.method1767();
		Static79.method1761(16, 16);
		Static79.aBoolean98 = false;
		@Pc(144) int local144 = local40.anInt77;
		if (arg2) {
			local144 = (int) ((double) local144 * 1.5D);
		} else if (arg1 == 2) {
			local144 = (int) ((double) local144 * 1.04D);
		}
		@Pc(174) int local174 = Class1_Sub1_Sub8_Sub4.anIntArray212[local40.anInt60] * local144 >> 16;
		@Pc(183) int local183 = local144 * Class1_Sub1_Sub8_Sub4.anIntArray216[local40.anInt60] >> 16;
		local84.method1008();
		local84.method997(local40.anInt58, local40.anInt97, local40.anInt60, local40.anInt62, local40.anInt94 + local174 + local84.anInt4233 / 2, local183 - -local40.anInt94);
		if (arg1 >= 1) {
			local32.method1635(1);
		}
		if (arg1 >= 2) {
			local32.method1635(16777215);
		}
		if (arg4 != 0) {
			local32.method1661(arg4);
		}
		Static63.method1999(local32.anIntArray203, 36, 32);
		if (local40.anInt70 != -1) {
			local90.method1659(0, 0);
		}
		if (!arg2 && (local40.anInt86 == 1 || arg3 != 1) && arg3 != -1) {
			Static89.aClass1_Sub1_Sub8_Sub2_Sub1_25.method2016(Static1.method40(arg3), 0, 9, 16776960, 1);
		}
		if (!arg2) {
			Static165.aClass66_23.method2597(local20, local32);
		}
		Static63.method1999(local109, local111, local113);
		Static63.method2003(local116);
		Static79.method1767();
		Static79.aBoolean98 = true;
		return local32;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
	public static void method2486() {
		aClass18_902 = null;
		aClass18_904 = null;
		aClass18_901 = null;
		anIntArray318 = null;
		aClass18_903 = null;
		aClass18_900 = null;
		aClass18_907 = null;
		aClass18_906 = null;
		aClass18_905 = null;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)Lclient!ea;")
	public static Class18 method2488(@OriginalArg(0) int arg0) {
		return Static180.aClass18Array25[arg0].method747() > 0 ? Static144.method2735(new Class18[] { Static84.aClass18Array13[arg0], Static87.aClass18_646, Static180.aClass18Array25[arg0] }) : Static84.aClass18Array13[arg0];
	}
}
