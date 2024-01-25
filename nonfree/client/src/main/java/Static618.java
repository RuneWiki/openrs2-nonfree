import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static618 {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!tba;")
	public static Class315 aClass315_17;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int anInt10216;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!naa;")
	public static Class222 aClass222_2;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public static int anInt10217;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
	public static boolean aBoolean861;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!kfa;")
	public static final Class178 aClass178_13 = new Class178();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZI)Z")
	public static boolean method8385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static232.method4483(arg0, arg1) & ((arg1 & 0x2000) != 0 | Static297.method5114(arg1, arg0) | Static620.method8467(arg0, arg1));
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!nga;ILclient!kha;)V")
	public static void method8387(@OriginalArg(0) Class228 arg0, @OriginalArg(2) Class181 arg1) {
		Static496.aString98 = "";
		Static164.aClass228_8 = arg0;
		Static628.aClass181_131 = arg1;
		if (Class2_Sub3_Sub2.aString69.startsWith("win")) {
			Static496.aString98 = Static496.aString98 + "windows/";
		} else if (Class2_Sub3_Sub2.aString69.startsWith("linux")) {
			Static496.aString98 = Static496.aString98 + "linux/";
		} else if (Class2_Sub3_Sub2.aString69.startsWith("mac")) {
			Static496.aString98 = Static496.aString98 + "macos/";
		}
		if (Static164.aClass228_8.aBoolean613) {
			Static496.aString98 = Static496.aString98 + "msjava/";
		} else if (Class2_Sub3_Sub2.aString70.startsWith("amd64") || Class2_Sub3_Sub2.aString70.startsWith("x86_64")) {
			Static496.aString98 = Static496.aString98 + "x86_64/";
		} else if (Class2_Sub3_Sub2.aString70.startsWith("i386") || Class2_Sub3_Sub2.aString70.startsWith("i486") || Class2_Sub3_Sub2.aString70.startsWith("i586") || Class2_Sub3_Sub2.aString70.startsWith("x86")) {
			Static496.aString98 = Static496.aString98 + "x86/";
		} else if (Class2_Sub3_Sub2.aString70.startsWith("ppc")) {
			Static496.aString98 = Static496.aString98 + "ppc/";
		} else {
			Static496.aString98 = Static496.aString98 + "universal/";
		}
	}
}
