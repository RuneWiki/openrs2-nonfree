import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "F")
	public static float aFloat73 = 0.0F;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
	public static int method4749() {
		return Static151.anInt3238;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZB)Z")
	public static boolean method4752(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static128.aClass89_3.method5441();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static128.aClass89_3.method5433();
		} else if (!Static128.aClass89_3.method5395()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static324.aBoolean451 = arg0;
			Static244.method4220(Static116.aClass21_4);
			return true;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method4753(@OriginalArg(0) Class180 arg0) {
		Static237.aClass180_59 = arg0;
	}
}
