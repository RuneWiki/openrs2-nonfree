import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	public static int anInt8221;

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString101;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
	public static int anInt8226 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZILclient!ha;I)Lclient!da;")
	public static Class56 method7138(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2) {
		@Pc(9) Class221 local9 = Static233.method3354(arg1, arg2, arg0);
		return local9 == null ? null : local9.aClass56_12;
	}

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "(I)I")
	public static int method7139() {
		return 16;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
	public static void method7141() {
		Static529.aClass292Array50 = new Class292[500];
		Static127.anInt2360 = Static63.anInt1356;
		Static1.anInt6849 = 0;
		Static530.anInt8208 = 0;
		Static513.anInt8007 = Static63.anInt1356;
		Static220.aClass292Array62 = new Class292[2000];
		Static649.aClass292Array157 = new Class292[1000];
		Static441.aClass292Array170 = new Class292[500];
		Static604.anInt9296 = 0;
		Static558.aBoolean670 = false;
		Static233.anIntArrayArrayArray10 = new int[Static539.anInt8345][Static51.anInt1108 + 1][Static245.anInt7888 + 1];
		Static658.anInt10393 = 0;
		if (Static246.aClass33_6 instanceof oa) {
			Static671.aBoolean798 = false;
		} else {
			Static671.aBoolean798 = true;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIII)V")
	public static void method7142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class113 local13 = Static258.aClass113ArrayArray1[arg0][arg1];
		Static392.method5065(arg2, local13 == null ? Static521.aClass113_1 : local13);
	}
}
