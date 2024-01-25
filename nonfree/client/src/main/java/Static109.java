import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
	public static final int[] anIntArray196 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public static final int anInt2180 = 1339;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public static int anInt2181 = -1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ig;I)I")
	public static int method1900(@OriginalArg(0) Class24_Sub3_Sub2_Sub1 arg0) {
		@Pc(8) Class222 local8 = arg0.aClass222_1;
		if (local8.anIntArray613 != null) {
			local8 = local8.method4938(Static329.aClass201_9);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt6347;
		@Pc(27) Class6 local27 = arg0.method4923();
		if (arg0.aBoolean403) {
			local23 = local8.anInt6346;
		} else if (local27.anInt77 == arg0.anInt6238 || local27.anInt65 == arg0.anInt6238 || arg0.anInt6238 == local27.anInt41 || arg0.anInt6238 == local27.anInt70) {
			local23 = local8.anInt6334;
		} else if (arg0.anInt6238 == local27.anInt74 || arg0.anInt6238 == local27.anInt54 || local27.anInt58 == arg0.anInt6238 || arg0.anInt6238 == local27.anInt38) {
			local23 = local8.anInt6341;
		}
		return local23;
	}
}
