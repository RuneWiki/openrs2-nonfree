import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!in", name = "l", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_94 = new Class200(115, -2);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z")
	public static boolean method4141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static66.method1533(arg0, arg1) | Static487.method6855(arg0, arg1) | Static493.method6911(arg0, arg1)) & Static501.method6955(arg1, arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!qg;Lclient!nd;Z)V")
	public static void method4144(@OriginalArg(0) Class286 arg0, @OriginalArg(1) Class238 arg1) {
		Static154.aString30 = "";
		Static16.aClass238_10 = arg1;
		Static83.aClass286_2 = arg0;
		if (Class33_Sub26.aString102.startsWith("win")) {
			Static154.aString30 = Static154.aString30 + "windows/";
		} else if (Class33_Sub26.aString102.startsWith("linux")) {
			Static154.aString30 = Static154.aString30 + "linux/";
		} else if (Class33_Sub26.aString102.startsWith("mac")) {
			Static154.aString30 = Static154.aString30 + "macos/";
		}
		if (Static83.aClass286_2.aBoolean534) {
			Static154.aString30 = Static154.aString30 + "msjava/";
		} else if (Class33_Sub26.aString103.startsWith("amd64") || Class33_Sub26.aString103.startsWith("x86_64")) {
			Static154.aString30 = Static154.aString30 + "x86_64/";
		} else if (Class33_Sub26.aString103.startsWith("i386") || Class33_Sub26.aString103.startsWith("i486") || Class33_Sub26.aString103.startsWith("i586") || Class33_Sub26.aString103.startsWith("x86")) {
			Static154.aString30 = Static154.aString30 + "x86/";
		} else if (Class33_Sub26.aString103.startsWith("ppc")) {
			Static154.aString30 = Static154.aString30 + "ppc/";
		} else {
			Static154.aString30 = Static154.aString30 + "universal/";
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JJZZLjava/lang/String;IIIILjava/lang/String;ZIZ)V")
	public static void method4145(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		if (!Static113.aBoolean192 && Static633.anInt10265 < 500) {
			@Pc(19) int local19 = arg6 == -1 ? Static398.anInt6843 : arg6;
			@Pc(35) Class2_Sub7_Sub21 local35 = new Class2_Sub7_Sub21(arg9, arg4, local19, arg7, arg5, arg0, arg11, arg8, arg3, arg2, arg1, arg10);
			Static625.method8669(local35);
		}
	}
}
