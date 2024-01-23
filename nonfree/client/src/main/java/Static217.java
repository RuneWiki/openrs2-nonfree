import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	public static int anInt4217 = 0;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!wa;")
	public static Class4_Sub10_Sub1 aClass4_Sub10_Sub1_3 = new Class4_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z[Lclient!wf;I)V")
	public static void method3517(@OriginalArg(1) Class189[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class189 local15 = arg0[local7];
			if (local15 != null) {
				if (local15.anInt5915 == 0) {
					if (local15.aClass189Array4 != null) {
						method3517(local15.aClass189Array4, arg1);
					}
					@Pc(44) Class4_Sub27 local44 = (Class4_Sub27) Static148.aClass85_13.method1845((long) local15.anInt5918);
					if (local44 != null) {
						Static205.method3290(local44.anInt4621, arg1);
					}
				}
				@Pc(64) Class4_Sub13 local64;
				if (arg1 == 0 && local15.anObjectArray19 != null) {
					local64 = new Class4_Sub13();
					local64.aClass189_7 = local15;
					local64.anObjectArray2 = local15.anObjectArray19;
					Static135.method2020(local64);
				}
				if (arg1 == 1 && local15.anObjectArray4 != null) {
					if (local15.anInt5972 >= 0) {
						@Pc(94) Class189 local94 = Static114.method1814(local15.anInt5918);
						if (local94 == null || local94.aClass189Array4 == null || local94.aClass189Array4.length <= local15.anInt5972 || local15 != local94.aClass189Array4[local15.anInt5972]) {
							continue;
						}
					}
					local64 = new Class4_Sub13();
					local64.anObjectArray2 = local15.anObjectArray4;
					local64.aClass189_7 = local15;
					Static135.method2020(local64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 128 || arg4 < 128 || arg3 > 13056 || arg4 > 13056) {
			Static299.anInt5585 = -1;
			Static168.anInt3290 = -1;
			return;
		}
		@Pc(35) int local35 = Static33.method522(arg4, arg3, Static281.anInt5335) - arg1;
		@Pc(39) int local39 = arg3 - Static129.anInt2519;
		@Pc(43) int local43 = local35 - Static82.anInt1931;
		@Pc(47) int local47 = arg4 - Static302.anInt5682;
		@Pc(51) int local51 = Class111.anIntArray299[Static207.anInt4066];
		@Pc(63) int local63 = Class111.anIntArray298[Static207.anInt4066];
		@Pc(67) int local67 = Class111.anIntArray299[Static193.anInt3656];
		@Pc(71) int local71 = Class111.anIntArray298[Static193.anInt3656];
		@Pc(81) int local81 = local47 * local67 + local39 * local71 >> 16;
		@Pc(91) int local91 = local47 * local71 - local67 * local39 >> 16;
		@Pc(93) int local93 = local81;
		@Pc(104) int local104 = local63 * local43 - local91 * local51 >> 16;
		@Pc(114) int local114 = local51 * local43 + local91 * local63 >> 16;
		if (local114 < 50) {
			Static168.anInt3290 = -1;
			Static299.anInt5585 = -1;
		} else if (Static94.aBoolean138) {
			@Pc(133) int local133 = arg2 * 512 >> 8;
			Static299.anInt5585 = arg6 + local133 * local93 / local114;
			@Pc(147) int local147 = arg5 * 512 >> 8;
			Static168.anInt3290 = arg0 + local147 * local104 / local114;
		} else {
			Static299.anInt5585 = arg6 + (local93 << 9) / local114;
			Static168.anInt3290 = arg0 + (local104 << 9) / local114;
		}
	}
}
