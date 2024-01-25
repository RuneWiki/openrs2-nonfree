import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!mv", name = "E", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_8 = new Class179(9, 0, 4, 1);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!pj;Lclient!tt;)V")
	public static void method5062(@OriginalArg(1) Class248 arg0, @OriginalArg(2) Class313 arg1) {
		Static307.aString47 = "";
		Static370.aClass248_64 = arg0;
		Static232.aClass313_49 = arg1;
		if (Class6_Sub15_Sub4.aString94.startsWith("win")) {
			Static307.aString47 = Static307.aString47 + "windows/";
		} else if (Class6_Sub15_Sub4.aString94.startsWith("linux")) {
			Static307.aString47 = Static307.aString47 + "linux/";
		} else if (Class6_Sub15_Sub4.aString94.startsWith("mac")) {
			Static307.aString47 = Static307.aString47 + "macos/";
		}
		if (Static232.aClass313_49.aBoolean570) {
			Static307.aString47 = Static307.aString47 + "msjava/";
		} else if (Class6_Sub15_Sub4.aString95.startsWith("amd64") || Class6_Sub15_Sub4.aString95.startsWith("x86_64")) {
			Static307.aString47 = Static307.aString47 + "x86_64/";
		} else if (Class6_Sub15_Sub4.aString95.startsWith("i386") || Class6_Sub15_Sub4.aString95.startsWith("i486") || Class6_Sub15_Sub4.aString95.startsWith("i586") || Class6_Sub15_Sub4.aString95.startsWith("x86")) {
			Static307.aString47 = Static307.aString47 + "x86/";
		} else if (Class6_Sub15_Sub4.aString95.startsWith("ppc")) {
			Static307.aString47 = Static307.aString47 + "ppc/";
		} else {
			Static307.aString47 = Static307.aString47 + "universal/";
		}
	}
}
