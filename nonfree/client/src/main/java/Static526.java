import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static526 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public static int anInt8219;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!bj;")
	public static final Class37 aClass37_3 = new Class37();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!br;Lclient!ik;)V")
	public static void method7027(@OriginalArg(1) Class47 arg0, @OriginalArg(2) Class182 arg1) {
		Static515.aString100 = "";
		Static368.aClass182_79 = arg1;
		Static205.aClass47_2 = arg0;
		if (Class21_Sub24.aString112.startsWith("win")) {
			Static515.aString100 = Static515.aString100 + "windows/";
		} else if (Class21_Sub24.aString112.startsWith("linux")) {
			Static515.aString100 = Static515.aString100 + "linux/";
		} else if (Class21_Sub24.aString112.startsWith("mac")) {
			Static515.aString100 = Static515.aString100 + "macos/";
		}
		if (Static205.aClass47_2.aBoolean106) {
			Static515.aString100 = Static515.aString100 + "msjava/";
		} else if (Class21_Sub24.aString111.startsWith("amd64") || Class21_Sub24.aString111.startsWith("x86_64")) {
			Static515.aString100 = Static515.aString100 + "x86_64/";
		} else if (Class21_Sub24.aString111.startsWith("i386") || Class21_Sub24.aString111.startsWith("i486") || Class21_Sub24.aString111.startsWith("i586") || Class21_Sub24.aString111.startsWith("x86")) {
			Static515.aString100 = Static515.aString100 + "x86/";
		} else if (Class21_Sub24.aString111.startsWith("ppc")) {
			Static515.aString100 = Static515.aString100 + "ppc/";
		} else {
			Static515.aString100 = Static515.aString100 + "universal/";
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public static void method7028() {
		if (Static14.method502(Static98.anInt2140)) {
			Static164.method2681(false);
		} else {
			Static35.aClass118_1 = Static95.aClass292_2.aClass118_2;
			Static95.aClass292_2.aClass118_2 = null;
			Static336.method4832(14);
		}
	}
}
