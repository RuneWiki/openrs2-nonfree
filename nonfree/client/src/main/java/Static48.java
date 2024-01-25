import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public static int anInt748 = 0;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	public static int anInt751 = 0;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_14 = new Class253(34, -2);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
	public static void method617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static93.anInt4330 / (float) Static93.anInt4332;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg0 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg0 - local11) / 2;
		@Pc(48) int local48 = arg2 - (arg1 - local13) / 2;
		Static168.anInt3036 = -1;
		Static21.anInt321 = Static93.anInt4330 - Static93.anInt4330 * local48 / local13;
		Static203.anInt3590 = local40 * Static93.anInt4332 / local11;
		Static5.anInt16 = -1;
		Static430.method5562();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)I")
	public static int method618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return 7 - arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
