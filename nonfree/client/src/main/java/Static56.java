import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	public static int anInt1146;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "Lclient!je;")
	public static Class117 aClass117_1;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
	public static int anInt1154 = -1;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
	public static int anInt1157 = 0;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
	public static int anInt1158 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
	public static void method901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static372.anInt1561 <= arg1 && Static98.anInt1774 >= arg3 && arg2 >= Static194.anInt3448 && arg4 <= Static264.anInt4589) {
			Static182.method2613(arg3, arg1, arg2, arg0, arg4);
		} else {
			Static161.method2398(arg0, arg4, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBIIII)V")
	public static void method902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg2 + 1;
		Static382.method5419(Static369.anIntArrayArray35[arg2], arg4, arg1, arg0);
		@Pc(18) int local18 = arg3 - 1;
		Static382.method5419(Static369.anIntArrayArray35[arg3], arg4, arg1, arg0);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static369.anIntArrayArray35[local25];
			local31[arg4] = local31[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method903(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	public static void method906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static177.method1119(Static185.aClass48_111);
		Static209.aClass1_Sub33_Sub2_2.method5139(arg1);
		Static209.aClass1_Sub33_Sub2_2.method5156(arg0);
	}
}
