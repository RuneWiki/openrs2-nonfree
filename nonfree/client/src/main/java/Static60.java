import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!ha;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!el;")
	public static final Class109 aClass109_29 = new Class109(120, -2);

	@OriginalMember(owner = "client!c", name = "Db", descriptor = "Lclient!uu;")
	public static final Class359 aClass359_1 = new Class359();

	@OriginalMember(owner = "client!c", name = "I", descriptor = "Lclient!dl;")
	public static final Class90 aClass90_2 = new Class90(64);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public static int method856(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method858() {
		if (Static526.aBoolean669 || Static133.aClass5_Sub5_Sub19_2 == null) {
			return "";
		} else if ((Static133.aClass5_Sub5_Sub19_2.aString120 == null || Static133.aClass5_Sub5_Sub19_2.aString120.length() == 0) && Static133.aClass5_Sub5_Sub19_2.aString121 != null && Static133.aClass5_Sub5_Sub19_2.aString121.length() > 0) {
			return Static133.aClass5_Sub5_Sub19_2.aString121;
		} else {
			return Static133.aClass5_Sub5_Sub19_2.aString120;
		}
	}
}
