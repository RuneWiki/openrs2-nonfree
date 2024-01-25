import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static671 {

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
	public static int anInt10623;

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "[I")
	public static int[] anIntArray599;

	@OriginalMember(owner = "client!vba", name = "hb", descriptor = "Lclient!wk;")
	public static Class3_Sub22_Sub5 aClass3_Sub22_Sub5_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!vba", name = "B", descriptor = "Ljava/lang/Class;")
	public static Class aClass25;

	@OriginalMember(owner = "client!vba", name = "mb", descriptor = "Z")
	public static boolean aBoolean769 = true;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
	public static int method8889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static242.aByteArrayArray6 == null ? 0 : Static242.aByteArrayArray6[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)V")
	public static void method8896() {
		if (Static12.aByteArray2 != null) {
			Static397.method5964();
		} else if (Static478.anInt8342 == -1) {
			Static264.method3687(Static321.aString95, Static715.aString107);
		} else {
			Static440.method6399();
		}
	}
}
