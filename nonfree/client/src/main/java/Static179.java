import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
	public static int anInt3460;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "Lclient!kn;")
	public static Class97 aClass97_3;

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Lclient!vh;")
	public static Class187 aClass187_92 = new Class187(64);

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "[I")
	public static int[] anIntArray290 = new int[50];

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "[I")
	public static int[] anIntArray291 = new int[256];

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "[I")
	public static int[] anIntArray292 = new int[2];

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public static void method2976() {
		Static229.aClass142_19 = new Class142(32);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public static void method2977(@OriginalArg(1) int arg0) {
		Static239.aFloatArray14[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static239.aFloatArray14[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static239.aFloatArray14[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static282.method4349(3);
		Static282.method4349(4);
	}
}
