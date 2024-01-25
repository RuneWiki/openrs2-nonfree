import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eha", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eha", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[8];

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V")
	public static void method2537() {
		Static423.anInt7240 = -1;
		Static41.anInt544 = 1;
		Static305.aClass260_2 = Static525.aClass260_3;
		Static430.method3630(true, Static87.aString114, "", Static87.aString114.equals(""));
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(BB)Z")
	public static boolean method2539(@OriginalArg(1) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			return false;
		} else {
			return local15 < 128 || local15 >= 160 || Static211.aCharArray7[local15 - 128] != '\u0000';
		}
	}
}
