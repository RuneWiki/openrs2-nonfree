import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "D", descriptor = "I")
	public static int anInt265;

	@OriginalMember(owner = "client!am", name = "H", descriptor = "Z")
	public static boolean aBoolean10 = true;

	@OriginalMember(owner = "client!am", name = "I", descriptor = "Lclient!td;")
	public static final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!am", name = "L", descriptor = "[I")
	public static final int[] anIntArray34 = new int[14];

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V")
	public static void method196() {
		for (@Pc(7) int local7 = 0; local7 < Static11.anInt3203; local7++) {
			@Pc(13) int local13 = Static257.anIntArray649[local7];
			@Pc(17) Class22_Sub2_Sub1_Sub2 local17 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local13];
			if (local17 != null) {
				Static205.method3650(local17.aClass174_1.anInt5191, local17);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
	public static void method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 - arg3;
		@Pc(12) int local12 = arg0 - arg4;
		if (local12 == 0) {
			if (local8 != 0) {
				Static96.method1985(arg3, arg1, arg2, arg4);
			}
		} else if (local8 == 0) {
			Static353.method2004(arg2, arg3, arg0, arg4);
		} else {
			if (local8 < 0) {
				local8 = -local8;
			}
			if (local12 < 0) {
				local12 = -local12;
			}
			@Pc(58) boolean local58 = local8 > local12;
			@Pc(62) int local62;
			@Pc(64) int local64;
			if (local58) {
				local62 = arg4;
				local64 = arg0;
				arg4 = arg3;
				arg3 = local62;
				arg0 = arg1;
				arg1 = local64;
			}
			if (arg4 > arg0) {
				local62 = arg4;
				local64 = arg3;
				arg4 = arg0;
				arg3 = arg1;
				arg0 = local62;
				arg1 = local64;
			}
			local62 = arg3;
			local64 = arg0 - arg4;
			@Pc(99) int local99 = arg1 - arg3;
			@Pc(104) int local104 = -(local64 >> 1);
			if (local99 < 0) {
				local99 = -local99;
			}
			@Pc(127) int local127 = arg1 > arg3 ? 1 : -1;
			@Pc(131) int local131;
			if (local58) {
				for (local131 = arg4; local131 <= arg0; local131++) {
					local104 += local99;
					Static323.anIntArrayArray55[local131][local62] = arg2;
					if (local104 > 0) {
						local104 -= local64;
						local62 += local127;
					}
				}
			} else {
				for (local131 = arg4; local131 <= arg0; local131++) {
					Static323.anIntArrayArray55[local62][local131] = arg2;
					local104 += local99;
					if (local104 > 0) {
						local62 += local127;
						local104 -= local64;
					}
				}
			}
		}
	}
}
