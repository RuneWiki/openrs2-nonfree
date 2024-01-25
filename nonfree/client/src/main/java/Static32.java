import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array6;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	public static int anInt606;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	public static int anInt602 = 0;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	public static final int anInt605 = 52;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
	public static int anInt609 = -1;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
	public static void method540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static405.aClass3_Sub3_Sub1_1.anInt7559 != 0 && arg3 != 0 && Static5.anInt118 < 50 && arg1 != -1) {
			Static204.aClass347Array1[Static5.anInt118++] = new Class347((byte) 1, arg1, arg3, arg2, arg0, 0);
		}
	}
}
