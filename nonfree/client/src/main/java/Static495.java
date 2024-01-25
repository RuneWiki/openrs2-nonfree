import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!faa;")
	public static Class97 aClass97_25 = null;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)Lclient!faa;")
	public static Class97 method7281(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static360.aClass97ArrayArray2[local7] == null || Static360.aClass97ArrayArray2[local7][local11] == null) {
			@Pc(25) boolean local25 = Static76.method1083(local7);
			if (!local25) {
				return null;
			}
		}
		return Static360.aClass97ArrayArray2[local7][local11];
	}
}
