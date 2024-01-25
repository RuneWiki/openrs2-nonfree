import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!bo", name = "T", descriptor = "Lclient!mfa;")
	public static final Class3_Sub9_Sub2 aClass3_Sub9_Sub2_1 = new Class3_Sub9_Sub2(7500);

	@OriginalMember(owner = "client!bo", name = "ob", descriptor = "Lclient!tha;")
	public static final Class324 aClass324_1 = new Class324();

	@OriginalMember(owner = "client!bo", name = "pb", descriptor = "I")
	public static int anInt949 = -1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	public static void method899(@OriginalArg(0) int arg0) {
		Static108.anInt2182 = -1;
		if (arg0 == 37) {
			Static598.aFloat68 = 3.0F;
		} else if (arg0 == 50) {
			Static598.aFloat68 = 4.0F;
		} else if (arg0 == 75) {
			Static598.aFloat68 = 6.0F;
		} else if (arg0 == 100) {
			Static598.aFloat68 = 8.0F;
		} else if (arg0 == 200) {
			Static598.aFloat68 = 16.0F;
		}
		Static108.anInt2182 = -1;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)Z")
	public static boolean method900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
