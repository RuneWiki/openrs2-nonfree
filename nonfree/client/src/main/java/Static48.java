import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "Lclient!gb;")
	public static final Class119 aClass119_5 = new Class119();

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!rj;Lclient!pl;I)V")
	public static void method815(@OriginalArg(0) Class287 arg0, @OriginalArg(1) Class259 arg1) {
		Static421.aString73 = "";
		Class6_Sub1_Sub5_Sub2.lb = arg0;
		Static75.aClass259_34 = arg1;
		if (Class2_Sub2_Sub12.aString23.startsWith("win")) {
			Static421.aString73 = Static421.aString73 + "windows/";
		} else if (Class2_Sub2_Sub12.aString23.startsWith("linux")) {
			Static421.aString73 = Static421.aString73 + "linux/";
		} else if (Class2_Sub2_Sub12.aString23.startsWith("mac")) {
			Static421.aString73 = Static421.aString73 + "macos/";
		}
		if (Class6_Sub1_Sub5_Sub2.lb.aBoolean628) {
			Static421.aString73 = Static421.aString73 + "msjava/";
		} else if (Class2_Sub2_Sub12.aString25.startsWith("amd64") || Class2_Sub2_Sub12.aString25.startsWith("x86_64")) {
			Static421.aString73 = Static421.aString73 + "x86_64/";
		} else if (Class2_Sub2_Sub12.aString25.startsWith("i386") || Class2_Sub2_Sub12.aString25.startsWith("i486") || Class2_Sub2_Sub12.aString25.startsWith("i586") || Class2_Sub2_Sub12.aString25.startsWith("x86")) {
			Static421.aString73 = Static421.aString73 + "x86/";
		} else if (Class2_Sub2_Sub12.aString25.startsWith("ppc")) {
			Static421.aString73 = Static421.aString73 + "ppc/";
		} else {
			Static421.aString73 = Static421.aString73 + "universal/";
		}
	}
}
