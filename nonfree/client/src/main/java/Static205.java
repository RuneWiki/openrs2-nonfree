import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public static int anInt4052;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt4048 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public static int anInt4050 = 0;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!nb;")
	public static Class111 aClass111_16 = new Class111(64);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!cg;III)Lclient!ta;")
	public static Class58_Sub2 method3272(@OriginalArg(0) Class22 arg0, @OriginalArg(3) int arg1) {
		return Static225.method3549(0, arg0, arg1) ? Static193.method3167() : null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[F")
	public static float[] method3273(@OriginalArg(0) int arg0) {
		@Pc(3) float local3 = Static290.method4520() + Static290.method4522();
		@Pc(9) float local9 = 0.58823526F;
		@Pc(11) int local11 = Static290.method4521();
		@Pc(26) float local26 = (float) (local11 >> 8 & 0xFF) / 255.0F;
		Static51.aFloatArray14[1] = local26 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local9 * local3;
		Static51.aFloatArray14[3] = 1.0F;
		@Pc(56) float local56 = (float) (local11 >> 16 & 0xFF) / 255.0F;
		@Pc(63) float local63 = (float) (local11 & 0xFF) / 255.0F;
		Static51.aFloatArray14[0] = local56 * ((float) (arg0 >> 16 & 0xFF) / 255.0F) * local9 * local3;
		Static51.aFloatArray14[2] = local3 * (float) (arg0 & 0xFF) / 255.0F * local63 * local9;
		return Static51.aFloatArray14;
	}
}
