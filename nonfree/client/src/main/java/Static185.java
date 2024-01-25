import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!za;")
	public static Class34 aClass34_7;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[I")
	public static final int[] anIntArray207 = new int[1000];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!jk;)V")
	public static void method2668(@OriginalArg(1) Class124 arg0) {
		if (Static175.anInt2866 != arg0.anInt3413) {
			return;
		}
		if (Static447.aClass25_Sub5_Sub1_Sub2_4.aString51 == null) {
			arg0.anInt3363 = 0;
			arg0.anInt3422 = 0;
			return;
		}
		arg0.anInt3379 = 150;
		arg0.anInt3428 = (int) (Math.sin((double) Static236.anInt4213 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt3422 = Static296.anInt5181;
		arg0.anInt3401 = 5;
		arg0.anInt3363 = Static8.method94(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51);
		arg0.anInt3358 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4240;
		arg0.anInt3365 = 0;
		arg0.anInt3429 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4287;
		arg0.anInt3359 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4311;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(CI)Z")
	public static boolean method2669(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
