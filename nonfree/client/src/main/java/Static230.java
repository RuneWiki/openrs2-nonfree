import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!dn;")
	public static Class66 aClass66_4;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "I")
	public static int anInt4667;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "Z")
	public static boolean aBoolean353 = false;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public static void method3927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static423.anInt8217 = arg1 - Static87.anInt6924;
		Static593.anInt10380 = arg0 - Static87.anInt6928;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IC)C")
	public static char method3932(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method3933(@OriginalArg(0) Class3_Sub9 arg0) {
		Static64.aClass183_5.method4792(arg0);
		arg0.anInt1629 = arg0.aClass3_Sub7_Sub1_1.anInt7869;
		arg0.aClass3_Sub7_Sub1_1.anInt7869 = 0;
		Static210.anInt4339 += arg0.anInt1629;
	}

	@OriginalMember(owner = "client!is", name = "i", descriptor = "(B)V")
	public static void method3938() {
		if (Static479.anInt8960 != -1) {
			Static361.method5977(Static479.anInt8960, false, -1, -1);
			Static479.anInt8960 = -1;
		}
	}
}
