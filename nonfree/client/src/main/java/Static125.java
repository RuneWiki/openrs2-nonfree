import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	public static int anInt2489 = 0;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
	public static int[] anIntArray197 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "[I")
	public static int[] anIntArray198 = new int[25];

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "[I")
	public static int[] anIntArray199 = new int[128];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public static void method1984() {
		Static246.anInterface5Array1 = null;
		Static129.method2082();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z")
	public static boolean method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static249.anIntArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == -Static258.anInt5165) {
			return false;
		} else if (local7 == Static258.anInt5165) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static124.method1979(local22 + 1, Static195.anIntArrayArrayArray7[arg0][arg1][arg2], local26 + 1) && Static124.method1979(local22 + 128 - 1, Static195.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local26 + 1) && Static124.method1979(local22 + 128 - 1, Static195.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static124.method1979(local22 + 1, Static195.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static249.anIntArrayArrayArray14[arg0][arg1][arg2] = Static258.anInt5165;
				return true;
			} else {
				Static249.anIntArrayArrayArray14[arg0][arg1][arg2] = -Static258.anInt5165;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)I")
	public static int method1987(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return arg0 & ~local37;
	}
}
