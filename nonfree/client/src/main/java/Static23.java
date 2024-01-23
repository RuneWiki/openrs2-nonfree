import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array17 = new Class60[500];

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
	public static int[] anIntArray333 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_876 = Static200.method3116("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "Z")
	public static boolean aBoolean144 = true;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
	public static int[] anIntArray334 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public static int anInt2654 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method1985() {
		Static71.aClass27_44.method963();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!kh;I)Z")
	public static boolean method1991(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static135.anInt2930; local11++) {
			if (arg0.method1805(Static61.aClass60Array9[local11])) {
				return true;
			}
		}
		return arg0.method1805(Static84.aClass9_Sub4_Sub1_2.aClass60_414);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public static void method1993(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		if (Static105.anInt2391 != arg0) {
			Static63.anIntArray182 = new int[arg0];
			for (local16 = 0; local16 < arg0; local16++) {
				Static63.anIntArray182[local16] = (local16 << 12) / arg0;
			}
			Static105.anInt2391 = arg0;
			Static2.anInt51 = arg0 == 64 ? 2048 : 4096;
			Static32.anInt814 = arg0 - 1;
		}
		if (Static53.anInt1436 == arg1) {
			return;
		}
		if (arg1 == Static105.anInt2391) {
			Static128.anIntArray362 = Static63.anIntArray182;
		} else {
			Static128.anIntArray362 = new int[arg1];
			for (local16 = 0; local16 < arg1; local16++) {
				Static128.anIntArray362[local16] = (local16 << 12) / arg1;
			}
		}
		Static92.anInt2170 = arg1 - 1;
		Static53.anInt1436 = arg1;
	}
}
