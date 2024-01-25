import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static323 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!cm;")
	public static Class44 aClass44_4 = null;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public static int anInt5265 = 1;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_92 = new Class186(7, 11);

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBI)Z")
	public static boolean method4592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!tq;Z)V")
	public static void method4594(@OriginalArg(0) Class239 arg0) {
		if (Static250.anInt4252 != arg0.anInt6442) {
			return;
		}
		if (Static134.aClass3_Sub3_Sub6_Sub1_1.aString48 == null) {
			arg0.anInt6426 = 0;
			arg0.anInt6413 = 0;
			return;
		}
		arg0.anInt6458 = 150;
		arg0.anInt6449 = (int) (Math.sin((double) Static125.anInt2225 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6426 = Static251.anInt4268;
		arg0.anInt6446 = 5;
		arg0.anInt6413 = Static109.method1807(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48);
		arg0.anInt6493 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6735;
		arg0.anInt6469 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6738;
		arg0.anInt6498 = 0;
		arg0.anInt6460 = Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6729;
	}
}
