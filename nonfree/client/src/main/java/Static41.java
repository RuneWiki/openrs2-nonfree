import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!gj;")
	public static Class143 aClass143_11;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_5 = new Class6(9, 2);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method1180() {
		if (Static540.aFileOutputStream3 != null) {
			try {
				Static540.aFileOutputStream3.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static540.aFileOutputStream3 = null;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method1181() {
		if (Static463.aBoolean600 || Static614.aClass3_Sub6_Sub16_4 == null) {
			return "";
		} else if ((Static614.aClass3_Sub6_Sub16_4.aString97 == null || Static614.aClass3_Sub6_Sub16_4.aString97.length() == 0) && Static614.aClass3_Sub6_Sub16_4.aString96 != null && Static614.aClass3_Sub6_Sub16_4.aString96.length() > 0) {
			return Static614.aClass3_Sub6_Sub16_4.aString96;
		} else {
			return Static614.aClass3_Sub6_Sub16_4.aString97;
		}
	}
}
