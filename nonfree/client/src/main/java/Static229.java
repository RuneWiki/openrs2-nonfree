import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "J")
	public static final long aLong107 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "Lclient!bb;")
	public static final Class1_Sub10 aClass1_Sub10_2 = new Class1_Sub10(0, -1);

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
	public static int anInt4281 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[Lclient!in;IZII)V")
	public static void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) Class160[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class160 local9 = arg1[local3];
			if (local9 != null && arg4 == local9.anInt4224) {
				Static297.method4409(arg2, local9, arg3, arg0);
				Static80.method1330(arg0, local9, arg2);
				if (local9.anInt4211 > local9.anInt4184 - local9.anInt4182) {
					local9.anInt4211 = local9.anInt4184 - local9.anInt4182;
				}
				if (local9.anInt4211 < 0) {
					local9.anInt4211 = 0;
				}
				if (local9.anInt4198 - local9.anInt4156 < local9.anInt4218) {
					local9.anInt4218 = local9.anInt4198 - local9.anInt4156;
				}
				if (local9.anInt4218 < 0) {
					local9.anInt4218 = 0;
				}
				if (local9.anInt4166 == 0) {
					Static361.method5313(local9, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	public static void method3415() {
		Static79.aClass207_5.method4397(50);
		Static301.aClass207_29.method4397(50);
		Static201.aClass207_21.method4397(50);
		Static593.aClass207_62.method4397(50);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIII)V")
	public static void method3417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static503.method7066(arg3, arg2, arg0, arg1);
			}
		} else if (local10 == 0) {
			Static92.method1403(arg4, arg1, arg2, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(68) boolean local68 = local15 < local10;
			@Pc(72) int local72;
			@Pc(76) int local76;
			if (local68) {
				local72 = arg1;
				arg1 = arg2;
				local76 = arg4;
				arg2 = local72;
				arg4 = arg0;
				arg0 = local76;
			}
			if (arg4 < arg1) {
				local72 = arg1;
				arg1 = arg4;
				local76 = arg2;
				arg4 = local72;
				arg2 = arg0;
				arg0 = local76;
			}
			local72 = arg2;
			local76 = arg4 - arg1;
			@Pc(108) int local108 = arg0 - arg2;
			@Pc(113) int local113 = -(local76 >> 1);
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(132) int local132 = arg2 >= arg0 ? -1 : 1;
			@Pc(136) int local136;
			if (local68) {
				for (local136 = arg1; local136 <= arg4; local136++) {
					Static280.anIntArrayArray25[local136][local72] = arg3;
					local113 += local108;
					if (local113 > 0) {
						local72 += local132;
						local113 -= local76;
					}
				}
			} else {
				for (local136 = arg1; local136 <= arg4; local136++) {
					Static280.anIntArrayArray25[local72][local136] = arg3;
					local113 += local108;
					if (local113 > 0) {
						local72 += local132;
						local113 -= local76;
					}
				}
			}
		}
	}
}
