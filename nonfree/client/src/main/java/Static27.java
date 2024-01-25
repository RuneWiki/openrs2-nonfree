import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_1 = new Class117(5, 5);

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString7 = "";

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_21 = new Class133(90, 10);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Z")
	public static boolean method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qb;II)V")
	public static void method795(@OriginalArg(0) Class6_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt8555 > Static223.anInt4829) {
			Static444.method6748(arg0);
		} else if (arg0.anInt8589 < Static223.anInt4829) {
			Static90.method1817(false, arg0);
			local9 = Static463.anInt8327;
			local7 = Static57.anInt1228;
		} else {
			Static266.method4661(arg0);
		}
		if (arg0.anInt8811 < 512 || arg0.anInt8813 < 512 || Static118.anInt2527 * 512 - 512 <= arg0.anInt8811 || Static549.anInt9482 * 512 - 512 <= arg0.anInt8813) {
			arg0.anInt8526 = -1;
			local7 = -1;
			arg0.anInt8555 = 0;
			arg0.anInt8565 = -1;
			arg0.anInt8589 = 0;
			arg0.anInt8592 = -1;
			local9 = 0;
			arg0.anInt8811 = arg0.anIntArray733[0] * 512 + arg0.method7083() * 256;
			arg0.anInt8813 = arg0.anIntArray734[0] * 512 + arg0.method7083() * 256;
			arg0.method7077();
		}
		if (Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0 && (arg0.anInt8811 < 6144 || arg0.anInt8813 < 6144 || (Static118.anInt2527 - 12) * 512 <= arg0.anInt8811 || arg0.anInt8813 >= Static549.anInt9482 * 512 - 6144)) {
			arg0.anInt8565 = -1;
			arg0.anInt8555 = 0;
			arg0.anInt8526 = -1;
			arg0.anInt8592 = -1;
			arg0.anInt8589 = 0;
			local9 = 0;
			local7 = -1;
			arg0.anInt8811 = arg0.anIntArray733[0] * 512 + arg0.method7083() * 256;
			arg0.anInt8813 = arg0.anIntArray734[0] * 512 + arg0.method7083() * 256;
			arg0.method7077();
		}
		@Pc(209) int local209 = Static122.method2337(arg0);
		Static289.method4899(local9, local209, local7, arg0);
		Static187.method3527(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qf;B)Ljava/lang/String;")
	public static String method796(@OriginalArg(0) Class245 arg0) {
		if (Static63.method1295(arg0).method1751() == 0) {
			return null;
		} else if (arg0.aString57 == null || arg0.aString57.trim().length() == 0) {
			return Static362.aBoolean430 ? "Hidden-use" : null;
		} else {
			return arg0.aString57;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I")
	public static int method797(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(32) int local32 = local26 | local26 >>> 4;
		@Pc(38) int local38 = local32 | local32 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return arg0 & ~local44;
	}
}
