import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_9 = new Class136("", 14);

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_204 = new Class62(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_33 = new Class238();

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "[I")
	public static final int[] anIntArray497 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBIIII)V")
	public static void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 - arg2 >= Static179.anInt3768 && Static121.anInt6758 >= arg2 + arg5 && Static317.anInt5793 <= arg0 - arg2 && arg0 + arg2 <= Static69.anInt1551) {
			Static14.method174(arg1, arg4, arg2, arg0, arg5, arg3);
		} else {
			Static39.method543(arg5, arg4, arg1, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([IIIII)V")
	public static void method5019(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg1 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (local15 > arg3) {
			@Pc(19) int local19 = arg3 + 1;
			arg0[local19] = arg2;
			@Pc(24) int local24 = local19 + 1;
			arg0[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg0[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg0[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg0[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg0[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg0[local49] = arg2;
			arg3 = local49 + 1;
			arg0[arg3] = arg2;
		}
		while (local12 > arg3) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
	public static void method5020(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static45.aClass188ArrayArrayArray5 = Static89.aClass188ArrayArrayArray3;
			Static128.aClass149Array1 = Static248.aClass149Array3;
		} else {
			Static45.aClass188ArrayArrayArray5 = Static302.aClass188ArrayArrayArray4;
			Static128.aClass149Array1 = Static210.aClass149Array5;
		}
		Static73.anInt1624 = Static45.aClass188ArrayArrayArray5.length;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!td;)Z")
	public static boolean method5021(@OriginalArg(1) Interface8 arg0) {
		@Pc(10) Class47 local10 = Static230.aClass96_4.method2303(arg0.method6034());
		if (local10.anInt1244 == -1) {
			return true;
		} else {
			@Pc(28) Class173 local28 = Static197.aClass30_2.method539(local10.anInt1244);
			return local28.anInt4835 == -1 ? true : local28.method4354();
		}
	}
}
