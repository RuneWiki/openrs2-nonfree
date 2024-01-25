import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static506 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
	public static int[] anIntArray562;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!kha;")
	public static Class181 aClass181_103;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	public static boolean aBoolean755 = false;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
	public static boolean aBoolean756 = true;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)I")
	public static int method7376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method7377() {
		if (Static433.aBoolean672 || Static300.aClass3_Sub1_Sub4_3 == null) {
			return "";
		} else if ((Static300.aClass3_Sub1_Sub4_3.aString27 == null || Static300.aClass3_Sub1_Sub4_3.aString27.length() == 0) && Static300.aClass3_Sub1_Sub4_3.aString26 != null && Static300.aClass3_Sub1_Sub4_3.aString26.length() > 0) {
			return Static300.aClass3_Sub1_Sub4_3.aString26;
		} else {
			return Static300.aClass3_Sub1_Sub4_3.aString27;
		}
	}
}
