import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[S")
	public static short[] aShortArray62 = new short[256];

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public static int anInt3538 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method3099() {
		Static135.aClass3_Sub4_1 = new Class3_Sub4(Static135.aClass57_46.method1122(Static66.anInt1307), "", Static103.anInt2047, 1011, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBI)V")
	private static void method3100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class102 local14 = Static280.aClass102ArrayArray1[arg1][arg2];
		Static127.method2041(arg0, local14 == null ? Static150.aClass102_5 : local14);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3101(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg0.indexOf(arg1); local13 != -1; local13 = arg0.indexOf(arg1, local13 + arg2.length())) {
			arg0 = arg0.substring(0, local13) + arg2 + arg0.substring(arg1.length() + local13);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public static void method3103() {
		if (Static348.anInt4439 == 10 || Static348.anInt4439 == 28) {
			method3100(5000, Static206.anInt3639 >> 10, Static339.anInt5726 >> 10);
		} else {
			@Pc(22) int local22 = Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0] >> 3;
			@Pc(29) int local29 = Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0] >> 3;
			if (local22 >= 0 && local22 < Static12.anInt161 >> 3 && local29 >= 0 && Static44.anInt787 >> 3 > local29) {
				method3100(5000, local22, local29);
			} else {
				method3100(0, Static12.anInt161 >> 4, Static44.anInt787 >> 4);
			}
		}
		Static390.method5417();
		Static358.method5349();
		Static251.method4077();
		Static282.method4478();
	}
}
