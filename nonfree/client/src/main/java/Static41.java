import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[Lclient!kha;")
	public static Class189[] aClass189Array1;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_14 = new Class180(21, 3);

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
	public static int anInt961 = -1;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_3 = new Class336(12, 3);

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)Z")
	public static boolean method1053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
	public static void method1054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static329.anInt5472; local7++) {
			@Pc(18) Rectangle local18 = Class21.aRectangleArray9[local7];
			if (local18.width + local18.x > arg3 && arg1 + arg3 > local18.x && arg2 < local18.height + local18.y && arg2 + arg0 > local18.y) {
				Static454.aBooleanArray31[local7] = true;
			}
		}
		Static642.method8919(arg3 + arg1, arg2 - -arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method1056(@OriginalArg(1) int arg0) {
		Static412.method5881();
		@Pc(11) int local11 = Static411.aClass70_1.method1705(arg0).anInt2781;
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static131.aClass66_1.anIntArray143[arg0];
		if (local11 == 6) {
			Static42.anInt973 = local22;
		}
		if (local11 == 5) {
			Static229.anInt4277 = local22;
		}
	}
}
