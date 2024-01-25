import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "[I")
	public static final int[] anIntArray120 = new int[14];

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "S")
	public static short aShort28 = 256;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
	public static final int[] anIntArray121 = new int[3];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;ZLclient!bk;)I")
	public static int method1921(@OriginalArg(0) String arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		@Pc(6) int local6 = arg1.anInt2029;
		@Pc(10) byte[] local10 = Static183.method3395(arg0);
		arg1.method1858(local10.length);
		arg1.anInt2029 += Static105.aClass110_1.method2998(local10.length, 0, arg1.anInt2029, arg1.aByteArray18, local10);
		return arg1.anInt2029 - local6;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!en;)V")
	public static void method1923(@OriginalArg(1) Class59 arg0) {
		if (Static171.aBoolean254) {
			Static253.method4415(arg0);
		} else {
			Static311.method5708(arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)I")
	public static int method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(22) int local22 = arg1 / arg2;
		@Pc(28) int local28 = arg2 - 1 & arg1;
		@Pc(33) int local33 = Static22.method567(local22, local7);
		@Pc(40) int local40 = Static22.method567(local22, local7 + 1);
		@Pc(47) int local47 = Static22.method567(local22 + 1, local7);
		@Pc(58) int local58 = Static22.method567(local22 + 1, local7 + 1);
		@Pc(65) int local65 = Static219.method3850(local33, local40, arg2, local13);
		@Pc(72) int local72 = Static219.method3850(local47, local58, arg2, local13);
		return Static219.method3850(local65, local72, arg2, local28);
	}
}
