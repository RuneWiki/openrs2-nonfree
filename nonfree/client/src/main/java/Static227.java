import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static227 {

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "Lclient!lca;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "[I")
	public static int[] anIntArray254 = new int[1];

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIBII)V")
	public static void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static111.anInt3012 = arg2;
		Static639.anInt11039 = arg1;
		Static210.anInt4754 = arg0;
		Static485.anInt8995 = arg3;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!in;Lclient!wea;B)V")
	public static void method4303(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class370 arg1) {
		Static562.aString103 = "";
		Static487.aClass370_7 = arg1;
		Static425.aClass157_219 = arg0;
		if (Class2_Sub34.aString72.startsWith("win")) {
			Static562.aString103 = Static562.aString103 + "windows/";
		} else if (Class2_Sub34.aString72.startsWith("linux")) {
			Static562.aString103 = Static562.aString103 + "linux/";
		} else if (Class2_Sub34.aString72.startsWith("mac")) {
			Static562.aString103 = Static562.aString103 + "macos/";
		}
		if (Static487.aClass370_7.aBoolean740) {
			Static562.aString103 = Static562.aString103 + "msjava/";
		} else if (Class2_Sub34.aString71.startsWith("amd64") || Class2_Sub34.aString71.startsWith("x86_64")) {
			Static562.aString103 = Static562.aString103 + "x86_64/";
		} else if (Class2_Sub34.aString71.startsWith("i386") || Class2_Sub34.aString71.startsWith("i486") || Class2_Sub34.aString71.startsWith("i586") || Class2_Sub34.aString71.startsWith("x86")) {
			Static562.aString103 = Static562.aString103 + "x86/";
		} else if (Class2_Sub34.aString71.startsWith("ppc")) {
			Static562.aString103 = Static562.aString103 + "ppc/";
		} else {
			Static562.aString103 = Static562.aString103 + "universal/";
		}
	}
}
