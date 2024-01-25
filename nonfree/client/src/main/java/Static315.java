import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static315 {

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "Lclient!vba;")
	public static Class5_Sub3_Sub20 aClass5_Sub3_Sub20_2;

	@OriginalMember(owner = "client!kia", name = "j", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!kia", name = "m", descriptor = "[B")
	public static final byte[] aByteArray21 = new byte[520];

	@OriginalMember(owner = "client!kia", name = "r", descriptor = "[I")
	public static final int[] anIntArray127 = new int[2];

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V")
	public static void method2581() {
		Static54.anInt802 = -1;
		Static595.anInt9783 = 0;
		Static680.anInt10897 = -1;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IB)Z")
	public static boolean method2586(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
