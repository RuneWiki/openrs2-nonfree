import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!fk", name = "W", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
	public static int anInt2168;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
	public static int anInt2153 = 0;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_52 = new Class211(105, 5);

	@OriginalMember(owner = "client!fk", name = "V", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_53 = new Class211(20, 0);

	@OriginalMember(owner = "client!fk", name = "X", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_54 = new Class211(6, -2);

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "J")
	public static long aLong71 = 0L;

	@OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
	public static final int anInt2169 = 328;

	@OriginalMember(owner = "client!fk", name = "bb", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ)V")
	public static void method1754(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static282.aFloat34 = 3.0F;
		} else if (arg0 == 50) {
			Static282.aFloat34 = 4.0F;
		} else if (arg0 == 75) {
			Static282.aFloat34 = 6.0F;
		} else if (arg0 == 100) {
			Static282.aFloat34 = 8.0F;
		} else if (arg0 == 200) {
			Static282.aFloat34 = 16.0F;
		}
		Static49.anInt857 = -1;
		Static49.anInt857 = -1;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	public static void method1757() {
		Static218.aClass181_1.method3866();
		Static376.aClass203_1.method4924();
		if (Static400.aClass56_1 != null) {
			Static400.aClass56_1.method3754(Static286.aCanvas4);
		}
		Static320.aClient1.method782();
		Static286.aCanvas4.setBackground(Color.black);
		Static105.anInt1975 = -1;
		Static218.aClass181_1 = Static241.method3079(Static286.aCanvas4);
		Static376.aClass203_1 = Static235.method3043(Static286.aCanvas4);
		if (Static400.aClass56_1 != null) {
			Static400.aClass56_1.method3755(Static286.aCanvas4);
		}
	}
}
