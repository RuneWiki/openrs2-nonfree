import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public static int anInt544;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_4 = new Class244();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBI)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = Static214.aClass4_Sub19_Sub1_1.anInt3066 * arg1 >> 8;
		if (local15 == 0 || arg2 == -1) {
			return;
		}
		if (!Static393.aBoolean519 && Static18.anInt281 != -1 && Static5.method134()) {
			Static280.aClass4_Sub7_Sub3_3 = Static577.method8237();
			@Pc(36) Class4_Sub7_Sub3 local36 = Static265.method4455(Static280.aClass4_Sub7_Sub3_3);
			Static24.method317(local36);
		}
		Static410.method6484(local15, Static518.aClass176_127, arg2);
		Static542.method7871(-1, 255);
		Static393.aBoolean519 = true;
	}
}
