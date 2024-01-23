import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public static int anInt5622;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!km;")
	public static Class91 aClass91_206;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
	public static int anInt5620 = 0;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public static int anInt5621 = 0;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "[J")
	public static long[] aLongArray11 = new long[200];

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "F")
	public static float aFloat58 = 0.0F;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "[S")
	public static short[] aShortArray92 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)J")
	public static long method4460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass67_1 == null ? 0L : local7.aClass67_1.aLong97;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)[F")
	public static float[] method4462(@OriginalArg(0) int arg0) {
		@Pc(3) float local3 = Static28.method561() + Static28.method557();
		@Pc(5) int local5 = Static28.method562();
		@Pc(18) float local18 = (float) (local5 >> 8 & 0xFF) / 255.0F;
		Static278.aFloatArray28[3] = 1.0F;
		@Pc(31) float local31 = (float) (local5 >> 16 & 0xFF) / 255.0F;
		@Pc(33) float local33 = 0.58823526F;
		Static278.aFloatArray28[1] = local18 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local33 * local3;
		Static278.aFloatArray28[0] = local3 * local33 * (float) (arg0 >> 16 & 0xFF) / 255.0F * local31;
		@Pc(80) float local80 = (float) (local5 & 0xFF) / 255.0F;
		Static278.aFloatArray28[2] = local33 * local80 * ((float) (arg0 & 0xFF) / 255.0F) * local3;
		return Static278.aFloatArray28;
	}
}
