import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lclient!gu;")
	public static Class131[] aClass131Array1;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public static int anInt7500;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "Lclient!la;")
	public static Class207 aClass207_88;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)V")
	public static void method6649(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static463.anInt7779; local16++) {
			@Pc(22) Rectangle local22 = Class4_Sub2_Sub3.aRectangleArray4[local16];
			if (local22.x + local22.width > arg3 && local22.x < arg0 + arg3 && local22.y + local22.height > arg1 && local22.y < arg1 + arg2) {
				Static27.aBooleanArray2[local16] = true;
			}
		}
		Static562.method5062(arg1, arg2 + arg1, arg3 - -arg0, arg3);
	}
}
