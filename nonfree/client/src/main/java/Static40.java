import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[Lclient!mj;")
	public static Class64[] aClass64Array1;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!oe;")
	public static Class72 aClass72_49;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
	public static boolean aBoolean26;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "J")
	public static long aLong27 = 0L;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt747 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
	public static int method550() {
		return 16;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z[B)V")
	public static void method551(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub23 local10 = new Class2_Sub23(arg0);
		@Pc(18) int local18 = local10.method2095();
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			@Pc(32) Class2_Sub27 local32 = new Class2_Sub27();
			@Pc(36) Class78 local36 = local10.method2115();
			local32.anInt4762 = local10.method2095();
			local32.anInt4761 = local10.method2095();
			local32.anInt4763 = local10.method2122();
			local32.aClass78_858 = local36.method3032();
			local32.aClass78Array38 = local36.method3023(47);
			Static81.aClass44_17.method1355(local32);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = local17 << 1;
		@Pc(37) int local37 = arg4 << 1;
		@Pc(41) int local41 = local13 << 2;
		@Pc(49) int local49 = local13 * (1 - local37) + local25;
		@Pc(53) int local53 = local17 << 2;
		@Pc(61) int local61 = local25 * 3;
		@Pc(70) int local70 = local17 - (local37 - 1) * local21;
		@Pc(76) int local76 = (arg4 - 1) * local41;
		@Pc(84) int local84 = ((arg4 << 1) - 3) * local21;
		@Pc(90) int local90 = local53;
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (Static73.anInt1576 <= arg2 && Static137.anInt3137 >= arg2) {
			local112 = Static80.method1342(arg0 + arg1, Static6.anInt187, Static101.anInt2213);
			local120 = Static80.method1342(arg1 - arg0, Static6.anInt187, Static101.anInt2213);
			Static221.method3893(arg3, local120, Static183.anIntArrayArray40[arg2], local112);
		}
		while (local9 > 0) {
			if (local49 < 0) {
				while (local49 < 0) {
					local70 += local90;
					local7++;
					local49 += local61;
					local90 += local53;
					local61 += local53;
				}
			}
			local9--;
			if (local70 < 0) {
				local70 += local90;
				local7++;
				local49 += local61;
				local90 += local53;
				local61 += local53;
			}
			local112 = arg2 - local9;
			local70 += -local84;
			local120 = arg2 + local9;
			local49 += -local76;
			local84 -= local41;
			local76 -= local41;
			if (local120 >= Static73.anInt1576 && Static137.anInt3137 >= local112) {
				@Pc(225) int local225 = Static80.method1342(local7 + arg1, Static6.anInt187, Static101.anInt2213);
				@Pc(233) int local233 = Static80.method1342(arg1 - local7, Static6.anInt187, Static101.anInt2213);
				if (Static73.anInt1576 <= local112) {
					Static221.method3893(arg3, local233, Static183.anIntArrayArray40[local112], local225);
				}
				if (local120 <= Static137.anInt3137) {
					Static221.method3893(arg3, local233, Static183.anIntArrayArray40[local120], local225);
				}
			}
		}
	}
}
