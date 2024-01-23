import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "Z")
	public static boolean aBoolean59;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString38 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "[I")
	public static int[] anIntArray61 = new int[14];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!ag;Lclient!ag;)V")
	public static void method617(@OriginalArg(1) Class8_Sub1 arg0, @OriginalArg(2) Class8_Sub1 arg1) {
		if (arg0.aClass8_Sub1_69 != null) {
			arg0.method4277();
		}
		arg0.aClass8_Sub1_69 = arg1;
		arg0.aClass8_Sub1_68 = arg1.aClass8_Sub1_68;
		arg0.aClass8_Sub1_69.aClass8_Sub1_68 = arg0;
		arg0.aClass8_Sub1_68.aClass8_Sub1_69 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
	public static void method619(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static244.anInt4872 = arg0;
		Static228.anInt4643 = 0;
		Static52.anInt1146 = arg1;
		Static253.anInt4996 = 0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)V")
	public static void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static2.method4(Static244.anInt4872, arg2, Static228.anInt4643);
		@Pc(17) int local17 = Static2.method4(Static244.anInt4872, arg0, Static228.anInt4643);
		@Pc(30) int local30 = Static2.method4(Static52.anInt1146, arg4, Static253.anInt4996);
		@Pc(36) int local36 = Static2.method4(Static52.anInt1146, arg1, Static253.anInt4996);
		for (@Pc(38) int local38 = local11; local38 <= local17; local38++) {
			Static19.method343(local30, arg3, Static181.anIntArrayArray19[local38], local36);
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIII)V")
	public static void method621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static228.anInt4643 <= arg2 && arg2 <= Static244.anInt4872) {
			@Pc(20) int local20 = Static2.method4(Static52.anInt1146, arg3, Static253.anInt4996);
			@Pc(26) int local26 = Static2.method4(Static52.anInt1146, arg1, Static253.anInt4996);
			Static206.method3268(arg2, local20, local26, arg0);
		}
	}
}
