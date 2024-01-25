import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
	public static int anInt781;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_29 = new Class186(17, 2);

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "[I")
	public static final int[] anIntArray66 = new int[14];

	@OriginalMember(owner = "client!bk", name = "U", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!bk", name = "V", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[128][128];

	@OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
	public static int anInt796 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	public static void method628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass6_Sub4_1 != null) {
			local7.aClass6_Sub4_1 = null;
		}
	}
}
