import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V")
	public static void method1360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class4_Sub51 local6 = (Class4_Sub51) Static217.aClass124_22.method3267(); local6 != null; local6 = (Class4_Sub51) Static217.aClass124_22.method3273()) {
			Static72.method1296(arg3, arg1, arg2, local6, arg0);
		}
		for (@Pc(37) Class4_Sub51 local37 = (Class4_Sub51) Static162.aClass124_19.method3267(); local37 != null; local37 = (Class4_Sub51) Static162.aClass124_19.method3273()) {
			@Pc(41) byte local41 = 1;
			@Pc(46) Class130 local46 = local37.aClass10_Sub1_Sub2_Sub1_2.method7026();
			if (local37.aClass10_Sub1_Sub2_Sub1_2.aBoolean592) {
				local41 = 0;
			} else if (local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491 == local46.anInt3824 || local46.anInt3782 == local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491 || local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491 == local46.anInt3813 || local46.anInt3789 == local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491) {
				local41 = 2;
			} else if (local46.anInt3797 == local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491 || local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491 == local46.anInt3795 || local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491 == local46.anInt3798 || local37.aClass10_Sub1_Sub2_Sub1_2.anInt8491 == local46.anInt3803) {
				local41 = 3;
			}
			if (local37.anInt9595 != local41) {
				@Pc(133) int local133 = Static145.method2998(local37.aClass10_Sub1_Sub2_Sub1_2);
				@Pc(137) Class54 local137 = local37.aClass10_Sub1_Sub2_Sub1_2.aClass54_1;
				if (local137.anIntArray150 != null) {
					local137 = local137.method1118(Static511.aClass335_2);
				}
				if (local137 == null || local133 == -1) {
					local37.aBoolean676 = false;
					local37.anInt9598 = -1;
				} else if (local133 != local37.anInt9598 || local37.aBoolean676 != local137.aBoolean96) {
					if (local37.aClass4_Sub13_Sub2_3 != null) {
						Static430.aClass4_Sub13_Sub1_1.method2274(local37.aClass4_Sub13_Sub2_3);
						local37.aClass4_Sub13_Sub2_3 = null;
					}
					local37.aBoolean676 = local137.aBoolean96;
					local37.anInt9598 = local133;
					local37.aClass4_Sub16_Sub1_3 = null;
					local37.aClass4_Sub24_3 = null;
				}
				local37.anInt9595 = local41;
			}
			local37.anInt9601 = local37.aClass10_Sub1_Sub2_Sub1_2.anInt8934;
			local37.anInt9597 = local37.aClass10_Sub1_Sub2_Sub1_2.anInt8934 + (local37.aClass10_Sub1_Sub2_Sub1_2.method7021() << 8);
			local37.anInt9606 = local37.aClass10_Sub1_Sub2_Sub1_2.anInt8929;
			local37.anInt9605 = local37.aClass10_Sub1_Sub2_Sub1_2.anInt8929 + (local37.aClass10_Sub1_Sub2_Sub1_2.method7021() << 8);
			Static72.method1296(arg3, arg1, arg2, local37, arg0);
		}
		for (@Pc(248) Class4_Sub51 local248 = (Class4_Sub51) Static518.aClass183_37.method4286(); local248 != null; local248 = (Class4_Sub51) Static518.aClass183_37.method4283()) {
			@Pc(252) byte local252 = 1;
			@Pc(257) Class130 local257 = local248.aClass10_Sub1_Sub2_Sub2_2.method7026();
			if (local248.aClass10_Sub1_Sub2_Sub2_2.aBoolean592) {
				local252 = 0;
			} else if (local257.anInt3824 == local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 || local257.anInt3782 == local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 || local257.anInt3813 == local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 || local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 == local257.anInt3789) {
				local252 = 2;
			} else if (local257.anInt3797 == local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 || local257.anInt3795 == local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 || local257.anInt3798 == local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 || local248.aClass10_Sub1_Sub2_Sub2_2.anInt8491 == local257.anInt3803) {
				local252 = 3;
			}
			if (local252 != local248.anInt9595) {
				@Pc(356) int local356 = Static385.method5690(local248.aClass10_Sub1_Sub2_Sub2_2);
				if (local248.anInt9598 != local356 || local248.aBoolean676 != local248.aClass10_Sub1_Sub2_Sub2_2.aBoolean595) {
					if (local248.aClass4_Sub13_Sub2_3 != null) {
						Static430.aClass4_Sub13_Sub1_1.method2274(local248.aClass4_Sub13_Sub2_3);
						local248.aClass4_Sub13_Sub2_3 = null;
					}
					local248.aBoolean676 = local248.aClass10_Sub1_Sub2_Sub2_2.aBoolean595;
					local248.anInt9598 = local356;
					local248.aClass4_Sub16_Sub1_3 = null;
					local248.aClass4_Sub24_3 = null;
				}
				local248.anInt9595 = local252;
			}
			local248.anInt9601 = local248.aClass10_Sub1_Sub2_Sub2_2.anInt8934;
			local248.anInt9597 = local248.aClass10_Sub1_Sub2_Sub2_2.anInt8934 + (local248.aClass10_Sub1_Sub2_Sub2_2.method7021() << 8);
			local248.anInt9606 = local248.aClass10_Sub1_Sub2_Sub2_2.anInt8929;
			local248.anInt9605 = local248.aClass10_Sub1_Sub2_Sub2_2.anInt8929 + (local248.aClass10_Sub1_Sub2_Sub2_2.method7021() << 8);
			Static72.method1296(arg3, arg1, arg2, local248, arg0);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILclient!jv;)Lclient!wm;")
	public static Class4_Sub7_Sub18 method1365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class182 arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg2.anInt5047;
		@Pc(24) Class4_Sub7_Sub18 local24 = (Class4_Sub7_Sub18) Static302.aClass122_2.method3206((long) local10 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static328.aClass31_69.method661(Static328.aClass31_69.method687(local10));
		if (local36 == null) {
			local10 = arg0 + 65536 << 10 | arg2.anInt5047;
			local24 = (Class4_Sub7_Sub18) Static302.aClass122_2.method3206((long) local10 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static328.aClass31_69.method661(Static328.aClass31_69.method687(local10));
			if (local36 == null) {
				local10 = arg2.anInt5047 | 0x3FFFC00;
				local24 = (Class4_Sub7_Sub18) Static302.aClass122_2.method3206((long) local10 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static328.aClass31_69.method661(Static328.aClass31_69.method687(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static552.method7614(local36);
					local24.aClass182_9 = arg2;
					Static302.aClass122_2.method3207(local24, (long) local10 << 16);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static552.method7614(local36);
				local24.aClass182_9 = arg2;
				Static302.aClass122_2.method3207(local24, (long) local10 << 16);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static552.method7614(local36);
			local24.aClass182_9 = arg2;
			Static302.aClass122_2.method3207(local24, (long) local10 << 16);
			return local24;
		}
	}
}
