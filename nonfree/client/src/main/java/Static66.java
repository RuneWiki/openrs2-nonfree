import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public static int anInt1299;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!ph;")
	public static Class138 aClass138_17;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "I")
	public static int anInt1303;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	public static int anInt1306;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public static int anInt1302 = -1;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString39 = " has logged in.";

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!gj;I)V")
	public static void method1110(@OriginalArg(0) Class22_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt4600 - Static37.anInt757;
		@Pc(30) int local30 = arg0.anInt4629 * 128 + arg0.method3660() * 64;
		@Pc(41) int local41 = arg0.anInt4565 * 128 + arg0.method3660() * 64;
		arg0.anInt4601 += (local30 - arg0.anInt4601) / local9;
		arg0.anInt4618 = 0;
		if (arg0.anInt4621 == 0) {
			arg0.anInt4561 = 1024;
		}
		if (arg0.anInt4621 == 1) {
			arg0.anInt4561 = 1536;
		}
		if (arg0.anInt4621 == 2) {
			arg0.anInt4561 = 0;
		}
		if (arg0.anInt4621 == 3) {
			arg0.anInt4561 = 512;
		}
		arg0.anInt4623 += (local41 - arg0.anInt4623) / local9;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static void method1111() {
		Static197.aClass169_109.method4020(5);
		Static79.aClass169_54.method4020(5);
		Static292.aClass169_153.method4020(5);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!qf;)V")
	public static void method1112(@OriginalArg(1) Class146 arg0) {
		@Pc(9) Class146 local9 = Static287.method4257(arg0);
		@Pc(13) int local13;
		@Pc(15) int local15;
		if (local9 == null) {
			local13 = Static159.anInt3348;
			local15 = Static136.anInt2696;
		} else {
			local13 = local9.anInt4345;
			local15 = local9.anInt4371;
		}
		Static310.method1128(local15, false, local13, arg0);
		Static127.method2019(local13, arg0, local15);
	}
}
