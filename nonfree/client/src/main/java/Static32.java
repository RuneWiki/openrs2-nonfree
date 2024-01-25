import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
	public static int anInt1035 = 1;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!oa;Lclient!fl;III)V")
	public static void method1006(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class224 local12;
		if (arg3 < Static396.anInt7505) {
			local12 = Static256.aClass224ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub5_2 != null && local12.aClass11_Sub5_2.method8105()) {
				arg1.method8103(true, 0, 0, Static364.anInt7313, local12.aClass11_Sub5_2, arg0);
			}
		}
		if (arg4 < Static396.anInt7505) {
			local12 = Static256.aClass224ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub5_2 != null && local12.aClass11_Sub5_2.method8105()) {
				arg1.method8103(true, 0, Static364.anInt7313, 0, local12.aClass11_Sub5_2, arg0);
			}
		}
		if (arg3 < Static396.anInt7505 && arg4 < Static54.anInt1441) {
			local12 = Static256.aClass224ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub5_2 != null && local12.aClass11_Sub5_2.method8105()) {
				arg1.method8103(true, 0, Static364.anInt7313, Static364.anInt7313, local12.aClass11_Sub5_2, arg0);
			}
		}
		if (arg3 < Static396.anInt7505 && arg4 > 0) {
			local12 = Static256.aClass224ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub5_2 != null && local12.aClass11_Sub5_2.method8105()) {
				arg1.method8103(true, 0, -Static364.anInt7313, Static364.anInt7313, local12.aClass11_Sub5_2, arg0);
			}
		}
	}
}
