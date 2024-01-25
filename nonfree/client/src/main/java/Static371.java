import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt6619;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	public static int anInt6617 = 0;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	public static int anInt6618 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IC)Z")
	public static boolean method5587(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)I")
	public static int method5588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIIIIIII)V")
	public static void method5589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static108.method1816(Static177.anInt3963, arg4, Static570.anInt9385);
		@Pc(17) int local17 = Static108.method1816(Static177.anInt3963, arg5, Static570.anInt9385);
		@Pc(31) int local31 = Static108.method1816(Static252.anInt4988, arg3, Static306.anInt5020);
		@Pc(37) int local37 = Static108.method1816(Static252.anInt4988, arg0, Static306.anInt5020);
		@Pc(45) int local45 = Static108.method1816(Static177.anInt3963, arg2 + arg4, Static570.anInt9385);
		@Pc(54) int local54 = Static108.method1816(Static177.anInt3963, arg5 - arg2, Static570.anInt9385);
		for (@Pc(56) int local56 = local11; local56 < local45; local56++) {
			Static259.method4236(local31, local37, arg1, Static618.anIntArrayArray101[local56]);
		}
		for (@Pc(72) int local72 = local17; local72 > local54; local72--) {
			Static259.method4236(local31, local37, arg1, Static618.anIntArrayArray101[local72]);
		}
		@Pc(98) int local98 = Static108.method1816(Static252.anInt4988, arg3 + arg2, Static306.anInt5020);
		@Pc(107) int local107 = Static108.method1816(Static252.anInt4988, arg0 - arg2, Static306.anInt5020);
		for (@Pc(109) int local109 = local45; local109 <= local54; local109++) {
			@Pc(115) int[] local115 = Static618.anIntArrayArray101[local109];
			Static259.method4236(local31, local98, arg1, local115);
			Static259.method4236(local98, local107, arg6, local115);
			Static259.method4236(local107, local37, arg1, local115);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!dm;)Ljava/lang/String;")
	public static String method5590(@OriginalArg(1) Class78 arg0) {
		if (Static69.method1332(arg0).method6409() == 0) {
			return null;
		} else if (arg0.aString21 == null || arg0.aString21.trim().length() == 0) {
			return Static612.aBoolean735 ? "Hidden-use" : null;
		} else {
			return arg0.aString21;
		}
	}
}
