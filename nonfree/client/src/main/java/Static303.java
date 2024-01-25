import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5189(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5190(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static592.method8361();
		Static349.method5632();
		Static335.method5480();
		Static510.method2775(arg1, arg0);
		Static299.method5142();
		Static374.method5998(Static440.aClass44_12);
		Static74.method1216(Static440.aClass44_12);
		Static164.method2974(Static440.aClass44_12, Static281.aClass176_74);
		Static256.method4099();
		Static95.method2111(Static188.aClass78Array10);
		Static523.method7617();
		Static379.method6045();
		if (Static203.anInt3855 == 3) {
			Static285.method5604(4);
		} else if (Static203.anInt3855 == 7) {
			Static285.method5604(8);
		} else if (Static203.anInt3855 == 10) {
			Static285.method5604(11);
		} else if (Static203.anInt3855 == 1 || Static203.anInt3855 == 2) {
			Static533.method7757();
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(BZ)Z")
	public static boolean method5191(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static440.aClass44_12.method5019();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static440.aClass44_12.method5009();
		} else if (!Static440.aClass44_12.method4989()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static214.aClass4_Sub19_Sub1_1.aBoolean257 = arg0;
			Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
			return true;
		}
	}
}
