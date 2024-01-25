import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "Lclient!mi;")
	public static Class155_Sub1 aClass155_Sub1_2;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_11 = new Class266();

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
	public static void method1065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static7.anInt2570 / (float) Static7.anInt2568;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg0 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(39) int local39 = arg3 - (arg1 - local13) / 2;
		@Pc(48) int local48 = arg2 - (arg0 - local11) / 2;
		Static46.anInt865 = Static7.anInt2568 * local48 / local11;
		Static21.anInt465 = -1;
		Static55.anInt1147 = -1;
		Static151.anInt2577 = Static7.anInt2570 - local39 * Static7.anInt2570 / local13;
		Static144.method2162();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBI)I")
	public static int method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}
}
