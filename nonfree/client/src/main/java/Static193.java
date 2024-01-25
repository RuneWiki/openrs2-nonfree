import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static193 {

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
	public static int anInt4311;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "[Lclient!jw;")
	public static Class7_Sub3[] aClass7_Sub3Array1;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "Lclient!fca;")
	public static final Class98 aClass98_3 = new Class98("", 15);

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
	public static int anInt4312 = 0;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
	public static int method3682(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static277.method4630(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!an;BLclient!dj;)V")
	public static void method3683(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class71 arg1) {
		Static453.aClass16_105 = arg0;
		Static454.aClass71_5 = arg1;
		Static315.aString72 = "";
		if (Static92.aString17.startsWith("win")) {
			Static315.aString72 = Static315.aString72 + "windows/";
		} else if (Static92.aString17.startsWith("linux")) {
			Static315.aString72 = Static315.aString72 + "linux/";
		} else if (Static92.aString17.startsWith("mac")) {
			Static315.aString72 = Static315.aString72 + "macos/";
		}
		if (Static92.anInt2161 == 2) {
			Static315.aString72 = Static315.aString72 + "msjava/";
		} else if (Static92.aString18.startsWith("amd64") || Static92.aString18.startsWith("x86_64")) {
			Static315.aString72 = Static315.aString72 + "x86_64/";
		} else if (Static92.aString18.startsWith("i586") || Static92.aString18.startsWith("x86")) {
			Static315.aString72 = Static315.aString72 + "x86/";
		} else if (Static92.aString18.startsWith("ppc")) {
			Static315.aString72 = Static315.aString72 + "ppc/";
		} else {
			Static315.aString72 = Static315.aString72 + "universal/";
		}
	}
}
