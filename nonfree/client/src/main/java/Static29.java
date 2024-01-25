import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
	public static int anInt438;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
	public static int anInt444;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIBI)V")
	public static void method335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static317.anInt5793 <= arg1 && arg1 <= Static69.anInt1551) {
			@Pc(15) int local15 = Static86.method1459(Static121.anInt6758, arg2, Static179.anInt3768);
			@Pc(21) int local21 = Static86.method1459(Static121.anInt6758, arg3, Static179.anInt3768);
			Static240.method4257(local21, local15, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)I")
	public static int method336(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILclient!rm;Lclient!rm;)V")
	public static void method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub3 arg3, @OriginalArg(4) Class1_Sub3 arg4) {
		@Pc(4) Class188 local4 = Static226.method4116(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub3_3 = arg3;
			local4.aClass1_Sub3_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!gn;B)V")
	public static void method338(@OriginalArg(0) Class1_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class1_Sub2_Sub1_Sub2) {
			@Pc(14) Class1_Sub2_Sub1_Sub2 local14 = (Class1_Sub2_Sub1_Sub2) arg0;
			if (local14.aClass197_1 != null) {
				Static235.method4212(local14, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 != local14.aByte73);
				return;
			}
		} else if (arg0 instanceof Class1_Sub2_Sub1_Sub1) {
			@Pc(35) Class1_Sub2_Sub1_Sub1 local35 = (Class1_Sub2_Sub1_Sub1) arg0;
			Static169.method5045(local35.aByte73 != Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73, local35);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public static void method339() {
		@Pc(15) int local15 = Static97.anInt2139;
		@Pc(17) int[] local17 = Static321.anIntArray512;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) Class1_Sub2_Sub1_Sub1 local27 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local17[local19]];
			if (local27 != null) {
				Static145.method4758(local27, local27.method4792());
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method340(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static144.aClass62_103.method1389(Static200.anInt4144) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static125.aClass62_92.method1389(Static200.anInt4144) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
