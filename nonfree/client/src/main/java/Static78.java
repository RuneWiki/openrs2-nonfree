import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!daa", name = "x", descriptor = "Lclient!jca;")
	public static Class76 aClass76_4;

	@OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
	public static int anInt1534;

	@OriginalMember(owner = "client!daa", name = "O", descriptor = "J")
	public static long aLong46;

	@OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
	public static int anInt1530 = -1;

	@OriginalMember(owner = "client!daa", name = "M", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!jt;")
	public static Class97 method1321(@OriginalArg(1) Component arg0) {
		return new Class97_Sub1(arg0);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZIIIIII)V")
	public static void method1327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg2);
		@Pc(17) int local17 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg6);
		@Pc(23) int local23 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1);
		@Pc(29) int local29 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg5);
		@Pc(37) int local37 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg0 + arg2);
		@Pc(46) int local46 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg6 - arg0);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static329.method4871(local23, local29, Static280.anIntArrayArray25[local48], arg3);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static329.method4871(local23, local29, Static280.anIntArrayArray25[local68], arg3);
		}
		@Pc(90) int local90 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 + arg0);
		@Pc(104) int local104 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg5 - arg0);
		for (@Pc(106) int local106 = local37; local106 <= local46; local106++) {
			@Pc(112) int[] local112 = Static280.anIntArrayArray25[local106];
			Static329.method4871(local23, local90, local112, arg3);
			Static329.method4871(local90, local104, local112, arg4);
			Static329.method4871(local104, local29, local112, arg3);
		}
	}
}
