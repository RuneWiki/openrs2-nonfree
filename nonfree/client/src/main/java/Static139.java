import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
	public static int anInt3271;

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(FFFIILclient!mba;FIIFI)[B")
	public static byte[] method2953(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(5) Class104 arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static296.method4976(arg3, arg0, 0, arg2, arg1, arg5, local10, arg4);
		return local10;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!vp;B)V")
	public static void method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class309 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray11 != null) {
			@Pc(18) Class1_Sub40 local18 = new Class1_Sub40();
			local18.aClass309_10 = arg2;
			local18.anObjectArray5 = arg2.anObjectArray11;
			Static387.method5838(local18);
		}
		Static113.anInt2794 = arg0;
		Static368.anInt6563 = arg2.anInt8735;
		Static276.anInt5433 = arg1;
		Static423.anInt8970 = arg2.anInt8726;
		Static444.anInt7508 = arg2.anInt8753;
		Static151.anInt3437 = arg2.anInt8797;
		Static323.anInt6116 = arg2.anInt8750;
		Static382.aBoolean440 = true;
		Static291.method4908(arg2);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
	public static void method2955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(15) int local15 = arg4 - arg2;
		if (local15 == 0) {
			if (local10 != 0) {
				Static36.method1331(arg1, arg0, arg2, arg3);
			}
		} else if (local10 == 0) {
			Static425.method6301(arg4, arg2, arg3, arg0);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(68) boolean local68 = local15 < local10;
			@Pc(72) int local72;
			@Pc(74) int local74;
			if (local68) {
				local72 = arg2;
				local74 = arg4;
				arg2 = arg0;
				arg4 = arg1;
				arg0 = local72;
				arg1 = local74;
			}
			if (arg4 < arg2) {
				local72 = arg2;
				arg2 = arg4;
				local74 = arg0;
				arg0 = arg1;
				arg4 = local72;
				arg1 = local74;
			}
			local72 = arg0;
			local74 = arg4 - arg2;
			@Pc(123) int local123 = arg1 - arg0;
			@Pc(128) int local128 = -(local74 >> 1);
			if (local123 < 0) {
				local123 = -local123;
			}
			@Pc(140) int local140 = arg0 >= arg1 ? -1 : 1;
			@Pc(144) int local144;
			if (local68) {
				for (local144 = arg2; local144 <= arg4; local144++) {
					local128 += local123;
					Static81.anIntArrayArray25[local144][local72] = arg3;
					if (local128 > 0) {
						local72 += local140;
						local128 -= local74;
					}
				}
			} else {
				for (local144 = arg2; local144 <= arg4; local144++) {
					Static81.anIntArrayArray25[local72][local144] = arg3;
					local128 += local123;
					if (local128 > 0) {
						local72 += local140;
						local128 -= local74;
					}
				}
			}
		}
	}
}
