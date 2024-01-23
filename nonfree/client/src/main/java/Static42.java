import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public static int anInt904;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_314 = Static200.method3116("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_315 = Static200.method3116("::autoshadow on");

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_316 = null;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	public static int anInt909 = 0;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[104][104];

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public static int anInt910 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method691() {
		Static204.aClass39_25.method1158();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ah;III)V")
	public static void method692(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte5 == 0) {
			arg0.anInt235 = arg0.anInt197;
		} else if (arg0.aByte5 == 1) {
			arg0.anInt235 = (arg1 - arg0.anInt221) / 2 + arg0.anInt197;
		} else if (arg0.aByte5 == 2) {
			arg0.anInt235 = arg1 - arg0.anInt221 - arg0.anInt197;
		} else if (arg0.aByte5 == 3) {
			arg0.anInt235 = arg0.anInt197 * arg1 >> 14;
		} else if (arg0.aByte5 == 4) {
			arg0.anInt235 = (arg0.anInt197 * arg1 >> 14) + (arg1 - arg0.anInt221) / 2;
		} else {
			arg0.anInt235 = arg1 - arg0.anInt221 - (arg0.anInt197 * arg1 >> 14);
		}
		if (arg0.aByte6 == 0) {
			arg0.anInt262 = arg0.anInt252;
		} else if (arg0.aByte6 == 1) {
			arg0.anInt262 = arg0.anInt252 + (arg2 - arg0.anInt251) / 2;
		} else if (arg0.aByte6 == 2) {
			arg0.anInt262 = arg2 - arg0.anInt252 - arg0.anInt251;
		} else if (arg0.aByte6 == 3) {
			arg0.anInt262 = arg2 * arg0.anInt252 >> 14;
		} else if (arg0.aByte6 == 4) {
			arg0.anInt262 = (arg2 - arg0.anInt251) / 2 + (arg2 * arg0.anInt252 >> 14);
		} else {
			arg0.anInt262 = arg2 - arg0.anInt251 - (arg0.anInt252 * arg2 >> 14);
		}
		if (!Static94.aBoolean118 || Static166.method2717(arg0) == 0 && arg0.anInt233 != 0) {
			return;
		}
		if (arg0.anInt235 < 0) {
			arg0.anInt235 = 0;
		} else if (arg0.anInt221 + arg0.anInt235 > arg1) {
			arg0.anInt235 = arg1 - arg0.anInt221;
		}
		if (arg0.anInt262 < 0) {
			arg0.anInt262 = 0;
		} else if (arg2 < arg0.anInt262 + arg0.anInt251) {
			arg0.anInt262 = arg2 - arg0.anInt251;
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!ai;)V")
	public static void method693(@OriginalArg(1) Class7 arg0) {
		Static124.aClass7_22 = arg0;
	}
}
