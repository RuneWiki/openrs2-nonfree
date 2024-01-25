import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Lclient!fh;")
	public static Class107 aClass107_2;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "[I")
	public static final int[] anIntArray224 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ff;I)I")
	public static int method3947(@OriginalArg(0) Class3_Sub1_Sub3_Sub3_Sub1 arg0) {
		@Pc(8) Class27 local8 = arg0.aClass27_1;
		if (local8.anIntArray43 != null) {
			local8 = local8.method727(Static286.aClass263_3);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt648;
		@Pc(32) Class311 local32 = arg0.method5200();
		if (arg0.anInt6064 == -1 || arg0.aBoolean450) {
			local23 = local8.anInt637;
		} else if (arg0.anInt6064 == local32.anInt9389 || local32.anInt9390 == arg0.anInt6064 || local32.anInt9414 == arg0.anInt6064 || arg0.anInt6064 == local32.anInt9385) {
			local23 = local8.anInt626;
		} else if (local32.anInt9406 == arg0.anInt6064 || arg0.anInt6064 == local32.anInt9394 || arg0.anInt6064 == local32.anInt9412 || local32.anInt9422 == arg0.anInt6064) {
			local23 = local8.anInt664;
		}
		return local23;
	}
}
