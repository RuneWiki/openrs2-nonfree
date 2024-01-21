import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!ke;")
	public static Class52 aClass52_3;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_134 = Static193.method3027(":duelfriend:");

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public static int anInt318 = 0;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_136 = Static193.method3027("Cancel");

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!oc;")
	public static Class70 aClass70_135 = aClass70_136;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZIBZZII)Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 method271(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(9) Class3_Sub3_Sub11 local9 = Static14.method275(arg4);
		if (arg0 > 1 && local9.anIntArray69 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (local9.anIntArray68[local19] <= arg0 && local9.anIntArray68[local19] != 0) {
					local17 = local9.anIntArray69[local19];
				}
			}
			if (local17 != -1) {
				local9 = Static14.method275(local17);
			}
		}
		@Pc(54) Class26_Sub6_Sub1 local54 = local9.method901();
		if (local54 == null) {
			return null;
		}
		@Pc(60) Class3_Sub3_Sub2_Sub1 local60 = null;
		if (local9.anInt1261 != -1) {
			local60 = method271(10, false, 0, true, local9.anInt1250, 1);
			if (local60 == null) {
				return null;
			}
		} else if (local9.anInt1262 != -1) {
			local60 = method271(arg0, false, arg2, false, local9.anInt1222, arg5);
			if (local60 == null) {
				return null;
			}
		}
		@Pc(100) int local100 = Static104.anInt3996;
		@Pc(102) int local102 = Static104.anInt3997;
		@Pc(104) int[] local104 = Static104.anIntArray347;
		@Pc(107) int[] local107 = new int[4];
		Static104.method3084(local107);
		@Pc(115) Class3_Sub3_Sub2_Sub1 local115 = new Class3_Sub3_Sub2_Sub1(36, 32);
		Static104.method3085(local115.anIntArray6, 36, 32);
		Static104.method3082();
		Static177.method2768();
		Static177.method2780(16, 16);
		Static177.aBoolean159 = false;
		if (local9.anInt1262 != -1) {
			local60.method185(0, 0);
		}
		@Pc(139) int local139 = local9.anInt1251;
		if (arg3) {
			local139 = (int) ((double) local139 * 1.5D);
		} else if (arg5 == 2) {
			local139 = (int) ((double) local139 * 1.04D);
		}
		@Pc(175) int local175 = local139 * Class3_Sub3_Sub2_Sub5.anIntArray303[local9.anInt1233] >> 16;
		@Pc(184) int local184 = local139 * Class3_Sub3_Sub2_Sub5.anIntArray300[local9.anInt1233] >> 16;
		local54.method2525(local9.anInt1218, local9.anInt1255, local9.anInt1233, local9.anInt1266, local184 + local9.anInt1254 - local54.method2995() / 2, local9.anInt1254 + local175);
		if (local9.anInt1262 == -1) {
			if (arg5 >= 1) {
				local115.method196(1);
			}
			if (arg5 >= 2) {
				local115.method196(16777215);
			}
			if (arg2 != 0) {
				local115.method197(arg2);
			}
		}
		Static104.method3085(local115.anIntArray6, 36, 32);
		if (local9.anInt1261 != -1) {
			local60.method185(0, 0);
		}
		if (arg1 && (local9.anInt1232 == 1 || arg0 != 1) && arg0 != -1) {
			Static166.aClass3_Sub3_Sub2_Sub4_Sub1_7.method3126(Static103.method1469(arg0), 0, 9, 16776960, 1);
		}
		Static104.method3085(local104, local100, local102);
		Static104.method3080(local107);
		Static177.method2768();
		Static177.aBoolean159 = true;
		return local115;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method273(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static139.method3215(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local39 <= local42);
			return Static211.method3309(local42, arg1);
		}
	}
}
