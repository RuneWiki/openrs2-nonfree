import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "[Lclient!mu;")
	public static Class192[] aClass192Array2;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!oda;")
	public static Class1_Sub2_Sub12 aClass1_Sub2_Sub12_1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
	public static final int[] anIntArray339 = new int[1024];

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_64 = new Class45("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[I")
	public static int[] anIntArray340 = new int[2];

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public static int anInt4325 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)Z")
	public static boolean method4019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static29.method807(arg1, arg0) || Static420.method6572(arg1, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
	public static void method4020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static335.anInt4938 / (float) Static335.anInt4943;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg0 - local13) / 2;
		@Pc(49) int local49 = arg2 - (arg1 - local11) / 2;
		Static32.anInt1050 = Static335.anInt4938 - Static335.anInt4938 * local40 / local13;
		Static162.anInt3142 = -1;
		Static313.anInt5997 = -1;
		Static64.anInt1610 = local49 * Static335.anInt4943 / local11;
		Static222.method4035();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZZ)V")
	public static void method4021(@OriginalArg(0) boolean arg0) {
		Static100.method2038(Static508.anInt8910, Static70.anInt1753, arg0, Static328.anInt6167);
	}
}
