import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!wi;")
	public static Class10_Sub45 aClass10_Sub45_2;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[8];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Z")
	public static boolean method5369(@OriginalArg(1) boolean arg0) {
		@Pc(10) boolean local10 = Static412.aClass50_8.method5882();
		if (local10 == arg0) {
			return true;
		}
		if (!arg0) {
			Static412.aClass50_8.method5828();
		} else if (!Static412.aClass50_8.method5810()) {
			arg0 = false;
		}
		if (arg0 == local10) {
			return false;
		} else {
			Static361.aClass85_Sub1_1.aBoolean166 = arg0;
			Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
			return true;
		}
	}
}
