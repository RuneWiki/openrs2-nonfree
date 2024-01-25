import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Lclient!fca;")
	public static Class3_Sub17 aClass3_Sub17_3;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
	public static int anInt2298;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!rha;")
	public static final Class309 aClass309_3 = new Class309("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
	public static int anInt2297 = 500;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static400.method5735(Static255.anInt4818, arg0, Static658.anInt10079);
		@Pc(17) int local17 = Static400.method5735(Static255.anInt4818, arg1, Static658.anInt10079);
		@Pc(23) int local23 = Static400.method5735(Static303.anInt9951, arg5, Static408.anInt6951);
		@Pc(29) int local29 = Static400.method5735(Static303.anInt9951, arg2, Static408.anInt6951);
		@Pc(37) int local37 = Static400.method5735(Static255.anInt4818, arg4 + arg0, Static658.anInt10079);
		@Pc(48) int local48 = Static400.method5735(Static255.anInt4818, arg1 - arg4, Static658.anInt10079);
		for (@Pc(50) int local50 = local11; local50 < local37; local50++) {
			Static526.method7369(Static299.anIntArrayArray58[local50], local29, local23, arg3);
		}
		for (@Pc(66) int local66 = local17; local66 > local48; local66--) {
			Static526.method7369(Static299.anIntArrayArray58[local66], local29, local23, arg3);
		}
		@Pc(93) int local93 = Static400.method5735(Static303.anInt9951, arg5 + arg4, Static408.anInt6951);
		@Pc(102) int local102 = Static400.method5735(Static303.anInt9951, arg2 - arg4, Static408.anInt6951);
		for (@Pc(104) int local104 = local37; local104 <= local48; local104++) {
			@Pc(114) int[] local114 = Static299.anIntArrayArray58[local104];
			Static526.method7369(local114, local93, local23, arg3);
			Static526.method7369(local114, local29, local102, arg3);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
	public static boolean method2122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
