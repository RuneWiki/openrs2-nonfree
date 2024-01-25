import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[I")
	public static final int[] anIntArray643 = new int[32];

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray75 = new String[8];

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt10653 = 4;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method8952(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static6.aClass100_1 = arg0;
		Static476.aClass274ArrayArray4 = new Class274[arg1][arg2];
		if (Static368.anIntArray416 != null) {
			Static636.aClass57_4 = Static266.method4716(Static368.anIntArray416[4], Static368.anIntArray416[3], Static368.anIntArray416[5], Static368.anIntArray416[1], Static368.anIntArray416[0], Static368.anIntArray416[2]);
		}
		Static337.aClass274_2 = new Class274();
		Static150.method2372();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)Z")
	public static boolean method8953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static516.method7740(arg1, arg0) | (arg0 & 0x60000) != 0 || Static437.method6779(arg0, arg1);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBIIIII)V")
	public static void method8954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class6_Sub6 local7 = null;
		for (@Pc(19) Class6_Sub6 local19 = (Class6_Sub6) Static26.aClass8_7.method149(); local19 != null; local19 = (Class6_Sub6) Static26.aClass8_7.method155()) {
			if (arg0 == local19.anInt1248 && arg6 == local19.anInt1247 && local19.anInt1250 == arg4 && local19.anInt1251 == arg1) {
				local7 = local19;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub6();
			local7.anInt1251 = arg1;
			local7.anInt1250 = arg4;
			local7.anInt1248 = arg0;
			local7.anInt1247 = arg6;
			if (arg6 >= 0 && arg4 >= 0 && Static442.anInt7975 > arg6 && Static284.anInt7916 > arg4) {
				Static136.method2202(local7);
			}
			Static26.aClass8_7.method157(local7);
		}
		local7.anInt1252 = arg2;
		local7.aBoolean79 = true;
		local7.anInt1255 = arg5;
		local7.aBoolean78 = false;
		local7.anInt1253 = arg3;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIZII)V")
	public static void method8956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static348.aClass6_Sub22_19.aClass15_Sub18_3.method5678() != 0 && arg5 != 0 && Static277.anInt5443 < 50 && arg3 != -1) {
			Static280.aClass224Array1[Static277.anInt5443++] = new Class224((byte) 2, arg3, arg5, arg0, arg4, arg1, arg2, (Class20_Sub2) null);
		}
	}
}
