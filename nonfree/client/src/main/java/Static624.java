import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_255 = new Class215(44, 6);

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Z")
	public static boolean aBoolean742 = false;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)I")
	public static int method9084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg1;
		@Pc(31) int local31 = ((arg2 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg2 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
		return local31 + ((local13 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local13 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIIBIIIII)Z")
	public static boolean method9086(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0];
		@Pc(13) int local13 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0];
		if (local8 < 0 || Static47.anInt1794 <= local8 || local13 < 0 || local13 >= Static209.anInt4742) {
			return false;
		} else if (arg1 >= 0 && arg1 < Static47.anInt1794 && arg2 >= 0 && arg2 < Static209.anInt4742) {
			@Pc(80) int local80 = Static621.method9058(arg1, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214(), arg3, Static391.anIntArray480, arg0, arg6, local8, local13, Static96.anIntArray133, arg2, Static55.aClass104Array3[Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132], arg5, arg4, arg7);
			if (local80 < 1) {
				return false;
			}
			Static542.anInt9759 = Static96.anIntArray133[local80 - 1];
			Static339.anInt6841 = Static391.anIntArray480[local80 - 1];
			Static236.aBoolean376 = false;
			Static451.method7098();
			return true;
		} else {
			return false;
		}
	}
}
