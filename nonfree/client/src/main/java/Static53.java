import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!bja", name = "u", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_25 = new Class225(140, 1);

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!bja", name = "v", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_1 = new Class152(7, 2);

	@OriginalMember(owner = "client!bja", name = "e", descriptor = "I")
	public static int anInt872 = -1;

	@OriginalMember(owner = "client!bja", name = "t", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_18 = new Class349(4, 6);

	@OriginalMember(owner = "client!bja", name = "d", descriptor = "(I)V")
	public static void method745() {
		if (Static609.aClass163_6 == null) {
			return;
		}
		if (Static609.aClass163_6.anInt3843 == 1) {
			Static609.aClass163_6 = null;
			return;
		}
		if (Static609.aClass163_6.anInt3843 == 2) {
			Static584.method8123(Static686.aString116, 2, Static136.aClass389_3);
			Static609.aClass163_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)I")
	public static int method748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static314.aByteArrayArray9 == null ? 0 : Static314.aByteArrayArray9[arg0][arg1] & 0xFF;
	}
}
