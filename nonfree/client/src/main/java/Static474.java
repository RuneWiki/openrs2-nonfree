import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "Lclient!hia;")
	public static Class144 aClass144_6;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	public static void method7543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static435.aClass101_11 == null) {
			return;
		}
		@Pc(14) int local14 = Static19.anInt353;
		@Pc(16) int local16 = Static395.anInt7388;
		Static513.method7984(arg0, arg1);
		if (Static255.anInt4904 == 0) {
			Static64.anInterface17_1 = null;
			Static64.anInterface17_1 = Static435.aClass101_11.method8131(Static435.aClass101_11.method8084(Static488.anInt8751, Static307.anInt5554), Static435.aClass101_11.method8140(Static488.anInt8751, Static307.anInt5554));
		} else if (Static255.anInt4904 == 1 && (Static17.anInterface17Array7 == null || local14 != Static19.anInt353 || local16 != Static395.anInt7388)) {
			Static17.anInterface17Array7 = new Interface17[Static19.anInt353 * Static395.anInt7388];
			for (@Pc(44) int local44 = 0; local44 < Static17.anInterface17Array7.length; local44++) {
				Static17.anInterface17Array7[local44] = Static435.aClass101_11.method8131(Static435.aClass101_11.method8084(Static532.anInt9333, Static341.anInt6402), Static435.aClass101_11.method8140(Static532.anInt9333, Static341.anInt6402));
			}
			Static468.anInt8414 = 1;
			Static282.anIntArray265 = new int[Static19.anInt353 * Static395.anInt7388];
		}
		Static207.aBoolean327 = true;
	}
}
