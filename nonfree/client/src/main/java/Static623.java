import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!qha;")
	public static final Class291 aClass291_43 = new Class291(64);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
	public static int method8763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static484.method7009(arg0 + 91923, arg1 - -45365, 4) + (Static484.method7009(arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (Static484.method7009(arg0, arg1, 1) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}
}
