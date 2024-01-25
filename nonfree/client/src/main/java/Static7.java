import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	public static int anInt227;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "Lclient!ew;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	public static int anInt237;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_3 = new Class208(58, 4);

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "[I")
	public static final int[] anIntArray8 = new int[200];

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString1 = null;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static499.anInt8721 == 1) {
			Static553.method7513(arg1, arg0, Static337.aClass1_Sub40_2);
		} else if (Static499.anInt8721 == 2) {
			Static55.method953(arg0, arg1);
		}
		Static499.anInt8721 = 0;
		Static337.aClass1_Sub40_2 = null;
	}
}
