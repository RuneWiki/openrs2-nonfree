import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "[I")
	public static final int[] anIntArray428 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
	public static void method4911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class6_Sub31 local6 = Static313.method4898();
		local6.aClass6_Sub21_Sub2_2.method6062(Static530.aClass46_7.anInt1234);
		local6.aClass6_Sub21_Sub2_2.method6062(arg0);
		local6.aClass6_Sub21_Sub2_2.method6062(arg3);
		local6.aClass6_Sub21_Sub2_2.method6052(arg2);
		local6.aClass6_Sub21_Sub2_2.method6052(arg1);
		Static534.method7251(local6);
		Static238.anInt7765 = 0;
		Static119.anInt2844 = -3;
		Static573.anInt9416 = 1;
		Static309.anInt5671 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4912(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static411.method7688(Static568.method7610(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)I")
	public static int method4913() {
		@Pc(9) int local9 = Static164.aClass178_1.method4392();
		if (local9 < Static333.aClass178Array1.length - 1) {
			Static164.aClass178_1 = Static333.aClass178Array1[local9 + 1];
		}
		return 100;
	}
}
