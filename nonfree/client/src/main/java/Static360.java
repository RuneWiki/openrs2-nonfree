import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "[Lclient!sf;")
	public static final Class24_Sub3_Sub2_Sub2[] aClass24_Sub3_Sub2_Sub2Array1 = new Class24_Sub3_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!rv", name = "O", descriptor = "I")
	public static int anInt6115 = 0;

	@OriginalMember(owner = "client!rv", name = "yb", descriptor = "I")
	public static int anInt6139 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBII)I")
	public static int method4841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg0 < arg2) {
			return arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(B)[Lclient!ru;")
	public static Class216[] method4850() {
		return new Class216[] { Static53.aClass216_1, Static53.aClass216_2, Static53.aClass216_3, Static53.aClass216_4, Static53.aClass216_5, Static53.aClass216_6, Static53.aClass216_7, Static53.aClass216_8, Static53.aClass216_9, Static53.aClass216_10, Static53.aClass216_11, Static53.aClass216_12 };
	}
}
