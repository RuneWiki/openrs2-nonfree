import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt7798;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "Lclient!r;")
	public static Class43 aClass43_12;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!pl;)V")
	public static void method6576(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
			@Pc(31) Class9_Sub1_Sub1_Sub2_Sub1 local31 = (Class9_Sub1_Sub1_Sub2_Sub1) arg0;
			if (local31.aClass294_1 != null) {
				Static585.method7727(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 != local31.aByte126, local31);
			}
		} else if (arg0 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
			@Pc(11) Class9_Sub1_Sub1_Sub2_Sub2 local11 = (Class9_Sub1_Sub1_Sub2_Sub2) arg0;
			Static78.method2719(local11, local11.aByte126 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIBII)V")
	public static void method6578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static591.anInt9382; local11++) {
			@Pc(17) Rectangle local17 = Class55_Sub2_Sub1.aRectangleArray1[local11];
			if (arg1 < local17.x + local17.width && local17.x < arg2 + arg1 && local17.y + local17.height > arg3 && arg3 + arg0 > local17.y) {
				Static253.aBooleanArray17[local11] = true;
			}
		}
	}
}
