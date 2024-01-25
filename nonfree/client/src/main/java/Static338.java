import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static338 {

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "[Lclient!vb;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!dp;")
	public static Class53 aClass53_154;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
	public static int anInt6174;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString298 = "K";

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_106 = new Class70(64);

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
	public static void method5591() {
		Static143.anIntArray349 = Static262.method4420(0.4F);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Lclient!dj;")
	public static Class49 method5592(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static307.aFloat17 == 3.0D) {
				return Static11.aClass49_1;
			}
			if ((double) Static307.aFloat17 == 4.0D) {
				return Static19.aClass49_2;
			}
			if ((double) Static307.aFloat17 == 6.0D) {
				return Static151.aClass49_4;
			}
			if ((double) Static307.aFloat17 >= 8.0D) {
				return Static165.aClass49_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static307.aFloat17 == 3.0D) {
				return Static151.aClass49_4;
			}
			if ((double) Static307.aFloat17 == 4.0D) {
				return Static165.aClass49_8;
			}
			if ((double) Static307.aFloat17 == 6.0D) {
				return Static350.aClass49_9;
			}
			if ((double) Static307.aFloat17 >= 8.0D) {
				return Static98.aClass49_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static307.aFloat17 == 3.0D) {
				return Static350.aClass49_9;
			}
			if ((double) Static307.aFloat17 == 4.0D) {
				return Static98.aClass49_3;
			}
			if ((double) Static307.aFloat17 == 6.0D) {
				return Static190.aClass49_6;
			}
			if ((double) Static307.aFloat17 >= 8.0D) {
				return Static200.aClass49_7;
			}
		}
		return null;
	}
}
