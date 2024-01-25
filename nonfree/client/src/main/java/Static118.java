import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Z")
	public static boolean aBoolean132;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_46 = new Class253(68, 14);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
	public static void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass26_Sub4_2 != null) {
			local7.aClass26_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLclient!go;Z)V")
	public static void method1991(@OriginalArg(1) Class95 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.anInt2581 == 0 ? arg0.anInt2595 : arg0.anInt2581;
		@Pc(28) int local28 = arg0.anInt2645 == 0 ? arg0.anInt2638 : arg0.anInt2645;
		Static147.method2250(arg1, Static294.aClass95ArrayArray3[arg0.anInt2583 >> 16], local16, arg0.anInt2583, local28);
		if (arg0.aClass95Array1 != null) {
			Static147.method2250(arg1, arg0.aClass95Array1, local16, arg0.anInt2583, local28);
		}
		@Pc(61) Class7_Sub44 local61 = (Class7_Sub44) Static23.aClass164_3.method3512((long) arg0.anInt2583);
		if (local61 != null) {
			Static109.method1891(local28, arg1, local61.anInt7165, local16);
		}
	}
}
