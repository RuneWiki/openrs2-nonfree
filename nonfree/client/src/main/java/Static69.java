import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_25 = new Class215(27, 3);

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
	public static final int anInt2215 = 2;

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
	public static int anInt2216 = 0;

	@OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
	public static final int anInt2217 = 1403;

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V")
	public static void method2111() {
		Static138.method3104();
		Static541.anInt9723 = 0;
		Static106.aClass215_42 = null;
		Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
		Static525.aClass215_85 = null;
		Static527.aClass215_250 = null;
		Static85.anInt2575 = 0;
		Static138.aClass215_57 = null;
		Static612.anInt10717 = 0;
		Static165.method3570();
		Static146.method3246();
		for (@Pc(34) int local34 = 0; local34 < 2048; local34++) {
			Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local34] = null;
		}
		Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 = null;
		for (@Pc(48) int local48 = 0; local48 < Static474.anInt8881; local48++) {
			@Pc(55) Class3_Sub1_Sub3_Sub3_Sub1 local55 = Static62.aClass2_Sub33Array1[local48].aClass3_Sub1_Sub3_Sub3_Sub1_2;
			if (local55 != null) {
				local55.anInt6070 = -1;
			}
		}
		Static152.method3430();
		Static442.anInt8212 = -1;
		Static194.anInt4508 = -1;
		Static496.anInt9165 = 1;
		Static66.method8375(10);
		for (@Pc(83) int local83 = 0; local83 < 100; local83++) {
			Static403.aBooleanArray18[local83] = true;
		}
		Static101.method2659();
		Static282.aClass2_Sub36_1 = null;
		Static200.aLong99 = 0L;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IBI)Z")
	public static boolean method2113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
