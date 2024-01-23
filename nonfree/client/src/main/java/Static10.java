import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "Lclient!kh;")
	public static Class1_Sub2_Sub12 aClass1_Sub2_Sub12_1;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "Lclient!sk;")
	public static Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString12 = "Loaded defaults";

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString13 = "Loaded wordpack";

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)I")
	public static int method211(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
