import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "[Lclient!uq;")
	public static Class9_Sub2[] aClass9_Sub2Array5;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt7626;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!wq;)V")
	public static void method6647(@OriginalArg(1) Class9_Sub2_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(14) Class3_Sub31 local14 = (Class3_Sub31) Static413.aClass216_52.method5457(); local14 != null; local14 = (Class3_Sub31) Static413.aClass216_52.method5458()) {
			if (local14.aClass9_Sub2_Sub1_Sub2_Sub2_1 == arg0) {
				if (local14.aClass3_Sub3_Sub5_3 != null) {
					Static304.aClass3_Sub3_Sub3_3.method2976(local14.aClass3_Sub3_Sub5_3);
					local14.aClass3_Sub3_Sub5_3 = null;
				}
				local14.method8682();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BII)V")
	public static void method6648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static169.anInt3281 != 0) {
			if (arg1 >= 0) {
				Static12.anIntArray26[arg1] = arg0;
			} else {
				for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
					Static12.anIntArray26[local20] = arg0;
				}
			}
		}
		Static466.aClass3_Sub3_Sub1_3.method163(arg0, arg1);
	}
}
