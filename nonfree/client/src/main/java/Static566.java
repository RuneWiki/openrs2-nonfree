import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray50;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "[[[Lclient!up;")
	public static Class333[][][] aClass333ArrayArrayArray2;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_145 = new Class287(24, 18);

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public static int anInt9803 = 0;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "Lclient!or;")
	public static final Class244 aClass244_69 = new Class244();

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_312 = new Class123(56, 0);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public static void method7705() {
		Static465.anInt8094 = 0;
		Static331.anInt6011 = 0;
		Static565.anInt9794 = 0;
		Static73.anInt7669 = 0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V")
	public static void method7706(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(4, arg0);
		local8.method7364();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)Z")
	public static boolean method7707(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static319.aClass31_11.method8085();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static319.aClass31_11.method8034();
		} else if (!Static319.aClass31_11.method8022()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static348.aClass3_Sub51_Sub1_5.aBoolean686 = arg0;
			Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
			return true;
		}
	}
}
