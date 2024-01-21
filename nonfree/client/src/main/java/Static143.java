import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public static int anInt3523 = 0;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	public static int anInt3527 = -1;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public static int anInt3530 = 0;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1213 = Static161.method2971("Welt");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)I")
	public static int method2545() {
		@Pc(20) int local20 = Static66.method1449(Static156.anInt3696, Static7.anInt3157, Static22.anInt2236);
		return local20 - Static45.anInt1493 >= 800 || (Static35.aByteArrayArrayArray20[Static156.anInt3696][Static22.anInt2236 >> 7][Static7.anInt3157 >> 7] & 0x4) == 0 ? 3 : Static156.anInt3696;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public static void method2546() {
		aClass13_1213 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
	public static int method2547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >>> 31;
		return (arg0 + local11) / arg1 - local11;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZIIII)Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 method2548(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) long local25 = ((long) arg4 << 16) + (long) arg1 + ((long) arg2 << 38) + ((long) arg3 << 40);
		@Pc(33) Class1_Sub2_Sub1_Sub3 local33;
		if (!arg0) {
			local33 = (Class1_Sub2_Sub1_Sub3) Static40.aClass47_10.method1999(local25);
			if (local33 != null) {
				return local33;
			}
		}
		@Pc(41) Class1_Sub2_Sub6 local41 = Static184.method2994(arg1);
		if (arg4 > 1 && local41.anIntArray136 != null) {
			@Pc(51) int local51 = -1;
			for (@Pc(53) int local53 = 0; local53 < 10; local53++) {
				if (arg4 >= local41.anIntArray137[local53] && local41.anIntArray137[local53] != 0) {
					local51 = local41.anIntArray136[local53];
				}
			}
			if (local51 != -1) {
				local41 = Static184.method2994(local51);
			}
		}
		@Pc(90) Class1_Sub2_Sub2_Sub5_Sub1 local90 = local41.method1068();
		if (local90 == null) {
			return null;
		}
		@Pc(96) Class1_Sub2_Sub1_Sub3 local96 = null;
		if (local41.anInt1303 != -1) {
			local96 = method2548(true, local41.anInt1324, 1, 0, 10);
			if (local96 == null) {
				return null;
			}
		}
		@Pc(115) int[] local115 = Static128.anIntArray75;
		@Pc(117) int local117 = Static128.anInt509;
		@Pc(120) int[] local120 = new int[4];
		@Pc(122) int local122 = Static128.anInt505;
		Static128.method561(local120);
		local33 = new Class1_Sub2_Sub1_Sub3(36, 32);
		Static128.method567(local33.anIntArray45, 36, 32);
		Static128.method563();
		Static9.method363();
		Static9.method354(16, 16);
		Static9.aBoolean30 = false;
		@Pc(150) int local150 = local41.anInt1322;
		if (arg0) {
			local150 = (int) ((double) local150 * 1.5D);
		} else if (arg2 == 2) {
			local150 = (int) ((double) local150 * 1.04D);
		}
		@Pc(178) int local178 = local150 * Class1_Sub2_Sub1_Sub2.anIntArray41[local41.anInt1326] >> 16;
		@Pc(187) int local187 = Class1_Sub2_Sub1_Sub2.anIntArray38[local41.anInt1326] * local150 >> 16;
		local90.method2714();
		local90.method2723(local41.anInt1299, local41.anInt1288, local41.anInt1326, local41.anInt1291, local178 + local41.anInt1305 - local90.aShort27 / 2, local41.anInt1305 + local187);
		if (arg2 >= 1) {
			local33.method417(1);
		}
		if (arg2 >= 2) {
			local33.method417(16777215);
		}
		if (arg3 != 0) {
			local33.method401(arg3);
		}
		Static128.method567(local33.anIntArray45, 36, 32);
		if (local41.anInt1303 != -1) {
			local96.method422(0, 0);
		}
		if (!arg0 && (local41.anInt1287 == 1 || arg4 != 1) && arg4 != -1) {
			Static11.aClass1_Sub2_Sub1_Sub1_Sub1_1.method254(Static95.method1980(arg4), 0, 9, 16776960, 1);
		}
		if (!arg0) {
			Static40.aClass47_10.method1998(local33, local25);
		}
		Static128.method567(local115, local117, local122);
		Static128.method556(local120);
		Static9.method363();
		Static9.aBoolean30 = true;
		return local33;
	}
}
