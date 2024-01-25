import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!rk;")
	public static Class180 aClass180_47;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	public static int anInt3631 = 0;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
	public static int anInt3637 = 0;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
	public static int anInt3641 = -1;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "Lclient!ik;")
	public static Class103 aClass103_29 = new Class103(64);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V")
	public static void method3285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class7_Sub26 local10 = (Class7_Sub26) Static75.aClass74_7.method1793(); local10 != null; local10 = (Class7_Sub26) Static75.aClass74_7.method1798()) {
			Static16.method2778(local10, arg1, arg0, arg3, arg2);
		}
		for (@Pc(31) Class7_Sub26 local31 = (Class7_Sub26) Static45.aClass74_4.method1793(); local31 != null; local31 = (Class7_Sub26) Static45.aClass74_4.method1798()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class79 local40 = local31.aClass22_Sub2_Sub1_Sub2_1.method4417();
			if (local31.aClass22_Sub2_Sub1_Sub2_1.aBoolean378) {
				local35 = 0;
			} else if (local40.anInt2385 == local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100 || local40.anInt2351 == local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100 || local40.anInt2376 == local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100 || local40.anInt2357 == local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100) {
				local35 = 2;
			} else if (local40.anInt2374 == local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100 || local40.anInt2356 == local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100 || local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100 == local40.anInt2372 || local40.anInt2390 == local31.aClass22_Sub2_Sub1_Sub2_1.anInt5100) {
				local35 = 3;
			}
			if (local35 != local31.anInt3935) {
				@Pc(135) int local135 = Static289.method1940(local31.aClass22_Sub2_Sub1_Sub2_1);
				if (local31.anInt3939 != local135) {
					if (local31.aClass7_Sub8_Sub4_1 != null) {
						Static134.aClass7_Sub8_Sub3_2.method3898(local31.aClass7_Sub8_Sub4_1);
						local31.aClass7_Sub8_Sub4_1 = null;
					}
					local31.anInt3939 = local135;
				}
				local31.anInt3935 = local35;
			}
			local31.anInt3942 = local31.aClass22_Sub2_Sub1_Sub2_1.anInt5973;
			local31.anInt3938 = local31.aClass22_Sub2_Sub1_Sub2_1.anInt5973 + local31.aClass22_Sub2_Sub1_Sub2_1.method4421() * 64;
			local31.anInt3945 = local31.aClass22_Sub2_Sub1_Sub2_1.anInt5967;
			local31.anInt3949 = local31.aClass22_Sub2_Sub1_Sub2_1.anInt5967 + local31.aClass22_Sub2_Sub1_Sub2_1.method4421() * 64;
			Static16.method2778(local31, arg1, arg0, arg3, arg2);
		}
		for (@Pc(213) Class7_Sub26 local213 = (Class7_Sub26) Static141.aClass10_24.method157(); local213 != null; local213 = (Class7_Sub26) Static141.aClass10_24.method155()) {
			@Pc(217) byte local217 = 1;
			@Pc(222) Class79 local222 = local213.aClass22_Sub2_Sub1_Sub1_3.method4417();
			if (local213.aClass22_Sub2_Sub1_Sub1_3.aBoolean378) {
				local217 = 0;
			} else if (local222.anInt2385 == local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100 || local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100 == local222.anInt2351 || local222.anInt2376 == local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100 || local222.anInt2357 == local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100) {
				local217 = 2;
			} else if (local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100 == local222.anInt2374 || local222.anInt2356 == local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100 || local222.anInt2372 == local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100 || local222.anInt2390 == local213.aClass22_Sub2_Sub1_Sub1_3.anInt5100) {
				local217 = 3;
			}
			if (local217 != local213.anInt3935) {
				@Pc(309) int local309 = Static184.method3384(local213.aClass22_Sub2_Sub1_Sub1_3);
				if (local309 != local213.anInt3939) {
					if (local213.aClass7_Sub8_Sub4_1 != null) {
						Static134.aClass7_Sub8_Sub3_2.method3898(local213.aClass7_Sub8_Sub4_1);
						local213.aClass7_Sub8_Sub4_1 = null;
					}
					local213.anInt3939 = local309;
				}
				local213.anInt3935 = local217;
			}
			local213.anInt3942 = local213.aClass22_Sub2_Sub1_Sub1_3.anInt5973;
			local213.anInt3938 = local213.aClass22_Sub2_Sub1_Sub1_3.anInt5973 + local213.aClass22_Sub2_Sub1_Sub1_3.method4421() * 64;
			local213.anInt3945 = local213.aClass22_Sub2_Sub1_Sub1_3.anInt5967;
			local213.anInt3949 = local213.aClass22_Sub2_Sub1_Sub1_3.anInt5967 + local213.aClass22_Sub2_Sub1_Sub1_3.method4421() * 64;
			Static16.method2778(local213, arg1, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(4) Class36_Sub5 local4 = (Class36_Sub5) Static187.aClass191_4.method4862(); local4 != null; local4 = (Class36_Sub5) Static187.aClass191_4.method4869()) {
			if (Static212.anInt4234 >= local4.anInt3720) {
				local4.method5317();
			} else {
				Static222.method3930(arg2 >> 1, local4.anInt3715 * 2, (local4.anInt3717 << 7) + 64, (local4.anInt3719 << 7) + 64, arg3 >> 1);
				Static149.aClass94_19.method5687(0, local4.aString241, local4.anInt3713 | 0xFF000000, arg1 + Static157.anIntArray430[1], arg0 - -Static157.anIntArray430[0]);
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)I")
	public static int method3287(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
	public static void method3288() {
		Static210.aClass103_40.method2679(5);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)V")
	public static void method3289(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(8, arg0);
		local8.method4788();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!pe;IIILclient!sj;IIIIII)Lclient!sj;")
	public static Class31 method3290(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg8;
		@Pc(14) Class31 local14 = (Class31) Static201.aClass103_39.method2682(local6);
		if (local14 == null) {
			@Pc(24) Class140 local24 = Static233.method4073(arg8, Static247.aClass180_64);
			if (local24 == null) {
				return null;
			}
			local14 = arg0.method5475(local24, 1031, Static134.anInt2898, 64, 768);
			Static201.aClass103_39.method2687(local14, local6);
		}
		local14 = local14.method1917((byte) 2, 1031, true);
		if (arg7 != 0) {
			local14.method1956(arg7);
		}
		if (arg5 != 0) {
			local14.method1913(arg5);
		}
		if (arg3 != 0) {
			local14.method1924(arg3);
		}
		if (arg2 != 0) {
			local14.method1915(0, arg2, 0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBLclient!fo;)Lclient!db;")
	public static Class47 method3292(@OriginalArg(0) int arg0, @OriginalArg(2) Class22_Sub2 arg1) {
		@Pc(9) Class47 local9;
		if (Static47.aClass47_1 == null) {
			local9 = new Class47();
		} else {
			local9 = Static47.aClass47_1;
			Static47.aClass47_1 = Static47.aClass47_1.aClass47_2;
			local9.aClass47_2 = null;
			Static35.anInt1011--;
		}
		local9.anInt1398 = arg0;
		local9.aClass22_Sub2_1 = arg1;
		return local9;
	}
}
