import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public static int anInt5499;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!ud;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[S")
	public static short[] aShortArray115 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int anInt5498 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)V")
	public static void method4481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * Static24.anInt344 >> 8;
		if (arg1 == -1 && !Static153.aBoolean210) {
			Static307.method4755();
		} else if (arg1 != -1 && (Static254.anInt4845 != arg1 || !Static88.method1550()) && local16 != 0 && !Static153.aBoolean210) {
			Static168.method2705(Static278.aClass58_98, local16, arg1);
		}
		Static254.anInt4845 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([BI)[B")
	public static byte[] method4482(@OriginalArg(0) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static316.method80(arg0, 0, local17, 0, local14);
		return local17;
	}
}
