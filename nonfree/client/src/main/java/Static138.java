import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt3428;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[Lclient!rs;")
	public static final Class6_Sub5_Sub15[] aClass6_Sub5_Sub15Array8 = new Class6_Sub5_Sub15[14];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
	public static int method2966() {
		return anInt3428;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!faa;B)V")
	public static void method2967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		Static175.anInt3179 = arg1;
		Static495.aClass97_25 = arg2;
		Static51.anInt909 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
	public static void method2968(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static490.aClass6_Sub5_Sub2_2 != null) {
			Static171.anInt9039 = Static490.aClass6_Sub5_Sub2_2.anInt2010;
		} else {
			Static171.anInt9039 = -1;
		}
		Static496.aClass97_24 = null;
		Static490.aClass6_Sub5_Sub2_2 = null;
		Static91.anInt1503 = 0;
		Static288.aClass298_170 = null;
		Static490.method1755();
		Static490.aClass298_38.method6808();
		Static319.aClass329_3 = null;
		Static404.aClass329_8 = null;
		Static26.anInt444 = -1;
		Static490.aClass170_2 = null;
		Static362.aClass329_7 = null;
		Static469.aClass71_50 = null;
		Static175.anInt3184 = -1;
		Static180.aClass329_1 = null;
		Static311.aClass329_6 = null;
		Static208.aClass329_5 = null;
		Static504.aClass329_9 = null;
		Static202.aClass329_4 = null;
		if (Static490.aClass320_2 != null) {
			Static490.aClass320_2.method7208();
			Static490.aClass320_2.method7204(128, 64);
		}
		if (Static490.aClass274_2 != null) {
			Static490.aClass274_2.method6289(64, 64);
		}
		if (Static490.aClass27_3 != null) {
			Static490.aClass27_3.method523(64);
		}
		Static344.aClass173_1.method4047(64);
	}
}
