import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public static int anInt4566;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public static int anInt4567;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array10;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1596 = Static49.method1293("Mem:");

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public static int anInt4570 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!u;IIB)Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 method3511(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static95.method2048(arg2, arg0, arg1) ? Static68.method1566() : null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public static void method3513() {
		aClass70_1596 = null;
		aClass1_Sub1_Sub1_Sub4Array10 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!u;Lclient!rf;Lclient!u;ZLclient!rf;)Lclient!ne;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 method3514(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(4) Class70 arg3) {
		@Pc(18) int local18 = arg0.method3309(arg1);
		@Pc(24) int local24 = arg0.method3312(arg3, local18);
		return Static137.method2685(local24, local18, arg2, arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIII)Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 method3515(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg3 << 38) + ((long) arg2 << 16) + (long) arg0 + ((long) arg4 << 40);
		@Pc(31) Class1_Sub1_Sub1_Sub4 local31;
		if (!arg1) {
			local31 = (Class1_Sub1_Sub1_Sub4) Static26.aClass25_3.method1302(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class1_Sub1_Sub2 local39 = Static90.method1963(arg0);
		if (arg2 > 1 && local39.anIntArray16 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (arg2 >= local39.anIntArray17[local49] && local39.anIntArray17[local49] != 0) {
					local47 = local39.anIntArray16[local49];
				}
			}
			if (local47 != -1) {
				local39 = Static90.method1963(local47);
			}
		}
		@Pc(84) Class1_Sub1_Sub4_Sub1_Sub1 local84 = local39.method168();
		if (local84 == null) {
			return null;
		}
		@Pc(90) Class1_Sub1_Sub1_Sub4 local90 = null;
		if (local39.anInt158 != -1) {
			local90 = method3515(local39.anInt159, true, 10, 1, 0);
			if (local90 == null) {
				return null;
			}
		}
		@Pc(110) int[] local110 = Static155.anIntArray373;
		@Pc(112) int local112 = Static155.anInt3963;
		@Pc(114) int local114 = Static155.anInt3964;
		@Pc(117) int[] local117 = new int[4];
		Static155.method2999(local117);
		local31 = new Class1_Sub1_Sub1_Sub4(36, 32);
		Static155.method3000(local31.anIntArray374, 36, 32);
		Static155.method3008();
		Static1.method93();
		Static1.method105(16, 16);
		Static1.aBoolean3 = false;
		@Pc(140) int local140 = local39.anInt188;
		if (arg1) {
			local140 = (int) ((double) local140 * 1.5D);
		} else if (arg3 == 2) {
			local140 = (int) ((double) local140 * 1.04D);
		}
		@Pc(168) int local168 = Class1_Sub1_Sub1_Sub1.anIntArray11[local39.anInt181] * local140 >> 16;
		@Pc(177) int local177 = Class1_Sub1_Sub1_Sub1.anIntArray8[local39.anInt181] * local140 >> 16;
		local84.method723();
		local84.method725(local39.anInt170, local39.anInt191, local39.anInt181, local39.anInt166, local39.anInt171 + local168 - local84.aShort36 / 2, local39.anInt171 + local177);
		if (arg3 >= 1) {
			local31.method3038(1);
		}
		if (arg3 >= 2) {
			local31.method3038(16777215);
		}
		if (arg4 != 0) {
			local31.method3042(arg4);
		}
		Static155.method3000(local31.anIntArray374, 36, 32);
		if (local39.anInt158 != -1) {
			local90.method3021(0, 0);
		}
		if (!arg1 && (local39.anInt184 == 1 || arg2 != 1) && arg2 != -1) {
			Static117.aClass1_Sub1_Sub1_Sub2_Sub1_4.method2391(Static89.method1934(arg2), 0, 9, 16776960, 1);
		}
		if (!arg1) {
			Static26.aClass25_3.method1299(local31, local23);
		}
		Static155.method3000(local110, local112, local114);
		Static155.method3014(local117);
		Static1.method93();
		Static1.aBoolean3 = true;
		return local31;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method3516() {
		Static135.aClass25_20.method1300();
		Static172.aClass25_25.method1300();
		Static110.aClass25_17.method1300();
		Static104.aClass25_16.method1300();
		Static85.aClass25_14.method1300();
	}
}
