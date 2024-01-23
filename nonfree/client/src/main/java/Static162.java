import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	public static int anInt3312;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!ul;")
	public static Class172 aClass172_30 = new Class172(64);

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[C")
	public static char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString116 = "Loading config - ";

	@OriginalMember(owner = "client!m", name = "o", descriptor = "[Lclient!pi;")
	public static Class4_Sub24[] aClass4_Sub24Array1 = new Class4_Sub24[2048];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Z")
	public static boolean method2605() {
		return Static251.aBoolean330 ? true : Static132.aBoolean168;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!lg;IIBLclient!wb;I)V")
	public static void method2606(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4_Sub2_Sub4 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(23) int local23 = Static234.anInt4655 + (int) Static126.aFloat73 & 0x7FF;
		@Pc(35) int local35 = Math.max(arg1.anInt3201 / 2, arg1.anInt3190 / 2) + 10;
		@Pc(43) int local43 = arg3 * arg3 + arg5 * arg5;
		if (local35 * local35 < local43) {
			return;
		}
		@Pc(57) int local57 = Class174.anIntArray444[local23];
		@Pc(65) int local65 = local57 * 256 / (Static161.anInt3301 + 256);
		@Pc(69) int local69 = Class174.anIntArray443[local23];
		@Pc(77) int local77 = local69 * 256 / (Static161.anInt3301 + 256);
		@Pc(88) int local88 = local65 * arg5 + arg3 * local77 >> 16;
		@Pc(99) int local99 = arg5 * local77 - arg3 * local65 >> 16;
		if (Static251.aBoolean330) {
			((Class4_Sub2_Sub4_Sub1) arg4).method2485(arg0 + arg1.anInt3201 / 2 + local88 - arg4.anInt5185 / 2, -(arg4.anInt5195 / 2) + -local99 + arg2 + arg1.anInt3190 / 2, (Class4_Sub2_Sub4_Sub1) arg1.method2517(false));
		} else {
			((Class4_Sub2_Sub4_Sub2) arg4).method4162(local88 + arg0 + arg1.anInt3201 / 2 - arg4.anInt5185 / 2, -(arg4.anInt5195 / 2) + -local99 + (arg2 - -(arg1.anInt3190 / 2)), arg1.anIntArray257, arg1.anIntArray259);
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public static void method2609() {
		Static45.anInt1039 = 0;
		@Pc(16) int local16 = Static269.anInt5357 + (Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7);
		@Pc(24) int local24 = (Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7) + Static105.anInt2105;
		if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static45.anInt1039 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static45.anInt1039 = 1;
		}
		if (Static45.anInt1039 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static45.anInt1039 = 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IZ)[I")
	public static int[] method2610(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[arg0.length];
			Static317.method3197(arg0, 0, local17, 0, arg0.length);
			return local17;
		}
	}
}
