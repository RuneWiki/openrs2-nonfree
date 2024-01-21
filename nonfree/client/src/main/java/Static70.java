import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_41;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_724 = Static2.method59("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_725 = Static2.method59("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_726 = Static2.method59("backright1");

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!kc;")
	public static Class22 method1128(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class22_Sub1");
			@Pc(18) Class22 local18 = (Class22) local6.getDeclaredConstructor().newInstance();
			local18.method1067(arg1, arg2, arg0);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class22_Sub2 local31 = new Class22_Sub2();
			local31.method1067(arg1, arg2, arg0);
			return local31;
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method1130() {
		aClass80_725 = null;
		aClass2_Sub1_Sub9_Sub3_41 = null;
		aClass80_726 = null;
		aClass80_724 = null;
		anIntArray247 = null;
		anIntArray246 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static122.method1969(arg5)) {
			Static18.method407(arg0, 0, 0, arg4, -1, Static51.aClass2_Sub1_Sub17ArrayArray1[arg5], arg1, arg6, arg2, arg7, arg3);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[B)I")
	public static int method1133(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static17.method323(0, arg1, arg0);
	}
}
