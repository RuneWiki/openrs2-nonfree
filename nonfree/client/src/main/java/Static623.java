import org.openrs2.deob.annotation.OriginalMember;

public final class Static623 {

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
	public static int anInt10008;

	@OriginalMember(owner = "client!vca", name = "z", descriptor = "[I")
	public static final int[] anIntArray570 = new int[3];

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "(I)Ljava/lang/String;")
	public static String method8324() {
		if (Static423.aBoolean549 || Static529.aClass5_Sub2_Sub13_5 == null) {
			return "";
		} else if ((Static529.aClass5_Sub2_Sub13_5.aString66 == null || Static529.aClass5_Sub2_Sub13_5.aString66.length() == 0) && Static529.aClass5_Sub2_Sub13_5.aString67 != null && Static529.aClass5_Sub2_Sub13_5.aString67.length() > 0) {
			return Static529.aClass5_Sub2_Sub13_5.aString67;
		} else {
			return Static529.aClass5_Sub2_Sub13_5.aString66;
		}
	}
}
