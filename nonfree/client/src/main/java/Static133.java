import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString380 = "Connecting to update server";

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Z")
	public static boolean aBoolean487 = true;

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
	public static int anInt6593 = 0;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray46 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
	public static final int anInt6597 = -1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5805(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(20) String local20 = Static334.method5595(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static31.anInt829; local25++) {
			@Pc(33) String local33 = Static334.method5595(Static61.aStringArray8[local25]);
			if (local33 != null && local33.equals(local20)) {
				Static31.anInt829--;
				for (@Pc(45) int local45 = local25; local45 < Static31.anInt829; local45++) {
					Static61.aStringArray8[local45] = Static61.aStringArray8[local45 + 1];
					Static72.aStringArray9[local45] = Static72.aStringArray9[local45 + 1];
					Static19.anIntArray28[local45] = Static19.anIntArray28[local45 + 1];
					Static93.aStringArray11[local45] = Static93.aStringArray11[local45 + 1];
					Static51.anIntArray58[local45] = Static51.anIntArray58[local45 + 1];
					Static34.aBooleanArray2[local45] = Static34.aBooleanArray2[local45 + 1];
				}
				Static1.anInt8 = Static211.anInt4205;
				Static335.aClass5_Sub1_Sub1_3.method174(85);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(arg0));
				Static335.aClass5_Sub1_Sub1_3.method1849(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public static void method5809() {
		if (Static247.anInt3874 == 10) {
			Static293.method4971(28);
		}
		if (Static247.anInt3874 == 30) {
			Static293.method4971(25);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ljava/lang/Object;ZII[I)V")
	public static void method5810(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if ((local46 & 0x1) + local20 > arg3[local46]) {
				@Pc(61) int local61 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local61;
				@Pc(75) Object local75 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local75;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method5810(arg0, local16 - 1, arg2, arg3);
		method5810(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
	public static void method5817() {
		if (Static26.method628() || Static156.anInt3123 == Static9.anInt297) {
			Static194.method3499(Static15.aClass59_1);
			if (Static77.anInt1844 != Static156.anInt3123) {
				Static144.method2701();
			}
		} else {
			Static214.method3768(Static1.anInt3, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0], false, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0], false, Static156.anInt3123, Static63.anInt1492);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BIII)I")
	public static int method5819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg1) {
			return arg2;
		} else if (arg1 <= arg0) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)Z")
	public static boolean method5820() {
		@Pc(5) Class93 local5 = Static7.aClass93_1;
		synchronized (Static7.aClass93_1) {
			if (Static154.anInt3109 == anInt6593) {
				return false;
			} else {
				Static46.anInt1195 = Static275.anIntArray405[anInt6593];
				Static74.aChar2 = Static40.aCharArray4[anInt6593];
				anInt6593 = anInt6593 + 1 & 0x7F;
				return true;
			}
		}
	}
}
