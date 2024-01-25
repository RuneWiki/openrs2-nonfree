import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array10;

	@OriginalMember(owner = "client!kr", name = "L", descriptor = "Z")
	private static boolean aBoolean68;

	@OriginalMember(owner = "client!kr", name = "M", descriptor = "Z")
	private static boolean aBoolean69;

	@OriginalMember(owner = "client!kr", name = "N", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!kr", name = "O", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
	public static int anInt841 = 0;

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method734(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg1;
			return arg0 ? Static39.method683(local21) : local21;
		} else if (arg1 instanceof Class47) {
			@Pc(35) Class47 local35 = (Class47) arg1;
			return local35.method2571();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kr", name = "providesignlink", descriptor = "(Lclient!vj;)V")
	private static void method736(@OriginalArg(0) Class206 arg0) {
		Static308.aClass206_5 = arg0;
		Static292.aClass206_4 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(JB)V")
	public static void method743(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 + Static176.anInt3301;
		@Pc(16) int local16 = Static80.anInt5690 + Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339;
		if (Static304.anInt5743 - local11 < -500 || Static304.anInt5743 - local11 > 500 || Static219.anInt4043 - local16 < -500 || Static219.anInt4043 - local16 > 500) {
			Static219.anInt4043 = local16;
			Static304.anInt5743 = local11;
		}
		@Pc(53) int local53;
		@Pc(61) int local61;
		if (Static304.anInt5743 != local11) {
			local53 = local11 - Static304.anInt5743;
			local61 = (int) ((long) local53 * arg0 / 320L);
			if (local53 <= 0) {
				if (local61 == 0) {
					local61 = -1;
				} else if (local53 > local61) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = 1;
			} else if (local53 < local61) {
				local61 = local53;
			}
			Static304.anInt5743 += local61;
		}
		if (!Static317.aBoolean395) {
			Static163.aFloat69 += Static128.aFloat62 * (float) arg0 / 6.0F;
			Static117.aFloat58 += Static265.aFloat76 * (float) arg0 / 6.0F;
		}
		if (local16 != Static219.anInt4043) {
			local53 = local16 - Static219.anInt4043;
			local61 = (int) ((long) local53 * arg0 / 320L);
			if (local53 > 0) {
				if (local61 == 0) {
					local61 = 1;
				} else if (local61 > local53) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = -1;
			} else if (local61 < local53) {
				local61 = local53;
			}
			Static219.anInt4043 += local61;
		}
		Static194.method3614();
	}
}
