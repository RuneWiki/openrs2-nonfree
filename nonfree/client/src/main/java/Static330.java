import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lca", name = "B", descriptor = "I")
	public static final int anInt6092 = -1;

	@OriginalMember(owner = "client!lca", name = "I", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_84 = new Class376(66, 3);

	@OriginalMember(owner = "client!lca", name = "J", descriptor = "I")
	public static int anInt6097 = 0;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIII)V")
	public static void method5106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(24) Class247 local24 = Static332.aClass247ArrayArrayArray1[arg3][arg2][arg1];
			if (local24 != null) {
				if (arg0 == 1) {
					local24.aShort83 = 0;
				} else if (arg0 == 2) {
					local24.aShort80 = 0;
				}
			}
			Static200.method3158();
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < Static22.anInt704; local49++) {
			@Pc(55) Class167 local55 = Static67.aClass167Array15[local49];
			if (local55.aByte64 == arg0 && local55.aShort63 == arg2 && arg1 == local55.aShort61 || local55.aShort64 == arg2 && arg1 == local55.aShort61) {
				if (Static22.anInt704 != local49) {
					Static689.method8053(Static67.aClass167Array15, local49 + 1, Static67.aClass167Array15, local49, Static67.aClass167Array15.length - local49 - 1);
				}
				Static22.anInt704--;
				return;
			}
		}
	}
}
