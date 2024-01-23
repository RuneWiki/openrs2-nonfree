import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!i;")
	public static Class41 aClass41_554 = Static184.method2923(" <col=ffff00>");

	@OriginalMember(owner = "client!h", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_555 = Static184.method2923("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!h", name = "F", descriptor = "I")
	public static int anInt1758 = 0;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_556 = Static184.method2923("k");

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	public static int anInt1762 = 0;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "[Lclient!ea;")
	public static Class2_Sub3[] aClass2_Sub3Array1 = new Class2_Sub3[2048];

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_557 = Static184.method2923("blinken3:");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!u;I)V")
	public static void method1228(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub3 arg1) {
		if (arg1.anInt3959 > Static103.anInt2511) {
			Static95.method1667(arg1);
		} else if (arg1.anInt3957 < Static103.anInt2511) {
			Static216.method3292(arg1);
		} else {
			Static187.method2973(arg1);
		}
		if (arg1.anInt3961 < 128 || arg1.anInt3949 < 128 || arg1.anInt3961 >= 13184 || arg1.anInt3949 >= 13184) {
			arg1.anInt3949 = arg1.anInt3932 * 64 + arg1.anIntArray414[0] * 128;
			arg1.anInt3961 = arg1.anIntArray412[0] * 128 + arg1.anInt3932 * 64;
			arg1.anInt3957 = 0;
			arg1.anInt3911 = -1;
			arg1.anInt3959 = 0;
			arg1.anInt3910 = -1;
			arg1.method2726();
		}
		if (arg1 == Static213.aClass12_Sub3_Sub1_1 && (arg1.anInt3961 < 1536 || arg1.anInt3949 < 1536 || arg1.anInt3961 >= 11776 || arg1.anInt3949 >= 11776)) {
			arg1.anInt3911 = -1;
			arg1.anInt3957 = 0;
			arg1.anInt3959 = 0;
			arg1.anInt3949 = arg1.anInt3932 * 64 + arg1.anIntArray414[0] * 128;
			arg1.anInt3910 = -1;
			arg1.anInt3961 = arg1.anInt3932 * 64 + arg1.anIntArray412[0] * 128;
			arg1.method2726();
		}
		Static17.method324(arg1);
		Static91.method1603(arg1);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZZZZ)Lclient!rc;")
	public static Class2_Sub2_Sub16 method1230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) boolean arg5) {
		@Pc(9) Class2_Sub2_Sub15 local9 = Static63.method1158(arg0);
		if (arg1 > 1 && local9.anIntArray330 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (arg1 >= local9.anIntArray329[local21] && local9.anIntArray329[local21] != 0) {
					local19 = local9.anIntArray330[local21];
				}
			}
			if (local19 != -1) {
				local9 = Static63.method1158(local19);
			}
		}
		@Pc(63) Class12_Sub2_Sub1 local63 = local9.method2140();
		if (local63 == null) {
			return null;
		}
		@Pc(69) Class2_Sub2_Sub16_Sub1 local69 = null;
		if (local9.anInt3117 != -1) {
			local69 = (Class2_Sub2_Sub16_Sub1) method1230(local9.anInt3097, 10, 0, 1, true, false);
			if (local69 == null) {
				return null;
			}
		} else if (local9.anInt3132 != -1) {
			local69 = (Class2_Sub2_Sub16_Sub1) method1230(local9.anInt3123, arg1, arg2, arg3, false, false);
			if (local69 == null) {
				return null;
			}
		}
		@Pc(111) int[] local111 = Static64.anIntArray163;
		@Pc(113) int local113 = Static64.anInt1698;
		@Pc(115) int local115 = Static64.anInt1702;
		@Pc(118) int[] local118 = new int[4];
		Static64.method1172(local118);
		@Pc(126) Class2_Sub2_Sub16_Sub1 local126 = new Class2_Sub2_Sub16_Sub1(36, 32);
		Static64.method1182(local126.anIntArray354, 36, 32);
		Static155.method2532();
		Static155.method2525(16, 16);
		@Pc(138) int local138 = local9.anInt3136;
		if (arg4) {
			local138 = (int) ((double) local138 * 1.5D);
		} else if (arg3 == 2) {
			local138 = (int) ((double) local138 * 1.04D);
		}
		Static155.aBoolean208 = false;
		@Pc(168) int local168 = Class79.anIntArray375[local9.anInt3122] * local138 >> 16;
		@Pc(177) int local177 = local138 * Class79.anIntArray377[local9.anInt3122] >> 16;
		local63.method1862(local9.anInt3121, local9.anInt3102, local9.anInt3122, local9.anInt3125, local177 + local9.anInt3119 - local63.method2718() / 2, local9.anInt3119 + local168);
		if (arg3 >= 1) {
			local126.method2416(1);
			if (arg3 >= 2) {
				local126.method2416(16777215);
			}
			Static64.method1182(local126.anIntArray354, 36, 32);
		}
		if (arg2 != 0) {
			local126.method2408(arg2);
		}
		if (local9.anInt3117 != -1) {
			local69.method2407(0, 0);
		} else if (local9.anInt3132 != -1) {
			Static64.method1182(local69.anIntArray354, 36, 32);
			local126.method2407(0, 0);
			local126 = local69;
		}
		if (arg5 && (local9.anInt3106 == 1 || arg1 != 1) && arg1 != -1) {
			Static161.aClass2_Sub2_Sub4_Sub1_Sub1_2.method784(Static118.method2001(arg1), 0, 9, 16776960, 1);
		}
		Static64.method1182(local111, local113, local115);
		Static64.method1180(local118);
		Static155.method2532();
		Static155.aBoolean208 = true;
		return local126;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	public static void method1233() {
		Static160.aClass43_17.method1469();
		Static55.aClass16_2.method436();
		Static70.aClass16_3.method436();
		Static43.aClass16_1.method436();
	}
}
