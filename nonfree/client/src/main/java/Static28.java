import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Lclient!ns;")
	public static Class166 aClass166_28;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt681;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_16 = new Class36(54, -1);

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_17 = new Class36(15, 8);

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public static int anInt682 = 1;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "[Lclient!tq;")
	public static final Class233[] aClass233Array4 = new Class233[14];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public static void method535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static416.method5456(arg1, 12);
		local13.method2762();
		local13.anInt3611 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method540() {
		if (Static348.anInt6296 < 0) {
			Static367.anInt6516 = -1;
			Static97.anInt2094 = -1;
			Static348.anInt6296 = 0;
		}
		if (Static348.anInt6296 > Static137.anInt5588) {
			Static97.anInt2094 = -1;
			Static367.anInt6516 = -1;
			Static348.anInt6296 = Static137.anInt5588;
		}
		if (Static4.anInt162 < 0) {
			Static4.anInt162 = 0;
			Static97.anInt2094 = -1;
			Static367.anInt6516 = -1;
		}
		if (Static4.anInt162 > Static137.anInt5580) {
			Static367.anInt6516 = -1;
			Static4.anInt162 = Static137.anInt5580;
			Static97.anInt2094 = -1;
		}
	}
}
