import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public static int anInt4613 = 0;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30 = new String[1000];

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "[I")
	public static int[] anIntArray374 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
	public static int anInt4619 = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!cg;ILclient!ti;Lclient!cg;Z)V")
	public static void method3613(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class4_Sub2_Sub9_Sub2 arg1, @OriginalArg(3) Class22 arg2) {
		Static113.aClass22_38 = arg2;
		Static191.aClass22_66 = arg0;
		Static178.aBoolean233 = true;
		@Pc(20) int local20 = Static191.aClass22_66.method677() - 1;
		Static94.anInt1868 = local20 * 256 + Static191.aClass22_66.method679(local20);
		Static177.aStringArray23 = new String[] { null, null, Static103.aString78, null, null };
		Static153.aClass4_Sub2_Sub9_Sub2_2 = arg1;
		Static91.aStringArray10 = new String[] { null, null, null, null, Static97.aString152 };
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(23) int local23 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg1);
		@Pc(29) int local29 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg6);
		@Pc(35) int local35 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg4);
		@Pc(41) int local41 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2);
		@Pc(49) int local49 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg3 + arg1);
		@Pc(58) int local58 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg6 - arg3);
		@Pc(60) int local60;
		for (local60 = local23; local60 < local49; local60++) {
			Static190.method3151(local41, Static253.anIntArrayArray34[local60], arg5, local35);
		}
		for (local60 = local29; local60 > local58; local60--) {
			Static190.method3151(local41, Static253.anIntArrayArray34[local60], arg5, local35);
		}
		@Pc(102) int local102 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg4 + arg3);
		@Pc(110) int local110 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2 - arg3);
		for (local60 = local49; local60 <= local58; local60++) {
			@Pc(119) int[] local119 = Static253.anIntArrayArray34[local60];
			Static190.method3151(local102, local119, arg5, local35);
			Static190.method3151(local110, local119, arg0, local102);
			Static190.method3151(local41, local119, arg5, local110);
		}
	}
}
