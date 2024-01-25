import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "J")
	public static long aLong178;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage13;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
	public static boolean aBoolean531 = false;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_49 = new Class181(5, 7);

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "[F")
	public static final float[] aFloatArray44 = new float[4];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!wu;I)V")
	public static void method5618(@OriginalArg(0) Class384 arg0) {
		Static499.anInt8495 = arg0.method8890("p11_full");
		Static360.anInt6361 = arg0.method8890("p12_full");
		Static580.anInt10246 = arg0.method8890("b12_full");
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Z")
	public static boolean method5620() {
		if (Static532.aClass5_Sub4_Sub14_2 == null) {
			return false;
		} else {
			if (Static532.aClass5_Sub4_Sub14_2.anInt5598 >= 2000) {
				Static532.aClass5_Sub4_Sub14_2.anInt5598 -= 2000;
			}
			return Static532.aClass5_Sub4_Sub14_2.anInt5598 == 1003;
		}
	}
}
