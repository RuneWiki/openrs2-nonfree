import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	public static int anInt2524;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt2525;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!g;")
	public static Class83 aClass83_52;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_63 = new Class208(31, 3);

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_81 = new Class62("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)V")
	public static void method2038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(15) int local15 = arg0 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static342.method5480(arg4, arg3, arg1, arg2);
			}
		} else if (local10 == 0) {
			Static240.method4257(arg0, arg3, arg2, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(62) boolean local62 = local10 > local15;
			@Pc(66) int local66;
			@Pc(70) int local70;
			if (local62) {
				local66 = arg3;
				arg3 = arg4;
				local70 = arg0;
				arg0 = arg1;
				arg4 = local66;
				arg1 = local70;
			}
			if (arg0 < arg3) {
				local66 = arg3;
				local70 = arg4;
				arg3 = arg0;
				arg4 = arg1;
				arg0 = local66;
				arg1 = local70;
			}
			local66 = arg4;
			local70 = arg0 - arg3;
			@Pc(103) int local103 = arg1 - arg4;
			@Pc(108) int local108 = -(local70 >> 1);
			if (local103 < 0) {
				local103 = -local103;
			}
			@Pc(120) int local120 = arg1 > arg4 ? 1 : -1;
			@Pc(124) int local124;
			if (local62) {
				for (local124 = arg3; local124 <= arg0; local124++) {
					Static152.anIntArrayArray30[local124][local66] = arg2;
					local108 += local103;
					if (local108 > 0) {
						local66 += local120;
						local108 -= local70;
					}
				}
			} else {
				for (local124 = arg3; local124 <= arg0; local124++) {
					Static152.anIntArrayArray30[local66][local124] = arg2;
					local108 += local103;
					if (local108 > 0) {
						local66 += local120;
						local108 -= local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBIII)V")
	public static void method2043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
		Static76.aClass2_Sub24_Sub2_7.method5746(Static290.aClass15_6.anInt268);
		Static76.aClass2_Sub24_Sub2_7.method5746(arg3);
		Static76.aClass2_Sub24_Sub2_7.method5746(arg2);
		Static76.aClass2_Sub24_Sub2_7.method5721(arg0);
		Static76.aClass2_Sub24_Sub2_7.method5721(arg1);
		Static35.anInt619 = 1;
		Static70.anInt1555 = -3;
		Static178.anInt3760 = 0;
		Static179.anInt3762 = 0;
	}
}
