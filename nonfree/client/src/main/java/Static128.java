import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	public static int anInt2505 = 0;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString146 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString147 = "Opened title screen";

	@OriginalMember(owner = "client!j", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString148 = " more options";

	@OriginalMember(owner = "client!j", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString149 = "Loading defaults - ";

	@OriginalMember(owner = "client!j", name = "x", descriptor = "[S")
	public static short[] aShortArray35 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)J")
	public static long method1961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(22) Class33 local22 = local7.aClass33Array3[local13];
			if ((local22.aLong38 >> 29 & 0x3L) == 2L && local22.anInt824 == arg1 && local22.anInt826 == arg2) {
				return local22.aLong38;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!wh;")
	public static Class4_Sub3_Sub23 method1962(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub23 local10 = (Class4_Sub3_Sub23) Static145.aClass40_12.method889((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26;
		if (arg0 >= 32768) {
			local26 = Static50.aClass58_26.method1372(0, arg0 & 0x7FFF);
		} else {
			local26 = Static252.aClass58_91.method1372(0, arg0);
		}
		local10 = new Class4_Sub3_Sub23();
		if (local26 != null) {
			local10.method4809(new Class4_Sub10(local26));
		}
		if (arg0 >= 32768) {
			local10.method4815();
		}
		Static145.aClass40_12.method888((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public static void method1964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class4_Sub11 local10;
		for (local10 = (Class4_Sub11) Static11.aClass114_2.method2623(); local10 != null; local10 = (Class4_Sub11) Static11.aClass114_2.method2629()) {
			Static46.method731(arg0, arg2, arg3, local10, arg1);
		}
		@Pc(40) byte local40;
		@Pc(45) Class34 local45;
		@Pc(135) int local135;
		for (local10 = (Class4_Sub11) Static82.aClass114_9.method2623(); local10 != null; local10 = (Class4_Sub11) Static82.aClass114_9.method2629()) {
			local40 = 1;
			local45 = local10.aClass53_Sub1_Sub2_1.method3327();
			if (local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt860) {
				local40 = 0;
			} else if (local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt831 || local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt829 || local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt857 || local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt867) {
				local40 = 2;
			} else if (local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt854 || local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt833 || local10.aClass53_Sub1_Sub2_1.anInt4005 == local45.anInt861 || local45.anInt852 == local10.aClass53_Sub1_Sub2_1.anInt4005) {
				local40 = 3;
			}
			if (local40 != local10.anInt2111) {
				local135 = Static28.method395(local10.aClass53_Sub1_Sub2_1);
				if (local10.anInt2115 != local135) {
					if (local10.aClass4_Sub6_Sub4_3 != null) {
						Static211.aClass4_Sub6_Sub3_2.method2683(local10.aClass4_Sub6_Sub4_3);
						local10.aClass4_Sub6_Sub4_3 = null;
					}
					local10.anInt2115 = local135;
				}
				local10.anInt2111 = local40;
			}
			local10.anInt2124 = local10.aClass53_Sub1_Sub2_1.anInt3974;
			local10.anInt2117 = local10.aClass53_Sub1_Sub2_1.anInt3974 + local10.aClass53_Sub1_Sub2_1.method3324() * 64;
			local10.anInt2113 = local10.aClass53_Sub1_Sub2_1.anInt4002;
			local10.anInt2112 = local10.aClass53_Sub1_Sub2_1.anInt4002 + local10.aClass53_Sub1_Sub2_1.method3324() * 64;
			Static46.method731(arg0, arg2, arg3, local10, arg1);
		}
		for (local10 = (Class4_Sub11) Static206.aClass85_18.method1843(); local10 != null; local10 = (Class4_Sub11) Static206.aClass85_18.method1844()) {
			local40 = 1;
			local45 = local10.aClass53_Sub1_Sub1_1.method3327();
			if (local45.anInt860 == local10.aClass53_Sub1_Sub1_1.anInt4005) {
				local40 = 0;
			} else if (local45.anInt831 == local10.aClass53_Sub1_Sub1_1.anInt4005 || local45.anInt829 == local10.aClass53_Sub1_Sub1_1.anInt4005 || local10.aClass53_Sub1_Sub1_1.anInt4005 == local45.anInt857 || local10.aClass53_Sub1_Sub1_1.anInt4005 == local45.anInt867) {
				local40 = 2;
			} else if (local10.aClass53_Sub1_Sub1_1.anInt4005 == local45.anInt854 || local10.aClass53_Sub1_Sub1_1.anInt4005 == local45.anInt833 || local10.aClass53_Sub1_Sub1_1.anInt4005 == local45.anInt861 || local10.aClass53_Sub1_Sub1_1.anInt4005 == local45.anInt852) {
				local40 = 3;
			}
			if (local10.anInt2111 != local40) {
				local135 = Static28.method396(local10.aClass53_Sub1_Sub1_1);
				if (local10.anInt2115 != local135) {
					if (local10.aClass4_Sub6_Sub4_3 != null) {
						Static211.aClass4_Sub6_Sub3_2.method2683(local10.aClass4_Sub6_Sub4_3);
						local10.aClass4_Sub6_Sub4_3 = null;
					}
					local10.anInt2115 = local135;
				}
				local10.anInt2111 = local40;
			}
			local10.anInt2124 = local10.aClass53_Sub1_Sub1_1.anInt3974;
			local10.anInt2117 = local10.aClass53_Sub1_Sub1_1.anInt3974 + local10.aClass53_Sub1_Sub1_1.method3324() * 64;
			local10.anInt2113 = local10.aClass53_Sub1_Sub1_1.anInt4002;
			local10.anInt2112 = local10.aClass53_Sub1_Sub1_1.anInt4002 + local10.aClass53_Sub1_Sub1_1.method3324() * 64;
			Static46.method731(arg0, arg2, arg3, local10, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method1965(@OriginalArg(1) Class58 arg0) {
		Static36.aClass58_20 = arg0;
	}
}
