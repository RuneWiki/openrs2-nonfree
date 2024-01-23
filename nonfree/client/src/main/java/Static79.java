import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!nb;")
	public static Class15 aClass15_19;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Lclient!q;")
	public static Class80 aClass80_8;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	public static boolean aBoolean107;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public static int anInt2046 = 0;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Lclient!i;")
	public static Class41 aClass41_610 = Static184.method2923("Standort");

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public static int anInt2049 = -1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method1450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		@Pc(13) int[] local13 = new int[4];
		local13[0] = arg0;
		local8[0] = arg1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg0 != Static25.anIntArray495[local23]) {
				local13[local10] = Static25.anIntArray495[local23];
				local8[local10] = Static78.anIntArray196[local23];
				local10++;
			}
		}
		Static78.anIntArray196 = local8;
		Static25.anIntArray495 = local13;
		Static150.method2346(0, Static178.aClass37Array1, Static178.aClass37Array1.length - 1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([BB)V")
	public static void method1452(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class2_Sub3 local6 = new Class2_Sub3(arg0);
		@Pc(10) int local10 = local6.method163();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(25) Class2_Sub27 local25 = new Class2_Sub27();
			@Pc(29) Class41 local29 = local6.method160();
			local25.anInt4750 = local6.method163();
			local25.anInt4752 = local6.method163();
			local25.anInt4755 = local6.method209();
			local25.aClass41_1275 = local29.method1415();
			local25.aClass41Array72 = local29.method1389(47);
			Static144.aClass108_11.method3334(local25);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
	public static void method1453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static45.anInt1337 <= arg1 && arg1 <= Static17.anInt457) {
			@Pc(16) int local16 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg3);
			@Pc(22) int local22 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg0);
			Static42.method172(arg1, local22, local16, arg2);
		}
	}
}
