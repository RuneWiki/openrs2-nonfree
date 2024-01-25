import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tv", name = "M", descriptor = "I")
	public static int anInt9628;

	@OriginalMember(owner = "client!tv", name = "Y", descriptor = "[Lclient!lr;")
	public static Class9_Sub4_Sub2[] aClass9_Sub4_Sub2Array1;

	@OriginalMember(owner = "client!tv", name = "R", descriptor = "Lclient!ue;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!tv", name = "U", descriptor = "Z")
	public static boolean aBoolean765 = true;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15;
		if (Static156.method3070(arg3)) {
			local15 = 0;
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(51) int local51 = 0;
			if (Static238.aBoolean425) {
				local39 = Static230.anInt5095;
				local51 = Static78.anInt2674;
				local41 = Static153.anInt3558;
				local15 = Static596.anInt10144;
				local37 = Static568.anInt2489;
				Static78.anInt2674 = 1;
			}
			if (Static250.aClass302ArrayArray1[arg3] == null) {
				Static395.method6254(-1, arg5, arg7, arg2, arg1, Static299.aClass302ArrayArray2[arg3], arg6, arg0, arg1 < 0, arg4);
			} else {
				Static395.method6254(-1, arg5, arg7, arg2, arg1, Static250.aClass302ArrayArray1[arg3], arg6, arg0, arg1 < 0, arg4);
			}
			if (Static238.aBoolean425) {
				if (arg1 >= 0 && Static78.anInt2674 == 2) {
					Static215.method3836(Static153.anInt3558, Static568.anInt2489, Static596.anInt10144, Static230.anInt5095);
				}
				Static78.anInt2674 = local51;
				Static568.anInt2489 = local37;
				Static153.anInt3558 = local41;
				Static596.anInt10144 = local15;
				Static230.anInt5095 = local39;
			}
		} else if (arg1 == -1) {
			for (local15 = 0; local15 < 100; local15++) {
				Static366.aBooleanArray16[local15] = true;
			}
		} else {
			Static366.aBooleanArray16[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)Z")
	public static boolean method7884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!jga;ZI)V")
	public static void method7886(@OriginalArg(0) Class6_Sub4_Sub2 arg0) {
		Static282.aClass114_2.method4225(arg0);
		Static366.method5886(Static312.aClass223_66, arg0, Static282.aClass114_2, Static360.aClass223_74, Static168.aClass223_47);
	}
}
