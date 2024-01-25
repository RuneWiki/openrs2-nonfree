import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bo", name = "Z", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!bo", name = "V", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!bo", name = "X", descriptor = "[I")
	public static final int[] anIntArray63 = new int[32];

	@OriginalMember(owner = "client!bo", name = "bb", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!eq;ILclient!ts;)V")
	public static void method835(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class239 arg1) {
		@Pc(39) boolean local39 = Static380.aClass231_2.method5638(arg1.anInt6902, arg1.anInt6933, arg1.aBoolean450 ? Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1 : null, arg0, arg1.anInt6903, arg1.anInt6882 | 0xFF000000, arg1.anInt6928) == null;
		if (local39) {
			Static213.aClass244_27.method5966(new Class6_Sub20(arg1.anInt6903, arg1.anInt6933, arg1.anInt6928, arg1.anInt6882 | 0xFF000000, arg1.anInt6902, arg1.aBoolean450));
		}
	}
}
