import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_118 = Static158.method3034("<col=40ff00>");

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_119 = Static158.method3034("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_120 = Static158.method3034("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
	public static int anInt506 = 0;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
	public static int anInt507 = -1;

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_121 = Static158.method3034(")1 ");

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
	public static int anInt516 = 0;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
	public static void method395() {
		Static197.method3576();
		Static82.method1925();
		Static143.method2895();
		Static166.method3109();
		Static129.method2730();
		Static7.method3564();
		Static80.method1896();
		Static138.method510();
		Static96.method2449();
		Static173.method3199();
		Static126.method2645();
		Static164.method3101();
		((Class68) Static45.anInterface1_2).method2892();
		Static29.aClass89_9.method3439();
		Static24.aClass13_Sub1_2.method533();
		Static160.aClass13_Sub1_7.method533();
		Static5.aClass13_Sub1_1.method533();
		Static73.aClass13_Sub1_10.method533();
		Static113.aClass13_Sub1_15.method533();
		Static142.aClass13_Sub1_20.method533();
		Static143.aClass13_Sub1_21.method533();
		Static99.aClass13_Sub1_13.method533();
		Static56.aClass13_Sub1_3.method533();
		Static147.aClass13_Sub1_23.method533();
		Static88.aClass13_Sub1_11.method533();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Z")
	public static boolean method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static127.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == -Static183.anInt4437) {
			return false;
		} else if (local7 == Static183.anInt4437) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static188.method3446(local22 + 1, Static100.anIntArrayArrayArray5[arg0][arg1][arg2], local26 + 1) && Static188.method3446(local22 + 128 - 1, Static100.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local26 + 1) && Static188.method3446(local22 + 128 - 1, Static100.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static188.method3446(local22 + 1, Static100.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static127.anIntArrayArrayArray6[arg0][arg1][arg2] = Static183.anInt4437;
				return true;
			} else {
				Static127.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static183.anInt4437;
				return false;
			}
		}
	}
}
