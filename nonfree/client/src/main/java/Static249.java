import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	public static int anInt5201;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public static int anInt5198 = -2;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_30 = new Class198(16);

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "[B")
	public static final byte[] aByteArray77 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBI)I")
	public static int method4314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 << 13 ^ local17;
		@Pc(37) int local37 = Integer.MAX_VALUE & (local23 * local23 * 15731 + 789221) * local23 + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)V")
	public static void method4315(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 7);
		local8.method2034();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public static void method4320() {
		@Pc(8) int[] local8 = new int[Static94.anInt2090];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static94.anInt2090; local20++) {
			@Pc(28) Class142 local28 = Static247.method4270(local20);
			if (local28.anInt4486 >= 0 || local28.anInt4471 >= 0) {
				local8[local10++] = local20;
			}
		}
		Static292.anIntArray488 = new int[local10];
		for (@Pc(51) int local51 = 0; local51 < local10; local51++) {
			Static292.anIntArray488[local51] = local8[local51];
		}
	}
}
