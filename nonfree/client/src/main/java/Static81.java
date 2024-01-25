import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
	public static boolean aBoolean91;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
	public static int anInt1498;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	public static int anInt1499;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Z")
	public static boolean aBoolean92 = true;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1211(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local8 + local10);
		for (@Pc(44) int local44 = 0; local44 < local8; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local42.append("<lt>");
			} else if (local50 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local50);
			}
		}
		return local42.toString();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lclient!sg;)V")
	public static void method1213(@OriginalArg(1) Class97[] arg0) {
		Static111.anInt2055 = arg0.length;
		Static229.anIntArray350 = new int[Static111.anInt2055 + 10];
		Static209.aClass97Array16 = new Class97[Static111.anInt2055 + 10];
		Static363.method1667(arg0, 0, Static209.aClass97Array16, 0, Static111.anInt2055);
		for (@Pc(30) int local30 = 0; local30 < Static111.anInt2055; local30++) {
			Static229.anIntArray350[local30] = Static209.aClass97Array16[local30].method5557();
		}
		for (@Pc(45) int local45 = Static111.anInt2055; local45 < Static209.aClass97Array16.length; local45++) {
			Static229.anIntArray350[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIIIZ)Z")
	public static boolean method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(24) int local24 = Static215.method3876(arg9, Static270.anIntArray417, Static156.aClass67_Sub3_Sub3_Sub2_2.method4368(), Static41.anIntArray59, arg2, arg0, arg5, arg8, arg1, arg4, arg3, arg7, arg6, Static211.aClass92Array1[Static322.anInt6250]);
		if (local24 < 1) {
			return false;
		}
		Static132.anInt2474 = Static41.anIntArray59[local24 - 1];
		Static276.anInt5528 = Static270.anIntArray417[local24 - 1];
		Static310.aBoolean406 = false;
		Static259.method4512();
		return true;
	}
}
