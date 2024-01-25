import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static578 {

	@OriginalMember(owner = "client!uia", name = "k", descriptor = "[Lclient!uq;")
	public static Class9_Sub2[] aClass9_Sub2Array7;

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "Lclient!uu;")
	public static Class343 aClass343_255;

	@OriginalMember(owner = "client!uia", name = "p", descriptor = "Z")
	public static boolean aBoolean709 = false;

	@OriginalMember(owner = "client!uia", name = "r", descriptor = "[I")
	public static final int[] anIntArray593 = new int[1000];

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)V")
	public static void method8088(@OriginalArg(0) int arg0) {
		if (Static100.anIntArray181 == null || Static100.anIntArray181.length < arg0) {
			Static100.anIntArray181 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V")
	public static void method8094() {
		if (Static259.anInt5056 > 1) {
			Static32.aClass3_Sub41_3.method6773(4, Static32.aClass3_Sub41_3.aClass7_Sub17_1);
		} else {
			Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub17_1);
		}
	}
}
