import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "J")
	public static long aLong338 = -1L;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIB)Z")
	public static boolean method8270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Static177.aBoolean501 || !Static183.aBoolean267) {
			return false;
		} else if (Static195.anInt7170 < 100) {
			return false;
		} else {
			@Pc(28) int local28 = Static90.anIntArrayArrayArray2[arg2][arg1][arg0];
			if (local28 == -Static257.anInt4776) {
				return false;
			} else if (Static257.anInt4776 == local28) {
				return true;
			} else if (Static639.aClass313Array2 == Static711.aClass313Array3) {
				return false;
			} else {
				@Pc(65) int local65 = arg1 << Static394.anInt7067;
				@Pc(69) int local69 = arg0 << Static394.anInt7067;
				if (Static264.method3689(local65 + Static495.anInt8508 - 1, Static639.aClass313Array2[arg2].method9095(arg0, arg1), Static495.anInt8508 + local69 - 1, local65 + 1, local69 + 1, local65 - -1, Static639.aClass313Array2[arg2].method9095(arg0 + 1, arg1 - -1), Static639.aClass313Array2[arg2].method9095(arg0 + 1, arg1), Static495.anInt8508 + local69 - 1) && Static264.method3689(Static495.anInt8508 + local65 - 1, Static639.aClass313Array2[arg2].method9095(arg0, arg1), local69 + 1, local65 + 1, local69 + 1, Static495.anInt8508 + local65 + -1, Static639.aClass313Array2[arg2].method9095(arg0, arg1 + 1), Static639.aClass313Array2[arg2].method9095(arg0 + 1, arg1 - -1), Static495.anInt8508 + local69 - 1)) {
					Static714.anInt11150++;
					Static90.anIntArrayArrayArray2[arg2][arg1][arg0] = Static257.anInt4776;
					return true;
				} else {
					Static90.anIntArrayArrayArray2[arg2][arg1][arg0] = -Static257.anInt4776;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BI)V")
	public static void method8272(@OriginalArg(1) int arg0) {
		if (Static255.method3996(arg0)) {
			Static58.method726(-1, Static403.aClass20ArrayArray2[arg0]);
		}
	}
}
