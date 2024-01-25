import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!er", name = "l", descriptor = "Lclient!up;")
	public static Class240 aClass240_3;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!jr;")
	public static final Class127 aClass127_10 = new Class127(512);

	@OriginalMember(owner = "client!er", name = "h", descriptor = "[F")
	public static final float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_75 = new Class92(66, 18);

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public static void method1744() {
		Static325.anInt5927 = Static230.aClass179_11.anInt5440 + Static230.aClass179_11.anInt5455 + 2;
		Static43.anInt1083 = Static222.aClass179_10.anInt5440 + Static222.aClass179_10.anInt5455 + 2;
		Static230.aStringArray101 = new String[500];
		for (@Pc(29) int local29 = 0; local29 < Static230.aStringArray101.length; local29++) {
			Static230.aStringArray101[local29] = "";
		}
	}
}
