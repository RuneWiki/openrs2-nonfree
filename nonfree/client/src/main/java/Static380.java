import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!og", name = "P", descriptor = "[[Lclient!wp;")
	public static Class361[][] aClass361ArrayArray2;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_126 = new Class56(36, 4);

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Lclient!al;")
	public static final Class17 aClass17_4 = new Class17();

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	public static int anInt6521 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!pi;Lclient!tf;I)V")
	public static void method5565(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class322 arg1) {
		Static249.aClass322_87 = arg1;
		Static173.aString19 = "";
		Static564.aClass258_6 = arg0;
		if (Class3_Sub6_Sub27.aString65.startsWith("win")) {
			Static173.aString19 = Static173.aString19 + "windows/";
		} else if (Class3_Sub6_Sub27.aString65.startsWith("linux")) {
			Static173.aString19 = Static173.aString19 + "linux/";
		} else if (Class3_Sub6_Sub27.aString65.startsWith("mac")) {
			Static173.aString19 = Static173.aString19 + "macos/";
		}
		if (Static564.aClass258_6.aBoolean523) {
			Static173.aString19 = Static173.aString19 + "msjava/";
		} else if (Class3_Sub6_Sub27.aString66.startsWith("amd64") || Class3_Sub6_Sub27.aString66.startsWith("x86_64")) {
			Static173.aString19 = Static173.aString19 + "x86_64/";
		} else if (Class3_Sub6_Sub27.aString66.startsWith("i386") || Class3_Sub6_Sub27.aString66.startsWith("i486") || Class3_Sub6_Sub27.aString66.startsWith("i586") || Class3_Sub6_Sub27.aString66.startsWith("x86")) {
			Static173.aString19 = Static173.aString19 + "x86/";
		} else if (Class3_Sub6_Sub27.aString66.startsWith("ppc")) {
			Static173.aString19 = Static173.aString19 + "ppc/";
		} else {
			Static173.aString19 = Static173.aString19 + "universal/";
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III)Z")
	public static boolean method5566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static317.method4652(arg1, arg0)) {
			return (arg1 & 0xB000) != 0 | Static595.method7948(arg0, arg1) | Static504.method6792(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static382.method5659(arg0, arg1) | Static376.method5510(arg0, arg1));
		} else {
			return false;
		}
	}
}
